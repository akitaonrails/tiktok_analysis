package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicCancelGroupInviteCheckStrategy {
    public static final TypeAdapter ADAPTER = new LinkMicCancelGroupInviteCheckStrategy_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_group_channel_id_check")
    public boolean enableGroupChannelIdCheck;

    @C09CT("enable_target_user_state_check")
    public boolean enableTargetUserStateCheck;
}
