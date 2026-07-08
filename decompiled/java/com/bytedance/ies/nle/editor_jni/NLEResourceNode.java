package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEResourceNode extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEResourceNode(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEResourceNode_clone = NLEEditorJniJNI.NLEResourceNode_clone(this.swigCPtr, this);
        if (jNLEResourceNode_clone == 0) {
            return null;
        }
        return new NLENode(jNLEResourceNode_clone, true);
    }

    public NLEAlphaSplitType getAlphaSplitType() {
        return NLEAlphaSplitType.swigToEnum(NLEEditorJniJNI.NLEResourceNode_getAlphaSplitType(this.swigCPtr, this));
    }

    public long getDuration() {
        return NLEEditorJniJNI.NLEResourceNode_getDuration(this.swigCPtr, this);
    }

    public long getHeight() {
        return NLEEditorJniJNI.NLEResourceNode_getHeight(this.swigCPtr, this);
    }

    public boolean getNecessary() {
        return NLEEditorJniJNI.NLEResourceNode_getNecessary(this.swigCPtr, this);
    }

    public String getResourceFile() {
        return NLEEditorJniJNI.NLEResourceNode_getResourceFile(this.swigCPtr, this);
    }

    public String getResourceId() {
        return NLEEditorJniJNI.NLEResourceNode_getResourceId(this.swigCPtr, this);
    }

    public String getResourceMD5() {
        return NLEEditorJniJNI.NLEResourceNode_getResourceMD5(this.swigCPtr, this);
    }

    public String getResourceName() {
        return NLEEditorJniJNI.NLEResourceNode_getResourceName(this.swigCPtr, this);
    }

    public NLEResTag getResourceTag() {
        return NLEResTag.swigToEnum(NLEEditorJniJNI.NLEResourceNode_getResourceTag(this.swigCPtr, this));
    }

    public NLEResType getResourceType() {
        return NLEResType.swigToEnum(NLEEditorJniJNI.NLEResourceNode_getResourceType(this.swigCPtr, this));
    }

    public long getWidth() {
        return NLEEditorJniJNI.NLEResourceNode_getWidth(this.swigCPtr, this);
    }

    public boolean hasAlphaSplitType() {
        return NLEEditorJniJNI.NLEResourceNode_hasAlphaSplitType(this.swigCPtr, this);
    }

    public boolean hasDuration() {
        return NLEEditorJniJNI.NLEResourceNode_hasDuration(this.swigCPtr, this);
    }

    public boolean hasHeight() {
        return NLEEditorJniJNI.NLEResourceNode_hasHeight(this.swigCPtr, this);
    }

    public boolean hasNecessary() {
        return NLEEditorJniJNI.NLEResourceNode_hasNecessary(this.swigCPtr, this);
    }

    public boolean hasResourceFile() {
        return NLEEditorJniJNI.NLEResourceNode_hasResourceFile(this.swigCPtr, this);
    }

    public boolean hasResourceId() {
        return NLEEditorJniJNI.NLEResourceNode_hasResourceId(this.swigCPtr, this);
    }

    public boolean hasResourceMD5() {
        return NLEEditorJniJNI.NLEResourceNode_hasResourceMD5(this.swigCPtr, this);
    }

    public boolean hasResourceName() {
        return NLEEditorJniJNI.NLEResourceNode_hasResourceName(this.swigCPtr, this);
    }

    public boolean hasResourceTag() {
        return NLEEditorJniJNI.NLEResourceNode_hasResourceTag(this.swigCPtr, this);
    }

    public boolean hasResourceType() {
        return NLEEditorJniJNI.NLEResourceNode_hasResourceType(this.swigCPtr, this);
    }

    public boolean hasWidth() {
        return NLEEditorJniJNI.NLEResourceNode_hasWidth(this.swigCPtr, this);
    }

    public boolean isLocal() {
        return NLEEditorJniJNI.NLEResourceNode_isLocal(this.swigCPtr, this);
    }

    public NLEResourceNode() {
        this(NLEEditorJniJNI.new_NLEResourceNode(), true);
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

    public static NLEResourceNode dynamicCast(NLENode nLENode) {
        long jNLEResourceNode_dynamicCast = NLEEditorJniJNI.NLEResourceNode_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEResourceNode_dynamicCast == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEResourceNode_dynamicCast, true);
    }

    public static long getCPtr(NLEResourceNode nLEResourceNode) {
        if (nLEResourceNode == null) {
            return 0L;
        }
        return nLEResourceNode.swigCPtr;
    }

    public void setAlphaSplitType(NLEAlphaSplitType nLEAlphaSplitType) {
        NLEEditorJniJNI.NLEResourceNode_setAlphaSplitType(this.swigCPtr, this, nLEAlphaSplitType.swigValue());
    }

    public void setDuration(long j) {
        NLEEditorJniJNI.NLEResourceNode_setDuration(this.swigCPtr, this, j);
    }

    public void setHeight(long j) {
        NLEEditorJniJNI.NLEResourceNode_setHeight(this.swigCPtr, this, j);
    }

    public void setNecessary(boolean z) {
        NLEEditorJniJNI.NLEResourceNode_setNecessary(this.swigCPtr, this, z);
    }

    public void setResourceFile(String str) {
        NLEEditorJniJNI.NLEResourceNode_setResourceFile(this.swigCPtr, this, str);
    }

    public void setResourceId(String str) {
        NLEEditorJniJNI.NLEResourceNode_setResourceId(this.swigCPtr, this, str);
    }

    public void setResourceMD5(String str) {
        NLEEditorJniJNI.NLEResourceNode_setResourceMD5(this.swigCPtr, this, str);
    }

    public void setResourceName(String str) {
        NLEEditorJniJNI.NLEResourceNode_setResourceName(this.swigCPtr, this, str);
    }

    public void setResourceTag(NLEResTag nLEResTag) {
        NLEEditorJniJNI.NLEResourceNode_setResourceTag(this.swigCPtr, this, nLEResTag.swigValue());
    }

    public void setResourceType(NLEResType nLEResType) {
        NLEEditorJniJNI.NLEResourceNode_setResourceType(this.swigCPtr, this, nLEResType.swigValue());
    }

    public void setWidth(long j) {
        NLEEditorJniJNI.NLEResourceNode_setWidth(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEResourceNode(long j, boolean z) {
        super(NLEEditorJniJNI.NLEResourceNode_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
