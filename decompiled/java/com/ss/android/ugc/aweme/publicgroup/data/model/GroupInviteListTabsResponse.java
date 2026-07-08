package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GroupInviteListTabsResponse extends BaseResponse {

    @C09CT("available_invite_list_tabs")
    public final List<InvitationListTabInfo> availableInviteListTabs;

    public GroupInviteListTabsResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupInviteListTabsResponse) && Intrinsics.LJFF(this.availableInviteListTabs, ((GroupInviteListTabsResponse) obj).availableInviteListTabs);
    }

    public final int hashCode() {
        List<InvitationListTabInfo> list = this.availableInviteListTabs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupInviteListTabsResponse(availableInviteListTabs=");
        sbLIZ.append(this.availableInviteListTabs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupInviteListTabsResponse(List<InvitationListTabInfo> list) {
        this.availableInviteListTabs = list;
    }
}
