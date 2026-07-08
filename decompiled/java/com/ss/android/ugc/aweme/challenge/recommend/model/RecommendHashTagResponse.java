package com.ss.android.ugc.aweme.challenge.recommend.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class RecommendHashTagResponse extends BaseResponse {

    @C09CT("intervene_list")
    public List<RecommendHashTagData> data;

    @C09CT("fill_history_end")
    public boolean fillHistoryEnd;

    @C09CT("need_history")
    public boolean needHistory;

    @C09CT("need_privacy_history")
    public boolean needPrivacyHistory;

    @C09CT("show_privacy_count")
    public int showPrivacyCount;
}
