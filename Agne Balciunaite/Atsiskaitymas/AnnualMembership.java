public class AnnualMembership extends Membership{

    private final int duration = 12;

    public AnnualMembership(int membershipId, int memberId){
        super(membershipId, memberId);
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public double getCost() {
        return 300.0;
    }

    @Override
    public String toString() {
        return "AnnualMembership, Cost: " + getCost() + ", Duration : " + duration + " months";
    }
}
