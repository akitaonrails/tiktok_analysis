package com.bytedance.pumbaa.common.impl.exception.monitor;

import X.C801800Vco;
import X.C805380Via;
import com.bytedance.crash.Npth;
import com.bytedance.crash.monitor.k;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import im3.c;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class ExceptionMonitorImpl implements IExceptionMonitor {
    @Override // com.bytedance.pumbaa.common.interfaces.IExceptionMonitor
    public final void setDebugMode(boolean z) {
        Npth.getConfigManager().setDebugMode(z);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IExceptionMonitor
    public final void monitorThrowable(Throwable th, String str, Map<String, String> map) {
        C805380Via.LIZLLL(th, str, map);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IExceptionMonitor
    public final void monitorNativeException(String str, String str2, String str3, String str4, Map<String, String> map) {
        k.LIZJ().LJIIIIZZ(str, str2, str3, str4, null, map);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IExceptionMonitor
    public final void monitorThrowable(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        C801800Vco c801800VcoLJFF = C801800Vco.LJFF(new StackTraceElement(ExceptionMonitorImpl.class.getName(), "", "", 0), str, str2, str5, z, str4, str3);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c801800VcoLJFF.LIZ(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            c801800VcoLJFF.LIZIZ(entry2.getKey(), entry2.getValue());
        }
        c.LIZ(c801800VcoLJFF);
    }
}
