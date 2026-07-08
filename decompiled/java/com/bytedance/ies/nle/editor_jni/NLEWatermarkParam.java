package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEWatermarkParam {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEWatermarkParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public long getDuration() {
        return NLEMediaJniJNI.NLEWatermarkParam_duration_get(this.swigCPtr, this);
    }

    public VecNLEWatermarkEntity getEntities() {
        long jNLEWatermarkParam_entities_get = NLEMediaJniJNI.NLEWatermarkParam_entities_get(this.swigCPtr, this);
        if (jNLEWatermarkParam_entities_get == 0) {
            return null;
        }
        return new VecNLEWatermarkEntity(jNLEWatermarkParam_entities_get, false);
    }

    public String getExtFile() {
        return NLEMediaJniJNI.NLEWatermarkParam_extFile_get(this.swigCPtr, this);
    }

    public int getHeight() {
        return NLEMediaJniJNI.NLEWatermarkParam_height_get(this.swigCPtr, this);
    }

    public VecString getImages() {
        long jNLEWatermarkParam_images_get = NLEMediaJniJNI.NLEWatermarkParam_images_get(this.swigCPtr, this);
        if (jNLEWatermarkParam_images_get == 0) {
            return null;
        }
        return new VecString(jNLEWatermarkParam_images_get, false);
    }

    public int getInterval() {
        return NLEMediaJniJNI.NLEWatermarkParam_interval_get(this.swigCPtr, this);
    }

    public NLEWatermarkMask getMask() {
        long jNLEWatermarkParam_mask_get = NLEMediaJniJNI.NLEWatermarkParam_mask_get(this.swigCPtr, this);
        if (jNLEWatermarkParam_mask_get == 0) {
            return null;
        }
        return new NLEWatermarkMask(jNLEWatermarkParam_mask_get, true);
    }

    public boolean getNeedExtFile() {
        return NLEMediaJniJNI.NLEWatermarkParam_needExtFile_get(this.swigCPtr, this);
    }

    public NLEWaterMarkPosition getPosition() {
        return NLEWaterMarkPosition.swigToEnum(NLEMediaJniJNI.NLEWatermarkParam_position_get(this.swigCPtr, this));
    }

    public int getRotation() {
        return NLEMediaJniJNI.NLEWatermarkParam_rotation_get(this.swigCPtr, this);
    }

    public VecString getSecondHalfImages() {
        long jNLEWatermarkParam_secondHalfImages_get = NLEMediaJniJNI.NLEWatermarkParam_secondHalfImages_get(this.swigCPtr, this);
        if (jNLEWatermarkParam_secondHalfImages_get == 0) {
            return null;
        }
        return new VecString(jNLEWatermarkParam_secondHalfImages_get, false);
    }

    public int getWidth() {
        return NLEMediaJniJNI.NLEWatermarkParam_width_get(this.swigCPtr, this);
    }

    public int getXOffset() {
        return NLEMediaJniJNI.NLEWatermarkParam_xOffset_get(this.swigCPtr, this);
    }

    public int getYOffset() {
        return NLEMediaJniJNI.NLEWatermarkParam_yOffset_get(this.swigCPtr, this);
    }

    public NLEWatermarkParam() {
        this(NLEMediaJniJNI.new_NLEWatermarkParam(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEWatermarkParam nLEWatermarkParam) {
        if (nLEWatermarkParam == null) {
            return 0L;
        }
        return nLEWatermarkParam.swigCPtr;
    }

    public void setDuration(long j) {
        NLEMediaJniJNI.NLEWatermarkParam_duration_set(this.swigCPtr, this, j);
    }

    public void setEntities(VecNLEWatermarkEntity vecNLEWatermarkEntity) {
        NLEMediaJniJNI.NLEWatermarkParam_entities_set(this.swigCPtr, this, VecNLEWatermarkEntity.getCPtr(vecNLEWatermarkEntity), vecNLEWatermarkEntity);
    }

    public void setExtFile(String str) {
        NLEMediaJniJNI.NLEWatermarkParam_extFile_set(this.swigCPtr, this, str);
    }

    public void setHeight(int i) {
        NLEMediaJniJNI.NLEWatermarkParam_height_set(this.swigCPtr, this, i);
    }

    public void setImages(VecString vecString) {
        NLEMediaJniJNI.NLEWatermarkParam_images_set(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void setInterval(int i) {
        NLEMediaJniJNI.NLEWatermarkParam_interval_set(this.swigCPtr, this, i);
    }

    public void setMask(NLEWatermarkMask nLEWatermarkMask) {
        NLEMediaJniJNI.NLEWatermarkParam_mask_set(this.swigCPtr, this, NLEWatermarkMask.getCPtr(nLEWatermarkMask), nLEWatermarkMask);
    }

    public void setNeedExtFile(boolean z) {
        NLEMediaJniJNI.NLEWatermarkParam_needExtFile_set(this.swigCPtr, this, z);
    }

    public void setPosition(NLEWaterMarkPosition nLEWaterMarkPosition) {
        NLEMediaJniJNI.NLEWatermarkParam_position_set(this.swigCPtr, this, nLEWaterMarkPosition.swigValue());
    }

    public void setRotation(int i) {
        NLEMediaJniJNI.NLEWatermarkParam_rotation_set(this.swigCPtr, this, i);
    }

    public void setSecondHalfImages(VecString vecString) {
        NLEMediaJniJNI.NLEWatermarkParam_secondHalfImages_set(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void setWidth(int i) {
        NLEMediaJniJNI.NLEWatermarkParam_width_set(this.swigCPtr, this, i);
    }

    public void setXOffset(int i) {
        NLEMediaJniJNI.NLEWatermarkParam_xOffset_set(this.swigCPtr, this, i);
    }

    public void setYOffset(int i) {
        NLEMediaJniJNI.NLEWatermarkParam_yOffset_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEWatermarkParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
