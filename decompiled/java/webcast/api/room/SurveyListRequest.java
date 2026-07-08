package webcast.api.room;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SurveyListRequest {

    @C09CT("feature_map")
    public Map<String, String> featureMap = new LinkedHashMap();

    @C09CT("room_id")
    public long roomId;

    @C09CT("survey_version")
    public int surveyVersion;
}
