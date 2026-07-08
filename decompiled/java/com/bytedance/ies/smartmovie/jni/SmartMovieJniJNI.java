package com.bytedance.ies.smartmovie.jni;

import X.C1967607nG;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback;
import com.bytedance.ies.nle.editor_jni.NLEResourceListDownloadCallback;
import com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;

/* JADX INFO: loaded from: classes23.dex */
public class SmartMovieJniJNI {
    public static final native void AndroidExecutor_cancel(long j, AndroidExecutor androidExecutor, long j2);

    public static final native void AndroidExecutor_change_ownership(AndroidExecutor androidExecutor, long j, boolean z);

    public static final native long AndroidExecutor_commitTask(long j, AndroidExecutor androidExecutor, long j2, Runnable runnable);

    public static final native void AndroidExecutor_director_connect(AndroidExecutor androidExecutor, long j, boolean z, boolean z2);

    public static final native long AndroidExecutor_postDelayedTask(long j, AndroidExecutor androidExecutor, long j2, Runnable runnable, long j3);

    public static final native String C3_get();

    public static final native void C3_set(String str);

    public static final native void CommonRequestCallback_change_ownership(CommonRequestCallback commonRequestCallback, long j, boolean z);

    public static final native void CommonRequestCallback_director_connect(CommonRequestCallback commonRequestCallback, long j, boolean z, boolean z2);

