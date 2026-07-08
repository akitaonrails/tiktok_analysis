package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GameMixCacheCardConfig {
    public static final TypeAdapter ADAPTER = new GameMixCacheCardConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("card_class")
    public String cardClass;

    @C09CT("enable")
    public boolean enable;

    public GameMixCacheCardConfig() {
        this("", false);
    }

    public GameMixCacheCardConfig(String str, boolean z) {
        this.cardClass = str;
        this.enable = z;
    }
}
