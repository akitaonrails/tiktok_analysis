package com.ss.android.ugc.aweme.homepage.ui.experiment;

import X.C04TD;
import X.C19EG;
import com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;

/* JADX INFO: loaded from: classes25.dex */
public final class EasyNavigationExperimentServiceImpl implements EasyNavigationExperimentService {
    public static EasyNavigationExperimentService LIZIZ() {
        Object objLIZ = C04TD.LIZ(EasyNavigationExperimentService.class, false);
        if (objLIZ != null) {
            return (EasyNavigationExperimentService) objLIZ;
        }
        if (C04TD.K0 == null) {
            synchronized (EasyNavigationExperimentService.class) {
                if (C04TD.K0 == null) {
                    C04TD.K0 = new EasyNavigationExperimentServiceImpl();
                }
            }
        }
        return C04TD.K0;
    }

    @Override // com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService
    public final void LIZ(C19EG c19eg) {
        HomeTabViewModel.LLILZIL.LIZ(c19eg).getClass();
    }
}
