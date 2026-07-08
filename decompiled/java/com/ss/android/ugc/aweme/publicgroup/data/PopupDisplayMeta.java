package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.EnumC1229960i70;
import X.EnumC992570bw7;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class PopupDisplayMeta {

    @C09CT("check_results")
    public final List<GroupJoinCheckItemResult> checkResults;

    @C09CT("event_tracking")
    public final Map<String, String> eventTracking;

    @C09CT("group")
    public final GroupForInvitation groupInfo;

    @C09CT("invitation")
    public final GroupInvitation groupInvitation;

    @C09CT("preview_entry")
    public final PreviewEntryMeta previewEntry;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int userGroupStatus;

    public PopupDisplayMeta() {
        this(null, 0, null, null, null, null, 63, null);
    }

    public PopupDisplayMeta(GroupForInvitation groupForInvitation, int i, List<GroupJoinCheckItemResult> list, GroupInvitation groupInvitation, Map<String, String> map, PreviewEntryMeta previewEntryMeta) {
        this.groupInfo = groupForInvitation;
        this.userGroupStatus = i;
        this.checkResults = list;
        this.groupInvitation = groupInvitation;
        this.eventTracking = map;
        this.previewEntry = previewEntryMeta;
    }

    public PopupDisplayMeta(GroupForInvitation groupForInvitation, int i, List list, GroupInvitation groupInvitation, Map map, PreviewEntryMeta previewEntryMeta, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new GroupForInvitation(0L, null, null, 0, 0, null, 0L, null, false, null, null, 2047, null) : groupForInvitation, (i2 & 2) != 0 ? EnumC1229960i70.UNKNOWN.getValue() : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? new GroupInvitation("", EnumC992570bw7.GROUP_INVITE_CHANNEL_DEFAULT.getValue(), 0L, 0, "") : groupInvitation, (i2 & 16) != 0 ? C2097608Jq.LJ() : map, (i2 & 32) != 0 ? null : previewEntryMeta);
    }
}
