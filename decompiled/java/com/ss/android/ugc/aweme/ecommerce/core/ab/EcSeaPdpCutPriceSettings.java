package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSeaPdpCutPriceSettings {
    public static final EcSeaPdpCutPriceModel LIZ;

    static {
        EcSeaPdpCutPriceModel ecSeaPdpCutPriceModel = new EcSeaPdpCutPriceModel(0, new SeaPdpCutPriceBubble(null, null, null));
        EcSeaPdpCutPriceModel ecSeaPdpCutPriceModel2 = (EcSeaPdpCutPriceModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_pdp_sea_cut_price_config", EcSeaPdpCutPriceModel.class, ecSeaPdpCutPriceModel);
        if (ecSeaPdpCutPriceModel2 != null) {
            ecSeaPdpCutPriceModel = ecSeaPdpCutPriceModel2;
        }
        LIZ = ecSeaPdpCutPriceModel;
    }

    public static boolean LIZ() {
        Integer num = LIZ.enable;
        return num != null && num.intValue() == 1;
    }

    public static final class EcSeaPdpCutPriceModel {

        @C09CT("bubble_config")
        public final SeaPdpCutPriceBubble bubbleConfig;

        @C09CT("enable")
        public final Integer enable;

        public EcSeaPdpCutPriceModel() {
            this(0, new SeaPdpCutPriceBubble(null, null, null));
        }

        public EcSeaPdpCutPriceModel(Integer num, SeaPdpCutPriceBubble seaPdpCutPriceBubble) {
            this.enable = num;
            this.bubbleConfig = seaPdpCutPriceBubble;
        }
    }

    public static final class SeaPdpCutPriceBubble {

        @C09CT("share_bubble_full_screen_y_offset")
        public final Float shareBubbleFullScreenYOffset;

        @C09CT("share_bubble_half_screen_y_offset")
        public final Float shareBubbleHalfScreenYOffset;

        @C09CT("share_bubble_x_offset")
        public final Float shareBubbleXOffset;

        public SeaPdpCutPriceBubble() {
            this(null, null, null);
        }

        public SeaPdpCutPriceBubble(Float f, Float f2, Float f3) {
            this.shareBubbleXOffset = f;
            this.shareBubbleFullScreenYOffset = f2;
            this.shareBubbleHalfScreenYOffset = f3;
        }
    }
}
