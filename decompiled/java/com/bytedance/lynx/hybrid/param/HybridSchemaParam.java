package com.bytedance.lynx.hybrid.param;

import X.AbstractC1542430qEz;
import X.C1058140dds;
import X.C1542700qFQ;
import X.EnumC1067640dtC;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public class HybridSchemaParam extends AbstractC1542430qEz implements Serializable, Parcelable {
    public int _useTtnet;
    public String accessKey;
    public String accessKeyBp;
    public boolean airStrictModeUsePiperdata;
    public boolean appendCommonParams;
    public boolean autoContinueLoad;
    public int autoPlayBgm;
    public String bid;
    public String bundle;
    public boolean cdnRegionRedirect;
    public String channel;
    public boolean cleanCookieWhenAccountChange;
    public C1058140dds containerBgColor;
    public String debugGlobalProps;
    public Boolean disableBuiltin;
    public Boolean disableCDN;
    public boolean disableEventCache;
    public Boolean disableGecko;
    public Boolean disableGeckoUpdate;
    public Boolean disableOffline;
    public boolean disableSafeBrowsing;
    public boolean disableSaveImage;
    public Integer dynamic;
    public boolean enableAirStrictMode;
    public int enableAutoConcurrency;
    public boolean enableCanvas;
    public Boolean enableCanvasOptimization;
    public int enableCodeCache;
    public boolean enableDynamicV8;
    public int enableExtraInfo;
    public boolean enableForestCdnCache;
    public boolean enableForestPreDecode;
    public int enableGeckoPreDecompress;
    public boolean enableGlobalPropsOptimization;
    public boolean enableJSRuntime;
    public boolean enableJsGroupThread;
    public boolean enableLiteMode;
    public int enableLynxPrefetch;
    public Boolean enableMemoryCache;
    public boolean enableMultiAsyncThread;
    public boolean enableMultiTab;
    public boolean enablePendingJsTask;
    public int enablePreCodeCache;
    public int enablePreDecode;
    public int enablePreDecodeTemplate;
    public int enablePrefetch;
    public boolean enableScrollWebView;
    public boolean enableStorageGroup;
    public boolean enableSyncFlush;
    public boolean enableTemplateBundleCache;
    public boolean enableVsyncAlignedMessageLoop;
    public EnumC1067640dtC engineType;
    public String fallbackUrl;
    public Boolean forceGenericFetcher;
    public boolean forceH5;
    public boolean forceSingleGroup;
    public String forceThemeStyle;
    public boolean geckoUrlRedirection;
    public String globalPropsAllowList;
    public String group;
    public boolean hideDebugLabel;
    public boolean hideSystemVideoPoster;
    public boolean ignoreAllQueryParams;
    public int ignoreCachePolicy;
    public boolean ignoreCachedTheme;
    public boolean ignoreWebHttpOrSslError;
    public String ignoredQueryParams;
    public String initialData;
    public boolean landscapeScreenSizeAsPortrait;
    public C1058140dds loadingBgColor;
    public boolean lockResource;
    public String lynxPrefetchBid;
    public Integer lynxviewHeight;
    public Integer lynxviewWidth;
    public boolean needSecLink;
    public boolean needSetScreenSize;
    public Integer netWorker;
    public Boolean onlyLocal;
    public int parallelFetchResource;
    public String preloadFonts;
    public String preloadSettingsKeys;
    public String preloadStorageKeys;
    public int presetHeight;
    public boolean presetSafePoint;
    public int presetWidth;
    public boolean proxyEnabledRuntimeType;
    public String redirectRegions;
    public boolean removeWvInUa;
    public Boolean resourceDynamic;
    public String scriptUrl;
    public String secLinkScene;
    public String sessionId;
    public boolean shareGroup;
    public String sparkPerfBiz;
    public int sspConfig;
    public String ssrCacheKey;
    public String ssrInitData;
    public Integer ssrMode;
    public String ssrUrl;
    public String starlingChannel;
    public boolean starlingFallback;
    public String strictUrl;
    public String surl;
    public int threadStrategy;
    public String tracingUUID;
    public boolean uiRunningMode;
    public String url;
    public boolean useForest;
    public boolean useMotion;
    public boolean useMutableContext;
    public boolean usePreloadResourceH5;
    public boolean useSystemBrowserUa;
    public Boolean waitGeckoUpdate;
    public boolean waitLowStorageUpdate;
    public boolean webViewScrollFirstWhenExpanded;
    public static final C1542700qFQ Companion = new Object() { // from class: X.0qFQ
    };
    public static final Parcelable.Creator<HybridSchemaParam> CREATOR = new Parcelable.Creator<HybridSchemaParam>() { // from class: X.0qFP
        @Override // android.os.Parcelable.Creator
        public final HybridSchemaParam createFromParcel(Parcel parcel) {
            return new HybridSchemaParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HybridSchemaParam[] newArray(int i) {
            return new HybridSchemaParam[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public HybridSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public void adjustValues() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final String getAccessKeyBp() {
        return this.accessKeyBp;
    }

    public final boolean getAirStrictModeUsePiperdata() {
        return this.airStrictModeUsePiperdata;
    }

    public final boolean getAppendCommonParams() {
        return this.appendCommonParams;
    }

    public final boolean getAutoContinueLoad() {
        return this.autoContinueLoad;
    }

    public final int getAutoPlayBgm() {
        return this.autoPlayBgm;
    }

    public final String getBid() {
        return this.bid;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final boolean getCdnRegionRedirect() {
        return this.cdnRegionRedirect;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final boolean getCleanCookieWhenAccountChange() {
        return this.cleanCookieWhenAccountChange;
    }

    public final C1058140dds getContainerBgColor() {
        return this.containerBgColor;
    }

    public final String getDebugGlobalProps() {
        return this.debugGlobalProps;
    }

    public final Boolean getDisableBuiltin() {
        return this.disableBuiltin;
    }

    public final Boolean getDisableCDN() {
        return this.disableCDN;
    }

    public final boolean getDisableEventCache() {
        return this.disableEventCache;
    }

    public final Boolean getDisableGecko() {
        return this.disableGecko;
    }

    public final Boolean getDisableGeckoUpdate() {
        return this.disableGeckoUpdate;
    }

    public final Boolean getDisableOffline() {
        return this.disableOffline;
    }

    public final boolean getDisableSafeBrowsing() {
        return this.disableSafeBrowsing;
    }

    public final boolean getDisableSaveImage() {
        return this.disableSaveImage;
    }

    public final Integer getDynamic() {
        return this.dynamic;
    }

    public final boolean getEnableAirStrictMode() {
        return this.enableAirStrictMode;
    }

    public final int getEnableAutoConcurrency() {
        return this.enableAutoConcurrency;
    }

    public final boolean getEnableCanvas() {
        return this.enableCanvas;
    }

    public final Boolean getEnableCanvasOptimization() {
        return this.enableCanvasOptimization;
    }

    public final int getEnableCodeCache() {
        return this.enableCodeCache;
    }

    public final boolean getEnableDynamicV8() {
        return this.enableDynamicV8;
    }

    public final int getEnableExtraInfo() {
        return this.enableExtraInfo;
    }

    public final boolean getEnableForestCdnCache() {
        return this.enableForestCdnCache;
    }

    public final boolean getEnableForestPreDecode() {
        return this.enableForestPreDecode;
    }

    public final int getEnableGeckoPreDecompress() {
        return this.enableGeckoPreDecompress;
    }

    public final boolean getEnableGlobalPropsOptimization() {
        return this.enableGlobalPropsOptimization;
    }

    public final boolean getEnableJSRuntime() {
        return this.enableJSRuntime;
    }

    public final boolean getEnableJsGroupThread() {
        return this.enableJsGroupThread;
    }

    public final boolean getEnableLiteMode() {
        return this.enableLiteMode;
    }

    public final int getEnableLynxPrefetch() {
        return this.enableLynxPrefetch;
    }

    public final Boolean getEnableMemoryCache() {
        return this.enableMemoryCache;
    }

    public final boolean getEnableMultiAsyncThread() {
        return this.enableMultiAsyncThread;
    }

    public final boolean getEnableMultiTab() {
        return this.enableMultiTab;
    }

    public final boolean getEnablePendingJsTask() {
        return this.enablePendingJsTask;
    }

    public final int getEnablePreCodeCache() {
        return this.enablePreCodeCache;
    }

    public final int getEnablePreDecode() {
        return this.enablePreDecode;
    }

    public final int getEnablePreDecodeTemplate() {
        return this.enablePreDecodeTemplate;
    }

    public final int getEnablePrefetch() {
        return this.enablePrefetch;
    }

    public final boolean getEnableScrollWebView() {
        return this.enableScrollWebView;
    }

    public final boolean getEnableStorageGroup() {
        return this.enableStorageGroup;
    }

    public final boolean getEnableSyncFlush() {
        return this.enableSyncFlush;
    }

    public final boolean getEnableTemplateBundleCache() {
        return this.enableTemplateBundleCache;
    }

    public final boolean getEnableVsyncAlignedMessageLoop() {
        return this.enableVsyncAlignedMessageLoop;
    }

    @Override // X.AbstractC1542430qEz
    public EnumC1067640dtC getEngineType() {
        return this.engineType;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final Boolean getForceGenericFetcher() {
        return this.forceGenericFetcher;
    }

    public final boolean getForceH5() {
        return this.forceH5;
    }

    public final boolean getForceSingleGroup() {
        return this.forceSingleGroup;
    }

    public final String getForceThemeStyle() {
        return this.forceThemeStyle;
    }

    public final boolean getGeckoUrlRedirection() {
        return this.geckoUrlRedirection;
    }

    public final String getGlobalPropsAllowList() {
        return this.globalPropsAllowList;
    }

    public final String getGroup() {
        return this.group;
    }

    public final boolean getHideDebugLabel() {
        return this.hideDebugLabel;
    }

    public final boolean getHideSystemVideoPoster() {
        return this.hideSystemVideoPoster;
    }

    public final boolean getIgnoreAllQueryParams() {
        return this.ignoreAllQueryParams;
    }

    public final int getIgnoreCachePolicy() {
        return this.ignoreCachePolicy;
    }

    public final boolean getIgnoreCachedTheme() {
        return this.ignoreCachedTheme;
    }

    public final boolean getIgnoreWebHttpOrSslError() {
        return this.ignoreWebHttpOrSslError;
    }

    public final String getIgnoredQueryParams() {
        return this.ignoredQueryParams;
    }

    public final String getInitialData() {
        return this.initialData;
    }

    public final boolean getLandscapeScreenSizeAsPortrait() {
        return this.landscapeScreenSizeAsPortrait;
    }

    public final C1058140dds getLoadingBgColor() {
        return this.loadingBgColor;
    }

    public final boolean getLockResource() {
        return this.lockResource;
    }

    public final String getLynxPrefetchBid() {
        return this.lynxPrefetchBid;
    }

    public final Integer getLynxviewHeight() {
        return this.lynxviewHeight;
    }

    public final Integer getLynxviewWidth() {
        return this.lynxviewWidth;
    }

    public final boolean getNeedSecLink() {
        return this.needSecLink;
    }

    public final boolean getNeedSetScreenSize() {
        return this.needSetScreenSize;
    }

    public final Integer getNetWorker() {
        return this.netWorker;
    }

    public final Boolean getOnlyLocal() {
        return this.onlyLocal;
    }

    public final int getParallelFetchResource() {
        return this.parallelFetchResource;
    }

    public final String getPreloadFonts() {
        return this.preloadFonts;
    }

    public final String getPreloadSettingsKeys() {
        return this.preloadSettingsKeys;
    }

    public final String getPreloadStorageKeys() {
        return this.preloadStorageKeys;
    }

    public final int getPresetHeight() {
        return this.presetHeight;
    }

    public final boolean getPresetSafePoint() {
        return this.presetSafePoint;
    }

    public final int getPresetWidth() {
        return this.presetWidth;
    }

    public final boolean getProxyEnabledRuntimeType() {
        return this.proxyEnabledRuntimeType;
    }

    public final String getRedirectRegions() {
        return this.redirectRegions;
    }

    public final boolean getRemoveWvInUa() {
        return this.removeWvInUa;
    }

    public final Boolean getResourceDynamic() {
        return this.resourceDynamic;
    }

    public final String getScriptUrl() {
        return this.scriptUrl;
    }

    public final String getSecLinkScene() {
        return this.secLinkScene;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getShareGroup() {
        return this.shareGroup;
    }

    public final String getSparkPerfBiz() {
        return this.sparkPerfBiz;
    }

    public final int getSspConfig() {
        return this.sspConfig;
    }

    public final String getSsrCacheKey() {
        return this.ssrCacheKey;
    }

    public final String getSsrInitData() {
        return this.ssrInitData;
    }

    public final Integer getSsrMode() {
        return this.ssrMode;
    }

    public final String getSsrUrl() {
        return this.ssrUrl;
    }

    public final String getStarlingChannel() {
        return this.starlingChannel;
    }

    public final boolean getStarlingFallback() {
        return this.starlingFallback;
    }

    public final String getStrictUrl() {
        return this.strictUrl;
    }

    public final String getSurl() {
        return this.surl;
    }

    public final int getThreadStrategy() {
        return this.threadStrategy;
    }

    public final String getTracingUUID() {
        return this.tracingUUID;
    }

    public final boolean getUiRunningMode() {
        return this.uiRunningMode;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUseForest() {
        return this.useForest;
    }

    public final boolean getUseMotion() {
        return this.useMotion;
    }

    public final boolean getUseMutableContext() {
        return this.useMutableContext;
    }

    public final boolean getUsePreloadResourceH5() {
        return this.usePreloadResourceH5;
    }

    public final boolean getUseSystemBrowserUa() {
        return this.useSystemBrowserUa;
    }

    public final Boolean getWaitGeckoUpdate() {
        return this.waitGeckoUpdate;
    }

    public final boolean getWaitLowStorageUpdate() {
        return this.waitLowStorageUpdate;
    }

    public final boolean getWebViewScrollFirstWhenExpanded() {
        return this.webViewScrollFirstWhenExpanded;
    }

    public final int get_useTtnet() {
        return this._useTtnet;
    }

    public HybridSchemaParam(EnumC1067640dtC enumC1067640dtC) {
        super(enumC1067640dtC);
        this.engineType = enumC1067640dtC;
        this.url = "";
        this.strictUrl = "";
        this.fallbackUrl = "";
        this.bid = "hybridkit_default_bid";
        this.bundle = "";
        this.channel = "";
        this.group = "default_lynx_group";
        this.initialData = "";
        this.preloadFonts = "";
        this.presetWidth = -1;
        this.presetHeight = -1;
        this.shareGroup = true;
        this.surl = "";
        this.uiRunningMode = true;
        this._useTtnet = -1;
        this.secLinkScene = "";
        this.preloadSettingsKeys = "";
        this.lynxPrefetchBid = "";
        this.enableJSRuntime = true;
        this.redirectRegions = "";
        this.ignoredQueryParams = "";
        this.preloadStorageKeys = "";
        this.forceThemeStyle = "";
        this.enableTemplateBundleCache = true;
        this.debugGlobalProps = "";
        this.ignoreWebHttpOrSslError = true;
        this.enableMultiAsyncThread = true;
        this.scriptUrl = "";
        this.enableGeckoPreDecompress = 1;
    }

    public void readFromParcel(Parcel parcel) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Integer num;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        boolean z;
        Integer num2;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean bool10;
        boolean z5;
        Integer num3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        setEngineType(EnumC1067640dtC.values()[parcel.readInt()]);
        String string = parcel.readString();
        String str = "";
        if (string == null) {
            string = "";
        }
        this.url = string;
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        this.fallbackUrl = string2;
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        this.bid = string3;
        Class cls = Boolean.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Integer num4 = null;
        if (value instanceof Boolean) {
            bool = (Boolean) value;
        } else {
            bool = null;
        }
        this.disableBuiltin = bool;
        Object value2 = parcel.readValue(cls.getClassLoader());
        if (value2 instanceof Boolean) {
            bool2 = (Boolean) value2;
        } else {
            bool2 = null;
        }
        this.disableOffline = bool2;
        Object value3 = parcel.readValue(cls.getClassLoader());
        if (value3 instanceof Boolean) {
            bool3 = (Boolean) value3;
        } else {
            bool3 = null;
        }
        this.disableGecko = bool3;
        Object value4 = parcel.readValue(cls.getClassLoader());
        if (value4 instanceof Boolean) {
            bool4 = (Boolean) value4;
        } else {
            bool4 = null;
        }
        this.disableGeckoUpdate = bool4;
        Object value5 = parcel.readValue(cls.getClassLoader());
        if (value5 instanceof Boolean) {
            bool5 = (Boolean) value5;
        } else {
            bool5 = null;
        }
        this.disableCDN = bool5;
        Class cls2 = Integer.TYPE;
        Object value6 = parcel.readValue(cls2.getClassLoader());
        if (value6 instanceof Integer) {
            num = (Integer) value6;
        } else {
            num = null;
        }
        this.netWorker = num;
        Object value7 = parcel.readValue(cls.getClassLoader());
        if (value7 instanceof Boolean) {
            bool6 = (Boolean) value7;
        } else {
            bool6 = null;
        }
        this.resourceDynamic = bool6;
        Object value8 = parcel.readValue(cls.getClassLoader());
        if (value8 instanceof Boolean) {
            bool7 = (Boolean) value8;
        } else {
            bool7 = null;
        }
        this.onlyLocal = bool7;
        Object value9 = parcel.readValue(cls.getClassLoader());
        if (value9 instanceof Boolean) {
            bool8 = (Boolean) value9;
        } else {
            bool8 = null;
        }
        this.enableMemoryCache = bool8;
        Object value10 = parcel.readValue(cls.getClassLoader());
        if (value10 instanceof Boolean) {
            bool9 = (Boolean) value10;
        } else {
            bool9 = null;
        }
        this.waitGeckoUpdate = bool9;
        this.accessKey = parcel.readString();
        this.accessKeyBp = parcel.readString();
        boolean z34 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useForest = z;
        Object value11 = parcel.readValue(cls2.getClassLoader());
        if (value11 instanceof Integer) {
            num2 = (Integer) value11;
        } else {
            num2 = null;
        }
        this.dynamic = num2;
        String string4 = parcel.readString();
        if (string4 == null) {
            string4 = "";
        }
        this.bundle = string4;
        String string5 = parcel.readString();
        if (string5 == null) {
            string5 = "";
        }
        this.channel = string5;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.lockResource = z2;
        this.sessionId = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableCanvas = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.enableDynamicV8 = z4;
        Object value12 = parcel.readValue(cls.getClassLoader());
        if (value12 instanceof Boolean) {
            bool10 = (Boolean) value12;
        } else {
            bool10 = null;
        }
        this.enableCanvasOptimization = bool10;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.forceH5 = z5;
        String string6 = parcel.readString();
        if (string6 == null) {
            string6 = "";
        }
        this.group = string6;
        String string7 = parcel.readString();
        if (string7 == null) {
            string7 = "";
        }
        this.initialData = string7;
        Object value13 = parcel.readValue(cls2.getClassLoader());
        if (value13 instanceof Integer) {
            num3 = (Integer) value13;
        } else {
            num3 = null;
        }
        this.lynxviewWidth = num3;
        Object value14 = parcel.readValue(cls2.getClassLoader());
        if (value14 instanceof Integer) {
            num4 = (Integer) value14;
        }
        this.lynxviewHeight = num4;
        String string8 = parcel.readString();
        if (string8 == null) {
            string8 = "";
        }
        this.preloadFonts = string8;
        this.presetWidth = parcel.readInt();
        this.presetHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.presetSafePoint = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.shareGroup = z7;
        String string9 = parcel.readString();
        if (string9 == null) {
            string9 = "";
        }
        this.surl = string9;
        this.threadStrategy = parcel.readInt();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.uiRunningMode = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.disableSaveImage = z9;
        this.ignoreCachePolicy = parcel.readInt();
        this._useTtnet = parcel.readInt();
        String string10 = parcel.readString();
        if (string10 == null) {
            string10 = "";
        }
        this.secLinkScene = string10;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.needSecLink = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.landscapeScreenSizeAsPortrait = z11;
        this.autoPlayBgm = parcel.readInt();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.hideSystemVideoPoster = z12;
        String string11 = parcel.readString();
        if (string11 == null) {
            string11 = "";
        }
        this.preloadSettingsKeys = string11;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.enablePendingJsTask = z13;
        this.enablePrefetch = parcel.readInt();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.enableJSRuntime = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.enableAirStrictMode = z15;
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.appendCommonParams = z16;
        this.parallelFetchResource = parcel.readInt();
        this.enableCodeCache = parcel.readInt();
        this.enablePreCodeCache = parcel.readInt();
        this.sspConfig = parcel.readInt();
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.usePreloadResourceH5 = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.cdnRegionRedirect = z18;
        String string12 = parcel.readString();
        if (string12 == null) {
            string12 = "";
        }
        this.redirectRegions = string12;
        String string13 = parcel.readString();
        if (string13 == null) {
            string13 = "";
        }
        this.ignoredQueryParams = string13;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.ignoreAllQueryParams = z19;
        this.starlingChannel = parcel.readString();
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.starlingFallback = z20;
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.geckoUrlRedirection = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.disableEventCache = z22;
        this.enableExtraInfo = parcel.readInt();
        String string14 = parcel.readString();
        if (string14 == null) {
            string14 = "";
        }
        this.preloadStorageKeys = string14;
        String string15 = parcel.readString();
        if (string15 != null) {
            str = string15;
        }
        this.forceThemeStyle = str;
        if (parcel.readByte() != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.ignoreCachedTheme = z23;
        if (parcel.readByte() != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        this.waitLowStorageUpdate = z24;
        if (parcel.readByte() != 0) {
            z25 = true;
        } else {
            z25 = false;
        }
        this.proxyEnabledRuntimeType = z25;
        if (parcel.readByte() != 0) {
            z26 = true;
        } else {
            z26 = false;
        }
        this.enableScrollWebView = z26;
        if (parcel.readByte() != 0) {
            z27 = true;
        } else {
            z27 = false;
        }
        this.needSetScreenSize = z27;
        if (parcel.readByte() != 0) {
            z28 = true;
        } else {
            z28 = false;
        }
        this.webViewScrollFirstWhenExpanded = z28;
        if (parcel.readByte() != 0) {
            z29 = true;
        } else {
            z29 = false;
        }
        this.disableSafeBrowsing = z29;
        if (parcel.readByte() != 0) {
            z30 = true;
        } else {
            z30 = false;
        }
        this.useSystemBrowserUa = z30;
        if (parcel.readByte() != 0) {
            z31 = true;
        } else {
            z31 = false;
        }
        this.enableTemplateBundleCache = z31;
        if (parcel.readByte() != 0) {
            z32 = true;
        } else {
            z32 = false;
        }
        this.removeWvInUa = z32;
        this.ssrUrl = parcel.readString();
        this.ssrMode = Integer.valueOf(parcel.readInt());
        this.globalPropsAllowList = parcel.readString();
        if (parcel.readByte() != 0) {
            z33 = true;
        } else {
            z33 = false;
        }
        this.enableJsGroupThread = z33;
        this.ssrCacheKey = parcel.readString();
        this.ssrInitData = parcel.readString();
        this.enableGeckoPreDecompress = parcel.readInt();
        if (parcel.readByte() == 0) {
            z34 = false;
        }
        this.enableMultiTab = z34;
        this.tracingUUID = parcel.readString();
    }

    public final void setAccessKey(String str) {
        this.accessKey = str;
    }

    public final void setAccessKeyBp(String str) {
        this.accessKeyBp = str;
    }

    public final void setAirStrictModeUsePiperdata(boolean z) {
        this.airStrictModeUsePiperdata = z;
    }

    public final void setAppendCommonParams(boolean z) {
        this.appendCommonParams = z;
    }

    public final void setAutoContinueLoad(boolean z) {
        this.autoContinueLoad = z;
    }

    public final void setAutoPlayBgm(int i) {
        this.autoPlayBgm = i;
    }

    public final void setBid(String str) {
        this.bid = str;
    }

    public final void setBundle(String str) {
        this.bundle = str;
    }

    public final void setCdnRegionRedirect(boolean z) {
        this.cdnRegionRedirect = z;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setCleanCookieWhenAccountChange(boolean z) {
        this.cleanCookieWhenAccountChange = z;
    }

    public final void setContainerBgColor(C1058140dds c1058140dds) {
        this.containerBgColor = c1058140dds;
    }

    public final void setDebugGlobalProps(String str) {
        this.debugGlobalProps = str;
    }

    public final void setDisableBuiltin(Boolean bool) {
        this.disableBuiltin = bool;
    }

    public final void setDisableCDN(Boolean bool) {
        this.disableCDN = bool;
    }

    public final void setDisableEventCache(boolean z) {
        this.disableEventCache = z;
    }

    public final void setDisableGecko(Boolean bool) {
        this.disableGecko = bool;
    }

    public final void setDisableGeckoUpdate(Boolean bool) {
        this.disableGeckoUpdate = bool;
    }

    public final void setDisableOffline(Boolean bool) {
        this.disableOffline = bool;
    }

    public final void setDisableSafeBrowsing(boolean z) {
        this.disableSafeBrowsing = z;
    }

    public final void setDisableSaveImage(boolean z) {
        this.disableSaveImage = z;
    }

    public final void setDynamic(Integer num) {
        this.dynamic = num;
    }

    public final void setEnableAirStrictMode(boolean z) {
        this.enableAirStrictMode = z;
    }

    public final void setEnableAutoConcurrency(int i) {
        this.enableAutoConcurrency = i;
    }

    public final void setEnableCanvas(boolean z) {
        this.enableCanvas = z;
    }

    public final void setEnableCanvasOptimization(Boolean bool) {
        this.enableCanvasOptimization = bool;
    }

    public final void setEnableCodeCache(int i) {
        this.enableCodeCache = i;
    }

    public final void setEnableDynamicV8(boolean z) {
        this.enableDynamicV8 = z;
    }

    public final void setEnableExtraInfo(int i) {
        this.enableExtraInfo = i;
    }

    public final void setEnableForestCdnCache(boolean z) {
        this.enableForestCdnCache = z;
    }

    public final void setEnableForestPreDecode(boolean z) {
        this.enableForestPreDecode = z;
    }

    public final void setEnableGeckoPreDecompress(int i) {
        this.enableGeckoPreDecompress = i;
    }

    public final void setEnableGlobalPropsOptimization(boolean z) {
        this.enableGlobalPropsOptimization = z;
    }

    public final void setEnableJSRuntime(boolean z) {
        this.enableJSRuntime = z;
    }

    public final void setEnableJsGroupThread(boolean z) {
        this.enableJsGroupThread = z;
    }

    public final void setEnableLiteMode(boolean z) {
        this.enableLiteMode = z;
    }

    public final void setEnableLynxPrefetch(int i) {
        this.enableLynxPrefetch = i;
    }

    public final void setEnableMemoryCache(Boolean bool) {
        this.enableMemoryCache = bool;
    }

    public final void setEnableMultiAsyncThread(boolean z) {
        this.enableMultiAsyncThread = z;
    }

    public final void setEnableMultiTab(boolean z) {
        this.enableMultiTab = z;
    }

    public final void setEnablePendingJsTask(boolean z) {
        this.enablePendingJsTask = z;
    }

    public final void setEnablePreCodeCache(int i) {
        this.enablePreCodeCache = i;
    }

    public final void setEnablePreDecode(int i) {
        this.enablePreDecode = i;
    }

    public final void setEnablePreDecodeTemplate(int i) {
        this.enablePreDecodeTemplate = i;
    }

    public final void setEnablePrefetch(int i) {
        this.enablePrefetch = i;
    }

    public final void setEnableScrollWebView(boolean z) {
        this.enableScrollWebView = z;
    }

    public final void setEnableStorageGroup(boolean z) {
        this.enableStorageGroup = z;
    }

    public final void setEnableSyncFlush(boolean z) {
        this.enableSyncFlush = z;
    }

    public final void setEnableTemplateBundleCache(boolean z) {
        this.enableTemplateBundleCache = z;
    }

    public final void setEnableVsyncAlignedMessageLoop(boolean z) {
        this.enableVsyncAlignedMessageLoop = z;
    }

    @Override // X.AbstractC1542430qEz
    public void setEngineType(EnumC1067640dtC enumC1067640dtC) {
        this.engineType = enumC1067640dtC;
    }

    public final void setFallbackUrl(String str) {
        this.fallbackUrl = str;
    }

    public final void setForceGenericFetcher(Boolean bool) {
        this.forceGenericFetcher = bool;
    }

    public final void setForceH5(boolean z) {
        this.forceH5 = z;
    }

    public final void setForceSingleGroup(boolean z) {
        this.forceSingleGroup = z;
    }

    public final void setForceThemeStyle(String str) {
        this.forceThemeStyle = str;
    }

    public final void setGeckoUrlRedirection(boolean z) {
        this.geckoUrlRedirection = z;
    }

    public final void setGlobalPropsAllowList(String str) {
        this.globalPropsAllowList = str;
    }

    public final void setGroup(String str) {
        this.group = str;
    }

    public final void setHideDebugLabel(boolean z) {
        this.hideDebugLabel = z;
    }

    public final void setHideSystemVideoPoster(boolean z) {
        this.hideSystemVideoPoster = z;
    }

    public final void setIgnoreAllQueryParams(boolean z) {
        this.ignoreAllQueryParams = z;
    }

    public final void setIgnoreCachePolicy(int i) {
        this.ignoreCachePolicy = i;
    }

    public final void setIgnoreCachedTheme(boolean z) {
        this.ignoreCachedTheme = z;
    }

    public final void setIgnoreWebHttpOrSslError(boolean z) {
        this.ignoreWebHttpOrSslError = z;
    }

    public final void setIgnoredQueryParams(String str) {
        this.ignoredQueryParams = str;
    }

    public final void setInitialData(String str) {
        this.initialData = str;
    }

    public final void setLandscapeScreenSizeAsPortrait(boolean z) {
        this.landscapeScreenSizeAsPortrait = z;
    }

    public final void setLoadingBgColor(C1058140dds c1058140dds) {
        this.loadingBgColor = c1058140dds;
    }

    public final void setLockResource(boolean z) {
        this.lockResource = z;
    }

    public final void setLynxPrefetchBid(String str) {
        this.lynxPrefetchBid = str;
    }

    public final void setLynxviewHeight(Integer num) {
        this.lynxviewHeight = num;
    }

    public final void setLynxviewWidth(Integer num) {
        this.lynxviewWidth = num;
    }

    public final void setNeedSecLink(boolean z) {
        this.needSecLink = z;
    }

    public final void setNeedSetScreenSize(boolean z) {
        this.needSetScreenSize = z;
    }

    public final void setNetWorker(Integer num) {
        this.netWorker = num;
    }

    public final void setOnlyLocal(Boolean bool) {
        this.onlyLocal = bool;
    }

    public final void setParallelFetchResource(int i) {
        this.parallelFetchResource = i;
    }

    public final void setPreloadFonts(String str) {
        this.preloadFonts = str;
    }

    public final void setPreloadSettingsKeys(String str) {
        this.preloadSettingsKeys = str;
    }

    public final void setPreloadStorageKeys(String str) {
        this.preloadStorageKeys = str;
    }

    public final void setPresetHeight(int i) {
        this.presetHeight = i;
    }

    public final void setPresetSafePoint(boolean z) {
        this.presetSafePoint = z;
    }

    public final void setPresetWidth(int i) {
        this.presetWidth = i;
    }

    public final void setProxyEnabledRuntimeType(boolean z) {
        this.proxyEnabledRuntimeType = z;
    }

    public final void setRedirectRegions(String str) {
        this.redirectRegions = str;
    }

    public final void setRemoveWvInUa(boolean z) {
        this.removeWvInUa = z;
    }

    public final void setResourceDynamic(Boolean bool) {
        this.resourceDynamic = bool;
    }

    public final void setScriptUrl(String str) {
        this.scriptUrl = str;
    }

    public final void setSecLinkScene(String str) {
        this.secLinkScene = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setShareGroup(boolean z) {
        this.shareGroup = z;
    }

    public final void setSparkPerfBiz(String str) {
        this.sparkPerfBiz = str;
    }

    public final void setSspConfig(int i) {
        this.sspConfig = i;
    }

    public final void setSsrCacheKey(String str) {
        this.ssrCacheKey = str;
    }

    public final void setSsrInitData(String str) {
        this.ssrInitData = str;
    }

    public final void setSsrMode(Integer num) {
        this.ssrMode = num;
    }

    public final void setSsrUrl(String str) {
        this.ssrUrl = str;
    }

    public final void setStarlingChannel(String str) {
        this.starlingChannel = str;
    }

    public final void setStarlingFallback(boolean z) {
        this.starlingFallback = z;
    }

    public final void setStrictUrl(String str) {
        this.strictUrl = str;
    }

    public final void setSurl(String str) {
        this.surl = str;
    }

    public final void setThreadStrategy(int i) {
        this.threadStrategy = i;
    }

    public final void setTracingUUID(String str) {
        this.tracingUUID = str;
    }

    public final void setUiRunningMode(boolean z) {
        this.uiRunningMode = z;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUseForest(boolean z) {
        this.useForest = z;
    }

    public final void setUseMotion(boolean z) {
        this.useMotion = z;
    }

    public final void setUseMutableContext(boolean z) {
        this.useMutableContext = z;
    }

    public final void setUsePreloadResourceH5(boolean z) {
        this.usePreloadResourceH5 = z;
    }

    public final void setUseSystemBrowserUa(boolean z) {
        this.useSystemBrowserUa = z;
    }

    public final void setWaitGeckoUpdate(Boolean bool) {
        this.waitGeckoUpdate = bool;
    }

    public final void setWaitLowStorageUpdate(boolean z) {
        this.waitLowStorageUpdate = z;
    }

    public final void setWebViewScrollFirstWhenExpanded(boolean z) {
        this.webViewScrollFirstWhenExpanded = z;
    }

    public final void set_useTtnet(int i) {
        this._useTtnet = i;
    }

    public HybridSchemaParam(Parcel parcel) {
        this(EnumC1067640dtC.UNKNOWN);
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(getEngineType().ordinal());
        parcel.writeString(this.url);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.bid);
        parcel.writeValue(this.disableBuiltin);
        parcel.writeValue(this.disableOffline);
        parcel.writeValue(this.disableGecko);
        parcel.writeValue(this.disableGeckoUpdate);
        parcel.writeValue(this.disableCDN);
        parcel.writeValue(this.netWorker);
        parcel.writeValue(this.resourceDynamic);
        parcel.writeValue(this.onlyLocal);
        parcel.writeValue(this.enableMemoryCache);
        parcel.writeValue(this.waitGeckoUpdate);
        parcel.writeString(this.accessKey);
        parcel.writeString(this.accessKeyBp);
        parcel.writeByte(this.useForest ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.dynamic);
        parcel.writeString(this.bundle);
        parcel.writeString(this.channel);
        parcel.writeByte(this.lockResource ? (byte) 1 : (byte) 0);
        parcel.writeString(this.sessionId);
        parcel.writeByte(this.enableCanvas ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableDynamicV8 ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.enableCanvasOptimization);
        parcel.writeByte(this.forceH5 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.group);
        parcel.writeString(this.initialData);
        parcel.writeValue(this.lynxviewWidth);
        parcel.writeValue(this.lynxviewHeight);
        parcel.writeString(this.preloadFonts);
        parcel.writeInt(this.presetWidth);
        parcel.writeInt(this.presetHeight);
        parcel.writeByte(this.presetSafePoint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shareGroup ? (byte) 1 : (byte) 0);
        parcel.writeString(this.surl);
        parcel.writeInt(this.threadStrategy);
        parcel.writeByte(this.uiRunningMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableSaveImage ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.ignoreCachePolicy);
        parcel.writeInt(this._useTtnet);
        parcel.writeString(this.secLinkScene);
        parcel.writeByte(this.needSecLink ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.landscapeScreenSizeAsPortrait ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.autoPlayBgm);
        parcel.writeByte(this.hideSystemVideoPoster ? (byte) 1 : (byte) 0);
        parcel.writeString(this.preloadSettingsKeys);
        parcel.writeByte(this.enablePendingJsTask ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enablePrefetch);
        parcel.writeByte(this.enableJSRuntime ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableAirStrictMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.appendCommonParams ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.parallelFetchResource);
        parcel.writeInt(this.enableCodeCache);
        parcel.writeInt(this.enablePreCodeCache);
        parcel.writeInt(this.enablePreDecode);
        parcel.writeInt(this.sspConfig);
        parcel.writeByte(this.usePreloadResourceH5 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.cdnRegionRedirect ? (byte) 1 : (byte) 0);
        parcel.writeString(this.redirectRegions);
        parcel.writeString(this.ignoredQueryParams);
        parcel.writeByte(this.ignoreAllQueryParams ? (byte) 1 : (byte) 0);
        parcel.writeString(this.starlingChannel);
        parcel.writeByte(this.starlingFallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.geckoUrlRedirection ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableEventCache ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enableExtraInfo);
        parcel.writeString(this.preloadStorageKeys);
        parcel.writeString(this.forceThemeStyle);
        parcel.writeByte(this.ignoreCachedTheme ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.waitLowStorageUpdate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.proxyEnabledRuntimeType ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableScrollWebView ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needSetScreenSize ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.webViewScrollFirstWhenExpanded ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableSafeBrowsing ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useSystemBrowserUa ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableTemplateBundleCache ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.removeWvInUa ? (byte) 1 : (byte) 0);
        parcel.writeString(this.ssrUrl);
        Integer num = this.ssrMode;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.globalPropsAllowList);
        parcel.writeByte(this.enableJsGroupThread ? (byte) 1 : (byte) 0);
        parcel.writeString(this.ssrCacheKey);
        parcel.writeString(this.ssrInitData);
        parcel.writeInt(this.enableGeckoPreDecompress);
        parcel.writeInt(this.enableMultiTab ? 1 : 0);
        parcel.writeString(this.tracingUUID);
    }

    public /* synthetic */ HybridSchemaParam(EnumC1067640dtC enumC1067640dtC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1067640dtC.UNKNOWN : enumC1067640dtC);
    }
}
