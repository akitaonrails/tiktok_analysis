package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class InvitationListTabInfo {

    @C09CT("data_source")
    public final int dataSource;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("event_track")
    public final Map<String, String> eventTrack;

    @C09CT("invitation_list_type")
    public final int invitationListType;

    public InvitationListTabInfo() {
        this(-1, null, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvitationListTabInfo)) {
            return false;
        }
        InvitationListTabInfo invitationListTabInfo = (InvitationListTabInfo) obj;
        return this.invitationListType == invitationListTabInfo.invitationListType && Intrinsics.LJFF(this.displayName, invitationListTabInfo.displayName) && this.dataSource == invitationListTabInfo.dataSource && Intrinsics.LJFF(this.eventTrack, invitationListTabInfo.eventTrack);
    }

    public final int hashCode() {
        int i = this.invitationListType * 31;
        String str = this.displayName;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.dataSource) * 31;
        Map<String, String> map = this.eventTrack;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InvitationListTabInfo(invitationListType=");
        sbLIZ.append(this.invitationListType);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(", dataSource=");
        sbLIZ.append(this.dataSource);
        sbLIZ.append(", eventTrack=");
        sbLIZ.append(this.eventTrack);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InvitationListTabInfo(int i, String str, int i2, Map<String, String> map) {
        this.invitationListType = i;
        this.displayName = str;
        this.dataSource = i2;
        this.eventTrack = map;
    }
}
