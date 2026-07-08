package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SchoolGroupsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("conv_infos")
    public final List<CampusGroup> groups;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("has_new")
    public final Boolean hasNew;

    @C09CT("page_token")
    public final String nextPageToken;

    @C09CT("section_info")
    public final GroupSectionInfo sectionInfo;

    @C09CT("total")
    public final Integer total;

    public SchoolGroupsResponse() {
        this(null, null, null, null, "", false);
    }

    public final SchoolGroupsResponse copy(Integer num, Boolean bool, GroupSectionInfo groupSectionInfo, List<CampusGroup> list, String str, boolean z) {
        return new SchoolGroupsResponse(num, bool, groupSectionInfo, list, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolGroupsResponse)) {
            return false;
        }
        SchoolGroupsResponse schoolGroupsResponse = (SchoolGroupsResponse) obj;
        return Intrinsics.LJFF(this.total, schoolGroupsResponse.total) && Intrinsics.LJFF(this.hasNew, schoolGroupsResponse.hasNew) && Intrinsics.LJFF(this.sectionInfo, schoolGroupsResponse.sectionInfo) && Intrinsics.LJFF(this.groups, schoolGroupsResponse.groups) && Intrinsics.LJFF(this.nextPageToken, schoolGroupsResponse.nextPageToken) && this.hasMore == schoolGroupsResponse.hasMore;
    }

    public int hashCode() {
        Integer num = this.total;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.hasNew;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        GroupSectionInfo groupSectionInfo = this.sectionInfo;
        int iHashCode3 = (iHashCode2 + (groupSectionInfo == null ? 0 : groupSectionInfo.hashCode())) * 31;
        List<CampusGroup> list = this.groups;
        return ((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.nextPageToken.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolGroupsResponse(total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", hasNew=");
        sbLIZ.append(this.hasNew);
        sbLIZ.append(", sectionInfo=");
        sbLIZ.append(this.sectionInfo);
        sbLIZ.append(", groups=");
        sbLIZ.append(this.groups);
        sbLIZ.append(", nextPageToken=");
        sbLIZ.append(this.nextPageToken);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<CampusGroup> getGroups() {
        return this.groups;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Boolean getHasNew() {
        return this.hasNew;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public final GroupSectionInfo getSectionInfo() {
        return this.sectionInfo;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public SchoolGroupsResponse(Integer num, Boolean bool, GroupSectionInfo groupSectionInfo, List<CampusGroup> list, String str, boolean z) {
        this.total = num;
        this.hasNew = bool;
        this.sectionInfo = groupSectionInfo;
        this.groups = list;
        this.nextPageToken = str;
        this.hasMore = z;
    }
}
