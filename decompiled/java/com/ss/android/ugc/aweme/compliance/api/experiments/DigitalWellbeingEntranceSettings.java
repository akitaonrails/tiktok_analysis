package com.ss.android.ugc.aweme.compliance.api.experiments;

import X.C09CT;
import X.C123100dR;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: loaded from: classes4.dex */
public final class DigitalWellbeingEntranceSettings {
    public static final /* synthetic */ int LIZ = 0;

    public static final class Config {

        @C09CT("pns_cdn_fallback_host")
        public final String pnsCdnFallbackHost;

        public Config() {
            this("");
        }

        public Config(String str) {
            this.pnsCdnFallbackHost = str;
        }
    }

    public static String LIZIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("digital_wellbeing_template", Config.class, null);
        if (config == null) {
            config = new Config("");
        }
        return config.pnsCdnFallbackHost;
    }

    public static String LIZ(String str) {
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bundle");
        String strLIZIZ = LIZIZ();
        if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && C123100dR.LIZ(strLIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZIZ());
            sbLIZ.append('/');
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            sbLIZ.append('/');
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            return uri.buildUpon().appendQueryParameter("surl", C2188811AlT.LIZIZ(sbLIZ)).appendQueryParameter("bdhm_bid", "i18n_lynx_privacy_and_safety").build().toString();
        }
        return str;
    }
}
