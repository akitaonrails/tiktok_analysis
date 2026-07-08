package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes35.dex */
public class AlgorithmResourceFinder {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_AlgorithmResourceFinder(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public AlgorithmResourceFinder() {
        this(DavinciResourceJniJNI.new_AlgorithmResourceFinder(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(AlgorithmResourceFinder algorithmResourceFinder) {
        if (algorithmResourceFinder == null) {
            return 0L;
        }
        return algorithmResourceFinder.swigCPtr;
    }

    public AlgorithmResourceFinder(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static String resourceFinder(SWIGTYPE_p_void sWIGTYPE_p_void, String str, String str2) {
        return DavinciResourceJniJNI.AlgorithmResourceFinder_resourceFinder(SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), str, str2);
    }
}
