package com.ss.android.ugc.aweme.im.streak.impl.exp;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakRestoreCompensationConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("need_pull_manually")
    public final boolean needPullManually;

    @C09CT("spread_duration_in_seconds")
    public final int spreadDurationInSeconds;

    @C09CT("valid_duration_in_seconds")
    public final int validDurationInSeconds;

    public StreakRestoreCompensationConfig() {
        this(false, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 30, false);
    }

    public StreakRestoreCompensationConfig(boolean z, int i, int i2, boolean z2) {
        this.enable = z;
        this.validDurationInSeconds = i;
        this.spreadDurationInSeconds = i2;
        this.needPullManually = z2;
    }
}
