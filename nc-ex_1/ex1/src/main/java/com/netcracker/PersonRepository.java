package com.netcracker;

import com.netcracker.entities.Person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonRepository {
	/** Поле массив людей*/
    private Person[] people;
    /** Поле размера массива при создании списка людей*/
    private int quantity; // передаем в конструктор для обозначения изначального размера массива
    /** Поле количества людей в массиве*/

    private static final Logger log = LogManager.getLogger(PersonRepository.class.getName());
    
    private int counter = 0;

    public PersonRepository(){}

    /**
     * Конструктор
     * @param quantity - начальная емкость
     */
    public PersonRepository(int quantity){
        this.people = new Person[quantity];
        this.quantity = quantity;
    }

    /**
     * Выбирает i-ый элемент из списка
     * @param i номер эелемента в списке
     * @return i-ый элемент
     */
    public Person get(int i){
        return people[i];
    }

    /**
     * Метод добавления элемента в список
     * @param person
     */
    public void add(Person person){
        if(counter == quantity){
            Person[] newPeople  = new Person[quantity + 1];
            System.arraycopy(people, 0, newPeople, 0, people.length);
            people = newPeople;
            quantity++;
        }
        people[counter] = person;
        counter++;
    }

    /**
     * Метод удаления элемента из списка
     * @param index - индекс в массиве
     */
    public  void remove(int index){
        Person[] newPeople = new Person[quantity - 1];
        System.arraycopy(people, 0, newPeople, 0, people.length - index - 1);
        System.arraycopy(people, index + 1, newPeople, index, people.length - index - 1);
        people = newPeople;
        counter--;
        quantity--;
    }

    /**
     * Метод вывода элементов списка людей
     */
    public void printItems(){
        for(int i = 0; i < counter; i++){
            if (people[i] == null) break;
            System.out.println(people[i].toString() + ", Age: " + people[i].getAge());
        }
    }

}
