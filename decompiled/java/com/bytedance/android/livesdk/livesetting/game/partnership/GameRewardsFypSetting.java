package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class GameRewardsFypSetting {
    public static final TypeAdapter ADAPTER = new GameRewardsFypSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_show")
    public long delayTime;

    @C09CT("disable_game_moment")
    public boolean disableGameMoment;

    @C09CT("show_duration")
    public long duration;

    @C09CT("enable_pin_card")
    public boolean enableCard;

    public GameRewardsFypSetting() {
        this(false, 10000L, 3000L, false);
    }

    public GameRewardsFypSetting(boolean z, long j, long j2, boolean z2) {
        this.enableCard = z;
        this.duration = j;
        this.delayTime = j2;
        this.disableGameMoment = z2;
    }
}
