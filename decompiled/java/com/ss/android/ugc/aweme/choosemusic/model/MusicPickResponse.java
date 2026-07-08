package com.ss.android.ugc.aweme.choosemusic.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.model.SmartExtendMusicData;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class MusicPickResponse extends BaseResponse {

    @C09CT("banner_list")
    public List<Banner> bannerList;

    @C09CT("extra_music_list")
    public List<Music> extraMusicList;

    @C09CT("from_recommend")
    public Boolean fromRecommend = Boolean.FALSE;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("mc_list")
    public List<MusicCollectionItem> musicCollectionList;

    @C09CT("music_list")
    public List<Music> musicList;

    @C09CT("music_list_type")
    public int musicListType;

    @C09CT("radio_cursor")
    public int radioCursor;

    @C09CT("smart_extend_music_list")
    public List<SmartExtendMusicData> smartExtendMusicDataList;

    public final boolean LJ() {
        return this.musicListType == 1;
    }
}
