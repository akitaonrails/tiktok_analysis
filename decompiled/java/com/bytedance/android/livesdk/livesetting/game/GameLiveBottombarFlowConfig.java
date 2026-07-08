package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class GameLiveBottombarFlowConfig {
    public static final TypeAdapter ADAPTER = new GameLiveBottombarFlowConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_gamelive_flow_page")
    public boolean enableFlowPage;

    @C09CT("enable_gamelive_flow_page_hero_choice")
    public boolean enableFlowPageChoice;

    @C09CT("enable_gamelive_auto_play")
    public boolean enableGameLiveAutoPlay;

    @C09CT("enable_gamelive_hero_live")
    public boolean enableHeroLive;

    @C09CT("fragment_check_interval_second")
    public int fragmentCheckIntervalSecond;

    public GameLiveBottombarFlowConfig() {
        this(false, false, false, 180, true);
    }

    public GameLiveBottombarFlowConfig(boolean z, boolean z2, boolean z3, int i, boolean z4) {
        this.enableHeroLive = z;
        this.enableFlowPage = z2;
        this.enableFlowPageChoice = z3;
        this.fragmentCheckIntervalSecond = i;
        this.enableGameLiveAutoPlay = z4;
    }
}
