package com.lynx.tasm;

import X.AbstractC1298860ju8;
import X.C1289620jfE;
import X.C1297430jrp;
import X.C1299310jur;
import X.C1299320jus;
import X.C1299340juu;
import X.C2188811AlT;
import X.InterfaceC1297320jre;
import X.InterfaceC1299820jvg;
import Y.ARunnableS1S2101000_20;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.devtoolwrapper.LynxDevtool;
import com.lynx.jsbridge.LynxFetchModule;
import com.lynx.jsbridge.LynxModuleFactory;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.base.CleanupReference;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.resource.LynxResourceLoader;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class LynxBackgroundRuntime implements InterfaceC1299820jvg {
    public final C1299310jur LIZ;
    public final LynxModuleFactory LIZIZ;
    public final JSProxy LIZJ;
    public final CopyOnWriteArrayList<AbstractC1298860ju8> LIZLLL;
    public LynxDevtool LJ;
    public final long LJFF;
    public volatile String LJI;
    public int LJII;
    public final Object LJIIIIZZ;
    public LynxResourceLoader mResourceLoader;

    public LynxBackgroundRuntime() {
        throw null;
    }

    private native long nativeCreateBackgroundRuntimeWrapper(LynxResourceLoader lynxResourceLoader, LynxModuleFactory lynxModuleFactory, long j, long j2, String str, String str2, String[] strArr, String str3, int i, long j3, boolean z);

    private native void nativeDestroyRuntime(long j);

    public static native void nativeDestroyWrapper(long j);

    private native void nativeEvaluateScript(long j, String str, byte[] bArr);

    private native void nativeEvaluateTemplateBundle(long j, String str, long j2, String str2);

    private native int nativeGetRuntimeId(long j);

    private native void nativeGetSessionStorageItem(long j, String str, PlatformCallBack platformCallBack);

    private native void nativeSetPresetData(long j, boolean z, long j2);

    private native void nativeSetSessionStorageItem(long j, String str, long j2, boolean z);

    private native double nativeSubscribeSessionStorage(long j, String str, PlatformCallBack platformCallBack);

    private native void nativeTransitionToFullRuntime(long j);

    private native void nativeUnsubscribeSessionStorage(long j, String str, double d);

    public final void LIZ() {
        synchronized (this.LJIIIIZZ) {
            try {
                if (this.LJII != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("call destroy on invalid state, will be ignored, state: ");
                    sbLIZ.append(this.LJII);
                    LynxLog.e("LynxBackgroundRuntime", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                LynxDevtool lynxDevtool = this.LJ;
                if (lynxDevtool != null) {
                    lynxDevtool.getClass();
                    this.LJ = null;
                }
                nativeDestroyRuntime(this.LJFF);
                this.LJII = 2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LIZLLL() {
        long j = this.LJFF;
        if (j == 0) {
            return -1;
        }
        return nativeGetRuntimeId(j);
    }

    @Override // X.InterfaceC1299820jvg
    public void onErrorOccurred(LynxError lynxError) {
        C1289620jfE.LIZJ(new ARunnableS89S0200000_20(lynxError, this, 43));
    }

    public void onEvaluateJavaScriptEnd(String str) {
        C1289620jfE.LIZJ(new ARunnableS25S1100000_20(this, str, 10));
    }

    public final void LIZIZ(String str, String str2) {
        LynxDevtool lynxDevtool;
        synchronized (this.LJIIIIZZ) {
            try {
                if (this.LJII == 0 && (lynxDevtool = this.LJ) != null) {
                    lynxDevtool.LIZLLL(str, null, null, null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.LJFF != 0) {
            this.LJI = str;
            nativeEvaluateScript(this.LJFF, str, str2.getBytes(Charset.forName("UTF-8")));
        }
    }

    public final void LIZJ(String str, TemplateBundle templateBundle) {
        LynxDevtool lynxDevtool;
        synchronized (this.LJIIIIZZ) {
            try {
                if (this.LJII == 0 && (lynxDevtool = this.LJ) != null) {
                    lynxDevtool.LIZLLL(str, null, null, null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.LJFF != 0 && templateBundle.LJFF()) {
            this.LJI = str;
            nativeEvaluateTemplateBundle(this.LJFF, str, templateBundle.LLILLJJLI, "/app-service.js");
        }
    }

    public final void LJ(String str, JavaOnlyArray javaOnlyArray) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxContext sendGlobalEvent ");
        sbLIZ.append(str);
        sbLIZ.append(" with this: ");
        sbLIZ.append(toString());
        LynxLog.i("LynxBackgroundRuntime", C2188811AlT.LIZIZ(sbLIZ));
        JSProxy jSProxy = this.LIZJ;
        jSProxy.getClass();
        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
        javaOnlyArray2.pushString(str);
        javaOnlyArray2.pushArray(javaOnlyArray);
        jSProxy.LIZIZ("GlobalEventEmitter", "emit", javaOnlyArray2);
    }

    public final void LJFF(String str, TemplateData templateData) {
        if (this.LJFF != 0 && templateData != null && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSessionStorageItem with key: ");
            sbLIZ.append(str);
            LynxLog.d("LynxBackgroundRuntime", C2188811AlT.LIZIZ(sbLIZ));
            templateData.LJI();
            if (templateData.LIZ == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setSessionStorageItem with zero data! key: ");
                sbLIZ2.append(str);
                LynxLog.e("LynxBackgroundRuntime", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            nativeSetSessionStorageItem(this.LJFF, str, templateData.LIZ, templateData.LJ);
        }
    }

    public LynxBackgroundRuntime(final Context context, C1299310jur c1299310jur, boolean z) {
        String str;
        String[] strArr;
        LynxWhiteBoard lynxWhiteBoard;
        long j;
        String str2 = "";
        this.LJI = "";
        this.LJIIIIZZ = new Object();
        this.LIZLLL = new CopyOnWriteArrayList<>();
        new HashMap();
        if (!LynxEnv.inst().isNativeLibraryLoaded()) {
            LynxLog.e("LynxBackgroundRuntime", "LynxBackgroundRuntime constructor called before LynxEnv init");
            this.LJII = 8;
            return;
        }
        this.LJII = 0;
        this.LIZ = c1299310jur;
        LynxModuleFactory lynxModuleFactory = new LynxModuleFactory();
        this.LIZIZ = lynxModuleFactory;
        C1299320jus c1299320jus = new C1299320jus();
        c1299320jus.LIZIZ = new WeakReference<>(this);
        lynxModuleFactory.LIZJ("LynxFetchModule", LynxFetchModule.class, c1299320jus);
        lynxModuleFactory.LIZ(c1299310jur.LIZLLL);
        lynxModuleFactory.LIZJ = new C1297430jrp(new InterfaceC1297320jre() { // from class: X.0juq
            public final WeakReference<Context> LIZ;

            @Override // X.InterfaceC1297320jre
            public final void LIZIZ(String str3, WeakReference<Context> weakReference) {
            }

            {
                this.LIZ = new WeakReference<>(context);
            }

            @Override // X.InterfaceC1297320jre
            public final WeakReference<Context> LIZ(String str3) {
                return this.LIZ;
            }
        });
        if (LynxEnv.inst().isLynxDebugEnabled()) {
            this.LJ = new LynxDevtool(z);
        }
        C1299340juu c1299340juu = c1299310jur.LIZJ;
        if (c1299340juu != null) {
            str = c1299340juu.LIZJ;
        } else {
            str = "-1";
        }
        if (c1299340juu != null) {
            strArr = c1299340juu.LIZLLL;
        } else {
            strArr = null;
        }
        if (c1299340juu != null && c1299340juu.LJ) {
            str2 = c1299340juu.LIZJ;
        }
        this.mResourceLoader = new LynxResourceLoader(c1299310jur, null, this, c1299310jur.LJIIIZ, c1299310jur.LJII);
        if (c1299340juu != null && (lynxWhiteBoard = c1299340juu.LJFF) != null) {
            j = lynxWhiteBoard.LIZ;
        } else {
            j = 0;
        }
        int iLIZ = c1299310jur.LIZ(false);
        TemplateData templateData = c1299310jur.LJI;
        final long jNativeCreateBackgroundRuntimeWrapper = nativeCreateBackgroundRuntimeWrapper(this.mResourceLoader, lynxModuleFactory, 0L, j, str, str2, strArr, c1299310jur.LIZIZ, iLIZ, templateData != null ? templateData.LIZ : 0L, z);
        this.LJFF = jNativeCreateBackgroundRuntimeWrapper;
        TemplateData templateData2 = c1299310jur.LJFF;
        if (templateData2 != null) {
            nativeSetPresetData(jNativeCreateBackgroundRuntimeWrapper, templateData2.LJ, templateData2.LIZ);
        }
        final JSProxy jSProxy = new JSProxy(this, str2);
        this.LIZJ = jSProxy;
        new CleanupReference(this, new Runnable(jNativeCreateBackgroundRuntimeWrapper, jSProxy) { // from class: X.0jjb
            public long LL;
            public final JSProxy LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LynxBackgroundRuntime$CleanupOnUiThread@9d4.run");
                try {
                    if (this.LL != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("destory wrapper ");
                        sbLIZ.append(this.LL);
                        LynxLog.w("LynxBackgroundRuntime", C2188811AlT.LIZIZ(sbLIZ));
                        LynxBackgroundRuntime.nativeDestroyWrapper(this.LL);
                        this.LL = 0L;
                        this.LLILLJJLI.LJFF();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LynxBackgroundRuntime$CleanupOnUiThread@9d4.run");
            }

            {
                this.LL = jNativeCreateBackgroundRuntimeWrapper;
                this.LLILLJJLI = jSProxy;
            }
        });
    }

    public void onModuleMethodInvoked(String str, String str2, int i) {
        C1289620jfE.LIZJ(new ARunnableS1S2101000_20(this, str, str2, i, 2));
    }
}
