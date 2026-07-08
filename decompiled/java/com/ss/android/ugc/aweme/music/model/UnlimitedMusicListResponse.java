package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class UnlimitedMusicListResponse extends BaseResponse {

    @C09CT("data")
    public final UnlimitedMusicList musicData;

    public final List<Music> getOriginalMusicList() {
        UnlimitedMusicList unlimitedMusicList = this.musicData;
        if (unlimitedMusicList != null) {
            return unlimitedMusicList.musicList;
        }
        return null;
    }

    public final UnlimitedMusicList getMusicData() {
        return this.musicData;
    }
}
