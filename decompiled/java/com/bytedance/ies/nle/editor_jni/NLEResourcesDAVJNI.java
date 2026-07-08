package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEResourcesDAVJNI {
    public static final native void EpResourceCallback_change_ownership(EpResourceCallback epResourceCallback, long j, boolean z);

    public static final native void EpResourceCallback_director_connect(EpResourceCallback epResourceCallback, long j, boolean z, boolean z2);

    public static final native void EpResourceCallback_onFailure(long j, EpResourceCallback epResourceCallback, int i, String str);

    public static final native void EpResourceCallback_onProgress(long j, EpResourceCallback epResourceCallback, float f);

    public static final native void EpResourceCallback_onSuccess(long j, EpResourceCallback epResourceCallback, String str);

    public static final native void EpResourceDelegate_change_ownership(EpResourceDelegate epResourceDelegate, long j, boolean z);

    public static final native void EpResourceDelegate_director_connect(EpResourceDelegate epResourceDelegate, long j, boolean z, boolean z2);

    public static final native boolean EpResourceDelegate_request__SWIG_0(long j, EpResourceDelegate epResourceDelegate, String str, String str2, long j2, EpResourceCallback epResourceCallback);

    public static final native boolean EpResourceDelegate_request__SWIG_1(long j, EpResourceDelegate epResourceDelegate, String str, long j2, EpResourceCallback epResourceCallback);

    public static final native boolean EpResourceManager_hasEpResourceDelegate();

    public static final native long EpResourceManager_obtain();

    public static final native void EpResourceManager_request__SWIG_0(long j, EpResourceManager epResourceManager, String str, String str2, long j2, EpResourceCallback epResourceCallback);

    public static final native void EpResourceManager_request__SWIG_1(long j, EpResourceManager epResourceManager, String str, long j2, EpResourceCallback epResourceCallback);

    public static final native void EpResourceManager_setEpResource(long j, EpResourceDelegate epResourceDelegate);

    public static final native String INLEModelDownloaderListener_fetchResourceFromCache__SWIG_0(long j, INLEModelDownloaderListener iNLEModelDownloaderListener, String str, long j2, UnorderedMapStrStr unorderedMapStrStr);

    public static final native String INLEModelDownloaderListener_fetchResourceFromCache__SWIG_1(long j, INLEModelDownloaderListener iNLEModelDownloaderListener, String str);

    public static final native String NLEModelDownloaderParams_ac_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_ac_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native void NLEModelDownloaderParams_addCommonParams(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str, String str2);

    public static final native void NLEModelDownloaderParams_addMusicParams(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str, String str2, String str3);

    public static final native String NLEModelDownloaderParams_channel_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_channel_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native String NLEModelDownloaderParams_getAccessKey(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getAppID(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getAppLanguage(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getAppVersion(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getArtistCacheDir(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getArtistHost(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native boolean NLEModelDownloaderParams_getAutoUnzip(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native long NLEModelDownloaderParams_getCommonParams(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getDeviceID(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getDeviceType(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getEffectCacheDir(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getEffectSdkVersion(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native boolean NLEModelDownloaderParams_getEpRequest(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getHost(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getIMuseCacheDir(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getIMuseHost(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getModelCacheDir(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getMusicAppID(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getMusicCacheDir(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getMusicHost(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getPlatform(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getPlatformSdkVersion(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getRegion(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_getResolution(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native String NLEModelDownloaderParams_lokiAppId_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_lokiAppId_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native String NLEModelDownloaderParams_lokiAppVersion_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_lokiAppVersion_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native String NLEModelDownloaderParams_materialResourceAccessKey_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_materialResourceAccessKey_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native String NLEModelDownloaderParams_materialResourceAppId_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_materialResourceAppId_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native String NLEModelDownloaderParams_materialResourceAppName_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_materialResourceAppName_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native String NLEModelDownloaderParams_materialResourceAppVersion_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_materialResourceAppVersion_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native String NLEModelDownloaderParams_materialResourceCache_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_materialResourceCache_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native String NLEModelDownloaderParams_materialResourceHost_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_materialResourceHost_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native int NLEModelDownloaderParams_materialResourceStatus_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_materialResourceStatus_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, int i);

    public static final native String NLEModelDownloaderParams_materialResourceTag_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_materialResourceTag_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native void NLEModelDownloaderParams_setEpRequest(long j, NLEModelDownloaderParams nLEModelDownloaderParams, boolean z);

    public static final native String NLEModelDownloaderParams_uid_get(long j, NLEModelDownloaderParams nLEModelDownloaderParams);

    public static final native void NLEModelDownloaderParams_uid_set(long j, NLEModelDownloaderParams nLEModelDownloaderParams, String str);

    public static final native boolean NLEModelDownloader_cancelFetch(long j, NLEModelDownloader nLEModelDownloader, String str);

    public static final native void NLEModelDownloader_clearEpCache(long j, NLEModelDownloader nLEModelDownloader);

    public static final native String NLEModelDownloader_fetchEffectList(long j, NLEModelDownloader nLEModelDownloader, long j2, VecString vecString, int i, long j3, NLEResourceListDownloadCallback nLEResourceListDownloadCallback);

    public static final native String NLEModelDownloader_fetchResourceList(long j, NLEModelDownloader nLEModelDownloader, long j2, VecString vecString, int i, long j3, NLEResourceListDownloadCallback nLEResourceListDownloadCallback);

    public static final native String NLEModelDownloader_fetch__SWIG_0(long j, NLEModelDownloader nLEModelDownloader, long j2, NLEModel nLEModel, int i, boolean z, boolean z2, long j3, NLEResourceDownloadCallback nLEResourceDownloadCallback);

    public static final native void NLEModelDownloader_fetch__SWIG_1(long j, NLEModelDownloader nLEModelDownloader, String str, long j2, NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback);

    public static final native String NLEModelDownloader_fetch__SWIG_2(long j, NLEModelDownloader nLEModelDownloader, long j2, VecString vecString, int i, long j3, NLEResourceListDownloadCallback nLEResourceListDownloadCallback);

    public static final native boolean NLEModelDownloader_hasCache(long j, NLEModelDownloader nLEModelDownloader, String str);

    public static final native boolean NLEModelDownloader_hasDavinciResourceCache(long j, NLEModelDownloader nLEModelDownloader, String str);

    public static final native boolean NLEModelDownloader_isNeedFetch(long j, NLEModelDownloader nLEModelDownloader, String str);

    public static final native void NLEModelDownloader_removeCachedFailedUrs(long j, NLEModelDownloader nLEModelDownloader, long j2, VecString vecString);

    public static final native void NLEResourceDownloadCallback_change_ownership(NLEResourceDownloadCallback nLEResourceDownloadCallback, long j, boolean z);

    public static final native void NLEResourceDownloadCallback_director_connect(NLEResourceDownloadCallback nLEResourceDownloadCallback, long j, boolean z, boolean z2);

    public static final native void NLEResourceDownloadCallback_onFailure(long j, NLEResourceDownloadCallback nLEResourceDownloadCallback, String str, int i, String str2);

    public static final native void NLEResourceDownloadCallback_onNeedFetch(long j, NLEResourceDownloadCallback nLEResourceDownloadCallback, long j2, VecString vecString);

    public static final native void NLEResourceDownloadCallback_onProgress(long j, NLEResourceDownloadCallback nLEResourceDownloadCallback, float f);

    public static final native void NLEResourceDownloadCallback_onSuccess(long j, NLEResourceDownloadCallback nLEResourceDownloadCallback, long j2, NLEModel nLEModel);

    public static final native void NLEResourceListDownloadCallback_change_ownership(NLEResourceListDownloadCallback nLEResourceListDownloadCallback, long j, boolean z);

    public static final native void NLEResourceListDownloadCallback_director_connect(NLEResourceListDownloadCallback nLEResourceListDownloadCallback, long j, boolean z, boolean z2);

    public static final native void NLEResourceListDownloadCallback_onFailure(long j, NLEResourceListDownloadCallback nLEResourceListDownloadCallback, String str, int i, String str2);

    public static final native void NLEResourceListDownloadCallback_onProgress(long j, NLEResourceListDownloadCallback nLEResourceListDownloadCallback, float f);

    public static final native void NLEResourceListDownloadCallback_onSuccess(long j, NLEResourceListDownloadCallback nLEResourceListDownloadCallback);

    public static final native void NLESingleResourceDownloadCallback_change_ownership(NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, long j, boolean z);

    public static final native void NLESingleResourceDownloadCallback_director_connect(NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, long j, boolean z, boolean z2);

    public static final native void NLESingleResourceDownloadCallback_onFailure(long j, NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, String str, int i, String str2);

    public static final native void NLESingleResourceDownloadCallback_onProgress(long j, NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, int i);

    public static final native void NLESingleResourceDownloadCallback_onProgressSwigExplicitNLESingleResourceDownloadCallback(long j, NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, int i);

    public static final native void NLESingleResourceDownloadCallback_onSuccess(long j, NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, String str, String str2, boolean z);

    public static final native void ResourceUtil_updateResourceFile(long j, NLEResourceNode nLEResourceNode, String str);

    public static final native void ResourceUtil_updateRichContentResourceForTextSticker(long j, NLEModel nLEModel);

    public static final native void delete_EpResourceCallback(long j);

    public static final native void delete_EpResourceDelegate(long j);

    public static final native void delete_EpResourceManager(long j);

    public static final native void delete_INLEModelDownloaderListener(long j);

    public static final native void delete_NLEModelDownloader(long j);

    public static final native void delete_NLEModelDownloaderParams(long j);

    public static final native void delete_NLEResourceDownloadCallback(long j);

    public static final native void delete_NLEResourceListDownloadCallback(long j);

    public static final native void delete_NLESingleResourceDownloadCallback(long j);

    public static final native void delete_ResourceUtil(long j);

    public static final native long new_EpResourceCallback();

    public static final native long new_EpResourceDelegate();

    public static final native long new_EpResourceManager();

    public static final native long new_NLEModelDownloader();

    public static final native long new_NLEModelDownloaderParams__SWIG_0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z);

    public static final native long new_NLEModelDownloaderParams__SWIG_1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10);

    public static final native long new_NLEModelDownloaderParams__SWIG_2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, String str18, boolean z2);

    public static final native long new_NLEModelDownloaderParams__SWIG_3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, String str18);

    public static final native long new_NLEModelDownloaderParams__SWIG_4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z);

    public static final native long new_NLEModelDownloaderParams__SWIG_5(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17);

    public static final native long new_NLEModelDownloaderParams__SWIG_6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16);

    public static final native long new_NLEResourceDownloadCallback();

    public static final native long new_NLEResourceListDownloadCallback();

    public static final native long new_NLESingleResourceDownloadCallback();

    public static final native long new_ResourceUtil();

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static void SwigDirector_NLEResourceListDownloadCallback_onSuccess(NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        nLEResourceListDownloadCallback.onSuccess();
    }

    public static void SwigDirector_EpResourceCallback_onProgress(EpResourceCallback epResourceCallback, float f) {
        epResourceCallback.onProgress(f);
    }

    public static void SwigDirector_EpResourceCallback_onSuccess(EpResourceCallback epResourceCallback, String str) {
        epResourceCallback.onSuccess(str);
    }

    public static void SwigDirector_NLEResourceDownloadCallback_onNeedFetch(NLEResourceDownloadCallback nLEResourceDownloadCallback, long j) {
        nLEResourceDownloadCallback.onNeedFetch(new VecString(j, false));
    }

    public static void SwigDirector_NLEResourceDownloadCallback_onProgress(NLEResourceDownloadCallback nLEResourceDownloadCallback, float f) {
        nLEResourceDownloadCallback.onProgress(f);
    }

    public static void SwigDirector_NLEResourceDownloadCallback_onSuccess(NLEResourceDownloadCallback nLEResourceDownloadCallback, long j) {
        NLEModel nLEModel;
        if (j == 0) {
            nLEModel = null;
        } else {
            nLEModel = new NLEModel(j, true);
        }
        nLEResourceDownloadCallback.onSuccess(nLEModel);
    }

    public static void SwigDirector_NLEResourceListDownloadCallback_onProgress(NLEResourceListDownloadCallback nLEResourceListDownloadCallback, float f) {
        nLEResourceListDownloadCallback.onProgress(f);
    }

    public static void SwigDirector_NLESingleResourceDownloadCallback_onProgress(NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, int i) {
        nLESingleResourceDownloadCallback.onProgress(i);
    }

    public static void SwigDirector_EpResourceCallback_onFailure(EpResourceCallback epResourceCallback, int i, String str) {
        epResourceCallback.onFailure(i, str);
    }

    public static boolean SwigDirector_EpResourceDelegate_request__SWIG_1(EpResourceDelegate epResourceDelegate, String str, long j) {
        EpResourceCallback epResourceCallback;
        if (j == 0) {
            epResourceCallback = null;
        } else {
            epResourceCallback = new EpResourceCallback(j, true);
        }
        return epResourceDelegate.request(str, epResourceCallback);
    }

    public static boolean SwigDirector_EpResourceDelegate_request__SWIG_0(EpResourceDelegate epResourceDelegate, String str, String str2, long j) {
        EpResourceCallback epResourceCallback;
        if (j == 0) {
            epResourceCallback = null;
        } else {
            epResourceCallback = new EpResourceCallback(j, true);
        }
        return epResourceDelegate.request(str, str2, epResourceCallback);
    }

    public static void SwigDirector_NLEResourceDownloadCallback_onFailure(NLEResourceDownloadCallback nLEResourceDownloadCallback, String str, int i, String str2) {
        nLEResourceDownloadCallback.onFailure(str, i, str2);
    }

    public static void SwigDirector_NLEResourceListDownloadCallback_onFailure(NLEResourceListDownloadCallback nLEResourceListDownloadCallback, String str, int i, String str2) {
        nLEResourceListDownloadCallback.onFailure(str, i, str2);
    }

    public static void SwigDirector_NLESingleResourceDownloadCallback_onFailure(NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, String str, int i, String str2) {
        nLESingleResourceDownloadCallback.onFailure(str, i, str2);
    }

    public static void SwigDirector_NLESingleResourceDownloadCallback_onSuccess(NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback, String str, String str2, boolean z) {
        nLESingleResourceDownloadCallback.onSuccess(str, str2, z);
    }
}
