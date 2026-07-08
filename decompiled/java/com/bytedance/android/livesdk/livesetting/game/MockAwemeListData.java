package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MockAwemeListData {
    public static final TypeAdapter ADAPTER;

    @C09CT("type_str")
    public String typeStr = "";

    @C09CT("aweme_ids_str")
    public String awemeIdsStr = "";

    static {
        NormalGson.singleton();
        ADAPTER = new MockAwemeListData_OptTypeAdapter();
    }
}
