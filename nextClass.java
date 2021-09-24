import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class nextClass {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formatedDate = now.format(formatter);

        String actualDay = now.getDayOfWeek().toString().substring(0, 3).toLowerCase();

        String[] tirmetable = {};
        switch (actualDay) {
            case "Lun":
                String[] timetable = { "Programación", "Programación", "Entornos de desarrollo",
                        "Entornos de desarrollo", "Bases de datos", "Bases de datos" };
                System.out.println("Hoy es " + actualDay);
                System.out.println("El horario de hoy es ");
                for (int i = 0; i < timetable.length; i++) {
                    System.out.println(timetable[i]);
                }
                break;
            case "Mar":
                String[] timetable = { "Ingles", "Ingles", "Programación", "Programación", "Marcas", "Sistemas" };
                System.out.println("Hoy es " + actualDay);
                System.out.println("El horario de hoy es ");
                for (int i = 0; i < timetable.length; i++) {
                    System.out.println(timetable[i]);
                }
                break;
            case "Mie":
                timetable = new String[] { "Bases de datos", "FOL", "FOL", "Marcas", "Sistemas", "Sistemas" };
                System.out.println("Hoy es " + actualDay);
                System.out.println("El horario de hoy es ");
                for (int i = 0; i < timetable.length; i++) {
                    System.out.println(timetable[i]);
                }
                break;
            case "Jue":
                timetable = new String[] { "Bases de datos", "Bases de datos", "Programación", "Programación",
                        "Sistemas", "Sistemas" };
                System.out.println("Hoy es " + actualDay);
                System.out.println("El horario de hoy es ");
                for (int i = 0; i < timetable.length; i++) {
                    System.out.println(timetable[i]);
                }
                break;
            case "Vie":
                timetable = new String[] { "Marcas", "FOL", "Entornos de desarrollo", "Ingles", "Programación",
                        "Programación" };
                System.out.println("Hoy es " + actualDay);
                System.out.println("El horario de hoy es ");
                for (int i = 0; i < timetable.length; i++) {
                    System.out.println(timetable[i]);
                }
                break;
            default:
                System.out.println("No hay clases");
                break;
        }
    }
}