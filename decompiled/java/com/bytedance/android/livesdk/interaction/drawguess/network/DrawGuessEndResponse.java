package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessEndResponse {

    @C09CT("pictionary_statistics")
    public final PictionaryStatistics statistics;

    public DrawGuessEndResponse() {
        this(new PictionaryStatistics(0L, 0L, null));
    }

    public DrawGuessEndResponse(PictionaryStatistics pictionaryStatistics) {
        this.statistics = pictionaryStatistics;
    }
}
