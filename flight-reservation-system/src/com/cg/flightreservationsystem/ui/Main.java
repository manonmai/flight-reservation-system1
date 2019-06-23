package com.cg.flightreservationsystem.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.service.impl.FlightDetailOperationsImpl;
import com.cg.flightreservationsystem.service.impl.FlightScheduleOperationsImpl;
import com.flightreservationsystem.utility.Validation;

public class Main {
	static int count;
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Select the operation to be performed");
			System.out.println("1.Modify flight details");
			System.out.println("2.View flight details");
			System.out.println("3.Modify schedule details");
			System.out.println("4.View schedule details");
			System.out.println("5.Modify flight details");
			System.out.println("6.View flight details");
			System.out.println("7.To exit");
			int choice;
			Validation validate = new Validation();
			try
			{
				choice = input.nextInt();
				switch(choice) {
				case 1:
					FlightDetailOperationsImpl detailKey = new FlightDetailOperationsImpl();
					System.out.println("Enter the flightid");
					String flightId;
					flightId=input.next();
					if(!validate.isFlightIdValid(flightId));
					System.out.println("Enter the capacity");
					int capacity;
					capacity = input.nextInt();
					if(!validate.isCapacityValid(capacity));
					boolean flag = detailKey.modify(flightId,capacity);
					if(flag==true)
					{
						System.out.println("Modification succesful");
					}
					else
					{
						System.out.println("Entered flight id is not found");
					}
					break;
				case 2:
					List <FlightDTO>flightList = new ArrayList<FlightDTO>();
					flightList.addAll(FlightDetailOperationsImpl.view());
					Iterator<FlightDTO> iterate = flightList.iterator();
					while(iterate.hasNext())
					{
						System.out.println(iterate.next());
					}
					break;
				case 3:
					FlightScheduleOperationsImpl detailKey2 = new FlightScheduleOperationsImpl();
					System.out.println("Enter the scheduleid");
					String scheduleId;
					flightId=input.next();
					if(!validate.isScheduleIdValid(scheduleId));
					System.out.println("Enter the capacity");
					int capacity;
					capacity = input.nextInt();
					if(!validate.isCapacityValid(capacity));
					boolean flag = detailKey.modify(flightId,capacity);
					if(flag==true)
					{
						System.out.println("Modification succesful");
					}
					else
					{
						System.out.println("Entered flight id is not found");
					}
					break;
					
					
				}
			}
		}
	}

}
