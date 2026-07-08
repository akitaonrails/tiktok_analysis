package com.ss.android.ugc.aweme.service;

import X.C01GW;
import X.C1514430pVp;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.NewUserPopupReverseExperiment;

/* JADX INFO: loaded from: classes35.dex */
public final class NewUserReversePopupService implements INewUserReversePopupService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.service.INewUserReversePopupService
    public final void LIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("unique_id", str);
        c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
        C20684815ws.LJIILLIIL("nur_popup_reverse_decision", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.INewUserReversePopupService
    public final boolean LIZIZ(String str) {
        C01GW c01gw = NewUserPopupReverseExperiment.LIZIZ;
        if (!((NewUserPopupReverseExperiment.PopupReverseExperimentConfig) c01gw.getValue()).isEnable) {
            return true;
        }
        if (System.currentTimeMillis() - C1514430pVp.LIZ() >= ((NewUserPopupReverseExperiment.PopupReverseExperimentConfig) c01gw.getValue()).duration * 60 * LSPassThroughRecordSizeConfig.DEFAULT || !((NewUserPopupReverseExperiment.PopupReverseExperimentConfig) c01gw.getValue()).disableList.contains(str)) {
            return true;
        }
        return false;
    }
}
