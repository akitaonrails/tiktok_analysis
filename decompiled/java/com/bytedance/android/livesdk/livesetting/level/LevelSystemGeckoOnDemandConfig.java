package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelSystemGeckoOnDemandConfig {
    public static final TypeAdapter ADAPTER = new LevelSystemGeckoOnDemandConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_time")
    public int delayTime;

    @C09CT("channel_list")
    public List<String> onDemandChannelList;

    public LevelSystemGeckoOnDemandConfig() {
        this(0, null);
    }

    public LevelSystemGeckoOnDemandConfig(int i, List<String> list) {
        this.delayTime = i;
        this.onDemandChannelList = list;
    }
}
