
public class notes {
/*Description
Write a Java program to define and test a Computer class that aggregates a VideoCard class.  

Computer Class Description:
The Computer class represents a single Computer.  Every Computer contains one VideoCard that is manufactured separately from the Computer.  

The Computer class should contain data members to represent:  brand, model, and a VideoCard.  Include a default constructor and one that takes a VideoCard as a parameter.   Other constructors can be added as needed, but must be documented in the UML.  There should be a method called getInfo() that returns the brand, model, and the information from VideoCards’s getInfo().  A default Computer should have a brand of “OEM”, a model of “Basic”, and should create and use a default VideoCard.  

Computer instance member names:  brand, model, videoCard

VideoCard Class Description:
The VideoCard class should contain data members to represent:  type (integrated, discrete, etc.); motherboard connection type (PCIEx4, PCIEx8, etc. – discrete only); power requirements (in watts); external power type (6-pin, 8-pin, 12-pin, dual, etc. – discrete only); and memory (in GBs).  Include a default constructor and a constructor to set the type, motherboard connection type, power requirements, external power type, and memory size of a VideoCard.  Any non-applicable fields should have a value of “N/A”, for instance, the motherboard connection type of an integrated card should be “N/A”.  There should also be a method called getInfo() that returns detailed, formatted information about the VideoCard.  

Error checking should be used on the power requirements to keep them in the range of 1-500W (default 400 if above 500, 75 if below 1), and the memory should be kept between 1-16 GB (default 16 if above 16, 1 if below 1).

By default, a VideoCard should be of type “integrated”, with a motherboard connection type of “N/A”, a power requirement of 100 watts, an external power type of “N/A”, and 1GB of memory.

VideoCard instance member names:  type, connectionType, powerRequirement, externalPower, memorySize;

NOTES:  Use appropriate visibility modifiers based on class discussion.  Use accessor/mutator methods and the this keyword where appropriate.
 
Create a UML diagram that describes both classes and their relationship.  Include multiplicity for any associations.  Include the proper aggregation/composition symbols for any aggregated classes.  You should provide full details (including visibility) for each class (all instance members) but can create a separate diagram using simplified class UML to show only the relationships, if desired.

Finally, write a test program that models a computer lab containing a collection of five Computers.  For research purposes, two of the machines will have discrete graphics cards, but the others will have integrated cards with varying features.  See below for specific Computer and VideoCard specifications.  Note that for all Computers except the first one, VideoCards should be instantiated in the test program and passed to the appropriate Computer convenience constructor.

•	Computer 1:  OEM Basic w/ default VideoCard
•	Computer 2:  Dell Optiplex w/ discrete VideoCard, PCIEx16 motherboard connection, 575W draw, 8-pin external power, 24 GB memory
•	Computer 3:  Lenovo IdeaCentre w/ integrated VideoCard, N/A connection, 120W draw, N/A external power, 4 GB memory
•	Computer 4:  HP Omen Obelisk w/ discrete VideoCard, PCIEx8 motherboard connection, 150W draw, 6-pin external power, 8GB memory
•	Computer 5:  Lenovo IdeaCentre w/ integrated VideoCard, N/A connection, -110W draw, N/A external power, 2 GB memory

Generate the above collection of Computers with their respective VideoCards and, using a method that accepts an array of Computers, print info about each one to the Console.  Any out-of-range values should be handled by the class implementation(s), not through manual changes to the test program.

Expected Output
OEM Basic
Video Card Info:
Type: integrated
Connection: N/A
Power: 100W
Ext Power: N/A
Memory: 1GB

Dell Optiplex
Video Card Info:
Type: discrete
Connection: PCIEx16
Power: 400W
Ext Power: 8-pin
Memory: 16GB

Lenovo IdeaCentre
Video Card Info:
Type: integrated
Connection: N/A
Power:	 120W
Ext Power: N/A
Memory: 4GB

HP Omen Obelisk
Video Card Info:
Type: discrete
Connection: PCIEx8
Power: 150W
Ext Power: 6-pin
Memory: 8GB

Lenovo IdeaCentre
Video Card Info:
Type: integrated
Connection: N/A
Power: 75W
Ext Power: N/A
Memory: 2GB

Code
To simplify submission into a single Java file, use the following template for your class.  Make changes to the class headers as necessary.

public class PAssign03 {
	public static void main(String[] args) {
// Create your Computer instances here
	}
}

class Computer {
	// Implement Computer class here (outside of PAssign03 class)
}

class VideoCard {
	// Implement VideoCard class here (outside of PAssign03 class)
}

Deliverables
Name your program PAssign03.java.  Programming Assignment 3 is to be individual work.  Submit the program by the due date specified. 

Use a utility similar to https://www.diffchecker.com/ and the Expected Output to compare your program’s output with the requested output.  Programming is in the details, so double check punctuation, spacing, and case if your output does not match.  When copying and pasting, be aware that Microsoft Word sometimes replaces normal quotes with Smart Quotes, which may need to be edited.

Last modified: Feb 03, 2021 

*/
}
