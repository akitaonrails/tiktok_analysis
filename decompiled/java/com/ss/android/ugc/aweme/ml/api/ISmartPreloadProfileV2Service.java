package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface ISmartPreloadProfileV2Service {
    boolean ensureEvaluatorAvailable();

    float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2);
}
