package org.chromium;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public class CronetDependManager implements ICronetDepend {
    public static volatile CronetDependManager sCronetDependManager;
    public ICronetDepend mCronetDependAdapter;

    public static CronetDependManager inst() {
        if (sCronetDependManager == null) {
            synchronized (CronetDependManager.class) {
                try {
                    if (sCronetDependManager == null) {
                        sCronetDependManager = new CronetDependManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sCronetDependManager;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        ICronetDepend iCronetDepend = this.mCronetDependAdapter;
        return iCronetDepend != null ? iCronetDepend.getSsCookieKey() : "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        ICronetDepend iCronetDepend = this.mCronetDependAdapter;
        if (iCronetDepend != null) {
            return iCronetDepend.loggerDebug();
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
        this.mCronetDependAdapter = iCronetDepend;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
        ICronetDepend iCronetDepend = this.mCronetDependAdapter;
        if (iCronetDepend != null) {
            iCronetDepend.loggerD(str, str2);
        }
    }
}
