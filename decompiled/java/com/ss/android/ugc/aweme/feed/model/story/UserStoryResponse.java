package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UserStoryResponse extends BaseResponse implements Serializable {

    @C09CT("user_story")
    public final UserStory userStory;

    public final UserStoryResponse copy(UserStory userStory) {
        return new UserStoryResponse(userStory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserStoryResponse) && Intrinsics.LJFF(this.userStory, ((UserStoryResponse) obj).userStory);
    }

    public int hashCode() {
        return this.userStory.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStoryResponse(userStory=");
        sbLIZ.append(this.userStory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UserStory getUserStory() {
        return this.userStory;
    }

    public UserStoryResponse(UserStory userStory) {
        this.userStory = userStory;
    }
}
