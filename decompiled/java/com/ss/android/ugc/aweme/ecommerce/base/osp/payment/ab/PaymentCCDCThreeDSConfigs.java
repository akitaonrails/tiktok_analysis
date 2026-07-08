package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentCCDCThreeDSConfigs {
    public static final ConfigModel LIZ;

    static {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        LIZ = new ConfigModel("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "24", bool, bool2, bool2);
    }

    public static final ConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ConfigModel configModel = LIZ;
        ConfigModel configModel2 = (ConfigModel) settingsManagerLIZLLL.LJIIIIZZ("payment_ccdc_threeds_config", ConfigModel.class, configModel);
        return configModel2 != null ? configModel2 : configModel;
    }

    public static final class ConfigModel {

        @C09CT("browser_accept_header")
        public final String browserAcceptHeader;

        @C09CT("browser_color_depth")
        public final String browserColorDepth;

        @C09CT("browser_java_enabled")
        public final Boolean browserJavaEnabled;

        @C09CT("browser_javascript_enabled")
        public final Boolean browserJavascriptEnabled;

        @C09CT("should_encode")
        public final Boolean shouldEncode;

        public ConfigModel() {
            this(null, null, null, null, null);
        }

        public ConfigModel(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
            this.browserAcceptHeader = str;
            this.browserColorDepth = str2;
            this.browserJavaEnabled = bool;
            this.browserJavascriptEnabled = bool2;
            this.shouldEncode = bool3;
        }
    }
}
