package com.ss.android.ugc.aweme.log;

import X.C09CT;
import X.C1035880d3y;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebLogModel implements Serializable {

    @C09CT("adWebModel")
    public final C1035880d3y adWebModel;

    @C09CT("cid")
    public String cid;

    @C09CT("enable_reuse_web")
    public boolean enableReuseWeb;

    @C09CT("extra_info")
    public String extraInfo;

    @C09CT("init_time")
    public long initTime;

    @C09CT("is_ad_web_page")
    public boolean isAdWebPage;

    @C09CT("is_prerender")
    public boolean isPreRender;

    @C09CT("is_prewarm")
    public final boolean isPreWarm;

    @C09CT("is_renter_model")
    public boolean isRenterModel;

    @C09CT("is_secured")
    public Integer isSecured;

    @C09CT("is_spark")
    public int isSpark;

    @C09CT("is_title_truncated")
    public Integer isTitleTruncated;

    @C09CT("is_web_reuse")
    public boolean isWebPageReuse;

    @C09CT("is_web_url")
    public int isWebUrl;

    @C09CT("ix_to_externalurl")
    public int ixToExternalurl;

    @C09CT("landing_page_style")
    public int landingPageStyle;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("needShowEventPopup")
    public final Boolean needShowEventPopup;

    @C09CT("ba_model")
    public NonAdWebModel nonAdWebModel;

    @C09CT("preload_channel")
    public String preloadChannel;

    @C09CT("preload_h5_type")
    public int preloadH5Type;

    @C09CT("preload_scene")
    public String preloadScene;

    @C09CT("preload_web")
    public int preloadWeb;

    @C09CT("preload_web_second_page")
    public int preloadWebSecondPage;

    @C09CT("refer")
    public String refer;

    @C09CT("reuse_status")
    public int reuseStatus;

    @C09CT("session_id")
    public String sessionId;

    @C09CT("web_url")
    public String webUrl;

    public AdWebLogModel() {
        this(null, null, 0, 0, 0, null, null, null, System.currentTimeMillis(), "", 0, 0, null, null, false, 0, false, null, false, 0, false, 1, null, null, null, null, false, false);
    }

    public final C1035880d3y getAdWebModel() {
        return this.adWebModel;
    }

    public final String getCid() {
        return this.cid;
    }

    public final boolean getEnableReuseWeb() {
        return this.enableReuseWeb;
    }

    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final long getInitTime() {
        return this.initTime;
    }

    public final int getIxToExternalurl() {
        return this.ixToExternalurl;
    }

    public final int getLandingPageStyle() {
        return this.landingPageStyle;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final Boolean getNeedShowEventPopup() {
        return this.needShowEventPopup;
    }

    public final NonAdWebModel getNonAdWebModel() {
        return this.nonAdWebModel;
    }

    public final String getPreloadChannel() {
        return this.preloadChannel;
    }

    public final int getPreloadH5Type() {
        return this.preloadH5Type;
    }

    public final String getPreloadScene() {
        return this.preloadScene;
    }

    public final int getPreloadWeb() {
        return this.preloadWeb;
    }

    public final int getPreloadWebSecondPage() {
        return this.preloadWebSecondPage;
    }

    public final String getRefer() {
        return this.refer;
    }

    public final int getReuseStatus() {
        return this.reuseStatus;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final boolean isAdWebPage() {
        return this.isAdWebPage;
    }

    public final boolean isPreRender() {
        return this.isPreRender;
    }

    public final boolean isPreWarm() {
        return this.isPreWarm;
    }

    public final boolean isRenterModel() {
        return this.isRenterModel;
    }

    public final Integer isSecured() {
        return this.isSecured;
    }

    public final int isSpark() {
        return this.isSpark;
    }

    public final Integer isTitleTruncated() {
        return this.isTitleTruncated;
    }

    public final boolean isWebPageReuse() {
        return this.isWebPageReuse;
    }

    public final int isWebUrl() {
        return this.isWebUrl;
    }

    public final void setAdWebPage(boolean z) {
        this.isAdWebPage = z;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setEnableReuseWeb(boolean z) {
        this.enableReuseWeb = z;
    }

    public final void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public final void setInitTime(long j) {
        this.initTime = j;
    }

    public final void setIxToExternalurl(int i) {
        this.ixToExternalurl = i;
    }

    public final void setLandingPageStyle(int i) {
        this.landingPageStyle = i;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setNonAdWebModel(NonAdWebModel nonAdWebModel) {
        this.nonAdWebModel = nonAdWebModel;
    }

    public final void setPreRender(boolean z) {
        this.isPreRender = z;
    }

    public final void setPreloadChannel(String str) {
        this.preloadChannel = str;
    }

    public final void setPreloadH5Type(int i) {
        this.preloadH5Type = i;
    }

    public final void setPreloadScene(String str) {
        this.preloadScene = str;
    }

    public final void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public final void setPreloadWebSecondPage(int i) {
        this.preloadWebSecondPage = i;
    }

    public final void setRefer(String str) {
        this.refer = str;
    }

    public final void setRenterModel(boolean z) {
        this.isRenterModel = z;
    }

    public final void setReuseStatus(int i) {
        this.reuseStatus = i;
    }

    public final void setSecured(Integer num) {
        this.isSecured = num;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSpark(int i) {
        this.isSpark = i;
    }

    public final void setTitleTruncated(Integer num) {
        this.isTitleTruncated = num;
    }

    public final void setWebPageReuse(boolean z) {
        this.isWebPageReuse = z;
    }

    public final void setWebUrl(int i) {
        this.isWebUrl = i;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }

    public AdWebLogModel(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, long j, String str6, int i4, int i5, String str7, String str8, boolean z, int i6, boolean z2, NonAdWebModel nonAdWebModel, boolean z3, int i7, boolean z4, int i8, Integer num, Integer num2, Boolean bool, C1035880d3y c1035880d3y, boolean z5, boolean z6) {
        this.cid = str;
        this.logExtra = str2;
        this.landingPageStyle = i;
        this.isWebUrl = i2;
        this.ixToExternalurl = i3;
        this.webUrl = str3;
        this.refer = str4;
        this.sessionId = str5;
        this.initTime = j;
        this.extraInfo = str6;
        this.preloadWeb = i4;
        this.preloadWebSecondPage = i5;
        this.preloadChannel = str7;
        this.preloadScene = str8;
        this.isPreRender = z;
        this.preloadH5Type = i6;
        this.isAdWebPage = z2;
        this.nonAdWebModel = nonAdWebModel;
        this.isWebPageReuse = z3;
        this.isSpark = i7;
        this.enableReuseWeb = z4;
        this.reuseStatus = i8;
        this.isSecured = num;
        this.isTitleTruncated = num2;
        this.needShowEventPopup = bool;
        this.adWebModel = c1035880d3y;
        this.isPreWarm = z5;
        this.isRenterModel = z6;
    }
}
