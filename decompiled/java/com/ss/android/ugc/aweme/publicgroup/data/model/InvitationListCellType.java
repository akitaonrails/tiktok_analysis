package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class InvitationListCellType {

    @C09CT("1")
    public static final InvitationListCellType INVITATION_LIST_CELL_TYPE_SECTION_NAME;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final InvitationListCellType INVITATION_LIST_CELL_TYPE_UNKNOWN;

    @C09CT("2")
    public static final InvitationListCellType INVITATION_LIST_CELL_TYPE_USER;
    public static final /* synthetic */ InvitationListCellType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<InvitationListCellType> getEntries() {
        return LLILLJJLI;
    }

    static {
        InvitationListCellType invitationListCellType = new InvitationListCellType("INVITATION_LIST_CELL_TYPE_UNKNOWN", 0);
        INVITATION_LIST_CELL_TYPE_UNKNOWN = invitationListCellType;
        InvitationListCellType invitationListCellType2 = new InvitationListCellType("INVITATION_LIST_CELL_TYPE_SECTION_NAME", 1);
        INVITATION_LIST_CELL_TYPE_SECTION_NAME = invitationListCellType2;
        InvitationListCellType invitationListCellType3 = new InvitationListCellType("INVITATION_LIST_CELL_TYPE_USER", 2);
        INVITATION_LIST_CELL_TYPE_USER = invitationListCellType3;
        InvitationListCellType[] invitationListCellTypeArr = {invitationListCellType, invitationListCellType2, invitationListCellType3};
        LL = invitationListCellTypeArr;
        LLILLJJLI = new C2254308sP(invitationListCellTypeArr);
    }

    public static InvitationListCellType[] values() {
        return (InvitationListCellType[]) LL.clone();
    }

    public static InvitationListCellType valueOf(String str) {
        return (InvitationListCellType) C08FF.LIZ(InvitationListCellType.class, str);
    }

    public InvitationListCellType(String str, int i) {
    }
}
