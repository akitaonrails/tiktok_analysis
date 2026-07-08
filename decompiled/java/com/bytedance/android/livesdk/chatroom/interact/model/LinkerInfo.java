package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import X.C13BV;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LinkerInfo {

    @C09CT("in_quick_pairing")
    public boolean inQuickPairing;

    @C09CT("linked_guest_users")
    public List<UserInfo> linkedGuestUsers;

    @C09CT("linked_users")
    public List<UserInfo> linkedUsers;

    public LinkerInfo() {
        this(null, false, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkerInfo)) {
            return false;
        }
        LinkerInfo linkerInfo = (LinkerInfo) obj;
        return Intrinsics.LJFF(this.linkedUsers, linkerInfo.linkedUsers) && this.inQuickPairing == linkerInfo.inQuickPairing && Intrinsics.LJFF(this.linkedGuestUsers, linkerInfo.linkedGuestUsers);
    }

    public LinkerInfo(List<UserInfo> list, boolean z, List<UserInfo> list2) {
        this.linkedUsers = list;
        this.inQuickPairing = z;
        this.linkedGuestUsers = list2;
    }

    public LinkerInfo(List list, boolean z, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
