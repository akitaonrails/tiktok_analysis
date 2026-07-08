package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiHostPreJoinChannelConf {
    public static final TypeAdapter ADAPTER = new MultiHostPreJoinChannelConf_OptTypeAdapter(NormalGson.singleton());

    @C09CT("receive_invite_enable")
    public boolean receiveInviteEnable;

    @C09CT("send_apply_enable")
    public boolean sendApplyEnable;

    @C09CT("send_invite_enable")
    public boolean sendInviteEnable;

    public MultiHostPreJoinChannelConf() {
        this(false, false, false);
    }

    public MultiHostPreJoinChannelConf(boolean z, boolean z2, boolean z3) {
        this.sendInviteEnable = z;
        this.receiveInviteEnable = z2;
        this.sendApplyEnable = z3;
    }
}
