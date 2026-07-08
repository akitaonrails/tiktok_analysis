package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class GameMixCacheConfig {
    public static final TypeAdapter ADAPTER = new GameMixCacheConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("card_config")
    public List<GameMixCacheCardConfig> cardConfig;

    @C09CT("enable_scene")
    public List<Integer> enable;

    public GameMixCacheConfig() {
        this(null, null, 3, null);
    }

    public GameMixCacheConfig(List<Integer> list, List<GameMixCacheCardConfig> list2) {
        this.enable = list;
        this.cardConfig = list2;
    }

    public GameMixCacheConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
