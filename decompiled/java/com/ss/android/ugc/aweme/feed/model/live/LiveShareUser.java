package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveShareUser implements Serializable {

    @C09CT("avatar_thumb")
    public LiveImageUrlModel avatarThumb;

    @C09CT("nickname")
    public String nickname;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long userId;

    public LiveShareUser() {
        this(-1L, "", null);
    }

    public final void setAvatarThumb(LiveImageUrlModel liveImageUrlModel) {
        this.avatarThumb = liveImageUrlModel;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public LiveShareUser(long j, String str, LiveImageUrlModel liveImageUrlModel) {
        this.userId = j;
        this.nickname = str;
        this.avatarThumb = liveImageUrlModel;
    }
}
