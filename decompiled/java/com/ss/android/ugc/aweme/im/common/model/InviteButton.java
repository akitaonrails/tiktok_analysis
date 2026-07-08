package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class InviteButton {

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("text")
    public final String text;

    public InviteButton() {
        this(null, null, null);
    }

    public InviteButton(String str, Integer num, Integer num2) {
        this.text = str;
        this.actionType = num;
        this.status = num2;
    }
}
