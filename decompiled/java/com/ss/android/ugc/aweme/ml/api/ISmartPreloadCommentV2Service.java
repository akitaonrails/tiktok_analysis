package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface ISmartPreloadCommentV2Service {
    boolean ensureEvaluatorAvailable(String str);

    float getClientAIThreshold(String str);

    float smartJudge(String str, Aweme aweme, Map<String, Object> map, Map<String, Object> map2);
}
