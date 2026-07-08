package com.ss.mediakit.net;

import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class DefaultConstructor implements CreateConstructor {
    @Override // com.ss.mediakit.net.CreateConstructor
    public BaseDNS createDns(String str, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        try {
            return new HTTPDNS(str, aVMDLNetClient, i, handler);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
