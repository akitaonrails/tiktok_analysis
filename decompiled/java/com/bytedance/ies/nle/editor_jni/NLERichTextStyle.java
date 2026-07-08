package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLERichTextStyle extends NLEStyText {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEStyText, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLERichTextStyle(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEStyText, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLERichTextStyle_clone = NLEEditorJniJNI.NLERichTextStyle_clone(this.swigCPtr, this);
        if (jNLERichTextStyle_clone == 0) {
            return null;
        }
        return new NLENode(jNLERichTextStyle_clone, true);
    }

    public boolean getAutoAdaptCanvas() {
        return NLEEditorJniJNI.NLERichTextStyle_getAutoAdaptCanvas(this.swigCPtr, this);
    }

    public boolean getAutoAdaptDpi() {
        return NLEEditorJniJNI.NLERichTextStyle_getAutoAdaptDpi(this.swigCPtr, this);
    }

    public NLEPoint getCanvasWHFixedRatio() {
        long jNLERichTextStyle_getCanvasWHFixedRatio = NLEEditorJniJNI.NLERichTextStyle_getCanvasWHFixedRatio(this.swigCPtr, this);
        if (jNLERichTextStyle_getCanvasWHFixedRatio == 0) {
            return null;
        }
        return new NLEPoint(jNLERichTextStyle_getCanvasWHFixedRatio, true);
    }

    public boolean getFixedFontSize() {
        return NLEEditorJniJNI.NLERichTextStyle_getFixedFontSize(this.swigCPtr, this);
    }

    public NLERichTextStyle() {
        this(NLEEditorJniJNI.new_NLERichTextStyle(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEStyText, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEStyText, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLERichTextStyle dynamicCast(NLENode nLENode) {
        long jNLERichTextStyle_dynamicCast = NLEEditorJniJNI.NLERichTextStyle_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLERichTextStyle_dynamicCast == 0) {
            return null;
        }
        return new NLERichTextStyle(jNLERichTextStyle_dynamicCast, true);
    }

    public static long getCPtr(NLERichTextStyle nLERichTextStyle) {
        if (nLERichTextStyle == null) {
            return 0L;
        }
        return nLERichTextStyle.swigCPtr;
    }

    public void setAutoAdaptCanvas(boolean z) {
        NLEEditorJniJNI.NLERichTextStyle_setAutoAdaptCanvas(this.swigCPtr, this, z);
    }

    public void setAutoAdaptDpi(boolean z) {
        NLEEditorJniJNI.NLERichTextStyle_setAutoAdaptDpi(this.swigCPtr, this, z);
    }

    public void setCanvasWHFixedRatio(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLERichTextStyle_setCanvasWHFixedRatio(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void setFixedFontSize(boolean z) {
        NLEEditorJniJNI.NLERichTextStyle_setFixedFontSize(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEStyText, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLERichTextStyle(long j, boolean z) {
        super(NLEEditorJniJNI.NLERichTextStyle_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
