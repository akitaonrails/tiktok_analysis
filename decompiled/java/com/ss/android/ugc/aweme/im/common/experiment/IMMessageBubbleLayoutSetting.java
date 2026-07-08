package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class IMMessageBubbleLayoutSetting {
    public static final BubbleLayoutSetting LIZ = new BubbleLayoutSetting(16.0f, 16.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 8.0f, 8.0f, 24.0f, 24.0f, 48, 48, 8);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(66));

    public static final class BubbleLayoutSetting {

        @C09CT("corner_radius_dp")
        public final float cornerRadiusDp;

        @C09CT("min_height_dp")
        public final int minHeightDp;

        @C09CT("min_width_dp")
        public final int minWidthDp;

        @C09CT("padding_bottom_dp")
        public final float paddingBottomDp;

        @C09CT("padding_end_dp")
        public final float paddingEndDp;

        @C09CT("padding_start_dp")
        public final float paddingStartDp;

        @C09CT("padding_top_dp")
        public final float paddingTopDp;

        @C09CT("quoted_padding_bottom_dp")
        public final float quotedPaddingBottomDp;

        @C09CT("quoted_padding_end_dp")
        public final float quotedPaddingEndDp;

        @C09CT("quoted_padding_start_dp")
        public final float quotedPaddingStartDp;

        @C09CT("quoted_padding_top_dp")
        public final float quotedPaddingTopDp;

        @C09CT("voice_compensation_dp")
        public final int voiceCompensationDP;

        @C09CT("voice_corner_radius_dp")
        public final float voiceCornerRadiusDp;

        @C09CT("voice_padding_bottom_dp")
        public final float voicePaddingBottomDp;

        @C09CT("voice_padding_end_dp")
        public final float voicePaddingEndDp;

        @C09CT("voice_padding_start_dp")
        public final float voicePaddingStartDp;

        @C09CT("voice_padding_top_dp")
        public final float voicePaddingTopDp;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleLayoutSetting)) {
                return false;
            }
            BubbleLayoutSetting bubbleLayoutSetting = (BubbleLayoutSetting) obj;
            return Float.compare(this.paddingStartDp, bubbleLayoutSetting.paddingStartDp) == 0 && Float.compare(this.paddingEndDp, bubbleLayoutSetting.paddingEndDp) == 0 && Float.compare(this.paddingTopDp, bubbleLayoutSetting.paddingTopDp) == 0 && Float.compare(this.paddingBottomDp, bubbleLayoutSetting.paddingBottomDp) == 0 && Float.compare(this.voicePaddingStartDp, bubbleLayoutSetting.voicePaddingStartDp) == 0 && Float.compare(this.voicePaddingEndDp, bubbleLayoutSetting.voicePaddingEndDp) == 0 && Float.compare(this.voicePaddingTopDp, bubbleLayoutSetting.voicePaddingTopDp) == 0 && Float.compare(this.voicePaddingBottomDp, bubbleLayoutSetting.voicePaddingBottomDp) == 0 && Float.compare(this.quotedPaddingStartDp, bubbleLayoutSetting.quotedPaddingStartDp) == 0 && Float.compare(this.quotedPaddingEndDp, bubbleLayoutSetting.quotedPaddingEndDp) == 0 && Float.compare(this.quotedPaddingTopDp, bubbleLayoutSetting.quotedPaddingTopDp) == 0 && Float.compare(this.quotedPaddingBottomDp, bubbleLayoutSetting.quotedPaddingBottomDp) == 0 && Float.compare(this.cornerRadiusDp, bubbleLayoutSetting.cornerRadiusDp) == 0 && Float.compare(this.voiceCornerRadiusDp, bubbleLayoutSetting.voiceCornerRadiusDp) == 0 && this.minWidthDp == bubbleLayoutSetting.minWidthDp && this.minHeightDp == bubbleLayoutSetting.minHeightDp && this.voiceCompensationDP == bubbleLayoutSetting.voiceCompensationDP;
        }

        public final String toString() {
            return "BubbleLayoutSetting(paddingStartDp=" + this.paddingStartDp + ", paddingEndDp=" + this.paddingEndDp + ", paddingTopDp=" + this.paddingTopDp + ", paddingBottomDp=" + this.paddingBottomDp + ", voicePaddingStartDp=" + this.voicePaddingStartDp + ", voicePaddingEndDp=" + this.voicePaddingEndDp + ", voicePaddingTopDp=" + this.voicePaddingTopDp + ", voicePaddingBottomDp=" + this.voicePaddingBottomDp + ", quotedPaddingStartDp=" + this.quotedPaddingStartDp + ", quotedPaddingEndDp=" + this.quotedPaddingEndDp + ", quotedPaddingTopDp=" + this.quotedPaddingTopDp + ", quotedPaddingBottomDp=" + this.quotedPaddingBottomDp + ", cornerRadiusDp=" + this.cornerRadiusDp + ", voiceCornerRadiusDp=" + this.voiceCornerRadiusDp + ", minWidthDp=" + this.minWidthDp + ", minHeightDp=" + this.minHeightDp + ", voiceCompensationDP=" + this.voiceCompensationDP + ')';
        }

        public BubbleLayoutSetting() {
            this(16.0f, 16.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 12.0f, 8.0f, 8.0f, 24.0f, 24.0f, 48, 48, 8);
        }

        public final int hashCode() {
            return (((((((((((((((((((((((((((((((Float.floatToIntBits(this.paddingStartDp) * 31) + Float.floatToIntBits(this.paddingEndDp)) * 31) + Float.floatToIntBits(this.paddingTopDp)) * 31) + Float.floatToIntBits(this.paddingBottomDp)) * 31) + Float.floatToIntBits(this.voicePaddingStartDp)) * 31) + Float.floatToIntBits(this.voicePaddingEndDp)) * 31) + Float.floatToIntBits(this.voicePaddingTopDp)) * 31) + Float.floatToIntBits(this.voicePaddingBottomDp)) * 31) + Float.floatToIntBits(this.quotedPaddingStartDp)) * 31) + Float.floatToIntBits(this.quotedPaddingEndDp)) * 31) + Float.floatToIntBits(this.quotedPaddingTopDp)) * 31) + Float.floatToIntBits(this.quotedPaddingBottomDp)) * 31) + Float.floatToIntBits(this.cornerRadiusDp)) * 31) + Float.floatToIntBits(this.voiceCornerRadiusDp)) * 31) + this.minWidthDp) * 31) + this.minHeightDp) * 31) + this.voiceCompensationDP;
        }

        public BubbleLayoutSetting(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, int i, int i2, int i3) {
            this.paddingStartDp = f;
            this.paddingEndDp = f2;
            this.paddingTopDp = f3;
            this.paddingBottomDp = f4;
            this.voicePaddingStartDp = f5;
            this.voicePaddingEndDp = f6;
            this.voicePaddingTopDp = f7;
            this.voicePaddingBottomDp = f8;
            this.quotedPaddingStartDp = f9;
            this.quotedPaddingEndDp = f10;
            this.quotedPaddingTopDp = f11;
            this.quotedPaddingBottomDp = f12;
            this.cornerRadiusDp = f13;
            this.voiceCornerRadiusDp = f14;
            this.minWidthDp = i;
            this.minHeightDp = i2;
            this.voiceCompensationDP = i3;
        }
    }

    public static BubbleLayoutSetting LIZ() {
        return (BubbleLayoutSetting) LIZIZ.getValue();
    }
}
