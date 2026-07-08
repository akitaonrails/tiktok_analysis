package com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaLiveGetByIdRequestBody {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("billboard_id_list")
    public final List<String> billboardIdList;

    @C09CT("billboard_type")
    public final Integer billboardType;

    public SeaLiveGetByIdRequestBody() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaLiveGetByIdRequestBody)) {
            return false;
        }
        SeaLiveGetByIdRequestBody seaLiveGetByIdRequestBody = (SeaLiveGetByIdRequestBody) obj;
        return Intrinsics.LJFF(this.authorId, seaLiveGetByIdRequestBody.authorId) && Intrinsics.LJFF(this.billboardIdList, seaLiveGetByIdRequestBody.billboardIdList) && Intrinsics.LJFF(this.billboardType, seaLiveGetByIdRequestBody.billboardType);
    }

    public final int hashCode() {
        String str = this.authorId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.billboardIdList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.billboardType;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveGetByIdRequestBody(authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", billboardIdList=");
        sbLIZ.append(this.billboardIdList);
        sbLIZ.append(", billboardType=");
        sbLIZ.append(this.billboardType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaLiveGetByIdRequestBody(String str, List<String> list, Integer num) {
        this.authorId = str;
        this.billboardIdList = list;
        this.billboardType = num;
    }
}
