package com.bytedance.ies.effecteditor.swig;

import com.bytedance.ies.effecteditor.swig.EEStdStringToStringMap;
import com.bytedance.ies.effecteditor.swig.EEStdStringToStringUnorderedMap;

/* JADX INFO: loaded from: classes36.dex */
public class EffectEditorJniJNI {
    public static final native long EEEffectHandle_Instance();

    public static final native void EEEffectHandle_setMETEffectHandleGetterPtr(long j, EEEffectHandle eEEffectHandle, long j2, EffectHandleGetter effectHandleGetter);

    public static final native String EEStdStringToStringMap_Iterator_getKey(long j, EEStdStringToStringMap.Iterator iterator);

    public static final native long EEStdStringToStringMap_Iterator_getNextUnchecked(long j, EEStdStringToStringMap.Iterator iterator);

    public static final native String EEStdStringToStringMap_Iterator_getValue(long j, EEStdStringToStringMap.Iterator iterator);

    public static final native boolean EEStdStringToStringMap_Iterator_isNot(long j, EEStdStringToStringMap.Iterator iterator, long j2, EEStdStringToStringMap.Iterator iterator2);

    public static final native void EEStdStringToStringMap_Iterator_setValue(long j, EEStdStringToStringMap.Iterator iterator, String str);

