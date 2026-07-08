package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StoryHighlightsAwemeDetailResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme")
    public final Aweme aweme;

    public StoryHighlightsAwemeDetailResponse() {
        this(null);
    }

    public final StoryHighlightsAwemeDetailResponse copy(Aweme aweme) {
        return new StoryHighlightsAwemeDetailResponse(aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryHighlightsAwemeDetailResponse) && Intrinsics.LJFF(this.aweme, ((StoryHighlightsAwemeDetailResponse) obj).aweme);
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightsAwemeDetailResponse(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public StoryHighlightsAwemeDetailResponse(Aweme aweme) {
        this.aweme = aweme;
    }
}