    public static final native void CommonRequestCallback_onFailure(long j, CommonRequestCallback commonRequestCallback, int i, String str, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void CommonRequestCallback_onSuccess(long j, CommonRequestCallback commonRequestCallback, String str);

    public static final native void CompressMetaCallback_change_ownership(CompressMetaCallback compressMetaCallback, long j, boolean z);

    public static final native void CompressMetaCallback_director_connect(CompressMetaCallback compressMetaCallback, long j, boolean z, boolean z2);

    public static final native void CompressMetaCallback_onFailure(long j, CompressMetaCallback compressMetaCallback, int i, String str, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void CompressMetaCallback_onSuccess(long j, CompressMetaCallback compressMetaCallback, long j2, VecMeta vecMeta);

    public static final native String DavinciResourceConfig_accessKey_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_accessKey_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_appID_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_appID_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_appVersion_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_appVersion_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_channel_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_channel_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native boolean DavinciResourceConfig_deleteLocalTosZip_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_deleteLocalTosZip_set(long j, DavinciResourceConfig davinciResourceConfig, boolean z);

    public static final native String DavinciResourceConfig_deviceId_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_deviceId_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_deviceType_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_deviceType_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_effectSdkVersion_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_effectSdkVersion_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native long DavinciResourceConfig_fetchThreadCount_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_fetchThreadCount_set(long j, DavinciResourceConfig davinciResourceConfig, long j2);

    public static final native String DavinciResourceConfig_language_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_language_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_modelApiHost_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_modelApiHost_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_modelCacheDir_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_modelCacheDir_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_models_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_models_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_platformSdkVersion_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_platformSdkVersion_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_platform_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_platform_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_region_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_region_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String DavinciResourceConfig_resourceCacheDir_get(long j, DavinciResourceConfig davinciResourceConfig);

    public static final native void DavinciResourceConfig_resourceCacheDir_set(long j, DavinciResourceConfig davinciResourceConfig, String str);

    public static final native String FACE_get();

    public static final native void FACE_set(String str);

    public static final native String IMAGE_get();

    public static final native void IMAGE_set(String str);

    public static final native void IMetaInfoDelegate_change_ownership(IMetaInfoDelegate iMetaInfoDelegate, long j, boolean z);

    public static final native void IMetaInfoDelegate_compressMeta(long j, IMetaInfoDelegate iMetaInfoDelegate, long j2, Meta meta, String str, boolean z, long j3, CommonRequestCallback commonRequestCallback);

    public static final native void IMetaInfoDelegate_director_connect(IMetaInfoDelegate iMetaInfoDelegate, long j, boolean z, boolean z2);

    public static final native long IMetaInfoDelegate_extractorFrame(long j, IMetaInfoDelegate iMetaInfoDelegate, long j2, UploadInfo uploadInfo, String str);

    public static final native long IMetaInfoDelegate_getCompressMetaInfo(long j, IMetaInfoDelegate iMetaInfoDelegate, long j2, Meta meta, String str);

    public static final native long IMetaInfoDelegate_getFrameTimeStamps(long j, IMetaInfoDelegate iMetaInfoDelegate, long j2, long j3, VecMeta vecMeta, long j4);

    public static final native void IMusicNetworkDelegate_cancel(long j, IMusicNetworkDelegate iMusicNetworkDelegate, String str);

    public static final native void IMusicNetworkDelegate_change_ownership(IMusicNetworkDelegate iMusicNetworkDelegate, long j, boolean z);

    public static final native void IMusicNetworkDelegate_director_connect(IMusicNetworkDelegate iMusicNetworkDelegate, long j, boolean z, boolean z2);

    public static final native void IMusicNetworkDelegate_request__SWIG_0(long j, IMusicNetworkDelegate iMusicNetworkDelegate, long j2, MusicRequestParams musicRequestParams, long j3, CommonRequestCallback commonRequestCallback, long j4, MusicRequestCallback musicRequestCallback);

    public static final native void IMusicNetworkDelegate_request__SWIG_1(long j, IMusicNetworkDelegate iMusicNetworkDelegate, long j2, MusicRequestParams musicRequestParams, long j3, CommonRequestCallback commonRequestCallback);

    public static final native void IMusicNetworkDelegate_request__SWIG_2(long j, IMusicNetworkDelegate iMusicNetworkDelegate, long j2, MusicRequestParams musicRequestParams);

    public static final native void INLEModelNetworkDelegate_cancel(long j, INLEModelNetworkDelegate iNLEModelNetworkDelegate, String str);

    public static final native void INLEModelNetworkDelegate_cancelSwigExplicitINLEModelNetworkDelegate(long j, INLEModelNetworkDelegate iNLEModelNetworkDelegate, String str);

    public static final native void INLEModelNetworkDelegate_change_ownership(INLEModelNetworkDelegate iNLEModelNetworkDelegate, long j, boolean z);

    public static final native void INLEModelNetworkDelegate_director_connect(INLEModelNetworkDelegate iNLEModelNetworkDelegate, long j, boolean z, boolean z2);

    public static final native void INLEModelNetworkDelegate_request__SWIG_0(long j, INLEModelNetworkDelegate iNLEModelNetworkDelegate, long j2, NLEModelRequestParams nLEModelRequestParams, long j3, NLEModelRequestCallback nLEModelRequestCallback);

    public static final native void INLEModelNetworkDelegate_request__SWIG_1(long j, INLEModelNetworkDelegate iNLEModelNetworkDelegate, long j2, NLEModelRequestParams nLEModelRequestParams);

    public static final native void ISmartMovieDownloaderListener_change_ownership(ISmartMovieDownloaderListener iSmartMovieDownloaderListener, long j, boolean z);

    public static final native void ISmartMovieDownloaderListener_director_connect(ISmartMovieDownloaderListener iSmartMovieDownloaderListener, long j, boolean z, boolean z2);

    public static final native void ISmartMovieDownloaderListener_onFailure(long j, ISmartMovieDownloaderListener iSmartMovieDownloaderListener, String str, int i, String str2);

    public static final native void ISmartMovieDownloaderListener_onProgress(long j, ISmartMovieDownloaderListener iSmartMovieDownloaderListener, float f);

    public static final native void ISmartMovieDownloaderListener_onSuccess(long j, ISmartMovieDownloaderListener iSmartMovieDownloaderListener, long j2);

    public static final native boolean ISmartMovieDownloader_cancelFetch(long j, ISmartMovieDownloader iSmartMovieDownloader, String str);

    public static final native void ISmartMovieDownloader_change_ownership(ISmartMovieDownloader iSmartMovieDownloader, long j, boolean z);

    public static final native void ISmartMovieDownloader_clearEpCache(long j, ISmartMovieDownloader iSmartMovieDownloader);

    public static final native void ISmartMovieDownloader_director_connect(ISmartMovieDownloader iSmartMovieDownloader, long j, boolean z, boolean z2);

    public static final native String ISmartMovieDownloader_fetchEffectList(long j, ISmartMovieDownloader iSmartMovieDownloader, long j2, VecStr vecStr, int i, long j3, ISmartMovieDownloaderListener iSmartMovieDownloaderListener);

    public static final native String ISmartMovieDownloader_fetchResourceList(long j, ISmartMovieDownloader iSmartMovieDownloader, long j2, VecStr vecStr, int i, long j3, ISmartMovieDownloaderListener iSmartMovieDownloaderListener);

    public static final native String ISmartMovieDownloader_fetch__SWIG_0(long j, ISmartMovieDownloader iSmartMovieDownloader, long j2, int i, boolean z, boolean z2, int i2, long j3, ISmartMovieDownloaderListener iSmartMovieDownloaderListener);

    public static final native void ISmartMovieDownloader_fetch__SWIG_1(long j, ISmartMovieDownloader iSmartMovieDownloader, String str, long j2, ISmartMovieDownloaderListener iSmartMovieDownloaderListener);

    public static final native String ISmartMovieDownloader_fetch__SWIG_2(long j, ISmartMovieDownloader iSmartMovieDownloader, long j2, VecStr vecStr, int i, long j3, ISmartMovieDownloaderListener iSmartMovieDownloaderListener);

    public static final native boolean ISmartMovieDownloader_hasCache(long j, ISmartMovieDownloader iSmartMovieDownloader, String str);

    public static final native boolean ISmartMovieDownloader_hasDavinciResourceCache(long j, ISmartMovieDownloader iSmartMovieDownloader, String str);

    public static final native boolean ISmartMovieDownloader_isNeedFetch(long j, ISmartMovieDownloader iSmartMovieDownloader, String str);

    public static final native void ISmartMovieDownloader_removeCachedFailedUrs(long j, ISmartMovieDownloader iSmartMovieDownloader, long j2, VecStr vecStr);

    public static final native void ITosDelegate_change_ownership(ITosDelegate iTosDelegate, long j, boolean z);

    public static final native void ITosDelegate_director_connect(ITosDelegate iTosDelegate, long j, boolean z, boolean z2);

    public static final native void ITosDelegate_getTosUrl__SWIG_0(long j, ITosDelegate iTosDelegate, String str, long j2, CommonRequestCallback commonRequestCallback);

    public static final native void ITosDelegate_getTosUrl__SWIG_1(long j, ITosDelegate iTosDelegate, String str);

    public static final native long Meta_getCreateTime(long j, Meta meta);

    public static final native long Meta_getDuration(long j, Meta meta);

    public static final native String Meta_getFileUriPath(long j, Meta meta);

    public static final native long Meta_getFrameTimeStamp(long j, Meta meta);

    public static final native boolean Meta_getHasAudio(long j, Meta meta);

    public static final native long Meta_getHeight(long j, Meta meta);

    public static final native long Meta_getIncludes(long j, Meta meta);

    public static final native long Meta_getMutableIncludes(long j, Meta meta);

    public static final native String Meta_getName(long j, Meta meta);

    public static final native String Meta_getPath(long j, Meta meta);

    public static final native long Meta_getRotation(long j, Meta meta);

    public static final native long Meta_getWidth(long j, Meta meta);

    public static final native boolean Meta_isVideoType(long j, Meta meta);

    public static final native void Meta_setCreateTime(long j, Meta meta, long j2);

    public static final native void Meta_setDuration(long j, Meta meta, long j2);

    public static final native void Meta_setFileUriPath(long j, Meta meta, String str);

    public static final native void Meta_setFrameTimeStamp(long j, Meta meta, long j2);

    public static final native void Meta_setHasAudio(long j, Meta meta, boolean z);

    public static final native void Meta_setHeight(long j, Meta meta, long j2);

    public static final native void Meta_setIncludes(long j, Meta meta, long j2, VecStr vecStr);

    public static final native void Meta_setIsVideo(long j, Meta meta, boolean z);

    public static final native void Meta_setName(long j, Meta meta, String str);

    public static final native void Meta_setPath(long j, Meta meta, String str);

    public static final native void Meta_setRotation(long j, Meta meta, long j2);

    public static final native void Meta_setWidth(long j, Meta meta, long j2);

    public static final native void MusicRequestCallback_change_ownership(MusicRequestCallback musicRequestCallback, long j, boolean z);

    public static final native void MusicRequestCallback_director_connect(MusicRequestCallback musicRequestCallback, long j, boolean z, boolean z2);

    public static final native void MusicRequestCallback_onInfoCallBack(long j, MusicRequestCallback musicRequestCallback, int i, float f, int i2, String str, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native int MusicRequestParams_getAccountType(long j, MusicRequestParams musicRequestParams);

    public static final native int MusicRequestParams_getCount(long j, MusicRequestParams musicRequestParams);

    public static final native String MusicRequestParams_getCreationId(long j, MusicRequestParams musicRequestParams);

    public static final native int MusicRequestParams_getCursor(long j, MusicRequestParams musicRequestParams);

    public static final native String MusicRequestParams_getExecId(long j, MusicRequestParams musicRequestParams);

    public static final native String MusicRequestParams_getExtra(long j, MusicRequestParams musicRequestParams);

    public static final native long MusicRequestParams_getExtraParams(long j, MusicRequestParams musicRequestParams);

    public static final native boolean MusicRequestParams_getIgnoreCompress(long j, MusicRequestParams musicRequestParams);

    public static final native boolean MusicRequestParams_getIgnoreExtractFeature(long j, MusicRequestParams musicRequestParams);

    public static final native String MusicRequestParams_getLabScene(long j, MusicRequestParams musicRequestParams);

    public static final native long MusicRequestParams_getMediaList(long j, MusicRequestParams musicRequestParams);

    public static final native String MusicRequestParams_getRecConfig(long j, MusicRequestParams musicRequestParams);

    public static final native int MusicRequestParams_getScene(long j, MusicRequestParams musicRequestParams);

    public static final native String MusicRequestParams_getZipLocalPath(long j, MusicRequestParams musicRequestParams);

    public static final native String MusicRequestParams_getZipUri(long j, MusicRequestParams musicRequestParams);

    public static final native boolean MusicRequestParams_isUploadZipBinary(long j, MusicRequestParams musicRequestParams);

    public static final native void MusicRequestParams_setAccountType(long j, MusicRequestParams musicRequestParams, int i);

    public static final native void MusicRequestParams_setCacheEffectList(long j, MusicRequestParams musicRequestParams, long j2, VecStr vecStr);

    public static final native void MusicRequestParams_setCount(long j, MusicRequestParams musicRequestParams, int i);

    public static final native void MusicRequestParams_setCreationId(long j, MusicRequestParams musicRequestParams, String str);

    public static final native void MusicRequestParams_setCursor(long j, MusicRequestParams musicRequestParams, int i);

    public static final native void MusicRequestParams_setExecId(long j, MusicRequestParams musicRequestParams, String str);

    public static final native void MusicRequestParams_setExtra(long j, MusicRequestParams musicRequestParams, String str);

    public static final native void MusicRequestParams_setExtraParams(long j, MusicRequestParams musicRequestParams, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void MusicRequestParams_setIgnoreCompress(long j, MusicRequestParams musicRequestParams, boolean z);

    public static final native void MusicRequestParams_setIgnoreExtractFeature(long j, MusicRequestParams musicRequestParams, boolean z);

    public static final native void MusicRequestParams_setLabScene(long j, MusicRequestParams musicRequestParams, String str);

    public static final native void MusicRequestParams_setMediaList(long j, MusicRequestParams musicRequestParams, long j2, VecMeta vecMeta);

    public static final native void MusicRequestParams_setReturnMovieConfig(long j, MusicRequestParams musicRequestParams, boolean z);

    public static final native void MusicRequestParams_setReturnNLEConfig(long j, MusicRequestParams musicRequestParams, boolean z);

    public static final native void MusicRequestParams_setScene(long j, MusicRequestParams musicRequestParams, int i);

    public static final native void MusicRequestParams_setUploadZipBinary(long j, MusicRequestParams musicRequestParams, boolean z);

    public static final native void MusicRequestParams_setUseResourceId(long j, MusicRequestParams musicRequestParams, boolean z);

    public static final native void MusicRequestParams_setZipLocalPath(long j, MusicRequestParams musicRequestParams, String str);

    public static final native void MusicRequestParams_setZipUri(long j, MusicRequestParams musicRequestParams, String str);

    public static final native void NLEModelRequestCallback_change_ownership(NLEModelRequestCallback nLEModelRequestCallback, long j, boolean z);

    public static final native void NLEModelRequestCallback_director_connect(NLEModelRequestCallback nLEModelRequestCallback, long j, boolean z, boolean z2);

    public static final native void NLEModelRequestCallback_onFailure(long j, NLEModelRequestCallback nLEModelRequestCallback, int i, String str, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void NLEModelRequestCallback_onSuccess(long j, NLEModelRequestCallback nLEModelRequestCallback, long j2, long j3, UnorderedMapStrStr unorderedMapStrStr);

    public static final native long NLEModelRequestParams_getCacheEffectList(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native boolean NLEModelRequestParams_getEnableAsyncRender(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native boolean NLEModelRequestParams_getEnableBatchFetch(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native String NLEModelRequestParams_getExecId(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native String NLEModelRequestParams_getExtra(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native long NLEModelRequestParams_getExtraParams(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native boolean NLEModelRequestParams_getIgnoreCompress(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native long NLEModelRequestParams_getInputList(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native String NLEModelRequestParams_getMusicId(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native String NLEModelRequestParams_getRecConfig(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native String NLEModelRequestParams_getRecKey(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native String NLEModelRequestParams_getTaskId(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native String NLEModelRequestParams_getTemplateJSON(long j, NLEModelRequestParams nLEModelRequestParams);

    public static final native void NLEModelRequestParams_setCacheEffectList(long j, NLEModelRequestParams nLEModelRequestParams, long j2, VecStr vecStr);

    public static final native void NLEModelRequestParams_setEnableAsyncRender(long j, NLEModelRequestParams nLEModelRequestParams, boolean z);

    public static final native void NLEModelRequestParams_setEnableBatchFetch(long j, NLEModelRequestParams nLEModelRequestParams, boolean z);

    public static final native void NLEModelRequestParams_setExecId(long j, NLEModelRequestParams nLEModelRequestParams, String str);

    public static final native void NLEModelRequestParams_setExtra(long j, NLEModelRequestParams nLEModelRequestParams, String str);

    public static final native void NLEModelRequestParams_setExtraParams(long j, NLEModelRequestParams nLEModelRequestParams, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void NLEModelRequestParams_setIgnoreCompress(long j, NLEModelRequestParams nLEModelRequestParams, boolean z);

    public static final native void NLEModelRequestParams_setInputList(long j, NLEModelRequestParams nLEModelRequestParams, long j2, VecMeta vecMeta);

    public static final native void NLEModelRequestParams_setIsFirstMusic(long j, NLEModelRequestParams nLEModelRequestParams, boolean z);

    public static final native void NLEModelRequestParams_setReturnMovieConfig(long j, NLEModelRequestParams nLEModelRequestParams, boolean z);

    public static final native void NLEModelRequestParams_setReturnNLEConfig(long j, NLEModelRequestParams nLEModelRequestParams, boolean z);

    public static final native void NLEModelRequestParams_setTemplateJSON(long j, NLEModelRequestParams nLEModelRequestParams, String str);

    public static final native void NLEModelRequestParams_setUseResourceId(long j, NLEModelRequestParams nLEModelRequestParams, boolean z);

    public static final native void NLEModelRequestProgressCallback_change_ownership(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j, boolean z);

    public static final native void NLEModelRequestProgressCallback_director_connect(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j, boolean z, boolean z2);

    public static final native void NLEModelRequestProgressCallback_onCompressDone(long j, NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j2, VecMeta vecMeta);

    public static final native void NLEModelRequestProgressCallback_onCompressProgress(long j, NLEModelRequestProgressCallback nLEModelRequestProgressCallback, float f);

    public static final native void NLEModelRequestProgressCallback_onFailure(long j, NLEModelRequestProgressCallback nLEModelRequestProgressCallback, String str, int i, String str2, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void NLEModelRequestProgressCallback_onFetchProgress(long j, NLEModelRequestProgressCallback nLEModelRequestProgressCallback, float f);

    public static final native void NLEModelRequestProgressCallback_onNeedFetch(long j, NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j2, VecStr vecStr);

    public static final native void NLEModelRequestProgressCallback_onResponse(long j, NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j2, long j3, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void NLEModelRequestProgressCallback_onSuccess(long j, NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j2, long j3, UnorderedMapStrStr unorderedMapStrStr);

    public static final native boolean PairBoolLong_first_get(long j, PairBoolLong pairBoolLong);

    public static final native void PairBoolLong_first_set(long j, PairBoolLong pairBoolLong, boolean z);

    public static final native long PairBoolLong_second_get(long j, PairBoolLong pairBoolLong);

    public static final native void PairBoolLong_second_set(long j, PairBoolLong pairBoolLong, long j2);

    public static final native long PictureInfo_SWIGSmartPtrUpcast(long j);

    public static final native long PictureInfo_picDataSize_get(long j, PictureInfo pictureInfo);

    public static final native void PictureInfo_picDataSize_set(long j, PictureInfo pictureInfo, long j2);

    public static final native String PictureInfo_picPtr_get(long j, PictureInfo pictureInfo);

    public static final native void PictureInfo_picPtr_set(long j, PictureInfo pictureInfo, String str);

    public static final native int PictureInfo_resizeHeight_get(long j, PictureInfo pictureInfo);

    public static final native void PictureInfo_resizeHeight_set(long j, PictureInfo pictureInfo, int i);

    public static final native String PictureInfo_resizePath_get(long j, PictureInfo pictureInfo);

    public static final native void PictureInfo_resizePath_set(long j, PictureInfo pictureInfo, String str);

    public static final native int PictureInfo_resizeWidth_get(long j, PictureInfo pictureInfo);

    public static final native void PictureInfo_resizeWidth_set(long j, PictureInfo pictureInfo, int i);

    public static final native void PictureInfo_setData(long j, PictureInfo pictureInfo, byte[] bArr);

    public static final native String RELATION_get();

    public static final native void RELATION_set(String str);

    public static final native void Runnable_change_ownership(Runnable runnable, long j, boolean z);

    public static final native void Runnable_director_connect(Runnable runnable, long j, boolean z, boolean z2);

    public static final native void Runnable_run(long j, Runnable runnable);

    public static final native String SALIENCY_get();

    public static final native void SALIENCY_set(String str);

    public static final native int SmartMovieConfig_bachExecutorPoolSize_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_bachExecutorPoolSize_set(long j, SmartMovieConfig smartMovieConfig, int i);

    public static final native long SmartMovieConfig_customAndroidExecutor_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_customAndroidExecutor_set(long j, SmartMovieConfig smartMovieConfig, long j2);

    public static final native long SmartMovieConfig_customDownloader_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_customDownloader_set(long j, SmartMovieConfig smartMovieConfig, long j2, ISmartMovieDownloader iSmartMovieDownloader);

    public static final native long SmartMovieConfig_davinciConfig_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_davinciConfig_set(long j, SmartMovieConfig smartMovieConfig, long j2, DavinciResourceConfig davinciResourceConfig);

    public static final native boolean SmartMovieConfig_enableCustomDownloader_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_enableCustomDownloader_set(long j, SmartMovieConfig smartMovieConfig, boolean z);

    public static final native long SmartMovieConfig_metaInfoDelegate_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_metaInfoDelegate_set(long j, SmartMovieConfig smartMovieConfig, long j2, IMetaInfoDelegate iMetaInfoDelegate);

    public static final native long SmartMovieConfig_musicNetworkDelegate_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_musicNetworkDelegate_set(long j, SmartMovieConfig smartMovieConfig, long j2, IMusicNetworkDelegate iMusicNetworkDelegate);

    public static final native long SmartMovieConfig_nleModelNetworkDelegate_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_nleModelNetworkDelegate_set(long j, SmartMovieConfig smartMovieConfig, long j2, INLEModelNetworkDelegate iNLEModelNetworkDelegate);

    public static final native long SmartMovieConfig_tosDelegate_get(long j, SmartMovieConfig smartMovieConfig);

    public static final native void SmartMovieConfig_tosDelegate_set(long j, SmartMovieConfig smartMovieConfig, long j2, ITosDelegate iTosDelegate);

    public static final native void SmartMovie_cancel(long j, SmartMovie smartMovie, String str);

    public static final native void SmartMovie_cancelCompressMeta(long j, SmartMovie smartMovie, String str);

    public static final native String SmartMovie_compressMeta(long j, SmartMovie smartMovie, long j2, VecMeta vecMeta, String str, long j3, CompressMetaCallback compressMetaCallback);

    public static final native String SmartMovie_fetchDavinciUrs(long j, SmartMovie smartMovie, String str, long j2, NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback);

    public static final native String SmartMovie_fetchDavinciUrsList(long j, SmartMovie smartMovie, long j2, VecStr vecStr, long j3, NLEResourceListDownloadCallback nLEResourceListDownloadCallback);

    public static final native String SmartMovie_fetchEffectList(long j, SmartMovie smartMovie, long j2, VecStr vecStr, long j3, NLEResourceListDownloadCallback nLEResourceListDownloadCallback);

    public static final native String SmartMovie_getMusicListResponse(long j, SmartMovie smartMovie, long j2, MusicRequestParams musicRequestParams, long j3, MusicRequestCallback musicRequestCallback);

    public static final native String SmartMovie_getNLEModel(long j, SmartMovie smartMovie, long j2, NLEModelRequestParams nLEModelRequestParams, long j3, NLEModelRequestProgressCallback nLEModelRequestProgressCallback);

    public static final native String SmartMovie_restore(long j, SmartMovie smartMovie, long j2, long j3, NLEResourceDownloadCallback nLEResourceDownloadCallback);

    public static final native void SmartMovie_setDownloader(long j, SmartMovie smartMovie, long j2, ISmartMovieDownloader iSmartMovieDownloader);

    public static final native String THEMEFEATURE_get();

    public static final native void THEMEFEATURE_set(String str);

    public static final native String UnorderedMapStrStr_Iterator_getKey(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native long UnorderedMapStrStr_Iterator_getNextUnchecked(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native String UnorderedMapStrStr_Iterator_getValue(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native boolean UnorderedMapStrStr_Iterator_isNot(long j, UnorderedMapStrStr.Iterator iterator, long j2, UnorderedMapStrStr.Iterator iterator2);

    public static final native void UnorderedMapStrStr_Iterator_setValue(long j, UnorderedMapStrStr.Iterator iterator, String str);

    public static final native long UnorderedMapStrStr_begin(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void UnorderedMapStrStr_clear(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native boolean UnorderedMapStrStr_containsImpl(long j, UnorderedMapStrStr unorderedMapStrStr, String str);

    public static final native long UnorderedMapStrStr_end(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native long UnorderedMapStrStr_find(long j, UnorderedMapStrStr unorderedMapStrStr, String str);

    public static final native boolean UnorderedMapStrStr_isEmpty(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void UnorderedMapStrStr_putUnchecked(long j, UnorderedMapStrStr unorderedMapStrStr, String str, String str2);

    public static final native void UnorderedMapStrStr_removeUnchecked(long j, UnorderedMapStrStr unorderedMapStrStr, long j2, UnorderedMapStrStr.Iterator iterator);

    public static final native int UnorderedMapStrStr_sizeImpl(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native long UploadInfo_duration_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_duration_set(long j, UploadInfo uploadInfo, long j2);

    public static final native long UploadInfo_frameTimeStamp_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_frameTimeStamp_set(long j, UploadInfo uploadInfo, long j2);

    public static final native boolean UploadInfo_hasAudio_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_hasAudio_set(long j, UploadInfo uploadInfo, boolean z);

    public static final native int UploadInfo_height_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_height_set(long j, UploadInfo uploadInfo, int i);

    public static final native boolean UploadInfo_isVideo_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_isVideo_set(long j, UploadInfo uploadInfo, boolean z);

    public static final native boolean UploadInfo_needFeature_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_needFeature_set(long j, UploadInfo uploadInfo, boolean z);

    public static final native String UploadInfo_path_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_path_set(long j, UploadInfo uploadInfo, String str);

    public static final native int UploadInfo_rotation_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_rotation_set(long j, UploadInfo uploadInfo, int i);

    public static final native int UploadInfo_width_get(long j, UploadInfo uploadInfo);

    public static final native void UploadInfo_width_set(long j, UploadInfo uploadInfo, int i);

    public static final native String VIDEO_get();

    public static final native void VIDEO_set(String str);

    public static final native void VecBachAlgorithmType_clear(long j, VecBachAlgorithmType vecBachAlgorithmType);

    public static final native void VecBachAlgorithmType_doAdd__SWIG_0(long j, VecBachAlgorithmType vecBachAlgorithmType, int i);

    public static final native void VecBachAlgorithmType_doAdd__SWIG_1(long j, VecBachAlgorithmType vecBachAlgorithmType, int i, int i2);

    public static final native int VecBachAlgorithmType_doCapacity(long j, VecBachAlgorithmType vecBachAlgorithmType);

    public static final native int VecBachAlgorithmType_doGet(long j, VecBachAlgorithmType vecBachAlgorithmType, int i);

    public static final native int VecBachAlgorithmType_doRemove(long j, VecBachAlgorithmType vecBachAlgorithmType, int i);

    public static final native void VecBachAlgorithmType_doRemoveRange(long j, VecBachAlgorithmType vecBachAlgorithmType, int i, int i2);

    public static final native void VecBachAlgorithmType_doReserve(long j, VecBachAlgorithmType vecBachAlgorithmType, int i);

    public static final native int VecBachAlgorithmType_doSet(long j, VecBachAlgorithmType vecBachAlgorithmType, int i, int i2);

    public static final native int VecBachAlgorithmType_doSize(long j, VecBachAlgorithmType vecBachAlgorithmType);

    public static final native boolean VecBachAlgorithmType_isEmpty(long j, VecBachAlgorithmType vecBachAlgorithmType);

    public static final native void VecBoolean_clear(long j, VecBoolean vecBoolean);

    public static final native void VecBoolean_doAdd__SWIG_0(long j, VecBoolean vecBoolean, boolean z);

    public static final native void VecBoolean_doAdd__SWIG_1(long j, VecBoolean vecBoolean, int i, boolean z);

    public static final native int VecBoolean_doCapacity(long j, VecBoolean vecBoolean);

    public static final native boolean VecBoolean_doGet(long j, VecBoolean vecBoolean, int i);

    public static final native boolean VecBoolean_doRemove(long j, VecBoolean vecBoolean, int i);

    public static final native void VecBoolean_doRemoveRange(long j, VecBoolean vecBoolean, int i, int i2);

    public static final native void VecBoolean_doReserve(long j, VecBoolean vecBoolean, int i);

    public static final native boolean VecBoolean_doSet(long j, VecBoolean vecBoolean, int i, boolean z);

    public static final native int VecBoolean_doSize(long j, VecBoolean vecBoolean);

    public static final native boolean VecBoolean_isEmpty(long j, VecBoolean vecBoolean);

    public static final native void VecLong_clear(long j, VecLong vecLong);

    public static final native void VecLong_doAdd__SWIG_0(long j, VecLong vecLong, long j2);

    public static final native void VecLong_doAdd__SWIG_1(long j, VecLong vecLong, int i, long j2);

    public static final native int VecLong_doCapacity(long j, VecLong vecLong);

    public static final native long VecLong_doGet(long j, VecLong vecLong, int i);

    public static final native long VecLong_doRemove(long j, VecLong vecLong, int i);

    public static final native void VecLong_doRemoveRange(long j, VecLong vecLong, int i, int i2);

    public static final native void VecLong_doReserve(long j, VecLong vecLong, int i);

    public static final native long VecLong_doSet(long j, VecLong vecLong, int i, long j2);

    public static final native int VecLong_doSize(long j, VecLong vecLong);

    public static final native boolean VecLong_isEmpty(long j, VecLong vecLong);

    public static final native void VecMeta_clear(long j, VecMeta vecMeta);

    public static final native void VecMeta_doAdd__SWIG_0(long j, VecMeta vecMeta, long j2, Meta meta);

    public static final native void VecMeta_doAdd__SWIG_1(long j, VecMeta vecMeta, int i, long j2, Meta meta);

    public static final native int VecMeta_doCapacity(long j, VecMeta vecMeta);

    public static final native long VecMeta_doGet(long j, VecMeta vecMeta, int i);

    public static final native long VecMeta_doRemove(long j, VecMeta vecMeta, int i);

    public static final native void VecMeta_doRemoveRange(long j, VecMeta vecMeta, int i, int i2);

    public static final native void VecMeta_doReserve(long j, VecMeta vecMeta, int i);

    public static final native long VecMeta_doSet(long j, VecMeta vecMeta, int i, long j2, Meta meta);

    public static final native int VecMeta_doSize(long j, VecMeta vecMeta);

    public static final native boolean VecMeta_isEmpty(long j, VecMeta vecMeta);

    public static final native void VecPairBoolLong_clear(long j, VecPairBoolLong vecPairBoolLong);

    public static final native void VecPairBoolLong_doAdd__SWIG_0(long j, VecPairBoolLong vecPairBoolLong, long j2, PairBoolLong pairBoolLong);

    public static final native void VecPairBoolLong_doAdd__SWIG_1(long j, VecPairBoolLong vecPairBoolLong, int i, long j2, PairBoolLong pairBoolLong);

    public static final native int VecPairBoolLong_doCapacity(long j, VecPairBoolLong vecPairBoolLong);

    public static final native long VecPairBoolLong_doGet(long j, VecPairBoolLong vecPairBoolLong, int i);

    public static final native long VecPairBoolLong_doRemove(long j, VecPairBoolLong vecPairBoolLong, int i);

    public static final native void VecPairBoolLong_doRemoveRange(long j, VecPairBoolLong vecPairBoolLong, int i, int i2);

    public static final native void VecPairBoolLong_doReserve(long j, VecPairBoolLong vecPairBoolLong, int i);

    public static final native long VecPairBoolLong_doSet(long j, VecPairBoolLong vecPairBoolLong, int i, long j2, PairBoolLong pairBoolLong);

    public static final native int VecPairBoolLong_doSize(long j, VecPairBoolLong vecPairBoolLong);

    public static final native boolean VecPairBoolLong_isEmpty(long j, VecPairBoolLong vecPairBoolLong);

    public static final native void VecStr_clear(long j, VecStr vecStr);

    public static final native void VecStr_doAdd__SWIG_0(long j, VecStr vecStr, String str);

    public static final native void VecStr_doAdd__SWIG_1(long j, VecStr vecStr, int i, String str);

    public static final native int VecStr_doCapacity(long j, VecStr vecStr);

    public static final native String VecStr_doGet(long j, VecStr vecStr, int i);

    public static final native String VecStr_doRemove(long j, VecStr vecStr, int i);

    public static final native void VecStr_doRemoveRange(long j, VecStr vecStr, int i, int i2);

    public static final native void VecStr_doReserve(long j, VecStr vecStr, int i);

    public static final native String VecStr_doSet(long j, VecStr vecStr, int i, String str);

    public static final native int VecStr_doSize(long j, VecStr vecStr);

    public static final native boolean VecStr_isEmpty(long j, VecStr vecStr);

    public static final native void delete_AndroidExecutor(long j);

    public static final native void delete_CommonRequestCallback(long j);

    public static final native void delete_CompressMetaCallback(long j);

    public static final native void delete_DavinciResourceConfig(long j);

    public static final native void delete_IMetaInfoDelegate(long j);

    public static final native void delete_IMusicNetworkDelegate(long j);

    public static final native void delete_INLEModelNetworkDelegate(long j);

    public static final native void delete_ISmartMovieDownloader(long j);

    public static final native void delete_ISmartMovieDownloaderListener(long j);

    public static final native void delete_ITosDelegate(long j);

    public static final native void delete_Meta(long j);

    public static final native void delete_MusicRequestCallback(long j);

    public static final native void delete_MusicRequestParams(long j);

    public static final native void delete_NLEModelRequestCallback(long j);

    public static final native void delete_NLEModelRequestParams(long j);

    public static final native void delete_NLEModelRequestProgressCallback(long j);

    public static final native void delete_PairBoolLong(long j);

    public static final native void delete_PictureInfo(long j);

    public static final native void delete_Runnable(long j);

    public static final native void delete_SmartMovie(long j);

    public static final native void delete_SmartMovieConfig(long j);

    public static final native void delete_UnorderedMapStrStr(long j);

    public static final native void delete_UnorderedMapStrStr_Iterator(long j);

    public static final native void delete_UploadInfo(long j);

    public static final native void delete_VecBachAlgorithmType(long j);

    public static final native void delete_VecBoolean(long j);

    public static final native void delete_VecLong(long j);

    public static final native void delete_VecMeta(long j);

    public static final native void delete_VecPairBoolLong(long j);

    public static final native void delete_VecStr(long j);

    public static final native long new_AndroidExecutor();

    public static final native long new_CommonRequestCallback();

    public static final native long new_CompressMetaCallback();

    public static final native long new_DavinciResourceConfig();

    public static final native long new_IMetaInfoDelegate();

    public static final native long new_IMusicNetworkDelegate();

    public static final native long new_INLEModelNetworkDelegate();

    public static final native long new_ISmartMovieDownloader();

    public static final native long new_ISmartMovieDownloaderListener();

    public static final native long new_ITosDelegate();

    public static final native long new_Meta();

    public static final native long new_MusicRequestCallback();

    public static final native long new_MusicRequestParams__SWIG_0();

    public static final native long new_MusicRequestParams__SWIG_1(int i, int i2, String str, String str2, int i3);

    public static final native long new_MusicRequestParams__SWIG_2(int i, int i2, String str, String str2, int i3, String str3);

    public static final native long new_MusicRequestParams__SWIG_3(int i, int i2, String str, String str2, int i3, boolean z, String str3);

    public static final native long new_NLEModelRequestCallback();

    public static final native long new_NLEModelRequestParams__SWIG_0(String str, String str2, long j, VecMeta vecMeta, long j2, VecStr vecStr, String str3);

    public static final native long new_NLEModelRequestParams__SWIG_1(String str, String str2, long j, VecMeta vecMeta, long j2, VecStr vecStr, String str3, boolean z);

    public static final native long new_NLEModelRequestParams__SWIG_2(String str, long j, VecMeta vecMeta, long j2, VecStr vecStr, String str2);

    public static final native long new_NLEModelRequestProgressCallback();

    public static final native long new_PairBoolLong__SWIG_0();

    public static final native long new_PairBoolLong__SWIG_1(boolean z, long j);

    public static final native long new_PairBoolLong__SWIG_2(long j, PairBoolLong pairBoolLong);

    public static final native long new_PictureInfo();

    public static final native long new_Runnable();

    public static final native long new_SmartMovie(long j, SmartMovieConfig smartMovieConfig);

    public static final native long new_SmartMovieConfig();

    public static final native long new_UnorderedMapStrStr__SWIG_0();

    public static final native long new_UnorderedMapStrStr__SWIG_1(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native long new_UploadInfo();

    public static final native long new_VecBachAlgorithmType__SWIG_0();

    public static final native long new_VecBachAlgorithmType__SWIG_1(long j, VecBachAlgorithmType vecBachAlgorithmType);

    public static final native long new_VecBachAlgorithmType__SWIG_2(int i, int i2);

    public static final native long new_VecBoolean__SWIG_0();

    public static final native long new_VecBoolean__SWIG_1(long j, VecBoolean vecBoolean);

    public static final native long new_VecBoolean__SWIG_2(int i, boolean z);

    public static final native long new_VecLong__SWIG_0();

    public static final native long new_VecLong__SWIG_1(long j, VecLong vecLong);

    public static final native long new_VecLong__SWIG_2(int i, long j);

    public static final native long new_VecMeta__SWIG_0();

    public static final native long new_VecMeta__SWIG_1(long j, VecMeta vecMeta);

    public static final native long new_VecMeta__SWIG_2(int i, long j, Meta meta);

    public static final native long new_VecPairBoolLong__SWIG_0();

    public static final native long new_VecPairBoolLong__SWIG_1(long j, VecPairBoolLong vecPairBoolLong);

    public static final native long new_VecPairBoolLong__SWIG_2(int i, long j, PairBoolLong pairBoolLong);

    public static final native long new_VecStr__SWIG_0();

    public static final native long new_VecStr__SWIG_1(long j, VecStr vecStr);

    public static final native long new_VecStr__SWIG_2(int i, String str);

    public static final native void swig_module_init();

    public static final native void throwException(String str);

    static {
        swig_module_init();
    }

    public static void SwigDirector_ISmartMovieDownloader_clearEpCache(ISmartMovieDownloader iSmartMovieDownloader) {
        iSmartMovieDownloader.clearEpCache();
    }

    public static void SwigDirector_Runnable_run(Runnable runnable) {
        Runnable_run(runnable.LIZ, runnable);
    }

    public static long SwigDirector_AndroidExecutor_commitTask(AndroidExecutor androidExecutor, long j) {
        Runnable runnable;
        if (j == 0) {
            runnable = null;
        } else {
            runnable = new Runnable(j);
        }
        return androidExecutor.commitTask(runnable);
    }

    public static void SwigDirector_CommonRequestCallback_onSuccess(CommonRequestCallback commonRequestCallback, String str) {
        commonRequestCallback.onSuccess(str);
    }

    public static void SwigDirector_CompressMetaCallback_onSuccess(CompressMetaCallback compressMetaCallback, long j) {
        VecMeta vecMeta;
        if (j == 0) {
            vecMeta = null;
        } else {
            vecMeta = new VecMeta(j);
        }
        compressMetaCallback.onSuccess(vecMeta);
    }

    public static void SwigDirector_IMusicNetworkDelegate_cancel(IMusicNetworkDelegate iMusicNetworkDelegate, String str) {
        iMusicNetworkDelegate.cancel(str);
    }

    public static void SwigDirector_IMusicNetworkDelegate_request__SWIG_2(IMusicNetworkDelegate iMusicNetworkDelegate, long j) {
        MusicRequestParams musicRequestParams;
        if (j == 0) {
            musicRequestParams = null;
        } else {
            musicRequestParams = new MusicRequestParams(j);
        }
        iMusicNetworkDelegate.request(musicRequestParams);
    }

    public static void SwigDirector_INLEModelNetworkDelegate_cancel(INLEModelNetworkDelegate iNLEModelNetworkDelegate, String str) {
        iNLEModelNetworkDelegate.cancel(str);
    }

    public static void SwigDirector_INLEModelNetworkDelegate_request__SWIG_1(INLEModelNetworkDelegate iNLEModelNetworkDelegate, long j) {
        NLEModelRequestParams nLEModelRequestParams;
        if (j == 0) {
            nLEModelRequestParams = null;
        } else {
            nLEModelRequestParams = new NLEModelRequestParams(j);
        }
        iNLEModelNetworkDelegate.request(nLEModelRequestParams);
    }

    public static void SwigDirector_ISmartMovieDownloaderListener_onProgress(ISmartMovieDownloaderListener iSmartMovieDownloaderListener, float f) {
        iSmartMovieDownloaderListener.onProgress(f);
    }

    public static void SwigDirector_ISmartMovieDownloaderListener_onSuccess(ISmartMovieDownloaderListener iSmartMovieDownloaderListener, long j) {
        NLEModel nLEModelLIZIZ;
        if (j == 0) {
            nLEModelLIZIZ = null;
        } else {
            nLEModelLIZIZ = C1967607nG.LIZIZ(j);
        }
        iSmartMovieDownloaderListener.onSuccess(nLEModelLIZIZ);
    }

    public static boolean SwigDirector_ISmartMovieDownloader_cancelFetch(ISmartMovieDownloader iSmartMovieDownloader, String str) {
        return iSmartMovieDownloader.cancelFetch(str);
    }

    public static boolean SwigDirector_ISmartMovieDownloader_hasCache(ISmartMovieDownloader iSmartMovieDownloader, String str) {
        return iSmartMovieDownloader.hasCache(str);
    }

    public static boolean SwigDirector_ISmartMovieDownloader_hasDavinciResourceCache(ISmartMovieDownloader iSmartMovieDownloader, String str) {
        return iSmartMovieDownloader.hasDavinciResourceCache(str);
    }

    public static boolean SwigDirector_ISmartMovieDownloader_isNeedFetch(ISmartMovieDownloader iSmartMovieDownloader, String str) {
        return iSmartMovieDownloader.isNeedFetch(str);
    }

    public static void SwigDirector_ISmartMovieDownloader_removeCachedFailedUrs(ISmartMovieDownloader iSmartMovieDownloader, long j) {
        VecStr vecStr;
        if (j == 0) {
            vecStr = null;
        } else {
            vecStr = new VecStr(j);
        }
        iSmartMovieDownloader.removeCachedFailedUrs(vecStr);
    }

    public static void SwigDirector_ITosDelegate_getTosUrl__SWIG_1(ITosDelegate iTosDelegate, String str) {
        iTosDelegate.getTosUrl(str);
    }

    public static void SwigDirector_NLEModelRequestProgressCallback_onCompressDone(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j) {
        VecMeta vecMeta;
        if (j == 0) {
            vecMeta = null;
        } else {
            vecMeta = new VecMeta(j);
        }
        nLEModelRequestProgressCallback.onCompressDone(vecMeta);
    }

    public static void SwigDirector_NLEModelRequestProgressCallback_onCompressProgress(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, float f) {
        nLEModelRequestProgressCallback.onCompressProgress(f);
    }

    public static void SwigDirector_NLEModelRequestProgressCallback_onFetchProgress(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, float f) {
        nLEModelRequestProgressCallback.onFetchProgress(f);
    }

    public static void SwigDirector_NLEModelRequestProgressCallback_onNeedFetch(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j) {
        VecStr vecStr;
        if (j == 0) {
            vecStr = null;
        } else {
            vecStr = new VecStr(j);
        }
        nLEModelRequestProgressCallback.onNeedFetch(vecStr);
    }

    public static long SwigDirector_AndroidExecutor_postDelayedTask(AndroidExecutor androidExecutor, long j, long j2) {
        Runnable runnable;
        if (j == 0) {
            runnable = null;
        } else {
            runnable = new Runnable(j);
        }
        return androidExecutor.postDelayedTask(runnable, j2);
    }

    public static long SwigDirector_IMetaInfoDelegate_extractorFrame(IMetaInfoDelegate iMetaInfoDelegate, long j, String str) {
        UploadInfo uploadInfo;
        if (j == 0) {
            uploadInfo = null;
        } else {
            uploadInfo = new UploadInfo(j);
        }
        PictureInfo pictureInfoExtractorFrame = iMetaInfoDelegate.extractorFrame(uploadInfo, str);
        if (pictureInfoExtractorFrame == null) {
            return 0L;
        }
        return pictureInfoExtractorFrame.LIZJ;
    }

    public static long SwigDirector_IMetaInfoDelegate_getCompressMetaInfo(IMetaInfoDelegate iMetaInfoDelegate, long j, String str) {
        Meta meta;
        if (j == 0) {
            meta = null;
        } else {
            meta = new Meta(j);
        }
        return Meta.LIZ(iMetaInfoDelegate.getCompressMetaInfo(meta, str));
    }

    public static void SwigDirector_IMusicNetworkDelegate_request__SWIG_1(IMusicNetworkDelegate iMusicNetworkDelegate, long j, long j2) {
        MusicRequestParams musicRequestParams;
        CommonRequestCallback commonRequestCallback = null;
        if (j == 0) {
            musicRequestParams = null;
        } else {
            musicRequestParams = new MusicRequestParams(j);
        }
        if (j2 != 0) {
            commonRequestCallback = new CommonRequestCallback(j2, true);
        }
        iMusicNetworkDelegate.request(musicRequestParams, commonRequestCallback);
    }

    public static void SwigDirector_INLEModelNetworkDelegate_request__SWIG_0(INLEModelNetworkDelegate iNLEModelNetworkDelegate, long j, long j2) {
        NLEModelRequestParams nLEModelRequestParams;
        NLEModelRequestCallback nLEModelRequestCallback = null;
        if (j == 0) {
            nLEModelRequestParams = null;
        } else {
            nLEModelRequestParams = new NLEModelRequestParams(j);
        }
        if (j2 != 0) {
            nLEModelRequestCallback = new NLEModelRequestCallback(j2, true);
        }
        iNLEModelNetworkDelegate.request(nLEModelRequestParams, nLEModelRequestCallback);
    }

    public static void SwigDirector_ISmartMovieDownloader_fetch__SWIG_1(ISmartMovieDownloader iSmartMovieDownloader, String str, long j) {
        ISmartMovieDownloaderListener iSmartMovieDownloaderListener;
        if (j == 0) {
            iSmartMovieDownloaderListener = null;
        } else {
            iSmartMovieDownloaderListener = new ISmartMovieDownloaderListener(j, true);
        }
        iSmartMovieDownloader.fetch(str, iSmartMovieDownloaderListener);
    }

    public static void SwigDirector_ITosDelegate_getTosUrl__SWIG_0(ITosDelegate iTosDelegate, String str, long j) {
        CommonRequestCallback commonRequestCallback;
        if (j == 0) {
            commonRequestCallback = null;
        } else {
            commonRequestCallback = new CommonRequestCallback(j, true);
        }
        iTosDelegate.getTosUrl(str, commonRequestCallback);
    }

    public static void SwigDirector_NLEModelRequestCallback_onSuccess(NLEModelRequestCallback nLEModelRequestCallback, long j, long j2) {
        NLEModel nLEModelLIZIZ;
        if (j == 0) {
            nLEModelLIZIZ = null;
        } else {
            nLEModelLIZIZ = C1967607nG.LIZIZ(j);
        }
        nLEModelRequestCallback.onSuccess(nLEModelLIZIZ, new UnorderedMapStrStr(j2));
    }

    public static void SwigDirector_NLEModelRequestProgressCallback_onResponse(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j, long j2) {
        NLEModel nLEModelLIZIZ;
        if (j == 0) {
            nLEModelLIZIZ = null;
        } else {
            nLEModelLIZIZ = C1967607nG.LIZIZ(j);
        }
        nLEModelRequestProgressCallback.onResponse(nLEModelLIZIZ, new UnorderedMapStrStr(j2));
    }

    public static void SwigDirector_NLEModelRequestProgressCallback_onSuccess(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, long j, long j2) {
        NLEModel nLEModelLIZIZ;
        if (j == 0) {
            nLEModelLIZIZ = null;
        } else {
            nLEModelLIZIZ = C1967607nG.LIZIZ(j);
        }
        nLEModelRequestProgressCallback.onSuccess(nLEModelLIZIZ, new UnorderedMapStrStr(j2));
    }

    public static void SwigDirector_CommonRequestCallback_onFailure(CommonRequestCallback commonRequestCallback, int i, String str, long j) {
        commonRequestCallback.onFailure(i, str, new UnorderedMapStrStr(j));
    }

    public static void SwigDirector_CompressMetaCallback_onFailure(CompressMetaCallback compressMetaCallback, int i, String str, long j) {
        compressMetaCallback.onFailure(i, str, new UnorderedMapStrStr(j));
    }

    public static long SwigDirector_IMetaInfoDelegate_getFrameTimeStamps(IMetaInfoDelegate iMetaInfoDelegate, long j, long j2, long j3) {
        VecMeta vecMeta;
        if (j2 == 0) {
            vecMeta = null;
        } else {
            vecMeta = new VecMeta(j2);
        }
        VecPairBoolLong frameTimeStamps = iMetaInfoDelegate.getFrameTimeStamps(j, vecMeta, j3);
        if (frameTimeStamps == null) {
            return 0L;
        }
        return frameTimeStamps.LL;
    }

    public static void SwigDirector_IMusicNetworkDelegate_request__SWIG_0(IMusicNetworkDelegate iMusicNetworkDelegate, long j, long j2, long j3) {
        MusicRequestParams musicRequestParams;
        CommonRequestCallback commonRequestCallback;
        MusicRequestCallback musicRequestCallback = null;
        if (j == 0) {
            musicRequestParams = null;
        } else {
            musicRequestParams = new MusicRequestParams(j);
        }
        if (j2 == 0) {
            commonRequestCallback = null;
        } else {
            commonRequestCallback = new CommonRequestCallback(j2, true);
        }
        if (j3 != 0) {
            musicRequestCallback = new MusicRequestCallback(j3, true);
        }
        iMusicNetworkDelegate.request(musicRequestParams, commonRequestCallback, musicRequestCallback);
    }

    public static void SwigDirector_ISmartMovieDownloaderListener_onFailure(ISmartMovieDownloaderListener iSmartMovieDownloaderListener, String str, int i, String str2) {
        iSmartMovieDownloaderListener.onFailure(str, i, str2);
    }

    public static String SwigDirector_ISmartMovieDownloader_fetchEffectList(ISmartMovieDownloader iSmartMovieDownloader, long j, int i, long j2) {
        VecStr vecStr;
        ISmartMovieDownloaderListener iSmartMovieDownloaderListener = null;
        if (j == 0) {
            vecStr = null;
        } else {
            vecStr = new VecStr(j);
        }
        if (j2 != 0) {
            iSmartMovieDownloaderListener = new ISmartMovieDownloaderListener(j2, true);
        }
        return iSmartMovieDownloader.fetchEffectList(vecStr, i, iSmartMovieDownloaderListener);
    }

    public static String SwigDirector_ISmartMovieDownloader_fetchResourceList(ISmartMovieDownloader iSmartMovieDownloader, long j, int i, long j2) {
        VecStr vecStr;
        ISmartMovieDownloaderListener iSmartMovieDownloaderListener = null;
        if (j == 0) {
            vecStr = null;
        } else {
            vecStr = new VecStr(j);
        }
        if (j2 != 0) {
            iSmartMovieDownloaderListener = new ISmartMovieDownloaderListener(j2, true);
        }
        return iSmartMovieDownloader.fetchResourceList(vecStr, i, iSmartMovieDownloaderListener);
    }

    public static String SwigDirector_ISmartMovieDownloader_fetch__SWIG_2(ISmartMovieDownloader iSmartMovieDownloader, long j, int i, long j2) {
        VecStr vecStr;
        ISmartMovieDownloaderListener iSmartMovieDownloaderListener = null;
        if (j == 0) {
            vecStr = null;
        } else {
            vecStr = new VecStr(j);
        }
        if (j2 != 0) {
            iSmartMovieDownloaderListener = new ISmartMovieDownloaderListener(j2, true);
        }
        return iSmartMovieDownloader.fetch(vecStr, i, iSmartMovieDownloaderListener);
    }

    public static void SwigDirector_NLEModelRequestCallback_onFailure(NLEModelRequestCallback nLEModelRequestCallback, int i, String str, long j) {
        nLEModelRequestCallback.onFailure(i, str, new UnorderedMapStrStr(j));
    }

    public static void SwigDirector_IMetaInfoDelegate_compressMeta(IMetaInfoDelegate iMetaInfoDelegate, long j, String str, boolean z, long j2) {
        Meta meta;
        CommonRequestCallback commonRequestCallback = null;
        if (j == 0) {
            meta = null;
        } else {
            meta = new Meta(j);
        }
        if (j2 != 0) {
            commonRequestCallback = new CommonRequestCallback(j2, true);
        }
        iMetaInfoDelegate.compressMeta(meta, str, z, commonRequestCallback);
    }

    public static void SwigDirector_NLEModelRequestProgressCallback_onFailure(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, String str, int i, String str2, long j) {
        nLEModelRequestProgressCallback.onFailure(str, i, str2, new UnorderedMapStrStr(j));
    }

    public static void SwigDirector_MusicRequestCallback_onInfoCallBack(MusicRequestCallback musicRequestCallback, int i, float f, int i2, String str, long j) {
        musicRequestCallback.onInfoCallBack(MusicRequestCallbackInfoType.swigToEnum(i), f, i2, str, new UnorderedMapStrStr(j));
    }

    public static String SwigDirector_ISmartMovieDownloader_fetch__SWIG_0(ISmartMovieDownloader iSmartMovieDownloader, long j, int i, boolean z, boolean z2, int i2, long j2) {
        NLEModel nLEModelLIZIZ;
        ISmartMovieDownloaderListener iSmartMovieDownloaderListener = null;
        if (j == 0) {
            nLEModelLIZIZ = null;
        } else {
            nLEModelLIZIZ = C1967607nG.LIZIZ(j);
        }
        if (j2 != 0) {
            iSmartMovieDownloaderListener = new ISmartMovieDownloaderListener(j2, true);
        }
        return iSmartMovieDownloader.fetch(nLEModelLIZIZ, i, z, z2, i2, iSmartMovieDownloaderListener);
    }
}
