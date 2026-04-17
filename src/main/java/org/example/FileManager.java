package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.fabric.*;
import org.example.model.Mission;
import org.example.reports.AdditionalInfoReportDecorator;
import org.example.reports.MissionReport;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Укажите ссылку");
            String input = scanner.nextLine();
            String cleanInput = input.replaceAll("\"", "");

            ParserCreator fabric;
            try {
                String point = "";
                int lastDotIndex = cleanInput.lastIndexOf('.');
                if (lastDotIndex != -1 && lastDotIndex < cleanInput.length() - 1) {
                    point = cleanInput.substring(lastDotIndex + 1).toLowerCase();
                }

                System.out.println(point);
                switch (point) {
                    case "txt":
                        fabric = new TxtParserCreator();
                        break;
                    case "xml":
                        fabric = new XmlParserCreator();
                        break;
                    case "json":
                        fabric = new JsonParserCreator();
                        break;
                    case "":
                        fabric = new BinaryParserCreator();
                        break;
                    case "yaml":
                        fabric = new YamlParserCreator();
                        break;
                    default:
                        throw new Exception("Неприемлемый формат файла");
                }

                Mission mission = fabric.parse(cleanInput);
                MissionReport report = new MissionReport();
                AdditionalInfoReportDecorator reportDecorator = new AdditionalInfoReportDecorator(report);
                System.out.println(reportDecorator.getReport(mission));
                save(mission);

            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
    public void save(Mission mission) {
        try {
            new ObjectMapper().writeValue(new File("output.json"), mission);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
