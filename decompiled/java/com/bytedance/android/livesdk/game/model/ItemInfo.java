package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class ItemInfo {

    @C09CT("creator_info")
    public CreatorInfo creatorInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("statistics_info")
    public ItemStatisticsInfo statisticsInfo;

    @C09CT("video_info")
    public VideoInfo videoInfo;
}
