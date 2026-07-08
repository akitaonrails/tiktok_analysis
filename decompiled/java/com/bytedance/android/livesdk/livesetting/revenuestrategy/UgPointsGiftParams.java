package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class UgPointsGiftParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("delay_refresh_ug_balance_times")
    public int delay;

    @C09CT("faq_schema")
    public String schema;

    static {
        NormalGson.singleton();
        ADAPTER = new UgPointsGiftParams_OptTypeAdapter();
    }

    public UgPointsGiftParams() {
        this(5, "aweme://roma_redirect/?roma_group_key=roma_schema_group_incentive_tasks&roma_page_key=roma_schema_page_points_gift_faq");
    }

    public UgPointsGiftParams(int i, String str) {
        this.delay = i;
        this.schema = str;
    }
}
