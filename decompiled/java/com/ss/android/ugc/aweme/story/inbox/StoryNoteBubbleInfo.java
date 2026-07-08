package com.ss.android.ugc.aweme.story.inbox;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryNoteBubbleInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_info")
    public final Aweme aweme;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public StoryNoteBubbleInfo(Aweme aweme, Integer num) {
        this.aweme = aweme;
        this.status = num;
    }
}
