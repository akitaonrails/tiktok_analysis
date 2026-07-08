package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoAwemeRecallResponse extends TakoBaseResponse {

    @C09CT("have_more")
    public final boolean hasMore;

    @C09CT("videos")
    public final List<TakoVideoItem> videoList;

    public TakoAwemeRecallResponse() {
        this(null, false, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoAwemeRecallResponse)) {
            return false;
        }
        TakoAwemeRecallResponse takoAwemeRecallResponse = (TakoAwemeRecallResponse) obj;
        return Intrinsics.LJFF(this.videoList, takoAwemeRecallResponse.videoList) && this.hasMore == takoAwemeRecallResponse.hasMore;
    }

    public final int hashCode() {
        return (this.videoList.hashCode() * 31) + C786410Ut5.Z2(this.hasMore);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAwemeRecallResponse(videoList=");
        sbLIZ.append(this.videoList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoAwemeRecallResponse(List<TakoVideoItem> list, boolean z) {
        super(null, 0, "");
        this.videoList = list;
        this.hasMore = z;
    }

    public TakoAwemeRecallResponse(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z);
    }
}
