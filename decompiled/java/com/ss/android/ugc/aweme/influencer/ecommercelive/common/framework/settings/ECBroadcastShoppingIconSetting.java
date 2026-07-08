package com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes29.dex */
public final class ECBroadcastShoppingIconSetting {
    public static final EcBroadcastShoppingIconModel LIZ = new EcBroadcastShoppingIconModel(null, null, null, null, null, null);

    public static final EcBroadcastShoppingIconModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcBroadcastShoppingIconModel ecBroadcastShoppingIconModel = LIZ;
            EcBroadcastShoppingIconModel ecBroadcastShoppingIconModel2 = (EcBroadcastShoppingIconModel) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_bag_icon_config", EcBroadcastShoppingIconModel.class, ecBroadcastShoppingIconModel);
            return ecBroadcastShoppingIconModel2 != null ? ecBroadcastShoppingIconModel2 : ecBroadcastShoppingIconModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }

    public static final class EcBroadcastShoppingIconModel {

        @C09CT("guide_icon_image")
        public final String guideIconImage;

        @C09CT("icon_inner_title")
        public final String iconInnerTitle;

        @C09CT("icon_title")
        public final String iconTitle;

        @C09CT("inner_icon_image")
        public final String innerIconImage;

        @C09CT("live_gray_icon_image")
        public final String liveGrayIconImage;

        @C09CT("live_icon_image")
        public final String liveIconImage;

        public EcBroadcastShoppingIconModel() {
            this(null, null, null, null, null, null);
        }

        public EcBroadcastShoppingIconModel(String str, String str2, String str3, String str4, String str5, String str6) {
            this.guideIconImage = str;
            this.liveIconImage = str2;
            this.liveGrayIconImage = str3;
            this.innerIconImage = str4;
            this.iconTitle = str5;
            this.iconInnerTitle = str6;
        }
    }
}
