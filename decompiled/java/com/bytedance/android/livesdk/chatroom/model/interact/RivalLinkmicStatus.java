package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;

/* JADX INFO: loaded from: classes.dex */
public final class RivalLinkmicStatus {

    @C09CT("block_reason")
    public int blockReason;

    @C09CT("cohost_layout_mode")
    public int cohostLayoutMode;

    @C09CT("detail_block_reason")
    public int detailBlockReason;

    @C09CT("linker_info")
    public LinkerInfo linkerInfo;

    @C09CT("opt_pair_info")
    public OptPairInfo optPairInfo;

    @C09CT("play_type")
    public int playType;

    @C09CT("reserve_info")
    public RivalExtraInfo.ReserveInfo reserveInfo;
}
