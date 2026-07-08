package webcast.im;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common.MigrationDetails;

/* JADX INFO: loaded from: classes.dex */
public final class PermitJoinGroupContent {

    @C09CT("agree_status")
    public int agreeStatus;

    @C09CT("approver")
    public GroupPlayer approver;

    @C09CT("cross_room_layout")
    public LayoutData crossRoomLayout;

    @C09CT("group_user")
    public GroupChannelAllUser groupUser;

    @C09CT("migration_details")
    public MigrationDetails migrationDetails;

    @C09CT("permit_group_type")
    public int permitGroupType;

    @C09CT("type")
    public int type;

    @C09CT("group_ext_info")
    public List<RTCExtraInfo> groupExtInfo = new ArrayList();

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions = new ArrayList();
}
