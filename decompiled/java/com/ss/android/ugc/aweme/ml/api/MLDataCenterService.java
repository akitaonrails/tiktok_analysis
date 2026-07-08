package com.ss.android.ugc.aweme.ml.api;

import X.C0T30;
import X.C1349505Px;
import X.C1510230pP3;
import X.C740510T2z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class MLDataCenterService implements IMLDataCenterService {
    public static final C0T30 Companion = new Object() { // from class: X.0T30
    };
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void addSceneModelConfig(C1510230pP3 c1510230pP3);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void checkAndInit();

    public abstract /* synthetic */ void checkAndInitPrfFeedMoveTrack(boolean z);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ C740510T2z getFeedTrackRangeInfo(String str, int i, boolean z);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ JSONObject getFlashFeedFeatures(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void onAppLogEvent(String str, JSONObject jSONObject, String str2);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void onPythiaEvent(String str, Map<String, ? extends Object> map);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void removeAwemeContentListForScore(List<String> list);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void saveAwemeContentListForScore(List<? extends Aweme> list);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void setContentScoreIndex(String str, int i);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final IMLDataCenterService instance() {
        Companion.getClass();
        return C1349505Px.LIZ;
    }
}
