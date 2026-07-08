package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class InteractionPermission implements Serializable {

    @C09CT("interaction_text")
    public String interactionText;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("disable_toast")
    public String toast;

    public InteractionPermission() {
        this(0, null, null);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public InteractionPermission(int i, String str, String str2) {
        this.status = i;
        this.toast = str;
        this.interactionText = str2;
    }
}
