package com.bytedance.pumbaa.userinput;

import X.C823450WRz;
import X.C825300WZc;
import X.C825320WZe;
import X.C825340WZg;
import android.content.Context;
import com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;

/* JADX INFO: loaded from: classes14.dex */
public final class UserInputInitService implements IPumbaaModuleInitService {
    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZIZ(Context context, C823450WRz c823450WRz) {
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final String name() {
        return "UserInputInit";
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZ(Context context, C823450WRz c823450WRz) {
        IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
        if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJIIIZ()) {
            return;
        }
        C825340WZg.LIZ = (UserInputConfig) C825300WZc.LIZIZ.getValue();
    }
}
