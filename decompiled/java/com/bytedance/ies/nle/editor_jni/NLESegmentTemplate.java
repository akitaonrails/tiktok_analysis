package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentTemplate extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentTemplate(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static SWIGTYPE_p_std__vectorT_cut__model__NLEValueProperty_const_RfpFfF_t getNLESegmentTemplateProperty() {
        return new SWIGTYPE_p_std__vectorT_cut__model__NLEValueProperty_const_RfpFfF_t(NLEEditorJniJNI.NLESegmentTemplate_getNLESegmentTemplateProperty(), false);
    }

    public void clearChildElementList() {
        NLEEditorJniJNI.NLESegmentTemplate_clearChildElementList(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentTemplate_clone = NLEEditorJniJNI.NLESegmentTemplate_clone(this.swigCPtr, this);
        if (jNLESegmentTemplate_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentTemplate_clone, true);
    }

    public VecNLETrackSlotSPtr getChildElementLists() {
        return new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLESegmentTemplate_getChildElementLists(this.swigCPtr, this), true);
    }

    public String getDependResourceJson() {
        return NLEEditorJniJNI.NLESegmentTemplate_getDependResourceJson(this.swigCPtr, this);
    }

    public String getResourceFolder() {
        return NLEEditorJniJNI.NLESegmentTemplate_getResourceFolder(this.swigCPtr, this);
    }

    public boolean hasDependResourceJson() {
        return NLEEditorJniJNI.NLESegmentTemplate_hasDependResourceJson(this.swigCPtr, this);
    }

    public boolean hasResourceFolder() {
        return NLEEditorJniJNI.NLESegmentTemplate_hasResourceFolder(this.swigCPtr, this);
    }

    public NLESegmentTemplate() {
        this(NLEEditorJniJNI.new_NLESegmentTemplate(), true);
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

    public static NLESegmentTemplate dynamicCast(NLENode nLENode) {
        long jNLESegmentTemplate_dynamicCast = NLEEditorJniJNI.NLESegmentTemplate_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentTemplate_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentTemplate(jNLESegmentTemplate_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentTemplate nLESegmentTemplate) {
        if (nLESegmentTemplate == null) {
            return 0L;
        }
        return nLESegmentTemplate.swigCPtr;
    }

    public void addChildElementList(NLETrackSlot nLETrackSlot) {
        NLEEditorJniJNI.NLESegmentTemplate_addChildElementList(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public boolean removeChildElementList(NLETrackSlot nLETrackSlot) {
        return NLEEditorJniJNI.NLESegmentTemplate_removeChildElementList(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void setDependResourceJson(String str) {
        NLEEditorJniJNI.NLESegmentTemplate_setDependResourceJson(this.swigCPtr, this, str);
    }

    public void setResourceFolder(String str) {
        NLEEditorJniJNI.NLESegmentTemplate_setResourceFolder(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentTemplate(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentTemplate_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
