import java.util.List;

@FunctionalInterface
interface QuadEqSolver {
    List<Double> solveQuadraticEquation(double a, double b, double c);
}