package com.ss.android.ugc.aweme.explore.data;

import X.C07CF;
import X.C07MS;
import X.C09CT;
import X.C0X12;
import X.C1201190hMb;
import X.C13BV;
import X.C1494600ozq;
import X.C15TI;
import X.C20529615Uw;
import X.EnumC20527415Ua;
import X.InterfaceC1201180hMa;
import X.InterfaceC2337209Du;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreAwemeList extends BaseResponse implements C0X12, InterfaceC1201180hMa, InterfaceC2337209Du {
    public boolean LL;
    public volatile EnumC20527415Ua LLILLJJLI;
    public transient C1494600ozq<?> LLILLL;
    public transient boolean LLILZIL;
    public transient boolean LLILZLL;

    @C09CT("debug_algo_map")
    public Map<Long, String> algoMap;

    @C09CT("cards")
    public List<ExploreCardInsertResultStruct> cards;

    @C09CT("has_more")
    public Integer hasMore;

    @C09CT("info")
    public ExploreInfo info;

    @C09CT("awemes")
    public List<ExplorePostItem> items;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("preload_info")
    public PreloadInfo preloadInfo;

    @C09CT("preview")
    public List<ExplorePostItem> previews;

    @C09CT("rid")
    public String requestId;

    @C09CT("top_banner")
    public ExploreTopBannerData topBanner;
    public transient int LLILZ = C15TI.UNKNOWN.getValue();
    public transient long LLIZ = -1;

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    @Override // X.InterfaceC2337209Du
    public final void setJsonData(String str) {
    }

    @Override // X.C0X12
    public final String getRequestId() {
        String str = this.requestId;
        if (str == null || str.length() == 0) {
            LogPbBean logPbBean = this.logPb;
            this.requestId = logPbBean == null ? "" : logPbBean.getImprId();
        }
        return this.requestId;
    }

    public final boolean LJ() {
        if (!C07MS.LIZ()) {
            return false;
        }
        C20529615Uw c20529615Uw = ExploreCardInsertResultStruct.Companion;
        List list = this.cards;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        c20529615Uw.getClass();
        return ((ArrayList) C20529615Uw.LIZLLL(list)).size() >= 4;
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq<?> getRequestInfo() {
        return this.LLILLL;
    }

    public final ExploreAwemeList LJI(ExploreAwemeList exploreAwemeList) {
        if (Intrinsics.LJFF(this, exploreAwemeList) || exploreAwemeList == null) {
            return this;
        }
        ExploreAwemeList exploreAwemeList2 = new ExploreAwemeList();
        List<ExplorePostItem> list = exploreAwemeList2.items;
        if (list == null) {
            list = exploreAwemeList.items;
        }
        exploreAwemeList2.items = list;
        List<ExplorePostItem> list2 = exploreAwemeList2.previews;
        if (list2 == null) {
            list2 = exploreAwemeList.previews;
        }
        exploreAwemeList2.previews = list2;
        Integer num = exploreAwemeList2.hasMore;
        if (num == null) {
            num = exploreAwemeList.hasMore;
        }
        exploreAwemeList2.hasMore = num;
        LogPbBean logPbBean = exploreAwemeList2.logPb;
        if (logPbBean == null) {
            logPbBean = exploreAwemeList.logPb;
        }
        exploreAwemeList2.logPb = logPbBean;
        String str = exploreAwemeList2.requestId;
        if (str == null) {
            str = exploreAwemeList.requestId;
        }
        exploreAwemeList2.requestId = str;
        Map<Long, String> map = exploreAwemeList2.algoMap;
        if (map == null) {
            map = exploreAwemeList.algoMap;
        }
        exploreAwemeList2.algoMap = map;
        List<ExploreCardInsertResultStruct> list3 = exploreAwemeList2.cards;
        if (list3 == null) {
            list3 = exploreAwemeList.cards;
        }
        exploreAwemeList2.cards = list3;
        ExploreInfo exploreInfo = exploreAwemeList2.info;
        if (exploreInfo == null) {
            exploreInfo = exploreAwemeList.info;
        }
        exploreAwemeList2.info = exploreInfo;
        PreloadInfo preloadInfo = exploreAwemeList2.preloadInfo;
        if (preloadInfo == null) {
            preloadInfo = exploreAwemeList.preloadInfo;
        }
        exploreAwemeList2.preloadInfo = preloadInfo;
        EnumC20527415Ua enumC20527415Ua = exploreAwemeList2.LLILLJJLI;
        if (enumC20527415Ua == null) {
            enumC20527415Ua = exploreAwemeList.LLILLJJLI;
        }
        exploreAwemeList2.LLILLJJLI = enumC20527415Ua;
        ExploreTopBannerData exploreTopBannerData = exploreAwemeList2.topBanner;
        if (exploreTopBannerData == null) {
            exploreTopBannerData = exploreAwemeList.topBanner;
        }
        exploreAwemeList2.topBanner = exploreTopBannerData;
        return exploreAwemeList2;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        List<ExploreCardInsertResultStruct> list;
        this.requestId = str;
        if ((C07MS.LIZ() || C07CF.LIZ()) && (list = this.cards) != null) {
            C20529615Uw c20529615Uw = ExploreCardInsertResultStruct.Companion;
            LogPbBean logPbBean = this.logPb;
            c20529615Uw.getClass();
            C20529615Uw.LIZ(list, str, logPbBean);
        }
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.LLILLL = c1494600ozq;
    }
}
