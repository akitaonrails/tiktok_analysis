package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class TemplateConfig extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLETemplateJNI.delete_TemplateConfig(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jTemplateConfig_clone = NLETemplateJNI.TemplateConfig_clone(this.swigCPtr, this);
        if (jTemplateConfig_clone == 0) {
            return null;
        }
        return new NLENode(jTemplateConfig_clone, true);
    }

    public String getCanvasRatio() {
        return NLETemplateJNI.TemplateConfig_getCanvasRatio(this.swigCPtr, this);
    }

    public boolean hasCanvasRatio() {
        return NLETemplateJNI.TemplateConfig_hasCanvasRatio(this.swigCPtr, this);
    }

    public TemplateConfig() {
        this(NLETemplateJNI.new_TemplateConfig(), true);
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

    public static TemplateConfig dynamicCast(NLENode nLENode) {
        long jTemplateConfig_dynamicCast = NLETemplateJNI.TemplateConfig_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jTemplateConfig_dynamicCast == 0) {
            return null;
        }
        return new TemplateConfig(jTemplateConfig_dynamicCast, true);
    }

    public static long getCPtr(TemplateConfig templateConfig) {
        if (templateConfig == null) {
            return 0L;
        }
        return templateConfig.swigCPtr;
    }

    public void setCanvasRatio(String str) {
        NLETemplateJNI.TemplateConfig_setCanvasRatio(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public TemplateConfig(long j, boolean z) {
        super(NLETemplateJNI.TemplateConfig_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
