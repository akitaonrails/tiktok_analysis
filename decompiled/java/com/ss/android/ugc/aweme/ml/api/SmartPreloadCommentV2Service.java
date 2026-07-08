package com.ss.android.ugc.aweme.ml.api;

import X.C0T1B;
import X.C0T1T;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SmartPreloadCommentV2Service implements ISmartPreloadCommentV2Service {
    public static final C0T1B Companion = new Object() { // from class: X.0T1B
    };
    public static final boolean debug = false;

    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public abstract /* synthetic */ boolean ensureEvaluatorAvailable(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public abstract /* synthetic */ float getClientAIThreshold(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public abstract /* synthetic */ float smartJudge(String str, Aweme aweme, Map<String, Object> map, Map<String, Object> map2);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartPreloadCommentV2Service instance() {
        Companion.getClass();
        return C0T1T.LIZ;
    }
}
