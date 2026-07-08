package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentBrushSticker extends NLESegmentSticker {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentBrushSticker(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentBrushSticker_clone = NLEEditorJniJNI.NLESegmentBrushSticker_clone(this.swigCPtr, this);
        if (jNLESegmentBrushSticker_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentBrushSticker_clone, true);
    }

    public String getBrushCachePath() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_getBrushCachePath(this.swigCPtr, this);
    }

    public String getBrushInitParam() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_getBrushInitParam(this.swigCPtr, this);
    }

    public int getBrushMultiUndo() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_getBrushMultiUndo(this.swigCPtr, this);
    }

    public NLEBrushOption getBrushOption() {
        return NLEBrushOption.swigToEnum(NLEEditorJniJNI.NLESegmentBrushSticker_getBrushOption(this.swigCPtr, this));
    }

    public String getBrushParam() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_getBrushParam(this.swigCPtr, this);
    }

    public String getBrushPath() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_getBrushPath(this.swigCPtr, this);
    }

    public NLEPoint getBrushTouchPoint() {
        long jNLESegmentBrushSticker_getBrushTouchPoint = NLEEditorJniJNI.NLESegmentBrushSticker_getBrushTouchPoint(this.swigCPtr, this);
        if (jNLESegmentBrushSticker_getBrushTouchPoint == 0) {
            return null;
        }
        return new NLEPoint(jNLESegmentBrushSticker_getBrushTouchPoint, true);
    }

    public int getBrushUndoCount() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_getBrushUndoCount(this.swigCPtr, this);
    }

    public NLEBrushStickerUpdateMode getUpdateMode() {
        return NLEBrushStickerUpdateMode.swigToEnum(NLEEditorJniJNI.NLESegmentBrushSticker_getUpdateMode(this.swigCPtr, this));
    }

    public boolean hasBrushCachePath() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_hasBrushCachePath(this.swigCPtr, this);
    }

    public boolean hasBrushInitParam() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_hasBrushInitParam(this.swigCPtr, this);
    }

    public boolean hasBrushMultiUndo() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_hasBrushMultiUndo(this.swigCPtr, this);
    }

    public boolean hasBrushOption() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_hasBrushOption(this.swigCPtr, this);
    }

    public boolean hasBrushParam() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_hasBrushParam(this.swigCPtr, this);
    }

    public boolean hasBrushPath() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_hasBrushPath(this.swigCPtr, this);
    }

    public boolean hasBrushUndoCount() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_hasBrushUndoCount(this.swigCPtr, this);
    }

    public boolean hasUpdateMode() {
        return NLEEditorJniJNI.NLESegmentBrushSticker_hasUpdateMode(this.swigCPtr, this);
    }

    public NLESegmentBrushSticker() {
        this(NLEEditorJniJNI.new_NLESegmentBrushSticker(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentBrushSticker dynamicCast(NLENode nLENode) {
        long jNLESegmentBrushSticker_dynamicCast = NLEEditorJniJNI.NLESegmentBrushSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentBrushSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentBrushSticker(jNLESegmentBrushSticker_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentBrushSticker nLESegmentBrushSticker) {
        if (nLESegmentBrushSticker == null) {
            return 0L;
        }
        return nLESegmentBrushSticker.swigCPtr;
    }

    public void setBrushCachePath(String str) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setBrushCachePath(this.swigCPtr, this, str);
    }

    public void setBrushInitParam(String str) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setBrushInitParam(this.swigCPtr, this, str);
    }

    public void setBrushMultiUndo(int i) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setBrushMultiUndo(this.swigCPtr, this, i);
    }

    public void setBrushOption(NLEBrushOption nLEBrushOption) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setBrushOption(this.swigCPtr, this, nLEBrushOption.swigValue());
    }

    public void setBrushParam(String str) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setBrushParam(this.swigCPtr, this, str);
    }

    public void setBrushPath(String str) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setBrushPath(this.swigCPtr, this, str);
    }

    public void setBrushTouchPoint(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setBrushTouchPoint(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void setBrushUndoCount(int i) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setBrushUndoCount(this.swigCPtr, this, i);
    }

    public void setUpdateMode(NLEBrushStickerUpdateMode nLEBrushStickerUpdateMode) {
        NLEEditorJniJNI.NLESegmentBrushSticker_setUpdateMode(this.swigCPtr, this, nLEBrushStickerUpdateMode.swigValue());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentBrushSticker(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentBrushSticker_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
