package com.cg.flightreservationsystem.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.service.FlightDetailOperations;
import com.cg.flightreservationsystem.service.FlightRouteOperations;
import com.cg.flightreservationsystem.service.FlightScheduleOperations;
import com.cg.flightreservationsystem.service.impl.FlightDetailOperationsImpl;
import com.cg.flightreservationsystem.service.impl.FlightRouteOperationsImpl;
import com.cg.flightreservationsystem.service.impl.FlightScheduleOperationsImpl;
import com.flightreservationsystem.utility.Validation;
/**
 * user Interface class
 * @author trainee
 *
 */
public class FlightReservationSystem {
	/**
	 * static variable to make the loop stop after 3 wrong attempts
	 */
	static int count;
	/***
	 * Main method starts 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Select the operation to be performed");
			System.out.println("1.Modify flight details");
			System.out.println("2.View flight details");
			System.out.println("3.Modify route details");
			System.out.println("4.View route details");
			System.out.println("5.Modify schedule details");
			System.out.println("6.View schedule details");
			System.out.println("7.To exit");
			String choice;
			Validation validate = new Validation();
			FlightDetailOperations flight = new FlightDetailOperationsImpl();
			FlightScheduleOperations schedule = new FlightScheduleOperationsImpl();
			FlightRouteOperations route = new FlightRouteOperationsImpl();
			try
			{
				choice = input.next();
				switch(choice) {
				case "1":
					
					List <FlightDTO>flightList = new ArrayList<FlightDTO>();
					flightList.addAll(flight.viewFlightDetails());
					Iterator<FlightDTO> iterate = flightList.iterator();
					while(iterate.hasNext())
					{
						System.out.println(iterate.next());
					}
					System.out.println("Enter the flightid");
					String flightId;
					flightId=input.next();
					validate.isFlightIdValid(flightId);
					System.out.println("Enter the capacity");
					String capacity;
					capacity = input.next();
					validate.isCapacityValid(capacity);
					boolean flag = flight.modifyFlightDetails(flightId,capacity);
					if(flag)
					{
						System.out.println("Modification succesful");
					}
					else
					{
						System.out.println("Entered flight id is not found");
					}
					break;
				case "2":
					List <FlightDTO>flightList1 = new ArrayList<FlightDTO>();
					flightList1.addAll(flight.viewFlightDetails());
					Iterator<FlightDTO>iterator = flightList1.iterator();
					while(iterator.hasNext())
					{
						System.out.println(iterator.next());
					}
					break;
				case "3":
					List <RouteDTO>routeList = new ArrayList<RouteDTO>();
					routeList.addAll(route.viewRouteDetails());
					Iterator<RouteDTO> iterator1 = routeList.iterator();
					while(iterator1.hasNext())
					{
						System.out.println(iterator1.next());
					}
					System.out.println("1.To modify source");
					System.out.println("2.To modify destination");
					System.out.println("");
					boolean sourceOption;
					String choice1;
					choice1=input.next();
					switch (choice1) {
					
					case "1":
						System.out.println("Enter the routeId");
						String routeId;
						routeId=input.next();
						validate.isRouteIdValid(routeId);
						sourceOption = true;
						System.out.println("Enter source of the route");
						String source;
						source = input.next();
						validate.isPlaceValid(source);
						boolean flag1;
						flag1=route.modifyRouteDetails(routeId,source,null, sourceOption);
						if(flag1)
						{
							System.out.println("Modification successfull");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "2":
						System.out.println("Enter the routeId");
						sourceOption=false;
						String routeId1;
						routeId1=input.next();
						validate.isRouteIdValid(routeId1);
						System.out.println("Enter the destination");
						String destination;
						destination= input.next();
						validate.isPlaceValid(destination);
						boolean flag2;
						flag2=route.modifyRouteDetails(routeId1,null,destination, sourceOption);
						if(flag2)
						{
							System.out.println("Modification successfull");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					default:
						System.out.println("Please enter correct choice");
						break;
					}
					break;
				case "4":
					List <RouteDTO>routeList1 = new ArrayList<RouteDTO>();
					routeList1.addAll(route.viewRouteDetails());
					Iterator<RouteDTO> iterator2 = routeList1.iterator();
					while(iterator2.hasNext())
					{
						System.out.println(iterator2.next());
					}
					
				case "5":
					List <ScheduleDTO>scheduleList = new ArrayList<ScheduleDTO>();
					scheduleList.addAll(schedule.viewScheduleDetails());
					Iterator<ScheduleDTO> iterator3 = scheduleList.iterator();
					while(iterator3.hasNext())
					{
						System.out.println(iterator3.next());
					}
					System.out.println("1.To modify departure date");
					System.out.println("2.To modify arrival date");
					System.out.println("3.To modify departure time");
					System.out.println("4.To modify arrival time");
					System.out.println("5.To modify price");
					String option;
					String choice2;
					choice2=input.next();
					
					switch (choice2) {
					case "1":
						System.out.println("Enter the schedule Id");
						String scheduleId;
						scheduleId=input.next();
						validate.isScheduleIdValid(scheduleId);
						option = "departureDate";
						System.out.println("Enter departure date");
						String departureDate;
						departureDate = input.next();
						validate.isDateValid(departureDate);
						boolean flag1;
						flag1=schedule.modifyScheduleDetails(scheduleId, null, null, null, departureDate, option, null);
						if(flag1)
						{
							System.out.println("Modification successfull");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "2":
						System.out.println("Enter the schedule Id");
						String scheduleId1;
						scheduleId1=input.next();
						validate.isScheduleIdValid(scheduleId1);
						option="arrivalDate";
						System.out.println("Enter arrival date");
						String arrivalDate;
						arrivalDate=input.next();
						validate.isDateValid(arrivalDate);
						boolean flag2;
						flag2=schedule.modifyScheduleDetails(scheduleId1,null,null,arrivalDate,null,option,null);
						if(flag2)
						{
							System.out.println("Modification successfull");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "3":
						System.out.println("Enter the schedule Id");
						String scheduleId2;
						scheduleId2=input.next();
						validate.isScheduleIdValid(scheduleId2);
						option="arrivalTime";
						System.out.println("Enter arrival time");
						String arrivalTime;
						arrivalTime= input.next();
						validate.isTimevalid(arrivalTime);
						boolean flag3;
						flag3=schedule.modifyScheduleDetails(scheduleId2,arrivalTime,null,null,null,option,null);
						if(flag3)
						{
							System.out.println("Modification successfull");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "4":
						System.out.println("Enter the schedule Id");
						String scheduleId3;
						scheduleId3=input.next();
						validate.isScheduleIdValid(scheduleId3);
						option="departureTime";
						System.out.println("Enter departure time");
						String departureTime;
						departureTime=input.next();
						validate.isTimevalid(departureTime);
						boolean flag4;
						flag4=schedule.modifyScheduleDetails(scheduleId3,null,departureTime,null,null,option,null);
						if(flag4)
						{
							System.out.println("Modification successfull");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "5":
						System.out.println("Enter the schedule Id");
						String scheduleId4;
						scheduleId4=input.next();
						validate.isScheduleIdValid(scheduleId4);
						option="price";
						System.out.println("Enter price");
						String price;
						price=input.next();
						validate.isPricevalid(price);
						boolean flag5;
						flag5=schedule.modifyScheduleDetails(scheduleId4,null,null,null,null,option,price);
						if(flag5)
						{
							System.out.println("Modification successfull");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
						
					default:
						System.out.println("Please enter correct choice");
						break;
					}
					break;
				case "6":
					final List <ScheduleDTO>scheduleList1 = new ArrayList<ScheduleDTO>();
					scheduleList1.addAll(schedule.viewScheduleDetails());
					Iterator<ScheduleDTO> iterator4 = scheduleList1.iterator();
					while(iterator4.hasNext())
					{
						System.out.println(iterator4.next());
					}
					break;
				case "7":
					System.exit(0);
				default:
					System.out.println("Entered invalid choice, please enter a valid choice");
					count++;
					break;
				}
			}
			catch(Exception exception)
			{
				System.err.println(exception.getMessage());
			}
			
			}
			while(count<3);
		input.close();
	}
	}
	
