package com.bytedance.hybrid.spark.roma;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkPageSampleRatioConfig {
    public static final C01GW<SparkPageSampleRatioConfig> LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(45));

    @C09CT("default_sample_rate")
    public final double defaultSampleRate;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("groups")
    public final List<SampleRateGroup> groups;

    public SparkPageSampleRatioConfig() {
        this(false, 0.0d, null, 7, null);
    }

    public static final class SampleRateGroup {

        @C09CT("pages")
        public final Set<String> pages;

        @C09CT("sample_rate")
        public final double sampleRate;

        public SampleRateGroup(double d, Set<String> set) {
            this.sampleRate = d;
            this.pages = set;
        }
    }

    public SparkPageSampleRatioConfig(boolean z, double d, List<SampleRateGroup> list) {
        this.enable = z;
        this.defaultSampleRate = d;
        this.groups = list;
    }

    public SparkPageSampleRatioConfig(boolean z, double d, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
