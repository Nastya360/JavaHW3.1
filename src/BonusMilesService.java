public class BonusMilesService {
    public int calculate(int price) {
        int bonusRuble = 20;
        int miles = (price / bonusRuble);
        return miles;

    }


}
