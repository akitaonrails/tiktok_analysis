package com.ss.android.ugc.aweme.story.inbox;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class OnThisDayResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("awemes")
    public final List<Aweme> awemes;

    @C09CT("is_posted")
    public final int isPosted;

    @C09CT("past_memory_key")
    public final String pastMemoryKey;
    public int priority;

    @C09CT("view_count")
    public final int viewCount;

    public final OnThisDayResponse copy(Aweme aweme, int i, int i2, String str, int i3, List<? extends Aweme> list) {
        return new OnThisDayResponse(aweme, i, i2, str, i3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnThisDayResponse)) {
            return false;
        }
        OnThisDayResponse onThisDayResponse = (OnThisDayResponse) obj;
        return Intrinsics.LJFF(this.aweme, onThisDayResponse.aweme) && this.viewCount == onThisDayResponse.viewCount && this.isPosted == onThisDayResponse.isPosted && Intrinsics.LJFF(this.pastMemoryKey, onThisDayResponse.pastMemoryKey) && this.priority == onThisDayResponse.priority && Intrinsics.LJFF(this.awemes, onThisDayResponse.awemes);
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        int iHashCode = (((((((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.viewCount) * 31) + this.isPosted) * 31) + this.pastMemoryKey.hashCode()) * 31) + this.priority) * 31;
        List<Aweme> list = this.awemes;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnThisDayResponse(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", viewCount=");
        sbLIZ.append(this.viewCount);
        sbLIZ.append(", isPosted=");
        sbLIZ.append(this.isPosted);
        sbLIZ.append(", pastMemoryKey=");
        sbLIZ.append(this.pastMemoryKey);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    public final String getPastMemoryKey() {
        return this.pastMemoryKey;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final int isPosted() {
        return this.isPosted;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnThisDayResponse(Aweme aweme, int i, int i2, String str, int i3, List<? extends Aweme> list) {
        this.aweme = aweme;
        this.viewCount = i;
        this.isPosted = i2;
        this.pastMemoryKey = str;
        this.priority = i3;
        this.awemes = list;
    }
}
