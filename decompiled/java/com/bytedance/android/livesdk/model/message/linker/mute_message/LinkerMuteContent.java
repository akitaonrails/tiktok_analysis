package com.bytedance.android.livesdk.model.message.linker.mute_message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public class LinkerMuteContent {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int muteStatus;

    @C09CT("user_id")
    public long userId;
}
