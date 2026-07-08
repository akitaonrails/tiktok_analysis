package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GameAutoPlayConfig {
    public static final TypeAdapter ADAPTER = new GameAutoPlayConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_live")
    public boolean enableLive;

    @C09CT("enable_video")
    public boolean enableVideo;

    public GameAutoPlayConfig() {
        this(false, false);
    }

    public GameAutoPlayConfig(boolean z, boolean z2) {
        this.enableLive = z;
        this.enableVideo = z2;
    }
}
