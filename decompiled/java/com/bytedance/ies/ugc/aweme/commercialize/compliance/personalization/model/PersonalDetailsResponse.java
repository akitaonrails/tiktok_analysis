package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.model;

import X.C09CT;
import X.C2188811AlT;
import X.C746070TOj;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.Gender;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PersonalDetailsResponse extends BaseResponse implements Serializable {

    @C09CT("ad_traffic_type")
    public final Integer adTrafficType;

    @C09CT("gender")
    public final Gender gender;
    public static final C746070TOj Companion = new Object() { // from class: X.0TOj
    };
    public static final int $stable = 8;

    public PersonalDetailsResponse() {
        this(null, null);
    }

    public final PersonalDetailsResponse copy(Gender gender, Integer num) {
        return new PersonalDetailsResponse(gender, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalDetailsResponse)) {
            return false;
        }
        PersonalDetailsResponse personalDetailsResponse = (PersonalDetailsResponse) obj;
        return Intrinsics.LJFF(this.gender, personalDetailsResponse.gender) && Intrinsics.LJFF(this.adTrafficType, personalDetailsResponse.adTrafficType);
    }

    public int hashCode() {
        Gender gender = this.gender;
        int iHashCode = (gender == null ? 0 : gender.hashCode()) * 31;
        Integer num = this.adTrafficType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PersonalDetailsResponse(gender=");
        sbLIZ.append(this.gender);
        sbLIZ.append(", adTrafficType=");
        sbLIZ.append(this.adTrafficType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getAdTrafficType() {
        return this.adTrafficType;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public PersonalDetailsResponse(Gender gender, Integer num) {
        this.gender = gender;
        this.adTrafficType = num;
    }
}
