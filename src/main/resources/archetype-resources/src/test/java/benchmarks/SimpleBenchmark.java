package ${package}.benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class SimpleBenchmark {

    @Benchmark
    public void run() throws InterruptedException {
        Thread.sleep(1);
    }

    public static void main(String[] args) throws RunnerException {
        new Runner(new OptionsBuilder()
                .include(SimpleBenchmark.class.getName() + ".*")
                .forks(1)
                .warmupTime(TimeValue.seconds(1))
                .warmupIterations(5)
                .measurementTime(TimeValue.seconds(5))
                .measurementIterations(5)
                .build()).run();
    }
}
