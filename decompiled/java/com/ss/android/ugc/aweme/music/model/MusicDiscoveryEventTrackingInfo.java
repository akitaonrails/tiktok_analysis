package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicDiscoveryEventTrackingInfo implements Serializable {

    @C09CT("is_music_card")
    public boolean isMusicCard;

    public MusicDiscoveryEventTrackingInfo() {
        this(false);
    }

    public final boolean isMusicCard() {
        return this.isMusicCard;
    }

    public MusicDiscoveryEventTrackingInfo(boolean z) {
        this.isMusicCard = z;
    }
}
