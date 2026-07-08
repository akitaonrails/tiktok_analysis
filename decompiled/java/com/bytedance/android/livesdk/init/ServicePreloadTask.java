package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import X.InterfaceC1161930gLH;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes19.dex */
public class ServicePreloadTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "service_preload_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        if (LiveServiceManagerOptSetting.enable()) {
            try {
                Class<?> cls = Class.forName("com.bytedance.android.live.service.initializer.ServiceInitializerV2");
                cls.getDeclaredMethod("preloadServiceClasses", new Class[0]).invoke(null, new Object[0]);
                Object objNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof InterfaceC1161930gLH) {
                    C1161920gLG.LIZ = (InterfaceC1161930gLH) objNewInstance;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
