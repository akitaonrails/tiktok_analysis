package com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SurveyDetailResponse extends BaseResponse {

    @C09CT("data")
    public final Data data;

    public SurveyDetailResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurveyDetailResponse) && Intrinsics.LJFF(this.data, ((SurveyDetailResponse) obj).data);
    }

    public final int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurveyDetailResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SurveyDetailResponse(Data data) {
        this.data = data;
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class Data {

        @C09CT("stars_title_array")
        public List<String> starsTitleList;

        @C09CT("survey_title")
        public final String title;

        public Data() {
            this(null, null);
        }

        public Data(String str, List<String> list) {
            this.title = str;
            this.starsTitleList = list;
        }
    }
}
