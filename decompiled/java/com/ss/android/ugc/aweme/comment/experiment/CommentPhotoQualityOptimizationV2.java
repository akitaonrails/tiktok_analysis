package com.ss.android.ugc.aweme.comment.experiment;

import X.C01GW;
import X.C09CT;
import X.C13LQ;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPhotoQualityOptimizationV2 {
    public static final CommentPhotoQualityOptV2Config LIZ = new CommentPhotoQualityOptV2Config(null, null, null, null, null, null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(106));
    public static final float[] LIZJ = {1.0f, 1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 2.0f};

    public static CommentPhotoQualityOptV2Config LIZ() {
        return (CommentPhotoQualityOptV2Config) LIZIZ.getValue();
    }

    public static float LIZIZ(Float f) {
        int length;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (Math.abs(fFloatValue) <= Float.MAX_VALUE) {
                if (fFloatValue < C13LQ.LJIJJ(LIZJ) || r1.length - 1 < 0) {
                    return 1.0f;
                }
                while (true) {
                    int i = length - 1;
                    float f2 = LIZJ[length];
                    if (fFloatValue >= f2) {
                        return f2;
                    }
                    if (i >= 0) {
                        length = i;
                    } else {
                        return 1.0f;
                    }
                }
            } else {
                return 1.0f;
            }
        } else {
            return 1.0f;
        }
    }

    public static final class CommentPhotoQualityOptV2Config {

        @C09CT("detail_sr_level")
        public final Float detailSrLevel;

        @C09CT("enable_detail_argb8888")
        public final Integer enableDetailArgb8888;

        @C09CT("enable_detail_downsample")
        public final Integer enableDetailDownsample;

        @C09CT("enable_scroll_throttle_sr")
        public final Integer enableScrollThrottleSr;

        @C09CT("enable_thumbnail_argb8888")
        public final Integer enableThumbnailArgb8888;

        @C09CT("enable_thumbnail_downsample")
        public final Integer enableThumbnailDownsample;

        @C09CT("low_end_sr_policy")
        public final Integer lowEndSrPolicy;

        @C09CT("mid_end_sr_policy")
        public final Integer midEndSrPolicy;

        @C09CT("sr_slow_threshold_ms")
        public final Integer srSlowThresholdMs;

        @C09CT("thumbnail_sr_level")
        public final Float thumbnailSrLevel;

        public CommentPhotoQualityOptV2Config() {
            this(null, null, null, null, null, null, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommentPhotoQualityOptV2Config)) {
                return false;
            }
            CommentPhotoQualityOptV2Config commentPhotoQualityOptV2Config = (CommentPhotoQualityOptV2Config) obj;
            return Intrinsics.LJFF(this.enableThumbnailArgb8888, commentPhotoQualityOptV2Config.enableThumbnailArgb8888) && Intrinsics.LJFF(this.enableDetailArgb8888, commentPhotoQualityOptV2Config.enableDetailArgb8888) && Intrinsics.LJFF(this.enableThumbnailDownsample, commentPhotoQualityOptV2Config.enableThumbnailDownsample) && Intrinsics.LJFF(this.enableDetailDownsample, commentPhotoQualityOptV2Config.enableDetailDownsample) && Intrinsics.LJFF(this.thumbnailSrLevel, commentPhotoQualityOptV2Config.thumbnailSrLevel) && Intrinsics.LJFF(this.detailSrLevel, commentPhotoQualityOptV2Config.detailSrLevel) && Intrinsics.LJFF(this.lowEndSrPolicy, commentPhotoQualityOptV2Config.lowEndSrPolicy) && Intrinsics.LJFF(this.midEndSrPolicy, commentPhotoQualityOptV2Config.midEndSrPolicy) && Intrinsics.LJFF(this.enableScrollThrottleSr, commentPhotoQualityOptV2Config.enableScrollThrottleSr) && Intrinsics.LJFF(this.srSlowThresholdMs, commentPhotoQualityOptV2Config.srSlowThresholdMs);
        }

        public final int hashCode() {
            Integer num = this.enableThumbnailArgb8888;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.enableDetailArgb8888;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.enableThumbnailDownsample;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.enableDetailDownsample;
            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Float f = this.thumbnailSrLevel;
            int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.detailSrLevel;
            int iHashCode6 = (iHashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Integer num5 = this.lowEndSrPolicy;
            int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.midEndSrPolicy;
            int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.enableScrollThrottleSr;
            int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.srSlowThresholdMs;
            return iHashCode9 + (num8 != null ? num8.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommentPhotoQualityOptV2Config(enableThumbnailArgb8888=");
            sbLIZ.append(this.enableThumbnailArgb8888);
            sbLIZ.append(", enableDetailArgb8888=");
            sbLIZ.append(this.enableDetailArgb8888);
            sbLIZ.append(", enableThumbnailDownsample=");
            sbLIZ.append(this.enableThumbnailDownsample);
            sbLIZ.append(", enableDetailDownsample=");
            sbLIZ.append(this.enableDetailDownsample);
            sbLIZ.append(", thumbnailSrLevel=");
            sbLIZ.append(this.thumbnailSrLevel);
            sbLIZ.append(", detailSrLevel=");
            sbLIZ.append(this.detailSrLevel);
            sbLIZ.append(", lowEndSrPolicy=");
            sbLIZ.append(this.lowEndSrPolicy);
            sbLIZ.append(", midEndSrPolicy=");
            sbLIZ.append(this.midEndSrPolicy);
            sbLIZ.append(", enableScrollThrottleSr=");
            sbLIZ.append(this.enableScrollThrottleSr);
            sbLIZ.append(", srSlowThresholdMs=");
            sbLIZ.append(this.srSlowThresholdMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CommentPhotoQualityOptV2Config(Integer num, Integer num2, Integer num3, Integer num4, Float f, Float f2, Integer num5, Integer num6, Integer num7, Integer num8) {
            this.enableThumbnailArgb8888 = num;
            this.enableDetailArgb8888 = num2;
            this.enableThumbnailDownsample = num3;
            this.enableDetailDownsample = num4;
            this.thumbnailSrLevel = f;
            this.detailSrLevel = f2;
            this.lowEndSrPolicy = num5;
            this.midEndSrPolicy = num6;
            this.enableScrollThrottleSr = num7;
            this.srSlowThresholdMs = num8;
        }
    }
}
