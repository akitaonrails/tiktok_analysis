package com.ss.android.ugc.aweme.story.widget.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StoryWidgetModel extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("has_story_in_feed")
    public final boolean hasStoryInFeed;

    @C09CT("story_info")
    public final Aweme storyInfo;

    public final StoryWidgetModel copy(boolean z, Aweme aweme) {
        return new StoryWidgetModel(z, aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryWidgetModel)) {
            return false;
        }
        StoryWidgetModel storyWidgetModel = (StoryWidgetModel) obj;
        return this.hasStoryInFeed == storyWidgetModel.hasStoryInFeed && Intrinsics.LJFF(this.storyInfo, storyWidgetModel.storyInfo);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.hasStoryInFeed) * 31;
        Aweme aweme = this.storyInfo;
        return iZ2 + (aweme == null ? 0 : aweme.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryWidgetModel(hasStoryInFeed=");
        sbLIZ.append(this.hasStoryInFeed);
        sbLIZ.append(", storyInfo=");
        sbLIZ.append(this.storyInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasStoryInFeed() {
        return this.hasStoryInFeed;
    }

    public final Aweme getStoryInfo() {
        return this.storyInfo;
    }

    public StoryWidgetModel(boolean z, Aweme aweme) {
        this.hasStoryInFeed = z;
        this.storyInfo = aweme;
    }
}
