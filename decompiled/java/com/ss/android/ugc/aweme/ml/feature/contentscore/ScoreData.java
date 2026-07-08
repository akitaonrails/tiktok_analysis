package com.ss.android.ugc.aweme.ml.feature.contentscore;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class ScoreData {

    @C09CT("content_id")
    public String content_id;

    @C09CT("features")
    public Map<String, Object> features;

    @C09CT("scoreMap")
    public Map<String, Float> scoreMap;
    public long ts;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScoreData(content_id=");
        sbLIZ.append(this.content_id);
        sbLIZ.append(", features=");
        sbLIZ.append(this.features);
        sbLIZ.append(", scoreMap=");
        sbLIZ.append(this.scoreMap);
        sbLIZ.append(", ts=");
        sbLIZ.append(this.ts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setContent_id(String str) {
        this.content_id = str;
    }

    public final void setFeatures(Map<String, Object> map) {
        this.features = map;
    }

    public final void setScoreMap(Map<String, Float> map) {
        this.scoreMap = map;
    }

    public final void setTs(long j) {
        this.ts = j;
    }

    public ScoreData(String str, Map<String, Object> map, Map<String, Float> map2, long j) {
        this.content_id = str;
        this.features = map;
        this.scoreMap = map2;
        this.ts = j;
    }
}
