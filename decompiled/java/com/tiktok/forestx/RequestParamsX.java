package com.tiktok.forestx;

import X.C1532680pzG;
import X.EnumC1507260pKG;
import X.EnumC1533980q1M;
import X.InterfaceC1530960pwU;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class RequestParamsX {
    public String accessKey;
    public boolean allowRedirectInternally;
    public String bundle;
    public Long cacheFreshTime;
    public boolean cdnRegionRedirect;
    public long cdnTimeout;
    public String channel;
    public Class<?> consumeType;
    public Map<String, Object> customParams;
    public boolean disableAssets;
    public boolean disableCDNOnline;
    public boolean disableCdn;
    public boolean disableGecko;
    public boolean disableGeckoRemoteSettings;
    public boolean disableGeckoStatics;
    public boolean disableGeckoUpdate;
    public boolean disablePrefixParser;
    public boolean disableReport;
    public boolean enableCDNCache;
    public boolean enableConsumeMemoryCache;
    public boolean enableContainerProcessUrl;
    public boolean enableMemoryCache;
    public boolean enableNegotiation;
    public Map<String, String> extraQueries;
    public List<String> fetcherSequence;
    public EnumC1507260pKG geckoSource;
    public boolean geckoUrlRedirect;
    public String groupId;
    public Map<String, String> httpRequestHeaders;
    public boolean ignoreAllQueryParams;
    public boolean ignoreExpiration;
    public Set<String> ignoredQueryParams;
    public boolean needCommonParams;
    public boolean onlyLocal;
    public boolean onlyOnline;
    public boolean optimizeStreamForWeb;
    public List<String> redirectRegions;
    public EnumC1533980q1M resourceScene;
    public InterfaceC1530960pwU resourceSupplier;
    public String sessionId;
    public String source;
    public boolean strictMatch;
    public boolean waitGeckoUpdate;
    public boolean waitLowStorageUpdate;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestParamsX() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void setGeckoSource(EnumC1507260pKG enumC1507260pKG) {
        this.geckoSource = enumC1507260pKG;
    }

    public final void setStrictMatch(boolean z) {
        this.strictMatch = z;
    }

    public RequestParamsX(EnumC1533980q1M enumC1533980q1M, Class<?> cls) {
        this.resourceScene = enumC1533980q1M;
        this.consumeType = cls;
        C1532680pzG c1532680pzG = C1532680pzG.LIZ;
        c1532680pzG.getClass();
        this.fetcherSequence = C1532680pzG.LJIJI;
        this.enableNegotiation = true;
        this.enableConsumeMemoryCache = true;
        this.allowRedirectInternally = true;
        this.enableCDNCache = true;
        c1532680pzG.getClass();
        this.cdnTimeout = C1532680pzG.LJIILL;
    }

    public /* synthetic */ RequestParamsX(EnumC1533980q1M enumC1533980q1M, Class cls, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1533980q1M.OTHER : enumC1533980q1M, (i & 2) != 0 ? File.class : cls);
    }
}
