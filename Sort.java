package sorting;

public class Sort{

	SortingNode head;
	public Sort(){
		head = null;
	}
	
	public void Push(int info){
		head = new SortingNode(info,head);
	}
	
	public int Pop(){
		try{
			SortingNode pop = head;
			head = head.next;
			return pop.info;
		} catch(NullPointerException error){
			System.out.println("NullPointerException");
			return -69;
		}
	}
	
	public int Peek(){
		try{
			return head.info;
		} catch(NullPointerException error){
			System.out.println("NullPointerException");
			return -69;
		}
	}
	
	public void InsertionSort(){
		SortingNode pointer = head;
		int size = 0;
		while(pointer != null){
			size++;
			pointer = pointer.next;
		}
		Integer[] sortArr= new Integer[size];
		pointer= head;
		for(int x=0; x<size;x++){
			sortArr[x] = pointer.data;
			pointer = pointer.next;
		}
		
		for(int x=0; x<sortArr.length; x++){
			for(int y=x; y>0; y--){
				if(sortArr[y-1] > sortArr[y]){
					int temp = sortArr[y-1];
					sortArr[y-1] = sortArr[y];
					sortArr[y] = temp;
					System.out.println("CHANGED " + sortArr[y-1] + " WITH " + sortArr[y]);
					System.out.print("{");
					for(int n=0; n<sortArr.length; n++){
						System.out.print(sortArray[n] + " ");
					}
					System.out.println("}");
					
				} else{
					break;
				}
			}
		}
		
		head = new SortingNode(sortArr[0],null);
		pointer = head;
		for(int x=1; x<sortArr.length; x++){
			pointer.next = new SortingNode(sortArr[x],null);
			pointer = pointer.next;
		}
	}
	
}
