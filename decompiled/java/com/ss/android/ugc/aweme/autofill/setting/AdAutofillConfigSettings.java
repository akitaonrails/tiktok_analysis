package com.ss.android.ugc.aweme.autofill.setting;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillConfigSettings {
    public static final AdAutofillConfig LIZ = new AdAutofillConfig(null, null, null, null, null, null, null, null, null, null, null, 2047, null);

    public static final AdAutofillConfig LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AdAutofillConfig adAutofillConfig = LIZ;
            AdAutofillConfig adAutofillConfig2 = (AdAutofillConfig) settingsManagerLIZLLL.LJIIIIZZ("ad_autofill_config", AdAutofillConfig.class, adAutofillConfig);
            return adAutofillConfig2 != null ? adAutofillConfig2 : adAutofillConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final class AdAutofillConfig {

        @C09CT("autofill_iv")
        public final String autofillIv;

        @C09CT("autofill_key")
        public final String autofillKey;

        @C09CT("autofill_popup_schema_android")
        public final String autofillPopupSchema;

        @C09CT("card_icon_link_android")
        public final String cardIconLink;

        @C09CT("channel_list")
        public final List<String> channelList;

        @C09CT("javascript_cdn")
        public final String javascriptCDN;

        @C09CT("learn_more_link")
        public final String learnMoreLink;

        @C09CT("save_popup_schema_android")
        public final String savePopupSchema;

        @C09CT("setting_add_new_card_lynx_schema")
        public final String settingAddNewCardLynxSchema;

        @C09CT("setting_lynx_schema")
        public final String settingLynxSchema;

        @C09CT("setting_payment_lynx_schema")
        public final String settingPaymentLynxSchema;

        public AdAutofillConfig() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public AdAutofillConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, String str9, String str10) {
            this.autofillPopupSchema = str;
            this.savePopupSchema = str2;
            this.settingLynxSchema = str3;
            this.settingPaymentLynxSchema = str4;
            this.settingAddNewCardLynxSchema = str5;
            this.learnMoreLink = str6;
            this.cardIconLink = str7;
            this.javascriptCDN = str8;
            this.channelList = list;
            this.autofillKey = str9;
            this.autofillIv = str10;
        }

        public AdAutofillConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? C13BV.INSTANCE : list, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? str10 : "");
        }
    }
}
