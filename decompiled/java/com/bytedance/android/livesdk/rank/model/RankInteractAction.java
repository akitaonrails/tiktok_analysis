package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class RankInteractAction {

    @C09CT("cohost_channel_id")
    public long cohostChannelId;

    @C09CT("num")
    public long num;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;
}
