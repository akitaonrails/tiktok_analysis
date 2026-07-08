package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MutualStruct implements Serializable {

    @C09CT("mutual_tag_is_hidden")
    public int isMutualTagHidden;

    @C09CT("mutual_type")
    public int mutualType;

    @C09CT("total")
    public int total;

    @C09CT("user_list")
    public List<MutualUser> userList;

    public MutualStruct() {
        this(0, 0, null, 0);
    }

    public final MutualStruct copy(int i, int i2, List<MutualUser> list, int i3) {
        return new MutualStruct(i, i2, list, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutualStruct)) {
            return false;
        }
        MutualStruct mutualStruct = (MutualStruct) obj;
        return this.mutualType == mutualStruct.mutualType && this.total == mutualStruct.total && Intrinsics.LJFF(this.userList, mutualStruct.userList) && this.isMutualTagHidden == mutualStruct.isMutualTagHidden;
    }

    public int hashCode() {
        int i = ((this.mutualType * 31) + this.total) * 31;
        List<MutualUser> list = this.userList;
        return ((i + (list == null ? 0 : list.hashCode())) * 31) + this.isMutualTagHidden;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutualStruct(mutualType=");
        sbLIZ.append(this.mutualType);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", userList=");
        sbLIZ.append(this.userList);
        sbLIZ.append(", isMutualTagHidden=");
        sbLIZ.append(this.isMutualTagHidden);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int isMutualTagHidden() {
        return this.isMutualTagHidden;
    }

    public MutualStruct(int i, int i2, List<MutualUser> list, int i3) {
        this.mutualType = i;
        this.total = i2;
        this.userList = list;
        this.isMutualTagHidden = i3;
    }
}
