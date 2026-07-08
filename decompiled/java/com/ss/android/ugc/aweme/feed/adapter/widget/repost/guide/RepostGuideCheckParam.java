package com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class RepostGuideCheckParam {

    @C09CT("client_ts")
    public long curClientTimeStamps;

    @C09CT("records")
    public final List<RepostGuideShowRecordsModel> showRecords;

    public RepostGuideCheckParam() {
        this(new ArrayList(), 0L);
    }

    public RepostGuideCheckParam(List<RepostGuideShowRecordsModel> list, long j) {
        this.showRecords = list;
        this.curClientTimeStamps = j;
    }
}
