package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class SyncStatusReq {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("effect_gles_version")
    public String effectGlesVersion = "";

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("myself")
    public Player myself;
}
