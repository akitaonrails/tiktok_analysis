package tikcast.api.anchor.replay;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetRecordingsPageReq {

    @C09CT("anchor_user_id")
    public long anchorUserId;

    @C09CT("count")
    public int count;

    @C09CT("notification_bar_switch")
    public int notificationBarSwitch;

    @C09CT("offset")
    public long offset;

    @C09CT("tab_type")
    public int tabType;

    @C09CT("user_type")
    public int userType;

    @C09CT("notification_statuses")
    public List<NotificationBarStatus> notificationStatuses = new ArrayList();

    @C09CT("room_id")
    public String roomId = "";
}
