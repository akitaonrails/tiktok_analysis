package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes2.dex */
public final class OriginalSound {

    @C09CT("play_addr")
    public UrlModel playAddr;

    public OriginalSound() {
        this(null);
    }

    public OriginalSound(UrlModel urlModel) {
        this.playAddr = urlModel;
    }
}
