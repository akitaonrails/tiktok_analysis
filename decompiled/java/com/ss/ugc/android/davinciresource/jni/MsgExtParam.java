package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes35.dex */
public class MsgExtParam {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MsgExtParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public HTTP_TYPE getEHttpType() {
        return HTTP_TYPE.swigToEnum(DavinciResourceJniJNI.MsgExtParam_eHttpType_get(this.swigCPtr, this));
    }

    public int getErrorCode() {
        return DavinciResourceJniJNI.MsgExtParam_errorCode_get(this.swigCPtr, this);
    }

    public long getUiReqId() {
        return DavinciResourceJniJNI.MsgExtParam_uiReqId_get(this.swigCPtr, this);
    }

    public MsgExtParam() {
        this(DavinciResourceJniJNI.new_MsgExtParam(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(MsgExtParam msgExtParam) {
        if (msgExtParam == null) {
            return 0L;
        }
        return msgExtParam.swigCPtr;
    }

    public void setEHttpType(HTTP_TYPE http_type) {
        DavinciResourceJniJNI.MsgExtParam_eHttpType_set(this.swigCPtr, this, http_type.swigValue());
    }

    public void setErrorCode(int i) {
        DavinciResourceJniJNI.MsgExtParam_errorCode_set(this.swigCPtr, this, i);
    }

    public void setUiReqId(long j) {
        DavinciResourceJniJNI.MsgExtParam_uiReqId_set(this.swigCPtr, this, j);
    }

    public MsgExtParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
