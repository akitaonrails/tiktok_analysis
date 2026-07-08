package com.ss.android.ugc.ur.school.educationsheet;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CampusEducationSheetStatusResponse extends BaseResponse implements Serializable {

    @C09CT("muf_count")
    public final Integer mufCount;

    @C09CT("should_show_popup")
    public final Boolean shouldShowPopup;

    @C09CT("user_list")
    public final List<MutualUser> userList;

    public CampusEducationSheetStatusResponse() {
        this(null, null, null);
    }

    public final CampusEducationSheetStatusResponse copy(Boolean bool, Integer num, List<MutualUser> list) {
        return new CampusEducationSheetStatusResponse(bool, num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampusEducationSheetStatusResponse)) {
            return false;
        }
        CampusEducationSheetStatusResponse campusEducationSheetStatusResponse = (CampusEducationSheetStatusResponse) obj;
        return Intrinsics.LJFF(this.shouldShowPopup, campusEducationSheetStatusResponse.shouldShowPopup) && Intrinsics.LJFF(this.mufCount, campusEducationSheetStatusResponse.mufCount) && Intrinsics.LJFF(this.userList, campusEducationSheetStatusResponse.userList);
    }

    public int hashCode() {
        Boolean bool = this.shouldShowPopup;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.mufCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<MutualUser> list = this.userList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampusEducationSheetStatusResponse(shouldShowPopup=");
        sbLIZ.append(this.shouldShowPopup);
        sbLIZ.append(", mufCount=");
        sbLIZ.append(this.mufCount);
        sbLIZ.append(", userList=");
        sbLIZ.append(this.userList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getMufCount() {
        return this.mufCount;
    }

    public final Boolean getShouldShowPopup() {
        return this.shouldShowPopup;
    }

    public final List<MutualUser> getUserList() {
        return this.userList;
    }

    public CampusEducationSheetStatusResponse(Boolean bool, Integer num, List<MutualUser> list) {
        this.shouldShowPopup = bool;
        this.mufCount = num;
        this.userList = list;
    }
}
