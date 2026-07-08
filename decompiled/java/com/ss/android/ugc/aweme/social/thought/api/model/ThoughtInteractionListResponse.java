package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ThoughtInteractionListResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("interactions")
    public final List<ThoughtInteractionInfo> interactions;

    @C09CT("next_page_token")
    public final String nextPageToken;

    public ThoughtInteractionListResponse() {
        this(null, null, null);
    }

    public final ThoughtInteractionListResponse copy(List<ThoughtInteractionInfo> list, String str, Boolean bool) {
        return new ThoughtInteractionListResponse(list, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThoughtInteractionListResponse)) {
            return false;
        }
        ThoughtInteractionListResponse thoughtInteractionListResponse = (ThoughtInteractionListResponse) obj;
        return Intrinsics.LJFF(this.interactions, thoughtInteractionListResponse.interactions) && Intrinsics.LJFF(this.nextPageToken, thoughtInteractionListResponse.nextPageToken) && Intrinsics.LJFF(this.hasMore, thoughtInteractionListResponse.hasMore);
    }

    public int hashCode() {
        List<ThoughtInteractionInfo> list = this.interactions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextPageToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtInteractionListResponse(interactions=");
        sbLIZ.append(this.interactions);
        sbLIZ.append(", nextPageToken=");
        sbLIZ.append(this.nextPageToken);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<ThoughtInteractionInfo> getInteractions() {
        return this.interactions;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public ThoughtInteractionListResponse(List<ThoughtInteractionInfo> list, String str, Boolean bool) {
        this.interactions = list;
        this.nextPageToken = str;
        this.hasMore = bool;
    }
}
