package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SmartPreloadProfileV2ServiceDefault extends SmartPreloadProfileV2Service {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service
    public final boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public final boolean ensureEvaluatorAvailable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        return -1.0f;
    }
}
