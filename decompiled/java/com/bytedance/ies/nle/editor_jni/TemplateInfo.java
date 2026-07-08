package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class TemplateInfo extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLETemplateJNI.delete_TemplateInfo(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearMutableItems() {
        NLETemplateJNI.TemplateInfo_clearMutableItems(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jTemplateInfo_clone = NLETemplateJNI.TemplateInfo_clone(this.swigCPtr, this);
        if (jTemplateInfo_clone == 0) {
            return null;
        }
        return new NLENode(jTemplateInfo_clone, true);
    }

    public String getCompressJSON() {
        return NLETemplateJNI.TemplateInfo_getCompressJSON(this.swigCPtr, this);
    }

    public TemplateConfig getConfig() {
        long jTemplateInfo_getConfig = NLETemplateJNI.TemplateInfo_getConfig(this.swigCPtr, this);
        if (jTemplateInfo_getConfig == 0) {
            return null;
        }
        return new TemplateConfig(jTemplateInfo_getConfig, true);
    }

    public NLEVideoFrameModel getCoverModel() {
        long jTemplateInfo_getCoverModel = NLETemplateJNI.TemplateInfo_getCoverModel(this.swigCPtr, this);
        if (jTemplateInfo_getCoverModel == 0) {
            return null;
        }
        return new NLEVideoFrameModel(jTemplateInfo_getCoverModel, true);
    }

    public NLEResourceNode getCoverRes() {
        long jTemplateInfo_getCoverRes = NLETemplateJNI.TemplateInfo_getCoverRes(this.swigCPtr, this);
        if (jTemplateInfo_getCoverRes == 0) {
            return null;
        }
        return new NLEResourceNode(jTemplateInfo_getCoverRes, true);
    }

    public String getDesc() {
        return NLETemplateJNI.TemplateInfo_getDesc(this.swigCPtr, this);
    }

    public VecNLEMappingNode getMutableItemss() {
        return new VecNLEMappingNode(NLETemplateJNI.TemplateInfo_getMutableItemss(this.swigCPtr, this), true);
    }

    public long getOriginalJSONSize() {
        return NLETemplateJNI.TemplateInfo_getOriginalJSONSize(this.swigCPtr, this);
    }

    public String getParentTemplateId() {
        return NLETemplateJNI.TemplateInfo_getParentTemplateId(this.swigCPtr, this);
    }

    public String getPlatform() {
        return NLETemplateJNI.TemplateInfo_getPlatform(this.swigCPtr, this);
    }

    public String getTag() {
        return NLETemplateJNI.TemplateInfo_getTag(this.swigCPtr, this);
    }

    public String getTemplateId() {
        return NLETemplateJNI.TemplateInfo_getTemplateId(this.swigCPtr, this);
    }

    public String getTitle() {
        return NLETemplateJNI.TemplateInfo_getTitle(this.swigCPtr, this);
    }

    public boolean hasCompressJSON() {
        return NLETemplateJNI.TemplateInfo_hasCompressJSON(this.swigCPtr, this);
    }

    public boolean hasDesc() {
        return NLETemplateJNI.TemplateInfo_hasDesc(this.swigCPtr, this);
    }

    public boolean hasOriginalJSONSize() {
        return NLETemplateJNI.TemplateInfo_hasOriginalJSONSize(this.swigCPtr, this);
    }

    public boolean hasParentTemplateId() {
        return NLETemplateJNI.TemplateInfo_hasParentTemplateId(this.swigCPtr, this);
    }

    public boolean hasPlatform() {
        return NLETemplateJNI.TemplateInfo_hasPlatform(this.swigCPtr, this);
    }

    public boolean hasTag() {
        return NLETemplateJNI.TemplateInfo_hasTag(this.swigCPtr, this);
    }

    public boolean hasTemplateId() {
        return NLETemplateJNI.TemplateInfo_hasTemplateId(this.swigCPtr, this);
    }

    public boolean hasTitle() {
        return NLETemplateJNI.TemplateInfo_hasTitle(this.swigCPtr, this);
    }

    public String store() {
        return NLETemplateJNI.TemplateInfo_store(this.swigCPtr, this);
    }

    public TemplateInfo() {
        this(NLETemplateJNI.new_TemplateInfo(), true);
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

    public static TemplateInfo dynamicCast(NLENode nLENode) {
        long jTemplateInfo_dynamicCast = NLETemplateJNI.TemplateInfo_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jTemplateInfo_dynamicCast == 0) {
            return null;
        }
        return new TemplateInfo(jTemplateInfo_dynamicCast, true);
    }

    public static long getCPtr(TemplateInfo templateInfo) {
        if (templateInfo == null) {
            return 0L;
        }
        return templateInfo.swigCPtr;
    }

    public static TemplateInfo restore(String str) {
        long jTemplateInfo_restore = NLETemplateJNI.TemplateInfo_restore(str);
        if (jTemplateInfo_restore == 0) {
            return null;
        }
        return new TemplateInfo(jTemplateInfo_restore, true);
    }

    public void addMutableItems(NLEMappingNode nLEMappingNode) {
        NLETemplateJNI.TemplateInfo_addMutableItems(this.swigCPtr, this, NLEMappingNode.getCPtr(nLEMappingNode), nLEMappingNode);
    }

    public boolean removeMutableItems(NLEMappingNode nLEMappingNode) {
        return NLETemplateJNI.TemplateInfo_removeMutableItems(this.swigCPtr, this, NLEMappingNode.getCPtr(nLEMappingNode), nLEMappingNode);
    }

    public void setCompressJSON(String str) {
        NLETemplateJNI.TemplateInfo_setCompressJSON(this.swigCPtr, this, str);
    }

    public void setConfig(TemplateConfig templateConfig) {
        NLETemplateJNI.TemplateInfo_setConfig(this.swigCPtr, this, TemplateConfig.getCPtr(templateConfig), templateConfig);
    }

    public void setCoverModel(NLEVideoFrameModel nLEVideoFrameModel) {
        NLETemplateJNI.TemplateInfo_setCoverModel(this.swigCPtr, this, NLEVideoFrameModel.getCPtr(nLEVideoFrameModel), nLEVideoFrameModel);
    }

    public void setCoverRes(NLEResourceNode nLEResourceNode) {
        NLETemplateJNI.TemplateInfo_setCoverRes(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setDesc(String str) {
        NLETemplateJNI.TemplateInfo_setDesc(this.swigCPtr, this, str);
    }

    public void setOriginalJSONSize(long j) {
        NLETemplateJNI.TemplateInfo_setOriginalJSONSize(this.swigCPtr, this, j);
    }

    public void setParentTemplateId(String str) {
        NLETemplateJNI.TemplateInfo_setParentTemplateId(this.swigCPtr, this, str);
    }

    public void setPlatform(String str) {
        NLETemplateJNI.TemplateInfo_setPlatform(this.swigCPtr, this, str);
    }

    public void setTag(String str) {
        NLETemplateJNI.TemplateInfo_setTag(this.swigCPtr, this, str);
    }

    public void setTemplateId(String str) {
        NLETemplateJNI.TemplateInfo_setTemplateId(this.swigCPtr, this, str);
    }

    public void setTitle(String str) {
        NLETemplateJNI.TemplateInfo_setTitle(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public TemplateInfo(long j, boolean z) {
        super(NLETemplateJNI.TemplateInfo_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
