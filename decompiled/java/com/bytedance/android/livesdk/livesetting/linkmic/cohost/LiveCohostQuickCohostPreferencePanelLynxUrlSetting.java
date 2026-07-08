package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import android.net.Uri;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_cohost_quick_cohost_preference_panel_lynx_url")
public final class LiveCohostQuickCohostPreferencePanelLynxUrlSetting {
    public static final LiveCohostQuickCohostPreferencePanelLynxUrlSetting INSTANCE = new LiveCohostQuickCohostPreferencePanelLynxUrlSetting();
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=quick_cohost_preference_set&use_live_sheet=1&height_mode=fixed_7";

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("live_cohost_quick_cohost_preference_panel_lynx_url", str);
        if (stringValue != null) {
            str = stringValue;
        }
        return ensureLiveSheetQueryParams(str);
    }

    private final String ensureLiveSheetQueryParams(String str) {
        if (a0.LJJJIL(str)) {
            return str;
        }
        Uri uri = UriProtector.parse(str);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            Iterator<String> it2 = UriProtector.getQueryParameters(uri, str2).iterator();
            while (it2.hasNext()) {
                builderClearQuery.appendQueryParameter(str2, it2.next());
            }
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "use_live_sheet");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            builderClearQuery.appendQueryParameter("use_live_sheet", "1");
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "height_mode");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
            builderClearQuery.appendQueryParameter("height_mode", "fixed_7");
        }
        return builderClearQuery.build().toString();
    }
}
