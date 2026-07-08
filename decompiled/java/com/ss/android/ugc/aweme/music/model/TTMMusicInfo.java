package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TTMMusicInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("track")
    public TTMTrack track;

    public static final class Companion {
    }

    public TTMMusicInfo() {
        this(null);
    }

    public TTMMusicInfo(TTMTrack tTMTrack) {
        this.track = tTMTrack;
    }
}
