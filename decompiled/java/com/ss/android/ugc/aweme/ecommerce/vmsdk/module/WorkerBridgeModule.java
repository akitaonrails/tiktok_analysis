package com.ss.android.ugc.aweme.ecommerce.vmsdk.module;

import X.AnonymousClass0317;
import X.C034S;
import X.C098200Yq;
import X.C09ZZ;
import X.C0VS8;
import X.C1120604Zw;
import X.C11U8;
import X.C11U9;
import X.C12ES;
import X.C13LP;
import X.C1766300w44;
import X.C189200o6;
import X.C1AQS;
import X.C20224414Bm;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C7879035x;
import X.InterfaceC1522160piI;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class WorkerBridgeModule extends BaseWorkerBridgeModule {
    public static final C20224414Bm Companion = new Object() { // from class: X.14Bm
    };

    @InterfaceC1522160piI
    public final void log(String str, int i, String str2) {
    }

    private final boolean is32Bit() {
        return Build.SUPPORTED_64_BIT_ABIS.length == 0;
    }

    @InterfaceC1522160piI
    public final WritableMap getAppInfo() throws JSONException {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService3;
        IECommerceHostService iECommerceHostService4;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
        JSONObject jSONObject = new JSONObject();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        jSONObject.put("appID:", ((IApplicationDependencyService) iECommerceHostService2).getAppId());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime3, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        jSONObject.put("installID", ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getInstallId());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
            iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime4, 1, IApplicationDependencyService.class.getName(), iECommerceHostService3 != null ? iECommerceHostService3.getClass().getName() : null, iECommerceHostService3 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        jSONObject.put("appVersion", ((IApplicationDependencyService) iECommerceHostService3).getVersionInfo().LIZ);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime5 = SystemClock.elapsedRealtime();
            iECommerceHostService4 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime5, 1, IApplicationDependencyService.class.getName(), iECommerceHostService4 != null ? iECommerceHostService4.getClass().getName() : null, iECommerceHostService4 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService4 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        jSONObject.put("updateVersionCode", ((IApplicationDependencyService) iECommerceHostService4).getVersionInfo().LIZJ);
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        jSONObject.put("channel", C7879035x.LIZIZ());
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime6 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime6, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null);
        } else {
            c1120604Zw.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        jSONObject.put("deviceID", ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2).getServerDeviceId());
        jSONObject.put("osVersion", Build.VERSION.RELEASE);
        jSONObject.put("statusBarHeight", C12ES.LJIIJJI(applicationContext));
        jSONObject.put("devicePlatform", "android");
        jSONObject.put("deviceModel", Build.MODEL);
        jSONObject.put("networkType", C786410Ut5.b3(applicationContext));
        jSONObject.put("is32Bit", is32Bit());
        jSONObject.put("screenWidth", C12ES.LJIIJ(applicationContext));
        jSONObject.put("screenHeight", C12ES.LJIIIIZZ(applicationContext));
        return toWritableMap(jSONObject);
    }

    @InterfaceC1522160piI
    public final String getProtocolRule() {
        return C0VS8.LIZ.getString("protocol_rule", "");
    }

    public WorkerBridgeModule(Context context) {
        super(context);
    }

    @InterfaceC1522160piI
    public final WritableArray getSplicePathData(String str, String str2) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        C11U9<String, JSONObject> c11u9;
        C11U8<JSONObject> c11u8LIZJ;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3;
        boolean z;
        boolean z2;
        String name;
        List listLLIIII;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4;
        Object c098200Yq;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin5;
        boolean z3;
        boolean z4;
        String name2;
        boolean z5;
        String name3;
        String name4 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            String name5 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name3 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name5, name3, z5);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exec getSplicePathData: ");
        sbLIZ.append(str);
        sbLIZ.append((char) 12289);
        sbLIZ.append(str2);
        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).commonLogI("SpliceDebug_JS", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (C1766300w44.LIZ) {
            c11u9 = C1766300w44.LIZIZ;
            c11u8LIZJ = c11u9.LIZJ(str);
        }
        if (c11u8LIZJ != null && (listLLIIII = C13LP.LLIIII(c11u8LIZJ)) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String name6 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4 != null) {
                    name2 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name6, name2, z4);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4).commonLogI("SpliceDebug_JS", listLLIIII.toString());
            Regex regex = C09ZZ.LIZ;
            try {
                c098200Yq = C09ZZ.LIZ(str2, listLLIIII);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            List<? extends Object> list = (List) c098200Yq;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin5 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin5 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name7 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin5 != null) {
                    name4 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin5.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name7, name4, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin5 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("result: ");
            sbLIZ2.append(list);
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin5).commonLogI("SpliceDebug_JS", C2188811AlT.LIZIZ(sbLIZ2));
            return toWritableArray(list);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name8 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null) {
                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime4, 1, name8, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2).commonLogI("SpliceDebug_JS", "empty cache data");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime5 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3 != null) {
                z = true;
            } else {
                z = false;
            }
            String name9 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3 != null) {
                name4 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime5, 1, name9, name4, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        ILogDependencyService iLogDependencyService = (ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("dm info :");
        HashMap map = new HashMap();
        for (Map.Entry entry : c11u9.LIZJ.entrySet()) {
            map.put(String.valueOf(entry.getKey()), Integer.valueOf(((C11U8) entry.getValue()).size()));
        }
        sbLIZ3.append(map);
        iLogDependencyService.commonLogI("SpliceDebug_DM", C2188811AlT.LIZIZ(sbLIZ3));
        return new JavaOnlyArray();
    }
}
