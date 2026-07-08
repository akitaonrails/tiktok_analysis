package com.bytedance.android.livesdk.livesetting.barrage;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class SelfSeenResourceConfig {
    public static final TypeAdapter ADAPTER = new SelfSeenResourceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("fans_level_self_seen_barrage_config")
    public List<UserBarrageUIElementsConfig> fansLevelRange;

    @C09CT("user_level_self_seen_barrage_config")
    public List<UserBarrageUIElementsConfig> userLevelRange;

    public SelfSeenResourceConfig() {
        this(null, null);
    }

    public SelfSeenResourceConfig(List<UserBarrageUIElementsConfig> list, List<UserBarrageUIElementsConfig> list2) {
        this.userLevelRange = list;
        this.fansLevelRange = list2;
    }
}
