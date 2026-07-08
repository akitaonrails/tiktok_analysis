package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveLOPSchemaData {
    public static final TypeAdapter ADAPTER;

    @C09CT("full_schema")
    public String fullSchema;

    @C09CT("popup_schema")
    public String popupSchema;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveLOPSchemaData_OptTypeAdapter();
    }

    public LiveLOPSchemaData() {
        this("sslocal://webcast_lynxview?hide_nav_bar=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_tools%2Fpages%2Flop-pannel%2Ftemplate.js%3Fhide_loading%3D1&should_full_screen=1&hide_status_bar=0&bdhm_bid=tiktok_live_fundamental_live_onboard_program&bdhm_pid=lop-pannel", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_tools%2Fpages%2Flop-pannel%2Ftemplate.js&show_loading=1&hide_nav_bar=1&height_mode=max_6&silent_load_type=2&use_live_sheet=1&launch_mode=navigate&enter_from=like_take_page_banner");
    }

    public LiveLOPSchemaData(String str, String str2) {
        this.fullSchema = str;
        this.popupSchema = str2;
    }
}
