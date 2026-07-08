package com.ss.android.ugc.aweme.follow.presenter;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowInsertedResult {
    public static final int $stable = 8;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String awemeId;

    @C09CT("result_code")
    public int code;

    public FollowInsertedResult() {
        this(0, "");
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public FollowInsertedResult(int i, String str) {
        this.code = i;
        this.awemeId = str;
    }
}
