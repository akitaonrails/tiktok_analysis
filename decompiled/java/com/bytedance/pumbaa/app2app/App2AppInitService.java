package com.bytedance.pumbaa.app2app;

import X.C0WSW;
import X.C0WSX;
import X.C308480C7i;
import X.C786410Ut5;
import X.C823450WRz;
import X.C825320WZe;
import X.C825710WaH;
import X.C825720WaI;
import X.C825770WaN;
import android.content.Context;
import com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class App2AppInitService implements IPumbaaModuleInitService {
    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZIZ(Context context, C823450WRz c823450WRz) {
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final String name() {
        return "App2AppInitService";
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IPumbaaModuleInitService
    public final void LIZ(Context context, C823450WRz c823450WRz) {
        IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
        if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJI()) {
            return;
        }
        SandboxApp2AppConfigData sandboxApp2AppConfigData = C825770WaN.LIZ;
        SandboxApp2AppConfigData sandboxApp2AppConfigData2 = (SandboxApp2AppConfigData) C308480C7i.LIZLLL(SandboxApp2AppConfigData.class, "sandbox_app2app_config", sandboxApp2AppConfigData);
        if (sandboxApp2AppConfigData2 != null) {
            sandboxApp2AppConfigData = sandboxApp2AppConfigData2;
        }
        C825710WaH.LIZIZ = sandboxApp2AppConfigData.enable;
        C825710WaH.LIZJ = sandboxApp2AppConfigData.enableSelfPackageFilter;
        C825710WaH.LIZLLL = sandboxApp2AppConfigData.enableUploadValue;
        C825710WaH.LJ = sandboxApp2AppConfigData.schemeSkipList;
        C825710WaH.LJFF = sandboxApp2AppConfigData.enableAsyncUpload;
        C825710WaH.LJI = sandboxApp2AppConfigData.enableCollectAutoDFIDALL;
        C786410Ut5.N3(context);
        C825710WaH.LIZ = context.getPackageName();
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
        C0WSW.LIZ("App2AppInitService", new C825720WaI(sandboxApp2AppConfigData), 3, null);
    }
}
