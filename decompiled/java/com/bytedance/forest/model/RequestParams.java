package com.bytedance.forest.model;

import X.C1533590q0j;
import X.EnumC1533980q1M;
import X.EnumC1534630q2P;
import X.EnumC825980Wai;
import X.InterfaceC1294060jmO;
import X.InterfaceC1530490pvj;
import X.InterfaceC1533160q02;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class RequestParams {
    public String accessKey;
    public boolean allowIOOnMainThread;
    public boolean allowRedirectInternally;
    public String bundle;
    public boolean cdnRegionRedirect;
    public long cdnTimeout;
    public String channel;
    public boolean checkGeckoFileAvailable;
    public Class<?> consumeType;
    public final Map<String, Object> customParams;
    public InterfaceC1530490pvj dataSupplier;
    public boolean disableBuiltin;
    public boolean disableCDNOnline;
    public boolean disableCdn;
    public boolean disableGeckoRemoteSettings;
    public boolean disableGeckoStatics;
    public boolean disableGeckoUpdate;
    public boolean disableOffline;
    public boolean disablePrefixParser;
    public boolean disableReport;
    public Boolean enableCDNCache;
    public boolean enableConsumeMemoryCache;
    public Boolean enableMemoryCache;
    public Boolean enableNegotiation;
    public boolean enableProcessChain;
    public boolean enableRequestReuse;
    public long fetchPreloadedCacheTimeout;
    public List<String> fetcherSequence;
    public EnumC1534630q2P forceMetaType;
    public boolean forceProcessChain;
    public GeckoSource geckoSource;
    public boolean geckoUrlRedirect;
    public String groupId;
    public Map<String, String> httpRequestHeaders;
    public boolean ignoreAllQueryParams;
    public boolean ignoreExpiration;
    public Set<String> ignoredQueryParams;
    public boolean isPreload;
    public InterfaceC1533160q02 lightSupplier;
    public int loadRetryTimes;
    public boolean loadToMemory;
    public long maxExpirationTime;
    public Boolean needLocalFile;
    public EnumC825980Wai netWorker;
    public boolean onlyLocal;
    public boolean onlyOnline;
    public boolean parallelLoading;
    public List<String> redirectRegions;
    public EnumC1533980q1M resourceScene;
    public String sessionId;
    public String source;
    public boolean supportDirectory;
    public boolean waitGeckoUpdate;
    public boolean waitLowStorageUpdate;
    public Object webResourceRequest;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getLoadToMemory$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getNeedLocalFile$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getNetWorker$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getOnlyLocal$annotations() {
    }

    public final boolean isWebRequest() {
        EnumC1533980q1M enumC1533980q1M;
        return this.webResourceRequest != null || (enumC1533980q1M = this.resourceScene) == EnumC1533980q1M.WEB_CHILD_RESOURCE || enumC1533980q1M == EnumC1533980q1M.WEB_MAIN_DOCUMENT;
    }

    public final boolean isPreloadRequest() {
        return this.isPreload;
    }

    public RequestParams(EnumC1533980q1M enumC1533980q1M) {
        this.resourceScene = enumC1533980q1M;
        C1533590q0j c1533590q0j = C1533590q0j.LIZ;
        c1533590q0j.getClass();
        this.fetcherSequence = C1533590q0j.LJII;
        this.accessKey = "";
        this.checkGeckoFileAvailable = true;
        c1533590q0j.getClass();
        this.loadRetryTimes = 0;
        this.allowRedirectInternally = true;
        c1533590q0j.getClass();
        this.maxExpirationTime = C1533590q0j.LJFF;
        this.groupId = "";
        this.customParams = new LinkedHashMap();
        c1533590q0j.getClass();
        this.fetchPreloadedCacheTimeout = C1533590q0j.LJI;
        this.geckoSource = GeckoSource.CLIENT_CONFIG;
        this.source = "default";
        c1533590q0j.getClass();
        this.cdnTimeout = C1533590q0j.LJ;
    }

    public /* synthetic */ RequestParams(EnumC1533980q1M enumC1533980q1M, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1533980q1M.OTHER : enumC1533980q1M);
    }
}
