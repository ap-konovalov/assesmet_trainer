package ru.alfabank.assesment;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import ru.alfabank.assesment.tags.Link;

@Link("https://www.baeldung.com/junit-5-parallel-tests")
@Description("Параллельный запуск тестов")
public class ParallelRunTest {

    @Test
    public void first() throws Exception{
        System.out.println("FirstParallelUnitTest first() start => " + Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println("FirstParallelUnitTest first() end => " + Thread.currentThread().getName());
    }

    @Test
    public void second() throws Exception{
        System.out.println("FirstParallelUnitTest second() start => " + Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println("FirstParallelUnitTest second() end => " + Thread.currentThread().getName());
    }
}
