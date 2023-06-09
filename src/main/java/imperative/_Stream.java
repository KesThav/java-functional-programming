package imperative;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
        public static void main(String[] args) {
            List<Person> people = List.of(
                    new Person("John", Gender.MALE),
                    new Person("Maria", Gender.FEMALE),
                    new Person("Aish", Gender.MALE),
                    new Person("Alice", Gender.FEMALE),
                    new Person("Bob", Gender.MALE),
                    new Person("Marine", Gender.FEMALE)

            );

//            people.stream()
//                    .map(person -> person.gender)
//                    .collect(Collectors.toSet())
//                    .forEach(System.out::println);

            boolean containsOnlyFemale = people.stream()
                    .noneMatch(person -> Gender.FEMALE.equals(person.gender));

            System.out.println(containsOnlyFemale);

        }
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString(){
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }

    enum Gender {
        MALE,FEMALE
    }


}
