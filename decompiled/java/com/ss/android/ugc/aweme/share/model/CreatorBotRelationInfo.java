package com.ss.android.ugc.aweme.share.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class CreatorBotRelationInfo {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("block_info")
    public final CreatorBotBlockInfo blockInfo;

    @C09CT("follow_info")
    public final CreatorBotFollowInfo followInfo;

    public CreatorBotRelationInfo(CreatorBotBlockInfo creatorBotBlockInfo, CreatorBotFollowInfo creatorBotFollowInfo) {
        this.blockInfo = creatorBotBlockInfo;
        this.followInfo = creatorBotFollowInfo;
    }
}
