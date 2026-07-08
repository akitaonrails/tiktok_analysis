package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class GroupInviteListRequest {

    @C09CT("access_criteria")
    public final List<GroupAccessCriteria> accessCriteria;

    @C09CT("biz_ext")
    public final Map<String, String> bizExt;

    @C09CT("conversation_short_id")
    public final Long conversationShortId;

    @C09CT("count")
    public final Integer count;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("filter_by_access_criteria")
    public final Boolean filterByAccessCriteria;

    @C09CT("invitation_list_type")
    public final Integer listType;

    @C09CT("showed_cells")
    public final List<InvitationListCell> showedCells;

    public static GroupInviteListRequest LIZ(GroupInviteListRequest groupInviteListRequest, Integer num, List list, int i) {
        Integer num2;
        Integer num3;
        Long l;
        Map<String, String> map;
        List<GroupAccessCriteria> list2;
        List list3 = list;
        Integer num4 = num;
        if ((i & 1) != 0) {
            num4 = groupInviteListRequest.cursor;
        }
        Boolean bool = null;
        if ((i & 2) != 0) {
            num2 = groupInviteListRequest.count;
        } else {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = groupInviteListRequest.listType;
        } else {
            num3 = null;
        }
        if ((i & 8) != 0) {
            l = groupInviteListRequest.conversationShortId;
        } else {
            l = null;
        }
        if ((i & 16) != 0) {
            map = groupInviteListRequest.bizExt;
        } else {
            map = null;
        }
        if ((i & 32) != 0) {
            list2 = groupInviteListRequest.accessCriteria;
        } else {
            list2 = null;
        }
        if ((i & 64) != 0) {
            bool = groupInviteListRequest.filterByAccessCriteria;
        }
        if ((i & 128) != 0) {
            list3 = groupInviteListRequest.showedCells;
        }
        groupInviteListRequest.getClass();
        return new GroupInviteListRequest(num4, num2, num3, l, map, list2, bool, list3);
    }

    public GroupInviteListRequest(Integer num, Integer num2, Integer num3, Long l, Map<String, String> map, List<GroupAccessCriteria> list, Boolean bool, List<InvitationListCell> list2) {
        this.cursor = num;
        this.count = num2;
        this.listType = num3;
        this.conversationShortId = l;
        this.bizExt = map;
        this.accessCriteria = list;
        this.filterByAccessCriteria = bool;
        this.showedCells = list2;
    }

    public GroupInviteListRequest(Integer num, Integer num2, Integer num3, Long l, Map map, List list, Boolean bool, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? 50 : num2, (i & 4) != 0 ? 0 : num3, (i & 8) != 0 ? 0L : l, (i & 16) != 0 ? C2097608Jq.LJ() : map, (i & 32) != 0 ? C13BV.INSTANCE : list, (i & 64) != 0 ? Boolean.FALSE : bool, (i & 128) != 0 ? C13BV.INSTANCE : list2);
    }
}
