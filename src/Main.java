import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] currencies = {"USD", "EUR", "JPY", "RUB"}; // Массив валют

        Scanner scanner = new Scanner(System.in);
        System.out.println("Покупка иен недоступна. Выберите другую валюту и введите её буквенный код:");

        String userCurrency = scanner.next(); // Даём пользователю возможность ввести валюту
        currencies[2] = userCurrency; // Присваиваем ввод пользователя элементу c индексом 2

        System.out.println("Спасибо! Эта валюта в наличии.");
        System.out.println("Мы заменили в вашем портфеле JPY на: " + currencies[2]);
////new lesson

        String[] currenciesar = {"USD", "EUR", "JPY", "RUB"};
        System.out.println("Валюты в вашем портфеле:");
        System.out.println(currenciesar[0] + " - индекс 0"); // Печатаем валюты и их индексы
        System.out.println(currenciesar[1] + " - индекс 1");
        System.out.println(currenciesar[2] + " - индекс 2");
        System.out.println(currenciesar[3] + " - индекс 3");

        System.out.println("Введите индекс валюты, которую хотите поменять:");
        int index = scanner.nextInt(); // Даём возможность ввести индекс выбранной валюты

        System.out.println("Выберите новую валюту:");
        String currency = scanner.next(); // Даём возможность ввести новое значение валюты

        String previousCurrency = currencies[index]; // Сохраняем старое значение
        currencies[index] = currency; // Присваиваем выбранному элементу новое значение

        System.out.println("Мы заменили " + previousCurrency + " на: " + currencies[index]);

        System.out.println("Теперь в вашем портфеле такие валюты:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);
    }
}