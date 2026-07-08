package com.ss.android.ugc.aweme.aikit.experiments;

import X.C09CT;
import X.C0C64;
import X.C1697810uHb;
import X.C786410Ut5;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCImagePreprocessConfigExp {
    public static final AIGCImagePreprocessConfig LIZ = new AIGCImagePreprocessConfig(false, C1697810uHb.LJIIJJI("jpg", "jpeg", "png", "webp", "bmp", "tiff", "gif"), 0.4f, 2.5f, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 1280, 10485760, 80, C1697810uHb.LJIIJJI(75, 50), 0.85f, 2);

    public static final class AIGCImagePreprocessConfig {

        @C09CT("aspect_ratio_max")
        public final float aspectRatioMax;

        @C09CT("aspect_ratio_min")
        public final float aspectRatioMin;

        @C09CT("downsample_ratio_on_overflow")
        public final float downsampleRatioOnOverflow;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("format_whitelist")
        public final List<String> formatWhitelist;

        @C09CT("image_quality")
        public final int imageQuality;

        @C09CT("image_quality_fallback_steps")
        public final List<Integer> imageQualityFallbackSteps;

        @C09CT("max_edge_px")
        public final int maxEdgePx;

        @C09CT("max_file_size_bytes")
        public final long maxFileSizeBytes;

        @C09CT("max_iterations")
        public final int maxIterations;

        @C09CT("min_edge_px")
        public final int minEdgePx;

        public AIGCImagePreprocessConfig() {
            this(false, C1697810uHb.LJIIJJI("jpg", "jpeg", "png", "webp", "bmp", "tiff", "gif"), 0.4f, 2.5f, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 1280, 10485760L, 80, C1697810uHb.LJIIJJI(75, 50), 0.85f, 2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIGCImagePreprocessConfig)) {
                return false;
            }
            AIGCImagePreprocessConfig aIGCImagePreprocessConfig = (AIGCImagePreprocessConfig) obj;
            return this.enable == aIGCImagePreprocessConfig.enable && Intrinsics.LJFF(this.formatWhitelist, aIGCImagePreprocessConfig.formatWhitelist) && Float.compare(this.aspectRatioMin, aIGCImagePreprocessConfig.aspectRatioMin) == 0 && Float.compare(this.aspectRatioMax, aIGCImagePreprocessConfig.aspectRatioMax) == 0 && this.minEdgePx == aIGCImagePreprocessConfig.minEdgePx && this.maxEdgePx == aIGCImagePreprocessConfig.maxEdgePx && this.maxFileSizeBytes == aIGCImagePreprocessConfig.maxFileSizeBytes && this.imageQuality == aIGCImagePreprocessConfig.imageQuality && Intrinsics.LJFF(this.imageQualityFallbackSteps, aIGCImagePreprocessConfig.imageQualityFallbackSteps) && Float.compare(this.downsampleRatioOnOverflow, aIGCImagePreprocessConfig.downsampleRatioOnOverflow) == 0 && this.maxIterations == aIGCImagePreprocessConfig.maxIterations;
        }

        public final String toString() {
            return "AIGCImagePreprocessConfig(enable=" + this.enable + ", formatWhitelist=" + this.formatWhitelist + ", aspectRatioMin=" + this.aspectRatioMin + ", aspectRatioMax=" + this.aspectRatioMax + ", minEdgePx=" + this.minEdgePx + ", maxEdgePx=" + this.maxEdgePx + ", maxFileSizeBytes=" + this.maxFileSizeBytes + ", imageQuality=" + this.imageQuality + ", imageQualityFallbackSteps=" + this.imageQualityFallbackSteps + ", downsampleRatioOnOverflow=" + this.downsampleRatioOnOverflow + ", maxIterations=" + this.maxIterations + ')';
        }

        public final int hashCode() {
            return (((((((((((((((((((C786410Ut5.Z2(this.enable) * 31) + this.formatWhitelist.hashCode()) * 31) + Float.floatToIntBits(this.aspectRatioMin)) * 31) + Float.floatToIntBits(this.aspectRatioMax)) * 31) + this.minEdgePx) * 31) + this.maxEdgePx) * 31) + C786410Ut5.Y2(this.maxFileSizeBytes)) * 31) + this.imageQuality) * 31) + this.imageQualityFallbackSteps.hashCode()) * 31) + Float.floatToIntBits(this.downsampleRatioOnOverflow)) * 31) + this.maxIterations;
        }

        public AIGCImagePreprocessConfig(boolean z, List<String> list, float f, float f2, int i, int i2, long j, int i3, List<Integer> list2, float f3, int i4) {
            this.enable = z;
            this.formatWhitelist = list;
            this.aspectRatioMin = f;
            this.aspectRatioMax = f2;
            this.minEdgePx = i;
            this.maxEdgePx = i2;
            this.maxFileSizeBytes = j;
            this.imageQuality = i3;
            this.imageQualityFallbackSteps = list2;
            this.downsampleRatioOnOverflow = f3;
            this.maxIterations = i4;
        }
    }

    public static final AIGCImagePreprocessConfig LIZ() {
        AIGCImagePreprocessConfig aIGCImagePreprocessConfig = (AIGCImagePreprocessConfig) C0C64.LJIILLIIL().LJJII(AIGCImagePreprocessConfig.class, LIZ, "aigc_image_preprocess_config", true);
        return aIGCImagePreprocessConfig == null ? new AIGCImagePreprocessConfig(false, C1697810uHb.LJIIJJI("jpg", "jpeg", "png", "webp", "bmp", "tiff", "gif"), 0.4f, 2.5f, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 1280, 10485760L, 80, C1697810uHb.LJIIJJI(75, 50), 0.85f, 2) : aIGCImagePreprocessConfig;
    }
}
