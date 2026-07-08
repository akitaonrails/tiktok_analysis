package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PictionaryFullInfo {

    @C09CT("guess_correct")
    public boolean guessCorrect;

    @C09CT("pictionary_info")
    public PictionaryInfo pictionaryInfo;

    @C09CT("pictionary_statistics")
    public PictionaryStatistics pictionaryStatistics;

    public PictionaryFullInfo() {
        this(new PictionaryInfo(), new PictionaryStatistics(0L, 0L, null), false);
    }

    public PictionaryFullInfo(PictionaryInfo pictionaryInfo, PictionaryStatistics pictionaryStatistics, boolean z) {
        this.pictionaryInfo = pictionaryInfo;
        this.pictionaryStatistics = pictionaryStatistics;
        this.guessCorrect = z;
    }
}
