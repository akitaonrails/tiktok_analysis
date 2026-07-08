package com.bytedance.android.livesdk.livesetting.goodybag;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GoodyBagUrls {
    public static final TypeAdapter ADAPTER;

    @C09CT("goody_bag_send_schema")
    public String sendUrl = "";

    @C09CT("goody_bag_short_touch_schema")
    public String shortTouch = "";

    @C09CT("goody_bag_waiting_open_schema")
    public String waitingOpenSchema = "";

    @C09CT("goody_bag_open_schema_for_audience")
    public String openAudienceSchema = "";

    @C09CT("goody_bag_faq_schema")
    public String goodyBagFaqSchema = "";

    static {
        NormalGson.singleton();
        ADAPTER = new GoodyBagUrls_OptTypeAdapter();
    }
}
