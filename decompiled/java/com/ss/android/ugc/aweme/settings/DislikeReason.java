package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes22.dex */
public final class DislikeReason {
    public static final int $stable = 8;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("text")
    public String text;

    public DislikeReason() {
        this(null, null);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public DislikeReason(String str, String str2) {
        this.id = str;
        this.text = str2;
    }
}
