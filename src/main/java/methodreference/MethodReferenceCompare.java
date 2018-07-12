package methodreference;

import lombok.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Adwiti on 7/10/2018.
 */
public class MethodReferenceCompare {


    public List<Human> basicSortWithoutLambdas() {
        List<Human> humans = Arrays.asList(new Human("Arun", 21), new Human("Adwiti", 3), new Human("Pushpa", 18));
        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        return humans;
    }

    public List<Human> basicSortWithLambdaSupport() {
        List<Human> humans = Arrays.asList(new Human("Arun", 21), new Human("Adwiti", 3), new Human("Pushpa", 18));
        humans.sort((h1, h2) -> h1.getAge() - h2.getAge());
        return humans;
    }

    public List<Human> sortUsingStaticMethod() {
        List<Human> humans = Arrays.asList(new Human("Arun", 21), new Human("Arun", 3), new Human("Pushpa", 18));
        humans.sort(Human::compareByAgeAndThenName);
        return humans;
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
class Human {
    private String name;
    private int age;

    public static int compareByAgeAndThenName(Human h1, Human h2) {
        return h1.getName().equals(h2.getName()) ? h1.getAge() - h2.getAge() : h1.getName().compareTo(h2.getName());
    }
}
