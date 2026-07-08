package com.bytedance.lynx.hybrid.settings;

import X.AbstractC1701050uMp;
import X.C01GW;
import X.C098200Yq;
import X.C1161970gLL;
import X.C1294090jmR;
import X.C1537410q6t;
import X.C1700970uMh;
import X.C1701070uMr;
import X.C1701120uMw;
import X.C189200o6;
import X.C1955307lH;
import X.C259800zU;
import X.C786410Ut5;
import X.InterfaceC1700960uMg;
import X.InterfaceC1701080uMs;
import android.app.Application;
import android.content.Context;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class HybridSettings {
    public static final HybridSettings INSTANCE = new HybridSettings();
    public static final C1700970uMh hybridSettings;
    public static final ConcurrentHashMap<String, C1701070uMr> settingsMap;

    static {
        C1700970uMh c1700970uMh;
        ConcurrentHashMap<String, WeakReference<C1700970uMh>> concurrentHashMap = C1700970uMh.LJIILJJIL;
        WeakReference<C1700970uMh> weakReference = concurrentHashMap.get("SparkContainerSpace");
        if (weakReference == null || (c1700970uMh = weakReference.get()) == null) {
            synchronized (concurrentHashMap) {
                try {
                    WeakReference<C1700970uMh> weakReference2 = concurrentHashMap.get("SparkContainerSpace");
                    if (weakReference2 == null || (c1700970uMh = weakReference2.get()) == null) {
                        c1700970uMh = new C1700970uMh();
                        concurrentHashMap.put("SparkContainerSpace", new WeakReference<>(c1700970uMh));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        hybridSettings = c1700970uMh;
        settingsMap = new ConcurrentHashMap<>();
        c1700970uMh.LJI.add(new InterfaceC1701080uMs() { // from class: X.0uMq
            @Override // X.InterfaceC1701080uMs
            public final void LIZIZ(String str) {
                C1490740otc.LIZ.LIZ("hybrid settings fetch failed", EnumC1490770otf.E, "Hybrid Settings");
                Iterator<Map.Entry<String, C1701070uMr>> it2 = HybridSettings.settingsMap.entrySet().iterator();
                while (it2.hasNext()) {
                    InterfaceC1701080uMs interfaceC1701080uMs = it2.next().getValue().LIZ;
                    if (interfaceC1701080uMs != null) {
                        interfaceC1701080uMs.LIZIZ(str);
                    }
                }
            }

            @Override // X.InterfaceC1701080uMs
            public final void LIZ(String str, JSONObject jSONObject) {
                for (Map.Entry<String, C1701070uMr> entry : HybridSettings.settingsMap.entrySet()) {
                    Pair<JSONObject, String> pairExtractConfig = HybridSettings.INSTANCE.extractConfig(jSONObject, entry.getKey());
                    InterfaceC1701080uMs interfaceC1701080uMs = entry.getValue().LIZ;
                    if (interfaceC1701080uMs != null) {
                        interfaceC1701080uMs.LIZ(pairExtractConfig.getSecond(), pairExtractConfig.getFirst());
                    }
                    synchronized (this) {
                        try {
                            entry.getValue().LIZIZ = pairExtractConfig.getFirst();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }
            }

            @Override // X.InterfaceC1701080uMs
            public final void LIZJ(String str, JSONObject jSONObject) {
                for (Map.Entry<String, C1701070uMr> entry : HybridSettings.settingsMap.entrySet()) {
                    if (jSONObject != null && str != null) {
                        Pair<JSONObject, String> pairExtractConfig = HybridSettings.INSTANCE.extractConfig(jSONObject, entry.getKey());
                        InterfaceC1701080uMs interfaceC1701080uMs = entry.getValue().LIZ;
                        if (interfaceC1701080uMs != null) {
                            interfaceC1701080uMs.LIZJ(pairExtractConfig.getSecond(), pairExtractConfig.getFirst());
                        }
                        synchronized (this) {
                            try {
                                entry.getValue().LIZIZ = pairExtractConfig.getFirst();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                    } else {
                        InterfaceC1701080uMs interfaceC1701080uMs2 = entry.getValue().LIZ;
                        if (interfaceC1701080uMs2 != null) {
                            interfaceC1701080uMs2.LIZJ(null, null);
                            return;
                        }
                        return;
                    }
                }
            }
        });
    }

    public final void fetchOnce() {
        C1700970uMh.LIZIZ(hybridSettings, false, 3);
    }

    public final void startFetch() {
        C1700970uMh c1700970uMh = hybridSettings;
        if (c1700970uMh.LJII) {
            return;
        }
        c1700970uMh.LJII = true;
        c1700970uMh.LIZ(0L);
    }

    public final JSONObject get(String str) {
        try {
            return getConfig(str);
        } catch (C1955307lH e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final JSONObject getConfig(String str) {
        C1701070uMr c1701070uMr = settingsMap.get(str);
        JSONObject jSONObjectLIZ = null;
        if (c1701070uMr != null) {
            synchronized (INSTANCE) {
                try {
                    JSONObject jSONObject = c1701070uMr.LIZIZ;
                    if (jSONObject == null) {
                        JSONObject jSONObjectLIZJ = hybridSettings.LIZJ();
                        if (jSONObjectLIZJ != null) {
                            jSONObjectLIZ = C1294090jmR.LIZ(str, jSONObjectLIZJ);
                        }
                    } else {
                        jSONObjectLIZ = jSONObject;
                    }
                    c1701070uMr.LIZIZ = jSONObjectLIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return jSONObjectLIZ;
        }
        JSONObject jSONObjectLIZJ2 = hybridSettings.LIZJ();
        if (jSONObjectLIZJ2 == null) {
            return null;
        }
        return C1294090jmR.LIZ(str, jSONObjectLIZJ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<JSONObject, String> extractConfig(JSONObject jSONObject, String str) {
        Object obj;
        C259800zU c259800zU = new C259800zU();
        JSONObject jSONObjectLIZ = C1294090jmR.LIZ(str, jSONObject);
        if (jSONObjectLIZ == null) {
            jSONObjectLIZ = new JSONObject();
            c259800zU.element = "";
        } else {
            try {
                String string = JSONObjectProtectorUtils.getString(jSONObject, str);
                C189200o6.m2constructorimpl(string);
                obj = string;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            T tJ3 = obj;
            if (zM7isFailureimpl || obj == null) {
                tJ3 = C786410Ut5.J3(jSONObjectLIZ);
            }
            c259800zU.element = tJ3;
        }
        return new Pair<>(jSONObjectLIZ, c259800zU.element);
    }

    public final void registerSettings(String str, InterfaceC1701080uMs interfaceC1701080uMs) {
        settingsMap.putIfAbsent(str, new C1701070uMr(interfaceC1701080uMs));
    }

    public final void init(SettingsConfig settingsConfig, AbstractC1701050uMp abstractC1701050uMp, InterfaceC1700960uMg interfaceC1700960uMg) {
        String str;
        ConcurrentHashMap<String, WeakReference<AbstractC1701050uMp>> concurrentHashMap;
        WeakReference<AbstractC1701050uMp> weakReference;
        C1700970uMh c1700970uMh = hybridSettings;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        Application applicationLIZJ = C1161970gLL.LIZIZ().LIZJ();
        if (!c1700970uMh.LJIIIZ) {
            c1700970uMh.LJIIIZ = true;
            if (settingsConfig == null) {
                settingsConfig = c1700970uMh.LIZLLL;
            }
            c1700970uMh.LIZLLL = settingsConfig;
            if (abstractC1701050uMp == null && ((weakReference = (concurrentHashMap = AbstractC1701050uMp.LIZJ).get((str = c1700970uMh.LIZ))) == null || (abstractC1701050uMp = weakReference.get()) == null)) {
                synchronized (concurrentHashMap) {
                    try {
                        WeakReference<AbstractC1701050uMp> weakReference2 = concurrentHashMap.get(str);
                        if (weakReference2 == null || (abstractC1701050uMp = weakReference2.get()) == null) {
                            abstractC1701050uMp = new C1701120uMw(str);
                            concurrentHashMap.put(str, new WeakReference<>(abstractC1701050uMp));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            c1700970uMh.LIZIZ = abstractC1701050uMp;
            abstractC1701050uMp.LIZIZ = c1700970uMh.LJIIL;
            abstractC1701050uMp.LIZJ();
            if (interfaceC1700960uMg == null) {
                interfaceC1700960uMg = new InterfaceC1700960uMg() { // from class: X.0X9D
                    public static String LIZIZ;

                    @Override // X.InterfaceC1700960uMg
                    public final void init(Context context) throws Throwable {
                        Object obj;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        File file = C786450Ut9.LIZJ;
                        if (file == null || !C786450Ut9.LJ) {
                            try {
                                C786450Ut9.LIZJ = context.getFilesDir();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                Context applicationContext = null;
                                try {
                                    Class<?> cls = Class.forName("android.app.ActivityThread");
                                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                                    declaredField.setAccessible(true);
                                    obj = declaredField.get(objInvoke);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    PrintStream printStream = System.out;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Error: ");
                                    sbLIZ2.append(e.getMessage());
                                    printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                                if (obj instanceof Application) {
                                    applicationContext = ((Application) obj).getApplicationContext();
                                    PrintStream printStream2 = System.out;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("Application context obtained through ActivityThread: ");
                                    sbLIZ3.append(applicationContext);
                                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                                    if (applicationContext != null) {
                                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                                        C08RN.LIZ(applicationContext);
                                    }
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(th2.getMessage());
                                    sbLIZ4.append(":");
                                    sbLIZ4.append(C08RN.LIZJ());
                                    sbLIZ4.append(" applicationContext is null");
                                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                System.out.println("Error: mInitialApplication is not an instance of Application");
                                StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                                sbLIZ42.append(th2.getMessage());
                                sbLIZ42.append(":");
                                sbLIZ42.append(C08RN.LIZJ());
                                sbLIZ42.append(" applicationContext is null");
                                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ42));
                            }
                            file = C786450Ut9.LIZJ;
                        }
                        sbLIZ.append(file.getAbsolutePath());
                        sbLIZ.append("/hybrid_settings_downloader");
                        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1700960uMg
                    public final void LIZ(String str2, C1701030uMn c1701030uMn) throws NoSuchAlgorithmException {
                        String string;
                        C1533810q15 c1533810q15;
                        byte[] bArrLJIIIZ;
                        String strLJ = C08IP.LJ(str2);
                        String str3 = LIZIZ;
                        C1533790q13 c1533790q13LIZIZ = null;
                        if (str3 == null) {
                            str3 = null;
                        }
                        try {
                            C189200o6.m2constructorimpl(Boolean.valueOf(new C0VSJ(str3, strLJ).delete()));
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                        JSONArray jSONArray = C1533710q0v.LIZ;
                        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                        if (iResourceServiceXLIZIZ != null) {
                            RequestParams requestParams = new RequestParams(null, 1, null);
                            requestParams.onlyOnline = true;
                            requestParams.loadToMemory = true;
                            Boolean bool = Boolean.FALSE;
                            requestParams.needLocalFile = bool;
                            requestParams.enableCDNCache = bool;
                            requestParams.enableNegotiation = bool;
                            requestParams.enableMemoryCache = bool;
                            C1533910q1F c1533910q1FCreateSyncRequest = iResourceServiceXLIZIZ.createSyncRequest(str2, requestParams);
                            if (c1533910q1FCreateSyncRequest != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null && (bArrLJIIIZ = c1533790q13LIZIZ.LJIIIZ()) != null) {
                                if (c1701030uMn != null) {
                                    c1701030uMn.LIZ(new String(bArrLJIIIZ, Charsets.UTF_8));
                                    return;
                                }
                                return;
                            }
                        }
                        if (c1701030uMn != null) {
                            if (c1533790q13LIZIZ == null || (c1533810q15 = c1533790q13LIZIZ.LIZLLL) == null || (string = c1533810q15.toString()) == null) {
                                string = "cannot get response";
                            }
                            c1701030uMn.LIZIZ(string);
                        }
                    }
                };
            }
            c1700970uMh.LIZJ = interfaceC1700960uMg;
            if (interfaceC1700960uMg == null) {
                interfaceC1700960uMg = null;
            }
            interfaceC1700960uMg.init(applicationLIZJ);
            c1700970uMh.LJIIJ = true;
        }
        registerSettings("templateResData_denyList", new InterfaceC1701080uMs() { // from class: X.0qQB
            @Override // X.InterfaceC1701080uMs
            public final void LIZIZ(String str2) {
            }

            @Override // X.InterfaceC1701080uMs
            public final void LIZJ(String str2, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1701080uMs
            public final void LIZ(String str2, JSONObject jSONObject) {
                JSONArray jSONArray = C1533710q0v.LIZ;
                C1533710q0v.LIZ = JSONObjectProtectorUtils.getJSONArray(jSONObject, "denyList");
            }
        });
    }

    public static /* synthetic */ void registerSettings$default(HybridSettings hybridSettings2, String str, InterfaceC1701080uMs interfaceC1701080uMs, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC1701080uMs = null;
        }
        hybridSettings2.registerSettings(str, interfaceC1701080uMs);
    }

    public static /* synthetic */ void init$default(HybridSettings hybridSettings2, SettingsConfig settingsConfig, AbstractC1701050uMp abstractC1701050uMp, InterfaceC1700960uMg interfaceC1700960uMg, int i, Object obj) {
        if ((i & 1) != 0) {
            settingsConfig = null;
        }
        if ((i & 2) != 0) {
            abstractC1701050uMp = null;
        }
        if ((i & 4) != 0) {
            interfaceC1700960uMg = null;
        }
        hybridSettings2.init(settingsConfig, abstractC1701050uMp, interfaceC1700960uMg);
    }
}
