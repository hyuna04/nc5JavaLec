package chap07_inherit.animal;

public class Bear {
	//속성: 잡식, 꿀을 좋아하는지 여부, 서식지, 종
	//기능: 먹는다, 겨울잠잔다, 수영을 한다
}
public class Bear {
    // 속성
    private String diet;        // 먹이 (잡식 또는 초식)
    private boolean likesHoney; // 꿀을 좋아하는지 여부
    private String habitat;     // 서식지
    private String species;     // 종

    // 생성자
    public Bear(String diet, boolean likesHoney, String habitat, String species) {
        this.diet = diet;
        this.likesHoney = likesHoney;
        this.habitat = habitat;
        this.species = species;
    }

    // 기능
    public void hibernate() {
        System.out.println("곰이 겨울잠을 잡니다.");
    }

    public void swim() {
        System.out.println("곰이 수영을 합니다.");
    }
}
Bear polarBear = new Bear("잡식", false, "북극", "극지곰");
polarBear.hibernate(); // 출력: 곰이 겨울잠을 잡니다.
polarBear.swim();      // 출력: 곰이 수영을 합니다.