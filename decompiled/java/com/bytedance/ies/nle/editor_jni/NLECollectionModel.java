package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLECollectionModel extends NLETemplateModel {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETemplateModel, com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLETemplateJNI.delete_NLECollectionModel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETemplateModel, com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLECollectionModel_clone = NLETemplateJNI.NLECollectionModel_clone(this.swigCPtr, this);
        if (jNLECollectionModel_clone == 0) {
            return null;
        }
        return new NLENode(jNLECollectionModel_clone, true);
    }

    public NLESegmentAudio getMusic() {
        long jNLECollectionModel_getMusic = NLETemplateJNI.NLECollectionModel_getMusic(this.swigCPtr, this);
        if (jNLECollectionModel_getMusic == 0) {
            return null;
        }
        return new NLESegmentAudio(jNLECollectionModel_getMusic, true);
    }

    public int getNLEModelCount() {
        return NLETemplateJNI.NLECollectionModel_getNLEModelCount(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel
    public VecNLETrackSPtr getTracks() {
        return new VecNLETrackSPtr(NLETemplateJNI.NLECollectionModel_getTracks(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETemplateModel
    public String store() {
        return NLETemplateJNI.NLECollectionModel_store(this.swigCPtr, this);
    }

    public NLECollectionModel() {
        this(NLETemplateJNI.new_NLECollectionModel(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETemplateModel, com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETemplateModel, com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLECollectionModel dynamicCast(NLENode nLENode) {
        long jNLECollectionModel_dynamicCast = NLETemplateJNI.NLECollectionModel_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLECollectionModel_dynamicCast == 0) {
            return null;
        }
        return new NLECollectionModel(jNLECollectionModel_dynamicCast, true);
    }

    public static long getCPtr(NLECollectionModel nLECollectionModel) {
        if (nLECollectionModel == null) {
            return 0L;
        }
        return nLECollectionModel.swigCPtr;
    }

    public static NLECollectionModel restore(String str) {
        long jNLECollectionModel_restore = NLETemplateJNI.NLECollectionModel_restore(str);
        if (jNLECollectionModel_restore == 0) {
            return null;
        }
        return new NLECollectionModel(jNLECollectionModel_restore, true);
    }

    public NLECollectionModel copyFrom(NLETemplateModel nLETemplateModel) {
        long jNLECollectionModel_copyFrom = NLETemplateJNI.NLECollectionModel_copyFrom(this.swigCPtr, this, NLETemplateModel.getCPtr(nLETemplateModel), nLETemplateModel);
        if (jNLECollectionModel_copyFrom == 0) {
            return null;
        }
        return new NLECollectionModel(jNLECollectionModel_copyFrom, true);
    }

    public NLEModel getNLEModel(int i) {
        long jNLECollectionModel_getNLEModel = NLETemplateJNI.NLECollectionModel_getNLEModel(this.swigCPtr, this, i);
        if (jNLECollectionModel_getNLEModel == 0) {
            return null;
        }
        return new NLEModel(jNLECollectionModel_getNLEModel, true);
    }

    public void setMusic(NLESegmentAudio nLESegmentAudio) {
        NLETemplateJNI.NLECollectionModel_setMusic(this.swigCPtr, this, NLESegmentAudio.getCPtr(nLESegmentAudio), nLESegmentAudio);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETemplateModel, com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLECollectionModel(long j, boolean z) {
        super(NLETemplateJNI.NLECollectionModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public boolean addNLEModel(NLEModel nLEModel, VecNLETrackSlotSPtr vecNLETrackSlotSPtr) {
        return NLETemplateJNI.NLECollectionModel_addNLEModel(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, VecNLETrackSlotSPtr.getCPtr(vecNLETrackSlotSPtr), vecNLETrackSlotSPtr);
    }
}
