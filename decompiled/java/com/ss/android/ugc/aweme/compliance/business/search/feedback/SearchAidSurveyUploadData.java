package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchAidSurveyUploadData {

    @C09CT("scene_type")
    public final int sceneType;

    @C09CT("out_key")
    public final String searchId;

    @C09CT("survey_config_id")
    public final String surveyConfigId;

    @C09CT("value_data")
    public final List<ValueData> valueData;

    public SearchAidSurveyUploadData() {
        this(0, null, null, null, 15, null);
    }

    public SearchAidSurveyUploadData(int i, String str, String str2, List<ValueData> list) {
        this.sceneType = i;
        this.surveyConfigId = str;
        this.searchId = str2;
        this.valueData = list;
    }

    public SearchAidSurveyUploadData(int i, String str, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
