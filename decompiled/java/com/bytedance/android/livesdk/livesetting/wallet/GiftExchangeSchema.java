package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class GiftExchangeSchema {
    public static final TypeAdapter ADAPTER = new GiftExchangeSchema_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_wallet_enable_lynx_gift_exchange_popup")
    public boolean liveWalletEnableLynxGiftExchangePopup;

    @C09CT("auto_exchange_popup_schema")
    public String autoExchangePopUpSchema = "sslocal://webcast_lynxview_popup?url=https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tiktok/fe/live/tiktok_wallet_exchange/pages/auto_exchange_popup.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&disable_swipe=1&disable_back_press=1&container_bg_color=ffffff00";

    @C09CT("tax_popup_schema")
    public String taxPopUpSchema = "sslocal://webcast_lynxview_popup?url=https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tiktok/fe/live/tiktok_wallet_exchange/pages/exchange_tax_popup.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&disable_swipe=1&disable_back_press=1&container_bg_color=ffffff00";

    @C09CT("gift_exchange_pop_schema")
    public String giftExchangePopSchema = "sslocal://webcast_lynxview_popup?url=https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tiktok/fe/live/tiktok_wallet_exchange/pages/gift_exchange_popup.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&disable_swipe=1&disable_back_press=1&container_bg_color=ffffff00";
}
