public class GymClass{

    private String className;
    private String schedule;
    private String enrolledMembers;

    public GymClass(String className, String schedule){
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = "";
    }

    public String getClassName() {
        return className;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getEnrolledMembers() {
        return enrolledMembers;
    }

    public void enroll(Member member) {
        if (enrolledMembers.isEmpty()) {
            enrolledMembers = member.getName();
        } else {
            enrolledMembers += ", " + member.getName();
        }
    }
        @Override
        public String toString(){
            String result = className + " (" + schedule + ")";

            if (!enrolledMembers.isEmpty()) {
                result += ": " + enrolledMembers;
            }
            return result;
        }
    }
