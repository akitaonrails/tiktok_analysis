package com.ss.android.ugc.aweme.player.ab.abs;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PlayerBizFormaterConfig {

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("formater_buffer_speed_changed")
    public final int formaterBufferSpeedChanged;

    @C09CT("formater_rec_buffer_threshold")
    public final int formaterRecBufferThreshold;

    @C09CT("formater_rec_buffer_type")
    public final int formaterRecBufferType;

    public PlayerBizFormaterConfig() {
        this(false, 0, 0, 0);
    }

    public PlayerBizFormaterConfig(boolean z, int i, int i2, int i3) {
        this.enableStrategy = z;
        this.formaterRecBufferType = i;
        this.formaterRecBufferThreshold = i2;
        this.formaterBufferSpeedChanged = i3;
    }
}
