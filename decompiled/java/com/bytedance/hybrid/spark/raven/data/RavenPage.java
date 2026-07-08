package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.C1494600ozq;
import X.C2188811AlT;
import com.bytedance.hybrid.spark.raven.model.BaseResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenPage extends BaseResponse {

    @C09CT("containers")
    public final Map<String, Container> containers;

    @C09CT("layout")
    public final Map<String, List<String>> layout;

    @C09CT("nodes")
    public final Map<String, Node> nodes;

    @C09CT("page_info")
    public final PageInfo pageInfo;
    public String preloadFlag;
    public C1494600ozq<?> requestInfo;

    public RavenPage() {
        this(null, null, null, null);
    }

    public final RavenPage copy(Map<String, ? extends List<String>> map, PageInfo pageInfo, Map<String, Node> map2, Map<String, Container> map3) {
        return new RavenPage(map, pageInfo, map2, map3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RavenPage)) {
            return false;
        }
        RavenPage ravenPage = (RavenPage) obj;
        return Intrinsics.LJFF(this.layout, ravenPage.layout) && Intrinsics.LJFF(this.pageInfo, ravenPage.pageInfo) && Intrinsics.LJFF(this.nodes, ravenPage.nodes) && Intrinsics.LJFF(this.containers, ravenPage.containers);
    }

    public int hashCode() {
        Map<String, List<String>> map = this.layout;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        PageInfo pageInfo = this.pageInfo;
        int iHashCode2 = (iHashCode + (pageInfo == null ? 0 : pageInfo.hashCode())) * 31;
        Map<String, Node> map2 = this.nodes;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Container> map3 = this.containers;
        return iHashCode3 + (map3 != null ? map3.hashCode() : 0);
    }

    @Override // com.bytedance.hybrid.spark.raven.model.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenPage(layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", pageInfo=");
        sbLIZ.append(this.pageInfo);
        sbLIZ.append(", nodes=");
        sbLIZ.append(this.nodes);
        sbLIZ.append(", containers=");
        sbLIZ.append(this.containers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, Container> getContainers() {
        return this.containers;
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

    /* JADX WARN: Multi-variable type inference failed */
    public RavenPage(Map<String, ? extends List<String>> map, PageInfo pageInfo, Map<String, Node> map2, Map<String, Container> map3) {
        this.layout = map;
        this.pageInfo = pageInfo;
        this.nodes = map2;
        this.containers = map3;
    }
}
