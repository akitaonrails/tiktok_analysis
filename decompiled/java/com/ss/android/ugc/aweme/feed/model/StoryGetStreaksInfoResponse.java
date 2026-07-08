package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class StoryGetStreaksInfoResponse extends BaseResponse implements Serializable {

    @C09CT("muf_days_count")
    public final long mufDaysCount;

    public final StoryGetStreaksInfoResponse copy(long j) {
        return new StoryGetStreaksInfoResponse(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryGetStreaksInfoResponse) && this.mufDaysCount == ((StoryGetStreaksInfoResponse) obj).mufDaysCount;
    }

    public int hashCode() {
        return C786410Ut5.Y2(this.mufDaysCount);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryGetStreaksInfoResponse(mufDaysCount=");
        sbLIZ.append(this.mufDaysCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryGetStreaksInfoResponse() {
        this(0L);
    }

    public final long getMufDaysCount() {
        return this.mufDaysCount;
    }

    public StoryGetStreaksInfoResponse(long j) {
        this.mufDaysCount = j;
    }
}
