package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FriendsNewPostsItemResponse extends BaseResponse {

    @C09CT("items")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_page_token")
    public final String nextPageToken;

    public FriendsNewPostsItemResponse() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsNewPostsItemResponse)) {
            return false;
        }
        FriendsNewPostsItemResponse friendsNewPostsItemResponse = (FriendsNewPostsItemResponse) obj;
        return Intrinsics.LJFF(this.hasMore, friendsNewPostsItemResponse.hasMore) && Intrinsics.LJFF(this.nextPageToken, friendsNewPostsItemResponse.nextPageToken) && Intrinsics.LJFF(this.awemeList, friendsNewPostsItemResponse.awemeList);
    }

    public final int hashCode() {
        Boolean bool = this.hasMore;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.nextPageToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Aweme> list = this.awemeList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsNewPostsItemResponse(hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", nextPageToken=");
        sbLIZ.append(this.nextPageToken);
        sbLIZ.append(", awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsNewPostsItemResponse(Boolean bool, String str, List<? extends Aweme> list) {
        this.hasMore = bool;
        this.nextPageToken = str;
        this.awemeList = list;
    }

    public FriendsNewPostsItemResponse(Boolean bool, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
