import java.util.*;
interface ITerm{
    ITerm derivative();
    double evaluate(double x);
    String toString();
}