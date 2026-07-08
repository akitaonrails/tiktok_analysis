package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C01GW;
import X.C040I;
import X.C11NZ;
import X.C452501pT;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchAidSurveyAPI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(173));

    public interface API {
        @InterfaceC1501200pAU("/tiktok/v1/violation/search_aid_survey/")
        C11NZ<SearchAidSurveyResp> LIZ(@InterfaceC1501120pAM("search_session_id") String str, @InterfaceC1501120pAM("page_type") int i);

        @InterfaceC1501170pAR("/tiktok/v1/user/survey_collection/upload/")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C11NZ<BaseResponse> uploadSurveyData(@C040I SearchAidSurveyUploadRequest searchAidSurveyUploadRequest);
    }
}
