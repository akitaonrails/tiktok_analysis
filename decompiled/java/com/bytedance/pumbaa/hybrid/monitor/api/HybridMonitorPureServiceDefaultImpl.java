package com.bytedance.pumbaa.hybrid.monitor.api;

import X.AbstractC19994813Le;
import X.C0VZK;
import X.C0WLD;
import X.C0WLE;
import android.view.View;
import com.bytedance.pumbaa.hybrid.monitor.jsb.HybridMonitorJsbServiceImpl;
import com.bytedance.pumbaa.hybrid.monitor.jsinjection.HybridMonitorJsInjectionServiceImpl;
import com.bytedance.pumbaa.hybrid.monitor.webview.HybridMonitorWebViewServiceImpl;

/* JADX INFO: loaded from: classes14.dex */
public class HybridMonitorPureServiceDefaultImpl implements IHybridMonitorPureService {
    private final void changeMonitorConfigBySample(C0WLD c0wld) {
        PnsHybridMonitorSampleModel pnsHybridMonitorSampleModel = c0wld.LIZLLL;
        if (pnsHybridMonitorSampleModel == null) {
            PnsHybridMonitorSampleModel pnsHybridMonitorSampleModel2 = C0WLE.LIZ;
            pnsHybridMonitorSampleModel = (PnsHybridMonitorSampleModel) C0VZK.LIZIZ().LIZJ(PnsHybridMonitorSampleModel.class, "pns_hybrid_monitor_sample", pnsHybridMonitorSampleModel2);
            if (pnsHybridMonitorSampleModel == null) {
                pnsHybridMonitorSampleModel = pnsHybridMonitorSampleModel2;
            }
        }
        if (c0wld.LIZ.LIZ && !changeMonitorConfigBySample$sample(pnsHybridMonitorSampleModel.webview, "webview")) {
            c0wld.LIZ.LIZ = false;
        }
        if (c0wld.LIZIZ.LIZ && !changeMonitorConfigBySample$sample(pnsHybridMonitorSampleModel.jsb, "jsb")) {
            c0wld.LIZIZ.LIZ = false;
        }
        if (c0wld.LIZJ.LIZ && !changeMonitorConfigBySample$sample(pnsHybridMonitorSampleModel.jsinjection, "jsinjection")) {
            c0wld.LIZJ.LIZ = false;
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorPureService
    public void init(C0WLD c0wld) {
        changeMonitorConfigBySample(c0wld);
        IHybridWebViewMonitorService iHybridWebViewMonitorServiceLIZLLL = HybridMonitorWebViewServiceImpl.LIZLLL();
        if (iHybridWebViewMonitorServiceLIZLLL != null) {
            iHybridWebViewMonitorServiceLIZLLL.LIZ(c0wld.LIZ);
        }
        IHybridJsInjectionMonitorService iHybridJsInjectionMonitorServiceLIZLLL = HybridMonitorJsInjectionServiceImpl.LIZLLL();
        if (iHybridJsInjectionMonitorServiceLIZLLL != null) {
            iHybridJsInjectionMonitorServiceLIZLLL.LIZ(c0wld.LIZJ);
        }
        IHybridJsbMonitorService iHybridJsbMonitorServiceLIZLLL = HybridMonitorJsbServiceImpl.LIZLLL();
        if (iHybridJsbMonitorServiceLIZLLL != null) {
            iHybridJsbMonitorServiceLIZLLL.LIZ(c0wld.LIZIZ);
        }
    }

    public void updateConfig(C0WLD c0wld) {
        changeMonitorConfigBySample(c0wld);
        IHybridWebViewMonitorService iHybridWebViewMonitorServiceLIZLLL = HybridMonitorWebViewServiceImpl.LIZLLL();
        if (iHybridWebViewMonitorServiceLIZLLL != null) {
            iHybridWebViewMonitorServiceLIZLLL.LIZJ(c0wld.LIZ);
        }
        IHybridJsInjectionMonitorService iHybridJsInjectionMonitorServiceLIZLLL = HybridMonitorJsInjectionServiceImpl.LIZLLL();
        if (iHybridJsInjectionMonitorServiceLIZLLL != null) {
            iHybridJsInjectionMonitorServiceLIZLLL.LIZJ(c0wld.LIZJ);
        }
        IHybridJsbMonitorService iHybridJsbMonitorServiceLIZLLL = HybridMonitorJsbServiceImpl.LIZLLL();
        if (iHybridJsbMonitorServiceLIZLLL != null) {
            iHybridJsbMonitorServiceLIZLLL.LIZJ(c0wld.LIZIZ);
        }
    }

    public static final boolean changeMonitorConfigBySample$sample(double d, String str) {
        if (AbstractC19994813Le.Default.nextDouble() <= d) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorPureService
    public void notifySparkWebViewEvent(String str, View view) {
        IHybridWebViewMonitorService iHybridWebViewMonitorServiceLIZLLL = HybridMonitorWebViewServiceImpl.LIZLLL();
        if (iHybridWebViewMonitorServiceLIZLLL != null) {
            iHybridWebViewMonitorServiceLIZLLL.LIZIZ(str);
        }
    }
}
