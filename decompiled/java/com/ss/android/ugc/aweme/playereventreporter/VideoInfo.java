package com.ss.android.ugc.aweme.playereventreporter;

import X.C1482070ofd;

/* JADX INFO: loaded from: classes24.dex */
public final class VideoInfo {
    public static final C1482070ofd Companion = new Object() { // from class: X.0ofd
    };
    public float duration;
    public int enableHdr;
    public int isBytevc1;
    public long videoSize;
    public String key = "";
    public String url = "";
    public String requestId = "";
    public int isNewUser = -1;
    public int encodedFrameRate = -1;
    public String appId = "";
    public String appVersion = "";
    public String codecName = "";
    public String codecNameStr = "";
    public String contentType = "";
    public String codec = "";
    public int internetSpeed = -1;
    public String aid = "";
    public int isBatterySaver = -1;
    public int videoQuality = -1;
    public int audioQuality = -1;
    public String bitRateSet = "";
    public int playOrder = -1;
    public int enableHwDecode = -1;
    public long videoBitrate = -1;
    public long audioBitrate = -1;
    public long playBitrate = -1;
    public int isPreloaded = -1;
    public String priorityRegion = "";
    public String carrierRegion = "";
    public String enterFrom = "";
    public String format = "";
    public String access2 = "";
    public int codecId = -1;
    public String ptPredictL = "";
    public String topActivity = "";
    public String feedTab = "";
    public String isFromFeedCache = "";
    public String isFirst = "";
    public int isLogin = -1;
    public int isHitCache = -1;
    public int preCacheSize = -1;

    public final void copyFrom(VideoInfo videoInfo) {
    }

    public String toString() {
        return "VideoInfo(key=" + this.key + ", url=" + this.url + ", requestId=" + this.requestId + ", duration=" + this.duration + ", isNewUser=" + this.isNewUser + ", isBytevc1=" + this.isBytevc1 + ", encodedFrameRate=" + this.encodedFrameRate + ", appId=" + this.appId + ", appVersion=" + this.appVersion + ", codecName=" + this.codecName + ", codecNameStr=" + this.codecNameStr + ",contentType=" + this.contentType + ", codec=" + this.codec + ", internetSpeed=" + this.internetSpeed + ", aid=" + this.aid + ", isBatterySaver=" + this.isBatterySaver + ", videoQuality=" + this.videoQuality + ", bitRateSet=" + this.bitRateSet + ", playOrder=" + this.playOrder + ", enableHwDecode=" + this.enableHwDecode + ", videoBitrate=" + this.videoBitrate + ", playBitrate=" + this.playBitrate + ", isPreloaded=" + this.isPreloaded + ", priorityRegion='" + this.priorityRegion + "', carrierRegion='" + this.carrierRegion + "', enterFrom=" + this.enterFrom + ", format='" + this.format + "', isLogin=" + this.isLogin + ')';
    }

    public final String getAccess2() {
        return this.access2;
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final long getAudioBitrate() {
        return this.audioBitrate;
    }

    public final int getAudioQuality() {
        return this.audioQuality;
    }

    public final String getBitRateSet() {
        return this.bitRateSet;
    }

    public final String getCarrierRegion() {
        return this.carrierRegion;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final int getCodecId() {
        return this.codecId;
    }

    public final String getCodecName() {
        return this.codecName;
    }

    public final String getCodecNameStr() {
        return this.codecNameStr;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final int getEnableHdr() {
        return this.enableHdr;
    }

    public final int getEnableHwDecode() {
        return this.enableHwDecode;
    }

    public final int getEncodedFrameRate() {
        return this.encodedFrameRate;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFeedTab() {
        return this.feedTab;
    }

    public final String getFormat() {
        return this.format;
    }

    public final int getInternetSpeed() {
        return this.internetSpeed;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getPlayBitrate() {
        return this.playBitrate;
    }

    public final int getPlayOrder() {
        return this.playOrder;
    }

    public final int getPreCacheSize() {
        return this.preCacheSize;
    }

    public final String getPriorityRegion() {
        return this.priorityRegion;
    }

    public final String getPtPredictL() {
        return this.ptPredictL;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getTopActivity() {
        return this.topActivity;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getVideoBitrate() {
        return this.videoBitrate;
    }

    public final int getVideoQuality() {
        return this.videoQuality;
    }

    public final long getVideoSize() {
        return this.videoSize;
    }

    public final int isBatterySaver() {
        return this.isBatterySaver;
    }

    public final int isBytevc1() {
        return this.isBytevc1;
    }

    public final String isFirst() {
        return this.isFirst;
    }

    public final String isFromFeedCache() {
        return this.isFromFeedCache;
    }

    public final int isHitCache() {
        return this.isHitCache;
    }

    public final int isLogin() {
        return this.isLogin;
    }

    public final int isNewUser() {
        return this.isNewUser;
    }

    public final int isPreloaded() {
        return this.isPreloaded;
    }

    public final VideoInfo clone(VideoInfo videoInfo) {
        if (videoInfo != null) {
            new VideoInfo();
            return new VideoInfo();
        }
        return null;
    }

    public final void setAccess2(String str) {
        this.access2 = str;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setAudioBitrate(long j) {
        this.audioBitrate = j;
    }

    public final void setAudioQuality(int i) {
        this.audioQuality = i;
    }

    public final void setBatterySaver(int i) {
        this.isBatterySaver = i;
    }

    public final void setBitRateSet(String str) {
        this.bitRateSet = str;
    }

    public final void setBytevc1(int i) {
        this.isBytevc1 = i;
    }

    public final void setCarrierRegion(String str) {
        this.carrierRegion = str;
    }

    public final void setCodec(String str) {
        this.codec = str;
    }

    public final void setCodecId(int i) {
        this.codecId = i;
    }

    public final void setCodecName(String str) {
        this.codecName = str;
    }

    public final void setCodecNameStr(String str) {
        this.codecNameStr = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    public final void setEnableHdr(int i) {
        this.enableHdr = i;
    }

    public final void setEnableHwDecode(int i) {
        this.enableHwDecode = i;
    }

    public final void setEncodedFrameRate(int i) {
        this.encodedFrameRate = i;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFeedTab(String str) {
        this.feedTab = str;
    }

    public final void setFirst(String str) {
        this.isFirst = str;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setFromFeedCache(String str) {
        this.isFromFeedCache = str;
    }

    public final void setHitCache(int i) {
        this.isHitCache = i;
    }

    public final void setInternetSpeed(int i) {
        this.internetSpeed = i;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setLogin(int i) {
        this.isLogin = i;
    }

    public final void setNewUser(int i) {
        this.isNewUser = i;
    }

    public final void setPlayBitrate(long j) {
        this.playBitrate = j;
    }

    public final void setPlayOrder(int i) {
        this.playOrder = i;
    }

    public final void setPreCacheSize(int i) {
        this.preCacheSize = i;
    }

    public final void setPreloaded(int i) {
        this.isPreloaded = i;
    }

    public final void setPriorityRegion(String str) {
        this.priorityRegion = str;
    }

    public final void setPtPredictL(String str) {
        this.ptPredictL = str;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setTopActivity(String str) {
        this.topActivity = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVideoBitrate(long j) {
        this.videoBitrate = j;
    }

    public final void setVideoQuality(int i) {
        this.videoQuality = i;
    }

    public final void setVideoSize(long j) {
        this.videoSize = j;
    }
}
