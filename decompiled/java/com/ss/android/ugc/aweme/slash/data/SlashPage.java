package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import X.C1201190hMb;
import X.C1494600ozq;
import X.C2188811AlT;
import X.InterfaceC1196330hEl;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashPage extends BaseResponse implements InterfaceC1201180hMa, InterfaceC1196330hEl {

    @C09CT("layout")
    public final Map<String, List<String>> layout;

    @C09CT("nodes")
    public final Map<String, Node> nodes;

    @C09CT("page_info")
    public final PageInfo pageInfo;
    public String preloadFlag;
    public C1494600ozq<?> requestInfo;

    public SlashPage() {
        this(null, null, null);
    }

    public final SlashPage copy(Map<String, ? extends List<String>> map, PageInfo pageInfo, Map<String, Node> map2) {
        return new SlashPage(map, pageInfo, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashPage)) {
            return false;
        }
        SlashPage slashPage = (SlashPage) obj;
        return Intrinsics.LJFF(this.layout, slashPage.layout) && Intrinsics.LJFF(this.pageInfo, slashPage.pageInfo) && Intrinsics.LJFF(this.nodes, slashPage.nodes);
    }

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        Map<String, List<String>> map = this.layout;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        PageInfo pageInfo = this.pageInfo;
        int iHashCode2 = (iHashCode + (pageInfo == null ? 0 : pageInfo.hashCode())) * 31;
        Map<String, Node> map2 = this.nodes;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // X.InterfaceC1196330hEl
    public void setPreloadRealNetDurationMs(long j) {
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashPage(layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", pageInfo=");
        sbLIZ.append(this.pageInfo);
        sbLIZ.append(", nodes=");
        sbLIZ.append(this.nodes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEmpty$slash_release() {
        Map<String, List<String>> map = this.layout;
        if (map != null && !map.isEmpty()) {
            return false;
        }
        Map<String, Node> map2 = this.nodes;
        return (map2 == null || map2.isEmpty()) && this.pageInfo == null;
    }

    public final Map<String, List<String>> getLayout() {
        return this.layout;
    }

    public final Map<String, Node> getNodes() {
        return this.nodes;
    }

    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }

    @Override // X.InterfaceC1196330hEl
    public String getPreloadFlag() {
        return this.preloadFlag;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    @Override // X.InterfaceC1196330hEl
    public void setPreloadFlag(String str) {
        this.preloadFlag = str;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.requestInfo = c1494600ozq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SlashPage(Map<String, ? extends List<String>> map, PageInfo pageInfo, Map<String, Node> map2) {
        this.layout = map;
        this.pageInfo = pageInfo;
        this.nodes = map2;
    }
}
