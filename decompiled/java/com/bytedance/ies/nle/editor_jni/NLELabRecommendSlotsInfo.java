package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLELabRecommendSlotsInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_NLELabRecommendSlotsInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getLabVersion() {
        return NLETemplateJNI.NLELabRecommendSlotsInfo_labVersion_get(this.swigCPtr, this);
    }

    public int getSlotCount() {
        return NLETemplateJNI.NLELabRecommendSlotsInfo_slotCount_get(this.swigCPtr, this);
    }

    public VecLongLong getSlotRecommendDurations() {
        long jNLELabRecommendSlotsInfo_slotRecommendDurations_get = NLETemplateJNI.NLELabRecommendSlotsInfo_slotRecommendDurations_get(this.swigCPtr, this);
        if (jNLELabRecommendSlotsInfo_slotRecommendDurations_get == 0) {
            return null;
        }
        return new VecLongLong(jNLELabRecommendSlotsInfo_slotRecommendDurations_get, false);
    }

    public NLELabRecommendSlotsInfo() {
        this(NLETemplateJNI.new_NLELabRecommendSlotsInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo) {
        if (nLELabRecommendSlotsInfo == null) {
            return 0L;
        }
        return nLELabRecommendSlotsInfo.swigCPtr;
    }

    public void setLabVersion(String str) {
        NLETemplateJNI.NLELabRecommendSlotsInfo_labVersion_set(this.swigCPtr, this, str);
    }

    public void setSlotCount(int i) {
        NLETemplateJNI.NLELabRecommendSlotsInfo_slotCount_set(this.swigCPtr, this, i);
    }

    public void setSlotRecommendDurations(VecLongLong vecLongLong) {
        NLETemplateJNI.NLELabRecommendSlotsInfo_slotRecommendDurations_set(this.swigCPtr, this, VecLongLong.getCPtr(vecLongLong), vecLongLong);
    }

    public NLELabRecommendSlotsInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
