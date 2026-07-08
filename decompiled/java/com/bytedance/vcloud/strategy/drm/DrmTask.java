package com.bytedance.vcloud.strategy.drm;

/* JADX INFO: loaded from: classes14.dex */
public abstract class DrmTask implements Comparable<DrmTask> {
    public final DrmFuture<Object> future;
    public final Priority priority;

    public abstract Object execute();

    public final DrmFuture<Object> getFuture() {
        return this.future;
    }

    public final Priority getPriority() {
        return this.priority;
    }

    @Override // java.lang.Comparable
    public final int compareTo(DrmTask drmTask) {
        if (drmTask == null) {
            return -1;
        }
        return Integer.compare(this.priority.getOrder(), drmTask.priority.getOrder());
    }

    public DrmTask(Priority priority, DrmFuture<Object> drmFuture) {
        this.priority = priority;
        this.future = drmFuture;
    }
}
