package com.bytedance.android.livesdk.subscribe.model.invite;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes33.dex */
public final class SubInvitationEntrancePrompt {

    @C09CT("prompt")
    public String prompt;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long promptId;

    @C09CT("prompt_type")
    public int promptType;
}
