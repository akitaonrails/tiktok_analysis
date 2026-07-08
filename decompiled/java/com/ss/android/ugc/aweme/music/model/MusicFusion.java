package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicFusion implements Serializable {

    @C09CT("fused_music_infos")
    public List<FusedMusic> fusedMusicInfos;

    @C09CT("is_ep_multi_music")
    public boolean isEpMultiMusic;

    @C09CT("is_smart_extended")
    public boolean isSmartExtended;

    public MusicFusion() {
        this(false, false, null, 7, null);
    }

    public final boolean isEpMultiMusic() {
        return this.isEpMultiMusic;
    }

    public final boolean isSmartExtended() {
        return this.isSmartExtended;
    }

    public MusicFusion(boolean z, boolean z2, List<FusedMusic> list) {
        this.isSmartExtended = z;
        this.isEpMultiMusic = z2;
        this.fusedMusicInfos = list;
    }

    public MusicFusion(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
