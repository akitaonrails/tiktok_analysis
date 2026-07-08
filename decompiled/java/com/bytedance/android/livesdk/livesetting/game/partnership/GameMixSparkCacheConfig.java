package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GameMixSparkCacheConfig {
    public static final TypeAdapter ADAPTER = new GameMixSparkCacheConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("card_config")
    public List<GameMixSparkCardConfig> cardConfig = C13BV.INSTANCE;
}
