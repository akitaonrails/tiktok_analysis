package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyColor extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyColor(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyColor_clone = NLEEditorJniJNI.NLEStyColor_clone(this.swigCPtr, this);
        if (jNLEStyColor_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyColor_clone, true);
    }

    public NLEStyColorHSL getHSL() {
        long jNLEStyColor_getHSL = NLEEditorJniJNI.NLEStyColor_getHSL(this.swigCPtr, this);
        if (jNLEStyColor_getHSL == 0) {
            return null;
        }
        return new NLEStyColorHSL(jNLEStyColor_getHSL, true);
    }

    public NLEStyColorRGB getRGB() {
        long jNLEStyColor_getRGB = NLEEditorJniJNI.NLEStyColor_getRGB(this.swigCPtr, this);
        if (jNLEStyColor_getRGB == 0) {
            return null;
        }
        return new NLEStyColorRGB(jNLEStyColor_getRGB, true);
    }

    public NLEStyColor() {
        this(NLEEditorJniJNI.new_NLEStyColor(), true);
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

    public static NLEStyColor dynamicCast(NLENode nLENode) {
        long jNLEStyColor_dynamicCast = NLEEditorJniJNI.NLEStyColor_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyColor_dynamicCast == 0) {
            return null;
        }
        return new NLEStyColor(jNLEStyColor_dynamicCast, true);
    }

    public static long getCPtr(NLEStyColor nLEStyColor) {
        if (nLEStyColor == null) {
            return 0L;
        }
        return nLEStyColor.swigCPtr;
    }

    public static double getStandardValue(double d) {
        return NLEEditorJniJNI.NLEStyColor_getStandardValue__SWIG_2(d);
    }

    public void setHSL(NLEStyColorHSL nLEStyColorHSL) {
        NLEEditorJniJNI.NLEStyColor_setHSL(this.swigCPtr, this, NLEStyColorHSL.getCPtr(nLEStyColorHSL), nLEStyColorHSL);
    }

    public void setRGB(NLEStyColorRGB nLEStyColorRGB) {
        NLEEditorJniJNI.NLEStyColor_setRGB(this.swigCPtr, this, NLEStyColorRGB.getCPtr(nLEStyColorRGB), nLEStyColorRGB);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyColor(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyColor_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static double getStandardValue(double d, double d2) {
        return NLEEditorJniJNI.NLEStyColor_getStandardValue__SWIG_1(d, d2);
    }

    public static double getStandardValue(double d, double d2, double d3) {
        return NLEEditorJniJNI.NLEStyColor_getStandardValue__SWIG_0(d, d2, d3);
    }
}
