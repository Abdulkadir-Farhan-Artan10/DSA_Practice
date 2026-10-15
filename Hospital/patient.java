package Hospital;

public class patient {
    String name;
    double consultation_fee;
    //method dispaly patient info
    public void dispalyinfo(){
        System.out.println("patient name is:"  +name);
        System.out.println("consulatation fee is:"  +consultation_fee);
    }
}
//fist subclass
class inpatient extends patient{
    int num_of_days;
    double room_charge;

    //this method calculates the total fee of inpatient
    public double calculate(){
      return   room_charge *num_of_days +consultation_fee;
    }

    //this method displays inpatient's_information
    public void dispaly_info_of_inpatient(){
        super.dispalyinfo();
        System.out.println("number of days:"  +num_of_days);
        System.out.println("room charge:" + room_charge);
        System.out.println("total fee is:" + calculate());

    }

}
//second subclass
class outpatient extends patient{
    double lab_charge;

    //this method calculates the total fee of the outpatient
      double xisaabin(){
        return lab_charge + consultation_fee;
    }

    //this method dispalys outpatient's information
    public void dispaly_info_of_outpatient(){
        super.dispalyinfo();
        System.out.println("lab charge is:" +lab_charge);
        System.out.println("total fee is:" + xisaabin());

    }

    static void main() {
        //inpatient 1 object
        inpatient p1=new inpatient();
        p1.name="Ali Omar Ali";
        p1.consultation_fee=40;
        p1.num_of_days=7;
        p1.room_charge=60;
        System.out.println();
        System.out.println("====inpatient 1 details=====");
        p1.dispaly_info_of_inpatient();
        System.out.println();

//inpatient 2 object
        inpatient p2=new inpatient();
        p2.name="Aisho Ali Ahmed";
        p2.consultation_fee=15;
        p2.num_of_days=17;
        p2.room_charge=54;
        System.out.println("====inpatient 2 details=====");
        p2.dispaly_info_of_inpatient();
        System.out.println();

//        outpatient  1 object
        outpatient outp1=new outpatient();
        outp1.name="Maria Ali Ahmed";
        outp1.consultation_fee=22;
        outp1.lab_charge=30;
        System.out.println("====outpatient 1 details=====");
        outp1.dispaly_info_of_outpatient();
        System.out.println();


//        outpatient  2 object
        outpatient outp2=new outpatient();
        outp2.name="Yacquub Osman Qoorey";
        outp2.consultation_fee=12;
        outp2.lab_charge=44;
        System.out.println("====outpatient 2 details=====");
        outp2.dispaly_info_of_outpatient();


    }

}






