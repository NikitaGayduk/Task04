package by.epam.javawebtraining.gayduknikita.task04.model.logic.sorter;

import by.epam.javawebtraining.gayduknikita.task04.model.entity.AbstractUnit;

import java.util.List;

public interface Sorter {

    void sort(List<AbstractUnit> data);

    void reverseSort(List<AbstractUnit> data);
}

