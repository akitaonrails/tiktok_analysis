package com.ss.android.ugc.aweme.following.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class RelationSearchResponse extends BaseResponse {

    @C09CT("alias_permissions")
    public final List<AliasPermissionUserData> aliasPermissions;

    @C09CT("match_by")
    public final List<Integer> matchBy;

    @C09CT("mention_block_types")
    public final List<Long> mentionBlockTypes;

    @C09CT("search_users")
    public final List<User> searchUser;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationSearchResponse)) {
            return false;
        }
        RelationSearchResponse relationSearchResponse = (RelationSearchResponse) obj;
        return Intrinsics.LJFF(this.searchUser, relationSearchResponse.searchUser) && Intrinsics.LJFF(this.matchBy, relationSearchResponse.matchBy) && Intrinsics.LJFF(this.aliasPermissions, relationSearchResponse.aliasPermissions) && Intrinsics.LJFF(this.mentionBlockTypes, relationSearchResponse.mentionBlockTypes);
    }

    public final int hashCode() {
        List<User> list = this.searchUser;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.matchBy;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AliasPermissionUserData> list3 = this.aliasPermissions;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Long> list4 = this.mentionBlockTypes;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationSearchResponse(searchUser=");
        sbLIZ.append(this.searchUser);
        sbLIZ.append(", matchBy=");
        sbLIZ.append(this.matchBy);
        sbLIZ.append(", aliasPermissions=");
        sbLIZ.append(this.aliasPermissions);
        sbLIZ.append(", mentionBlockTypes=");
        sbLIZ.append(this.mentionBlockTypes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelationSearchResponse(List<? extends User> list, List<Integer> list2, List<AliasPermissionUserData> list3, List<Long> list4) {
        this.searchUser = list;
        this.matchBy = list2;
        this.aliasPermissions = list3;
        this.mentionBlockTypes = list4;
    }

    public RelationSearchResponse(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i & 8) != 0 ? C13BV.INSTANCE : list4);
    }
}
