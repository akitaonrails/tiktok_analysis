package org.chromium.mpa;

import X.InterfaceC1498510p69;
import X.InterfaceC1498520p6A;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.e;
import com.ttnet.org.chromium.net.f0;
import java.util.List;
import org.chromium.CronetClient;

/* JADX INFO: loaded from: classes24.dex */
public class CronetMpaServiceImpl {
    public e mCronetEngine;
    public InterfaceC1498520p6A mOuterAccAddressCallback;
    public InterfaceC1498520p6A mOuterInitCallback;
    public f0 mTTNetMpaService;
    public InterfaceC1498510p69 mCronetInitCallback = new InterfaceC1498510p69() { // from class: org.chromium.mpa.CronetMpaServiceImpl.1
        @Override // X.InterfaceC1498510p69
        public void onFinish(boolean z, String str) {
            CronetMpaServiceImpl.this.getClass();
        }
    };
    public InterfaceC1498510p69 mCronetAccAddressCallback = new InterfaceC1498510p69() { // from class: org.chromium.mpa.CronetMpaServiceImpl.2
        @Override // X.InterfaceC1498510p69
        public void onFinish(boolean z, String str) {
            synchronized (CronetMpaServiceImpl.class) {
                try {
                    CronetMpaServiceImpl.this.getClass();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    };

    private boolean loadCronetKernel() {
        if (this.mCronetEngine != null) {
            return true;
        }
        try {
            Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("preInitCronetKernel");
            e cronetEngine = CronetClient.getCronetEngine();
            this.mCronetEngine = cronetEngine;
            return cronetEngine != null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public void start() {
        f0 f0Var = this.mTTNetMpaService;
        if (f0Var != null) {
            f0Var.LIZLLL();
        }
    }

    public void stop() {
        f0 f0Var = this.mTTNetMpaService;
        if (f0Var != null) {
            f0Var.LJ();
        }
    }

    private boolean createMpaService() {
        if (!loadCronetKernel()) {
            return false;
        }
        if (this.mTTNetMpaService != null) {
            return true;
        }
        this.mTTNetMpaService = this.mCronetEngine.LIZ();
        return true;
    }

    public void init(InterfaceC1498520p6A interfaceC1498520p6A) {
        if (!createMpaService()) {
            interfaceC1498520p6A.LIZLLL();
        } else {
            this.mTTNetMpaService.LIZIZ(this.mCronetInitCallback);
        }
    }

    public void command(String str, String str2) {
        f0 f0Var = this.mTTNetMpaService;
        if (f0Var != null) {
            f0Var.LIZ(str, str2);
        }
    }

    public void setAccAddress(List<String> list, InterfaceC1498520p6A interfaceC1498520p6A) {
        if (this.mTTNetMpaService != null) {
            synchronized (CronetMpaServiceImpl.class) {
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.mTTNetMpaService.LIZJ(list, this.mCronetAccAddressCallback);
            return;
        }
        if (interfaceC1498520p6A != null) {
            interfaceC1498520p6A.LIZLLL();
        }
    }
}
