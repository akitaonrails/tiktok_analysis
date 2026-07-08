package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class GameLiveRenderCuttingSettingData {
    public static final TypeAdapter ADAPTER = new GameLiveRenderCuttingSettingData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("allow_game_tag_id")
    public List<Long> allowGameTagId;

    @C09CT("disallow_game_tag_id")
    public List<Long> disallowGameTagId;

    @C09CT("live_room_mode")
    public List<Integer> liveRoomMode;

    @C09CT("source_min_height")
    public Integer sourceMinHeight;

    @C09CT("source_ratio_end")
    public Float sourceRatioEnd;

    @C09CT("source_ratio_start")
    public Float sourceRatioStart;

    @C09CT("target_ratio")
    public Float targetRatio;

    public GameLiveRenderCuttingSettingData() {
        C13BV c13bv = C13BV.INSTANCE;
        this.liveRoomMode = c13bv;
        this.allowGameTagId = c13bv;
        this.disallowGameTagId = c13bv;
        this.sourceMinHeight = 0;
        this.sourceRatioStart = Float.valueOf(0.0f);
        this.sourceRatioEnd = Float.valueOf(0.0f);
        this.targetRatio = Float.valueOf(0.0f);
    }
}
