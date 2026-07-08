package com.ss.android.ugc.profile.platform.ab;

import X.C09CT;
import X.C0TMQ;
import X.C2192401ArG;
import X.C589170N8x;
import X.InterfaceC625970Ogt;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes35.dex */
public final class TiktokSellerProfileRedDotSettings {
    public static final TiktokSellerProfileRedConfig LIZ = new TiktokSellerProfileRedConfig("hidden_red_dot", "hidden_red_dot");

    public static final class TiktokSellerProfileRedConfig {

        @C09CT("campaign_seller")
        public String campaignSeller;

        @C09CT("new_seller")
        public String newSeller;

        public TiktokSellerProfileRedConfig() {
            this("hidden_red_dot", "hidden_red_dot");
        }

        public TiktokSellerProfileRedConfig(String str, String str2) {
            this.newSeller = str;
            this.campaignSeller = str2;
        }
    }

    public static final void LIZ() {
        TiktokSellerProfileRedConfig tiktokSellerProfileRedConfig = (TiktokSellerProfileRedConfig) SettingsManager.LIZLLL().LJIIIIZZ("seller_profile_red_dot_dict", TiktokSellerProfileRedConfig.class, LIZ);
        if (tiktokSellerProfileRedConfig == null) {
            return;
        }
        String str = tiktokSellerProfileRedConfig.newSeller;
        if (str == null) {
            str = "hidden_red_dot";
        }
        String str2 = tiktokSellerProfileRedConfig.campaignSeller;
        String str3 = str2 != null ? str2 : "hidden_red_dot";
        InterfaceC625970Ogt interfaceC625970OgtLIZ = C2192401ArG.LIZ(C589170N8x.LIZ("social", "profile"), "keva_repo_profile_component");
        C0TMQ.LIZ.getClass();
        interfaceC625970OgtLIZ.LJII(C0TMQ.LIZ("profile_seller_hub_cus_red_dot_key"), new String[]{str, str3});
    }
}
