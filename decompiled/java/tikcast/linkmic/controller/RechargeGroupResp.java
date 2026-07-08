package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.LayoutData;

/* JADX INFO: loaded from: classes.dex */
public final class RechargeGroupResp {

    @C09CT("cohost_biz_resp")
    public byte[] cohostBizResp;

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("cross_room_layout")
    public LayoutData crossRoomLayout;

    @C09CT("group_user")
    public GroupChannelAllUser groupUser;

    @C09CT("group_ext_info")
    public List<RTCExtraInfo> groupExtInfo = new ArrayList();

    @C09CT("content_pos")
    public List<ContentPosition> contentPos = new ArrayList();
}
