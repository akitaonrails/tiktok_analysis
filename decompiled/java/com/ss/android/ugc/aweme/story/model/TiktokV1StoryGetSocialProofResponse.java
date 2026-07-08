package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TiktokV1StoryGetSocialProofResponse extends BaseResponse {

    @C09CT("relevant_users")
    public final List<User> relevantUsers;

    @C09CT("total_count")
    public final long totalCount;

    public TiktokV1StoryGetSocialProofResponse() {
        this(null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1StoryGetSocialProofResponse)) {
            return false;
        }
        TiktokV1StoryGetSocialProofResponse tiktokV1StoryGetSocialProofResponse = (TiktokV1StoryGetSocialProofResponse) obj;
        return Intrinsics.LJFF(this.relevantUsers, tiktokV1StoryGetSocialProofResponse.relevantUsers) && this.totalCount == tiktokV1StoryGetSocialProofResponse.totalCount;
    }

    public final int hashCode() {
        List<User> list = this.relevantUsers;
        return ((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.totalCount);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokV1StoryGetSocialProofResponse(relevantUsers=");
        sbLIZ.append(this.relevantUsers);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TiktokV1StoryGetSocialProofResponse(List<? extends User> list, long j) {
        this.relevantUsers = list;
        this.totalCount = j;
    }
}
