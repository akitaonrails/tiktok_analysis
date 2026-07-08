package com.lynx.jsbridge;

import X.InterfaceC1292320jja;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.utils.CallStackUtil;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class RuntimeLifecycleListenerDelegate implements InterfaceC1292320jja {
    public InterfaceC1292320jja mListener;
    public final WeakReference<s> mLynxContextWeak;

    @Override // X.InterfaceC1292320jja
    public void onRuntimeDetach() {
        InterfaceC1292320jja interfaceC1292320jja = this.mListener;
        if (interfaceC1292320jja != null) {
            try {
                interfaceC1292320jja.onRuntimeDetach();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                onError(e);
            }
        }
    }

    private void onError(Exception exc) {
        LynxLog.e("RuntimeListenerDelegate", exc.toString());
        s sVar = this.mLynxContextWeak.get();
        if (sVar != null) {
            String strLIZ = CallStackUtil.LIZ(exc);
            LynxError lynxError = new LynxError(20301, exc.getMessage());
            lynxError.LJII(strLIZ);
            sVar.LJIILLIIL(lynxError);
        }
    }

    @Override // X.InterfaceC1292320jja
    public void onRuntimeAttach(long j) {
        InterfaceC1292320jja interfaceC1292320jja = this.mListener;
        if (interfaceC1292320jja != null) {
            try {
                interfaceC1292320jja.onRuntimeAttach(j);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                onError(e);
            }
        }
    }

    public RuntimeLifecycleListenerDelegate(WeakReference<s> weakReference, InterfaceC1292320jja interfaceC1292320jja) {
        this.mLynxContextWeak = weakReference;
        this.mListener = interfaceC1292320jja;
    }
}
