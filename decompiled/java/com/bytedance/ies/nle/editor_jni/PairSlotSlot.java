package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class PairSlotSlot {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_PairSlotSlot(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLETrackSlot getFirst() {
        long jPairSlotSlot_first_get = NLEEditorJniJNI.PairSlotSlot_first_get(this.swigCPtr, this);
        if (jPairSlotSlot_first_get == 0) {
            return null;
        }
        return new NLETrackSlot(jPairSlotSlot_first_get, true);
    }

    public NLETrackSlot getSecond() {
        long jPairSlotSlot_second_get = NLEEditorJniJNI.PairSlotSlot_second_get(this.swigCPtr, this);
        if (jPairSlotSlot_second_get == 0) {
            return null;
        }
        return new NLETrackSlot(jPairSlotSlot_second_get, true);
    }

    public PairSlotSlot() {
        this(NLEEditorJniJNI.new_PairSlotSlot__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public PairSlotSlot(PairSlotSlot pairSlotSlot) {
        this(NLEEditorJniJNI.new_PairSlotSlot__SWIG_2(getCPtr(pairSlotSlot), pairSlotSlot), true);
    }

    public static long getCPtr(PairSlotSlot pairSlotSlot) {
        if (pairSlotSlot == null) {
            return 0L;
        }
        return pairSlotSlot.swigCPtr;
    }

    public void setFirst(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.PairSlotSlot_first_set(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void setSecond(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.PairSlotSlot_second_set(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public PairSlotSlot(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        this(NLEEditorJniJNI.new_PairSlotSlot__SWIG_1(NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot, NLETrackSlot.getCPtr(nLETrackSlot2), nLETrackSlot2), true);
    }

    public PairSlotSlot(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
