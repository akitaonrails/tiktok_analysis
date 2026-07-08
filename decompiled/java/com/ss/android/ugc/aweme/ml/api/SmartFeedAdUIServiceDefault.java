package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartFeedAdUIServiceDefault extends SmartFeedAdUIService {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService
    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final String getPredictLabelResult() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUITasks getPredictTaskIndex() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUIModel getSmartAdUIExperimentValue() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void startSmartAdUIJudge(Aweme aweme) {
    }
}
