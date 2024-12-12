import java.util.Arrays;
public class Main {
    public static void main (String[] args) {

        Worker Worker1 = new Worker("Степан Федорович Овчиников", "Электрик",
                "fortuna@gmail.com","+375296346321", 2920, 29);
        Worker1.cardOfWorker();

        Worker [] workArray= new Worker[5];
        workArray[0] = new Worker("Владимир Алексеевич Куршок", "Директор",
                "kyrn@gmail.com", "+375298526321", 4500, 45);
        workArray[1] = new Worker("Андрей Михайлович Резнков", "Заместитель директора",
                "ereez@gmail.com", "+375294692235", 3500, 33);
        workArray[2] = new Worker("Петр Андреевич Шишковский", "Начальник производства",
                "morgen@gmail.com", "+375296332541", 3550, 41);
        workArray[3] = new Worker("Степан Федорович Овчиников", "Электрик",
                "fortuna@gmail.com", "+375296346321", 2920, 29);
        workArray[4] = new Worker("Мирослав Сергеевич Дишко", "Младщий инженер",
                "joker@gmail.com", "+375298521111", 1900, 27);

        AmusementPark NewPark = new AmusementPark("Парк Горького");
        NewPark.amusementParkCard();

    }

}