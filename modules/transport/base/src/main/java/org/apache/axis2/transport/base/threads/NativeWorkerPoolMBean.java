package org.apache.axis2.transport.base.threads;



public interface NativeWorkerPoolMBean {

    public void setCoreThreadPoolSize(int size);

    public void setMaxThreadPoolSize(int size);

    public void setKeepAliveTime(long time);

    public int getCoreThreadPoolSize();

    public int getMaxThreadPoolSize();

    public long getKeepAliveTime();
}