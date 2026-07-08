package com.ss.android.ugc.aweme.choosemusic.sug.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicSearchSugResponse extends BaseResponse {

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("words_query_record")
    public final RecommendWordMob recommendWordMob;

    @C09CT("rid")
    public String requestId = "";

    @C09CT("sug_list")
    public List<? extends SearchSugEntity> sugList;
}
