package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.EnumC1229960i70;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupPreviewDisplayMeta {

    @C09CT("check_results")
    public final List<GroupJoinCheckItemResult> checkResults;

    @C09CT("event_tracking")
    public final Map<String, String> eventTracking;

    @C09CT("group")
    public final GroupForPreview groupInfo;

    @C09CT("popup_display_meta")
    public final PopupDisplayMeta popupDisplayMeta;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int userGroupStatus;

    public GroupPreviewDisplayMeta() {
        this(null, 0, null, null, null, 31, null);
    }

    public final int hashCode() {
        int iHashCode = ((this.groupInfo.hashCode() * 31) + this.userGroupStatus) * 31;
        List<GroupJoinCheckItemResult> list = this.checkResults;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.eventTracking.hashCode()) * 31;
        PopupDisplayMeta popupDisplayMeta = this.popupDisplayMeta;
        return iHashCode2 + (popupDisplayMeta != null ? popupDisplayMeta.hashCode() : 0);
    }

    public GroupPreviewDisplayMeta(GroupForPreview groupForPreview, int i, List<GroupJoinCheckItemResult> list, Map<String, String> map, PopupDisplayMeta popupDisplayMeta) {
        this.groupInfo = groupForPreview;
        this.userGroupStatus = i;
        this.checkResults = list;
        this.eventTracking = map;
        this.popupDisplayMeta = popupDisplayMeta;
    }

    public GroupPreviewDisplayMeta(GroupForPreview groupForPreview, int i, List list, Map map, PopupDisplayMeta popupDisplayMeta, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new GroupForPreview(0L, null, null, 0, 0, null, 0L, null, false, null, null, 0, null, null, 0, 32767, null) : groupForPreview, (i2 & 2) != 0 ? EnumC1229960i70.UNKNOWN.getValue() : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? C2097608Jq.LJ() : map, (i2 & 16) != 0 ? null : popupDisplayMeta);
    }
}
