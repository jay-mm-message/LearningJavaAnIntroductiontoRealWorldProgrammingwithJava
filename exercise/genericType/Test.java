package LearningJavaAnIntroductiontoRealWorldProgrammingwithJava.exercise.genericType;

class Box<T> {
    public <T extends Number> T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
        else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        }
        else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        }
        else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        }
        else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }
}
public class Test {
    public static void main(String [] args) {
        Box<Integer> box_a = new Box<Integer>();
        System.out.println(box_a.add(100, 200));

        Box<Double> box_b = new Box<Double>();
        System.out.println(box_b.add(200.01, 50.22));
    }
}
