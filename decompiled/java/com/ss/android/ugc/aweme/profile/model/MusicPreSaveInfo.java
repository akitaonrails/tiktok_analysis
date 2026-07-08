package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class MusicPreSaveInfo implements Serializable {

    @C09CT("music_pre_save_available_dsp_platforms")
    public List<Integer> availableDspPlatforms;

    @C09CT("meta_album_id")
    public String metaAlbumId;

    public MusicPreSaveInfo() {
        this(null, null, 3, null);
    }

    public final void setAvailableDspPlatforms(List<Integer> list) {
        this.availableDspPlatforms = list;
    }

    public final void setMetaAlbumId(String str) {
        this.metaAlbumId = str;
    }

    public MusicPreSaveInfo(String str, List<Integer> list) {
        this.metaAlbumId = str;
        this.availableDspPlatforms = list;
    }

    public MusicPreSaveInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
