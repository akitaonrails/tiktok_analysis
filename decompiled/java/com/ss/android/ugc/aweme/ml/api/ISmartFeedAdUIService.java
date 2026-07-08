package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

/* JADX INFO: loaded from: classes24.dex */
public interface ISmartFeedAdUIService {
    void checkAndInit();

    boolean enable();

    String getPredictLabelResult();

    CommerceSmartUITasks getPredictTaskIndex();

    CommerceSmartUIModel getSmartAdUIExperimentValue();

    void startSmartAdUIJudge(Aweme aweme);
}
