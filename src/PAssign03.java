public class PAssign03 {

	public static void main(String[] args) {
        Computer[] storage;
        storage = createCompList();
		VideoCard card2 = new VideoCard("discrete","PCIEx16",575,"8-pin",24);
		storage[1] = new Computer(card2);
		storage[1].setbrand("Dell");
		storage[1].setModel("Optiplex");
		VideoCard card3 = new VideoCard("integrated","N/A",120,"N/A",4);
		storage[2] = new Computer(card3);
		storage[2].setbrand("Lenovo");
		storage[2].setModel("IdeaCentre");
		VideoCard card4 = new VideoCard("discrete","PCIEx8",150,"6-pin",8);
		storage[3] = new Computer(card4);
		storage[3].setbrand("HP");
		storage[3].setModel("Omen Obelisk");
		VideoCard card5 = new VideoCard("integrated","N/A",-110,"N/A",2);
		storage[4] = new Computer(card5);
		storage[4].setbrand("Lenovo");
		storage[4].setModel("IdeaCentre");
		printComp(storage);
	}
		

		
	private static Computer[] createCompList() {
		Computer[] list = new Computer[5];
        for(int i=0; i< list.length;i++) {
        	list[i] = new Computer();
        }
		return list;
	}
    static void printComp(Computer[] printer) {
    	for(int i=0; i < printer.length; i++){
            System.out.println(printer[i].getInfo());
        	}
	}
}

 

class Computer {
	private String brand;
	private String model;
	private VideoCard GPU;
	
	 Computer(){
		brand = "OEM";
		model = "Basic";
		GPU = new VideoCard();
	}

	 public Computer(VideoCard GPU){
		brand = "OEM";
		model = "Basic";
		 this.GPU = GPU;
	 }
	void setbrand(String brand) {
			this.brand = brand;
	}
	String getBrand() {
		return this.brand;
	}
	void setModel(String model) {
		this.model =  model;
}
	String getModel() {
		return this.model;
	}
	String getInfo() {
		return String.format("%s %s\n%s",getBrand(),getModel(),GPU.getInfo());
	}
       // Implement Computer class here (outside of PAssign03 class)

}

 

class VideoCard {
	private String type;
	private String connectionType;
	private int powerRequirement;
	private String externalPower;
	private int memorySize;
	
	VideoCard(){
		type = "integrated";
		connectionType = "N/A";
		powerRequirement = 100;
		externalPower ="N/A";
		memorySize = 1;
	}
	VideoCard(String type, String connection, int power, String external, int memory){
		this.type = type;
		connectionType = setconnection(connection);
		powerRequirement = setPower(power);
		externalPower = setexternal(external);
		memorySize = setMemory(memory);
		
	}
	String getType() {
		return this.type;
	}
	private String setconnection(String connection) {
		return connectionType  = (this.getType() == "discrete") ? this.connectionType = connection : "N/A";
		
	}
	String getconnection() {
		return this.connectionType;
	}
	private int setPower(int num) {
		if(num > 500) return powerRequirement = 400;
		if(num < 1)   return powerRequirement = 75;
		else { powerRequirement = num;}
	return powerRequirement;
	}
	int getPower() {
		return this.powerRequirement;
	}
	private String setexternal(String externalPower) {
		if(this.getType() == "discrete") this.externalPower = externalPower;
	return externalPower;
	}
	String getexternal() {
		return this.externalPower;
	}
	private int setMemory(int num) {
		if(num > 16) return memorySize = 16;
		if(num < 1)  return memorySize = 1;
		else { memorySize = num;}
	return memorySize;
	}
	int getMemory() {
		return this.memorySize;
	}
	String getInfo(){ 
        return String.format("Video Card Info:\nType:\s%s\nConnection:\s%s\nPower: %dW\nExt Power:\s%s\nMemory:\s%dGB\n",this.type,this.connectionType, this.powerRequirement, this.externalPower, this.memorySize);
    }

}

       // Implement VideoCard class here (outside of PAssign03 class)

