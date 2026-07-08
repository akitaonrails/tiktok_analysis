package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreaksInfoResponse extends BaseStreakResponse {

    @C09CT("experiment_flags")
    public final Map<String, String> experimentFlag;

    @C09CT("streak_extension")
    public final StreakExtension extension;

    @C09CT("pet_fe_user_data")
    public final String petFeUserData;

    @C09CT("should_update")
    public final boolean shouldUpdate;

    public StreaksInfoResponse() {
        this(false, "", C2097608Jq.LJ(), new StreakExtension(false, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreaksInfoResponse)) {
            return false;
        }
        StreaksInfoResponse streaksInfoResponse = (StreaksInfoResponse) obj;
        return this.shouldUpdate == streaksInfoResponse.shouldUpdate && Intrinsics.LJFF(this.petFeUserData, streaksInfoResponse.petFeUserData) && Intrinsics.LJFF(this.experimentFlag, streaksInfoResponse.experimentFlag) && Intrinsics.LJFF(this.extension, streaksInfoResponse.extension);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.shouldUpdate) * 31) + this.petFeUserData.hashCode()) * 31;
        Map<String, String> map = this.experimentFlag;
        return ((iZ2 + (map == null ? 0 : map.hashCode())) * 31) + this.extension.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreaksInfoResponse(shouldUpdate=");
        sbLIZ.append(this.shouldUpdate);
        sbLIZ.append(", petFeUserData=");
        sbLIZ.append(this.petFeUserData);
        sbLIZ.append(", experimentFlag=");
        sbLIZ.append(this.experimentFlag);
        sbLIZ.append(", extension=");
        sbLIZ.append(this.extension);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreaksInfoResponse(boolean z, String str, Map<String, String> map, StreakExtension streakExtension) {
        super(null, null, null);
        this.shouldUpdate = z;
        this.petFeUserData = str;
        this.experimentFlag = map;
        this.extension = streakExtension;
    }
}
