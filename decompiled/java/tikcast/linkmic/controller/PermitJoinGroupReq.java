package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.ContentPositionMessage;
import tikcast.linkmic.common.GroupPlayer;
import webcast.data.cohost_biz.BizPermitJoinGroupParams;

/* JADX INFO: loaded from: classes.dex */
public final class PermitJoinGroupReq {

    @C09CT("cohost_req_extra")
    public BizPermitJoinGroupParams cohostReqExtra;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("content_position_message")
    public List<ContentPositionMessage> contentPositionMessage = new ArrayList();

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("join_user")
    public GroupPlayer joinUser;

    @C09CT("myself")
    public GroupPlayer myself;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;
}
