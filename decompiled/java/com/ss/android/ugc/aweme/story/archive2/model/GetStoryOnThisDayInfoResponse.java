package com.ss.android.ugc.aweme.story.archive2.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetStoryOnThisDayInfoResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("awemes")
    public final List<Aweme> awemes;

    public GetStoryOnThisDayInfoResponse() {
        this(null, 1, null);
    }

    public final GetStoryOnThisDayInfoResponse copy(List<? extends Aweme> list) {
        return new GetStoryOnThisDayInfoResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetStoryOnThisDayInfoResponse) && Intrinsics.LJFF(this.awemes, ((GetStoryOnThisDayInfoResponse) obj).awemes);
    }

    public int hashCode() {
        return this.awemes.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetStoryOnThisDayInfoResponse(awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetStoryOnThisDayInfoResponse(List<? extends Aweme> list) {
        this.awemes = list;
    }

    public GetStoryOnThisDayInfoResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
