package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class InvitationListSectionType {

    @C09CT("1")
    public static final InvitationListSectionType INVITATION_LIST_SECTION_TYPE_DEFAULT;

    @C09CT("2")
    public static final InvitationListSectionType INVITATION_LIST_SECTION_TYPE_HARDCORE_FAN;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final InvitationListSectionType INVITATION_LIST_SECTION_TYPE_UNKNOWN;
    public static final /* synthetic */ InvitationListSectionType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<InvitationListSectionType> getEntries() {
        return LLILLL;
    }

    static {
        InvitationListSectionType invitationListSectionType = new InvitationListSectionType("INVITATION_LIST_SECTION_TYPE_UNKNOWN", 0, "");
        INVITATION_LIST_SECTION_TYPE_UNKNOWN = invitationListSectionType;
        InvitationListSectionType invitationListSectionType2 = new InvitationListSectionType("INVITATION_LIST_SECTION_TYPE_DEFAULT", 1, "regular_fans");
        INVITATION_LIST_SECTION_TYPE_DEFAULT = invitationListSectionType2;
        InvitationListSectionType invitationListSectionType3 = new InvitationListSectionType("INVITATION_LIST_SECTION_TYPE_HARDCORE_FAN", 2, "hardcore_fans");
        INVITATION_LIST_SECTION_TYPE_HARDCORE_FAN = invitationListSectionType3;
        InvitationListSectionType[] invitationListSectionTypeArr = {invitationListSectionType, invitationListSectionType2, invitationListSectionType3};
        LLILLJJLI = invitationListSectionTypeArr;
        LLILLL = new C2254308sP(invitationListSectionTypeArr);
    }

    public static InvitationListSectionType[] values() {
        return (InvitationListSectionType[]) LLILLJJLI.clone();
    }

    public final String getMemberTypeForET() {
        return this.LL;
    }

    public static InvitationListSectionType valueOf(String str) {
        return (InvitationListSectionType) C08FF.LIZ(InvitationListSectionType.class, str);
    }

    public InvitationListSectionType(String str, int i, String str2) {
        this.LL = str2;
    }
}
