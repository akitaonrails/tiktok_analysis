package com.ss.android.ugc.aweme.choosemusic.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class MusicCollectionFeedResponse extends BaseResponse {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("mcf_list")
    public List<MusicCollectionFeed> musicCollectionFeedList;
}
