package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelRenderEffectConfig {
    public static final TypeAdapter ADAPTER = new LevelRenderEffectConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("first_frame_time_out_duration")
    public int firstFrameTimeoutDuration;

    @C09CT("play_end_exceed_duration")
    public int playEndExceedDuration;

    @C09CT("render_barrage_effect_source_config")
    public List<LevelRenderResourceConfig> renderBarrageResConfigList;

    public LevelRenderEffectConfig() {
        this(0, 0, null);
    }

    public LevelRenderEffectConfig(int i, int i2, List<LevelRenderResourceConfig> list) {
        this.firstFrameTimeoutDuration = i;
        this.playEndExceedDuration = i2;
        this.renderBarrageResConfigList = list;
    }
}
