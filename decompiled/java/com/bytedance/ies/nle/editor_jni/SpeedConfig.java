package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes35.dex */
public class SpeedConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_SpeedConfig(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getMode() {
        return NLEMediaPublicJniJNI.SpeedConfig_mode_get(this.swigCPtr, this);
    }

    public VecNLEPointSPtr getPoints() {
        long jSpeedConfig_points_get = NLEMediaPublicJniJNI.SpeedConfig_points_get(this.swigCPtr, this);
        if (jSpeedConfig_points_get == 0) {
            return null;
        }
        return new VecNLEPointSPtr(jSpeedConfig_points_get, false);
    }

    public long getRepeat_duration() {
        return NLEMediaPublicJniJNI.SpeedConfig_repeat_duration_get(this.swigCPtr, this);
    }

    public SpeedConfig() {
        this(NLEMediaPublicJniJNI.new_SpeedConfig(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(SpeedConfig speedConfig) {
        if (speedConfig == null) {
            return 0L;
        }
        return speedConfig.swigCPtr;
    }

    public void setMode(int i) {
        NLEMediaPublicJniJNI.SpeedConfig_mode_set(this.swigCPtr, this, i);
    }

    public void setPoints(VecNLEPointSPtr vecNLEPointSPtr) {
        NLEMediaPublicJniJNI.SpeedConfig_points_set(this.swigCPtr, this, VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr);
    }

    public void setRepeat_duration(long j) {
        NLEMediaPublicJniJNI.SpeedConfig_repeat_duration_set(this.swigCPtr, this, j);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public SpeedConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
