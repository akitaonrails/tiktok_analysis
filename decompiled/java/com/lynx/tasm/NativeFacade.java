package com.lynx.tasm;

import X.AbstractC1300020jw0;
import X.C0WZX;
import X.C1298660jto;
import X.C1298840ju6;
import X.C1299170jud;
import X.C1299180jue;
import X.C1299190juf;
import X.C1299220jui;
import X.C1299260jum;
import X.C1301610jyZ;
import X.C1309780kBk;
import X.C1310290kCZ;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC1298770jtz;
import X.InterfaceC1299150jub;
import Y.ARunnableS16S1300000_20;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleFactory;
import com.lynx.jsbridge.LynxModuleWrapper;
import com.lynx.jsbridge.MethodDescriptor;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import com.lynx.tasm.core.LynxEngineProxy;
import com.lynx.tasm.utils.CallStackUtil;
import j27.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class NativeFacade implements InterfaceC1298770jtz {
    public InterfaceC1299150jub LIZ;
    public C1309780kBk LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public WeakReference<LynxEngineProxy> LJ;
    public WeakReference<s> LJFF;
    public final boolean LJI;
    public boolean LJII;
    public LynxModuleFactory LJIIIIZZ;

    private void startRecording(ReadableMap readableMap) {
    }

    private void stopRecording(ReadableMap readableMap) {
    }

    private void onSSRHydrateFinished() {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r4 = this;
            java.lang.ref.WeakReference<j27.s> r0 = r4.LJFF
            if (r0 == 0) goto L39
            java.lang.Object r1 = r0.get()
            j27.s r1 = (j27.s) r1
            if (r1 == 0) goto L3a
            int r3 = r1.LLJLILLLLZIIL
        Le:
            java.lang.String r0 = r4.LIZJ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L31
            java.lang.String r2 = r4.LIZJ
        L18:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "instanceId:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " url:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        L31:
            if (r1 == 0) goto L36
            java.lang.String r2 = r1.LLJJIII
            goto L18
        L36:
            java.lang.String r2 = ""
            goto L18
        L39:
            r1 = 0
        L3a:
            r3 = -1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.NativeFacade.LIZIZ():java.lang.String");
    }

    public void onRunPipelineFinished() {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIIJJI();
        }
    }

    private void dispatchOnLoaded() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native->java dispatchOnLoaded templateSize:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" ");
        sbLIZ.append(LIZIZ());
        LynxLog.i("NativeFacade", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJFF(this.LIZLLL);
        }
    }

    private void onDataUpdated() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native->java onDataUpdated ");
        sbLIZ.append(LIZIZ());
        LynxLog.i("NativeFacade", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIJI();
        }
    }

    private void onRuntimeReady() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native->java onRuntimeReady ");
        sbLIZ.append(LIZIZ());
        LynxLog.i("NativeFacade", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIJ();
        }
    }

    private void onTASMFinishedByNative() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native->java onTASMFinishedByNative ");
        sbLIZ.append(LIZIZ());
        LynxLog.i("NativeFacade", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIJJLI();
        }
    }

    private void onUpdateDataWithoutChange() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native->java onUpdateDataWithoutChange ");
        sbLIZ.append(LIZIZ());
        LynxLog.i("NativeFacade", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJII();
        }
    }

    public NativeFacade(boolean z) {
        this.LJI = true;
        this.LJI = z;
    }

    private void flushJSBTiming(ReadableMap readableMap) {
        InterfaceC1299150jub interfaceC1299150jub;
        if (!C1299180jue.LIZ.booleanValue() && (interfaceC1299150jub = this.LIZ) != null && readableMap != null) {
            interfaceC1299150jub.LJIILLIIL(JavaOnlyMap.from(readableMap.getMap("info").asHashMap()));
            if (readableMap.getMap("info").getInt("jsb_status_code", 0) != 1) {
                return;
            }
            this.LIZ.LJIIIZ(readableMap.asHashMap());
        }
    }

    private void onDynamicComponentPerfReady(ReadableMap readableMap) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LIZLLL(readableMap.asHashMap());
        }
    }

    private void onPageChanged(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native->java onPageChanged isFirstScreen:");
        sbLIZ.append(z);
        sbLIZ.append(" ");
        sbLIZ.append(LIZIZ());
        LynxLog.i("NativeFacade", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIIJ(z);
        }
    }

    private void onReceiveMessageEvent(ReadableMap readableMap) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIILJJIL();
        }
    }

    private void onTemplateBundleReady(TemplateBundle templateBundle) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LIZJ(templateBundle);
        }
    }

    private void onTimingSetup(ReadableMap readableMap) {
        C1309780kBk c1309780kBk = this.LIZIZ;
        if (c1309780kBk == null) {
            return;
        }
        c1309780kBk.onTimingSetup(readableMap.asHashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    @Override // X.InterfaceC1298770jtz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C1298730jtv r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.NativeFacade.LIZ(X.0jtv):boolean");
    }

    public void onLynxEvent(ReadableMap readableMap) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIILL(readableMap);
        }
    }

    public void onPageConfigDecoded(ReadableMap readableMap) {
        if (this.LIZ != null) {
            C1310290kCZ c1310290kCZ = new C1310290kCZ(readableMap);
            this.LIZ.LJJ(c1310290kCZ);
            this.LJII = c1310290kCZ.LJJJIL;
        }
    }

    public void reportError(LynxError lynxError) {
        int i;
        Object objValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native->java reportError instanceId:");
        s sVar = this.LJFF.get();
        if (sVar == null) {
            i = -1;
        } else {
            i = sVar.LLJLILLLLZIIL;
        }
        sbLIZ.append(i);
        sbLIZ.append(" url:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" error:");
        if (lynxError != null) {
            objValueOf = Integer.valueOf(lynxError.LIZIZ());
        } else {
            objValueOf = "null";
        }
        sbLIZ.append(objValueOf);
        LynxLog.i("NativeFacade", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.onErrorOccurred(lynxError);
        }
    }

    private void onConfigUpdatedByJS(String str, Object obj) {
        if (str != null && obj != null && (obj instanceof HashMap)) {
            HashMap map = (HashMap) obj;
            if ("theme".equals(str)) {
                C1299170jud c1299170jud = new C1299170jud();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (str2 != null && !str2.isEmpty() && !str2.startsWith("__")) {
                        if (value == null) {
                            c1299170jud.LIZ.remove(str2);
                        } else {
                            c1299170jud.LIZ.put(str2, (String) value);
                        }
                    }
                }
                InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
                if (interfaceC1299150jub != null) {
                    interfaceC1299150jub.LJIIIIZZ(c1299170jud);
                }
            }
        }
    }

    public void getI18nResourceByNative(String str, String str2) {
        AbstractC1300020jw0 abstractC1300020jw0;
        s sVar = this.LJFF.get();
        if (sVar != null) {
            C1299220jui c1299220jui = sVar.LLJJJIL;
            c1299220jui.getClass();
            if (!TextUtils.isEmpty("I18N_TEXT") && (abstractC1300020jw0 = (AbstractC1300020jw0) ((HashMap) c1299220jui.LIZ).get("I18N_TEXT")) != null) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("fallbackUrl", str2, bundle);
                abstractC1300020jw0.LIZ(new C1299260jum(str.toLowerCase(), bundle), new C1299190juf(this, str));
                return;
            }
            sVar.LJJIFFI(str, "I18nResource", new LynxError(30400, "no i18n provider found"));
        }
    }

    public String translateResourceForTheme(String str, String str2) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            return interfaceC1299150jub.LIZIZ(str, str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public ByteBuffer triggerLepusBridge(String str, Object obj) throws Throwable {
        boolean z;
        C1298840ju6 c1298840ju6 = C1298840ju6.LIZ;
        LynxModuleFactory lynxModuleFactory = this.LJIIIIZZ;
        Object objA0 = 0;
        objA0 = 0;
        objA0 = 0;
        objA0 = 0;
        objA0 = 0;
        if (obj instanceof ReadableMap) {
            if (lynxModuleFactory == null) {
                LynxLog.e("LynxLepusModule", "mModuleFactory does not exist!");
            } else {
                ReadableMap map = ((ReadableMap) obj).getMap("methodDetail", new JavaOnlyMap());
                String string = map.getString("module", null);
                String string2 = map.getString("method", null);
                if (string != null) {
                    LynxModuleWrapper lynxModuleWrapperLIZIZ = lynxModuleFactory.LIZIZ(string);
                    if (lynxModuleWrapperLIZIZ == null) {
                        lynxModuleWrapperLIZIZ = LynxEnv.inst().getModuleFactory().LIZIZ(string);
                    }
                    if (lynxModuleWrapperLIZIZ != null) {
                        int i = 1;
                        char c = 0;
                        if (str.equals("call") || str.equals("callSync") || (string2 != null && string2.length() != 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (MethodDescriptor methodDescriptor : lynxModuleWrapperLIZIZ.getMethodDescriptors()) {
                            String name = methodDescriptor.getName();
                            if (name != null && !name.isEmpty() && name.equals(str)) {
                                try {
                                    if (z) {
                                        Method method = methodDescriptor.getMethod();
                                        LynxModule module = lynxModuleWrapperLIZIZ.getModule();
                                        Object[] objArr = new Object[2];
                                        objArr[c] = string2;
                                        objArr[i] = map;
                                        objA0 = C2204961BRm.a0(method, module, objArr, new C0WZX("dzBzEg4jUdKSWVIxUAHKSuowiIK8DPt4mJDHQ7lw", objA0));
                                    } else {
                                        Method method2 = methodDescriptor.getMethod();
                                        LynxModule module2 = lynxModuleWrapperLIZIZ.getModule();
                                        Object[] objArr2 = new Object[i];
                                        try {
                                            objArr2[0] = map;
                                            objA0 = C2204961BRm.a0(method2, module2, objArr2, new C0WZX("dzBzEg4jUdKSWVIxUAHKSuowiIK8DPt4mJDHQ7lw", objA0));
                                            objA0 = objA0;
                                        } catch (Exception e) {
                                            e = e;
                                            TryCatchGuardChecker.doCheck(e);
                                            LynxLog.e("LynxLepusModule", "Lepus Module invokeSync: " + e.toString());
                                            c = 0;
                                            i = 1;
                                            objA0 = objA0;
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            }
                            c = 0;
                            i = 1;
                            objA0 = objA0;
                        }
                    }
                }
            }
        }
        c1298840ju6.getClass();
        return C1298840ju6.LIZIZ(objA0);
    }

    public void triggerLepusBridgeAsync(String str, Object obj) {
        LynxEngineProxy lynxEngineProxy;
        WeakReference<LynxEngineProxy> weakReference = this.LJ;
        if (weakReference != null) {
            lynxEngineProxy = weakReference.get();
        } else {
            lynxEngineProxy = null;
        }
        LynxModuleFactory lynxModuleFactory = this.LJIIIIZZ;
        if (obj instanceof ReadableMap) {
            if (lynxModuleFactory == null) {
                LynxLog.e("LynxLepusModule", "mModuleFactory does not exist!");
                return;
            }
            ReadableMap readableMap = (ReadableMap) obj;
            ReadableMap map = readableMap.getMap("methodDetail", new JavaOnlyMap());
            String string = map.getString("module", null);
            map.getString("method", null);
            if (string == null) {
                return;
            }
            LynxModuleWrapper lynxModuleWrapperLIZIZ = lynxModuleFactory.LIZIZ(string);
            if (lynxModuleWrapperLIZIZ == null && (lynxModuleWrapperLIZIZ = LynxEnv.inst().getModuleFactory().LIZIZ(string)) == null) {
                return;
            }
            if (!readableMap.getBoolean("lepusUseUIThread", false) && readableMap.getBoolean("useAirThread", false)) {
                WeakReference weakReference2 = new WeakReference(lynxModuleWrapperLIZIZ);
                WeakReference weakReference3 = new WeakReference(lynxEngineProxy);
                if (C1301610jyZ.LJ == null) {
                    synchronized (C1301610jyZ.class) {
                        try {
                            if (C1301610jyZ.LJ == null) {
                                C1301610jyZ.LJ = C1301610jyZ.LIZJ(3, 1, "lepus-bridge-async-thread");
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C1301610jyZ.LJ.execute(new ARunnableS16S1300000_20(readableMap, weakReference2, weakReference3, str, 6));
                return;
            }
            C1298660jto.LIZ(lynxModuleWrapperLIZIZ, lynxEngineProxy, readableMap, str);
        }
    }

    private void onModuleFunctionInvoked(String str, String str2, int i) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            try {
                interfaceC1299150jub.LJIIZILJ(str, str2, i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Callback 'onModuleFunctionInvoked' called after method '");
                sbLIZ.append(str2);
                sbLIZ.append("' in module '");
                sbLIZ.append(str);
                sbLIZ.append("' threw an exception: ");
                sbLIZ.append(e.getMessage());
                LynxError lynxError = new LynxError(99900, C2188811AlT.LIZIZ(sbLIZ));
                lynxError.LJII(CallStackUtil.getStackTraceStringWithLineTrimmed(e));
                reportError(lynxError);
            }
        }
    }

    private void onTimingUpdate(ReadableMap readableMap, ReadableMap readableMap2, String str) {
        if (this.LIZIZ == null) {
            return;
        }
        Object obj = readableMap2.asHashMap().get(str);
        if (!(obj instanceof HashMap)) {
            return;
        }
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((key instanceof String) && (value instanceof Long)) {
                map.put(key, value);
            }
        }
        this.LIZIZ.LJJIIZ(str, readableMap.asHashMap(), map);
    }

    public void onEventBubble(long j, boolean z, long j2) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIILIIL(j, z, j2);
        }
    }

    public void onEventCapture(long j, boolean z, long j2) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIIL(j, z, j2);
        }
    }

    public void onEventFire(long j, boolean z, long j2) {
        InterfaceC1299150jub interfaceC1299150jub = this.LIZ;
        if (interfaceC1299150jub != null) {
            interfaceC1299150jub.LJIL(j, z, j2);
        }
    }

    private void InvokeUIMethod(LynxGetUIResult lynxGetUIResult, String str, JavaOnlyMap javaOnlyMap, final int i) {
        s sVar;
        String strLIZIZ;
        WeakReference<s> weakReference = this.LJFF;
        if (weakReference != null && (sVar = weakReference.get()) != null && sVar.LJIILIIL() != null) {
            Callback callback = new Callback() { // from class: X.0juc
                @Override // com.lynx.react.bridge.Callback
                public final void invoke(Object... objArr) {
                    if (i < 0) {
                        return;
                    }
                    JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                    javaOnlyMap2.putInt("code", ((Integer) objArr[0]).intValue());
                    if (objArr.length > 1) {
                        javaOnlyMap2.put("data", objArr[1]);
                    }
                    InterfaceC1299150jub interfaceC1299150jub = this.LIZIZ.LIZ;
                    if (interfaceC1299150jub != null) {
                        interfaceC1299150jub.LIZ(i, javaOnlyMap2);
                    }
                }
            };
            LynxBaseUI lynxBaseUILJIIZILJ = sVar.LJIILIIL().LJIIZILJ(lynxGetUIResult.LIZ.getInt(0));
            if (lynxBaseUILJIIZILJ != null) {
                if (TraceController.isTracingStarted()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UIOwner.invokeUIMethodForSelectorQuery.");
                    sbLIZ.append(lynxBaseUILJIIZILJ.getTagName());
                    sbLIZ.append(e3.d);
                    sbLIZ.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    TraceEvent.LIZIZ(strLIZIZ);
                } else {
                    strLIZIZ = null;
                }
                LynxUIMethodsExecutor.LIZ(lynxBaseUILJIIZILJ, str, javaOnlyMap, callback);
                if (TraceController.isTracingStarted()) {
                    TraceEvent.LJII(strLIZIZ);
                    return;
                }
                return;
            }
            callback.invoke(6, "node does not have a LynxUI");
        }
    }
}
