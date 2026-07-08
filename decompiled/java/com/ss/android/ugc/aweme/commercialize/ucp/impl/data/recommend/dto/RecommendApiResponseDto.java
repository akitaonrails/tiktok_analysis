package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C297801Dk;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendApiResponseDto extends BaseResponse implements Serializable {
    public static final C297801Dk Companion = new Object() { // from class: X.01Dk
    };

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final List<RecommendSeedItemDto> data;

    public final RecommendApiResponseDto copy(Integer num, List<RecommendSeedItemDto> list) {
        return new RecommendApiResponseDto(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendApiResponseDto)) {
            return false;
        }
        RecommendApiResponseDto recommendApiResponseDto = (RecommendApiResponseDto) obj;
        return Intrinsics.LJFF(this.code, recommendApiResponseDto.code) && Intrinsics.LJFF(this.data, recommendApiResponseDto.data);
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<RecommendSeedItemDto> list = this.data;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendApiResponseDto(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse
    public boolean isSuccess() {
        Integer statusCode = getStatusCode();
        if (statusCode != null && statusCode.intValue() == 0) {
            return true;
        }
        Integer num = this.code;
        return num != null && num.intValue() == 0;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final List<RecommendSeedItemDto> getData() {
        return this.data;
    }

    public RecommendApiResponseDto(Integer num, List<RecommendSeedItemDto> list) {
        super(null, null);
        this.code = num;
        this.data = list;
    }
}
