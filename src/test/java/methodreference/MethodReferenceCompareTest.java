package methodreference;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Adwiti on 7/10/2018.
 */
public class MethodReferenceCompareTest {

    @Test
    public void testBasicSortWithoutLambdas() {

        MethodReferenceCompare methodReferenceCompare = new MethodReferenceCompare();
        List<Human> humans = methodReferenceCompare.basicSortWithoutLambdas();
        assertThat(humans.get(0).getAge(), equalTo(3));

    }
}
