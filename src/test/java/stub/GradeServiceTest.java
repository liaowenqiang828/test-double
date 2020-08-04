package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StubGradeSystem extends GradeSystem {
    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(88.0, 92.0, 90.0);
    }
}

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    private StubGradeSystem stubGradeSystem;
    private GradeService gradeService;

    @BeforeEach
    public void setUp() {
        stubGradeSystem = new StubGradeSystem();
        gradeService = new GradeService(stubGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result;
        result = gradeService.calculateAverageGrades(9999999L);
        assertEquals(90, result);
    }
}
