package com.cg.flightreservationsystem.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.service.impl.FlightDetailOperationsImpl;
import com.cg.flightreservationsystem.service.impl.FlightRouteOperationsImpl;
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
			System.out.println("3.Modify route details");
			System.out.println("4.View route details");
			System.out.println("5.Modify schedule details");
			System.out.println("6.View schedule details");
			System.out.println("7.To exit");
			int choice;
			Validation validate = new Validation();
			try
			{
				choice = input.nextInt();
				switch(choice) {
				case 1:
					List <FlightDTO>flightList = new ArrayList<FlightDTO>();
					flightList.addAll(FlightDetailOperationsImpl.view());
					java.util.Iterator<FlightDTO> iterate = flightList.iterator();
					while(iterate.hasNext())
					{
						System.out.println(iterate.next());
					}
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
					List <FlightDTO>flightList1 = new ArrayList<FlightDTO>();
					flightList1.addAll(FlightDetailOperationsImpl.view());
					java.util.Iterator<FlightDTO>iterator = flightList1.iterator();
					while(iterator.hasNext())
					{
						System.out.println(iterator.next());
					}
					break;
				case 3:
					FlightRouteOperationsImpl route = new FlightRouteOperationsImpl();
					List <RouteDTO>routeList = new ArrayList<RouteDTO>();
					routeList.addAll(route.view());
					java.util.Iterator<RouteDTO> iterator1 = routeList.iterator();
					while(iterator1.hasNext())
					{
						System.out.println(iterator1.next());
					}
					System.out.println("1.To modify source");
					System.out.println("2.To modify destination");
					boolean sourceOption;
					sourceOption= false;
					String choice1;
					choice1=input.next();
					System.out.println("Enter the routeId");
					String routeId;
					routeId=input.next();
					if(!validate.isRouteIdValid(routeId));
					switch (choice1) {
					case "1":
						sourceOption = true;
						System.out.println("Enter source of the route");
						String source;
						source = input.next();
						if(validate.isPlaceValis(source));
						boolean flag1;
						flag1=route.modify(routeId,source,null, sourceOption);
						if(flag1==true)
						{
							System.out.println("Modification succesful");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "2":
						System.out.println("Enter the destination");
						String destination;
						destination= input.next();
						if(validate.isPlaceValis(destination));
						boolean flag2;
						flag2=route.modify(routeId,null,destination, sourceOption);
						if(flag2==true)
						{
							System.out.println("Modification succesful");
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
				case 4:
					FlightRouteOperationsImpl route1 = new FlightRouteOperationsImpl();
					List <RouteDTO>routeList1 = new ArrayList<RouteDTO>();
					routeList1.addAll(route1.view());
					java.util.Iterator<RouteDTO> iterator2 = routeList1.iterator();
					while(iterator2.hasNext())
					{
						System.out.println(iterator2.next());
					}
					
				case 5:
					FlightScheduleOperationsImpl schedule = new FlightScheduleOperationsImpl();
					List <ScheduleDTO>scheduleList = new ArrayList<ScheduleDTO>();
					scheduleList.addAll(FlightScheduleOperationsImpl.view());
					java.util.Iterator<ScheduleDTO> iterator3 = scheduleList.iterator();
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
					System.out.println("Enter the schedule Id");
					String scheduleId;
					scheduleId=input.next();
					if(!validate.isScheduleIdValid(scheduleId));
					switch (choice2) {
					case "1":
						option = "departureDate";
						System.out.println("Enter departure date");
						String departureDate;
						departureDate = input.next();
						if(validate.isDateValid(departureDate));
						boolean flag1;
						flag1=schedule.modify(scheduleId, null, null, null, departureDate, option, null);
						if(flag1==true)
						{
							System.out.println("Modification succesful");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "2":
						option="arrivalDate";
						System.out.println("Enter arrival date");
						String arrivalDate;
						arrivalDate=input.next();
						if(validate.isDateValid(arrivalDate));
						boolean flag2;
						flag2=schedule.modify(scheduleId,null,null,arrivalDate,null,option,null);
						if(flag2==true)
						{
							System.out.println("Modification succesful");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "3":
						option="arrivalTime";
						System.out.println("Enter arrival time");
						String arrivalTime;
						arrivalTime= input.next();
						if(validate.isTimevalid(arrivalTime));
						boolean flag3;
						flag3=schedule.modify(scheduleId,arrivalTime,null,null,null,option,null);
						if(flag3==true)
						{
							System.out.println("Modification succesful");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "4":
						option="departureTime";
						System.out.println("Enter departure time");
						String departureTime;
						departureTime=input.next();
						if(validate.isTimevalid(departureTime));
						boolean flag4;
						flag4=schedule.modify(scheduleId,null,departureTime,null,null,option,null);
						if(flag4==true)
						{
							System.out.println("Modification succesful");
						}
						else
						{
							System.out.println("Entered flight id is not found");
						}
						break;
					case "5":
						option="price";
						System.out.println("Enter price");
						String price;
						price=input.next();
						if(validate.isPricevalid(price));
						boolean flag5;
						flag5=schedule.modify(scheduleId,null,null,null,null,option,price);
						if(flag5==true)
						{
							System.out.println("Modification succesful");
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
				case 6:
					List <ScheduleDTO>scheduleList1 = new ArrayList<ScheduleDTO>();
					scheduleList1.addAll(FlightScheduleOperationsImpl.view());
					java.util.Iterator<ScheduleDTO> iterator4 = scheduleList1.iterator();
					while(iterator4.hasNext())
					{
						System.out.println(iterator4.next());
					}
					break;
				case 7:
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
	
