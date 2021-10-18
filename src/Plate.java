public class Plate {
    private int food;
    private int vPlate;

    public Plate(int food, int vPlate) {
        this.food = food;
        this.vPlate = vPlate;
    }

    public void setvPlate(int vPlate) {
        this.vPlate = vPlate;
    }

    public void info(){
        //System.out.println("в тарелке: " + getFood() + " еды");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetite) {
        if (food >= appetite) { // проверка сколько еды осталось в тарелке
            food -= appetite;
            System.out.printf("съел " + appetite + " в миске осталось " + getFood() + ", ");
        }
        else { // если еды нехватает то кот голодный (согласно условию он не может быть частично сыт)
            System.out.printf("попытался съесть %s еды, но еды в тарелке не хватает: ",appetite);
            System.out.println("Нужно наполнить миску!");
            System.out.println("Пытаемся наполнить миску: 40 еды к остатку:" + food + " в объем миски:" + vPlate);
            // пытаемся добавить 40 корма в тарелку проверяя ее объем
            if ((food + 40) <= vPlate){
                setFood(food += 40);
                System.out.printf("добавим 40 еды\n");
            } else System.out.println("объем миски слишком мал");
            // пытаемся добавить меньшее количесово еды в миску (так как большее количество не вошло)
            if ((food + 10) <= vPlate){
                setFood(food += 10);
                System.out.printf("добавим 10 еды\n");
            }

        }
    }
}
