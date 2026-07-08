package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class ChatBotSchema {
    public static final TypeAdapter ADAPTER;

    @C09CT("recharge_page_faq_v3")
    public String rechargePageFaqV3 = "aweme://roma_redirect/?spark_page=TT_CSP_Live_recharge_page_faq_v3";

    @C09CT("recharge_failed_bot_v3")
    public String rechargeFailedBotV3 = "aweme://roma_redirect/?spark_page=TT_CSP_Live_recharge_failed_bot_v3";

    static {
        NormalGson.singleton();
        ADAPTER = new ChatBotSchema_OptTypeAdapter();
    }
}
