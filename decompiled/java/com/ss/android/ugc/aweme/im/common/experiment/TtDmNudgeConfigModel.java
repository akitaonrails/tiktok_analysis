package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class TtDmNudgeConfigModel {

    @C09CT("frenquency")
    public final long frequency;

    @C09CT("nudge_sticker")
    public final TTDmNudgeConfigNudgeSticker nudge_sticker;

    public TtDmNudgeConfigModel() {
        this(60L, new TTDmNudgeConfigNudgeSticker(null, null, null, null, 0, 0, 0L, 0L, null, null, 1023, null));
    }

    public TtDmNudgeConfigModel(long j, TTDmNudgeConfigNudgeSticker tTDmNudgeConfigNudgeSticker) {
        this.frequency = j;
        this.nudge_sticker = tTDmNudgeConfigNudgeSticker;
    }
}
