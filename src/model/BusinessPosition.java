package model;

public enum BusinessPosition {
    OWNER("Владелец"),
    CHIEF("Управленец"),
    DEPUTYCHIEF("Заместитель"),
    SECRETARY("Бухгалтерия"),
    MANAGER("Начальник"),
    RECRUITER("Подбор персонала"),
    EMPLOYEE("Сотрудник"),
    SECURITY("Охранник"),
    CLEANER("Уборщик");

    private String description;

    BusinessPosition(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

