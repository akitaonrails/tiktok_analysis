package com.ss.android.ugc.aweme.story.note;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public interface IStoryThoughtMyDataManager extends StoryNoteStatusChangeCallback {
    void Bq0(StoryNoteDataCollection storyNoteDataCollection, Aweme aweme);

    StoryNoteDataCollection KO(boolean z);

    void WB0(StoryNoteStatusChangeCallback storyNoteStatusChangeCallback);

    boolean XO();

    void e11(StoryNoteStatusChangeCallback storyNoteStatusChangeCallback, String str);

    void qn1(Function1<? super StoryNoteDataCollection, Unit> function1);

    void zH1(String str);
}
