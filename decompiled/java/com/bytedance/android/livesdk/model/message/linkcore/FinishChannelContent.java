package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class FinishChannelContent {

    @C09CT("finish_reason")
    public long finishReason;

    @C09CT("owner")
    public Player owner;

    public FinishChannelContent() {
        this(null, 0L);
    }

    public FinishChannelContent(Player player, long j) {
        this.owner = player;
        this.finishReason = j;
    }
}
