package good;

/**
 *
 */
public class Manager {
    Worker m_worker;

    public static void main(String[] args) {
        Worker worker = new NormalWorker();
        worker.work();
        Worker superWorker = new SuperWorker();
        superWorker.work();
    }

    public void setWorker(Worker w) {
        m_worker = w;
    }

    public void manage() {
        m_worker.work();
    }
}