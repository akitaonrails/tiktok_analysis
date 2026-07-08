package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GameStatusEvent {

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("play_id")
    public String playId = "";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
