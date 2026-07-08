package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyCrop extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyCrop(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyCrop_clone = NLEEditorJniJNI.NLEStyCrop_clone(this.swigCPtr, this);
        if (jNLEStyCrop_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyCrop_clone, true);
    }

    public float getXLeft() {
        return NLEEditorJniJNI.NLEStyCrop_getXLeft(this.swigCPtr, this);
    }

    public float getXLeftLower() {
        return NLEEditorJniJNI.NLEStyCrop_getXLeftLower(this.swigCPtr, this);
    }

    public float getXLeftUpper() {
        return NLEEditorJniJNI.NLEStyCrop_getXLeftUpper(this.swigCPtr, this);
    }

    public float getXRight() {
        return NLEEditorJniJNI.NLEStyCrop_getXRight(this.swigCPtr, this);
    }

    public float getXRightLower() {
        return NLEEditorJniJNI.NLEStyCrop_getXRightLower(this.swigCPtr, this);
    }

    public float getXRightUpper() {
        return NLEEditorJniJNI.NLEStyCrop_getXRightUpper(this.swigCPtr, this);
    }

    public float getYLeftLower() {
        return NLEEditorJniJNI.NLEStyCrop_getYLeftLower(this.swigCPtr, this);
    }

    public float getYLeftUpper() {
        return NLEEditorJniJNI.NLEStyCrop_getYLeftUpper(this.swigCPtr, this);
    }

    public float getYLower() {
        return NLEEditorJniJNI.NLEStyCrop_getYLower(this.swigCPtr, this);
    }

    public float getYRightLower() {
        return NLEEditorJniJNI.NLEStyCrop_getYRightLower(this.swigCPtr, this);
    }

    public float getYRightUpper() {
        return NLEEditorJniJNI.NLEStyCrop_getYRightUpper(this.swigCPtr, this);
    }

    public float getYUpper() {
        return NLEEditorJniJNI.NLEStyCrop_getYUpper(this.swigCPtr, this);
    }

    public boolean hasXLeft() {
        return NLEEditorJniJNI.NLEStyCrop_hasXLeft(this.swigCPtr, this);
    }

    public boolean hasXLeftLower() {
        return NLEEditorJniJNI.NLEStyCrop_hasXLeftLower(this.swigCPtr, this);
    }

    public boolean hasXRight() {
        return NLEEditorJniJNI.NLEStyCrop_hasXRight(this.swigCPtr, this);
    }

    public boolean hasXRightUpper() {
        return NLEEditorJniJNI.NLEStyCrop_hasXRightUpper(this.swigCPtr, this);
    }

    public boolean hasYLeftLower() {
        return NLEEditorJniJNI.NLEStyCrop_hasYLeftLower(this.swigCPtr, this);
    }

    public boolean hasYLower() {
        return NLEEditorJniJNI.NLEStyCrop_hasYLower(this.swigCPtr, this);
    }

    public boolean hasYRightUpper() {
        return NLEEditorJniJNI.NLEStyCrop_hasYRightUpper(this.swigCPtr, this);
    }

    public boolean hasYUpper() {
        return NLEEditorJniJNI.NLEStyCrop_hasYUpper(this.swigCPtr, this);
    }

    public NLEStyCrop() {
        this(NLEEditorJniJNI.new_NLEStyCrop(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEStyCrop dynamicCast(NLENode nLENode) {
        long jNLEStyCrop_dynamicCast = NLEEditorJniJNI.NLEStyCrop_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyCrop_dynamicCast == 0) {
            return null;
        }
        return new NLEStyCrop(jNLEStyCrop_dynamicCast, true);
    }

    public static long getCPtr(NLEStyCrop nLEStyCrop) {
        if (nLEStyCrop == null) {
            return 0L;
        }
        return nLEStyCrop.swigCPtr;
    }

    public void setXLeft(float f) {
        NLEEditorJniJNI.NLEStyCrop_setXLeft(this.swigCPtr, this, f);
    }

    public void setXLeftLower(float f) {
        NLEEditorJniJNI.NLEStyCrop_setXLeftLower(this.swigCPtr, this, f);
    }

    public void setXLeftUpper(float f) {
        NLEEditorJniJNI.NLEStyCrop_setXLeftUpper(this.swigCPtr, this, f);
    }

    public void setXRight(float f) {
        NLEEditorJniJNI.NLEStyCrop_setXRight(this.swigCPtr, this, f);
    }

    public void setXRightLower(float f) {
        NLEEditorJniJNI.NLEStyCrop_setXRightLower(this.swigCPtr, this, f);
    }

    public void setXRightUpper(float f) {
        NLEEditorJniJNI.NLEStyCrop_setXRightUpper(this.swigCPtr, this, f);
    }

    public void setYLeftLower(float f) {
        NLEEditorJniJNI.NLEStyCrop_setYLeftLower(this.swigCPtr, this, f);
    }

    public void setYLeftUpper(float f) {
        NLEEditorJniJNI.NLEStyCrop_setYLeftUpper(this.swigCPtr, this, f);
    }

    public void setYLower(float f) {
        NLEEditorJniJNI.NLEStyCrop_setYLower(this.swigCPtr, this, f);
    }

    public void setYRightLower(float f) {
        NLEEditorJniJNI.NLEStyCrop_setYRightLower(this.swigCPtr, this, f);
    }

    public void setYRightUpper(float f) {
        NLEEditorJniJNI.NLEStyCrop_setYRightUpper(this.swigCPtr, this, f);
    }

    public void setYUpper(float f) {
        NLEEditorJniJNI.NLEStyCrop_setYUpper(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyCrop(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyCrop_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
