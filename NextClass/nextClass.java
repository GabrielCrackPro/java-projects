package NextClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class nextClass {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formatedDate = now.format(formatter);
        String actualDate = formatedDate.substring(0, 10);

        String actualDay = now.getDayOfWeek().toString().substring(0, 3).toLowerCase();

        String[] times = { "15:10 - 16:05", "16:05 - 17:00", "17:00 - 17:55", "18:15 - 19:10", "19:10 - 20:05",
                "20:05 - 21:00" };
        String[] timetable = {};
        switch (actualDay) {
            case "mon":
                actualDay = "Lunes";
                timetable = new String[] { "Programación", "Programación", "Entornos de desarrollo",
                        " Entornos de desarrollo", "Bases de datos", "Bases de datos" };
                break;
            case "tue":
                actualDay = "Martes";
                timetable = new String[] { "Ingles", "Ingles", "Programación", "Programación", "Marcas", "Sistemas" };
                break;
            case "wed":
                actualDay = "Miércoles";
                timetable = new String[] { "Bases de datos", "FOL", " FOL", "Marcas", "Sistemas", "Sistemas" };
                break;
            case "thu":
                actualDay = "Jueves";
                timetable = new String[] { "Bases de datos", "Bases de datos", "Programación", "Programación",
                        "Sistemas", "Sistemas" };
                break;
            case "fri":
                actualDay = "Viernes";
                timetable = new String[] { "Marcas", "FOL", "Entornos de desarrollo", "Ingles", "Programación",
                        "Programación" };
                break;
            default:
                System.out.println("Hoy no hay clases");
                break;
        }
        String dateString = "Hoy es " + actualDay + " " + actualDate + ", el horario de hoy es";
        System.out.println(dateString);
        System.out.println("-------------------------------");
        for (int i = 0; i < timetable.length; i++) {
            System.out.println(times[i] + " " + timetable[i]);
            System.out.println("--------------------------------");
        }
    }
}