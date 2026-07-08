package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class StoryArchDetailResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("story_archive_detail")
    public final StoryArchDetail detail;

    public final StoryArchDetailResponse copy(StoryArchDetail storyArchDetail) {
        return new StoryArchDetailResponse(storyArchDetail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryArchDetailResponse) && Intrinsics.LJFF(this.detail, ((StoryArchDetailResponse) obj).detail);
    }

    public int hashCode() {
        StoryArchDetail storyArchDetail = this.detail;
        if (storyArchDetail == null) {
            return 0;
        }
        return storyArchDetail.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryArchDetailResponse(detail=");
        sbLIZ.append(this.detail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final StoryArchDetail getDetail() {
        return this.detail;
    }

    public StoryArchDetailResponse(StoryArchDetail storyArchDetail) {
        this.detail = storyArchDetail;
    }
}
