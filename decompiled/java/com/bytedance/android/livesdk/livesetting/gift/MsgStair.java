package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgStair {
    public static final TypeAdapter ADAPTER;

    @C09CT("min_msg_count")
    public int _minMsgCount = -1;

    @C09CT("max_msg_count")
    public int _maxMsgCount = -1;

    static {
        NormalGson.singleton();
        ADAPTER = new MsgStair_OptTypeAdapter();
    }
}
