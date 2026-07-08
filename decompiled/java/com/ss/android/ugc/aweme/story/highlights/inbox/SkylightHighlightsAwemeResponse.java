package com.ss.android.ugc.aweme.story.highlights.inbox;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SkylightHighlightsAwemeResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme")
    public final List<Aweme> awemes;

    @C09CT("user_filter_story_info")
    public final UserFilterStoryInfo userFilterStoryInfo;

    public SkylightHighlightsAwemeResponse() {
        this(null, null);
    }

    public final SkylightHighlightsAwemeResponse copy(List<? extends Aweme> list, UserFilterStoryInfo userFilterStoryInfo) {
        return new SkylightHighlightsAwemeResponse(list, userFilterStoryInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightHighlightsAwemeResponse)) {
            return false;
        }
        SkylightHighlightsAwemeResponse skylightHighlightsAwemeResponse = (SkylightHighlightsAwemeResponse) obj;
        return Intrinsics.LJFF(this.awemes, skylightHighlightsAwemeResponse.awemes) && Intrinsics.LJFF(this.userFilterStoryInfo, skylightHighlightsAwemeResponse.userFilterStoryInfo);
    }

    public int hashCode() {
        List<Aweme> list = this.awemes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UserFilterStoryInfo userFilterStoryInfo = this.userFilterStoryInfo;
        return iHashCode + (userFilterStoryInfo != null ? userFilterStoryInfo.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightHighlightsAwemeResponse(awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(", userFilterStoryInfo=");
        sbLIZ.append(this.userFilterStoryInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    public final UserFilterStoryInfo getUserFilterStoryInfo() {
        return this.userFilterStoryInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkylightHighlightsAwemeResponse(List<? extends Aweme> list, UserFilterStoryInfo userFilterStoryInfo) {
        this.awemes = list;
        this.userFilterStoryInfo = userFilterStoryInfo;
    }
}
