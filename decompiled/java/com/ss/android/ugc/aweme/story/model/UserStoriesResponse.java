package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class UserStoriesResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("awemes")
    public final List<Aweme> awemes;

    @C09CT("results")
    public final List<StoryQueryResult> queryResults;

    @C09CT("user_story_notes")
    public final List<Aweme> userStoryNotes;

    public final UserStoriesResponse copy(List<? extends Aweme> list, List<StoryQueryResult> list2, List<? extends Aweme> list3) {
        return new UserStoriesResponse(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStoriesResponse)) {
            return false;
        }
        UserStoriesResponse userStoriesResponse = (UserStoriesResponse) obj;
        return Intrinsics.LJFF(this.awemes, userStoriesResponse.awemes) && Intrinsics.LJFF(this.queryResults, userStoriesResponse.queryResults) && Intrinsics.LJFF(this.userStoryNotes, userStoriesResponse.userStoryNotes);
    }

    public int hashCode() {
        List<Aweme> list = this.awemes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StoryQueryResult> list2 = this.queryResults;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Aweme> list3 = this.userStoryNotes;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStoriesResponse(awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(", queryResults=");
        sbLIZ.append(this.queryResults);
        sbLIZ.append(", userStoryNotes=");
        sbLIZ.append(this.userStoryNotes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    public final List<StoryQueryResult> getQueryResults() {
        return this.queryResults;
    }

    public final List<Aweme> getUserStoryNotes() {
        return this.userStoryNotes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserStoriesResponse(List<? extends Aweme> list, List<StoryQueryResult> list2, List<? extends Aweme> list3) {
        this.awemes = list;
        this.queryResults = list2;
        this.userStoryNotes = list3;
    }
}
