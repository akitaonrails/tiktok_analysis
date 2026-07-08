package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
public class LiveWalletRechargeSchema {
    public static final TypeAdapter ADAPTER = new LiveWalletRechargeSchema_OptTypeAdapter(NormalGson.singleton());

    @C09CT("cashback_info")
    public String cashbackInfo = "sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fwallet-recharge%2Fcashback-info&container_bg_color=00000000&show_mask=1&mask_bg_color=00000080&loading_bg_color=00000000";

    @C09CT("recharge_payment_success")
    public String rechargePaymentSuccess = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_wallet%2Fwallet%2Fpages%2Frecharge%2Fpayment_success.js&hide_nav_bar=1&gravity=bottom&type=popup&show_mask=1&mask_bg_color=00000080&self_adaptive_height=1&radius=12";

    @C09CT("exchange_retention_popup")
    public String exchangeRetentionPopup = "aweme://roma_redirect?roma_group_key=roma_schema_group_one_wallet&roma_page_key=roma_schema_page_exchange_retention_popup&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&container_bg_color=ffffff00";

    @C09CT("recharge_guidance")
    public LiveWalletRechargeGuidance rechargeGuidance = new LiveWalletRechargeGuidance();

    @C09CT("fundamentals_transaction_history")
    public String transactionHistory = "sslocal://webcast_lynxview?type=fullscreen&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Ftransaction%2Fhistory.js&hide_nav_bar=1&hide_status_bar=0&loading_bg_color_light=FFFFFF&loading_bg_color_dark=121212";

    @C09CT("email_notification_popup")
    public String emailNotificationPopup = "sslocal://webcast_webview_popup?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Funified-wallet%2Fiap%2Fopen-email-notification&show_mask=1&mask_bg_color=00000080&radius=12&use_present=1&height=50%25";

    @C09CT("recharge_recommendation")
    public String rechargeRecommendation = "sslocal://webcast_lynxview?type=fullscreen&hide_nav_bar=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Frecharge%2Frecommendation.js&loading_bg_color_light=FFFFFF&loading_bg_color_dark=121212";

    @C09CT("cancel_recharge_retention_popup")
    public String cancelRetentionPopup = "sslocal://webcast_lynxview_popup?container_bg_color=ffffff00&disable_back_press=1&disable_swipe=1&hide_nav_bar=1&hide_status_bar=0&loading_bg_color=ffffff00&should_full_screen=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Frecharge%2Fcancel_recharge_retention_popup.js";
}
