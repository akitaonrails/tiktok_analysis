package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartExtendMusicData implements Serializable {

    @C09CT("music_id")
    public final Long musicId;

    @C09CT("smart_extend_musics")
    public final List<Music> smartExtendMusicList;

    /* JADX WARN: Multi-variable type inference failed */
    public SmartExtendMusicData(Long l, List<? extends Music> list) {
        this.musicId = l;
        this.smartExtendMusicList = list;
    }
}
