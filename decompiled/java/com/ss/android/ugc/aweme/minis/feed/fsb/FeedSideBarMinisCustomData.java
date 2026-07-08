package com.ss.android.ugc.aweme.minis.feed.fsb;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FeedSideBarMinisCustomData {

    @C09CT("lynx_params")
    public final FeedSideBarMinisLynxParams lynxParams;

    @C09CT("minis_feed_sidebar_lynx_schema")
    public final String lynxSchema;

    @C09CT("minis_list")
    public final List<Map<String, Object>> minisList;

    public FeedSideBarMinisCustomData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSideBarMinisCustomData)) {
            return false;
        }
        FeedSideBarMinisCustomData feedSideBarMinisCustomData = (FeedSideBarMinisCustomData) obj;
        return Intrinsics.LJFF(this.minisList, feedSideBarMinisCustomData.minisList) && Intrinsics.LJFF(this.lynxSchema, feedSideBarMinisCustomData.lynxSchema) && Intrinsics.LJFF(this.lynxParams, feedSideBarMinisCustomData.lynxParams);
    }

    public final int hashCode() {
        List<Map<String, Object>> list = this.minisList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.lynxSchema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        FeedSideBarMinisLynxParams feedSideBarMinisLynxParams = this.lynxParams;
        return iHashCode2 + (feedSideBarMinisLynxParams != null ? feedSideBarMinisLynxParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedSideBarMinisCustomData(minisList=");
        sbLIZ.append(this.minisList);
        sbLIZ.append(", lynxSchema=");
        sbLIZ.append(this.lynxSchema);
        sbLIZ.append(", lynxParams=");
        sbLIZ.append(this.lynxParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedSideBarMinisCustomData(List<? extends Map<String, ? extends Object>> list, String str, FeedSideBarMinisLynxParams feedSideBarMinisLynxParams) {
        this.minisList = list;
        this.lynxSchema = str;
        this.lynxParams = feedSideBarMinisLynxParams;
    }
}
