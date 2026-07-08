package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GameMixSparkCardConfig {
    public static final TypeAdapter ADAPTER = new GameMixSparkCardConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("card_scheme")
    public String cardScheme;

    @C09CT("enable")
    public boolean enable;

    public GameMixSparkCardConfig() {
        this("", false);
    }

    public GameMixSparkCardConfig(String str, boolean z) {
        this.cardScheme = str;
        this.enable = z;
    }
}
