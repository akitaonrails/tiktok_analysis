package com.ss.android.ugc.aweme.story.education;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryNewUserEducationData {

    @C09CT("enable_24h_education")
    public final boolean enable24hEducation;

    @C09CT("enable_ai_live_education_suppression")
    public final boolean enableAILiveEducationSuppression;

    @C09CT("enable_cyclical_new_user_education")
    public final boolean enableCyclicalNewUserEducation;

    @C09CT("enable_debug_new_user_from_storage")
    public final boolean enableDebugNewUserFromStorage;

    @C09CT("enable_reduce_request_after_has_published_story")
    public final boolean enableReduceRequestAfterHasPublishedStory;

    @C09CT("enable_story_danmaku_optimization")
    public final boolean enableStoryDanmakuOptimization;

    @C09CT("enable_viewer_insight_overlay")
    public final boolean enableViewerInsightOverlay;

    @C09CT("story_danmaku_initial_fade_progress_android")
    public final float storyDanmakuEntryAdvanceProgress;

    @C09CT("story_danmaku_line_spacing_android")
    public final int storyDanmakuLineSpacing;

    @C09CT("story_danmaku_scroll_speed_android")
    public final float storyDanmakuScrollSpeedMultiplier;

    public StoryNewUserEducationData() {
        this(false, false, false, false, false, false, false, 0.4f, 0, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryNewUserEducationData)) {
            return false;
        }
        StoryNewUserEducationData storyNewUserEducationData = (StoryNewUserEducationData) obj;
        return this.enable24hEducation == storyNewUserEducationData.enable24hEducation && this.enableAILiveEducationSuppression == storyNewUserEducationData.enableAILiveEducationSuppression && this.enableViewerInsightOverlay == storyNewUserEducationData.enableViewerInsightOverlay && this.enableDebugNewUserFromStorage == storyNewUserEducationData.enableDebugNewUserFromStorage && this.enableStoryDanmakuOptimization == storyNewUserEducationData.enableStoryDanmakuOptimization && this.enableReduceRequestAfterHasPublishedStory == storyNewUserEducationData.enableReduceRequestAfterHasPublishedStory && this.enableCyclicalNewUserEducation == storyNewUserEducationData.enableCyclicalNewUserEducation && Float.compare(this.storyDanmakuEntryAdvanceProgress, storyNewUserEducationData.storyDanmakuEntryAdvanceProgress) == 0 && this.storyDanmakuLineSpacing == storyNewUserEducationData.storyDanmakuLineSpacing && Float.compare(this.storyDanmakuScrollSpeedMultiplier, storyNewUserEducationData.storyDanmakuScrollSpeedMultiplier) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryNewUserEducationData(enable24hEducation=");
        sbLIZ.append(this.enable24hEducation);
        sbLIZ.append(", enableAILiveEducationSuppression=");
        sbLIZ.append(this.enableAILiveEducationSuppression);
        sbLIZ.append(", enableViewerInsightOverlay=");
        sbLIZ.append(this.enableViewerInsightOverlay);
        sbLIZ.append(", enableDebugNewUserFromStorage=");
        sbLIZ.append(this.enableDebugNewUserFromStorage);
        sbLIZ.append(", enableStoryDanmakuOptimization=");
        sbLIZ.append(this.enableStoryDanmakuOptimization);
        sbLIZ.append(", enableReduceRequestAfterHasPublishedStory=");
        sbLIZ.append(this.enableReduceRequestAfterHasPublishedStory);
        sbLIZ.append(", enableCyclicalNewUserEducation=");
        sbLIZ.append(this.enableCyclicalNewUserEducation);
        sbLIZ.append(", storyDanmakuEntryAdvanceProgress=");
        sbLIZ.append(this.storyDanmakuEntryAdvanceProgress);
        sbLIZ.append(", storyDanmakuLineSpacing=");
        sbLIZ.append(this.storyDanmakuLineSpacing);
        sbLIZ.append(", storyDanmakuScrollSpeedMultiplier=");
        sbLIZ.append(this.storyDanmakuScrollSpeedMultiplier);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((((((C786410Ut5.Z2(this.enable24hEducation) * 31) + C786410Ut5.Z2(this.enableAILiveEducationSuppression)) * 31) + C786410Ut5.Z2(this.enableViewerInsightOverlay)) * 31) + C786410Ut5.Z2(this.enableDebugNewUserFromStorage)) * 31) + C786410Ut5.Z2(this.enableStoryDanmakuOptimization)) * 31) + C786410Ut5.Z2(this.enableReduceRequestAfterHasPublishedStory)) * 31) + C786410Ut5.Z2(this.enableCyclicalNewUserEducation)) * 31) + Float.floatToIntBits(this.storyDanmakuEntryAdvanceProgress)) * 31) + this.storyDanmakuLineSpacing) * 31) + Float.floatToIntBits(this.storyDanmakuScrollSpeedMultiplier);
    }

    public StoryNewUserEducationData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, float f, int i, float f2) {
        this.enable24hEducation = z;
        this.enableAILiveEducationSuppression = z2;
        this.enableViewerInsightOverlay = z3;
        this.enableDebugNewUserFromStorage = z4;
        this.enableStoryDanmakuOptimization = z5;
        this.enableReduceRequestAfterHasPublishedStory = z6;
        this.enableCyclicalNewUserEducation = z7;
        this.storyDanmakuEntryAdvanceProgress = f;
        this.storyDanmakuLineSpacing = i;
        this.storyDanmakuScrollSpeedMultiplier = f2;
    }
}
