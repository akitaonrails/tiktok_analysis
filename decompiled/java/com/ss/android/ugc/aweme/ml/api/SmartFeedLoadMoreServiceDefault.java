package com.ss.android.ugc.aweme.ml.api;

import X.InterfaceC1511020pQK;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartFeedLoadMoreServiceDefault extends SmartFeedLoadMoreService {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(HashMap<String, Object> map, Aweme aweme, Integer num) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final boolean isSmartFeedLoadMoreScene(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final boolean needCheckLoadMore(int i, int i2, Aweme aweme, Aweme aweme2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void startSmartFeedLoadMoreJudge(Aweme aweme, InterfaceC1511020pQK interfaceC1511020pQK) {
    }
}
