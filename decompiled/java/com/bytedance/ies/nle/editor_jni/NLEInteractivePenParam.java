package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEInteractivePenParam extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEInteractivePenParam(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEInteractivePenParam_clone = NLEEditorJniJNI.NLEInteractivePenParam_clone(this.swigCPtr, this);
        if (jNLEInteractivePenParam_clone == 0) {
            return null;
        }
        return new NLENode(jNLEInteractivePenParam_clone, true);
    }

    public VecFloat getBrushData() {
        return new VecFloat(NLEEditorJniJNI.NLEInteractivePenParam_getBrushData(this.swigCPtr, this), true);
    }

    public int getPenType() {
        return NLEEditorJniJNI.NLEInteractivePenParam_getPenType(this.swigCPtr, this);
    }

    public float getThickness() {
        return NLEEditorJniJNI.NLEInteractivePenParam_getThickness(this.swigCPtr, this);
    }

    public boolean hasBrushData() {
        return NLEEditorJniJNI.NLEInteractivePenParam_hasBrushData(this.swigCPtr, this);
    }

    public boolean hasPenType() {
        return NLEEditorJniJNI.NLEInteractivePenParam_hasPenType(this.swigCPtr, this);
    }

    public boolean hasThickness() {
        return NLEEditorJniJNI.NLEInteractivePenParam_hasThickness(this.swigCPtr, this);
    }

    public NLEInteractivePenParam() {
        this(NLEEditorJniJNI.new_NLEInteractivePenParam(), true);
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

    public static NLEInteractivePenParam dynamicCast(NLENode nLENode) {
        long jNLEInteractivePenParam_dynamicCast = NLEEditorJniJNI.NLEInteractivePenParam_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEInteractivePenParam_dynamicCast == 0) {
            return null;
        }
        return new NLEInteractivePenParam(jNLEInteractivePenParam_dynamicCast, true);
    }

    public static long getCPtr(NLEInteractivePenParam nLEInteractivePenParam) {
        if (nLEInteractivePenParam == null) {
            return 0L;
        }
        return nLEInteractivePenParam.swigCPtr;
    }

    public void setBrushData(VecFloat vecFloat) {
        NLEEditorJniJNI.NLEInteractivePenParam_setBrushData(this.swigCPtr, this, VecFloat.getCPtr(vecFloat), vecFloat);
    }

    public void setPenType(int i) {
        NLEEditorJniJNI.NLEInteractivePenParam_setPenType(this.swigCPtr, this, i);
    }

    public void setThickness(float f) {
        NLEEditorJniJNI.NLEInteractivePenParam_setThickness(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEInteractivePenParam(long j, boolean z) {
        super(NLEEditorJniJNI.NLEInteractivePenParam_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
