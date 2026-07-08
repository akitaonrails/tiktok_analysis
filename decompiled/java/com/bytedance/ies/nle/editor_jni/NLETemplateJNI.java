package com.bytedance.ies.nle.editor_jni;

import com.bytedance.ies.nle.editor_jni.SetInt;
import com.bytedance.ies.nle.editor_jni.SetString;

/* JADX INFO: loaded from: classes36.dex */
public class NLETemplateJNI {
    public static final native void FeatureUtil_addFeatureForNode(String str, long j, NLENode nLENode);

    public static final native long FeatureUtil_getAllFeatureAndIndexList();

    public static final native void INLETemplateMattingServiceCallback_change_ownership(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j, boolean z);

    public static final native void INLETemplateMattingServiceCallback_director_connect(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j, boolean z, boolean z2);

    public static final native void INLETemplateMattingServiceCallback_onError(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j2, NLETrackSlot nLETrackSlot, int i, String str);

    public static final native void INLETemplateMattingServiceCallback_onErrorSwigExplicitINLETemplateMattingServiceCallback(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j2, NLETrackSlot nLETrackSlot, int i, String str);

    public static final native void INLETemplateMattingServiceCallback_onProgress(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, float f);

    public static final native void INLETemplateMattingServiceCallback_onProgressSwigExplicitINLETemplateMattingServiceCallback(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, float f);

