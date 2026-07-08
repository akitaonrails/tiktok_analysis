package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.LayoutData;
import webcast.data.cohost_biz.BizMigrateGroupResponse;

/* JADX INFO: loaded from: classes.dex */
public final class MigrateGroupResp {

    @C09CT("cohost_resp_extra")
    public BizMigrateGroupResponse cohostRespExtra;

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("cross_room_layout")
    public LayoutData crossRoomLayout;

    @C09CT("group_rtc_info")
    public List<RTCExtraInfo> groupRtcInfo = new ArrayList();

    @C09CT("group_user")
    public GroupChannelAllUser groupUser;
}
