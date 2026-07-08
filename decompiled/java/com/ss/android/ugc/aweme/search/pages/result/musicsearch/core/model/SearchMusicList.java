package com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SearchMusicList extends SearchApiResult {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("music_info_list")
    public List<Object> searchMusicList;
}