    public static final native long EEStdStringToStringMap_begin(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native void EEStdStringToStringMap_clear(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native boolean EEStdStringToStringMap_containsImpl(long j, EEStdStringToStringMap eEStdStringToStringMap, String str);

    public static final native long EEStdStringToStringMap_end(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native long EEStdStringToStringMap_find(long j, EEStdStringToStringMap eEStdStringToStringMap, String str);

    public static final native boolean EEStdStringToStringMap_isEmpty(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native void EEStdStringToStringMap_putUnchecked(long j, EEStdStringToStringMap eEStdStringToStringMap, String str, String str2);

    public static final native void EEStdStringToStringMap_removeUnchecked(long j, EEStdStringToStringMap eEStdStringToStringMap, long j2, EEStdStringToStringMap.Iterator iterator);

    public static final native int EEStdStringToStringMap_sizeImpl(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native long EEStdStringToStringUnorderedMapList_capacity(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList);

    public static final native void EEStdStringToStringUnorderedMapList_clear(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList);

    public static final native void EEStdStringToStringUnorderedMapList_doAdd__SWIG_0(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList, long j2, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native void EEStdStringToStringUnorderedMapList_doAdd__SWIG_1(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList, int i, long j2, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native long EEStdStringToStringUnorderedMapList_doGet(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList, int i);

    public static final native long EEStdStringToStringUnorderedMapList_doRemove(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList, int i);

    public static final native void EEStdStringToStringUnorderedMapList_doRemoveRange(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList, int i, int i2);

    public static final native long EEStdStringToStringUnorderedMapList_doSet(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList, int i, long j2, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native int EEStdStringToStringUnorderedMapList_doSize(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList);

    public static final native boolean EEStdStringToStringUnorderedMapList_isEmpty(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList);

    public static final native void EEStdStringToStringUnorderedMapList_reserve(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList, long j2);

    public static final native String EEStdStringToStringUnorderedMap_Iterator_getKey(long j, EEStdStringToStringUnorderedMap.Iterator iterator);

    public static final native long EEStdStringToStringUnorderedMap_Iterator_getNextUnchecked(long j, EEStdStringToStringUnorderedMap.Iterator iterator);

    public static final native String EEStdStringToStringUnorderedMap_Iterator_getValue(long j, EEStdStringToStringUnorderedMap.Iterator iterator);

    public static final native boolean EEStdStringToStringUnorderedMap_Iterator_isNot(long j, EEStdStringToStringUnorderedMap.Iterator iterator, long j2, EEStdStringToStringUnorderedMap.Iterator iterator2);

    public static final native void EEStdStringToStringUnorderedMap_Iterator_setValue(long j, EEStdStringToStringUnorderedMap.Iterator iterator, String str);

    public static final native long EEStdStringToStringUnorderedMap_begin(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native void EEStdStringToStringUnorderedMap_clear(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native boolean EEStdStringToStringUnorderedMap_containsImpl(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap, String str);

    public static final native long EEStdStringToStringUnorderedMap_end(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native long EEStdStringToStringUnorderedMap_find(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap, String str);

    public static final native boolean EEStdStringToStringUnorderedMap_isEmpty(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native void EEStdStringToStringUnorderedMap_putUnchecked(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap, String str, String str2);

    public static final native void EEStdStringToStringUnorderedMap_removeUnchecked(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap, long j2, EEStdStringToStringUnorderedMap.Iterator iterator);

    public static final native int EEStdStringToStringUnorderedMap_sizeImpl(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native long EEStdStringVector_capacity(long j, EEStdStringVector eEStdStringVector);

    public static final native void EEStdStringVector_clear(long j, EEStdStringVector eEStdStringVector);

    public static final native void EEStdStringVector_doAdd__SWIG_0(long j, EEStdStringVector eEStdStringVector, String str);

    public static final native void EEStdStringVector_doAdd__SWIG_1(long j, EEStdStringVector eEStdStringVector, int i, String str);

    public static final native String EEStdStringVector_doGet(long j, EEStdStringVector eEStdStringVector, int i);

    public static final native String EEStdStringVector_doRemove(long j, EEStdStringVector eEStdStringVector, int i);

    public static final native void EEStdStringVector_doRemoveRange(long j, EEStdStringVector eEStdStringVector, int i, int i2);

    public static final native String EEStdStringVector_doSet(long j, EEStdStringVector eEStdStringVector, int i, String str);

    public static final native int EEStdStringVector_doSize(long j, EEStdStringVector eEStdStringVector);

    public static final native boolean EEStdStringVector_isEmpty(long j, EEStdStringVector eEStdStringVector);

    public static final native void EEStdStringVector_reserve(long j, EEStdStringVector eEStdStringVector, long j2);

    public static final native void EffectHandleGetter_change_ownership(EffectHandleGetter effectHandleGetter, long j, boolean z);

    public static final native void EffectHandleGetter_director_connect(EffectHandleGetter effectHandleGetter, long j, boolean z, boolean z2);

    public static final native long EffectHandleGetter_getEffectHandle(long j, EffectHandleGetter effectHandleGetter);

    public static final native String EffectHandleGetter_getEffectPath(long j, EffectHandleGetter effectHandleGetter);

    public static final native String EffectHandleGetter_getTag(long j, EffectHandleGetter effectHandleGetter);

    public static final native void EffectHandleGetter_setEffectPath(long j, EffectHandleGetter effectHandleGetter, String str);

    public static final native void EffectMessageCenter_dispatchEffectMessage(long j, int i, int i2, String str);

    public static final native long UIAnnotationAssetItemUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationAssetItemUIMore_className();

    public static final native long UIAnnotationAssetItemUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native int UIAnnotationAssetItemUIMore_getAssetIndex(long j, UIAnnotationAssetItemUIMore uIAnnotationAssetItemUIMore);

    public static final native String UIAnnotationAssetItemUIMore_getClassName(long j, UIAnnotationAssetItemUIMore uIAnnotationAssetItemUIMore);

    public static final native int UIAnnotationAssetItemUIMore_getUIType(long j, UIAnnotationAssetItemUIMore uIAnnotationAssetItemUIMore);

    public static final native long UIAnnotationAssetItem_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationAssetItem_className();

    public static final native long UIAnnotationAssetItem_dynamicCast__SWIG_0(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationAssetItem_getClassName(long j, UIAnnotationAssetItem uIAnnotationAssetItem);

    public static final native void UIAnnotationAssetItem_injectUIAnnotation();

    public static final native int UIAnnotationAssetUIMoreAlgorithmRequirement_getAlbumFilter(long j, UIAnnotationAssetUIMoreAlgorithmRequirement uIAnnotationAssetUIMoreAlgorithmRequirement);

    public static final native long UIAnnotationAssetUIMoreAlgorithmRequirement_getAlgPreprocess(long j, UIAnnotationAssetUIMoreAlgorithmRequirement uIAnnotationAssetUIMoreAlgorithmRequirement);

    public static final native long UIAnnotationAssetUIMoreAlgorithmRequirement_getAlgs(long j, UIAnnotationAssetUIMoreAlgorithmRequirement uIAnnotationAssetUIMoreAlgorithmRequirement);

    public static final native boolean UIAnnotationAssetUIMoreAlgorithmRequirement_getNeedAlgPreprocess(long j, UIAnnotationAssetUIMoreAlgorithmRequirement uIAnnotationAssetUIMoreAlgorithmRequirement);

    public static final native String UIAnnotationAssetUIMoreAlgorithmRequirement_getRelation(long j, UIAnnotationAssetUIMoreAlgorithmRequirement uIAnnotationAssetUIMoreAlgorithmRequirement);

    public static final native boolean UIAnnotationAssetUIMoreAutoCutting_getEnabled(long j, UIAnnotationAssetUIMoreAutoCutting uIAnnotationAssetUIMoreAutoCutting);

    public static final native double UIAnnotationAssetUIMoreAutoCutting_getHeight(long j, UIAnnotationAssetUIMoreAutoCutting uIAnnotationAssetUIMoreAutoCutting);

    public static final native double UIAnnotationAssetUIMoreAutoCutting_getWidth(long j, UIAnnotationAssetUIMoreAutoCutting uIAnnotationAssetUIMoreAutoCutting);

    public static final native double UIAnnotationAssetUIMoreMaxSize_getHeight(long j, UIAnnotationAssetUIMoreMaxSize uIAnnotationAssetUIMoreMaxSize);

    public static final native double UIAnnotationAssetUIMoreMaxSize_getWidth(long j, UIAnnotationAssetUIMoreMaxSize uIAnnotationAssetUIMoreMaxSize);

    public static final native long UIAnnotationAssetUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationAssetUIMore_className();

    public static final native long UIAnnotationAssetUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native long UIAnnotationAssetUIMore_getAlgorithmRequirement(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native int UIAnnotationAssetUIMore_getAssetType(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native long UIAnnotationAssetUIMore_getAutoCutting(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native String UIAnnotationAssetUIMore_getClassName(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native long UIAnnotationAssetUIMore_getCurrentValue(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native String UIAnnotationAssetUIMore_getFrom(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native String UIAnnotationAssetUIMore_getImgKey(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native long UIAnnotationAssetUIMore_getLastValue(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native int UIAnnotationAssetUIMore_getMaxCount(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native long UIAnnotationAssetUIMore_getMaxSize(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native int UIAnnotationAssetUIMore_getMinCount(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native boolean UIAnnotationAssetUIMore_getNeedGuide(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native boolean UIAnnotationAssetUIMore_getNeedLoading(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native long UIAnnotationAssetUIMore_getOriginalValue(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native boolean UIAnnotationAssetUIMore_getShowOnStart(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native long UIAnnotationAssetUIMore_getSuffixes(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native int UIAnnotationAssetUIMore_getUIType(long j, UIAnnotationAssetUIMore uIAnnotationAssetUIMore);

    public static final native long UIAnnotationAsset_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationAsset_className();

    public static final native long UIAnnotationAsset_dynamicCast__SWIG_0(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationAsset_getCallbackType(long j, UIAnnotationAsset uIAnnotationAsset);

    public static final native String UIAnnotationAsset_getClassName(long j, UIAnnotationAsset uIAnnotationAsset);

    public static final native void UIAnnotationAsset_injectUIAnnotation();

    public static final native int UIAnnotationAsset_refreshAnnotationPreview(long j, UIAnnotationAsset uIAnnotationAsset);

    public static final native void UIAnnotationAsset_updateValue__SWIG_0(long j, UIAnnotationAsset uIAnnotationAsset, long j2, EEStdStringVector eEStdStringVector);

    public static final native void UIAnnotationAsset_updateValue__SWIG_1(long j, UIAnnotationAsset uIAnnotationAsset, long j2, EEStdStringVector eEStdStringVector, int i, long j3, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native long UIAnnotationBasePtrVector_capacity(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector);

    public static final native void UIAnnotationBasePtrVector_clear(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector);

    public static final native void UIAnnotationBasePtrVector_doAdd__SWIG_0(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector, long j2, UIAnnotationBase uIAnnotationBase);

    public static final native void UIAnnotationBasePtrVector_doAdd__SWIG_1(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector, int i, long j2, UIAnnotationBase uIAnnotationBase);

    public static final native long UIAnnotationBasePtrVector_doGet(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector, int i);

    public static final native long UIAnnotationBasePtrVector_doRemove(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector, int i);

    public static final native void UIAnnotationBasePtrVector_doRemoveRange(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector, int i, int i2);

    public static final native long UIAnnotationBasePtrVector_doSet(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector, int i, long j2, UIAnnotationBase uIAnnotationBase);

    public static final native int UIAnnotationBasePtrVector_doSize(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector);

    public static final native boolean UIAnnotationBasePtrVector_isEmpty(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector);

    public static final native void UIAnnotationBasePtrVector_reserve(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector, long j2);

    public static final native String UIAnnotationBase_className();

    public static final native String UIAnnotationBase_getCallbackJsonString(long j, UIAnnotationBase uIAnnotationBase);

    public static final native long UIAnnotationBase_getCategory(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationBase_getClassName(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationBase_getName(long j, UIAnnotationBase uIAnnotationBase);

    public static final native long UIAnnotationBase_getUIMore(long j, UIAnnotationBase uIAnnotationBase);

    public static final native int UIAnnotationBase_getUIType(long j, UIAnnotationBase uIAnnotationBase);

    public static final native void UIAnnotationBase_injectUIAnnotation();

    public static final native int UIAnnotationBase_refreshAnnotationPreview(long j, UIAnnotationBase uIAnnotationBase);

    public static final native void UIAnnotationBase_updateValue__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, int i);

    public static final native void UIAnnotationBase_updateValue__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, int i, int i2, long j2, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native void UIAnnotationBase_updateValue__SWIG_2(long j, UIAnnotationBase uIAnnotationBase, float f);

    public static final native void UIAnnotationBase_updateValue__SWIG_3(long j, UIAnnotationBase uIAnnotationBase, float f, int i, long j2, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native void UIAnnotationBase_updateValue__SWIG_4(long j, UIAnnotationBase uIAnnotationBase, double d);

    public static final native void UIAnnotationBase_updateValue__SWIG_5(long j, UIAnnotationBase uIAnnotationBase, double d, int i, long j2, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native void UIAnnotationBase_updateValue__SWIG_6(long j, UIAnnotationBase uIAnnotationBase, String str);

    public static final native void UIAnnotationBase_updateValue__SWIG_7(long j, UIAnnotationBase uIAnnotationBase, String str, int i, long j2, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native void UIAnnotationBase_updateValue__SWIG_8(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringVector eEStdStringVector);

    public static final native void UIAnnotationBase_updateValue__SWIG_9(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringVector eEStdStringVector, int i, long j3, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native long UIAnnotationCacheUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationCacheUIMore_className();

    public static final native long UIAnnotationCacheUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String UIAnnotationCacheUIMore_getClassName(long j, UIAnnotationCacheUIMore uIAnnotationCacheUIMore);

    public static final native String UIAnnotationCacheUIMore_getCurrentValue(long j, UIAnnotationCacheUIMore uIAnnotationCacheUIMore);

    public static final native String UIAnnotationCacheUIMore_getLastValue(long j, UIAnnotationCacheUIMore uIAnnotationCacheUIMore);

    public static final native String UIAnnotationCacheUIMore_getOriginalValue(long j, UIAnnotationCacheUIMore uIAnnotationCacheUIMore);

    public static final native int UIAnnotationCacheUIMore_getUIType(long j, UIAnnotationCacheUIMore uIAnnotationCacheUIMore);

    public static final native long UIAnnotationCache_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationCache_className();

    public static final native long UIAnnotationCache_dynamicCast__SWIG_0(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationCache_getClassName(long j, UIAnnotationCache uIAnnotationCache);

    public static final native void UIAnnotationCache_injectUIAnnotation();

    public static final native int UIAnnotationCache_refreshAnnotationPreview(long j, UIAnnotationCache uIAnnotationCache);

    public static final native void UIAnnotationCache_updateValue__SWIG_0(long j, UIAnnotationCache uIAnnotationCache, String str);

    public static final native void UIAnnotationCache_updateValue__SWIG_1(long j, UIAnnotationCache uIAnnotationCache, String str, int i, long j2, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native long UIAnnotationCategoryPtrVector_capacity(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector);

    public static final native void UIAnnotationCategoryPtrVector_clear(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector);

    public static final native void UIAnnotationCategoryPtrVector_doAdd__SWIG_0(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector, long j2, UIAnnotationCategory uIAnnotationCategory);

    public static final native void UIAnnotationCategoryPtrVector_doAdd__SWIG_1(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector, int i, long j2, UIAnnotationCategory uIAnnotationCategory);

    public static final native long UIAnnotationCategoryPtrVector_doGet(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector, int i);

    public static final native long UIAnnotationCategoryPtrVector_doRemove(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector, int i);

    public static final native void UIAnnotationCategoryPtrVector_doRemoveRange(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector, int i, int i2);

    public static final native long UIAnnotationCategoryPtrVector_doSet(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector, int i, long j2, UIAnnotationCategory uIAnnotationCategory);

    public static final native int UIAnnotationCategoryPtrVector_doSize(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector);

    public static final native boolean UIAnnotationCategoryPtrVector_isEmpty(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector);

    public static final native void UIAnnotationCategoryPtrVector_reserve(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector, long j2);

    public static final native String UIAnnotationCategory_getIconPath(long j, UIAnnotationCategory uIAnnotationCategory);

    public static final native String UIAnnotationCategory_getName(long j, UIAnnotationCategory uIAnnotationCategory);

    public static final native int UIAnnotationChangedTypeUtils_fromAssetType(int i);

    public static final native void UIAnnotationCompletion_change_ownership(UIAnnotationCompletion uIAnnotationCompletion, long j, boolean z);

    public static final native void UIAnnotationCompletion_director_connect(UIAnnotationCompletion uIAnnotationCompletion, long j, boolean z, boolean z2);

    public static final native void UIAnnotationCompletion_onError(long j, UIAnnotationCompletion uIAnnotationCompletion, int i);

    public static final native void UIAnnotationCompletion_onSuccess(long j, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native void UIAnnotationError_addErrorCode(long j, UIAnnotationError uIAnnotationError, int i);

    public static final native int UIAnnotationError_getErrorCode(long j, UIAnnotationError uIAnnotationError);

    public static final native void UIAnnotationError_removeErrorCode(long j, UIAnnotationError uIAnnotationError, int i);

    public static final native void UIAnnotationError_setErrorCode(long j, UIAnnotationError uIAnnotationError, int i);

    public static final native long UIAnnotationOptionItemVector_capacity(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector);

    public static final native void UIAnnotationOptionItemVector_clear(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector);

    public static final native void UIAnnotationOptionItemVector_doAdd__SWIG_0(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector, long j2, UIAnnotationOptionItem uIAnnotationOptionItem);

    public static final native void UIAnnotationOptionItemVector_doAdd__SWIG_1(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector, int i, long j2, UIAnnotationOptionItem uIAnnotationOptionItem);

    public static final native long UIAnnotationOptionItemVector_doGet(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector, int i);

    public static final native long UIAnnotationOptionItemVector_doRemove(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector, int i);

    public static final native void UIAnnotationOptionItemVector_doRemoveRange(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector, int i, int i2);

    public static final native long UIAnnotationOptionItemVector_doSet(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector, int i, long j2, UIAnnotationOptionItem uIAnnotationOptionItem);

    public static final native int UIAnnotationOptionItemVector_doSize(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector);

    public static final native boolean UIAnnotationOptionItemVector_isEmpty(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector);

    public static final native void UIAnnotationOptionItemVector_reserve(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector, long j2);

    public static final native String UIAnnotationOptionItem_iconPath_get(long j, UIAnnotationOptionItem uIAnnotationOptionItem);

    public static final native void UIAnnotationOptionItem_iconPath_set(long j, UIAnnotationOptionItem uIAnnotationOptionItem, String str);

    public static final native String UIAnnotationOptionItem_itemKey_get(long j, UIAnnotationOptionItem uIAnnotationOptionItem);

    public static final native void UIAnnotationOptionItem_itemKey_set(long j, UIAnnotationOptionItem uIAnnotationOptionItem, String str);

    public static final native String UIAnnotationOptionItem_itemName_get(long j, UIAnnotationOptionItem uIAnnotationOptionItem);

    public static final native void UIAnnotationOptionItem_itemName_set(long j, UIAnnotationOptionItem uIAnnotationOptionItem, String str);

    public static final native long UIAnnotationOptionListUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationOptionListUIMore_className();

    public static final native long UIAnnotationOptionListUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native long UIAnnotationOptionListUIMore_getCandidates(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native String UIAnnotationOptionListUIMore_getClassName(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native long UIAnnotationOptionListUIMore_getCurrentValue(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native long UIAnnotationOptionListUIMore_getLastValue(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native String UIAnnotationOptionListUIMore_getLokiPanelCategory(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native String UIAnnotationOptionListUIMore_getLokiPanelName(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native int UIAnnotationOptionListUIMore_getMaxSelection(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native int UIAnnotationOptionListUIMore_getMinSelection(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native String UIAnnotationOptionListUIMore_getOptionListKey(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native String UIAnnotationOptionListUIMore_getOptionListName(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native int UIAnnotationOptionListUIMore_getOptionUIType(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native long UIAnnotationOptionListUIMore_getOriginalValue(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native double UIAnnotationOptionListUIMore_getPreferredItemHeight(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native double UIAnnotationOptionListUIMore_getPreferredItemRadius(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native double UIAnnotationOptionListUIMore_getPreferredItemWidth(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native int UIAnnotationOptionListUIMore_getUIType(long j, UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore);

    public static final native long UIAnnotationOptionList_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationOptionList_className();

    public static final native long UIAnnotationOptionList_dynamicCast__SWIG_0(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationOptionList_getClassName(long j, UIAnnotationOptionList uIAnnotationOptionList);

    public static final native void UIAnnotationOptionList_injectUIAnnotation();

    public static final native int UIAnnotationOptionList_refreshAnnotationPreview(long j, UIAnnotationOptionList uIAnnotationOptionList);

    public static final native void UIAnnotationOptionList_updateValue__SWIG_0(long j, UIAnnotationOptionList uIAnnotationOptionList, long j2, EEStdStringVector eEStdStringVector);

    public static final native void UIAnnotationOptionList_updateValue__SWIG_1(long j, UIAnnotationOptionList uIAnnotationOptionList, long j2, EEStdStringVector eEStdStringVector, int i, long j3, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native void UIAnnotationParserExportHandle_change_ownership(UIAnnotationParserExportHandle uIAnnotationParserExportHandle, long j, boolean z);

    public static final native void UIAnnotationParserExportHandle_director_connect(UIAnnotationParserExportHandle uIAnnotationParserExportHandle, long j, boolean z, boolean z2);

    public static final native int UIAnnotationParserExportHandle_effectExportSticker(long j, UIAnnotationParserExportHandle uIAnnotationParserExportHandle, String str);

    public static final native void UIAnnotationParser_addTag(long j, UIAnnotationParser uIAnnotationParser, String str);

    public static final native boolean UIAnnotationParser_getHasAnnotationChanged(long j, UIAnnotationParser uIAnnotationParser);

    public static final native boolean UIAnnotationParser_getStickerPathChanged(long j, UIAnnotationParser uIAnnotationParser);

    public static final native long UIAnnotationParser_getTags(long j, UIAnnotationParser uIAnnotationParser);

    public static final native long UIAnnotationParser_getUIAnnotationCategoryVector(long j, UIAnnotationParser uIAnnotationParser);

    public static final native long UIAnnotationParser_getUIAnnotationVector(long j, UIAnnotationParser uIAnnotationParser, long j2, UIAnnotationError uIAnnotationError);

    public static final native boolean UIAnnotationParser_hasTag(long j, UIAnnotationParser uIAnnotationParser, String str);

    public static final native void UIAnnotationParser_markHasAnnotationChanged(long j, UIAnnotationParser uIAnnotationParser);

    public static final native void UIAnnotationParser_markNoAnnotationChanged(long j, UIAnnotationParser uIAnnotationParser);

    public static final native void UIAnnotationParser_markStickerChanged(long j, UIAnnotationParser uIAnnotationParser);

    public static final native void UIAnnotationParser_removeTag(long j, UIAnnotationParser uIAnnotationParser, String str);

    public static final native int UIAnnotationParser_saveSticker(long j, UIAnnotationParser uIAnnotationParser, String str, long j2, UIAnnotationParserExportHandle uIAnnotationParserExportHandle);

    public static final native void UIAnnotationParser_setLocalePath(long j, UIAnnotationParser uIAnnotationParser, String str);

    public static final native void UIAnnotationParser_setStickerPath(long j, UIAnnotationParser uIAnnotationParser, String str);

    public static final native long UIAnnotationSliderUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationSliderUIMore_className();

    public static final native long UIAnnotationSliderUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String UIAnnotationSliderUIMore_getClassName(long j, UIAnnotationSliderUIMore uIAnnotationSliderUIMore);

    public static final native double UIAnnotationSliderUIMore_getCurrentValue(long j, UIAnnotationSliderUIMore uIAnnotationSliderUIMore);

    public static final native double UIAnnotationSliderUIMore_getLastValue(long j, UIAnnotationSliderUIMore uIAnnotationSliderUIMore);

    public static final native double UIAnnotationSliderUIMore_getMaxValue(long j, UIAnnotationSliderUIMore uIAnnotationSliderUIMore);

    public static final native double UIAnnotationSliderUIMore_getMinValue(long j, UIAnnotationSliderUIMore uIAnnotationSliderUIMore);

    public static final native double UIAnnotationSliderUIMore_getOriginalValue(long j, UIAnnotationSliderUIMore uIAnnotationSliderUIMore);

    public static final native double UIAnnotationSliderUIMore_getStepValue(long j, UIAnnotationSliderUIMore uIAnnotationSliderUIMore);

    public static final native int UIAnnotationSliderUIMore_getUIType(long j, UIAnnotationSliderUIMore uIAnnotationSliderUIMore);

    public static final native long UIAnnotationSlider_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationSlider_className();

    public static final native long UIAnnotationSlider_dynamicCast__SWIG_0(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationSlider_getClassName(long j, UIAnnotationSlider uIAnnotationSlider);

    public static final native void UIAnnotationSlider_injectUIAnnotation();

    public static final native int UIAnnotationSlider_refreshAnnotationPreview(long j, UIAnnotationSlider uIAnnotationSlider);

    public static final native void UIAnnotationSlider_updateValue__SWIG_0(long j, UIAnnotationSlider uIAnnotationSlider, double d);

    public static final native void UIAnnotationSlider_updateValue__SWIG_1(long j, UIAnnotationSlider uIAnnotationSlider, double d, int i, long j2, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native long UIAnnotationTextInputUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationTextInputUIMore_className();

    public static final native long UIAnnotationTextInputUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String UIAnnotationTextInputUIMore_getClassName(long j, UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore);

    public static final native String UIAnnotationTextInputUIMore_getCurrentValue(long j, UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore);

    public static final native String UIAnnotationTextInputUIMore_getHintText(long j, UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore);

    public static final native String UIAnnotationTextInputUIMore_getLastValue(long j, UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore);

    public static final native int UIAnnotationTextInputUIMore_getMaxCount(long j, UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore);

    public static final native int UIAnnotationTextInputUIMore_getMinCount(long j, UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore);

    public static final native String UIAnnotationTextInputUIMore_getOriginalValue(long j, UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore);

    public static final native int UIAnnotationTextInputUIMore_getUIType(long j, UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore);

    public static final native long UIAnnotationTextInput_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationTextInput_className();

    public static final native long UIAnnotationTextInput_dynamicCast__SWIG_0(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationTextInput_getClassName(long j, UIAnnotationTextInput uIAnnotationTextInput);

    public static final native void UIAnnotationTextInput_injectUIAnnotation();

    public static final native int UIAnnotationTextInput_refreshAnnotationPreview(long j, UIAnnotationTextInput uIAnnotationTextInput);

    public static final native void UIAnnotationTextInput_updateValue__SWIG_0(long j, UIAnnotationTextInput uIAnnotationTextInput, String str);

    public static final native void UIAnnotationTextInput_updateValue__SWIG_1(long j, UIAnnotationTextInput uIAnnotationTextInput, String str, int i, long j2, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native String UIAnnotationUIMore_className();

    public static final native String UIAnnotationUIMore_getClassName(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native int UIAnnotationUIMore_getUIType(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native void delete_EEEffectHandle(long j);

    public static final native void delete_EEStdStringToStringMap(long j);

    public static final native void delete_EEStdStringToStringMap_Iterator(long j);

    public static final native void delete_EEStdStringToStringUnorderedMap(long j);

    public static final native void delete_EEStdStringToStringUnorderedMapList(long j);

    public static final native void delete_EEStdStringToStringUnorderedMap_Iterator(long j);

    public static final native void delete_EEStdStringVector(long j);

    public static final native void delete_EffectHandleGetter(long j);

    public static final native void delete_EffectMessageCenter(long j);

    public static final native void delete_UIAnnotationAsset(long j);

    public static final native void delete_UIAnnotationAssetItem(long j);

    public static final native void delete_UIAnnotationAssetItemUIMore(long j);

    public static final native void delete_UIAnnotationAssetUIMore(long j);

    public static final native void delete_UIAnnotationAssetUIMoreAlgorithmRequirement(long j);

    public static final native void delete_UIAnnotationAssetUIMoreAutoCutting(long j);

    public static final native void delete_UIAnnotationAssetUIMoreMaxSize(long j);

    public static final native void delete_UIAnnotationBase(long j);

    public static final native void delete_UIAnnotationBasePtrVector(long j);

    public static final native void delete_UIAnnotationCache(long j);

    public static final native void delete_UIAnnotationCacheUIMore(long j);

    public static final native void delete_UIAnnotationCategory(long j);

    public static final native void delete_UIAnnotationCategoryPtrVector(long j);

    public static final native void delete_UIAnnotationCompletion(long j);

    public static final native void delete_UIAnnotationError(long j);

    public static final native void delete_UIAnnotationOptionItem(long j);

    public static final native void delete_UIAnnotationOptionItemVector(long j);

    public static final native void delete_UIAnnotationOptionList(long j);

    public static final native void delete_UIAnnotationOptionListUIMore(long j);

    public static final native void delete_UIAnnotationParser(long j);

    public static final native void delete_UIAnnotationParserExportHandle(long j);

    public static final native void delete_UIAnnotationSlider(long j);

    public static final native void delete_UIAnnotationSliderUIMore(long j);

    public static final native void delete_UIAnnotationTextInput(long j);

    public static final native void delete_UIAnnotationTextInputUIMore(long j);

    public static final native void delete_UIAnnotationUIMore(long j);

    public static final native String kChangeValueFromNormal();

    public static final native String kCurrentValue();

    public static final native String kCurrentValueFromCpp();

    public static final native String kCurrentValueFromProperty();

    public static final native String kCurrentValueFromScript();

    public static final native String kCurrentValueGetFrom();

    public static final native String kHowToGetCurrentValue();

    public static final native String kNumberDisplayMode();

    public static final native int kSaveStickerMessageID();

    public static final native String kUIAnnotationAlgorithmConfigJson();

    public static final native String kUIAnnotationAssetFirstPathInSticker();

    public static final native String kUIAnnotationCallback();

    public static final native int kUIAnnotationCallbackDone();

    public static final native String kUIAnnotationCallbackMore();

    public static final native String kUIAnnotationCallbackMoreChangedForAction();

    public static final native String kUIAnnotationCallbackMoreChangedValue();

    public static final native String kUIAnnotationCallbackMoreCustomAssetUUID();

    public static final native String kUIAnnotationCallbackMoreFunction();

    public static final native String kUIAnnotationCallbackMoreFunctionOneToMany();

    public static final native String kUIAnnotationCallbackMoreFunctionOneToOne();

    public static final native String kUIAnnotationCallbackMoreFunctionSingle();

    public static final native String kUIAnnotationCallbackMoreKey();

    public static final native String kUIAnnotationCallbackMoreMethod();

    public static final native String kUIAnnotationCallbackMorePartID();

    public static final native String kUIAnnotationCallbackMoreProperty();

    public static final native String kUIAnnotationCallbackMoreScriptMethod();

    public static final native String kUIAnnotationCallbackMoreType();

    public static final native String kUIAnnotationCallbackMores();

    public static final native int kUIAnnotationCallbackTimeout();

    public static final native String kUIAnnotationCallbackToken();

    public static final native String kUIAnnotationCallbackType();

    public static final native String kUIAnnotationCallbackTypeVlExtra();

    public static final native String kUIAnnotationCategory();

    public static final native String kUIAnnotationCategoryIconPath();

    public static final native String kUIAnnotationCategoryName();

    public static final native String kUIAnnotationConfigJson();

    public static final native String kUIAnnotationExtraAsTemplate();

    public static final native String kUIAnnotationExtraEditor();

    public static final native String kUIAnnotationExtraEditorAnnotation();

    public static final native String kUIAnnotationExtraEditorVersion();

    public static final native String kUIAnnotationExtraJson();

    public static final native String kUIAnnotationExtraTags();

    public static final native int kUIAnnotationFromEffectMessageID();

    public static final native String kUIAnnotationKey();

    public static final native String kUIAnnotationKeyFrame();

    public static final native String kUIAnnotationMainAnnotationLink();

    public static final native String kUIAnnotationMainAnnotationScript();

    public static final native String kUIAnnotationMainAnnotationSlots();

    public static final native String kUIAnnotationMainAnnotationVersion();

    public static final native int kUIAnnotationMessageContinue();

    public static final native int kUIAnnotationMessageEnd();

    public static final native int kUIAnnotationMessageID();

    public static final native String kUIAnnotationName();

    public static final native String kUIAnnotationTransJson();

    public static final native String kUIAnnotationTransformChangedForHash();

    public static final native String kUIAnnotationUI();

    public static final native String kUIAnnotationUIMore();

    public static final native String kUIAnnotationUIMoreCurrentValue();

    public static final native String kUIAnnotationUIMoreDefaultValue();

    public static final native String kUIAnnotationUIMoreMaxValue();

    public static final native String kUIAnnotationUIMoreMinValue();

    public static final native String kUIAnnotationUIMoreOriginalValue();

    public static final native String kUIAnnotationUIType();

    public static final native long new_EEStdStringToStringMap__SWIG_0();

    public static final native long new_EEStdStringToStringMap__SWIG_1(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native long new_EEStdStringToStringUnorderedMapList__SWIG_0();

    public static final native long new_EEStdStringToStringUnorderedMapList__SWIG_1(long j, EEStdStringToStringUnorderedMapList eEStdStringToStringUnorderedMapList);

    public static final native long new_EEStdStringToStringUnorderedMapList__SWIG_2(int i, long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native long new_EEStdStringToStringUnorderedMap__SWIG_0();

    public static final native long new_EEStdStringToStringUnorderedMap__SWIG_1(long j, EEStdStringToStringUnorderedMap eEStdStringToStringUnorderedMap);

    public static final native long new_EEStdStringVector__SWIG_0();

    public static final native long new_EEStdStringVector__SWIG_1(long j, EEStdStringVector eEStdStringVector);

    public static final native long new_EEStdStringVector__SWIG_2(int i, String str);

    public static final native long new_EffectHandleGetter();

    public static final native long new_UIAnnotationBasePtrVector__SWIG_0();

    public static final native long new_UIAnnotationBasePtrVector__SWIG_1(long j, UIAnnotationBasePtrVector uIAnnotationBasePtrVector);

    public static final native long new_UIAnnotationBasePtrVector__SWIG_2(int i, long j, UIAnnotationBase uIAnnotationBase);

    public static final native long new_UIAnnotationCategory(String str, String str2);

    public static final native long new_UIAnnotationCategoryPtrVector__SWIG_0();

    public static final native long new_UIAnnotationCategoryPtrVector__SWIG_1(long j, UIAnnotationCategoryPtrVector uIAnnotationCategoryPtrVector);

    public static final native long new_UIAnnotationCategoryPtrVector__SWIG_2(int i, long j, UIAnnotationCategory uIAnnotationCategory);

    public static final native long new_UIAnnotationCompletion();

    public static final native long new_UIAnnotationError();

    public static final native long new_UIAnnotationOptionItem();

    public static final native long new_UIAnnotationOptionItemVector__SWIG_0();

    public static final native long new_UIAnnotationOptionItemVector__SWIG_1(long j, UIAnnotationOptionItemVector uIAnnotationOptionItemVector);

    public static final native long new_UIAnnotationOptionItemVector__SWIG_2(int i, long j, UIAnnotationOptionItem uIAnnotationOptionItem);

    public static final native long new_UIAnnotationParser();

    public static final native long new_UIAnnotationParserExportHandle();

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static long SwigDirector_EffectHandleGetter_getEffectHandle(EffectHandleGetter effectHandleGetter) {
        return effectHandleGetter.getEffectHandle();
    }

    public static void SwigDirector_UIAnnotationCompletion_onSuccess(UIAnnotationCompletion uIAnnotationCompletion) {
        uIAnnotationCompletion.onSuccess();
    }

    public static void SwigDirector_UIAnnotationCompletion_onError(UIAnnotationCompletion uIAnnotationCompletion, int i) {
        uIAnnotationCompletion.onError(UIAnnotationErrorCode.swigToEnum(i));
    }

    public static int SwigDirector_UIAnnotationParserExportHandle_effectExportSticker(UIAnnotationParserExportHandle uIAnnotationParserExportHandle, String str) {
        return uIAnnotationParserExportHandle.effectExportSticker(str).swigValue();
    }
}
