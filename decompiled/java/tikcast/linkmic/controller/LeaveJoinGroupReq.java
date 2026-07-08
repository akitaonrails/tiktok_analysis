package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import tikcast.linkmic.common.GroupPlayer;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveJoinGroupReq {

    @C09CT("cohost_req_extra")
    public BizLeaveJoinGroupParams cohostReqExtra;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("cur_group_channel_id")
    public long curGroupChannelId;

    @C09CT("extend_extra")
    public String extendExtra;

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("leaver")
    public GroupPlayer leaver;

    @C09CT("myself")
    public GroupPlayer myself;
}
