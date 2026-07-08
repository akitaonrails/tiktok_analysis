package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import X.C0X12;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreTopicAwemeListResponse extends BaseResponse implements C0X12, InterfaceC1201180hMa {
    public transient C1494600ozq<?> LL;
    public boolean LLILLJJLI;

    @C09CT("has_more")
    public Integer hasMore;

    @C09CT("awemes")
    public List<Aweme> items;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("rid")
    public String requestId;

    @C09CT("top_banner")
    public ExploreTopBannerData topBanner;

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    @Override // X.C0X12
    public final String getRequestId() {
        String imprId = this.requestId;
        LogPbBean logPbBean = this.logPb;
        if (imprId == null || imprId.length() == 0) {
            if (logPbBean == null) {
                return "";
            }
            imprId = logPbBean.getImprId();
        }
        return imprId == null ? "" : imprId;
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq<?> getRequestInfo() {
        return this.LL;
    }

    public final ExploreTopicAwemeListResponse LJ(ExploreTopicAwemeListResponse exploreTopicAwemeListResponse) {
        if (Intrinsics.LJFF(this, exploreTopicAwemeListResponse) || exploreTopicAwemeListResponse == null) {
            return this;
        }
        ExploreTopicAwemeListResponse exploreTopicAwemeListResponse2 = new ExploreTopicAwemeListResponse();
        List<Aweme> list = exploreTopicAwemeListResponse2.items;
        if (list == null) {
            list = exploreTopicAwemeListResponse.items;
        }
        exploreTopicAwemeListResponse2.items = list;
        String str = exploreTopicAwemeListResponse2.requestId;
        if (str == null) {
            str = exploreTopicAwemeListResponse.requestId;
        }
        exploreTopicAwemeListResponse2.requestId = str;
        LogPbBean logPbBean = exploreTopicAwemeListResponse2.logPb;
        if (logPbBean == null) {
            logPbBean = exploreTopicAwemeListResponse.logPb;
        }
        exploreTopicAwemeListResponse2.logPb = logPbBean;
        Integer num = exploreTopicAwemeListResponse2.hasMore;
        if (num == null) {
            num = exploreTopicAwemeListResponse.hasMore;
        }
        exploreTopicAwemeListResponse2.hasMore = num;
        ExploreTopBannerData exploreTopBannerData = exploreTopicAwemeListResponse2.topBanner;
        if (exploreTopBannerData == null) {
            exploreTopBannerData = exploreTopicAwemeListResponse.topBanner;
        }
        exploreTopicAwemeListResponse2.topBanner = exploreTopBannerData;
        return exploreTopicAwemeListResponse2;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.LL = c1494600ozq;
    }
}
