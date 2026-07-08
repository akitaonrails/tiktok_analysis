package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoOnBoardingResponse {

    @C09CT("data")
    public final List<TakoOnboardingData> data;

    @C09CT("log_id")
    public final String logId;

    @C09CT("log_pb")
    public final LogPbBean logPbBean;

    @C09CT("version")
    public final int version;

    public TakoOnBoardingResponse() {
        this(0, null, null, null);
    }

    public TakoOnBoardingResponse(int i, List<TakoOnboardingData> list, LogPbBean logPbBean, String str) {
        this.version = i;
        this.data = list;
        this.logPbBean = logPbBean;
        this.logId = str;
    }
}
