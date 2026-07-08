package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMappingNode extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLETemplateJNI.delete_NLEMappingNode(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEMappingNode_clone = NLETemplateJNI.NLEMappingNode_clone(this.swigCPtr, this);
        if (jNLEMappingNode_clone == 0) {
            return null;
        }
        return new NLENode(jNLEMappingNode_clone, true);
    }

    public String getKeyClassName() {
        return NLETemplateJNI.NLEMappingNode_getKeyClassName(this.swigCPtr, this);
    }

    public String getKeyUUID() {
        return NLETemplateJNI.NLEMappingNode_getKeyUUID(this.swigCPtr, this);
    }

    public String getReproductionID() {
        return NLETemplateJNI.NLEMappingNode_getReproductionID(this.swigCPtr, this);
    }

    public boolean hasKeyClassName() {
        return NLETemplateJNI.NLEMappingNode_hasKeyClassName(this.swigCPtr, this);
    }

    public boolean hasKeyUUID() {
        return NLETemplateJNI.NLEMappingNode_hasKeyUUID(this.swigCPtr, this);
    }

    public boolean hasReproductionID() {
        return NLETemplateJNI.NLEMappingNode_hasReproductionID(this.swigCPtr, this);
    }

    public NLEMappingNode() {
        this(NLETemplateJNI.new_NLEMappingNode(), true);
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

    public static NLEMappingNode dynamicCast(NLENode nLENode) {
        long jNLEMappingNode_dynamicCast = NLETemplateJNI.NLEMappingNode_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEMappingNode_dynamicCast == 0) {
            return null;
        }
        return new NLEMappingNode(jNLEMappingNode_dynamicCast, true);
    }

    public static long getCPtr(NLEMappingNode nLEMappingNode) {
        if (nLEMappingNode == null) {
            return 0L;
        }
        return nLEMappingNode.swigCPtr;
    }

    public void setKeyClassName(String str) {
        NLETemplateJNI.NLEMappingNode_setKeyClassName(this.swigCPtr, this, str);
    }

    public void setKeyUUID(String str) {
        NLETemplateJNI.NLEMappingNode_setKeyUUID(this.swigCPtr, this, str);
    }

    public void setReproductionID(String str) {
        NLETemplateJNI.NLEMappingNode_setReproductionID(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMappingNode(long j, boolean z) {
        super(NLETemplateJNI.NLEMappingNode_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
