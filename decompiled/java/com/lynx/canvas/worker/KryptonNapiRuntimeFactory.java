package com.lynx.canvas.worker;

import X.AbstractC1299380juy;
import X.C1288370jdD;
import X.C1299400jv0;
import com.lynx.canvas.KryptonApp;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class KryptonNapiRuntimeFactory {
    public final WeakReference<KryptonApp> LIZ;

    public native void nativeOnNapiRuntimeAttach(long j, long j2, String str);

    public native void nativeOnNapiRuntimeDetach(long j);

    public final AbstractC1299380juy LIZ() {
        KryptonApp kryptonApp = this.LIZ.get();
        if (kryptonApp == null) {
            C1288370jdD.LIZJ("KryptonNapiRuntimeFactory", "[worker] app == null");
            return null;
        }
        AbstractC1299380juy abstractC1299380juy = (AbstractC1299380juy) kryptonApp.LJ(AbstractC1299380juy.class);
        if (abstractC1299380juy != null) {
            return abstractC1299380juy;
        }
        C1288370jdD.LIZJ("KryptonNapiRuntimeFactory", "[worker] service == null");
        return null;
    }

    public KryptonNapiRuntimeFactory(KryptonApp kryptonApp) {
        this.LIZ = new WeakReference<>(kryptonApp);
    }

    public Object createNapiRuntime(long j) {
        AbstractC1299380juy abstractC1299380juyLIZ = LIZ();
        if (abstractC1299380juyLIZ == null) {
            return null;
        }
        C1288370jdD.LIZJ("KryptonNapiRuntimeFactory", "[worker] create napi runtime");
        return abstractC1299380juyLIZ.LIZ(new C1299400jv0(this, j));
    }

    public void destroyNapiRuntime(Object obj) {
        AbstractC1299380juy abstractC1299380juyLIZ = LIZ();
        if (abstractC1299380juyLIZ == null) {
            return;
        }
        C1288370jdD.LIZJ("KryptonNapiRuntimeFactory", "[worker] destory napi runtime");
        abstractC1299380juyLIZ.LIZIZ(obj);
    }
}
