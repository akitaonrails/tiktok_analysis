package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendMentionRequest {

    @C09CT("insert_uid_list")
    public final List<Long> insertUidList;

    @C09CT("my_cameo")
    public final Boolean myCameo;

    @C09CT("page")
    public final Integer page;

    @C09CT("size")
    public final Integer size;

    public RecommendMentionRequest() {
        this(Boolean.FALSE, 1, 10, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendMentionRequest)) {
            return false;
        }
        RecommendMentionRequest recommendMentionRequest = (RecommendMentionRequest) obj;
        return Intrinsics.LJFF(this.myCameo, recommendMentionRequest.myCameo) && Intrinsics.LJFF(this.page, recommendMentionRequest.page) && Intrinsics.LJFF(this.size, recommendMentionRequest.size) && Intrinsics.LJFF(this.insertUidList, recommendMentionRequest.insertUidList);
    }

    public final int hashCode() {
        Boolean bool = this.myCameo;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.page;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.size;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Long> list = this.insertUidList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendMentionRequest(myCameo=");
        sbLIZ.append(this.myCameo);
        sbLIZ.append(", page=");
        sbLIZ.append(this.page);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", insertUidList=");
        sbLIZ.append(this.insertUidList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendMentionRequest(Boolean bool, Integer num, Integer num2, List<Long> list) {
        this.myCameo = bool;
        this.page = num;
        this.size = num2;
        this.insertUidList = list;
    }
}
