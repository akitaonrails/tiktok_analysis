package com.ss.android.ugc.aweme.models;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.now.UserNowPost;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NowUserPostResponse extends BaseResponse {

    @C09CT("user_now_post")
    public final UserNowPost userNowPost;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NowUserPostResponse) && Intrinsics.LJFF(this.userNowPost, ((NowUserPostResponse) obj).userNowPost);
    }

    public final int hashCode() {
        UserNowPost userNowPost = this.userNowPost;
        if (userNowPost == null) {
            return 0;
        }
        return userNowPost.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowUserPostResponse(userNowPost=");
        sbLIZ.append(this.userNowPost);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NowUserPostResponse(UserNowPost userNowPost) {
        this.userNowPost = userNowPost;
    }
}
