package com.ss.android.ugc.aweme.api.survey;

import X.C04TD;
import X.InterfaceC1036270d4b;

/* JADX INFO: loaded from: classes3.dex */
public final class BISurveyServiceImpl implements IBISurveyService {
    public InterfaceC1036270d4b LIZ;

    public static IBISurveyService LIZ() {
        Object objLIZ = C04TD.LIZ(IBISurveyService.class, false);
        if (objLIZ != null) {
            return (IBISurveyService) objLIZ;
        }
        if (C04TD.LLI == null) {
            synchronized (IBISurveyService.class) {
                if (C04TD.LLI == null) {
                    C04TD.LLI = new BISurveyServiceImpl();
                }
            }
        }
        return C04TD.LLI;
    }

    @Override // com.ss.android.ugc.aweme.api.survey.IBISurveyService
    public final InterfaceC1036270d4b s() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.api.survey.IBISurveyService
    public final void r(InterfaceC1036270d4b interfaceC1036270d4b) {
        this.LIZ = interfaceC1036270d4b;
    }
}
