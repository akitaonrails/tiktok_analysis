package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyColorRGB extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyColorRGB(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyColorRGB_clone = NLEEditorJniJNI.NLEStyColorRGB_clone(this.swigCPtr, this);
        if (jNLEStyColorRGB_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyColorRGB_clone, true);
    }

    public double getBlue() {
        return NLEEditorJniJNI.NLEStyColorRGB_getBlue(this.swigCPtr, this);
    }

    public double getGreen() {
        return NLEEditorJniJNI.NLEStyColorRGB_getGreen(this.swigCPtr, this);
    }

    public double getRed() {
        return NLEEditorJniJNI.NLEStyColorRGB_getRed(this.swigCPtr, this);
    }

    public boolean hasBlue() {
        return NLEEditorJniJNI.NLEStyColorRGB_hasBlue(this.swigCPtr, this);
    }

    public boolean hasGreen() {
        return NLEEditorJniJNI.NLEStyColorRGB_hasGreen(this.swigCPtr, this);
    }

    public boolean hasRed() {
        return NLEEditorJniJNI.NLEStyColorRGB_hasRed(this.swigCPtr, this);
    }

    public NLEStyColorRGB() {
        this(NLEEditorJniJNI.new_NLEStyColorRGB(), true);
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

    public static NLEStyColorRGB dynamicCast(NLENode nLENode) {
        long jNLEStyColorRGB_dynamicCast = NLEEditorJniJNI.NLEStyColorRGB_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyColorRGB_dynamicCast == 0) {
            return null;
        }
        return new NLEStyColorRGB(jNLEStyColorRGB_dynamicCast, true);
    }

    public static long getCPtr(NLEStyColorRGB nLEStyColorRGB) {
        if (nLEStyColorRGB == null) {
            return 0L;
        }
        return nLEStyColorRGB.swigCPtr;
    }

    public void setBlue(double d) {
        NLEEditorJniJNI.NLEStyColorRGB_setBlue(this.swigCPtr, this, d);
    }

    public void setGreen(double d) {
        NLEEditorJniJNI.NLEStyColorRGB_setGreen(this.swigCPtr, this, d);
    }

    public void setRed(double d) {
        NLEEditorJniJNI.NLEStyColorRGB_setRed(this.swigCPtr, this, d);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyColorRGB(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyColorRGB_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
