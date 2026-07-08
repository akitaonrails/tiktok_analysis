package com.ss.android.ugc.aweme.duet.model;

import X.C09CT;
import X.InterfaceC2126708Uv;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class DuetAwemeList extends BaseResponse {

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("aweme_list")
    @InterfaceC2126708Uv
    public ArrayList<Aweme> items;

    @C09CT("log_pb")
    public LogPbBean logPb;
}
