package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftClientForceInsertParams {
    public static final TypeAdapter ADAPTER = new LiveGiftClientForceInsertParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_client_pre_request_by_live_goal")
    public boolean enablePreRequestFromLiveGoal;

    @C09CT("enable_client_pre_request_by_match_specific")
    public boolean enablePreRequestFromMatchGiftOnly;

    @C09CT("enable_strategy_force_insert_level_up_game")
    public boolean enableStrategyForceInsertLevelUpGame;

    @C09CT("enable_strategy_force_insert_live_goal")
    public boolean enableStrategyForceInsertLiveGoal;

    @C09CT("enable_strategy_force_insert_match_specific")
    public boolean enableStrategyForceInsertMatchGiftOnly;

    public LiveGiftClientForceInsertParams() {
        this(false, false, false, false, false);
    }

    public LiveGiftClientForceInsertParams(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enablePreRequestFromLiveGoal = z;
        this.enablePreRequestFromMatchGiftOnly = z2;
        this.enableStrategyForceInsertLiveGoal = z3;
        this.enableStrategyForceInsertLevelUpGame = z4;
        this.enableStrategyForceInsertMatchGiftOnly = z5;
    }
}
