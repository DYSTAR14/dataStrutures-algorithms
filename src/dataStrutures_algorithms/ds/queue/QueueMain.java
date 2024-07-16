package dataStrutures_algorithms.ds.queue;

public class QueueMain {

	public static void main(String[] args) {
		QueueOperations queueOP = new QueueOperations(10);
		
		queueOP.enQueue(1);
		queueOP.enQueue(2);
		queueOP.enQueue(3);
		queueOP.enQueue(4);
		queueOP.deQueue();

	}

}
