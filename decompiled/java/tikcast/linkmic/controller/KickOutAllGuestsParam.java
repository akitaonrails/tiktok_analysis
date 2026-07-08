package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class KickOutAllGuestsParam {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("extend_extra")
    public String extendExtra;

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("myself")
    public Player myself;

    @C09CT("reason")
    public long reason;
}
