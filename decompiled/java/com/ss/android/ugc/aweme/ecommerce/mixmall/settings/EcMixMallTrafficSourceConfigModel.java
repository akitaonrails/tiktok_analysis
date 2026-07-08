package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class EcMixMallTrafficSourceConfigModel {

    @C09CT("enable")
    public final int enable;

    @C09CT("primary_out_source_config")
    public final List<SourceConfig> primaryOutSourceConfig;

    @C09CT("secondary_landing_page_config")
    public final List<SourceConfig> secondaryLandingPageConfig;

    public EcMixMallTrafficSourceConfigModel() {
        this(0, null, null, 7, null);
    }

    public EcMixMallTrafficSourceConfigModel(int i, List<SourceConfig> list, List<SourceConfig> list2) {
        this.enable = i;
        this.primaryOutSourceConfig = list;
        this.secondaryLandingPageConfig = list2;
    }

    public static final class SourceConfig {

        @C09CT("contains")
        public final List<String> contains;

        @C09CT("equals")
        public final List<String> equals;

        @C09CT("regexp")
        public final List<String> regexp;

        @C09CT("type")
        public final String type;

        public SourceConfig() {
            this(null, null, null, "");
        }

        public SourceConfig(List<String> list, List<String> list2, List<String> list3, String str) {
            this.contains = list;
            this.equals = list2;
            this.regexp = list3;
            this.type = str;
        }
    }

    public EcMixMallTrafficSourceConfigModel(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? C1697810uHb.LJ(new SourceConfig(null, null, Collections.singletonList("^homepage_(top|bottom)_-?\\d+tab\\.in_app$"), "nature")) : list, (i2 & 4) != 0 ? null : list2);
    }
}
