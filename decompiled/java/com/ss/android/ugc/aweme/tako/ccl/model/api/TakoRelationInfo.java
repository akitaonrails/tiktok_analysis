package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoRelationInfo {

    @C09CT("block_info")
    public final TakoBlockInfo blockInfo;

    @C09CT("follow_info")
    public final TakoFollowInfo followInfo;

    public final int hashCode() {
        return (this.blockInfo.hashCode() * 31) + this.followInfo.hashCode();
    }

    public TakoRelationInfo() {
        this(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0));
    }

    public TakoRelationInfo(TakoBlockInfo takoBlockInfo, TakoFollowInfo takoFollowInfo) {
        this.blockInfo = takoBlockInfo;
        this.followInfo = takoFollowInfo;
    }
}
