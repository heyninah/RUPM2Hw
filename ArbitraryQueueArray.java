public class ArbitraryQueueArray {
	
	Object[] arr;
	
	public ArbitraryQueueArray(){
		arr = new Object[4];
	}
	
	public void Enqueue(Object info){
		int iteration;
		for (iteration=0; iteration<arr.length; iteration++){
			if (arr[iteration] == null){
				break;
			}
		}
		
		if (iteration<arr.length){
			arr[iteration] = info;
		} else{
			Resize();
			Enqueue(info);
		}		
	}
	
	public void Push(Object info){
		int iteration;
		for (iteration=0; iteration<arr.length; iteration++){
			if (arr[iteration] == null){
				break;
			}
		}
		
		if (iteration<arr.length){
			Object[] newArr = new Object[arr.length];
			for(iteration=0; iteration<arr.length-1; iteration++){
				newArr[iteration+1] = arr[iteration];
			}
			arr = newArr;
			arr[0] = info;
		} else{
			Resize();
			Push(info);
		}
	}
	
	public Object Pop(){
		
		Object pop = arr[0];
		Object[] newArr = new Object[arr.length];
		for(int iteration=1; iteration<arr.length; iteration++){
			newArr[iteration-1] = arr[iteration];
		}
		arr = newArr;
		return pop;
	}
	
	public Object Dequeue(){
		int iteration;
		for (iteration=0; iteration<arr.length; iteration++){
			if(arr[iteration] == null){
				break;
			}
		}
		try{
			Object dequeue = arr[iteration-1];
			arr[iteration-1] = null;
			return dequeue;
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	
	public Object Traverse(int index){
		
		try{
			return arr[index];
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	
	public void Resize(){
		int iteration;
				
		Object[] newArr = new Object[arr.length * 2];
		for(iteration=0; iteration<arr.length; iteration++){
			newArr[iteration] = arr[iteration];
			arr = newArr;
		} 
	}
	}