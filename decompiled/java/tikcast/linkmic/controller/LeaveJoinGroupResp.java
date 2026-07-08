package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import webcast.data.cohost_biz.BizLeaveJoinGroupResponse;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveJoinGroupResp {

    @C09CT("cohost_biz_resp")
    public BizLeaveJoinGroupResponse cohostBizResp;

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;
}
