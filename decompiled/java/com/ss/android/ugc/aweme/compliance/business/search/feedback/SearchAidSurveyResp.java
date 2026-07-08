package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SearchAidSurveyResp extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("survey_data")
    public final UserSurveyConfigDetail surveyData;

    public SearchAidSurveyResp() {
        this(new UserSurveyConfigDetail(0, null, 3, null));
    }

    public final SearchAidSurveyResp copy(UserSurveyConfigDetail userSurveyConfigDetail) {
        return new SearchAidSurveyResp(userSurveyConfigDetail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchAidSurveyResp) && Intrinsics.LJFF(this.surveyData, ((SearchAidSurveyResp) obj).surveyData);
    }

    public int hashCode() {
        return this.surveyData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAidSurveyResp(surveyData=");
        sbLIZ.append(this.surveyData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UserSurveyConfigDetail getSurveyData() {
        return this.surveyData;
    }

    public SearchAidSurveyResp(UserSurveyConfigDetail userSurveyConfigDetail) {
        this.surveyData = userSurveyConfigDetail;
    }
}
