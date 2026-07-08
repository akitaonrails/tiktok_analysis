package com.bytedance.android.livesdk.game.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TaskProfitInfo {

    @C09CT("game_task")
    public BriefGameTask briefGame;

    @C09CT("profit_info")
    public ProfitInfo profitInfo;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.briefGame != null) {
            sb.append(", brief_game=");
            sb.append(this.briefGame);
        }
        if (this.profitInfo != null) {
            sb.append(", profit_info=");
            sb.append(this.profitInfo);
        }
        sb.replace(0, 2, "GameProfitInfo{");
        sb.append('}');
        return sb.toString();
    }
}
