package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SmartPreloadCommentV2ServiceDefault extends SmartPreloadCommentV2Service {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final boolean ensureEvaluatorAvailable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final float getClientAIThreshold(String str) {
        return Float.MAX_VALUE;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final float smartJudge(String str, Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        return -1.0f;
    }
}
