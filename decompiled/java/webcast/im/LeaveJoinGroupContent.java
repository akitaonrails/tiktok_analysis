package webcast.im;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveJoinGroupContent {

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("leave_source")
    public String leaveSource = "";

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions = new ArrayList();

    @C09CT("operator")
    public GroupPlayer operator;
}
