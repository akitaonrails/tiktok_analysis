package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class InvitationListCell {

    @C09CT("cell_type")
    public final InvitationListCellType cellType;

    @C09CT("invitee")
    public final InvitationUserInfo invitee;

    @C09CT("section_name")
    public final String sectionName;

    public InvitationListCell() {
        this(InvitationListCellType.INVITATION_LIST_CELL_TYPE_UNKNOWN, "", null);
    }

    public final int hashCode() {
        InvitationListCellType invitationListCellType = this.cellType;
        int iHashCode = (invitationListCellType == null ? 0 : invitationListCellType.hashCode()) * 31;
        String str = this.sectionName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InvitationUserInfo invitationUserInfo = this.invitee;
        return iHashCode2 + (invitationUserInfo != null ? invitationUserInfo.hashCode() : 0);
    }

    public InvitationListCell(InvitationListCellType invitationListCellType, String str, InvitationUserInfo invitationUserInfo) {
        this.cellType = invitationListCellType;
        this.sectionName = str;
        this.invitee = invitationUserInfo;
    }
}
