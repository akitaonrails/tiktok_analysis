package com.bytedance.android.livesdk.survey.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface SurveyApi {
    @InterfaceC1501170pAR("/webcast/room/survey/list_v2/")
    C11NZ<C470590Icr<SurveyData>> listV2(@InterfaceC1485405rg Map<String, Object> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/survey/submit/")
    C11NZ<C470590Icr<Void>> submit(@InterfaceC1501150pAP HashMap<String, Object> map);
}
