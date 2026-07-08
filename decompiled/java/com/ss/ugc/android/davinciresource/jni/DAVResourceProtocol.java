package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVResourceProtocol {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public MapStringString getParameters() {
        return new MapStringString(DavinciResourceJniJNI.DAVResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    public String getSourceFrom() {
        return DavinciResourceJniJNI.DAVResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public String toResourceId() {
        return DavinciResourceJniJNI.DAVResourceProtocol_toResourceId(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVResourceProtocol dAVResourceProtocol) {
        if (dAVResourceProtocol == null) {
            return 0L;
        }
        return dAVResourceProtocol.swigCPtr;
    }

    public DAVResourceProtocol(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
