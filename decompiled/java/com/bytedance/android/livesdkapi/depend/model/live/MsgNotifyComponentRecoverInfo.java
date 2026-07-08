package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyComponentRecoverInfo {
    public static final TypeAdapter ADAPTER = new MsgNotifyComponentRecoverInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_ms")
    public long delayMs;

    @C09CT("recover")
    public boolean recover;
}
