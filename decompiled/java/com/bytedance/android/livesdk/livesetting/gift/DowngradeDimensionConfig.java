package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class DowngradeDimensionConfig {
    public static final TypeAdapter ADAPTER = new DowngradeDimensionConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enter_count")
    public int enterCount;

    @C09CT("exit_count")
    public int exitCount;

    @C09CT("levels")
    public List<DowngradeLevel> levels;

    public DowngradeDimensionConfig() {
        this(0, 0, null);
    }

    public DowngradeDimensionConfig(int i, int i2, List<DowngradeLevel> list) {
        this.enterCount = i;
        this.exitCount = i2;
        this.levels = list;
    }
}
