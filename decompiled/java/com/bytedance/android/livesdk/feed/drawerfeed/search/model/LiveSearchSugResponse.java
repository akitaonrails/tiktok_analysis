package com.bytedance.android.livesdk.feed.drawerfeed.search.model;

import X.C09CT;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveSearchSugResponse {
    public String LIZ;

    @C09CT("log_pb")
    public n logPb;

    @C09CT("rid")
    public String requestId = "";

    @C09CT("status_code")
    public int statusCode;

    @C09CT("sug_list")
    public List<LiveSearchSugEntity> sugList;
}
