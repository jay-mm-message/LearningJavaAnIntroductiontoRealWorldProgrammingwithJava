package LearningJavaAnIntroductiontoRealWorldProgrammingwithJava.exercise.polymorphism;

// polymorphism example

class Human {
    public void show_sex() {
        System.out.println("");
    }
}

class Man extends Human {
    @Override
    public void show_sex() {
        System.out.println("Man");
    }
}

class Woman extends Human {
    @Override
    public void show_sex() {
        System.out.println("Woman");
    }
}

public class Test {
    public static void main(String [] args) {
        Human human_a = new Man();
        Human human_b = new Woman();
    
        System.out.println();

        human_a.show_sex();
        human_b.show_sex();
    }
}
