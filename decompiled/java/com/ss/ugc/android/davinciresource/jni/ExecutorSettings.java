package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class ExecutorSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_ExecutorSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ExecutorSettings() {
        this(DavinciResourceJniJNI.new_ExecutorSettings(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ExecutorSettings executorSettings) {
        if (executorSettings == null) {
            return 0L;
        }
        return executorSettings.swigCPtr;
    }

    public static void setExecutor(AndroidExecutor androidExecutor) {
        DavinciResourceJniJNI.ExecutorSettings_setExecutor(AndroidExecutor.getCPtr(androidExecutor), androidExecutor);
    }

    public ExecutorSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
