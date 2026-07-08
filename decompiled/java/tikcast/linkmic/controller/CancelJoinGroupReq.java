package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class CancelJoinGroupReq {

    @C09CT("common")
    public LinkCommon common;

    @C09CT("extend_extra")
    public String extendExtra;

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("myself")
    public GroupPlayer myself;

    @C09CT("target")
    public GroupPlayer target;

    @C09CT("type")
    public int type;
}
