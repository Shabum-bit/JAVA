public class HealthStation{
    private int weighings;

    public HealthStation() {
        this.weighings = 0;
    }
        public int weigh (Person person){
            this.weighings++;
            return person.getWeight();
        }
//        return person.getWeight();

//    public void feed(Person person){
//        int currentWeight = person.getWeight();
//        person.setWeight(currentWeight +1);

        public void feed (Person person){
            int currentWeight = person.getWeight();
            person.setWeight(currentWeight + 1);
        }

        public int weighings () {
            return this.weighings;

        }
    }
