package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLERenderSetting extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLERenderSetting(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLERenderSetting_clone = NLEEditorJniJNI.NLERenderSetting_clone(this.swigCPtr, this);
        if (jNLERenderSetting_clone == 0) {
            return null;
        }
        return new NLENode(jNLERenderSetting_clone, true);
    }

    public int getCanvasHeight() {
        return NLEEditorJniJNI.NLERenderSetting_getCanvasHeight(this.swigCPtr, this);
    }

    public int getCanvasWidth() {
        return NLEEditorJniJNI.NLERenderSetting_getCanvasWidth(this.swigCPtr, this);
    }

    public boolean getEnableEffect() {
        return NLEEditorJniJNI.NLERenderSetting_getEnableEffect(this.swigCPtr, this);
    }

    public NLERenderImageResizeInfo getImageResizeInfo() {
        long jNLERenderSetting_getImageResizeInfo = NLEEditorJniJNI.NLERenderSetting_getImageResizeInfo(this.swigCPtr, this);
        if (jNLERenderSetting_getImageResizeInfo == 0) {
            return null;
        }
        return new NLERenderImageResizeInfo(jNLERenderSetting_getImageResizeInfo, true);
    }

    public int getMaxHeight() {
        return NLEEditorJniJNI.NLERenderSetting_getMaxHeight(this.swigCPtr, this);
    }

    public int getMaxWidth() {
        return NLEEditorJniJNI.NLERenderSetting_getMaxWidth(this.swigCPtr, this);
    }

    public long getPreviewBackgroundColor() {
        return NLEEditorJniJNI.NLERenderSetting_getPreviewBackgroundColor(this.swigCPtr, this);
    }

    public NLEPlayerPreviewMode getPreviewFillMode() {
        return NLEPlayerPreviewMode.swigToEnum(NLEEditorJniJNI.NLERenderSetting_getPreviewFillMode(this.swigCPtr, this));
    }

    public boolean hasCanvasHeight() {
        return NLEEditorJniJNI.NLERenderSetting_hasCanvasHeight(this.swigCPtr, this);
    }

    public boolean hasCanvasWidth() {
        return NLEEditorJniJNI.NLERenderSetting_hasCanvasWidth(this.swigCPtr, this);
    }

    public boolean hasEnableEffect() {
        return NLEEditorJniJNI.NLERenderSetting_hasEnableEffect(this.swigCPtr, this);
    }

    public boolean hasMaxHeight() {
        return NLEEditorJniJNI.NLERenderSetting_hasMaxHeight(this.swigCPtr, this);
    }

    public boolean hasMaxWidth() {
        return NLEEditorJniJNI.NLERenderSetting_hasMaxWidth(this.swigCPtr, this);
    }

    public boolean hasPreviewBackgroundColor() {
        return NLEEditorJniJNI.NLERenderSetting_hasPreviewBackgroundColor(this.swigCPtr, this);
    }

    public boolean hasPreviewFillMode() {
        return NLEEditorJniJNI.NLERenderSetting_hasPreviewFillMode(this.swigCPtr, this);
    }

    public NLERenderSetting() {
        this(NLEEditorJniJNI.new_NLERenderSetting(), true);
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

    public static NLERenderSetting dynamicCast(NLENode nLENode) {
        long jNLERenderSetting_dynamicCast = NLEEditorJniJNI.NLERenderSetting_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLERenderSetting_dynamicCast == 0) {
            return null;
        }
        return new NLERenderSetting(jNLERenderSetting_dynamicCast, true);
    }

    public static long getCPtr(NLERenderSetting nLERenderSetting) {
        if (nLERenderSetting == null) {
            return 0L;
        }
        return nLERenderSetting.swigCPtr;
    }

    public void setCanvasHeight(int i) {
        NLEEditorJniJNI.NLERenderSetting_setCanvasHeight(this.swigCPtr, this, i);
    }

    public void setCanvasWidth(int i) {
        NLEEditorJniJNI.NLERenderSetting_setCanvasWidth(this.swigCPtr, this, i);
    }

    public void setEnableEffect(boolean z) {
        NLEEditorJniJNI.NLERenderSetting_setEnableEffect(this.swigCPtr, this, z);
    }

    public void setImageResizeInfo(NLERenderImageResizeInfo nLERenderImageResizeInfo) {
        NLEEditorJniJNI.NLERenderSetting_setImageResizeInfo(this.swigCPtr, this, NLERenderImageResizeInfo.getCPtr(nLERenderImageResizeInfo), nLERenderImageResizeInfo);
    }

    public void setMaxHeight(int i) {
        NLEEditorJniJNI.NLERenderSetting_setMaxHeight(this.swigCPtr, this, i);
    }

    public void setMaxWidth(int i) {
        NLEEditorJniJNI.NLERenderSetting_setMaxWidth(this.swigCPtr, this, i);
    }

    public void setPreviewBackgroundColor(long j) {
        NLEEditorJniJNI.NLERenderSetting_setPreviewBackgroundColor(this.swigCPtr, this, j);
    }

    public void setPreviewFillMode(NLEPlayerPreviewMode nLEPlayerPreviewMode) {
        NLEEditorJniJNI.NLERenderSetting_setPreviewFillMode(this.swigCPtr, this, nLEPlayerPreviewMode.swigValue());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLERenderSetting(long j, boolean z) {
        super(NLEEditorJniJNI.NLERenderSetting_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
