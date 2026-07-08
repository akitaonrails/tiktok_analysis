package com.ss.android.ugc.aweme.ml.api;

import X.C1510230pP3;
import X.C740510T2z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class MLDataCenterServiceDefault extends MLDataCenterService {
    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void addSceneModelConfig(C1510230pP3 c1510230pP3) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService
    public final void checkAndInitPrfFeedMoveTrack(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final C740510T2z getFeedTrackRangeInfo(String str, int i, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final JSONObject getFlashFeedFeatures(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void onAppLogEvent(String str, JSONObject jSONObject, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void onPythiaEvent(String str, Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void removeAwemeContentListForScore(List<String> list) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void saveAwemeContentListForScore(List<? extends Aweme> list) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void setContentScoreIndex(String str, int i) {
    }
}
