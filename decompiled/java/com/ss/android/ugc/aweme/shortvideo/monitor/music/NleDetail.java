package com.ss.android.ugc.aweme.shortvideo.monitor.music;

/* JADX INFO: loaded from: classes31.dex */
public final class NleDetail {
    public final int NLETracks;
    public final Integer bizExtraType;
    public final boolean hasEnabledAudio;
    public final float volume;

    public final int getNLETracks() {
        return this.NLETracks;
    }

    public NleDetail(int i, Integer num, boolean z, float f) {
        this.NLETracks = i;
        this.bizExtraType = num;
        this.hasEnabledAudio = z;
        this.volume = f;
    }
}
