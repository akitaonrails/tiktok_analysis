package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESetting extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESetting(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESetting_clone = NLEEditorJniJNI.NLESetting_clone(this.swigCPtr, this);
        if (jNLESetting_clone == 0) {
            return null;
        }
        return new NLENode(jNLESetting_clone, true);
    }

    public boolean getCartesion() {
        return NLEEditorJniJNI.NLESetting_getCartesion(this.swigCPtr, this);
    }

    public boolean getEffectSegmentUpper() {
        return NLEEditorJniJNI.NLESetting_getEffectSegmentUpper(this.swigCPtr, this);
    }

    public boolean getFreeRenderLayer() {
        return NLEEditorJniJNI.NLESetting_getFreeRenderLayer(this.swigCPtr, this);
    }

    public boolean getUseRelativeTime() {
        return NLEEditorJniJNI.NLESetting_getUseRelativeTime(this.swigCPtr, this);
    }

    public boolean hasCartesion() {
        return NLEEditorJniJNI.NLESetting_hasCartesion(this.swigCPtr, this);
    }

    public boolean hasEffectSegmentUpper() {
        return NLEEditorJniJNI.NLESetting_hasEffectSegmentUpper(this.swigCPtr, this);
    }

    public boolean hasFreeRenderLayer() {
        return NLEEditorJniJNI.NLESetting_hasFreeRenderLayer(this.swigCPtr, this);
    }

    public boolean hasUseRelativeTime() {
        return NLEEditorJniJNI.NLESetting_hasUseRelativeTime(this.swigCPtr, this);
    }

    public NLESetting() {
        this(NLEEditorJniJNI.new_NLESetting(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESetting dynamicCast(NLENode nLENode) {
        long jNLESetting_dynamicCast = NLEEditorJniJNI.NLESetting_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESetting_dynamicCast == 0) {
            return null;
        }
        return new NLESetting(jNLESetting_dynamicCast, true);
    }

    public static long getCPtr(NLESetting nLESetting) {
        if (nLESetting == null) {
            return 0L;
        }
        return nLESetting.swigCPtr;
    }

    public void setCartesion(boolean z) {
        NLEEditorJniJNI.NLESetting_setCartesion(this.swigCPtr, this, z);
    }

    public void setEffectSegmentUpper(boolean z) {
        NLEEditorJniJNI.NLESetting_setEffectSegmentUpper(this.swigCPtr, this, z);
    }

    public void setFreeRenderLayer(boolean z) {
        NLEEditorJniJNI.NLESetting_setFreeRenderLayer(this.swigCPtr, this, z);
    }

    public void setUseRelativeTime(boolean z) {
        NLEEditorJniJNI.NLESetting_setUseRelativeTime(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESetting(long j, boolean z) {
        super(NLEEditorJniJNI.NLESetting_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
