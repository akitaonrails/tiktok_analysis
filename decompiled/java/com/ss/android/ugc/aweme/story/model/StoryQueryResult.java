package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryQueryResult {
    public static final int $stable = 8;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String authorUid;

    @C09CT("result_code")
    public int code;

    public StoryQueryResult() {
        this(0, "");
    }

    public final void setAuthorUid(String str) {
        this.authorUid = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public StoryQueryResult(int i, String str) {
        this.code = i;
        this.authorUid = str;
    }
}
