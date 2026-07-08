package com.ss.android.ugc.aweme.services.story;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public interface IStoryDraftService {
    void deleteDraft(SimplePublishModel simplePublishModel);

    void getStoryDraftList(Function1<? super List<PublishModel>, Unit> function1);
}
