package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DavResourceExtraData {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DavResourceExtraData(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getJsonData() {
        return DavinciResourceJniJNI.DavResourceExtraData_jsonData_get(this.swigCPtr, this);
    }

    public DavResourceExtraData() {
        this(DavinciResourceJniJNI.new_DavResourceExtraData(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DavResourceExtraData davResourceExtraData) {
        if (davResourceExtraData == null) {
            return 0L;
        }
        return davResourceExtraData.swigCPtr;
    }

    public void setJsonData(String str) {
        DavinciResourceJniJNI.DavResourceExtraData_jsonData_set(this.swigCPtr, this, str);
    }

    public DavResourceExtraData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
