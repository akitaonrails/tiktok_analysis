package com.bytedance.vmsdk.worker;

import X.C08FF;
import X.C08GQ;
import X.C098200Yq;
import X.C1299270jun;
import X.C1506450pIx;
import X.C1535560q3u;
import X.C189200o6;
import X.C1C7U;
import X.C21139717o3;
import X.C21320918cB;
import X.C21321118cD;
import X.C21344518fz;
import X.C21345018g4;
import X.C21345218g6;
import X.C21346518gJ;
import X.C21346818gM;
import X.C21347418gS;
import X.C2188811AlT;
import X.C259800zU;
import X.EnumC1535440q3i;
import X.InterfaceC1503680pEU;
import X.InterfaceC1503710pEX;
import X.InterfaceC1532650pzD;
import X.InterfaceC20225314Bv;
import X.InterfaceC20225414Bw;
import X.InterfaceC21345118g5;
import X.InterfaceC21345618gA;
import Y.ARunnableS132S0100000_32;
import Y.ARunnableS23S0100100_23;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.worker.network.WorkerDelegate;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import com.bytedance.vmsdk.net.Request;
import com.bytedance.vmsdk.net.Response;
import com.bytedance.vmsdk.registry.JavaScriptRegistry;
import com.bytedance.vmsdk.worker.JsWorker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class JsWorker {
    public static boolean isInitialised;
    public boolean isIcuInitialised;
    public C21321118cD mDevTool;
    public EngineType mEngineType;
    public IWorkerExceptionDelegate mExceptionDelegate;
    public C21344518fz mInspectorClientNew;
    public JavaScriptRegistry mJavaScriptModuleRegistry;
    public JSModuleManager mModuleManager;
    public AtomicLong mNativeWorkerPtr;
    public InterfaceC21345618gA mOnErrorCallback;
    public InterfaceC21345618gA mOnMessageCallback;
    public int mSrcID;
    public InterfaceC1503710pEX mWorkerDelegate;

    public JsWorker() {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mDevTool = null;
        this.mInspectorClientNew = null;
        EngineType engineType = EngineType.QUICKJS;
        this.mEngineType = engineType;
        this.mSrcID = -1;
        this.isIcuInitialised = false;
        init(null, engineType, null, false, "unknown_android", false, false, false, false);
    }

    public static boolean initDevtool() {
        boolean z = false;
        try {
            Long l = (Long) Class.forName("com.bytedance.vmsdk.devtool.DevtoolManager").getMethod("initialize", new Class[0]).invoke(null, new Object[0]);
            if (l == null || l.longValue() == 0) {
                return false;
            }
            nativeInitInspectorFactory(l.longValue());
            z = true;
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return z;
        }
    }

    private native void nativeBind(long j, int i, int i2);

    public static native long nativeCreateWorker(JsWorker jsWorker, long j, JSModuleManager jSModuleManager, String str, boolean z, String str2, boolean z2);

    private native void nativeEvaluateCodeCache(long j, byte[] bArr);

    public static native void nativeEvaluateJavaScript(long j, String str, String str2, boolean z);

    public static native byte[] nativeGenCodeCache(String str, long j);

    private native long nativeGetNapiEnv(long j);

    public static native void nativeInitInspector(long j, long j2);

    public static native void nativeInitInspectorFactory(long j);

    public static native void nativeInitQJSWebAssembly(long j, long j2);

    private native Object nativeInvokeJavaScriptFunction(long j, String str, JavaOnlyArray javaOnlyArray, char c);

    private native Object nativeInvokeJavaScriptModule(long j, String str, String str2, JavaOnlyArray javaOnlyArray, char c);

    private native void nativeOnCloseInspectorSession(long j);

    private native void nativeOnInspectorMessage(long j, String str);

    private native void nativeOnJSRunner(long j, Runnable runnable);

    private native void nativeOnJSRunnerAtFront(long j, Runnable runnable);

    private native void nativeOnJSRunnerDelay(long j, Runnable runnable, long j2);

    private native void nativeOnOpenInspectorSession(long j);

    private native void nativeOnPlatformRunner(long j, Runnable runnable);

    private native void nativeOnWorkerRunner(long j, Runnable runnable);

    public static native void nativePostMessage(long j, String str);

    public static native void nativeRegisterDelegateFunction(long j);

    public static native void nativeReject(long j, String str, long j2);

    public static native void nativeResolve(long j, Response response, long j2);

    private native void nativeSetExceptionDelegate(long j, IWorkerExceptionDelegate iWorkerExceptionDelegate);

    private native void nativeSetProperties(long j, JavaOnlyMap javaOnlyMap);

    private native void nativeSetupLoader(long j, String str);

    public static native void nativeTerminate(long j);

    private native void nativeTriggerGC(long j);

    public static native void nativeV8PipeInit(long j, long[] jArr);

    public static boolean preLoadPlugin(String str) {
        return true;
    }

    public static void v8pipeInit(long[] jArr) {
    }

    public static long getWasmRegisterFunctionPtr() {
        try {
            return ((Long) Class.forName("com.bytedance.vmsdk.wasm.RegisterWebAssembly").getMethod("registerWebAssembly", new Class[0]).invoke(null, new Object[0])).longValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static boolean initialize() {
        String[] strArr = {"quick", "napi", "worker"};
        int i = 0;
        boolean z = false;
        do {
            try {
                INVOKESTATIC_com_bytedance_vmsdk_worker_JsWorker_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(strArr[i]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                z = true;
            }
            i++;
        } while (i < 3);
        initDevtool();
        isInitialised = !z;
        return !z;
    }

    public static boolean initializeWithoutThrow() {
        String[] strArr = {"quick", "napi", "worker"};
        int i = 0;
        do {
            INVOKESTATIC_com_bytedance_vmsdk_worker_JsWorker_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(strArr[i]);
            i++;
        } while (i < 3);
        isInitialised = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerICU$0() {
        C1C7U.LIZ("JsWorker@ae4e.registerICU$1L");
        long jNativeGetNapiEnv = nativeGetNapiEnv(this.mNativeWorkerPtr.get());
        if (jNativeGetNapiEnv != 0) {
            try {
                Class.forName("com.bytedance.vmsdk.icu.RegisterICU").getMethod("nativeRegisterICUInNapiEnv", Long.TYPE).invoke(null, Long.valueOf(jNativeGetNapiEnv));
                this.isIcuInitialised = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("JsWorker@ae4e.registerICU$1L");
    }

    private void registerICU() {
        try {
            INVOKESTATIC_com_bytedance_vmsdk_worker_JsWorker_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("icu");
            postOnJSRunner(new ARunnableS132S0100000_32(this, 89));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private boolean workDelegateExists() {
        return this.mWorkerDelegate != null;
    }

    public long getNapiEnv() {
        if (this.mNativeWorkerPtr.get() != 0) {
            return nativeGetNapiEnv(this.mNativeWorkerPtr.get());
        }
        return 0L;
    }

    public long getNativePtr() {
        return this.mNativeWorkerPtr.get();
    }

    public boolean isRunning() {
        return this.mNativeWorkerPtr.get() != 0;
    }

    public void terminate() {
        if (this.mOnMessageCallback != null) {
            this.mOnMessageCallback = null;
        }
        if (this.mOnErrorCallback != null) {
            this.mOnErrorCallback = null;
        }
        C21321118cD c21321118cD = this.mDevTool;
        if (c21321118cD != null) {
            InterfaceC21345118g5 interfaceC21345118g5 = c21321118cD.LIZ;
            if (interfaceC21345118g5 != null) {
                interfaceC21345118g5.destroy();
                c21321118cD.LIZ = null;
            }
            this.mDevTool = null;
        }
        C21344518fz c21344518fz = this.mInspectorClientNew;
        if (c21344518fz != null) {
            C21345018g4 c21345018g4 = C21344518fz.LJII;
            C21345218g6 c21345218g6 = c21345018g4.LIZLLL;
            synchronized (c21345218g6.LIZIZ) {
                try {
                    ((ArrayList) c21345218g6.LIZIZ).remove(c21344518fz);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c21345018g4.LJ.LIZIZ(c21344518fz.LJ, c21344518fz.LJFF);
            this.mInspectorClientNew = null;
        }
        JSModuleManager jSModuleManager = this.mModuleManager;
        if (jSModuleManager != null) {
            jSModuleManager.destroy();
            this.mModuleManager = null;
        }
        if (this.mNativeWorkerPtr.get() != 0) {
            isInitialised = false;
            long andSet = this.mNativeWorkerPtr.getAndSet(0L);
            if (andSet != 0) {
                nativeTerminate(andSet);
            }
        }
    }

    public void onCloseInspectorSession() {
        if (isRunning()) {
            nativeOnCloseInspectorSession(this.mNativeWorkerPtr.get());
        }
    }

    public void onOpenInspectorSession() {
        if (isRunning()) {
            nativeOnOpenInspectorSession(this.mNativeWorkerPtr.get());
        }
    }

    public void triggerGC() {
        if (isRunning()) {
            nativeTriggerGC(this.mNativeWorkerPtr.get());
        }
    }

    public static boolean isIsInitialised() {
        return isInitialised;
    }

    public EngineType EngineType() {
        return this.mEngineType;
    }

    public IWorkerExceptionDelegate getDelegate() {
        return this.mExceptionDelegate;
    }

    public C21344518fz getInspectorClient() {
        return this.mInspectorClientNew;
    }

    public JSModuleManager getModuleManager() {
        return this.mModuleManager;
    }

    public int id() {
        return this.mSrcID;
    }

    public boolean isIsIcuInitialised() {
        return this.isIcuInitialised;
    }

    public enum EngineType {
        QUICKJS,
        V8;

        public static EngineType valueOf(String str) {
            return (EngineType) C08FF.LIZ(EngineType.class, str);
        }
    }

    public JsWorker(C21320918cB c21320918cB) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mDevTool = null;
        this.mInspectorClientNew = null;
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        this.isIcuInitialised = false;
        init(c21320918cB.LJFF, c21320918cB.LIZ, c21320918cB.LIZJ, c21320918cB.LIZLLL, c21320918cB.LIZIZ, c21320918cB.LJ, false, false, c21320918cB.LJI);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.net.Uri] */
    private String FetchJsWithUrlSync(String str) {
        Object c098200Yq;
        InterfaceC1503710pEX interfaceC1503710pEX = this.mWorkerDelegate;
        if (interfaceC1503710pEX != null) {
            WorkerDelegate workerDelegate = (WorkerDelegate) interfaceC1503710pEX;
            Object obj = null;
            if (str == null) {
                return null;
            }
            C259800zU c259800zU = new C259800zU();
            try {
                c259800zU.element = UriProtector.parse(str);
                c098200Yq = workerDelegate.LIZLLL.LIZ(EnumC1535440q3i.Auto, new C1535560q3u(c259800zU));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            C189200o6.m8isSuccessimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return C21346518gJ.LIZ((InterfaceC1532650pzD) obj);
        }
        return "";
    }

    public static void INVOKESTATIC_com_bytedance_vmsdk_worker_JsWorker_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    private void SendInspectorResponse(String str) {
        C21344518fz c21344518fz = this.mInspectorClientNew;
        if (c21344518fz != null && c21344518fz.LIZ != null) {
            C21346818gM c21346818gM = (C21346818gM) c21344518fz.LIZ;
            c21346818gM.getClass();
            byte[] bArrLIZ = C08GQ.LIZ(str);
            c21346818gM.LIZ(C21347418gS.LIZ(bArrLIZ, bArrLIZ.length, (byte) 1));
        }
    }

    public static String getCacheFilePath(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/woker_code_cache.bin");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean initializeWithPlugin(String str) {
        boolean z;
        try {
            LoadSoLancet.LIZJ("quick");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("quick");
            LoadSoLancet.LJ(jUptimeMillis, "quick");
            LoadSoLancet.LIZLLL(jUptimeMillis, "quick");
            LoadSoLancet.LIZIZ("quick");
            z = true;
        } catch (Throwable th) {
            z = false;
            try {
                TryCatchGuardChecker.doCheck(th);
                z = false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return z;
            }
        }
        if (!isInitialised) {
            isInitialised = z;
        }
        return z;
    }

    public static boolean initializeWithPlugin2(String str) {
        if (!isInitialised) {
            isInitialised = true;
        }
        return true;
    }

    private void onError(String str) {
        InterfaceC21345618gA interfaceC21345618gA = this.mOnErrorCallback;
        if (interfaceC21345618gA != null) {
            interfaceC21345618gA.LIZ(str);
        }
    }

    private void onMessage(String str) {
        InterfaceC21345618gA interfaceC21345618gA = this.mOnMessageCallback;
        if (interfaceC21345618gA != null) {
            interfaceC21345618gA.LIZ(str);
        }
    }

    public void evaluateCodeCache(byte[] bArr) {
        if (isRunning()) {
            nativeEvaluateCodeCache(this.mNativeWorkerPtr.get(), bArr);
        }
    }

    public void evaluateJavaScript(String str) {
        if (isRunning()) {
            nativeEvaluateJavaScript(this.mNativeWorkerPtr.get(), str, null, false);
        }
    }

    public <T extends InterfaceC20225314Bv> T getJavaScriptFunction(Class<T> cls) {
        return (T) this.mJavaScriptModuleRegistry.getJavaScriptFunction(this, cls);
    }

    public <T extends InterfaceC20225414Bw> T getJavaScriptModule(Class<T> cls) {
        return (T) this.mJavaScriptModuleRegistry.getJavaScriptModule(this, cls);
    }

    public void initInspector(long j) {
        nativeInitInspector(this.mNativeWorkerPtr.get(), j);
    }

    public void initV8Pipe(long[] jArr) {
        if (jArr != null && jArr.length > 3) {
            nativeV8PipeInit(this.mNativeWorkerPtr.get(), jArr);
        }
    }

    public void onInspectorMessage(String str) {
        if (isRunning()) {
            nativeOnInspectorMessage(this.mNativeWorkerPtr.get(), str);
        }
    }

    public void postMessage(String str) {
        if (isRunning()) {
            nativePostMessage(this.mNativeWorkerPtr.get(), str);
        }
    }

    public void postOnJSRunner(Runnable runnable) {
        if (isRunning()) {
            nativeOnJSRunner(this.mNativeWorkerPtr.get(), runnable);
        }
    }

    public void postOnJSRunnerAtFront(Runnable runnable) {
        if (isRunning()) {
            nativeOnJSRunnerAtFront(this.mNativeWorkerPtr.get(), runnable);
        }
    }

    public void postOnPlatformRunner(Runnable runnable) {
        if (this.mNativeWorkerPtr.get() != 0) {
            nativeOnPlatformRunner(this.mNativeWorkerPtr.get(), runnable);
        }
    }

    public void postOnWorkerRunner(Runnable runnable) {
        if (isRunning()) {
            nativeOnWorkerRunner(this.mNativeWorkerPtr.get(), runnable);
        }
    }

    public void setDelegate(IWorkerExceptionDelegate iWorkerExceptionDelegate) {
        if (iWorkerExceptionDelegate != null && this.mNativeWorkerPtr.get() != 0) {
            this.mExceptionDelegate = iWorkerExceptionDelegate;
            nativeSetExceptionDelegate(this.mNativeWorkerPtr.get(), iWorkerExceptionDelegate);
        }
    }

    public void setGlobalProperties(JavaOnlyMap javaOnlyMap) {
        if (javaOnlyMap != null && javaOnlyMap.size() > 0 && isRunning()) {
            nativeSetProperties(this.mNativeWorkerPtr.get(), javaOnlyMap);
        }
    }

    public void setInspectorClient(C21344518fz c21344518fz) {
        this.mInspectorClientNew = c21344518fz;
    }

    public void setOnErrorCallback(InterfaceC21345618gA interfaceC21345618gA) {
        this.mOnErrorCallback = interfaceC21345618gA;
    }

    public void setOnMessageCallback(InterfaceC21345618gA interfaceC21345618gA) {
        this.mOnMessageCallback = interfaceC21345618gA;
    }

    public void setWorkerDelegate(InterfaceC1503710pEX interfaceC1503710pEX) {
        this.mWorkerDelegate = interfaceC1503710pEX;
        if (interfaceC1503710pEX != null) {
            nativeRegisterDelegateFunction(this.mNativeWorkerPtr.get());
        }
    }

    public void setupLoader(String str) {
        if (isRunning()) {
            nativeSetupLoader(this.mNativeWorkerPtr.get(), str);
        }
    }

    public JsWorker(JSModuleManager jSModuleManager) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mDevTool = null;
        this.mInspectorClientNew = null;
        EngineType engineType = EngineType.QUICKJS;
        this.mEngineType = engineType;
        this.mSrcID = -1;
        this.isIcuInitialised = false;
        init(jSModuleManager, engineType, null, false, "unknown_android", false, false, false, false);
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mDevTool = null;
        this.mInspectorClientNew = null;
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        this.isIcuInitialised = false;
        init(jSModuleManager, engineType, null, false, "unknown_android", false, false, false, false);
    }

    public static byte[] genCodeCache(String str, EngineType engineType) {
        long j;
        if (engineType == EngineType.QUICKJS) {
            j = 0;
        } else {
            j = 1;
        }
        return nativeGenCodeCache(str, j);
    }

    public void bind(int i, int i2) {
        this.mSrcID = i;
        nativeBind(this.mNativeWorkerPtr.get(), i, i2);
    }

    public void evaluateJavaScript(String str, String str2) {
        InterfaceC21345118g5 interfaceC21345118g5;
        if (isRunning()) {
            C21321118cD c21321118cD = this.mDevTool;
            if (c21321118cD != null && (interfaceC21345118g5 = c21321118cD.LIZ) != null) {
                interfaceC21345118g5.LIZ();
            }
            nativeEvaluateJavaScript(this.mNativeWorkerPtr.get(), str, str2, false);
        }
    }

    public void evaluateJavaScriptWithException(String str, String str2) {
        InterfaceC21345118g5 interfaceC21345118g5;
        if (isRunning()) {
            C21321118cD c21321118cD = this.mDevTool;
            if (c21321118cD != null && (interfaceC21345118g5 = c21321118cD.LIZ) != null) {
                interfaceC21345118g5.LIZ();
            }
            nativeEvaluateJavaScript(this.mNativeWorkerPtr.get(), str, str2, true);
        }
    }

    public void initWebAssembly(long j, EngineType engineType) {
        if (!C21139717o3.LIZ.booleanValue()) {
            return;
        }
        try {
            if (engineType == EngineType.QUICKJS) {
                postOnJSRunner(new ARunnableS23S0100100_23(j, this, 1));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void postOnJSRunnerDelay(Runnable runnable, long j) {
        if (this.mNativeWorkerPtr.get() != 0) {
            nativeOnJSRunnerDelay(this.mNativeWorkerPtr.get(), runnable, j);
        }
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType, String str) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mDevTool = null;
        this.mInspectorClientNew = null;
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        this.isIcuInitialised = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/woker_code_cache.bin");
        init(jSModuleManager, engineType, C2188811AlT.LIZIZ(sbLIZ), false, "unknown_android", false, false, false, false);
    }

    public void registerModule(String str, Class<? extends JSModule> cls, Object obj) {
        if (this.mModuleManager != null && isRunning()) {
            this.mModuleManager.LIZIZ(str, cls, obj);
        }
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType, boolean z) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mDevTool = null;
        this.mInspectorClientNew = null;
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        this.isIcuInitialised = false;
        init(jSModuleManager, engineType, null, z, "unknown_android", false, false, false, false);
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType, String str, boolean z) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mDevTool = null;
        this.mInspectorClientNew = null;
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        this.isIcuInitialised = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/woker_code_cache.bin");
        init(jSModuleManager, engineType, C2188811AlT.LIZIZ(sbLIZ), z, "unknown_android", false, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0pIw] */
    private void Fetch(String str, String str2, byte[] bArr, final long j) {
        JSONObject jSONObject;
        boolean zLJI = MethodIDManager.LJI(137782);
        if (this.mWorkerDelegate != null) {
            try {
                if (str2.isEmpty()) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(str2);
                }
                ((WorkerDelegate) this.mWorkerDelegate).LIZIZ(new Request(str, jSONObject, bArr), new InterfaceC1503680pEU<Response>() { // from class: X.0pIw
                    @Override // X.InterfaceC1503680pEU
                    public final void LIZ(Response response) {
                        Response response2 = response;
                        if (this.LIZIZ.isRunning()) {
                            JsWorker.nativeResolve(this.LIZIZ.mNativeWorkerPtr.get(), response2, j);
                        }
                    }
                }, new C1506450pIx(this, j));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public Object invokeJavaScriptFunction(String str, JavaOnlyArray javaOnlyArray, char c, boolean z) {
        if (isRunning()) {
            return nativeInvokeJavaScriptFunction(this.mNativeWorkerPtr.get(), str, javaOnlyArray, c);
        }
        return null;
    }

    public Object invokeJavaScriptModule(String str, String str2, JavaOnlyArray javaOnlyArray, char c) {
        if (isRunning()) {
            return nativeInvokeJavaScriptModule(this.mNativeWorkerPtr.get(), str, str2, javaOnlyArray, c);
        }
        return null;
    }

    public JsWorker(JSModuleManager jSModuleManager, EngineType engineType, String str, boolean z, String str2) {
        this.mNativeWorkerPtr = new AtomicLong(0L);
        this.mDevTool = null;
        this.mInspectorClientNew = null;
        this.mEngineType = EngineType.QUICKJS;
        this.mSrcID = -1;
        this.isIcuInitialised = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/woker_code_cache.bin");
        init(jSModuleManager, engineType, C2188811AlT.LIZIZ(sbLIZ), z, str2, false, false, false, false);
    }

    private void init(JSModuleManager jSModuleManager, EngineType engineType, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        long j;
        String str3 = str;
        if (!isInitialised) {
            initialize();
        }
        if (engineType == EngineType.QUICKJS) {
            j = 0;
        } else {
            j = 1;
        }
        this.mEngineType = engineType;
        if (!C1299270jun.LIZIZ().LIZ("vmsdk_enable_codecache")) {
            str3 = null;
        }
        this.mNativeWorkerPtr.set(nativeCreateWorker(this, j, jSModuleManager, str3, z, str2, z5));
        if (z3) {
            registerICU();
        }
        this.mJavaScriptModuleRegistry = new JavaScriptRegistry();
        this.mModuleManager = jSModuleManager;
        if (z2) {
            this.mDevTool = new C21321118cD(this);
            this.mInspectorClientNew = new C21344518fz(this);
        }
        if (z4) {
            long wasmRegisterFunctionPtr = getWasmRegisterFunctionPtr();
            if (wasmRegisterFunctionPtr != 0) {
                initWebAssembly(wasmRegisterFunctionPtr, this.mEngineType);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz_name", str2);
            jSONObject.put("init_worker", true);
            jSONObject.put("vmsdk_android_version", "3.9.2-tt");
            VmSdkMonitor.LJ("JsWorker", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
