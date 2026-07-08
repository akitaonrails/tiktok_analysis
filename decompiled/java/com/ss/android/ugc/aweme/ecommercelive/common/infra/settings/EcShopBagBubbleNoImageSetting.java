package com.ss.android.ugc.aweme.ecommercelive.common.infra.settings;

import X.C09CT;
import X.C0C64;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes33.dex */
public final class EcShopBagBubbleNoImageSetting {
    public static final EcShopBagBubbleNoImageConfig LIZ = new EcShopBagBubbleNoImageConfig(false, 0, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 0, 0, 0, 1);

    public static final EcShopBagBubbleNoImageConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EcShopBagBubbleNoImageConfig ecShopBagBubbleNoImageConfig = LIZ;
        EcShopBagBubbleNoImageConfig ecShopBagBubbleNoImageConfig2 = (EcShopBagBubbleNoImageConfig) c0c64LJIILLIIL.LJJII(EcShopBagBubbleNoImageConfig.class, ecShopBagBubbleNoImageConfig, "ec_shop_bag_bubble_tips_no_image_setting", true);
        return ecShopBagBubbleNoImageConfig2 != null ? ecShopBagBubbleNoImageConfig2 : ecShopBagBubbleNoImageConfig;
    }

    public static final class EcShopBagBubbleNoImageConfig {

        @C09CT("delay_show_time")
        public long delayShowTime;

        @C09CT("enable")
        public boolean enable;

        @C09CT("max_show_times_in_window")
        public int maxShowTimesInWindow;

        @C09CT("max_total_show_times")
        public int maxTotalShowTimes;

        @C09CT("min_product_num")
        public int minProductNum;

        @C09CT("show_duration")
        public long showDuration;

        @C09CT("time_window_days")
        public int timeWindowDays;

        @C09CT("trigger_condition")
        public int triggerCondition;

        public EcShopBagBubbleNoImageConfig() {
            this(false, 0, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 0, 0, 0, 1);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcShopBagBubbleNoImageConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", triggerCondition=");
            sbLIZ.append(this.triggerCondition);
            sbLIZ.append(", delayShowTime=");
            sbLIZ.append(this.delayShowTime);
            sbLIZ.append(", showDuration=");
            sbLIZ.append(this.showDuration);
            sbLIZ.append(", maxTotalShowTimes=");
            sbLIZ.append(this.maxTotalShowTimes);
            sbLIZ.append(", timeWindowDays=");
            sbLIZ.append(this.timeWindowDays);
            sbLIZ.append(", maxShowTimesInWindow=");
            sbLIZ.append(this.maxShowTimesInWindow);
            sbLIZ.append(", minProductNum=");
            sbLIZ.append(this.minProductNum);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcShopBagBubbleNoImageConfig(boolean z, int i, long j, long j2, int i2, int i3, int i4, int i5) {
            this.enable = z;
            this.triggerCondition = i;
            this.delayShowTime = j;
            this.showDuration = j2;
            this.maxTotalShowTimes = i2;
            this.timeWindowDays = i3;
            this.maxShowTimesInWindow = i4;
            this.minProductNum = i5;
        }
    }
}
