package methodreference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Human {
    private String name;
    private int age;
}
