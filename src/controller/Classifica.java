package controller;

import java.util.concurrent.Semaphore;

public class Classifica {
	
	private int n,s;
	private String classifica[];
	private Semaphore sem;
	
	public Classifica(Semaphore sem) {
		classifica = new String[20];
		n=0;
		s=0;
		this.sem = sem; 
	}
	
	public void Queue(String p){
		if(isFull())
		{
			if(s>0)
			{
				int j=s;
				for(int i=0;i<n-s;i++,j++)
				{
					classifica[i] = classifica[j];
				}
				n -=s;
				s=0;
				classifica[n++] = p;
			}else{
				throw new IllegalStateException("Coda piena!");	
			}
		}else {
			classifica[n++] = p;
			if(n==20) {
				sem.release();
			}
		}
	}
	
	public String Dequeue(){
		if(isEmpty())
		{
				throw new IllegalStateException("Coda vuota!");
		}else {
			String ret = classifica[s];
			classifica[s++] = null;	
			return ret;	
		}
		
	}
	
	public boolean isEmpty(){
		return s == n;
	}
	
	public boolean isFull(){
		return n == classifica.length;
	}
	
}