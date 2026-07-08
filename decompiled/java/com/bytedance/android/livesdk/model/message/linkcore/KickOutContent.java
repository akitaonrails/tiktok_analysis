package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class KickOutContent {

    @C09CT("kickout_reason")
    public int kickOutReason;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("offliner")
    public Player leftUser;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("offliner_linker_session_id")
    public String offlinerLinkerSessionId;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;

    public KickOutContent() {
        this(null, 0, new ArrayList(), new ArrayList(), null, new ArrayList(), null);
    }

    public KickOutContent(Player player, int i, List<String> list, List<PosIdentity> list2, LayoutState layoutState, List<SpotInfo> list3, String str) {
        this.leftUser = player;
        this.kickOutReason = i;
        this.linkedUserUiPositions = list;
        this.uiPos = list2;
        this.layout = layoutState;
        this.spotList = list3;
        this.offlinerLinkerSessionId = str;
    }
}
