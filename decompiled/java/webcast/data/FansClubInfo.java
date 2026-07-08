package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FansClubInfo {

    @C09CT("anchor_fans_count")
    public long anchorFansCount;

    @C09CT("chat_group_info")
    public FansChatGroupInfo chatGroupInfo;

    @C09CT("name_editable_status")
    public int nameEditableStatus;

    @C09CT("name_review_status")
    public int nameReviewStatus;

    @C09CT("super_fan_permission_info")
    public SuperFanPermissionInfo superFanPermissionInfo;

    @C09CT("fans_club_name")
    public String fansClubName = "";

    @C09CT("fans_club_banner")
    public List<String> fansClubBanner = new ArrayList();
}
