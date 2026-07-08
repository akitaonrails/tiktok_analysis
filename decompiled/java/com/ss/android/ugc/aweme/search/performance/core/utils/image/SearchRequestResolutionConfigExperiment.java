package com.ss.android.ugc.aweme.search.performance.core.utils.image;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRequestResolutionConfigExperiment {
    public static final Config LIZ = new Config("range", Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 480, "default", 3, 400, Boolean.FALSE, Boolean.FALSE);
    public static final C01GW LIZIZ;

    public static final class Config {

        @C09CT("cover_bucket_count")
        public final Integer coverBucketCount;

        @C09CT("cover_bucket_threshold_w1")
        public final Integer coverBucketThresholdW1;

        @C09CT("fallback_cover_height")
        public final Integer fallbackCoverHeight;

        @C09CT("fallback_cover_width")
        public final Integer fallbackCoverWidth;

        @C09CT("force_low_resolution_on_weak_network")
        public final Boolean forceLowResolutionOnWeakNetwork;

        @C09CT("mode")
        public final String mode;

        @C09CT("multiplier_bucket_mode")
        public final String multiplierBucketMode;

        @C09CT("use_400_as_min_resolution")
        public final Boolean use400AsMinResolution;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.LJFF(this.mode, config.mode) && Intrinsics.LJFF(this.fallbackCoverWidth, config.fallbackCoverWidth) && Intrinsics.LJFF(this.fallbackCoverHeight, config.fallbackCoverHeight) && Intrinsics.LJFF(this.multiplierBucketMode, config.multiplierBucketMode) && Intrinsics.LJFF(this.coverBucketCount, config.coverBucketCount) && Intrinsics.LJFF(this.coverBucketThresholdW1, config.coverBucketThresholdW1) && Intrinsics.LJFF(this.use400AsMinResolution, config.use400AsMinResolution) && Intrinsics.LJFF(this.forceLowResolutionOnWeakNetwork, config.forceLowResolutionOnWeakNetwork);
        }

        public final int hashCode() {
            String str = this.mode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.fallbackCoverWidth;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.fallbackCoverHeight;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.multiplierBucketMode;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num3 = this.coverBucketCount;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.coverBucketThresholdW1;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Boolean bool = this.use400AsMinResolution;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.forceLowResolutionOnWeakNetwork;
            return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(mode=");
            sbLIZ.append(this.mode);
            sbLIZ.append(", fallbackCoverWidth=");
            sbLIZ.append(this.fallbackCoverWidth);
            sbLIZ.append(", fallbackCoverHeight=");
            sbLIZ.append(this.fallbackCoverHeight);
            sbLIZ.append(", multiplierBucketMode=");
            sbLIZ.append(this.multiplierBucketMode);
            sbLIZ.append(", coverBucketCount=");
            sbLIZ.append(this.coverBucketCount);
            sbLIZ.append(", coverBucketThresholdW1=");
            sbLIZ.append(this.coverBucketThresholdW1);
            sbLIZ.append(", use400AsMinResolution=");
            sbLIZ.append(this.use400AsMinResolution);
            sbLIZ.append(", forceLowResolutionOnWeakNetwork=");
            sbLIZ.append(this.forceLowResolutionOnWeakNetwork);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config() {
            this("range", Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 480, "default", 3, 400, Boolean.FALSE, Boolean.FALSE);
        }

        public Config(String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, Boolean bool, Boolean bool2) {
            this.mode = str;
            this.fallbackCoverWidth = num;
            this.fallbackCoverHeight = num2;
            this.multiplierBucketMode = str2;
            this.coverBucketCount = num3;
            this.coverBucketThresholdW1 = num4;
            this.use400AsMinResolution = bool;
            this.forceLowResolutionOnWeakNetwork = bool2;
        }
    }

    static {
        new Config("floor", Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 480, "default", 3, 400, Boolean.FALSE, Boolean.FALSE);
        LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(349));
    }

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }

    public static final boolean LIZIZ() {
        Boolean bool = LIZ().use400AsMinResolution;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
