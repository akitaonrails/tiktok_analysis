package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoFeedRecommendTrackInfo {

    @C09CT("rewritten_query")
    public final String rewrittenQuery;

    @C09CT("search_content")
    public final String searchContent;

    @C09CT("user_query")
    public final String userQuery;

    public TakoFeedRecommendTrackInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoFeedRecommendTrackInfo)) {
            return false;
        }
        TakoFeedRecommendTrackInfo takoFeedRecommendTrackInfo = (TakoFeedRecommendTrackInfo) obj;
        return Intrinsics.LJFF(this.userQuery, takoFeedRecommendTrackInfo.userQuery) && Intrinsics.LJFF(this.rewrittenQuery, takoFeedRecommendTrackInfo.rewrittenQuery) && Intrinsics.LJFF(this.searchContent, takoFeedRecommendTrackInfo.searchContent);
    }

    public final int hashCode() {
        String str = this.userQuery;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rewrittenQuery;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchContent;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoFeedRecommendTrackInfo(userQuery=");
        sbLIZ.append(this.userQuery);
        sbLIZ.append(", rewrittenQuery=");
        sbLIZ.append(this.rewrittenQuery);
        sbLIZ.append(", searchContent=");
        sbLIZ.append(this.searchContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoFeedRecommendTrackInfo(String str, String str2, String str3) {
        this.userQuery = str;
        this.rewrittenQuery = str2;
        this.searchContent = str3;
    }
}
