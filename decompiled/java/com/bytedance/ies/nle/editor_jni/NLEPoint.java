package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEPoint extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEPoint(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEPoint_clone = NLEEditorJniJNI.NLEPoint_clone(this.swigCPtr, this);
        if (jNLEPoint_clone == 0) {
            return null;
        }
        return new NLENode(jNLEPoint_clone, true);
    }

    public float getX() {
        return NLEEditorJniJNI.NLEPoint_getX(this.swigCPtr, this);
    }

    public float getY() {
        return NLEEditorJniJNI.NLEPoint_getY(this.swigCPtr, this);
    }

    public boolean hasX() {
        return NLEEditorJniJNI.NLEPoint_hasX(this.swigCPtr, this);
    }

    public boolean hasY() {
        return NLEEditorJniJNI.NLEPoint_hasY(this.swigCPtr, this);
    }

    public NLEPoint() {
        this(NLEEditorJniJNI.new_NLEPoint(), true);
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

    public static NLEPoint dynamicCast(NLENode nLENode) {
        long jNLEPoint_dynamicCast = NLEEditorJniJNI.NLEPoint_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEPoint_dynamicCast == 0) {
            return null;
        }
        return new NLEPoint(jNLEPoint_dynamicCast, true);
    }

    public static long getCPtr(NLEPoint nLEPoint) {
        if (nLEPoint == null) {
            return 0L;
        }
        return nLEPoint.swigCPtr;
    }

    public void setX(float f) {
        NLEEditorJniJNI.NLEPoint_setX(this.swigCPtr, this, f);
    }

    public void setY(float f) {
        NLEEditorJniJNI.NLEPoint_setY(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEPoint(long j, boolean z) {
        super(NLEEditorJniJNI.NLEPoint_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
