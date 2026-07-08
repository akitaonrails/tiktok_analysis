package com.ss.android.ugc.aweme.services.story;

import X.C19EG;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;

/* JADX INFO: loaded from: classes23.dex */
public interface IStoryGroupScheduleService {
    void clearData(StoryGroupPublishModel storyGroupPublishModel);

    boolean isAllTaskInGroupPublishFinished(StoryGroupPublishModel storyGroupPublishModel);

    boolean retryGroupTask(C19EG c19eg, StoryGroupPublishModel storyGroupPublishModel);
}
