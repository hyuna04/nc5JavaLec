package chap07_inherit.animal;

public class Whale {
	//속성: 먹이, 사는곳, 종, 치아, 새끼
	//기능: 먹는다, 물을 뿜는다, 무리지어 다닌다
}
public class Whale {
    private String food;
    private String habitat;
    private String species;
    private int teeth;
    private int offspring;
    
    public Whale(String food, String habitat, String species, int teeth, int offspring) {
        this.food = food;
        this.habitat = habitat;
        this.species = species;
        this.teeth = teeth;
        this.offspring = offspring;
    }
    
    public void eat() {
        System.out.println("고래가 " + food + "을(를) 먹습니다.");
    }
    
    public void blowWater() {
        System.out.println("고래가 물을 뿜습니다.");
    }
    
    public void swimInGroup() {
        System.out.println("고래가 무리지어 다닙니다.");
    }
}