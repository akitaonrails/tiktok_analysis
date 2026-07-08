package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import webcast.data.cohost_biz.BizRechargeResponse;

/* JADX INFO: loaded from: classes.dex */
public final class RechargeResp {

    @C09CT("cohost_resp_extra")
    public BizRechargeResponse cohostRespExtra;

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("dsl")
    public DSLConfig dsl;

    @C09CT("group_user")
    public GroupChannelAllUser groupUser;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("list")
    public AllListUser list;

    @C09CT("my_info")
    public RTCExtraInfo myInfo;

    @C09CT("target_pos")
    public MicPositionData targetPos;

    @C09CT("my_linkmic_id")
    public String myLinkmicId = "";

    @C09CT("target_linkmic_id")
    public String targetLinkmicId = "";

    @C09CT("group_ext_info")
    public List<RTCExtraInfo> groupExtInfo = new ArrayList();

    @C09CT("content_pos")
    public List<ContentPosition> contentPos = new ArrayList();

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos = new ArrayList();

    @C09CT("spot_list")
    public List<SpotInfo> spotList = new ArrayList();
}
