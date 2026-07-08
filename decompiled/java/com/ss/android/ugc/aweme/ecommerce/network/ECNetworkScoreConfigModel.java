package com.ss.android.ugc.aweme.ecommerce.network;

import X.C08FF;
import X.C09CT;
import X.C2188811AlT;
import X.C2254308sP;
import X.C786410Ut5;
import X.InterfaceC2044707zh;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class ECNetworkScoreConfigModel {

    @C09CT("boundaries")
    public final Boundaries boundaries;

    @C09CT("comparison_metrics")
    public final ComparisonMetrics comparisonMetrics;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_preload_consume")
    public final boolean enablePreloadConsume;

    @C09CT("sample_thresholds")
    public final SampleThresholds sampleThresholds;

    @C09CT("switch_thresholds")
    public final SwitchThresholds switchThresholds;

    @C09CT("window_ms")
    public final long windowMs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Aggregation {
        public static final /* synthetic */ Aggregation[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;

        @C09CT("mean")
        public static final Aggregation MEAN;

        @C09CT("p50")
        public static final Aggregation P50;

        public static InterfaceC2044707zh<Aggregation> getEntries() {
            return LLILLJJLI;
        }

        static {
            Aggregation aggregation = new Aggregation("MEAN", 0);
            MEAN = aggregation;
            Aggregation aggregation2 = new Aggregation("P50", 1);
            P50 = aggregation2;
            Aggregation[] aggregationArr = {aggregation, aggregation2};
            LL = aggregationArr;
            LLILLJJLI = new C2254308sP(aggregationArr);
        }

        public static Aggregation[] values() {
            return (Aggregation[]) LL.clone();
        }

        public static Aggregation valueOf(String str) {
            return (Aggregation) C08FF.LIZ(Aggregation.class, str);
        }

        public Aggregation(String str, int i) {
        }
    }

    public static final class Boundaries {

        @C09CT(alternate = {"api_ttfb_p50_ms"}, value = "api_ttfb_ms")
        public final Range apiTtfbMs;

        @C09CT(alternate = {"img_tput_p50_kbps"}, value = "img_tput_kbps")
        public final Range imgTputKbps;

        @C09CT(alternate = {"pending_mean"}, value = "pending_requests")
        public final Range pendingRequests;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Boundaries)) {
                return false;
            }
            Boundaries boundaries = (Boundaries) obj;
            return Intrinsics.LJFF(this.imgTputKbps, boundaries.imgTputKbps) && Intrinsics.LJFF(this.apiTtfbMs, boundaries.apiTtfbMs) && Intrinsics.LJFF(this.pendingRequests, boundaries.pendingRequests);
        }

        public final int hashCode() {
            return (((this.imgTputKbps.hashCode() * 31) + this.apiTtfbMs.hashCode()) * 31) + this.pendingRequests.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Boundaries(imgTputKbps=");
            sbLIZ.append(this.imgTputKbps);
            sbLIZ.append(", apiTtfbMs=");
            sbLIZ.append(this.apiTtfbMs);
            sbLIZ.append(", pendingRequests=");
            sbLIZ.append(this.pendingRequests);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Boundaries() {
            this(new Range(1000L, 200L), new Range(200L, 2000L), new Range(5L, 20L));
        }

        public Boundaries(Range range, Range range2, Range range3) {
            this.imgTputKbps = range;
            this.apiTtfbMs = range2;
            this.pendingRequests = range3;
        }
    }

    public static final class ComparisonMetrics {

        @C09CT("api")
        public final Aggregation api;

        @C09CT("image")
        public final Aggregation image;

        @C09CT("pending")
        public final Aggregation pending;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComparisonMetrics)) {
                return false;
            }
            ComparisonMetrics comparisonMetrics = (ComparisonMetrics) obj;
            return this.image == comparisonMetrics.image && this.api == comparisonMetrics.api && this.pending == comparisonMetrics.pending;
        }

        public final int hashCode() {
            return (((this.image.hashCode() * 31) + this.api.hashCode()) * 31) + this.pending.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ComparisonMetrics(image=");
            sbLIZ.append(this.image);
            sbLIZ.append(", api=");
            sbLIZ.append(this.api);
            sbLIZ.append(", pending=");
            sbLIZ.append(this.pending);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ComparisonMetrics() {
            this(Aggregation.P50, Aggregation.P50, Aggregation.MEAN);
        }

        public ComparisonMetrics(Aggregation aggregation, Aggregation aggregation2, Aggregation aggregation3) {
            this.image = aggregation;
            this.api = aggregation2;
            this.pending = aggregation3;
        }
    }

    public static final class Range {

        @C09CT("bad")
        public final long bad;

        @C09CT("good")
        public final long good;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return this.good == range.good && this.bad == range.bad;
        }

        public final int hashCode() {
            return (C786410Ut5.Y2(this.good) * 31) + C786410Ut5.Y2(this.bad);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Range(good=");
            sbLIZ.append(this.good);
            sbLIZ.append(", bad=");
            sbLIZ.append(this.bad);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Range() {
            this(-1L, -1L);
        }

        public Range(long j, long j2) {
            this.good = j;
            this.bad = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECNetworkScoreConfigModel)) {
            return false;
        }
        ECNetworkScoreConfigModel eCNetworkScoreConfigModel = (ECNetworkScoreConfigModel) obj;
        return this.enable == eCNetworkScoreConfigModel.enable && this.enablePreloadConsume == eCNetworkScoreConfigModel.enablePreloadConsume && this.windowMs == eCNetworkScoreConfigModel.windowMs && Intrinsics.LJFF(this.boundaries, eCNetworkScoreConfigModel.boundaries) && Intrinsics.LJFF(this.sampleThresholds, eCNetworkScoreConfigModel.sampleThresholds) && Intrinsics.LJFF(this.comparisonMetrics, eCNetworkScoreConfigModel.comparisonMetrics) && Intrinsics.LJFF(this.switchThresholds, eCNetworkScoreConfigModel.switchThresholds);
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.enablePreloadConsume)) * 31) + C786410Ut5.Y2(this.windowMs)) * 31) + this.boundaries.hashCode()) * 31) + this.sampleThresholds.hashCode()) * 31) + this.comparisonMetrics.hashCode()) * 31) + this.switchThresholds.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECNetworkScoreConfigModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enablePreloadConsume=");
        sbLIZ.append(this.enablePreloadConsume);
        sbLIZ.append(", windowMs=");
        sbLIZ.append(this.windowMs);
        sbLIZ.append(", boundaries=");
        sbLIZ.append(this.boundaries);
        sbLIZ.append(", sampleThresholds=");
        sbLIZ.append(this.sampleThresholds);
        sbLIZ.append(", comparisonMetrics=");
        sbLIZ.append(this.comparisonMetrics);
        sbLIZ.append(", switchThresholds=");
        sbLIZ.append(this.switchThresholds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ECNetworkScoreConfigModel() {
        this(false, false, 10000L, new Boundaries(new Range(1000L, 200L), new Range(200L, 2000L), new Range(5L, 20L)), new SampleThresholds(5, 3, 3), new ComparisonMetrics(Aggregation.P50, Aggregation.P50, Aggregation.MEAN), new SwitchThresholds(2, 2));
    }

    public static final class SwitchThresholds {

        @C09CT("category")
        public final int category;

        @C09CT("connectivity")
        public final int connectivity;

        public SwitchThresholds() {
            this(2, 2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SwitchThresholds)) {
                return false;
            }
            SwitchThresholds switchThresholds = (SwitchThresholds) obj;
            return this.connectivity == switchThresholds.connectivity && this.category == switchThresholds.category;
        }

        public final int hashCode() {
            return (this.connectivity * 31) + this.category;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SwitchThresholds(connectivity=");
            sbLIZ.append(this.connectivity);
            sbLIZ.append(", category=");
            sbLIZ.append(this.category);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SwitchThresholds(int i, int i2) {
            this.connectivity = i;
            this.category = i2;
        }
    }

    public static final class SampleThresholds {

        @C09CT("api")
        public final int api;

        @C09CT("image")
        public final int image;

        @C09CT("pending")
        public final int pending;

        public SampleThresholds() {
            this(5, 3, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SampleThresholds)) {
                return false;
            }
            SampleThresholds sampleThresholds = (SampleThresholds) obj;
            return this.api == sampleThresholds.api && this.image == sampleThresholds.image && this.pending == sampleThresholds.pending;
        }

        public final int hashCode() {
            return (((this.api * 31) + this.image) * 31) + this.pending;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SampleThresholds(api=");
            sbLIZ.append(this.api);
            sbLIZ.append(", image=");
            sbLIZ.append(this.image);
            sbLIZ.append(", pending=");
            sbLIZ.append(this.pending);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SampleThresholds(int i, int i2, int i3) {
            this.api = i;
            this.image = i2;
            this.pending = i3;
        }
    }

    public ECNetworkScoreConfigModel(boolean z, boolean z2, long j, Boundaries boundaries, SampleThresholds sampleThresholds, ComparisonMetrics comparisonMetrics, SwitchThresholds switchThresholds) {
        this.enable = z;
        this.enablePreloadConsume = z2;
        this.windowMs = j;
        this.boundaries = boundaries;
        this.sampleThresholds = sampleThresholds;
        this.comparisonMetrics = comparisonMetrics;
        this.switchThresholds = switchThresholds;
    }
}
