package com.ss.android.ugc.aweme.ecommerce.video.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonFeedModel implements Serializable {

    @C09CT("feed_list")
    public final List<RecommendFeedModel> feedList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final int nextCursor;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("session_id")
    public final String sessionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedModel)) {
            return false;
        }
        CommonFeedModel commonFeedModel = (CommonFeedModel) obj;
        return Intrinsics.LJFF(this.feedList, commonFeedModel.feedList) && this.hasMore == commonFeedModel.hasMore && this.nextCursor == commonFeedModel.nextCursor && Intrinsics.LJFF(this.requestId, commonFeedModel.requestId) && Intrinsics.LJFF(this.sessionId, commonFeedModel.sessionId);
    }

    public CommonFeedModel(List<RecommendFeedModel> list, boolean z, int i, String str, String str2) {
        this.feedList = list;
        this.hasMore = z;
        this.nextCursor = i;
        this.requestId = str;
        this.sessionId = str2;
    }
}
