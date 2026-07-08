package com.ss.android.ugc.aweme.story.streaks;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.StoryGetStreaksInfoResponse;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface IStoryStreaksService {
    Pair<Boolean, Boolean> LIZ();

    void LIZIZ(Context context, StoryStreakEnterEditParam storyStreakEnterEditParam);

    Map<String, Effect> LIZJ();

    boolean LIZLLL();

    StoryGetStreaksInfoResponse LJ(String str);
}
