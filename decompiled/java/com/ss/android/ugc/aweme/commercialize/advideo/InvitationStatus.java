package com.ss.android.ugc.aweme.commercialize.advideo;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class InvitationStatus {

    @C09CT("1")
    public static final InvitationStatus INVITATION_STATUS_ACCEPT;

    @C09CT("2")
    public static final InvitationStatus INVITATION_STATUS_DENY;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final InvitationStatus INVITATION_STATUS_PENDING;
    public static final /* synthetic */ InvitationStatus[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<InvitationStatus> getEntries() {
        return LLILLL;
    }

    static {
        InvitationStatus invitationStatus = new InvitationStatus("INVITATION_STATUS_PENDING", 0, 0);
        INVITATION_STATUS_PENDING = invitationStatus;
        InvitationStatus invitationStatus2 = new InvitationStatus("INVITATION_STATUS_ACCEPT", 1, 1);
        INVITATION_STATUS_ACCEPT = invitationStatus2;
        InvitationStatus invitationStatus3 = new InvitationStatus("INVITATION_STATUS_DENY", 2, 2);
        INVITATION_STATUS_DENY = invitationStatus3;
        InvitationStatus[] invitationStatusArr = {invitationStatus, invitationStatus2, invitationStatus3};
        LLILLJJLI = invitationStatusArr;
        LLILLL = new C2254308sP(invitationStatusArr);
    }

    public static InvitationStatus[] values() {
        return (InvitationStatus[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static InvitationStatus valueOf(String str) {
        return (InvitationStatus) C08FF.LIZ(InvitationStatus.class, str);
    }

    public InvitationStatus(String str, int i, int i2) {
        this.LL = i2;
    }
}
