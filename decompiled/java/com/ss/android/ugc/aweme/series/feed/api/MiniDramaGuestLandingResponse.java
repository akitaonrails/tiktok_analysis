package com.ss.android.ugc.aweme.series.feed.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MiniDramaGuestLandingResponse extends BaseResponse {

    @C09CT("collections")
    public final List<ShortDramaOverview> collections;

    public MiniDramaGuestLandingResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MiniDramaGuestLandingResponse) && Intrinsics.LJFF(this.collections, ((MiniDramaGuestLandingResponse) obj).collections);
    }

    public final int hashCode() {
        List<ShortDramaOverview> list = this.collections;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaGuestLandingResponse(collections=");
        sbLIZ.append(this.collections);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MiniDramaGuestLandingResponse(List<ShortDramaOverview> list) {
        this.collections = list;
    }

    public MiniDramaGuestLandingResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
