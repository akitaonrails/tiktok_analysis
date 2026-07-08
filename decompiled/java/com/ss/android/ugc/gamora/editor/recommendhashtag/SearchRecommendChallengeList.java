package com.ss.android.ugc.gamora.editor.recommendhashtag;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class SearchRecommendChallengeList extends BaseResponse {

    @C09CT("challenge_list")
    public List<AVChallenge> items = new ArrayList();

    @C09CT("log_id")
    public String logId = "";

    @C09CT("request_order")
    public int requestOrder;
}
