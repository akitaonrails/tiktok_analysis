package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class RemainMusicFusion implements Serializable {

    @C09CT("fused_music_infos")
    public final List<FusedMusic> fusedMusicInfos;

    @C09CT("is_ep_multi_music")
    public final boolean isEpMultiMusic;

    public RemainMusicFusion() {
        this(false, null, 3, null);
    }

    public final boolean isEpMultiMusic() {
        return this.isEpMultiMusic;
    }

    public RemainMusicFusion(boolean z, List<FusedMusic> list) {
        this.isEpMultiMusic = z;
        this.fusedMusicInfos = list;
    }

    public RemainMusicFusion(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
