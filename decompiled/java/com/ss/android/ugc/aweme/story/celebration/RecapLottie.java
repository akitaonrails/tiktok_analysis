package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class RecapLottie implements Serializable {
    public static final int $stable = 8;

    @C09CT("content")
    public final RecapContent content;

    public RecapLottie() {
        this(null);
    }

    public RecapLottie(RecapContent recapContent) {
        this.content = recapContent;
    }
}
