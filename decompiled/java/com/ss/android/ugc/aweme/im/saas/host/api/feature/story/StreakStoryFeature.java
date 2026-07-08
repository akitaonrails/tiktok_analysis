package com.ss.android.ugc.aweme.im.saas.host.api.feature.story;

import X.C06QF;
import android.content.Context;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Feature(id = "streak_story", name = "Streak Story", parents = {StoryFeature.class})
public interface StreakStoryFeature {
    public static final C06QF LIZ = C06QF.LIZ;

    Pair<Boolean, Boolean> LIZ();

    void LIZIZ(Context context, StoryStreakEnterEditParam storyStreakEnterEditParam);

    boolean LIZJ(int i);
}
