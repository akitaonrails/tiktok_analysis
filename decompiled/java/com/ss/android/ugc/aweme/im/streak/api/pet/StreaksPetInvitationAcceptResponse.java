package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreaksPetInvitationAcceptResponse extends BaseStreakResponse {

    @C09CT("invitation_card_state")
    public final Integer invitationCardState;

    @C09CT("invitation_source")
    public final Integer invitationSource;

    @C09CT("pet_fe_user_data")
    public final String petFeUserData;

    public StreaksPetInvitationAcceptResponse() {
        this(null, null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreaksPetInvitationAcceptResponse)) {
            return false;
        }
        StreaksPetInvitationAcceptResponse streaksPetInvitationAcceptResponse = (StreaksPetInvitationAcceptResponse) obj;
        return Intrinsics.LJFF(this.invitationCardState, streaksPetInvitationAcceptResponse.invitationCardState) && Intrinsics.LJFF(this.invitationSource, streaksPetInvitationAcceptResponse.invitationSource) && Intrinsics.LJFF(this.petFeUserData, streaksPetInvitationAcceptResponse.petFeUserData);
    }

    public final int hashCode() {
        Integer num = this.invitationCardState;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.invitationSource;
        return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.petFeUserData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreaksPetInvitationAcceptResponse(invitationCardState=");
        sbLIZ.append(this.invitationCardState);
        sbLIZ.append(", invitationSource=");
        sbLIZ.append(this.invitationSource);
        sbLIZ.append(", petFeUserData=");
        sbLIZ.append(this.petFeUserData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreaksPetInvitationAcceptResponse(Integer num, Integer num2, String str) {
        super(null, null, null);
        this.invitationCardState = num;
        this.invitationSource = num2;
        this.petFeUserData = str;
    }
}
