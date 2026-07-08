package com.ss.android.ugc.aweme.mix.api.response;

import X.C09CT;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class MixVideosResponse extends BaseResponse implements InterfaceC1201180hMa {
    public C1494600ozq<?> LL;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("has_more_of_load_before")
    public boolean hasMoreLoadBefore;

    @C09CT("has_more_of_load_more")
    public boolean hasMoreLoadMore;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("min_cursor")
    public long minCursor;

    @C09CT("mix_label")
    public int mixLabel;

    @C09CT("videos")
    public List<? extends Aweme> mixVideos;

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq<?> getRequestInfo() {
        return this.LL;
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        if (c1494600ozq != null) {
            this.LL = c1494600ozq;
        }
    }
}
