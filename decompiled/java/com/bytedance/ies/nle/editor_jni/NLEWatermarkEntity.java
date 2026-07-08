package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEWatermarkEntity {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEWatermarkEntity(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getHeight() {
        return NLEMediaJniJNI.NLEWatermarkEntity_height_get(this.swigCPtr, this);
    }

    public VecString getImages() {
        long jNLEWatermarkEntity_images_get = NLEMediaJniJNI.NLEWatermarkEntity_images_get(this.swigCPtr, this);
        if (jNLEWatermarkEntity_images_get == 0) {
            return null;
        }
        return new VecString(jNLEWatermarkEntity_images_get, false);
    }

    public int getInterval() {
        return NLEMediaJniJNI.NLEWatermarkEntity_interval_get(this.swigCPtr, this);
    }

    public NLEWaterMarkPosition getPosition() {
        return NLEWaterMarkPosition.swigToEnum(NLEMediaJniJNI.NLEWatermarkEntity_position_get(this.swigCPtr, this));
    }

    public int getRotation() {
        return NLEMediaJniJNI.NLEWatermarkEntity_rotation_get(this.swigCPtr, this);
    }

    public long getSequenceIn() {
        return NLEMediaJniJNI.NLEWatermarkEntity_sequenceIn_get(this.swigCPtr, this);
    }

    public long getSequenceOut() {
        return NLEMediaJniJNI.NLEWatermarkEntity_sequenceOut_get(this.swigCPtr, this);
    }

    public int getWidth() {
        return NLEMediaJniJNI.NLEWatermarkEntity_width_get(this.swigCPtr, this);
    }

    public int getXOffset() {
        return NLEMediaJniJNI.NLEWatermarkEntity_xOffset_get(this.swigCPtr, this);
    }

    public int getYOffset() {
        return NLEMediaJniJNI.NLEWatermarkEntity_yOffset_get(this.swigCPtr, this);
    }

    public NLEWatermarkEntity() {
        this(NLEMediaJniJNI.new_NLEWatermarkEntity(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEWatermarkEntity nLEWatermarkEntity) {
        if (nLEWatermarkEntity == null) {
            return 0L;
        }
        return nLEWatermarkEntity.swigCPtr;
    }

    public void setHeight(int i) {
        NLEMediaJniJNI.NLEWatermarkEntity_height_set(this.swigCPtr, this, i);
    }

    public void setImages(VecString vecString) {
        NLEMediaJniJNI.NLEWatermarkEntity_images_set(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void setInterval(int i) {
        NLEMediaJniJNI.NLEWatermarkEntity_interval_set(this.swigCPtr, this, i);
    }

    public void setPosition(NLEWaterMarkPosition nLEWaterMarkPosition) {
        NLEMediaJniJNI.NLEWatermarkEntity_position_set(this.swigCPtr, this, nLEWaterMarkPosition.swigValue());
    }

    public void setRotation(int i) {
        NLEMediaJniJNI.NLEWatermarkEntity_rotation_set(this.swigCPtr, this, i);
    }

    public void setSequenceIn(long j) {
        NLEMediaJniJNI.NLEWatermarkEntity_sequenceIn_set(this.swigCPtr, this, j);
    }

    public void setSequenceOut(long j) {
        NLEMediaJniJNI.NLEWatermarkEntity_sequenceOut_set(this.swigCPtr, this, j);
    }

    public void setWidth(int i) {
        NLEMediaJniJNI.NLEWatermarkEntity_width_set(this.swigCPtr, this, i);
    }

    public void setXOffset(int i) {
        NLEMediaJniJNI.NLEWatermarkEntity_xOffset_set(this.swigCPtr, this, i);
    }

    public void setYOffset(int i) {
        NLEMediaJniJNI.NLEWatermarkEntity_yOffset_set(this.swigCPtr, this, i);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEWatermarkEntity(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
