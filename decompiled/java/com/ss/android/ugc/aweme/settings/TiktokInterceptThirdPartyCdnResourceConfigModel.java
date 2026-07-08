package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class TiktokInterceptThirdPartyCdnResourceConfigModel {

    @C09CT("enable_intercept")
    public final boolean enableIntercept;

    @C09CT("enable_report")
    public final boolean enableReport;

    @C09CT("inner_domains")
    public final List<String> innerDomains;

    @C09CT("strict_https")
    public final Boolean strictHttps;

    public TiktokInterceptThirdPartyCdnResourceConfigModel(boolean z, boolean z2, List<String> list, Boolean bool) {
        this.enableIntercept = z;
        this.enableReport = z2;
        this.innerDomains = list;
        this.strictHttps = bool;
    }
}
