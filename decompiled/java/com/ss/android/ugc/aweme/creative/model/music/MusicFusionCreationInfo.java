package com.ss.android.ugc.aweme.creative.model.music;

import X.C040H;
import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicFusionCreationInfo implements Serializable {

    @C040H
    @C09CT("fuesd_music_creation_infos")
    public final List<FusedMusicCreationModel> fusedMusicCreationInfos;

    @C040H
    @C09CT("fusion_type")
    public final int fusionType;

    public MusicFusionCreationInfo() {
        this(null, 0);
    }

    public MusicFusionCreationInfo(List<FusedMusicCreationModel> list, int i) {
        this.fusedMusicCreationInfos = list;
        this.fusionType = i;
    }
}
