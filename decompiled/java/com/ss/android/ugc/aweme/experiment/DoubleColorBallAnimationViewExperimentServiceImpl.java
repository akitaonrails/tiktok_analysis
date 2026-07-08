package com.ss.android.ugc.aweme.experiment;

import X.C303140BuS;
import com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService;

/* JADX INFO: loaded from: classes5.dex */
public final class DoubleColorBallAnimationViewExperimentServiceImpl implements DoubleColorBallAnimationViewExperimentService {
    @Override // com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService
    public final boolean LIZ() {
        int iIntValue = ((Number) C303140BuS.LIZJ.getValue()).intValue();
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue != 2) {
            return false;
        }
        return C303140BuS.LIZ;
    }
}
