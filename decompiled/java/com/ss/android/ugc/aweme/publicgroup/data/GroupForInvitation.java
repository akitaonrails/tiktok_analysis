package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.EnumC1229300i5w;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupForInvitation {

    @C09CT("audit_question")
    public final String auditQuestion;

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("conv_short_id")
    public final long convShortId;

    @C09CT("effective_config")
    public final List<GroupAccessCriteria> effectiveConfig;

    @C09CT("group_desc")
    public final String groupDesc;

    @C09CT("group_member_limit")
    public final int groupMemberLimit;

    @C09CT("group_name")
    public final String groupName;

    @C09CT("group_owner_id")
    public final long groupOwnerId;

    @C09CT("group_owner_name")
    public final String groupOwnerName;

    @C09CT("group_size")
    public final int groupSize;

    @C09CT("audit_switch")
    public final boolean needApproval;

    public GroupForInvitation() {
        this(0L, null, null, 0, 0, null, 0L, null, false, null, null, 2047, null);
    }

    public GroupForInvitation(long j, String str, String str2, int i, int i2, String str3, long j2, String str4, boolean z, String str5, List<GroupAccessCriteria> list) {
        this.convShortId = j;
        this.groupName = str;
        this.avatarUrl = str2;
        this.groupSize = i;
        this.groupMemberLimit = i2;
        this.groupDesc = str3;
        this.groupOwnerId = j2;
        this.groupOwnerName = str4;
        this.needApproval = z;
        this.auditQuestion = str5;
        this.effectiveConfig = list;
    }

    public GroupForInvitation(long j, String str, String str2, int i, int i2, String str3, long j2, String str4, boolean z, String str5, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) == 0 ? j2 : 0L, (i3 & 128) != 0 ? "" : str4, (i3 & 256) == 0 ? z : false, (i3 & 512) == 0 ? str5 : "", (i3 & 1024) != 0 ? Collections.singletonList(new GroupAccessCriteria(EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN.getValue(), "", "")) : list);
    }
}
