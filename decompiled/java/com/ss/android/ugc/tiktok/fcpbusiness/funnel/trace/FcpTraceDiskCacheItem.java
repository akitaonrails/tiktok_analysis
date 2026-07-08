package com.ss.android.ugc.tiktok.fcpbusiness.funnel.trace;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.feed.funnel.api.FunnelContext;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.FunnelNode;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FcpTraceDiskCacheItem implements Serializable {

    @C09CT("contextInfo")
    public final FunnelContext.Info context;

    @C09CT("traceMap")
    public final Map<String, FunnelNode> traceMap;

    public FcpTraceDiskCacheItem() {
        this(null, C2097608Jq.LJ());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FcpTraceDiskCacheItem)) {
            return false;
        }
        FcpTraceDiskCacheItem fcpTraceDiskCacheItem = (FcpTraceDiskCacheItem) obj;
        return Intrinsics.LJFF(this.context, fcpTraceDiskCacheItem.context) && Intrinsics.LJFF(this.traceMap, fcpTraceDiskCacheItem.traceMap);
    }

    public int hashCode() {
        FunnelContext.Info info = this.context;
        int iHashCode = (info == null ? 0 : info.hashCode()) * 31;
        Map<String, FunnelNode> map = this.traceMap;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpTraceDiskCacheItem(context=");
        sbLIZ.append(this.context);
        sbLIZ.append(", traceMap=");
        sbLIZ.append(this.traceMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FcpTraceDiskCacheItem(FunnelContext.Info info, Map<String, FunnelNode> map) {
        this.context = info;
        this.traceMap = map;
    }
}
