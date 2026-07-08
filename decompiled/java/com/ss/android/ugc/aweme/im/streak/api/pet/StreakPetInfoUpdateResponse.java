package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetInfoUpdateResponse extends BaseStreakResponse {

    @C09CT("pet_fe_user_data")
    public final String petFeUserData;

    @C09CT("scene_response_body")
    public final String sceneResponseBody;

    public StreakPetInfoUpdateResponse() {
        this(null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakPetInfoUpdateResponse)) {
            return false;
        }
        StreakPetInfoUpdateResponse streakPetInfoUpdateResponse = (StreakPetInfoUpdateResponse) obj;
        return Intrinsics.LJFF(this.sceneResponseBody, streakPetInfoUpdateResponse.sceneResponseBody) && Intrinsics.LJFF(this.petFeUserData, streakPetInfoUpdateResponse.petFeUserData);
    }

    public final int hashCode() {
        String str = this.sceneResponseBody;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.petFeUserData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetInfoUpdateResponse(sceneResponseBody=");
        sbLIZ.append(this.sceneResponseBody);
        sbLIZ.append(", petFeUserData=");
        sbLIZ.append(this.petFeUserData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakPetInfoUpdateResponse(String str, String str2) {
        super(null, null, null);
        this.sceneResponseBody = str;
        this.petFeUserData = str2;
    }
}
