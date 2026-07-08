package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioStickerProgress {

    @C09CT("completion_percentage")
    public final Double completionPercentage;

    @C09CT("time_remaining_ms")
    public final Double timeRemainingMS;

    public MixStudioStickerProgress() {
        this(null, null);
    }

    public MixStudioStickerProgress(Double d, Double d2) {
        this.completionPercentage = d;
        this.timeRemainingMS = d2;
    }
}
