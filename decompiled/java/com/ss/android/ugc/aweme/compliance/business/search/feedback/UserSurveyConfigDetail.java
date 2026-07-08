package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class UserSurveyConfigDetail implements Serializable {
    public static final int $stable = 8;

    @C09CT("scene_type")
    public final int sceneType;

    @C09CT("survey_config")
    public final List<SurveyConfig> surveyConfig;

    public UserSurveyConfigDetail() {
        this(0, null, 3, null);
    }

    public UserSurveyConfigDetail(int i, List<SurveyConfig> list) {
        this.sceneType = i;
        this.surveyConfig = list;
    }

    public UserSurveyConfigDetail(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
