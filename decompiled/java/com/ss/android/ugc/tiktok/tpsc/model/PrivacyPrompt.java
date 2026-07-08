package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyPrompt {

    @C09CT("props")
    public String props;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public PrivacyPrompt() {
        this(0, "{}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyPrompt)) {
            return false;
        }
        PrivacyPrompt privacyPrompt = (PrivacyPrompt) obj;
        return this.status == privacyPrompt.status && Intrinsics.LJFF(this.props, privacyPrompt.props);
    }

    public PrivacyPrompt(int i, String str) {
        this.status = i;
        this.props = str;
    }
}
