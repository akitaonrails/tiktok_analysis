package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.ContentPositionMessage;
import tikcast.linkmic.common.GroupPlayer;
import webcast.data.cohost_biz.BizJoinGroupParams;

/* JADX INFO: loaded from: classes.dex */
public final class JoinGroupReq {

    @C09CT("cohost_req_extra")
    public BizJoinGroupParams cohostReqExtra;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("content_position_message")
    public List<ContentPositionMessage> contentPositionMessage = new ArrayList();

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
