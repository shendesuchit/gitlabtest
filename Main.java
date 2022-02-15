package work;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        //Filter
        //  people.stream().filter(person->person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList()).stream().forEach(a-> System.out.println(a));

        //Sort
        // people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList()).forEach(a-> System.out.println(a));

        //all Match
        //boolean value = people.stream().allMatch(person -> person.getAge() > 7);
        //System.out.println(""+value);


        // any match
        // boolean anyMatch = people.stream().anyMatch(person -> person.getAge() == 99);
        // System.out.println(anyMatch);

//none match
        //boolean nonematch = people.stream().noneMatch(person -> person.getName().startsWith("S"));
        //System.out.println(nonematch);

// max, min
        //    Person person = people.stream().filter(person1 -> person1.getGender().equals(Gender.MALE)).max(Comparator.comparing(Person::getAge)).get();
        //   System.out.println(""+person);


        // Group

       /*  Map<Gender, List<Person>> collect = people.stream().collect(Collectors.groupingBy(Person::getGender));

        collect.forEach((k,v)->{
            System.out.println(k+" "+v);
        });*/

        // Find Oldest Female

        Person oldestFemale = people.stream().filter(person1 -> person1.getGender().equals(Gender.FEMALE))
                .filter(person1 -> person1.getName().startsWith("S"))
                .max(Comparator.comparing(Person::getAge)).get();

        System.out.println(oldestFemale);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Samiksha Shende", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

}
