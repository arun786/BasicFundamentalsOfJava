package methodreference;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Adwiti on 7/10/2018.
 */
public class MethodReferenceCompareTest {

    MethodReferenceCompare methodReferenceCompare;

    @Before
    public void setUp() {
        methodReferenceCompare = new MethodReferenceCompare();
    }

    @Test
    public void testBasicSortWithoutLambdas() {
        List<Human> humans = methodReferenceCompare.basicSortWithoutLambdas();
        assertThat(humans.get(0).getAge(), equalTo(3));
    }

    @Test
    public void testBasicSortWithLambdaSupport() {
        List<Human> humans = methodReferenceCompare.basicSortWithLambdaSupport();
        assertThat(humans.get(0).getAge(), equalTo(3));
    }
}
