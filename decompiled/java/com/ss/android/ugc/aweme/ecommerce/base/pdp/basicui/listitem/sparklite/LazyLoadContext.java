package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite;

import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.goda.v2.model.adapter.MapAnyAdapter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LazyLoadContext {

    @C09CT("dedupe_id")
    public final String dedupId;

    @C09CT("path")
    public final String path;

    @C09CT("request_header")
    public final Map<String, String> requestHeader;

    @C09CT("request_params")
    @C09CS(MapAnyAdapter.class)
    public final Map<String, Object> requestParams;

    @C09CT("response_subscription_id")
    public final String responseSubscriptionId;

    @C09CT("trigger")
    public final LazyLoadTrigger trigger;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLoadContext)) {
            return false;
        }
        LazyLoadContext lazyLoadContext = (LazyLoadContext) obj;
        return Intrinsics.LJFF(this.dedupId, lazyLoadContext.dedupId) && Intrinsics.LJFF(this.responseSubscriptionId, lazyLoadContext.responseSubscriptionId) && Intrinsics.LJFF(this.trigger, lazyLoadContext.trigger) && Intrinsics.LJFF(this.requestHeader, lazyLoadContext.requestHeader) && Intrinsics.LJFF(this.requestParams, lazyLoadContext.requestParams) && Intrinsics.LJFF(this.path, lazyLoadContext.path);
    }

    public final int hashCode() {
        String str = this.dedupId;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.responseSubscriptionId.hashCode()) * 31) + this.trigger.hashCode()) * 31;
        Map<String, String> map = this.requestHeader;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.requestParams;
        return ((iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31) + this.path.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LazyLoadContext(dedupId=");
        sbLIZ.append(this.dedupId);
        sbLIZ.append(", responseSubscriptionId=");
        sbLIZ.append(this.responseSubscriptionId);
        sbLIZ.append(", trigger=");
        sbLIZ.append(this.trigger);
        sbLIZ.append(", requestHeader=");
        sbLIZ.append(this.requestHeader);
        sbLIZ.append(", requestParams=");
        sbLIZ.append(this.requestParams);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LazyLoadContext(String str, String str2, LazyLoadTrigger lazyLoadTrigger, Map<String, String> map, Map<String, ? extends Object> map2, String str3) {
        this.dedupId = str;
        this.responseSubscriptionId = str2;
        this.trigger = lazyLoadTrigger;
        this.requestHeader = map;
        this.requestParams = map2;
        this.path = str3;
    }
}
