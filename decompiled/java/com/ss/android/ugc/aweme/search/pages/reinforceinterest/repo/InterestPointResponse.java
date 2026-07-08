package com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class InterestPointResponse extends BaseResponse {

    @C09CT("code")
    public final int code;

    @C09CT("interest_word_exit")
    public final Boolean interestExit;

    @C09CT("log_id")
    public final String logId;

    @C09CT("words")
    public final List<InterestWordResponse> words;

    public InterestPointResponse() {
        this(null, "", 0, Boolean.TRUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestPointResponse)) {
            return false;
        }
        InterestPointResponse interestPointResponse = (InterestPointResponse) obj;
        return Intrinsics.LJFF(this.words, interestPointResponse.words) && Intrinsics.LJFF(this.logId, interestPointResponse.logId) && this.code == interestPointResponse.code && Intrinsics.LJFF(this.interestExit, interestPointResponse.interestExit);
    }

    public final int hashCode() {
        List<InterestWordResponse> list = this.words;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.logId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.code) * 31;
        Boolean bool = this.interestExit;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InterestPointResponse(words=");
        sbLIZ.append(this.words);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", interestExit=");
        sbLIZ.append(this.interestExit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InterestPointResponse(List<InterestWordResponse> list, String str, int i, Boolean bool) {
        this.words = list;
        this.logId = str;
        this.code = i;
        this.interestExit = bool;
    }
}
