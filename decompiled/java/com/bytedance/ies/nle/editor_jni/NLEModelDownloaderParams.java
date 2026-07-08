package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEModelDownloaderParams {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_NLEModelDownloaderParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getAc() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_ac_get(this.swigCPtr, this);
    }

    public String getAccessKey() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getAccessKey(this.swigCPtr, this);
    }

    public String getAppID() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getAppID(this.swigCPtr, this);
    }

    public String getAppLanguage() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getAppLanguage(this.swigCPtr, this);
    }

    public String getAppVersion() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getAppVersion(this.swigCPtr, this);
    }

    public String getArtistCacheDir() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getArtistCacheDir(this.swigCPtr, this);
    }

    public String getArtistHost() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getArtistHost(this.swigCPtr, this);
    }

    public boolean getAutoUnzip() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getAutoUnzip(this.swigCPtr, this);
    }

    public String getChannel() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_channel_get(this.swigCPtr, this);
    }

    public UnorderedMapStrStr getCommonParams() {
        return new UnorderedMapStrStr(NLEResourcesDAVJNI.NLEModelDownloaderParams_getCommonParams(this.swigCPtr, this), true);
    }

    public String getDeviceID() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getDeviceID(this.swigCPtr, this);
    }

    public String getDeviceType() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getDeviceType(this.swigCPtr, this);
    }

    public String getEffectCacheDir() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getEffectCacheDir(this.swigCPtr, this);
    }

    public String getEffectSdkVersion() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getEffectSdkVersion(this.swigCPtr, this);
    }

    public boolean getEpRequest() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getEpRequest(this.swigCPtr, this);
    }

    public String getHost() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getHost(this.swigCPtr, this);
    }

    public String getIMuseCacheDir() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getIMuseCacheDir(this.swigCPtr, this);
    }

    public String getIMuseHost() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getIMuseHost(this.swigCPtr, this);
    }

    public String getLokiAppId() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_lokiAppId_get(this.swigCPtr, this);
    }

    public String getLokiAppVersion() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_lokiAppVersion_get(this.swigCPtr, this);
    }

    public String getMaterialResourceAccessKey() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAccessKey_get(this.swigCPtr, this);
    }

    public String getMaterialResourceAppId() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppId_get(this.swigCPtr, this);
    }

    public String getMaterialResourceAppName() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppName_get(this.swigCPtr, this);
    }

    public String getMaterialResourceAppVersion() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppVersion_get(this.swigCPtr, this);
    }

    public String getMaterialResourceCache() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceCache_get(this.swigCPtr, this);
    }

    public String getMaterialResourceHost() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceHost_get(this.swigCPtr, this);
    }

    public int getMaterialResourceStatus() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceStatus_get(this.swigCPtr, this);
    }

    public String getMaterialResourceTag() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceTag_get(this.swigCPtr, this);
    }

    public String getModelCacheDir() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getModelCacheDir(this.swigCPtr, this);
    }

    public String getMusicAppID() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getMusicAppID(this.swigCPtr, this);
    }

    public String getMusicCacheDir() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getMusicCacheDir(this.swigCPtr, this);
    }

    public String getMusicHost() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getMusicHost(this.swigCPtr, this);
    }

    public String getPlatform() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getPlatform(this.swigCPtr, this);
    }

    public String getPlatformSdkVersion() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getPlatformSdkVersion(this.swigCPtr, this);
    }

    public String getRegion() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getRegion(this.swigCPtr, this);
    }

    public String getResolution() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_getResolution(this.swigCPtr, this);
    }

    public String getUid() {
        return NLEResourcesDAVJNI.NLEModelDownloaderParams_uid_get(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEModelDownloaderParams nLEModelDownloaderParams) {
        if (nLEModelDownloaderParams == null) {
            return 0L;
        }
        return nLEModelDownloaderParams.swigCPtr;
    }

    public void setAc(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_ac_set(this.swigCPtr, this, str);
    }

    public void setChannel(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_channel_set(this.swigCPtr, this, str);
    }

    public void setEpRequest(boolean z) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_setEpRequest(this.swigCPtr, this, z);
    }

    public void setLokiAppId(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_lokiAppId_set(this.swigCPtr, this, str);
    }

    public void setLokiAppVersion(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_lokiAppVersion_set(this.swigCPtr, this, str);
    }

    public void setMaterialResourceAccessKey(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAccessKey_set(this.swigCPtr, this, str);
    }

    public void setMaterialResourceAppId(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppId_set(this.swigCPtr, this, str);
    }

    public void setMaterialResourceAppName(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppName_set(this.swigCPtr, this, str);
    }

    public void setMaterialResourceAppVersion(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceAppVersion_set(this.swigCPtr, this, str);
    }

    public void setMaterialResourceCache(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceCache_set(this.swigCPtr, this, str);
    }

    public void setMaterialResourceHost(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceHost_set(this.swigCPtr, this, str);
    }

    public void setMaterialResourceStatus(int i) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceStatus_set(this.swigCPtr, this, i);
    }

    public void setMaterialResourceTag(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_materialResourceTag_set(this.swigCPtr, this, str);
    }

    public void setUid(String str) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_uid_set(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEModelDownloaderParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void addCommonParams(String str, String str2) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_addCommonParams(this.swigCPtr, this, str, str2);
    }

    public void addMusicParams(String str, String str2, String str3) {
        NLEResourcesDAVJNI.NLEModelDownloaderParams_addMusicParams(this.swigCPtr, this, str, str2, str3);
    }

    public NLEModelDownloaderParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_1(str, str2, str3, str4, str5, str6, str7, str8, str9, str10), true);
    }

    public NLEModelDownloaderParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_0(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z), true);
    }

    public NLEModelDownloaderParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_6(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16), true);
    }

    public NLEModelDownloaderParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_5(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17), true);
    }

    public NLEModelDownloaderParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z) {
        this(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_4(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, z), true);
    }

    public NLEModelDownloaderParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, String str18) {
        this(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_3(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, z, str18), true);
    }

    public NLEModelDownloaderParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, String str18, boolean z2) {
        this(NLEResourcesDAVJNI.new_NLEModelDownloaderParams__SWIG_2(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, z, str18, z2), true);
    }
}
