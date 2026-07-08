package com.ss.android.ugc.aweme.tako.aivideo.detail.repo;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoAIVideoResponse {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public TakoAIVideoResponse() {
        this(null, null, 0, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoAIVideoResponse)) {
            return false;
        }
        TakoAIVideoResponse takoAIVideoResponse = (TakoAIVideoResponse) obj;
        return Intrinsics.LJFF(this.statusCode, takoAIVideoResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, takoAIVideoResponse.statusMsg) && this.hasMore == takoAIVideoResponse.hasMore && Intrinsics.LJFF(this.awemeList, takoAIVideoResponse.awemeList);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.hasMore) * 31) + this.awemeList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAIVideoResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakoAIVideoResponse(Integer num, String str, int i, List<? extends Aweme> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.hasMore = i;
        this.awemeList = list;
    }

    public TakoAIVideoResponse(Integer num, String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
