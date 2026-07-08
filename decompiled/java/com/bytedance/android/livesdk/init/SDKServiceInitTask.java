package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import X.C1335860kro;
import X.C1338270kvh;
import X.C19489211Ms;
import X.C1AK4;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import Y.AfS141S0000000_20;
import com.bytedance.android.livesdk.livesetting.other.LiveFakeRegionChannelSettings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.widgets.ConstraintOptimizer;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class SDKServiceInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "sdk_service_init_task";
    }

    public static boolean isDebug() {
        return C1161920gLG.LIZJ(IHostAppContext.class) != null && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    }

    @Override // X.AbstractC20513081v
    public void run() {
        System.currentTimeMillis();
        boolean zIsDebug = isDebug();
        if (C19489211Ms.LIZ == null && !zIsDebug) {
            C19489211Ms.LIZ = new AfS141S0000000_20(1);
        }
        if (Arrays.asList(LiveFakeRegionChannelSettings.INSTANCE.getValue()).contains(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel())) {
            Map<String, Object> map = C1338270kvh.LIZ;
        } else {
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
        C1335860kro.LIZ = new C1AK4();
        ConstraintOptimizer.setEnableOpt(zIsDebug);
    }

    public static /* synthetic */ void lambda$run$0(Throwable th) {
        C1C7U.LIZ("SDKServiceInitTask@3f71.run$1L");
        if (th == null) {
            th = new UnknownError("unknown error");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message = ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJ("RxJava", C2188811AlT.LIZIZ(sbLIZ));
        if (th.getStackTrace() != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("\t\t");
                sbLIZ2.append(stackTraceElement.toString());
                C20441214yg.LJ("RxJava", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        C1C7U.LIZIZ("SDKServiceInitTask@3f71.run$1L");
    }
}
