package com.ss.android.ugc.tiktok.addyours.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AddYoursInvitablesResp extends BaseResponse {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("invitables")
    public final List<User> invitables;

    public AddYoursInvitablesResp() {
        this(0L, false, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursInvitablesResp)) {
            return false;
        }
        AddYoursInvitablesResp addYoursInvitablesResp = (AddYoursInvitablesResp) obj;
        return this.cursor == addYoursInvitablesResp.cursor && this.hasMore == addYoursInvitablesResp.hasMore && Intrinsics.LJFF(this.invitables, addYoursInvitablesResp.invitables);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.cursor) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.invitables.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursInvitablesResp(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", invitables=");
        sbLIZ.append(this.invitables);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursInvitablesResp(long j, boolean z, List<? extends User> list) {
        this.cursor = j;
        this.hasMore = z;
        this.invitables = list;
    }

    public AddYoursInvitablesResp(long j, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
