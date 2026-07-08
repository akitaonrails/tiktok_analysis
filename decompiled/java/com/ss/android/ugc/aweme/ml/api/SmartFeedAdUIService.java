package com.ss.android.ugc.aweme.ml.api;

import X.C1511140pQW;
import X.C1511200pQc;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartFeedAdUIService implements ISmartFeedAdUIService {
    public static final C1511200pQc Companion = new Object() { // from class: X.0pQc
    };
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ boolean enable();

    public abstract /* synthetic */ void ensureEvaluatorAvailable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ String getPredictLabelResult();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ CommerceSmartUITasks getPredictTaskIndex();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ CommerceSmartUIModel getSmartAdUIExperimentValue();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public abstract /* synthetic */ void startSmartAdUIJudge(Aweme aweme);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartFeedAdUIService instance() {
        Companion.getClass();
        return C1511140pQW.LIZ;
    }
}
