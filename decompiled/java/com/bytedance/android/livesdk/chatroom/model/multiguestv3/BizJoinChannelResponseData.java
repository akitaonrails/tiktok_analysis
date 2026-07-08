package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BizJoinChannelResponseData {

    @C09CT("anchor_new_fix_mic_num")
    public int fixMicNumAction;

    @C09CT("anchor_new_layout")
    public int layoutTypeAction;

    public BizJoinChannelResponseData() {
        this(0, 0);
    }

    public BizJoinChannelResponseData(int i, int i2) {
        this.layoutTypeAction = i;
        this.fixMicNumAction = i2;
    }
}
