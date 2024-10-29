public class Main {
    public static void main(String[] args) {
        Griffendorf[] studentGriffendorf = {
                new Griffendorf("Гарри", "Поттер", 50, 25, 22, 20, 58),
                new Griffendorf(" Гермиона ", "  Грейнджер", 48, 28, 23, 35, 22),
                new Griffendorf("Рон", " Уизли", 40, 25, 37, 35, 20)

        };

        Kogtevran[] studentKogtevran = {
                new Kogtevran("Чжоу ", " Чанг ", 39, 26, 35, 34, 50, 67),
                new Kogtevran("Падма", " Патил", 40, 28, 43, 42, 53, 68),
                new Kogtevran("Маркус", "Белби", 43, 32, 45, 40, 55, 64)

        };
        Puffenduy[] studentPuffenduy = {
                new Puffenduy("Захария", " Смит", 50, 45, 38, 30, 45),
                new Puffenduy("Седрик", " Диггори", 52, 47, 40, 32, 44),
                new Puffenduy("Джастин ", "Финч-Флетчли", 55, 48, 43, 33, 47)

        };
        Slytherin[] studentSlytherin = {
                new Slytherin("Драко", " Малфой", 60, 46, 39, 33, 56,
                        45, 34),
                new Slytherin("Грэхэм", " Монтегю", 58, 44, 36, 38, 55,
                        46, 33),
                new Slytherin("Грегори ", " Гойл ", 65, 42, 37, 31, 58,
                        47, 38)
        };
        System.out.println(studentGriffendorf[0].toString());
        System.out.println(studentKogtevran[0].toString());
        System.out.println(studentPuffenduy[0].toString());
        System.out.println(studentKogtevran[0].toString());

        Hogwarts.comparingStudents(studentGriffendorf[0], studentSlytherin[0]);
        Puffenduy.comparingStudents(studentPuffenduy[0], studentPuffenduy[1]);


    }
}