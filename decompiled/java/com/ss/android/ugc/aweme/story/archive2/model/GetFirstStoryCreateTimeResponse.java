package com.ss.android.ugc.aweme.story.archive2.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetFirstStoryCreateTimeResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("first_story_create_time")
    public final Long firstStoryCreateTime;

    public final GetFirstStoryCreateTimeResponse copy(Long l) {
        return new GetFirstStoryCreateTimeResponse(l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetFirstStoryCreateTimeResponse) && Intrinsics.LJFF(this.firstStoryCreateTime, ((GetFirstStoryCreateTimeResponse) obj).firstStoryCreateTime);
    }

    public int hashCode() {
        Long l = this.firstStoryCreateTime;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetFirstStoryCreateTimeResponse(firstStoryCreateTime=");
        sbLIZ.append(this.firstStoryCreateTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetFirstStoryCreateTimeResponse() {
        this(0L);
    }

    public final Long getFirstStoryCreateTime() {
        return this.firstStoryCreateTime;
    }

    public GetFirstStoryCreateTimeResponse(Long l) {
        this.firstStoryCreateTime = l;
    }
}
