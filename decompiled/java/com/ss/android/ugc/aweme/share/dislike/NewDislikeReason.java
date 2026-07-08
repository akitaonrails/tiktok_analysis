package com.ss.android.ugc.aweme.share.dislike;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes32.dex */
public final class NewDislikeReason {
    public static final int $stable = 0;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("text")
    public final String text;

    public NewDislikeReason() {
        this(null, null);
    }

    public NewDislikeReason(String str, String str2) {
        this.id = str;
        this.text = str2;
    }
}
