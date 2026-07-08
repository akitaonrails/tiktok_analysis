package com.ss.android.ugc.aweme.ml.request.meta;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class FlashCommonConfig {

    @C09CT("applog_config")
    public final ApplogConfig applogConfig;

    @C09CT("flash_free_ride_feature_configs")
    public final List<FlashFeatureSetConfig> featureSetConfig;

    @C09CT("filter_config")
    public final FilterConfig filterConfig;

    @C09CT("name")
    public final String name;

    @C09CT("not_filter_config")
    public final FilterConfig notFilterConfig;

    @C09CT("type")
    public final int type;

    @C09CT("url_config")
    public final UrlConfig urlConfig;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashCommonConfig(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", urlConfig=");
        sbLIZ.append(this.urlConfig);
        sbLIZ.append(", filterConfig=");
        sbLIZ.append(this.filterConfig);
        sbLIZ.append(", notFilterConfig=");
        sbLIZ.append(this.notFilterConfig);
        sbLIZ.append(", featureSetConfig=");
        sbLIZ.append(this.featureSetConfig);
        sbLIZ.append(", applogConfig=");
        sbLIZ.append(this.applogConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashCommonConfig(String str, int i, UrlConfig urlConfig, FilterConfig filterConfig, FilterConfig filterConfig2, List<FlashFeatureSetConfig> list, ApplogConfig applogConfig) {
        this.name = str;
        this.type = i;
        this.urlConfig = urlConfig;
        this.filterConfig = filterConfig;
        this.notFilterConfig = filterConfig2;
        this.featureSetConfig = list;
        this.applogConfig = applogConfig;
    }

    public FlashCommonConfig(String str, int i, UrlConfig urlConfig, FilterConfig filterConfig, FilterConfig filterConfig2, List list, ApplogConfig applogConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : urlConfig, (i2 & 8) != 0 ? null : filterConfig, (i2 & 16) != 0 ? null : filterConfig2, (i2 & 32) != 0 ? C13BV.INSTANCE : list, (i2 & 64) == 0 ? applogConfig : null);
    }
}
