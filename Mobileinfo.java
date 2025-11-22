package Day8;

public class Mobileinfo {

    String[] outdatedModels = {"note4","note5","note6","note7"};

    public void printMobileDetails(String Company,String... Models){
        System.out.println("Company Name Is:"+Company);

        if (Models.length==0){
            System.out.println("Model not provided");
            return;
        }
        System.out.println("Models:");
        for (String model : Models){
            boolean isOutDated=false;

            for (String outdated : outdatedModels){
                if (model.equalsIgnoreCase(outdated)){
                    isOutDated=true;
                    break;
                }
            }
            if (isOutDated){
                System.out.println(model+ "_OUTDATED");
            }else {
                System.out.println(model);
            }
        }
    }
}
