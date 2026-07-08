package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class MsgExtParam {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_MsgExtParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEHttpType getEHttpType() {
        return NLEHttpType.swigToEnum(NLEMediaRemoteJniJNI.MsgExtParam_eHttpType_get(this.swigCPtr, this));
    }

    public int getErrorCode() {
        return NLEMediaRemoteJniJNI.MsgExtParam_errorCode_get(this.swigCPtr, this);
    }

    public String getErrorMsg() {
        return NLEMediaRemoteJniJNI.MsgExtParam_errorMsg_get(this.swigCPtr, this);
    }

    public long getUiReqId() {
        return NLEMediaRemoteJniJNI.MsgExtParam_uiReqId_get(this.swigCPtr, this);
    }

    public MsgExtParam() {
        this(NLEMediaRemoteJniJNI.new_MsgExtParam(), true);
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

    public void setEHttpType(NLEHttpType nLEHttpType) {
        NLEMediaRemoteJniJNI.MsgExtParam_eHttpType_set(this.swigCPtr, this, nLEHttpType.swigValue());
    }

    public void setErrorCode(int i) {
        NLEMediaRemoteJniJNI.MsgExtParam_errorCode_set(this.swigCPtr, this, i);
    }

    public void setErrorMsg(String str) {
        NLEMediaRemoteJniJNI.MsgExtParam_errorMsg_set(this.swigCPtr, this, str);
    }

    public void setUiReqId(long j) {
        NLEMediaRemoteJniJNI.MsgExtParam_uiReqId_set(this.swigCPtr, this, j);
    }

    public MsgExtParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
