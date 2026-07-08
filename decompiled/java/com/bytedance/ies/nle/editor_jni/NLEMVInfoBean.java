package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEMVInfoBean {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEMVInfoBean(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getFps() {
        return NLEMediaJniJNI.NLEMVInfoBean_fps_get(this.swigCPtr, this);
    }

    public int getHeight() {
        return NLEMediaJniJNI.NLEMVInfoBean_height_get(this.swigCPtr, this);
    }

    public VecNLEMVResourceBean getResources() {
        long jNLEMVInfoBean_resources_get = NLEMediaJniJNI.NLEMVInfoBean_resources_get(this.swigCPtr, this);
        if (jNLEMVInfoBean_resources_get == 0) {
            return null;
        }
        return new VecNLEMVResourceBean(jNLEMVInfoBean_resources_get, false);
    }

    public int getWidth() {
        return NLEMediaJniJNI.NLEMVInfoBean_width_get(this.swigCPtr, this);
    }

    public NLEMVInfoBean() {
        this(NLEMediaJniJNI.new_NLEMVInfoBean(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMVInfoBean nLEMVInfoBean) {
        if (nLEMVInfoBean == null) {
            return 0L;
        }
        return nLEMVInfoBean.swigCPtr;
    }

    public void setFps(int i) {
        NLEMediaJniJNI.NLEMVInfoBean_fps_set(this.swigCPtr, this, i);
    }

    public void setHeight(int i) {
        NLEMediaJniJNI.NLEMVInfoBean_height_set(this.swigCPtr, this, i);
    }

    public void setResources(VecNLEMVResourceBean vecNLEMVResourceBean) {
        NLEMediaJniJNI.NLEMVInfoBean_resources_set(this.swigCPtr, this, VecNLEMVResourceBean.getCPtr(vecNLEMVResourceBean), vecNLEMVResourceBean);
    }

    public void setWidth(int i) {
        NLEMediaJniJNI.NLEMVInfoBean_width_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEMVInfoBean(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
