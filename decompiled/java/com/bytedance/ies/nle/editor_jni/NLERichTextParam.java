package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLERichTextParam {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLERichTextParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getOpCode() {
        return NLEMediaJniJNI.NLERichTextParam_opCode_get(this.swigCPtr, this);
    }

    public float getParam1() {
        return NLEMediaJniJNI.NLERichTextParam_param1_get(this.swigCPtr, this);
    }

    public float getParam2() {
        return NLEMediaJniJNI.NLERichTextParam_param2_get(this.swigCPtr, this);
    }

    public float getParam3() {
        return NLEMediaJniJNI.NLERichTextParam_param3_get(this.swigCPtr, this);
    }

    public float getParam4() {
        return NLEMediaJniJNI.NLERichTextParam_param4_get(this.swigCPtr, this);
    }

    public String getParam5() {
        return NLEMediaJniJNI.NLERichTextParam_param5_get(this.swigCPtr, this);
    }

    public NLERichTextParam() {
        this(NLEMediaJniJNI.new_NLERichTextParam(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLERichTextParam nLERichTextParam) {
        if (nLERichTextParam == null) {
            return 0L;
        }
        return nLERichTextParam.swigCPtr;
    }

    public void setOpCode(int i) {
        NLEMediaJniJNI.NLERichTextParam_opCode_set(this.swigCPtr, this, i);
    }

    public void setParam1(float f) {
        NLEMediaJniJNI.NLERichTextParam_param1_set(this.swigCPtr, this, f);
    }

    public void setParam2(float f) {
        NLEMediaJniJNI.NLERichTextParam_param2_set(this.swigCPtr, this, f);
    }

    public void setParam3(float f) {
        NLEMediaJniJNI.NLERichTextParam_param3_set(this.swigCPtr, this, f);
    }

    public void setParam4(float f) {
        NLEMediaJniJNI.NLERichTextParam_param4_set(this.swigCPtr, this, f);
    }

    public void setParam5(String str) {
        NLEMediaJniJNI.NLERichTextParam_param5_set(this.swigCPtr, this, str);
    }

    public NLERichTextParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
