package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import webcast.data.multilive_biz.BizResumeResponse;

/* JADX INFO: loaded from: classes.dex */
public final class ResumeResp {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("content_pos")
    public List<ContentPosition> contentPos;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("linked_user_info")
    public List<LinkedUserInfo> linkedUserInfo;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("list")
    public AllListUser list;

    @C09CT("multi_guest_resp_extra")
    public BizResumeResponse multiGuestRespExtra;

    @C09CT("reject_enlarge_linkmic_id_list")
    public List<String> rejectEnlargeLinkmicIdList;

    @C09CT("self_link_mic_id")
    public String selfLinkMicId = "";

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;
}
