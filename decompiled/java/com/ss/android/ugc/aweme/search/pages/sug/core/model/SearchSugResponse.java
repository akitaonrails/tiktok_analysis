package com.ss.android.ugc.aweme.search.pages.sug.core.model;

import X.C09CT;
import X.C0QKX;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.SugConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SearchSugResponse extends BaseResponse implements InterfaceC1201180hMa {
    public transient String LLILLL;
    public transient C0QKX LLILZ;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("original_query")
    public String originQuery;

    @C09CT("words_query_record")
    public RecommendWordMob recommendWordMob;

    @C09CT("config")
    public SugConfig sugConfig;

    @C09CT("sug_list")
    public List<SearchSugEntity> sugList;

    @C09CT("rid")
    public String requestId = "";

    @C09CT("request_order")
    public Long requestOrder = 0L;

    @C09CT("sug_virtual_enable")
    public String sugVirtualEnable = "";

    @C09CT("result_status")
    public Integer resultStatus = 0;
    public boolean LL = false;
    public C1494600ozq LLILLJJLI = null;

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final SearchSugResponse clone() {
        SearchSugResponse searchSugResponse = new SearchSugResponse();
        try {
            searchSugResponse = (SearchSugResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        searchSugResponse.sugVirtualEnable = this.sugVirtualEnable;
        searchSugResponse.requestId = this.requestId;
        searchSugResponse.logPb = this.logPb;
        searchSugResponse.recommendWordMob = this.recommendWordMob;
        return searchSugResponse;
    }

    public final long LJI() {
        BaseResponse.ServerTimeExtra serverTimeExtra = this.extra;
        if (serverTimeExtra != null) {
            return serverTimeExtra.server_stream_time;
        }
        return 0L;
    }

    public final boolean LJIILIIL() {
        SugConfig sugConfig = this.sugConfig;
        return sugConfig != null && sugConfig.isPredictSug;
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq getRequestInfo() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq c1494600ozq) {
        this.LLILLJJLI = c1494600ozq;
    }
}
