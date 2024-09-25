/*
Array: an array is a data structure which can store multiple element of same type unorder one  name.

Declartion of 1-D array:
Syntax:
datatype arrayname[]:
ex:
int a[];

Creating 1-D arrays:
syntax:
datatype arrayname[]=new datatype[size]:
int arr []=new int[10];
int arr1[];
arr1=new int[6];

**initlazing 1-D array
int arr2[]={1,2,3,4,5};

to initlazize the array we can write in the following manner.
	int[]list={1,2,9,16,25,36,49};
	float[]farr={1,2f,3,4f,5,6f};
	char str[]={'h','e','j','o'};
	boolen b[]={true,false,true,false};
*/
import 
class Array
{
	public static void main(String s[])
	{
		int arr[]={1,2,3,4,5};
		
		{
			System.out.println("array element["+i+"]"+arr[i]);
		}
	}
}