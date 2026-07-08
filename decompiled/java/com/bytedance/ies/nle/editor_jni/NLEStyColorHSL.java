package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyColorHSL extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyColorHSL(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyColorHSL_clone = NLEEditorJniJNI.NLEStyColorHSL_clone(this.swigCPtr, this);
        if (jNLEStyColorHSL_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyColorHSL_clone, true);
    }

    public double getHue() {
        return NLEEditorJniJNI.NLEStyColorHSL_getHue(this.swigCPtr, this);
    }

    public double getLightness() {
        return NLEEditorJniJNI.NLEStyColorHSL_getLightness(this.swigCPtr, this);
    }

    public double getSaturation() {
        return NLEEditorJniJNI.NLEStyColorHSL_getSaturation(this.swigCPtr, this);
    }

    public boolean hasHue() {
        return NLEEditorJniJNI.NLEStyColorHSL_hasHue(this.swigCPtr, this);
    }

    public boolean hasLightness() {
        return NLEEditorJniJNI.NLEStyColorHSL_hasLightness(this.swigCPtr, this);
    }

    public boolean hasSaturation() {
        return NLEEditorJniJNI.NLEStyColorHSL_hasSaturation(this.swigCPtr, this);
    }

    public NLEStyColorHSL() {
        this(NLEEditorJniJNI.new_NLEStyColorHSL(), true);
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

    public static NLEStyColorHSL dynamicCast(NLENode nLENode) {
        long jNLEStyColorHSL_dynamicCast = NLEEditorJniJNI.NLEStyColorHSL_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyColorHSL_dynamicCast == 0) {
            return null;
        }
        return new NLEStyColorHSL(jNLEStyColorHSL_dynamicCast, true);
    }

    public static long getCPtr(NLEStyColorHSL nLEStyColorHSL) {
        if (nLEStyColorHSL == null) {
            return 0L;
        }
        return nLEStyColorHSL.swigCPtr;
    }

    public void setHue(double d) {
        NLEEditorJniJNI.NLEStyColorHSL_setHue(this.swigCPtr, this, d);
    }

    public void setLightness(double d) {
        NLEEditorJniJNI.NLEStyColorHSL_setLightness(this.swigCPtr, this, d);
    }

    public void setSaturation(double d) {
        NLEEditorJniJNI.NLEStyColorHSL_setSaturation(this.swigCPtr, this, d);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyColorHSL(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyColorHSL_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
