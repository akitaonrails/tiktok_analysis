package com.ss.android.ugc.aweme.ml.api;

import X.C1510230pP3;
import X.C740510T2z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public interface IMLDataCenterService {
    void addSceneModelConfig(C1510230pP3 c1510230pP3);

    void checkAndInit();

    C740510T2z getFeedTrackRangeInfo(String str, int i, boolean z);

    JSONObject getFlashFeedFeatures(String str);

    void onAppLogEvent(String str, JSONObject jSONObject, String str2);

    void onPythiaEvent(String str, Map<String, ? extends Object> map);

    void removeAwemeContentListForScore(List<String> list);

    void saveAwemeContentListForScore(List<? extends Aweme> list);

    void setContentScoreIndex(String str, int i);
}
