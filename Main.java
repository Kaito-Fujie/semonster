public class Main {
    public static void main(String[] args) {
        System.out.println("SEMONSTER GAME");
        System.out.println("Show draw monsters!");

        Player player = new Player();          // Playerオブジェクトの作成
        player.drawMonsters();                 // モンスターを引く
        player.showDeck();                     // デッキの内容を表示
    }
}