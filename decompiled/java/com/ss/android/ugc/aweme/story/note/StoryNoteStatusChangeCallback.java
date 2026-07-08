package com.ss.android.ugc.aweme.story.note;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;

/* JADX INFO: loaded from: classes3.dex */
public interface StoryNoteStatusChangeCallback {
    void onStoryNoteDelete();

    void onStoryNotePublishFinished(String str, StoryNoteDataCollection storyNoteDataCollection, Aweme aweme);

    void onStoryNotePublishStart(StoryNoteDataCollection storyNoteDataCollection);
}
