package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLETemplateModel extends NLEModel {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLETemplateJNI.delete_NLETemplateModel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static VecUInt32 getAllSupportFeatureBits() {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getAllSupportFeatureBits__SWIG_1(), true);
    }

    public static VecUInt32 getSupportFeatureBits() {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getSupportFeatureBits__SWIG_1(), true);
    }

    public static VecUInt32 getSupportFeatureExcludeFeatures() {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getSupportFeatureExcludeFeatures__SWIG_1(), true);
    }

    public static VecUInt32 getSupportUGCFeatureExcludeFeatures() {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getSupportUGCFeatureExcludeFeatures__SWIG_1(), true);
    }

    public VecString allMutableItemUUIDs() {
        return new VecString(NLETemplateJNI.NLETemplateModel_allMutableItemUUIDs(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETemplateModel_clone = NLETemplateJNI.NLETemplateModel_clone(this.swigCPtr, this);
        if (jNLETemplateModel_clone == 0) {
            return null;
        }
        return new NLENode(jNLETemplateModel_clone, true);
    }

    public VecNLENode getAllMutableItems() {
        return new VecNLENode(NLETemplateJNI.NLETemplateModel_getAllMutableItems(this.swigCPtr, this), true);
    }

    public VecUInt32 getFeatureBits() {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getFeatureBits(this.swigCPtr, this), true);
    }

    public VecString getFeatures() {
        return new VecString(NLETemplateJNI.NLETemplateModel_getFeatures(this.swigCPtr, this), true);
    }

    public VecNLETrackSlotSPtr getMutableAssetItems() {
        return new VecNLETrackSlotSPtr(NLETemplateJNI.NLETemplateModel_getMutableAssetItems(this.swigCPtr, this), true);
    }

    public VecNLETrackSlotSPtr getMutableTextItems() {
        return new VecNLETrackSlotSPtr(NLETemplateJNI.NLETemplateModel_getMutableTextItems(this.swigCPtr, this), true);
    }

    public NLESize getTemplateCanvasSize() {
        return new NLESize(NLETemplateJNI.NLETemplateModel_getTemplateCanvasSize(this.swigCPtr, this), true);
    }

    public TemplateInfo getTemplateInfo() {
        long jNLETemplateModel_getTemplateInfo = NLETemplateJNI.NLETemplateModel_getTemplateInfo(this.swigCPtr, this);
        if (jNLETemplateModel_getTemplateInfo == 0) {
            return null;
        }
        return new TemplateInfo(jNLETemplateModel_getTemplateInfo, true);
    }

    public String store() {
        return NLETemplateJNI.NLETemplateModel_store(this.swigCPtr, this);
    }

    public NLETemplateModel() {
        this(NLETemplateJNI.new_NLETemplateModel(), true);
    }

    public static String getSupportFeatureList() {
        return NLETemplateJNI.NLETemplateModel_getSupportFeatureList();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static boolean canSupportFeatureBits(VecUInt32 vecUInt32) {
        return NLETemplateJNI.NLETemplateModel_canSupportFeatureBits__SWIG_0(VecUInt32.getCPtr(vecUInt32), vecUInt32);
    }

    public static String compressTemplateJson(String str) {
        return NLETemplateJNI.NLETemplateModel_compressTemplateJson(str);
    }

    public static NLETemplateModel createFromDraft(NLEModel nLEModel) {
        long jNLETemplateModel_createFromDraft = NLETemplateJNI.NLETemplateModel_createFromDraft(NLEModel.getCPtr(nLEModel), nLEModel);
        if (jNLETemplateModel_createFromDraft == 0) {
            return null;
        }
        return new NLETemplateModel(jNLETemplateModel_createFromDraft, true);
    }

    public static NLETemplateModel dynamicCast(NLENode nLENode) {
        long jNLETemplateModel_dynamicCast = NLETemplateJNI.NLETemplateModel_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETemplateModel_dynamicCast == 0) {
            return null;
        }
        return new NLETemplateModel(jNLETemplateModel_dynamicCast, true);
    }

    public static SetString featureListInTemplateModel(String str) {
        return new SetString(NLETemplateJNI.NLETemplateModel_featureListInTemplateModel(str), true);
    }

    public static VecUInt32 getAllSupportFeatureBits(SetInt setInt) {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getAllSupportFeatureBits__SWIG_0(SetInt.getCPtr(setInt), setInt), true);
    }

    public static long getCPtr(NLETemplateModel nLETemplateModel) {
        if (nLETemplateModel == null) {
            return 0L;
        }
        return nLETemplateModel.swigCPtr;
    }

    public static VecUInt32 getFeatureBitsFromFeatureList(String str) {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getFeatureBitsFromFeatureList(str), true);
    }

    public static VecUInt32 getFeatureBitsFromFeatureSet(SetInt setInt) {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getFeatureBitsFromFeatureSet(SetInt.getCPtr(setInt), setInt), true);
    }

    public static int getFeatureIndex(int i) {
        return NLETemplateJNI.NLETemplateModel_getFeatureIndex__SWIG_1(i);
    }

    public static SetInt getFeaturesSetFromListString(String str) {
        return new SetInt(NLETemplateJNI.NLETemplateModel_getFeaturesSetFromListString(str), true);
    }

    public static VecUInt32 getSupportFeatureBits(SetString setString) {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getSupportFeatureBits__SWIG_0(SetString.getCPtr(setString), setString), true);
    }

    public static VecUInt32 getSupportFeatureExcludeFeatures(SetInt setInt) {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getSupportFeatureExcludeFeatures__SWIG_0(SetInt.getCPtr(setInt), setInt), true);
    }

    public static VecUInt32 getSupportUGCFeatureExcludeFeatures(SetInt setInt) {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getSupportUGCFeatureExcludeFeatures__SWIG_0(SetInt.getCPtr(setInt), setInt), true);
    }

    public static NLETemplateModel restore(String str) {
        long jNLETemplateModel_restore = NLETemplateJNI.NLETemplateModel_restore(str);
        if (jNLETemplateModel_restore == 0) {
            return null;
        }
        return new NLETemplateModel(jNLETemplateModel_restore, true);
    }

    public static NLETemplateModel restoreFromPath(String str) {
        long jNLETemplateModel_restoreFromPath = NLETemplateJNI.NLETemplateModel_restoreFromPath(str);
        if (jNLETemplateModel_restoreFromPath == 0) {
            return null;
        }
        return new NLETemplateModel(jNLETemplateModel_restoreFromPath, true);
    }

    public static NLEModel saveToDraft(NLETemplateModel nLETemplateModel) {
        long jNLETemplateModel_saveToDraft = NLETemplateJNI.NLETemplateModel_saveToDraft(getCPtr(nLETemplateModel), nLETemplateModel);
        if (jNLETemplateModel_saveToDraft == 0) {
            return null;
        }
        return new NLEModel(jNLETemplateModel_saveToDraft, true);
    }

    public static String templateJsonDecompress(String str) {
        return NLETemplateJNI.NLETemplateModel_templateJsonDecompress(str);
    }

    public NLEMappingNode convertNLEMappingNode(NLENode nLENode) {
        long jNLETemplateModel_convertNLEMappingNode = NLETemplateJNI.NLETemplateModel_convertNLEMappingNode(this.swigCPtr, this, NLENode.getCPtr(nLENode), nLENode);
        if (jNLETemplateModel_convertNLEMappingNode == 0) {
            return null;
        }
        return new NLEMappingNode(jNLETemplateModel_convertNLEMappingNode, true);
    }

    public VecNLETextTemplateClipSPtr getAllMutableTextClipsFromSlot(NLETrackSlot nLETrackSlot) {
        return new VecNLETextTemplateClipSPtr(NLETemplateJNI.NLETemplateModel_getAllMutableTextClipsFromSlot(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot), true);
    }

    public String getReproductionID(NLETrackSlot nLETrackSlot) {
        return NLETemplateJNI.NLETemplateModel_getReproductionID(this.swigCPtr, this, NLETrackSlot.getCPtr(nLETrackSlot), nLETrackSlot);
    }

    public void setTemplateInfo(TemplateInfo templateInfo) {
        NLETemplateJNI.NLETemplateModel_setTemplateInfo(this.swigCPtr, this, TemplateInfo.getCPtr(templateInfo), templateInfo);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public static VecUInt32 getAllSupportFeatureBits(SetString setString) {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getAllSupportFeatureBits__SWIG_2(SetString.getCPtr(setString), setString), true);
    }

    public static int getFeatureIndex(String str) {
        return NLETemplateJNI.NLETemplateModel_getFeatureIndex__SWIG_0(str);
    }

    public NLETemplateModel(long j, boolean z) {
        super(NLETemplateJNI.NLETemplateModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static boolean canSupportFeatureBits(VecUInt32 vecUInt32, VecUInt32 vecUInt322) {
        return NLETemplateJNI.NLETemplateModel_canSupportFeatureBits__SWIG_1(VecUInt32.getCPtr(vecUInt32), vecUInt32, VecUInt32.getCPtr(vecUInt322), vecUInt322);
    }

    public void updateResourcePath(String str, String str2) {
        NLETemplateJNI.NLETemplateModel_updateResourcePath(this.swigCPtr, this, str, str2);
    }
}
