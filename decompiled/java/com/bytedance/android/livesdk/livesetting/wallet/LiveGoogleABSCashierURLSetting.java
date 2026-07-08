package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_google_abs_cashier_url")
public final class LiveGoogleABSCashierURLSetting {
    public static final LiveGoogleABSCashierURLSetting INSTANCE = new LiveGoogleABSCashierURLSetting();
    public static final LiveGoogleABSCashierURLs DEFAULT = new LiveGoogleABSCashierURLs("sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fwallet%2Fcashier%2Fabs&hide_nav_bar=1&height=90%25&radius=8&request_page=live_detail", "sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fwallet%2Fcashier%2Fabs&hide_nav_bar=1&height=90%25&show_mask=1&mask_bg_color=00000050&radius=8&request_page=my_profile", "sslocal://webcast_webview?url=https%3A%2F%2Fsupport.google.com%2Fgoogleplay%2Fanswer%2F11174377&hide_nav_bar=1");

    public static final class LiveGoogleABSCashierURLs {
        public static final TypeAdapter ADAPTER;

        @C09CT("balance_page_url")
        public String balancePageCashierUrl;

        @C09CT("google_abs_help_center_url")
        public String googleABSHelpCenterUrl;

        @C09CT("live_room_url")
        public String liveRoomCashierUrl;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveGoogleABSCashierURLSetting_LiveGoogleABSCashierURLs_OptTypeAdapter();
        }

        public LiveGoogleABSCashierURLs() {
            this("sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fwallet%2Fcashier%2Fabs&hide_nav_bar=1&height=90%25&radius=8&request_page=live_detail", "sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fwallet%2Fcashier%2Fabs&hide_nav_bar=1&height=90%25&show_mask=1&mask_bg_color=00000050&radius=8&request_page=my_profile", "sslocal://webcast_webview?url=https%3A%2F%2Fsupport.google.com%2Fgoogleplay%2Fanswer%2F11174377&hide_nav_bar=1");
        }

        public LiveGoogleABSCashierURLs(String str, String str2, String str3) {
            this.liveRoomCashierUrl = str;
            this.balancePageCashierUrl = str2;
            this.googleABSHelpCenterUrl = str3;
        }
    }

    public final LiveGoogleABSCashierURLs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGoogleABSCashierURLs liveGoogleABSCashierURLs = DEFAULT;
        LiveGoogleABSCashierURLs liveGoogleABSCashierURLs2 = (LiveGoogleABSCashierURLs) settingsManager.getValueSafely("live_google_abs_cashier_url", liveGoogleABSCashierURLs);
        return liveGoogleABSCashierURLs2 != null ? liveGoogleABSCashierURLs2 : liveGoogleABSCashierURLs;
    }
}
