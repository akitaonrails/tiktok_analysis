package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveCardOverdrawOptConfigData {
    public static final TypeAdapter ADAPTER;

    @C09CT("enable_overdraw_opt_for_multi_guest")
    public int enableOverdrawOptForMultiGuest;

    @C09CT("enable_overdraw_opt_for_multi_host")
    public int enableOverdrawOptForMultiHost;

    @C09CT("enable_overdraw_opt_for_voice_chat")
    public int enableOverdrawOptForVoiceChat;

    @C09CT("webcast_version_for_multi_host")
    public long webcastVersionForMultiHost;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveCardOverdrawOptConfigData_OptTypeAdapter();
    }

    public LiveCardOverdrawOptConfigData() {
        this(0, 0, 0, 3400L);
    }

    public LiveCardOverdrawOptConfigData(int i, int i2, int i3, long j) {
        this.enableOverdrawOptForMultiGuest = i;
        this.enableOverdrawOptForMultiHost = i2;
        this.enableOverdrawOptForVoiceChat = i3;
        this.webcastVersionForMultiHost = j;
    }
}
