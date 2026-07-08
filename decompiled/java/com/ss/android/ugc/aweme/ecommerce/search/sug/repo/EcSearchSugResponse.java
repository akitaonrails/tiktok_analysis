package com.ss.android.ugc.aweme.ecommerce.search.sug.repo;

import X.C09CT;
import X.C1201190hMb;
import X.C1494600ozq;
import X.C670780QSu;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class EcSearchSugResponse extends BaseResponse implements InterfaceC1201180hMa {
    public transient String LLILLJJLI;
    public transient Long LLILLL;
    public transient C670780QSu LLILZ;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("words_query_record")
    public RecommendWordMob recommendWordMob;

    @C09CT("info")
    public EcSearchSugResInfo resInfo;

    @C09CT("sug_list")
    public List<SearchSugEntity> sugList;

    @C09CT("rid")
    public String requestId = "";

    @C09CT("request_order")
    public Long requestOrder = 0L;

    @C09CT("sug_virtual_enable")
    public String sugVirtualEnable = "";
    public C1494600ozq LL = null;

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq getRequestInfo() {
        return this.LL;
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq c1494600ozq) {
        this.LL = c1494600ozq;
    }
}
