package com.ss.android.ugc.aweme.music.search;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchMusicList extends MusicBaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("group")
    public final List<MusicGroup> musicGroupList;

    public final List<MusicGroup> getMusicGroupList() {
        return this.musicGroupList;
    }
}
