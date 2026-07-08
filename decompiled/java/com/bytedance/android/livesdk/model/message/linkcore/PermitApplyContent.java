package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PermitApplyContent {

    @C09CT("applier")
    public Player applier;

    @C09CT("applier_link_mic_id")
    public String applierLinkMicId;

    @C09CT("applier_linker_session_id")
    public String applierLinkerSessionId;

    @C09CT("applier_rtc_token")
    public String applierRtcToken;

    @C09CT("permiter")
    public Player approver;

    @C09CT("permiter_link_mic_id")
    public String approverLinkMicId;

    @C09CT("dsl")
    public DSLConfig dsl;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("operator")
    public Player operator;

    @C09CT("applier_pos")
    public MicPositionData positionData;

    @C09CT("reply_status")
    public int replyStatus;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;

    public PermitApplyContent() {
        this(null, null, null, 0, null, null, null, "", new ArrayList(), "", new ArrayList(), null, new ArrayList(), "");
    }

    public PermitApplyContent(Player player, MicPositionData micPositionData, String str, int i, DSLConfig dSLConfig, Player player2, Player player3, String str2, List<String> list, String str3, List<PosIdentity> list2, LayoutState layoutState, List<SpotInfo> list3, String str4) {
        this.approver = player;
        this.positionData = micPositionData;
        this.approverLinkMicId = str;
        this.replyStatus = i;
        this.dsl = dSLConfig;
        this.applier = player2;
        this.operator = player3;
        this.applierLinkMicId = str2;
        this.linkedUserUiPositions = list;
        this.applierRtcToken = str3;
        this.uiPos = list2;
        this.layout = layoutState;
        this.spotList = list3;
        this.applierLinkerSessionId = str4;
    }
}
