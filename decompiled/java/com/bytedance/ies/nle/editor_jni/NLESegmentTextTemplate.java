package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentTextTemplate extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentTextTemplate(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearFont() {
        NLEEditorJniJNI.NLESegmentTextTemplate_clearFont(this.swigCPtr, this);
    }

    public void clearTextClip() {
        NLEEditorJniJNI.NLESegmentTextTemplate_clearTextClip(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentTextTemplate_clone = NLEEditorJniJNI.NLESegmentTextTemplate_clone(this.swigCPtr, this);
        if (jNLESegmentTextTemplate_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentTextTemplate_clone, true);
    }

    public NLEResourceNode getEffectSDKFile() {
        long jNLESegmentTextTemplate_getEffectSDKFile = NLEEditorJniJNI.NLESegmentTextTemplate_getEffectSDKFile(this.swigCPtr, this);
        if (jNLESegmentTextTemplate_getEffectSDKFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentTextTemplate_getEffectSDKFile, true);
    }

    public VecNLEResourceNodeSPtr getFonts() {
        return new VecNLEResourceNodeSPtr(NLEEditorJniJNI.NLESegmentTextTemplate_getFonts(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentTextTemplate_getResource = NLEEditorJniJNI.NLESegmentTextTemplate_getResource(this.swigCPtr, this);
        if (jNLESegmentTextTemplate_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentTextTemplate_getResource, true);
    }

    public VecNLETextTemplateClipSPtr getTextClips() {
        return new VecNLETextTemplateClipSPtr(NLEEditorJniJNI.NLESegmentTextTemplate_getTextClips(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResType getType() {
        return NLEResType.swigToEnum(NLEEditorJniJNI.NLESegmentTextTemplate_getType(this.swigCPtr, this));
    }

    public NLESegmentTextTemplate() {
        this(NLEEditorJniJNI.new_NLESegmentTextTemplate(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentTextTemplate dynamicCast(NLENode nLENode) {
        long jNLESegmentTextTemplate_dynamicCast = NLEEditorJniJNI.NLESegmentTextTemplate_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentTextTemplate_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentTextTemplate(jNLESegmentTextTemplate_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentTextTemplate nLESegmentTextTemplate) {
        if (nLESegmentTextTemplate == null) {
            return 0L;
        }
        return nLESegmentTextTemplate.swigCPtr;
    }

    public void addFont(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentTextTemplate_addFont(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void addTextClip(NLETextTemplateClip nLETextTemplateClip) {
        NLEEditorJniJNI.NLESegmentTextTemplate_addTextClip(this.swigCPtr, this, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip);
    }

    public boolean removeFont(NLEResourceNode nLEResourceNode) {
        return NLEEditorJniJNI.NLESegmentTextTemplate_removeFont(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public boolean removeTextClip(NLETextTemplateClip nLETextTemplateClip) {
        return NLEEditorJniJNI.NLESegmentTextTemplate_removeTextClip(this.swigCPtr, this, NLETextTemplateClip.getCPtr(nLETextTemplateClip), nLETextTemplateClip);
    }

    public void setEffectSDKFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentTextTemplate_setEffectSDKFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentTextTemplate(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentTextTemplate_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