    public static final native void INLETemplateMattingServiceCallback_onSuccess(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native void INLETemplateMattingServiceCallback_onSuccessSwigExplicitINLETemplateMattingServiceCallback(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native boolean INLETemplateMattingService_cancel(long j, INLETemplateMattingService iNLETemplateMattingService);

    public static final native void INLETemplateMattingService_change_ownership(INLETemplateMattingService iNLETemplateMattingService, long j, boolean z);

    public static final native void INLETemplateMattingService_clear(long j, INLETemplateMattingService iNLETemplateMattingService);

    public static final native void INLETemplateMattingService_director_connect(INLETemplateMattingService iNLETemplateMattingService, long j, boolean z, boolean z2);

    public static final native void INLETemplateMattingService_removeListener(long j, INLETemplateMattingService iNLETemplateMattingService);

    public static final native boolean INLETemplateMattingService_start(long j, INLETemplateMattingService iNLETemplateMattingService);

    public static final native long NLECollectionModel_SWIGSmartPtrUpcast(long j);

    public static final native boolean NLECollectionModel_addNLEModel(long j, NLECollectionModel nLECollectionModel, long j2, NLEModel nLEModel, long j3, VecNLETrackSlotSPtr vecNLETrackSlotSPtr);

    public static final native long NLECollectionModel_clone(long j, NLECollectionModel nLECollectionModel);

    public static final native long NLECollectionModel_copyFrom(long j, NLECollectionModel nLECollectionModel, long j2, NLETemplateModel nLETemplateModel);

    public static final native long NLECollectionModel_dynamicCast(long j, NLENode nLENode);

    public static final native long NLECollectionModel_getMusic(long j, NLECollectionModel nLECollectionModel);

    public static final native long NLECollectionModel_getNLEModel(long j, NLECollectionModel nLECollectionModel, int i);

    public static final native int NLECollectionModel_getNLEModelCount(long j, NLECollectionModel nLECollectionModel);

    public static final native long NLECollectionModel_getTracks(long j, NLECollectionModel nLECollectionModel);

    public static final native long NLECollectionModel_restore(String str);

    public static final native void NLECollectionModel_setMusic(long j, NLECollectionModel nLECollectionModel, long j2, NLESegmentAudio nLESegmentAudio);

    public static final native String NLECollectionModel_store(long j, NLECollectionModel nLECollectionModel);

    public static final native void NLEContextProcessorFunc_change_ownership(NLEContextProcessorFunc nLEContextProcessorFunc, long j, boolean z);

    public static final native String NLEContextProcessorFunc_decrypt(long j, NLEContextProcessorFunc nLEContextProcessorFunc, String str);

    public static final native void NLEContextProcessorFunc_director_connect(NLEContextProcessorFunc nLEContextProcessorFunc, long j, boolean z, boolean z2);

    public static final native String NLEContextProcessorFunc_encrypt(long j, NLEContextProcessorFunc nLEContextProcessorFunc, String str);

    public static final native String NLEContextProcessor_decrypt(long j, NLEContextProcessor nLEContextProcessor, String str);

    public static final native String NLEContextProcessor_encrypt(long j, NLEContextProcessor nLEContextProcessor, String str);

    public static final native long NLEContextProcessor_processor();

    public static final native void NLEContextProcessor_setDelegate(long j, NLEContextProcessor nLEContextProcessor, long j2, NLEContextProcessorFunc nLEContextProcessorFunc);

    public static final native long NLEFTemplateDynamicSlotCutter_cutTemplateWithDynamicSlots(long j, VecString vecString, long j2, VecLongLong vecLongLong, long j3, NLETemplateModel nLETemplateModel, boolean z);

    public static final native long NLEFTemplateDynamicSlotCutter_fetchRecommendSlotDuratioinsFromLab(String str, int i);

    public static final native String NLELabRecommendSlotsInfo_labVersion_get(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo);

    public static final native void NLELabRecommendSlotsInfo_labVersion_set(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo, String str);

    public static final native int NLELabRecommendSlotsInfo_slotCount_get(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo);

    public static final native void NLELabRecommendSlotsInfo_slotCount_set(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo, int i);

    public static final native long NLELabRecommendSlotsInfo_slotRecommendDurations_get(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo);

    public static final native void NLELabRecommendSlotsInfo_slotRecommendDurations_set(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo, long j2, VecLongLong vecLongLong);

    public static final native long NLEMappingNode_SWIGSmartPtrUpcast(long j);

    public static final native long NLEMappingNode_clone(long j, NLEMappingNode nLEMappingNode);

    public static final native long NLEMappingNode_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEMappingNode_getKeyClassName(long j, NLEMappingNode nLEMappingNode);

    public static final native String NLEMappingNode_getKeyUUID(long j, NLEMappingNode nLEMappingNode);

    public static final native String NLEMappingNode_getReproductionID(long j, NLEMappingNode nLEMappingNode);

    public static final native boolean NLEMappingNode_hasKeyClassName(long j, NLEMappingNode nLEMappingNode);

    public static final native boolean NLEMappingNode_hasKeyUUID(long j, NLEMappingNode nLEMappingNode);

    public static final native boolean NLEMappingNode_hasReproductionID(long j, NLEMappingNode nLEMappingNode);

    public static final native void NLEMappingNode_setKeyClassName(long j, NLEMappingNode nLEMappingNode, String str);

    public static final native void NLEMappingNode_setKeyUUID(long j, NLEMappingNode nLEMappingNode, String str);

    public static final native void NLEMappingNode_setReproductionID(long j, NLEMappingNode nLEMappingNode, String str);

    public static final native String NLEMutableEncoder_encodeMutableItems(long j, NLEMutableEncoder nLEMutableEncoder, long j2, NLETemplateModel nLETemplateModel);

    public static final native boolean NLESingleSlotMattingTask_cancel(long j, NLESingleSlotMattingTask nLESingleSlotMattingTask);

    public static final native boolean NLESingleSlotMattingTask_start(long j, NLESingleSlotMattingTask nLESingleSlotMattingTask);

    public static final native long NLETemplateEditor_SWIGUpcast(long j);

    public static final native long NLETemplateMattingService_SWIGSmartPtrUpcast(long j);

    public static final native boolean NLETemplateMattingService_cancel(long j, NLETemplateMattingService nLETemplateMattingService);

    public static final native void NLETemplateMattingService_clear(long j, NLETemplateMattingService nLETemplateMattingService);

    public static final native long NLETemplateMattingService_createSingleMattingTask__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, NLEModel nLEModel, String str, long j3, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, String str2);

    public static final native long NLETemplateMattingService_createSingleMattingTask__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, NLEModel nLEModel, String str, long j3, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native String NLETemplateMattingService_getMattingWorkSpace(String str, String str2);

    public static final native void NLETemplateMattingService_removeListener(long j, NLETemplateMattingService nLETemplateMattingService);

    public static final native boolean NLETemplateMattingService_start(long j, NLETemplateMattingService nLETemplateMattingService);

    public static final native long NLETemplateModel_SWIGSmartPtrUpcast(long j);

    public static final native long NLETemplateModel_allMutableItemUUIDs(long j, NLETemplateModel nLETemplateModel);

    public static final native boolean NLETemplateModel_canSupportFeatureBits__SWIG_0(long j, VecUInt32 vecUInt32);

    public static final native boolean NLETemplateModel_canSupportFeatureBits__SWIG_1(long j, VecUInt32 vecUInt32, long j2, VecUInt32 vecUInt322);

    public static final native long NLETemplateModel_clone(long j, NLETemplateModel nLETemplateModel);

    public static final native String NLETemplateModel_compressTemplateJson(String str);

    public static final native long NLETemplateModel_convertNLEMappingNode(long j, NLETemplateModel nLETemplateModel, long j2, NLENode nLENode);

    public static final native long NLETemplateModel_createFromDraft(long j, NLEModel nLEModel);

    public static final native long NLETemplateModel_dynamicCast(long j, NLENode nLENode);

    public static final native long NLETemplateModel_featureListInTemplateModel(String str);

    public static final native long NLETemplateModel_getAllMutableItems(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_getAllMutableTextClipsFromSlot(long j, NLETemplateModel nLETemplateModel, long j2, NLETrackSlot nLETrackSlot);

    public static final native long NLETemplateModel_getAllSupportFeatureBits__SWIG_0(long j, SetInt setInt);

    public static final native long NLETemplateModel_getAllSupportFeatureBits__SWIG_1();

    public static final native long NLETemplateModel_getAllSupportFeatureBits__SWIG_2(long j, SetString setString);

    public static final native long NLETemplateModel_getFeatureBits(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_getFeatureBitsFromFeatureList(String str);

    public static final native long NLETemplateModel_getFeatureBitsFromFeatureSet(long j, SetInt setInt);

    public static final native int NLETemplateModel_getFeatureIndex__SWIG_0(String str);

    public static final native int NLETemplateModel_getFeatureIndex__SWIG_1(int i);

    public static final native long NLETemplateModel_getFeatures(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_getFeaturesSetFromListString(String str);

    public static final native long NLETemplateModel_getMutableAssetItems(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_getMutableTextItems(long j, NLETemplateModel nLETemplateModel);

    public static final native String NLETemplateModel_getReproductionID(long j, NLETemplateModel nLETemplateModel, long j2, NLETrackSlot nLETrackSlot);

    public static final native long NLETemplateModel_getSupportFeatureBits__SWIG_0(long j, SetString setString);

    public static final native long NLETemplateModel_getSupportFeatureBits__SWIG_1();

    public static final native long NLETemplateModel_getSupportFeatureExcludeFeatures__SWIG_0(long j, SetInt setInt);

    public static final native long NLETemplateModel_getSupportFeatureExcludeFeatures__SWIG_1();

    public static final native String NLETemplateModel_getSupportFeatureList();

    public static final native long NLETemplateModel_getSupportUGCFeatureExcludeFeatures__SWIG_0(long j, SetInt setInt);

    public static final native long NLETemplateModel_getSupportUGCFeatureExcludeFeatures__SWIG_1();

    public static final native long NLETemplateModel_getTemplateCanvasSize(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_getTemplateInfo(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_restore(String str);

    public static final native long NLETemplateModel_restoreFromPath(String str);

    public static final native long NLETemplateModel_saveToDraft(long j, NLETemplateModel nLETemplateModel);

    public static final native void NLETemplateModel_setTemplateInfo(long j, NLETemplateModel nLETemplateModel, long j2, TemplateInfo templateInfo);

    public static final native String NLETemplateModel_store(long j, NLETemplateModel nLETemplateModel);

    public static final native String NLETemplateModel_templateJsonDecompress(String str);

    public static final native void NLETemplateModel_updateResourcePath(long j, NLETemplateModel nLETemplateModel, String str, String str2);

    public static final native int PairIntStr_first_get(long j, PairIntStr pairIntStr);

    public static final native void PairIntStr_first_set(long j, PairIntStr pairIntStr, int i);

    public static final native String PairIntStr_second_get(long j, PairIntStr pairIntStr);

    public static final native void PairIntStr_second_set(long j, PairIntStr pairIntStr, String str);

    public static final native String PairStrInt_first_get(long j, PairStrInt pairStrInt);

    public static final native void PairStrInt_first_set(long j, PairStrInt pairStrInt, String str);

    public static final native int PairStrInt_second_get(long j, PairStrInt pairStrInt);

    public static final native void PairStrInt_second_set(long j, PairStrInt pairStrInt, int i);

    public static final native int SetInt_Iterator_derefUnchecked(long j, SetInt.Iterator iterator);

    public static final native void SetInt_Iterator_incrementUnchecked(long j, SetInt.Iterator iterator);

    public static final native boolean SetInt_Iterator_isNot(long j, SetInt.Iterator iterator, long j2, SetInt.Iterator iterator2);

    public static final native boolean SetInt_add(long j, SetInt setInt, int i);

    public static final native long SetInt_begin(long j, SetInt setInt);

    public static final native void SetInt_clear(long j, SetInt setInt);

    public static final native boolean SetInt_containsImpl(long j, SetInt setInt, int i);

    public static final native long SetInt_end(long j, SetInt setInt);

    public static final native boolean SetInt_hasNextImpl(long j, SetInt setInt, long j2, SetInt.Iterator iterator);

    public static final native boolean SetInt_isEmpty(long j, SetInt setInt);

    public static final native boolean SetInt_removeImpl(long j, SetInt setInt, int i);

    public static final native int SetInt_sizeImpl(long j, SetInt setInt);

    public static final native String SetString_Iterator_derefUnchecked(long j, SetString.Iterator iterator);

    public static final native void SetString_Iterator_incrementUnchecked(long j, SetString.Iterator iterator);

    public static final native boolean SetString_Iterator_isNot(long j, SetString.Iterator iterator, long j2, SetString.Iterator iterator2);

    public static final native boolean SetString_add(long j, SetString setString, String str);

    public static final native long SetString_begin(long j, SetString setString);

    public static final native void SetString_clear(long j, SetString setString);

    public static final native boolean SetString_containsImpl(long j, SetString setString, String str);

    public static final native long SetString_end(long j, SetString setString);

    public static final native boolean SetString_hasNextImpl(long j, SetString setString, long j2, SetString.Iterator iterator);

    public static final native boolean SetString_isEmpty(long j, SetString setString);

    public static final native boolean SetString_removeImpl(long j, SetString setString, String str);

    public static final native int SetString_sizeImpl(long j, SetString setString);

    public static final native long TemplateConfig_SWIGSmartPtrUpcast(long j);

    public static final native long TemplateConfig_clone(long j, TemplateConfig templateConfig);

    public static final native long TemplateConfig_dynamicCast(long j, NLENode nLENode);

    public static final native String TemplateConfig_getCanvasRatio(long j, TemplateConfig templateConfig);

    public static final native boolean TemplateConfig_hasCanvasRatio(long j, TemplateConfig templateConfig);

    public static final native void TemplateConfig_setCanvasRatio(long j, TemplateConfig templateConfig, String str);

    public static final native long TemplateInfo_SWIGSmartPtrUpcast(long j);

    public static final native void TemplateInfo_addMutableItems(long j, TemplateInfo templateInfo, long j2, NLEMappingNode nLEMappingNode);

    public static final native void TemplateInfo_clearMutableItems(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_clone(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_dynamicCast(long j, NLENode nLENode);

    public static final native String TemplateInfo_getCompressJSON(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getConfig(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getCoverModel(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getCoverRes(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getDesc(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getMutableItemss(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getOriginalJSONSize(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getParentTemplateId(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getPlatform(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getTag(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getTemplateId(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getTitle(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasCompressJSON(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasDesc(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasOriginalJSONSize(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasParentTemplateId(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasPlatform(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasTag(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasTemplateId(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasTitle(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_removeMutableItems(long j, TemplateInfo templateInfo, long j2, NLEMappingNode nLEMappingNode);

    public static final native long TemplateInfo_restore(String str);

    public static final native void TemplateInfo_setCompressJSON(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setConfig(long j, TemplateInfo templateInfo, long j2, TemplateConfig templateConfig);

    public static final native void TemplateInfo_setCoverModel(long j, TemplateInfo templateInfo, long j2, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native void TemplateInfo_setCoverRes(long j, TemplateInfo templateInfo, long j2, NLEResourceNode nLEResourceNode);

    public static final native void TemplateInfo_setDesc(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setOriginalJSONSize(long j, TemplateInfo templateInfo, long j2);

    public static final native void TemplateInfo_setParentTemplateId(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setPlatform(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setTag(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setTemplateId(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setTitle(long j, TemplateInfo templateInfo, String str);

    public static final native String TemplateInfo_store(long j, TemplateInfo templateInfo);

    public static final native long VecNLEMappingNode_capacity(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native void VecNLEMappingNode_clear(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native void VecNLEMappingNode_doAdd__SWIG_0(long j, VecNLEMappingNode vecNLEMappingNode, long j2, NLEMappingNode nLEMappingNode);

    public static final native void VecNLEMappingNode_doAdd__SWIG_1(long j, VecNLEMappingNode vecNLEMappingNode, int i, long j2, NLEMappingNode nLEMappingNode);

    public static final native long VecNLEMappingNode_doGet(long j, VecNLEMappingNode vecNLEMappingNode, int i);

    public static final native long VecNLEMappingNode_doRemove(long j, VecNLEMappingNode vecNLEMappingNode, int i);

    public static final native void VecNLEMappingNode_doRemoveRange(long j, VecNLEMappingNode vecNLEMappingNode, int i, int i2);

    public static final native long VecNLEMappingNode_doSet(long j, VecNLEMappingNode vecNLEMappingNode, int i, long j2, NLEMappingNode nLEMappingNode);

    public static final native int VecNLEMappingNode_doSize(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native boolean VecNLEMappingNode_isEmpty(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native void VecNLEMappingNode_reserve(long j, VecNLEMappingNode vecNLEMappingNode, long j2);

    public static final native long VecNLENode_capacity(long j, VecNLENode vecNLENode);

    public static final native void VecNLENode_clear(long j, VecNLENode vecNLENode);

    public static final native void VecNLENode_doAdd__SWIG_0(long j, VecNLENode vecNLENode, long j2, NLENode nLENode);

    public static final native void VecNLENode_doAdd__SWIG_1(long j, VecNLENode vecNLENode, int i, long j2, NLENode nLENode);

    public static final native long VecNLENode_doGet(long j, VecNLENode vecNLENode, int i);

    public static final native long VecNLENode_doRemove(long j, VecNLENode vecNLENode, int i);

    public static final native void VecNLENode_doRemoveRange(long j, VecNLENode vecNLENode, int i, int i2);

    public static final native long VecNLENode_doSet(long j, VecNLENode vecNLENode, int i, long j2, NLENode nLENode);

    public static final native int VecNLENode_doSize(long j, VecNLENode vecNLENode);

    public static final native boolean VecNLENode_isEmpty(long j, VecNLENode vecNLENode);

    public static final native void VecNLENode_reserve(long j, VecNLENode vecNLENode, long j2);

    public static final native long VecPairIntStr_capacity(long j, VecPairIntStr vecPairIntStr);

    public static final native void VecPairIntStr_clear(long j, VecPairIntStr vecPairIntStr);

    public static final native void VecPairIntStr_doAdd__SWIG_0(long j, VecPairIntStr vecPairIntStr, long j2, PairIntStr pairIntStr);

    public static final native void VecPairIntStr_doAdd__SWIG_1(long j, VecPairIntStr vecPairIntStr, int i, long j2, PairIntStr pairIntStr);

    public static final native long VecPairIntStr_doGet(long j, VecPairIntStr vecPairIntStr, int i);

    public static final native long VecPairIntStr_doRemove(long j, VecPairIntStr vecPairIntStr, int i);

    public static final native void VecPairIntStr_doRemoveRange(long j, VecPairIntStr vecPairIntStr, int i, int i2);

    public static final native long VecPairIntStr_doSet(long j, VecPairIntStr vecPairIntStr, int i, long j2, PairIntStr pairIntStr);

    public static final native int VecPairIntStr_doSize(long j, VecPairIntStr vecPairIntStr);

    public static final native boolean VecPairIntStr_isEmpty(long j, VecPairIntStr vecPairIntStr);

    public static final native void VecPairIntStr_reserve(long j, VecPairIntStr vecPairIntStr, long j2);

    public static final native long VecPairStrInt_capacity(long j, VecPairStrInt vecPairStrInt);

    public static final native void VecPairStrInt_clear(long j, VecPairStrInt vecPairStrInt);

    public static final native void VecPairStrInt_doAdd__SWIG_0(long j, VecPairStrInt vecPairStrInt, long j2, PairStrInt pairStrInt);

    public static final native void VecPairStrInt_doAdd__SWIG_1(long j, VecPairStrInt vecPairStrInt, int i, long j2, PairStrInt pairStrInt);

    public static final native long VecPairStrInt_doGet(long j, VecPairStrInt vecPairStrInt, int i);

    public static final native long VecPairStrInt_doRemove(long j, VecPairStrInt vecPairStrInt, int i);

    public static final native void VecPairStrInt_doRemoveRange(long j, VecPairStrInt vecPairStrInt, int i, int i2);

    public static final native long VecPairStrInt_doSet(long j, VecPairStrInt vecPairStrInt, int i, long j2, PairStrInt pairStrInt);

    public static final native int VecPairStrInt_doSize(long j, VecPairStrInt vecPairStrInt);

    public static final native boolean VecPairStrInt_isEmpty(long j, VecPairStrInt vecPairStrInt);

    public static final native void VecPairStrInt_reserve(long j, VecPairStrInt vecPairStrInt, long j2);

    public static final native long VecUInt32_capacity(long j, VecUInt32 vecUInt32);

    public static final native void VecUInt32_clear(long j, VecUInt32 vecUInt32);

    public static final native void VecUInt32_doAdd__SWIG_0(long j, VecUInt32 vecUInt32, long j2);

    public static final native void VecUInt32_doAdd__SWIG_1(long j, VecUInt32 vecUInt32, int i, long j2);

    public static final native long VecUInt32_doGet(long j, VecUInt32 vecUInt32, int i);

    public static final native long VecUInt32_doRemove(long j, VecUInt32 vecUInt32, int i);

    public static final native void VecUInt32_doRemoveRange(long j, VecUInt32 vecUInt32, int i, int i2);

    public static final native long VecUInt32_doSet(long j, VecUInt32 vecUInt32, int i, long j2);

    public static final native int VecUInt32_doSize(long j, VecUInt32 vecUInt32);

    public static final native boolean VecUInt32_isEmpty(long j, VecUInt32 vecUInt32);

    public static final native void VecUInt32_reserve(long j, VecUInt32 vecUInt32, long j2);

    public static final native void delete_FeatureUtil(long j);

    public static final native void delete_INLETemplateMattingService(long j);

    public static final native void delete_INLETemplateMattingServiceCallback(long j);

    public static final native void delete_NLECollectionModel(long j);

    public static final native void delete_NLEContextProcessor(long j);

    public static final native void delete_NLEContextProcessorFunc(long j);

    public static final native void delete_NLEFTemplateDynamicSlotCutter(long j);

    public static final native void delete_NLELabRecommendSlotsInfo(long j);

    public static final native void delete_NLEMappingNode(long j);

    public static final native void delete_NLEMutableEncoder(long j);

    public static final native void delete_NLESingleSlotMattingTask(long j);

    public static final native void delete_NLETemplateEditor(long j);

    public static final native void delete_NLETemplateMattingService(long j);

    public static final native void delete_NLETemplateModel(long j);

    public static final native void delete_PairIntStr(long j);

    public static final native void delete_PairStrInt(long j);

    public static final native void delete_SetInt(long j);

    public static final native void delete_SetInt_Iterator(long j);

    public static final native void delete_SetString(long j);

    public static final native void delete_SetString_Iterator(long j);

    public static final native void delete_TemplateConfig(long j);

    public static final native void delete_TemplateInfo(long j);

    public static final native void delete_VecNLEMappingNode(long j);

    public static final native void delete_VecNLENode(long j);

    public static final native void delete_VecPairIntStr(long j);

    public static final native void delete_VecPairStrInt(long j);

    public static final native void delete_VecUInt32(long j);

    public static final native long new_FeatureUtil();

    public static final native long new_INLETemplateMattingService();

    public static final native long new_INLETemplateMattingServiceCallback();

    public static final native long new_NLECollectionModel();

    public static final native long new_NLEContextProcessor();

    public static final native long new_NLEContextProcessorFunc();

    public static final native long new_NLEFTemplateDynamicSlotCutter();

    public static final native long new_NLELabRecommendSlotsInfo();

    public static final native long new_NLEMappingNode();

    public static final native long new_NLEMutableEncoder();

    public static final native long new_NLESingleSlotMattingTask__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, NLEModel nLEModel, String str, long j3, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, String str2);

    public static final native long new_NLESingleSlotMattingTask__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, NLEModel nLEModel, String str, long j3, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native long new_NLETemplateEditor();

    public static final native long new_NLETemplateMattingService(long j, NLETemplateModel nLETemplateModel, String str, String str2, long j2, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native long new_NLETemplateModel();

    public static final native long new_PairIntStr__SWIG_0();

    public static final native long new_PairIntStr__SWIG_1(int i, String str);

    public static final native long new_PairIntStr__SWIG_2(long j, PairIntStr pairIntStr);

    public static final native long new_PairStrInt__SWIG_0();

    public static final native long new_PairStrInt__SWIG_1(String str, int i);

    public static final native long new_PairStrInt__SWIG_2(long j, PairStrInt pairStrInt);

    public static final native long new_SetInt__SWIG_0();

    public static final native long new_SetInt__SWIG_1(long j, SetInt setInt);

    public static final native long new_SetString__SWIG_0();

    public static final native long new_SetString__SWIG_1(long j, SetString setString);

    public static final native long new_TemplateConfig();

    public static final native long new_TemplateInfo();

    public static final native long new_VecNLEMappingNode__SWIG_0();

    public static final native long new_VecNLEMappingNode__SWIG_1(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native long new_VecNLEMappingNode__SWIG_2(int i, long j, NLEMappingNode nLEMappingNode);

    public static final native long new_VecNLENode__SWIG_0();

    public static final native long new_VecNLENode__SWIG_1(long j, VecNLENode vecNLENode);

    public static final native long new_VecNLENode__SWIG_2(int i, long j, NLENode nLENode);

    public static final native long new_VecPairIntStr__SWIG_0();

    public static final native long new_VecPairIntStr__SWIG_1(long j, VecPairIntStr vecPairIntStr);

    public static final native long new_VecPairIntStr__SWIG_2(int i, long j, PairIntStr pairIntStr);

    public static final native long new_VecPairStrInt__SWIG_0();

    public static final native long new_VecPairStrInt__SWIG_1(long j, VecPairStrInt vecPairStrInt);

    public static final native long new_VecPairStrInt__SWIG_2(int i, long j, PairStrInt pairStrInt);

    public static final native long new_VecUInt32__SWIG_0();

    public static final native long new_VecUInt32__SWIG_1(long j, VecUInt32 vecUInt32);

    public static final native long new_VecUInt32__SWIG_2(int i, long j);

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static void SwigDirector_INLETemplateMattingServiceCallback_onSuccess(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback) {
        iNLETemplateMattingServiceCallback.onSuccess();
    }

    public static boolean SwigDirector_INLETemplateMattingService_cancel(INLETemplateMattingService iNLETemplateMattingService) {
        return iNLETemplateMattingService.cancel();
    }

    public static void SwigDirector_INLETemplateMattingService_clear(INLETemplateMattingService iNLETemplateMattingService) {
        iNLETemplateMattingService.clear();
    }

    public static void SwigDirector_INLETemplateMattingService_removeListener(INLETemplateMattingService iNLETemplateMattingService) {
        iNLETemplateMattingService.removeListener();
    }

    public static boolean SwigDirector_INLETemplateMattingService_start(INLETemplateMattingService iNLETemplateMattingService) {
        return iNLETemplateMattingService.start();
    }

    public static void SwigDirector_INLETemplateMattingServiceCallback_onProgress(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, float f) {
        iNLETemplateMattingServiceCallback.onProgress(f);
    }

    public static String SwigDirector_NLEContextProcessorFunc_decrypt(NLEContextProcessorFunc nLEContextProcessorFunc, String str) {
        return nLEContextProcessorFunc.decrypt(str);
    }

    public static String SwigDirector_NLEContextProcessorFunc_encrypt(NLEContextProcessorFunc nLEContextProcessorFunc, String str) {
        return nLEContextProcessorFunc.encrypt(str);
    }

    public static void SwigDirector_INLETemplateMattingServiceCallback_onError(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j, int i, String str) {
        NLETrackSlot nLETrackSlot;
        if (j == 0) {
            nLETrackSlot = null;
        } else {
            nLETrackSlot = new NLETrackSlot(j, true);
        }
        iNLETemplateMattingServiceCallback.onError(nLETrackSlot, i, str);
    }
}
