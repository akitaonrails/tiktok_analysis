package com.bytedance.helios.statichook.config;

import X.C0WSV;
import X.C823280WRi;
import X.C823880WTq;
import Y.ARunnableS113S0100000_13;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import androidx.fragment.app.Fragment;
import com.bytedance.helios.apimonitor.PermissionPopUpActionInvoker;
import com.bytedance.helios.network.NetworkInvoker;
import com.bytedance.helios.statichook.config.ApiHookConfig;
import com.bytedance.pumbaa.app2app.data.App2AppData;
import com.bytedance.pumbaa.aspect.apicalling.base.ProcessorConfig;
import com.bytedance.pumbaa.aspect.apicalling.sdk.SDKServiceImpl;
import com.bytedance.pumbaa.aspect.apicalling.systemapi.SystemApiServiceImpl;
import com.bytedance.pumbaa.aspect.thirdpartynetwork.propagate.NetworkPropagateInvoker;
import com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch;
import com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher;
import com.bytedance.pumbaa.piz.discover.PIIDiscoverConfig;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.pumbaa.utility.worker.PumbaaEfficientThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.consent.PNSBeforeConsentActionInvoker;
import com.ss.android.ugc.tiktok.pns.kidsmode.KShieldNetworkActionInvoker;
import com.ss.android.ugc.tiktok.pns.kidsmode.KShieldSystemApiActionInvoker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class ApiHookConfig {
    public static Map<String, C0WSV> LIZ = null;
    public static Map<Integer, C823880WTq> LIZIZ = null;
    public static final C0WSV[] LIZJ;
    public static String desc = "This class is used as a dictionary maintains.\nDictionary layout:\n    |---- key: API ID, an integer value\n    |---- value: {API ID, API name hash code,                   API related resource id(may be empty),                  API related resource name(maybe empty),                  permissions(maybe empty),                  permission type(anyOf/allOf, maybe empty),                  data types,                  monitor class hash code,                  invoke type (before or/and around)}\nIn runtime, TikTok will monitor these sensitive API usage according to this dictionary to make sure there is no misuse. For example *getDeviceId/getSSID...etc* is not allowed in TikTok. And the ActionInvokers are used to intercept the usage of these API";

    public static void LIZIZ() {
        HashMap map = new HashMap(15);
        LIZ = map;
        map.put("6399108190750172076", new NetworkInvoker());
        LIZ.put("3045288484119911579", new KShieldNetworkActionInvoker());
        LIZ.put("5104064429945101381", new NetworkPropagateInvoker());
        LIZ.put("8776799120278443433", new C0WSV() { // from class: X.0WS8
            public final Regex LIZ;
            public long LIZIZ;

            @Override // X.C0WSV
            public final String name() {
                return "PII";
            }

            {
                Regex regex;
                try {
                    regex = new Regex("^(?=.{1,256})(?=.{1,64}@.{1,255}$)(?=.*@)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    regex = null;
                }
                this.LIZ = regex;
            }

            @Override // X.C0WSV
            public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
                return new C0WSU(false, null);
            }

            @Override // X.C0WSV
            public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
                boolean zMatches;
                IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
                if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJIIIZ()) {
                    C0WS7 c0ws7 = c0wzw.LJFF;
                    if (c0ws7 != null) {
                        C0WS5.LIZ(c0ws7);
                        return;
                    }
                    return;
                }
                PIIDiscoverConfig pIIDiscoverConfig = (PIIDiscoverConfig) C0WS9.LIZIZ.getValue();
                if (!pIIDiscoverConfig.enable) {
                    C0WS7 c0ws72 = c0wzw.LJFF;
                    if (c0ws72 != null) {
                        c0ws72.LJ = "disable";
                        return;
                    }
                    return;
                }
                double d = pIIDiscoverConfig.samplingBeforeCalculation;
                if (d >= 1.0d || (d > 0.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= d)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.LIZIZ >= pIIDiscoverConfig.throttleInterval) {
                        Regex regex = this.LIZ;
                        if (regex != null) {
                            zMatches = regex.matches(String.valueOf(obj2));
                        } else {
                            zMatches = false;
                        }
                        this.LIZIZ = jCurrentTimeMillis;
                        if (zMatches) {
                            double d2 = pIIDiscoverConfig.samplingBeforeReport;
                            if (d2 >= 1.0d || (d2 > 0.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= d2)) {
                                C786410Ut5.LJJZZIII(PumbaaEfficientThread.getHandler(), new ARunnableS113S0100000_13(pIIDiscoverConfig, 294));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0WS7 c0ws73 = c0wzw.LJFF;
                if (c0ws73 != null) {
                    c0ws73.LJ = "not_sample";
                }
            }
        });
        LIZ.put("7439605704018119864", new C0WSV() { // from class: X.0WZb
            public static long LIZ;

            @Override // X.C0WSV
            public final String name() {
                return "UserInput";
            }

            @Override // X.C0WSV
            public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
                return new C0WSU(false, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
            @Override // X.C0WSV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void postInvoke(int r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12, java.lang.Object[] r13, java.lang.Object r14, X.C0WZW r15, boolean r16) {
                /*
                    r8 = this;
                    com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch r0 = X.C825320WZe.LIZ()
                    if (r0 == 0) goto L14
                    boolean r0 = r0.LJIIIZ()
                    if (r0 != 0) goto L14
                    X.0WS7 r0 = r15.LJFF
                    if (r0 == 0) goto L13
                    X.C0WS5.LIZ(r0)
                L13:
                    return
                L14:
                    com.bytedance.pumbaa.userinput.UserInputConfig r4 = X.C825340WZg.LIZ
                    if (r4 != 0) goto L19
                    return
                L19:
                    boolean r0 = r4.enable
                    java.lang.String r3 = "disable"
                    if (r0 != 0) goto L26
                    X.0WS7 r0 = r15.LJFF
                    if (r0 == 0) goto L25
                    r0.LJ = r3
                L25:
                    return
                L26:
                    r2 = 999(0x3e7, float:1.4E-42)
                    r1 = 998(0x3e6, float:1.398E-42)
                    if (r9 == r1) goto L59
                    if (r9 != r2) goto Lb6
                    com.bytedance.pumbaa.userinput.PipelineConfig r0 = r4.pipeline
                    com.bytedance.pumbaa.userinput.ComponentConfig r0 = r0.uiTextView
                    boolean r0 = r0.enable
                L34:
                    if (r0 == 0) goto Lb6
                    long r6 = java.lang.System.currentTimeMillis()
                    if (r9 == r1) goto L52
                    if (r9 == r2) goto L4b
                    r2 = 2147483647(0x7fffffff, float:NaN)
                L41:
                    long r0 = X.C825290WZb.LIZ
                    long r3 = r6 - r0
                    long r1 = (long) r2
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L60
                    return
                L4b:
                    com.bytedance.pumbaa.userinput.PipelineConfig r0 = r4.pipeline
                    com.bytedance.pumbaa.userinput.ComponentConfig r0 = r0.uiTextView
                    int r2 = r0.timeLimitMs
                    goto L41
                L52:
                    com.bytedance.pumbaa.userinput.PipelineConfig r0 = r4.pipeline
                    com.bytedance.pumbaa.userinput.ComponentConfig r0 = r0.uiTextField
                    int r2 = r0.timeLimitMs
                    goto L41
                L59:
                    com.bytedance.pumbaa.userinput.PipelineConfig r0 = r4.pipeline
                    com.bytedance.pumbaa.userinput.ComponentConfig r0 = r0.uiTextField
                    boolean r0 = r0.enable
                    goto L34
                L60:
                    X.C825290WZb.LIZ = r6
                    X.0WRC r0 = com.bytedance.pumbaa.pipeline.PrivacyEvent.Companion
                    r0.getClass()
                    java.lang.String r0 = "20001"
                    java.lang.String r5 = "UserInput"
                    com.bytedance.pumbaa.pipeline.PrivacyEvent r4 = X.C0WRC.LIZ(r0, r5)
                    boolean r0 = com.bytedance.pumbaa.utility.dfid.AutoDFIDManager.LIZIZ
                    r3 = 0
                    if (r0 == 0) goto Lb3
                    r0 = 8600001(0x8339c1, float:1.2051168E-38)
                    java.lang.Integer r0 = com.bytedance.pumbaa.utility.dfid.AutoDFIDManager.LIZ(r0)
                    if (r0 == 0) goto Lb3
                    java.lang.String r2 = r0.toString()
                    if (r2 == 0) goto Lb3
                L83:
                    java.util.concurrent.CopyOnWriteArrayList<X.0WSX> r0 = X.C0WSW.LIZ
                    kotlin.jvm.internal.AwS98S1000000_13 r1 = new kotlin.jvm.internal.AwS98S1000000_13
                    r0 = 9
                    r1.<init>(r2, r0)
                    r0 = 3
                    X.C0WSW.LIZ(r5, r1, r0, r3)
                    X.0WQ8 r1 = new X.0WQ8
                    X.0WRu r0 = X.EnumC823400WRu.String
                    r1.<init>(r0, r2)
                    java.lang.String r0 = "unidfid"
                    r4.addCallSiteInfo(r0, r1)
                    com.bytedance.pumbaa.pipeline.EventPipeline.handleEvent(r4, r3)
                    long r3 = java.lang.System.currentTimeMillis()
                    long r3 = r3 - r6
                    android.os.Handler r2 = com.bytedance.pumbaa.utility.worker.PumbaaEfficientThread.getHandler()
                    Y.ARunnableS13S0000100_13 r1 = new Y.ARunnableS13S0000100_13
                    r0 = 3
                    r1.<init>(r3, r0)
                    X.C786410Ut5.LJJZZIII(r2, r1)
                    return
                Lb3:
                    java.lang.String r2 = ""
                    goto L83
                Lb6:
                    X.0WS7 r0 = r15.LJFF
                    if (r0 == 0) goto Lbc
                    r0.LJ = r3
                Lbc:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C825290WZb.postInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.Object, X.0WZW, boolean):void");
            }
        });
        LIZ.put("-2500605437669296322", new KShieldSystemApiActionInvoker());
        LIZ.put("-794356015723542660", new PNSBeforeConsentActionInvoker());
        LIZ.put("6874342944401051481", new C0WSV() { // from class: X.0WOR
            @Override // X.C0WSV
            public final String name() {
                return "PageStack";
            }

            @Override // X.C0WSV
            public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
                return new C0WSU(false, null);
            }

            @Override // X.C0WSV
            public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
                if (!C825320WZe.LJ()) {
                    C0WS7 c0ws7 = c0wzw.LJFF;
                    if (c0ws7 != null) {
                        C0WS5.LIZ(c0ws7);
                        return;
                    }
                    return;
                }
                boolean zBooleanValue = false;
                if (i != 10501) {
                    if (i == 10502) {
                        try {
                            ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ = C790880V0s.LIZIZ((Fragment) obj);
                            if (viewOnAttachStateChangeListenerC790870V0rLIZIZ != null) {
                                Boolean bool = (Boolean) objArr[0];
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                }
                                viewOnAttachStateChangeListenerC790870V0rLIZIZ.LIZ(zBooleanValue);
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return;
                        }
                    }
                    return;
                }
                try {
                    ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0rLIZIZ2 = C790880V0s.LIZIZ((Fragment) obj);
                    if (viewOnAttachStateChangeListenerC790870V0rLIZIZ2 != null) {
                        Boolean bool2 = (Boolean) objArr[0];
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        }
                        viewOnAttachStateChangeListenerC790870V0rLIZIZ2.LIZ(!zBooleanValue);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        });
        LIZ.put("-6267612998153757685", new C0WSV() { // from class: X.0WaB
            public final C0WZZ LIZ = new ThreadLocal<Boolean>() { // from class: X.0WZZ
                @Override // java.lang.ThreadLocal
                public final Boolean initialValue() {
                    return Boolean.FALSE;
                }
            };
            public final int LIZIZ = Process.myUid();

            @Override // X.C0WSV
            public final String name() {
                return "App2App";
            }

            public final void LIZ() {
                set(Boolean.FALSE);
            }

            public static boolean LJFF(String str) {
                if (str == null) {
                    return true;
                }
                String str2 = C825710WaH.LIZ;
                if (!C825710WaH.LIZJ || str2 == null || !u.LJJIIJZLJL(str, str2, false)) {
                    return true;
                }
                return false;
            }

            public static boolean LJI(Intent intent) throws Throwable {
                String strLJJIJIL = intent.getPackage();
                if (strLJJIJIL == null) {
                    ComponentName component = intent.getComponent();
                    strLJJIJIL = null;
                    if (component != null) {
                        strLJJIJIL = C2204961BRm.LJJIJIL(component, new C0WZX("dzBzEgAjS8/YVFkiQFyUc8nCTCgu49WZjFqWNFJZSysr1XnCHvn8A1PqJ30uMe5IDwykrbE=", null));
                    }
                }
                return LJII(strLJJIJIL);
            }

            public static boolean LJII(String str) {
                String str2;
                if (str == null || !C825710WaH.LIZJ || (str2 = C825710WaH.LIZ) == null || !Intrinsics.LJFF(str2, str)) {
                    return true;
                }
                return false;
            }

            public static void LIZLLL(int i, C0WZW c0wzw) {
                C0WS7 c0ws7 = c0wzw.LJFF;
                if (c0ws7 != null) {
                    c0ws7.LJ = "no_intent";
                }
                C825700WaG c825700WaG = C825700WaG.LIZ;
                App2AppData app2AppData = new App2AppData("noIntentCall", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                app2AppData.callSite = c0wzw.LIZLLL;
                app2AppData.codePointTag = c0wzw.LJ;
                app2AppData.LIZ = c0wzw.LJFF;
                c825700WaG.LIZ(i, app2AppData);
            }

            public static boolean LJ(int i, Intent intent, C0WZW c0wzw) throws Throwable {
                Integer numLIZ;
                boolean zLJI;
                App2AppData app2AppDataLIZLLL;
                C0WS7 c0ws7 = c0wzw.LJFF;
                boolean z = true;
                String strLIZIZ = null;
                if (c0ws7 == null) {
                    if (AutoDFIDManager.LIZIZ && C838990Wvh.LIZ()) {
                        numLIZ = AutoDFIDManager.LIZ(i);
                    } else {
                        numLIZ = null;
                    }
                    C825700WaG c825700WaG = C825700WaG.LIZ;
                    C825750WaL c825750WaL = new C825750WaL(numLIZ, c0wzw.LJ);
                    Iterator<InterfaceC825760WaM> it2 = C825700WaG.LIZJ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().LIZ(intent, c825750WaL)) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    zLJI = LJI(intent);
                } else {
                    C0WS7 c0ws7LJFF = c0ws7.LJFF("get_auto_dfid");
                    if (AutoDFIDManager.LIZIZ && C838990Wvh.LIZ()) {
                        numLIZ = AutoDFIDManager.LIZ(i);
                    } else {
                        numLIZ = null;
                    }
                    C0WSF c0wsf = c0ws7.LJI;
                    C0WSF c0wsf2 = C0WSF.EXCEEDED;
                    if (c0wsf == c0wsf2) {
                        c0ws7LJFF.LJFF = c0wsf2;
                    }
                    c0ws7LJFF.stop();
                    C0WS7 c0ws7LJFF2 = c0ws7.LJFF("sandbox_check");
                    C825700WaG c825700WaG2 = C825700WaG.LIZ;
                    C825750WaL c825750WaL2 = new C825750WaL(numLIZ, c0wzw.LJ);
                    Iterator<InterfaceC825760WaM> it3 = C825700WaG.LIZJ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (it3.next().LIZ(intent, c825750WaL2)) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    C0WSF c0wsf3 = c0ws7.LJI;
                    C0WSF c0wsf4 = C0WSF.EXCEEDED;
                    if (c0wsf3 == c0wsf4) {
                        c0ws7LJFF2.LJFF = c0wsf4;
                    }
                    c0ws7LJFF2.stop();
                    C0WS7 c0ws7LJFF3 = c0ws7.LJFF("is_intent_need_handle");
                    zLJI = LJI(intent);
                    C0WSF c0wsf5 = c0ws7.LJI;
                    C0WSF c0wsf6 = C0WSF.EXCEEDED;
                    if (c0wsf5 == c0wsf6) {
                        c0ws7LJFF3.LJFF = c0wsf6;
                    }
                    c0ws7LJFF3.stop();
                }
                if (zLJI) {
                    if (c0ws7 == null) {
                        app2AppDataLIZLLL = C825660WaC.LIZLLL(intent, "startActivity");
                        app2AppDataLIZLLL.callSite = c0wzw.LIZLLL;
                        app2AppDataLIZLLL.codePointTag = c0wzw.LJ;
                        if (numLIZ != null) {
                            strLIZIZ = C790280UzK.LIZIZ(numLIZ.intValue());
                        }
                        app2AppDataLIZLLL.autoDFID = strLIZIZ;
                        app2AppDataLIZLLL.LIZ = c0ws7;
                    } else {
                        C0WS7 c0ws7LJFF4 = c0ws7.LJFF("create_app2app_data");
                        app2AppDataLIZLLL = C825660WaC.LIZLLL(intent, "startActivity");
                        app2AppDataLIZLLL.callSite = c0wzw.LIZLLL;
                        app2AppDataLIZLLL.codePointTag = c0wzw.LJ;
                        if (numLIZ != null) {
                            strLIZIZ = C790280UzK.LIZIZ(numLIZ.intValue());
                        }
                        app2AppDataLIZLLL.autoDFID = strLIZIZ;
                        app2AppDataLIZLLL.LIZ = c0ws7;
                        C0WSF c0wsf7 = c0ws7.LJI;
                        C0WSF c0wsf8 = C0WSF.EXCEEDED;
                        if (c0wsf7 == c0wsf8) {
                            c0ws7LJFF4.LJFF = c0wsf8;
                        }
                        c0ws7LJFF4.stop();
                    }
                    C825700WaG.LIZ.LIZ(i, app2AppDataLIZLLL);
                } else if (c0ws7 != null) {
                    c0ws7.LJ = "intent_no_need_handle";
                    return z;
                }
                return z;
            }

            public static void LIZJ(int i, String str, Object[] objArr, C0WZW c0wzw) {
                String str2;
                Bundle bundle;
                Bundle bundle2;
                Uri uri;
                ContentValues contentValues;
                Uri uri2;
                ContentValues[] contentValuesArr;
                Uri uri3;
                ContentValues contentValues2;
                if (objArr != null) {
                    if (objArr.length != 0) {
                        String str3 = c0wzw.LIZLLL;
                        if (Intrinsics.LJFF(str, "insert") && objArr.length >= 2) {
                            Object obj = objArr[0];
                            if (obj instanceof Uri) {
                                uri3 = (Uri) obj;
                            } else {
                                uri3 = null;
                            }
                            Object obj2 = objArr[1];
                            if (obj2 instanceof ContentValues) {
                                contentValues2 = (ContentValues) obj2;
                            } else {
                                contentValues2 = null;
                            }
                            if (uri3 != null && contentValues2 != null && LJFF(uri3.getHost())) {
                                C825700WaG c825700WaG = C825700WaG.LIZ;
                                App2AppData app2AppDataLIZIZ = C825660WaC.LIZIZ(uri3, contentValues2);
                                app2AppDataLIZIZ.callSite = str3;
                                app2AppDataLIZIZ.LIZ = c0wzw.LJFF;
                                c825700WaG.LIZ(i, app2AppDataLIZIZ);
                                return;
                            }
                            return;
                        }
                        if (Intrinsics.LJFF(str, "bulkInsert") && objArr.length == 2) {
                            Object obj3 = objArr[0];
                            if (obj3 instanceof Uri) {
                                uri2 = (Uri) obj3;
                            } else {
                                uri2 = null;
                            }
                            Object obj4 = objArr[1];
                            if (obj4 instanceof ContentValues[]) {
                                contentValuesArr = (ContentValues[]) obj4;
                            } else {
                                contentValuesArr = null;
                            }
                            if (uri2 == null || contentValuesArr == null || !LJFF(uri2.getHost())) {
                                return;
                            }
                            for (ContentValues contentValues3 : contentValuesArr) {
                                C825700WaG c825700WaG2 = C825700WaG.LIZ;
                                App2AppData app2AppDataLIZIZ2 = C825660WaC.LIZIZ(uri2, contentValues3);
                                app2AppDataLIZIZ2.callSite = str3;
                                app2AppDataLIZIZ2.LIZ = c0wzw.LJFF;
                                c825700WaG2.LIZ(i, app2AppDataLIZIZ2);
                            }
                            return;
                        }
                        if (Intrinsics.LJFF(str, "update") && objArr.length >= 2) {
                            Object obj5 = objArr[0];
                            if (obj5 instanceof Uri) {
                                uri = (Uri) obj5;
                            } else {
                                uri = null;
                            }
                            Object obj6 = objArr[1];
                            if (obj6 instanceof ContentValues) {
                                contentValues = (ContentValues) obj6;
                            } else {
                                contentValues = null;
                            }
                            if (uri == null || contentValues == null || !LJFF(uri.getHost())) {
                                return;
                            }
                            C825700WaG c825700WaG3 = C825700WaG.LIZ;
                            App2AppData app2AppDataLIZIZ3 = C825660WaC.LIZIZ(uri, contentValues);
                            app2AppDataLIZIZ3.callSite = str3;
                            app2AppDataLIZIZ3.LIZ = c0wzw.LJFF;
                            c825700WaG3.LIZ(i, app2AppDataLIZIZ3);
                            return;
                        }
                        if (Intrinsics.LJFF(str, "call")) {
                            if (objArr.length == 4) {
                                Object obj7 = objArr[0];
                                if (obj7 instanceof Uri) {
                                    Uri uri4 = (Uri) obj7;
                                    Object obj8 = objArr[3];
                                    if (obj8 instanceof Bundle) {
                                        bundle2 = (Bundle) obj8;
                                    } else {
                                        bundle2 = null;
                                    }
                                    if (uri4 != null && LJFF(uri4.getHost())) {
                                        C825700WaG c825700WaG4 = C825700WaG.LIZ;
                                        App2AppData app2AppData = new App2AppData("contentResolver", null, null, null, null, null, null, null, null, null, null, C825680WaE.LIZ(uri4), C825670WaD.LIZ(bundle2), null, null, null, null, null, null, null, null, null);
                                        app2AppData.callSite = str3;
                                        app2AppData.LIZ = c0wzw.LJFF;
                                        c825700WaG4.LIZ(i, app2AppData);
                                    }
                                }
                            }
                            if (objArr.length != 4) {
                                return;
                            }
                            Object obj9 = objArr[0];
                            if (!(obj9 instanceof String)) {
                                return;
                            }
                            String str4 = (String) obj9;
                            Object obj10 = objArr[3];
                            if (obj10 instanceof Bundle) {
                                bundle = (Bundle) obj10;
                            } else {
                                bundle = null;
                            }
                            if (str4 == null || !LJFF(str4)) {
                                return;
                            }
                            C825700WaG c825700WaG5 = C825700WaG.LIZ;
                            App2AppData app2AppDataLIZJ = C825660WaC.LIZJ(bundle, str4);
                            app2AppDataLIZJ.callSite = str3;
                            app2AppDataLIZJ.LIZ = c0wzw.LJFF;
                            c825700WaG5.LIZ(i, app2AppDataLIZJ);
                            return;
                        }
                        if (!Intrinsics.LJFF(str, "applyBatch") || objArr.length != 2) {
                            return;
                        }
                        Object obj11 = objArr[0];
                        if (!(obj11 instanceof String) || (str2 = (String) obj11) == null || !LJFF(str2)) {
                            return;
                        }
                        C825700WaG c825700WaG6 = C825700WaG.LIZ;
                        App2AppData app2AppDataLIZJ2 = C825660WaC.LIZJ(null, str2);
                        app2AppDataLIZJ2.callSite = str3;
                        app2AppDataLIZJ2.LIZ = c0wzw.LJFF;
                        c825700WaG6.LIZ(i, app2AppDataLIZJ2);
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x017e  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(int r39, java.lang.String r40, java.lang.Object r41, java.lang.Object[] r42, java.lang.Object r43, X.C0WZW r44) {
                /*
                    Method dump skipped, instruction units count: 436
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C825650WaB.LIZIZ(int, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.Object, X.0WZW):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:104:0x016b A[Catch: all -> 0x02a5, TryCatch #4 {all -> 0x02a5, blocks: (B:15:0x002c, B:19:0x0034, B:21:0x0038, B:23:0x003c, B:25:0x004e, B:27:0x006d, B:28:0x0071, B:30:0x007b, B:32:0x007f, B:34:0x0083, B:37:0x0099, B:63:0x00f2, B:64:0x00f5, B:65:0x00f6, B:66:0x00f9, B:69:0x0104, B:102:0x0167, B:103:0x016a, B:104:0x016b, B:105:0x016e, B:108:0x0177, B:111:0x017f, B:113:0x0184, B:115:0x0188, B:117:0x018f, B:119:0x0193, B:121:0x019c, B:123:0x01a2, B:124:0x01b5, B:126:0x01b9, B:129:0x01c4, B:131:0x01c9, B:133:0x01cc, B:135:0x01d2, B:137:0x01da, B:138:0x01ec, B:139:0x01ef, B:141:0x01f3, B:144:0x01fe, B:146:0x0203, B:148:0x0207, B:150:0x020d, B:152:0x0215, B:153:0x0226, B:154:0x0229, B:156:0x022d, B:158:0x0236, B:161:0x023e, B:163:0x0243, B:165:0x0247, B:167:0x024d, B:169:0x0251, B:171:0x0255, B:172:0x0295, B:173:0x0298, B:176:0x029e, B:177:0x02a1), top: B:194:0x002c }] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00f6 A[Catch: all -> 0x02a5, TryCatch #4 {all -> 0x02a5, blocks: (B:15:0x002c, B:19:0x0034, B:21:0x0038, B:23:0x003c, B:25:0x004e, B:27:0x006d, B:28:0x0071, B:30:0x007b, B:32:0x007f, B:34:0x0083, B:37:0x0099, B:63:0x00f2, B:64:0x00f5, B:65:0x00f6, B:66:0x00f9, B:69:0x0104, B:102:0x0167, B:103:0x016a, B:104:0x016b, B:105:0x016e, B:108:0x0177, B:111:0x017f, B:113:0x0184, B:115:0x0188, B:117:0x018f, B:119:0x0193, B:121:0x019c, B:123:0x01a2, B:124:0x01b5, B:126:0x01b9, B:129:0x01c4, B:131:0x01c9, B:133:0x01cc, B:135:0x01d2, B:137:0x01da, B:138:0x01ec, B:139:0x01ef, B:141:0x01f3, B:144:0x01fe, B:146:0x0203, B:148:0x0207, B:150:0x020d, B:152:0x0215, B:153:0x0226, B:154:0x0229, B:156:0x022d, B:158:0x0236, B:161:0x023e, B:163:0x0243, B:165:0x0247, B:167:0x024d, B:169:0x0251, B:171:0x0255, B:172:0x0295, B:173:0x0298, B:176:0x029e, B:177:0x02a1), top: B:194:0x002c }] */
            @Override // X.C0WSV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WSU preInvoke(int r40, java.lang.String r41, java.lang.String r42, java.lang.Object r43, java.lang.Object[] r44, java.lang.String r45, X.C0WZW r46) {
                /*
                    Method dump skipped, instruction units count: 711
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C825650WaB.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
            }

            /* JADX WARN: Not initialized variable reg: 29, insn: 0x015c: INVOKE (r29 I:X.0WaB) VIRTUAL call: X.0WaB.LIZ():void A[MD:():void (m)] (LINE:134218076), block:B:80:0x015c */
            @Override // X.C0WSV
            public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
                C0WS7 c0ws7LJFF;
                IBinder iBinder;
                String interfaceDescriptor;
                ComponentName componentName;
                IBinder iBinder2;
                String interfaceDescriptor2;
                IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
                if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJI()) {
                    C0WS7 c0ws7 = c0wzw.LJFF;
                    if (c0ws7 != null) {
                        C0WS5.LIZ(c0ws7);
                        return;
                    }
                    return;
                }
                C0WS7 c0ws72 = c0wzw.LJFF;
                String strLJJIJIL = null;
                if (c0ws72 != null) {
                    c0ws7LJFF = c0ws72.LJFF("aspect_duration");
                } else {
                    c0ws7LJFF = null;
                }
                try {
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                if (!C825710WaH.LIZIZ) {
                    if (c0ws72 != null) {
                        c0ws72.LJ = "disable";
                        if (c0ws7LJFF != null) {
                            c0ws7LJFF.stop();
                        }
                    }
                    LIZ();
                    return;
                }
                if (obj instanceof ContentProvider) {
                    if (c0ws7LJFF != null) {
                        c0ws7LJFF.stop();
                    }
                    LIZIZ(i, str2, obj, objArr, obj2, c0wzw);
                    LIZ();
                    return;
                }
                String str3 = c0wzw.LIZLLL;
                if ((obj instanceof Service) && Intrinsics.LJFF(str2, "onBind")) {
                    if (c0ws7LJFF != null) {
                        c0ws7LJFF.stop();
                    }
                    if ((obj2 instanceof IBinder) && (iBinder2 = (IBinder) obj2) != null && (interfaceDescriptor2 = iBinder2.getInterfaceDescriptor()) != null) {
                        C825700WaG c825700WaG = C825700WaG.LIZ;
                        App2AppData app2AppData = new App2AppData("serviceOnBind", null, null, null, null, null, null, null, null, null, null, null, null, null, null, interfaceDescriptor2, null, null, null, null, null, null);
                        app2AppData.callSite = str3;
                        app2AppData.LIZ = c0wzw.LJFF;
                        c825700WaG.LIZ(i, app2AppData);
                    }
                    LIZ();
                    return;
                }
                if ((obj instanceof ServiceConnection) && Intrinsics.LJFF(str2, "onServiceConnected")) {
                    if (c0ws7LJFF != null) {
                        c0ws7LJFF.stop();
                    }
                    if (objArr.length == 2) {
                        Object obj3 = objArr[0];
                        if ((obj3 instanceof ComponentName) && (componentName = (ComponentName) obj3) != null) {
                            strLJJIJIL = C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEgAjS8/YVFkiQFyUc8nCTCgu49WZjFqWNFJZSysr1XnCHvn8A1PqJ30uMe5IDwykrbE=", null));
                        }
                        Object obj4 = objArr[1];
                        if ((obj4 instanceof IBinder) && (iBinder = (IBinder) obj4) != null && (interfaceDescriptor = iBinder.getInterfaceDescriptor()) != null && LJII(strLJJIJIL)) {
                            C825700WaG c825700WaG2 = C825700WaG.LIZ;
                            App2AppData app2AppData2 = new App2AppData("onServiceConnected", null, null, null, null, null, null, null, null, null, null, null, null, null, null, interfaceDescriptor, strLJJIJIL, null, null, null, null, null);
                            app2AppData2.callSite = str3;
                            app2AppData2.LIZ = c0wzw.LJFF;
                            c825700WaG2.LIZ(i, app2AppData2);
                        }
                    }
                    LIZ();
                    return;
                }
                if (c0ws7LJFF != null) {
                    c0ws7LJFF.stop();
                }
                LIZ();
            }
        });
        LIZ.put("1341532595983268394", new C0WSV() { // from class: X.0Waj
            @Override // X.C0WSV
            public final String name() {
                return "ApiCache";
            }

            @Override // X.C0WSV
            public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
                boolean zLIZ;
                if (!C825320WZe.LIZIZ()) {
                    C0WS7 c0ws7 = c0wzw.LJFF;
                    if (c0ws7 != null) {
                        C0WS5.LIZ(c0ws7);
                    }
                    return C0WSU.LIZLLL;
                }
                C826010Wal c826010Wal = (C826010Wal) ((LinkedHashMap) C826000Wak.LIZJ).get(Integer.valueOf(i));
                if (c826010Wal == null) {
                    C0WS7 c0ws72 = c0wzw.LJFF;
                    if (c0ws72 != null) {
                        c0ws72.LJ = "no_processor";
                    }
                    return new C0WSU(false, null);
                }
                InterfaceC826040Wao interfaceC826040Wao = c826010Wal.LIZLLL;
                if (interfaceC826040Wao != null && !interfaceC826040Wao.LIZ(objArr)) {
                    zLIZ = true;
                } else {
                    zLIZ = c826010Wal.LIZ.LIZ(c826010Wal.LIZIZ, c826010Wal.LIZJ.LIZ(str, str2, objArr), i, str, str2, str3, c0wzw);
                }
                if (zLIZ) {
                    c0wzw.LIZ(Boolean.FALSE, "api_cached");
                    return new C0WSU(false, null);
                }
                c0wzw.LIZ(Boolean.TRUE, "api_cached");
                return new C0WSU(true, c826010Wal.LIZIZ.get(c826010Wal.LIZJ.LIZ(str, str2, objArr)));
            }

            @Override // X.C0WSV
            public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
                if (!C825320WZe.LIZIZ()) {
                    C0WS7 c0ws7 = c0wzw.LJFF;
                    if (c0ws7 != null) {
                        C0WS5.LIZ(c0ws7);
                        return;
                    }
                    return;
                }
                InterfaceC826020Wam interfaceC826020Wam = C826000Wak.LIZ;
                if (interfaceC826020Wam != null) {
                    interfaceC826020Wam.LIZ(i, obj, objArr, c0wzw, obj2);
                }
                C826010Wal c826010Wal = (C826010Wal) ((LinkedHashMap) C826000Wak.LIZJ).get(Integer.valueOf(i));
                if (c826010Wal == null) {
                    C0WS7 c0ws72 = c0wzw.LJFF;
                    if (c0ws72 != null) {
                        c0ws72.LJ = " no_processor";
                        return;
                    }
                    return;
                }
                InterfaceC826040Wao interfaceC826040Wao = c826010Wal.LIZLLL;
                if (interfaceC826040Wao != null && !interfaceC826040Wao.LIZ(objArr)) {
                    return;
                }
                String strLIZ = c826010Wal.LIZJ.LIZ(str, str2, objArr);
                if (!z) {
                    return;
                }
                c826010Wal.LIZIZ.LIZIZ(strLIZ, obj2);
            }
        });
        LIZ.put("-7429938309886356696", new C0WSV() { // from class: X.0WOH
            @Override // X.C0WSV
            public final String name() {
                return "Hybrid";
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:16:0x0023, B:18:0x002b, B:20:0x002f, B:59:0x00c0, B:61:0x00c4, B:63:0x00c8, B:65:0x00cc, B:67:0x00d0, B:68:0x00d3, B:22:0x004a, B:36:0x0079, B:58:0x00bf, B:35:0x0078, B:24:0x0053, B:26:0x0057, B:28:0x005d, B:30:0x006a, B:31:0x0070, B:38:0x0082, B:40:0x0086, B:42:0x008c, B:44:0x0093, B:46:0x0099, B:48:0x009d, B:50:0x00a1, B:52:0x00ae, B:53:0x00b4, B:54:0x00b7), top: B:78:0x0015, inners: #0, #2 }] */
            @Override // X.C0WSV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WSU preInvoke(int r11, java.lang.String r12, java.lang.String r13, java.lang.Object r14, java.lang.Object[] r15, java.lang.String r16, X.C0WZW r17) {
                /*
                    Method dump skipped, instruction units count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0WOH.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
            }

            @Override // X.C0WSV
            public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
                Object c098200Yq;
                if (obj == null) {
                    return;
                }
                try {
                    BridgeHookDispatcher bridgeHookDispatcher = BridgeHookDispatcher.INSTANCE;
                    if (bridgeHookDispatcher.getConfig$com_bytedance_pumbaa_hybrid_hook_impl() != null) {
                        if (i == 300001) {
                            bridgeHookDispatcher.hookReturn(300001, obj2, new String[]{str, str2, c0wzw.LIZIZ});
                        }
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("postInvoke error. ");
                    sbLIZ.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        });
        LIZ.put("-1516358764934429257", new PermissionPopUpActionInvoker());
        LIZ.put("-1089009759877283926", new C0WSV() { // from class: X.0WZQ
            @Override // X.C0WSV
            public final String name() {
                return "SystemAPI";
            }

            @Override // X.C0WSV
            public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
            }

            @Override // X.C0WSV
            public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
                IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
                if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJII()) {
                    C0WS7 c0ws7 = c0wzw.LJFF;
                    if (c0ws7 != null) {
                        C0WS5.LIZ(c0ws7);
                    }
                    return C0WSU.LIZLLL;
                }
                C0WSU c0wsuLJ = new C0WZO() { // from class: X.0WZP
                    @Override // X.C0WZO
                    public final void LIZ() {
                    }

                    @Override // X.C0WZV
                    public final String name() {
                        return "SystemApi";
                    }

                    @Override // X.C0WZO
                    public final ProcessorConfig LIZIZ() {
                        return SystemApiServiceImpl.LIZ;
                    }

                    @Override // X.C0WZO
                    public final boolean LIZLLL() {
                        return SystemApiServiceImpl.LIZIZ;
                    }

                    @Override // X.C0WZO
                    public final void LIZJ(List<C0WZU> list, List<C0WZU> list2) {
                        try {
                            List listLJIIJJI = C1697810uHb.LJIIJJI(new C0WZL() { // from class: X.0WZK
                                @Override // X.C0WZU
                                public final String name() {
                                    return "IdConversionHandler";
                                }

                                /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
                                @Override // X.C0WZL
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LIZIZ(X.C0WZJ r6) {
                                    /*
                                        r5 = this;
                                        X.0WZW r0 = r6.LJFF
                                        boolean r0 = r0.LIZ
                                        if (r0 == 0) goto L98
                                        java.util.Map<java.lang.Integer, java.lang.Integer> r0 = X.C842070X1p.LIZ
                                        java.lang.Object r2 = r6.LIZIZ
                                        if (r2 == 0) goto L95
                                        boolean r0 = r2 instanceof java.lang.reflect.Method
                                        if (r0 == 0) goto L95
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                        java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                                        java.lang.Class r0 = r2.getDeclaringClass()
                                        java.lang.String r0 = r0.getName()
                                        r1.append(r0)
                                        r0 = 46
                                        r1.append(r0)
                                        java.lang.String r0 = r2.getName()
                                        r1.append(r0)
                                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                                        java.util.HashMap<java.lang.String, java.lang.Integer> r0 = X.C842070X1p.LIZIZ
                                        java.lang.Object r0 = r0.get(r1)
                                        java.lang.Integer r0 = (java.lang.Integer) r0
                                        if (r0 == 0) goto L95
                                        int r2 = r0.intValue()
                                        java.util.Map<java.lang.Integer, java.lang.Integer> r1 = X.C842070X1p.LIZ
                                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                                        java.lang.Object r0 = r1.get(r0)
                                        java.lang.Integer r0 = (java.lang.Integer) r0
                                        if (r0 == 0) goto L51
                                        int r2 = r0.intValue()
                                    L51:
                                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                                        if (r0 == 0) goto L95
                                        int r4 = r0.intValue()
                                    L5b:
                                        X.0WZW r0 = r6.LJFF
                                        boolean r0 = r0.LIZ
                                        if (r0 == 0) goto L8e
                                        java.lang.Object r0 = r6.LIZIZ
                                        if (r0 == 0) goto L7e
                                        boolean r0 = r0 instanceof java.lang.reflect.Method
                                        if (r0 == 0) goto L7e
                                        java.lang.Object[] r3 = r6.LIZJ
                                        r2 = 1
                                        if (r3 == 0) goto L7e
                                        int r0 = r3.length
                                        if (r0 == 0) goto L7e
                                        int r1 = r3.length
                                        int r0 = r3.length
                                        X.C1691430u7J.LIZ(r1, r0)
                                        java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r3, r2, r1)
                                        int r4 = X.C842070X1p.LIZ(r4, r0)
                                    L7e:
                                        int r0 = r6.LIZ
                                        X.0WZW r2 = r6.LJFF
                                        java.lang.String r1 = "origin_api_id"
                                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                        r2.LIZ(r0, r1)
                                        r6.LIZ = r4
                                        return
                                    L8e:
                                        java.lang.Object[] r0 = r6.LIZJ
                                        int r4 = X.C842070X1p.LIZ(r4, r0)
                                        goto L7e
                                    L95:
                                        int r4 = r6.LIZ
                                        goto L5b
                                    L98:
                                        java.util.Map<java.lang.Integer, java.lang.Integer> r0 = X.C842070X1p.LIZ
                                        int r4 = r6.LIZ
                                        java.util.Map<java.lang.Integer, java.lang.Integer> r1 = X.C842070X1p.LIZ
                                        java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                                        java.lang.Object r0 = r1.get(r0)
                                        java.lang.Integer r0 = (java.lang.Integer) r0
                                        if (r0 == 0) goto L5b
                                        int r4 = r0.intValue()
                                        goto L5b
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C0WZK.LIZIZ(X.0WZJ):void");
                                }
                            }, new C0WZL() { // from class: X.0WZH
                                @Override // X.C0WZU
                                public final String name() {
                                    return "SystemApiExtraContextHandler";
                                }

                                @Override // X.C0WZL
                                public final void LIZIZ(C0WZJ c0wzj) {
                                    c0wzj.LJFF.LIZ(40000, "trigger_id");
                                    c0wzj.LJII = "SystemApi";
                                    int i2 = c0wzj.LIZ;
                                    if (C825410WZn.LIZ.contains(Integer.valueOf(i2))) {
                                        Object[] objArr2 = c0wzj.LIZJ;
                                        Object obj2 = null;
                                        if (objArr2 != null) {
                                            obj2 = objArr2[0];
                                        }
                                        if ((obj2 instanceof String[]) && obj2 != null) {
                                            c0wzj.LIZ("permission", new C0WQ8(EnumC823400WRu.StringArray, obj2));
                                            return;
                                        }
                                        return;
                                    }
                                    if (i2 == 11025) {
                                        c0wzj.LIZ("cookie_params", new C0WR8(EnumC823400WRu.String, new C825100WYi(this, c0wzj)));
                                    }
                                }
                            }, new C0WZG(), new C0WZI());
                            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                            copyOnWriteArrayList.clear();
                            copyOnWriteArrayList.addAll(listLJIIJJI);
                            CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) list2;
                            copyOnWriteArrayList2.clear();
                            copyOnWriteArrayList2.addAll(listLJIIJJI);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
                            C0WSW.LIZ("PB_SYSTEM_API", new AwS557S0100000_13(e, 197), 6, e);
                        }
                    }
                }.LJ(new C0WZJ(i, obj, objArr, str3, c0wzw, c0wzw.LJFF));
                if (c0wsuLJ == null) {
                    return C0WSU.LIZLLL;
                }
                return c0wsuLJ;
            }
        });
        LIZ.put("5769144783956059643", new C0WSV() { // from class: X.0WZS
            @Override // X.C0WSV
            public final String name() {
                return "SDK";
            }

            @Override // X.C0WSV
            public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
            }

            @Override // X.C0WSV
            public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
                IPerformanceExprSwitch iPerformanceExprSwitchLIZ = C825320WZe.LIZ();
                if (iPerformanceExprSwitchLIZ != null && !iPerformanceExprSwitchLIZ.LJIIJ()) {
                    C0WS7 c0ws7 = c0wzw.LJFF;
                    if (c0ws7 != null) {
                        C0WS5.LIZ(c0ws7);
                    }
                    return C0WSU.LIZLLL;
                }
                C0WSU c0wsuLJ = new C0WZO() { // from class: X.0WZR
                    @Override // X.C0WZO
                    public final void LIZ() {
                    }

                    @Override // X.C0WZV
                    public final String name() {
                        return "SDK";
                    }

                    @Override // X.C0WZO
                    public final ProcessorConfig LIZIZ() {
                        return SDKServiceImpl.LIZ;
                    }

                    @Override // X.C0WZO
                    public final boolean LIZLLL() {
                        return SDKServiceImpl.LIZIZ;
                    }

                    @Override // X.C0WZO
                    public final void LIZJ(List<C0WZU> list, List<C0WZU> list2) {
                        try {
                            List listLJIIJJI = C1697810uHb.LJIIJJI(new C0WZL() { // from class: X.0WZT
                                @Override // X.C0WZU
                                public final String name() {
                                    return "SDKExtraContextHandler";
                                }

                                @Override // X.C0WZL
                                public final void LIZIZ(C0WZJ c0wzj) {
                                    c0wzj.LJFF.LIZ(40001, "trigger_id");
                                    c0wzj.LJII = "SDK";
                                }
                            }, new C0WZG(), new C0WZI());
                            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                            copyOnWriteArrayList.clear();
                            copyOnWriteArrayList.addAll(listLJIIJJI);
                            CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) list2;
                            copyOnWriteArrayList2.clear();
                            copyOnWriteArrayList2.addAll(listLJIIJJI);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
                            C0WSW.LIZ("PB_3rd_SDK", new AwS557S0100000_13(e, 187), 6, e);
                        }
                    }
                }.LJ(new C0WZJ(i, obj, objArr, str3, c0wzw, c0wzw.LJFF));
                if (c0wsuLJ == null) {
                    return C0WSU.LIZLLL;
                }
                return c0wsuLJ;
            }
        });
        LIZ.put("-2308188677860475076", new C0WSV() { // from class: X.0WYy
            public static final C0WSU LIZ = new C0WSU(false, null);
            public static volatile boolean LIZIZ = true;

            @Override // X.C0WSV
            public final String name() {
                return "PBAC_SystemAPI";
            }

            @Override // X.C0WSV
            public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
            }

            {
                if (C825230WYv.LIZJ == null) {
                    C825230WYv.LIZJ = new InterfaceC1847807Lo() { // from class: X.0WTp
                        @Override // X.InterfaceC1847807Lo
                        public final Map<String, Integer> LIZ() {
                            Map<Integer, C823880WTq> map2 = ApiHookConfig.LIZIZ;
                            HashMap map3 = new HashMap(map2.size());
                            for (C823880WTq c823880WTq : map2.values()) {
                                map3.put(c823880WTq.LIZIZ, Integer.valueOf(c823880WTq.LIZ));
                            }
                            return map3;
                        }
                    };
                    C842080X1q c842080X1q = C842080X1q.LIZ;
                    C842080X1q.LIZJ = null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
            @Override // X.C0WSV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WSU preInvoke(int r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, java.lang.Object[] r22, java.lang.String r23, X.C0WZW r24) {
                /*
                    Method dump skipped, instruction units count: 333
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C825260WYy.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
            }
        });
    }

    static {
        Map map = Collections.EMPTY_MAP;
        LIZ = map;
        LIZIZ = map;
        LIZJ = new C0WSV[0];
        try {
            LIZIZ();
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C823280WRi.LIZJ("ApiHookConfig init failed", "hook_failed", th);
        }
    }

    public static void LIZ() {
        HashMap map = new HashMap(443);
        LIZIZ = map;
        map.put(400000, new C823880WTq(400000, "java.net.URL.openConnection", "uc", "UrlConnection", new String[]{"url_connection"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400100, new C823880WTq(400100, "okhttp3.OkHttpClient$Builder.build", "oh", "OkHttp", new String[]{"ok_http"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400102, new C823880WTq(400102, "okhttp3.Call.execute", "oh", "OkHttp", new String[]{"ok_http"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400103, new C823880WTq(400103, "okhttp3.Call.enqueue", "oh", "OkHttp", new String[]{"ok_http"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400200, new C823880WTq(400200, "com.bytedance.retrofit2.Retrofit$Builder.build", "ttn", "TTNet", new String[]{"tt_net"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400201, new C823880WTq(400201, "[com.bytedance.frameworks.baselib.network.http.NetworkParams$MonitorProcessHook].monitorApiOk", "ttn", "TTNet", new String[]{"tt_net"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400202, new C823880WTq(400202, "[com.bytedance.frameworks.baselib.network.http.NetworkParams$MonitorProcessHook].monitorApiError", "ttn", "TTNet", new String[]{"tt_net"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400204, new C823880WTq(400204, "com.bytedance.retrofit2.SsHttpCall.execute", "ttn", "TTNet", new String[]{"tt_net"}, new String[]{"6399108190750172076", "3045288484119911579", "5104064429945101381"}, "before"));
        LIZIZ.put(400205, new C823880WTq(400205, "com.bytedance.retrofit2.SsHttpCall.enqueue", "ttn", "TTNet", new String[]{"tt_net"}, new String[]{"6399108190750172076", "3045288484119911579", "5104064429945101381"}, "before"));
        LIZIZ.put(400600, new C823880WTq(400600, "com.facebook.imagepipeline.request.ImageRequestBuilder.build", "fresco", "Fresco", new String[]{"fresco"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400601, new C823880WTq(400601, "com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService.getDownloadId", "downloader", "Downloader", new String[]{"downloader"}, new String[]{"6399108190750172076", "3045288484119911579"}, "before"));
        LIZIZ.put(400206, new C823880WTq(400206, "com.bytedance.retrofit2.RequestBuilder.build", "ttn", "TTNet", new String[]{"tt_net"}, new String[]{"5104064429945101381"}, "before"));
        LIZIZ.put(400207, new C823880WTq(400207, "okhttp3.internal.http.CallServerInterceptor.intercept", "okhttp", "OkHttp", new String[]{"okhttp"}, new String[]{"5104064429945101381"}, "before"));
        LIZIZ.put(400208, new C823880WTq(400208, "okhttp3.Request$Builder.build", "okhttp", "OkHttp", new String[]{"okhttp"}, new String[]{"5104064429945101381"}, "before"));
        LIZIZ.put(400209, new C823880WTq(400209, "okhttp3.RealCall.execute", "okhttp", "OkHttp", new String[]{"okhttp"}, new String[]{"5104064429945101381"}, "before"));
        LIZIZ.put(400210, new C823880WTq(400210, "okhttp3.RealCall.enqueue", "okhttp", "OkHttp", new String[]{"okhttp"}, new String[]{"5104064429945101381"}, "before"));
        LIZIZ.put(400212, new C823880WTq(400212, "com.bytedance.frameworks.baselib.network.http.cronet.impl.SsCronetHttpClient.newSsCall", "ttn", "TTNet", new String[]{"tt_net"}, new String[]{"5104064429945101381"}, "before"));
        LIZIZ.put(998, new C823880WTq(998, "android.widget.EditText.getText", "", "", new String[0], new String[]{"8776799120278443433", "7439605704018119864"}, "around"));
        LIZIZ.put(999, new C823880WTq(999, "android.widget.TextView.getEditableText", "", "", new String[0], new String[]{"8776799120278443433", "7439605704018119864"}, "around"));
        LIZIZ.put(101803, new C823880WTq(101803, "android.content.ClipboardManager.getPrimaryClip", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10975, new C823880WTq(10975, "android.net.DhcpInfo.dns1", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10976, new C823880WTq(10976, "android.net.DhcpInfo.dns2", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10977, new C823880WTq(10977, "android.net.DhcpInfo.gateway", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10978, new C823880WTq(10978, "android.net.DhcpInfo.ipAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10979, new C823880WTq(10979, "android.net.DhcpInfo.serverAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10224, new C823880WTq(10224, "android.net.wifi.WifiInfo.getIpAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2777, new C823880WTq(2777, "java.net.Inet4Address.getHostAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10906, new C823880WTq(10906, "java.net.Inet6Address.getAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2778, new C823880WTq(2778, "java.net.Inet6Address.getHostAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(910011, new C823880WTq(910011, "java.net.InetAddress.getLocalHost", "", "", new String[0], new String[]{"-2500605437669296322"}, "around"));
        LIZIZ.put(100015, new C823880WTq(100015, "android.bluetooth.BluetoothAdapter.getAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100014, new C823880WTq(100014, "android.bluetooth.BluetoothDevice.getAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10226, new C823880WTq(10226, "android.net.wifi.WifiInfo.getApMldMacAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101700, new C823880WTq(101700, "android.net.wifi.WifiInfo.getMacAddress", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101701, new C823880WTq(101701, "java.net.NetworkInterface.getHardwareAddress", "", "", new String[]{"device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10233, new C823880WTq(10233, "android.net.wifi.ScanResult.SSID", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10221, new C823880WTq(10221, "android.net.wifi.WifiConfiguration.SSID", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101000, new C823880WTq(101000, "android.net.wifi.WifiInfo.getSSID", "", "", new String[]{"location", "wifi", "device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10985, new C823880WTq(10985, "android.net.wifi.WifiManager.addNetworkSuggestions", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101001, new C823880WTq(101001, "android.net.wifi.WifiManager.getConfiguredNetworks", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102301, new C823880WTq(102301, "android.net.wifi.WifiManager.getConnectionInfo", "", "", new String[]{"wifi", "location"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10986, new C823880WTq(10986, "android.net.wifi.WifiManager.removeNetworkSuggestions", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10232, new C823880WTq(10232, "android.net.wifi.ScanResult.BSSID", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10220, new C823880WTq(10220, "android.net.wifi.WifiConfiguration.BSSID", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101100, new C823880WTq(101100, "android.net.wifi.WifiInfo.getBSSID", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101600, new C823880WTq(101600, "android.telephony.TelephonyManager.getDeviceId", "", "", new String[]{"network", "device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102015, new C823880WTq(102015, "android.telephony.TelephonyManager.getDeviceSoftwareVersion", "", "", new String[0], new String[]{"-2500605437669296322"}, "before"));
        LIZIZ.put(101601, new C823880WTq(101601, "android.telephony.TelephonyManager.getImei", "", "", new String[]{"network", "device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101602, new C823880WTq(101602, "android.telephony.TelephonyManager.getMeid", "", "", new String[]{"network", "device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102004, new C823880WTq(102004, "android.provider.Settings$Secure.getString", "", "", new String[]{"device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102003, new C823880WTq(102003, "android.provider.Settings$System.getString", "", "", new String[]{"device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103001, new C823880WTq(103001, "androidx.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo", "", "", new String[0], new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103005, new C823880WTq(103005, "androidx.ads.identifier.provider.IAdvertisingIdService.getId", "", "", new String[0], new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103000, new C823880WTq(103000, "com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo", "", "", new String[0], new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(3085, new C823880WTq(3085, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.getId", "", "", new String[0], new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101500, new C823880WTq(101500, "android.telephony.SubscriptionInfo.getIccId", "", "", new String[]{"network", "device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101400, new C823880WTq(101400, "android.telephony.TelephonyManager.getSimSerialNumber", "", "", new String[]{"network", "device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101200, new C823880WTq(101200, "android.os.Build.getSerial", "", "", new String[]{"device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102002, new C823880WTq(102002, "android.os.Build.SERIAL", "", "", new String[]{"device_info"}, new String[]{"-2500605437669296322", "1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100912, new C823880WTq(100912, "android.telephony.PhoneStateListener.onCellInfoChanged", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100909, new C823880WTq(100909, "android.telephony.TelephonyManager.getAllCellInfo", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10335, new C823880WTq(10335, "android.telephony.TelephonyManager.getNeighboringCellInfo", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2801, new C823880WTq(2801, "android.telephony.TelephonyManager.listen", "", "", new String[0], new String[]{"-2500605437669296322", "-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100910, new C823880WTq(100910, "android.telephony.TelephonyManager.requestCellInfoUpdate", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10925, new C823880WTq(10925, "android.telephony.TelephonyManager.requestNetworkScan", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10278, new C823880WTq(10278, "android.telephony.CellIdentityCdma.getBaseStationId", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10281, new C823880WTq(10281, "android.telephony.CellIdentityCdma.getNetworkId", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10282, new C823880WTq(10282, "android.telephony.CellIdentityCdma.getSystemId", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10277, new C823880WTq(10277, "android.telephony.CellIdentityGsm.getPsc", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10285, new C823880WTq(10285, "android.telephony.CellIdentityNr.getNci", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10286, new C823880WTq(10286, "android.telephony.CellIdentityNr.getPci", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10288, new C823880WTq(10288, "android.telephony.CellIdentityTdscdma.getCid", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10289, new C823880WTq(10289, "android.telephony.CellIdentityTdscdma.getCpid", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10294, new C823880WTq(10294, "android.telephony.CellIdentityWcdma.getCid", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10301, new C823880WTq(10301, "android.telephony.CellIdentityWcdma.getPsc", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10920, new C823880WTq(10920, "android.telephony.ServiceState.getCdmaNetworkId", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10921, new C823880WTq(10921, "android.telephony.ServiceState.getCdmaSystemId", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10047, new C823880WTq(10047, "android.app.ApplicationPackageManager.getInstalledApplicationsAsUser", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10051, new C823880WTq(10051, "android.app.ApplicationPackageManager.getInstalledPackages", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101304, new C823880WTq(101304, "android.content.pm.PackageManager.getInstalledApplications", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101305, new C823880WTq(101305, "android.content.pm.PackageManager.getInstalledApplicationsAsUser", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10877, new C823880WTq(10877, "android.content.pm.PackageManager.getInstalledModules", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101309, new C823880WTq(101309, "android.content.pm.PackageManager.getInstalledPackages", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101308, new C823880WTq(101308, "android.content.pm.PackageManager.getInstalledPackagesAsUser", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101300, new C823880WTq(101300, "android.app.ActivityManager.getRecentTasks", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2788, new C823880WTq(2788, "android.app.ActivityManager.getRunningAppProcesses", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101302, new C823880WTq(101302, "android.app.ActivityManager.getRunningServices", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101301, new C823880WTq(101301, "android.app.ActivityManager.getRunningTasks", "", "", new String[0], new String[]{"-2500605437669296322", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(240004, new C823880WTq(240004, "android.content.ContentResolver.query", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(240015, new C823880WTq(240015, "android.content.ContentResolver.applyBatch", "", "", new String[0], new String[]{"-794356015723542660", "-6267612998153757685", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100006, new C823880WTq(100006, "android.location.LocationManager.addNmeaListener", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100007, new C823880WTq(100007, "android.location.LocationManager.addProximityAlert", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100009, new C823880WTq(100009, "android.location.LocationManager.registerGnssMeasurementsCallback", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100010, new C823880WTq(100010, "android.location.LocationManager.registerGnssNavigationMessageCallback", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10149, new C823880WTq(10149, "android.location.Location.getAltitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10150, new C823880WTq(10150, "android.location.Location.getMslAltitudeMeters", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10151, new C823880WTq(10151, "android.location.Location.getSpeed", "", "", new String[0], new String[]{"-794356015723542660"}, "around"));
        LIZIZ.put(10152, new C823880WTq(10152, "android.location.Location.getBearing", "", "", new String[0], new String[]{"-794356015723542660"}, "around"));
        LIZIZ.put(10154, new C823880WTq(10154, "android.location.Location.getLatitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10155, new C823880WTq(10155, "android.location.Location.getLongitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10893, new C823880WTq(10893, "android.location.Address.getLatitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10894, new C823880WTq(10894, "android.location.Address.getLongitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100100, new C823880WTq(100100, "android.hardware.Camera.open", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100101, new C823880WTq(100101, "android.hardware.Camera.release", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100102, new C823880WTq(100102, "android.hardware.Camera.startPreview", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100103, new C823880WTq(100103, "android.hardware.Camera.stopPreview", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100200, new C823880WTq(100200, "android.hardware.camera2.CameraDevice$StateCallback.onOpened", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100201, new C823880WTq(100201, "android.hardware.camera2.CameraDevice.close", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100206, new C823880WTq(100206, "android.hardware.camera2.CameraManager.openCamera", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100403, new C823880WTq(100403, "android.media.AudioRecord.release", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100400, new C823880WTq(100400, "android.media.AudioRecord.startRecording", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100401, new C823880WTq(100401, "android.media.AudioRecord.stop", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10892, new C823880WTq(10892, "android.media.AudioRecord.read", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100500, new C823880WTq(100500, "android.media.MediaRecorder.prepare", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100501, new C823880WTq(100501, "android.media.MediaRecorder.release", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100502, new C823880WTq(100502, "android.media.MediaRecorder.start", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100503, new C823880WTq(100503, "android.media.MediaRecorder.stop", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10178, new C823880WTq(10178, "android.media.ExifInterface.getAltitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(771, new C823880WTq(771, "android.media.ExifInterface.getLatLong", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(776, new C823880WTq(776, "android.media.ExifInterface.getAttribute", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(786, new C823880WTq(786, "android.media.ExifInterface.getAttributeDouble", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(791, new C823880WTq(791, "android.media.ExifInterface.getAttributeInt", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10897, new C823880WTq(10897, "android.media.ExifInterface.getAttributeBytes", "", "", new String[0], new String[]{"-794356015723542660"}, "around"));
        LIZIZ.put(10898, new C823880WTq(10898, "android.media.ExifInterface.getAttributeRange", "", "", new String[0], new String[]{"-794356015723542660"}, "around"));
        LIZIZ.put(346, new C823880WTq(346, "androidx.exifinterface.media.ExifInterface.getAttributeDouble", "", "", new String[0], new String[]{"-794356015723542660"}, "around"));
        LIZIZ.put(10874, new C823880WTq(10874, "androidx.exifinterface.media.ExifInterface.getLatLong", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10875, new C823880WTq(10875, "androidx.exifinterface.media.ExifInterface.getExifAttribute", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(800, new C823880WTq(800, "android.media.MediaMetadataRetriever.extractMetadata", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10195, new C823880WTq(10195, "android.media.MediaScannerConnection.scanFile", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2920, new C823880WTq(2920, "android.media.projection.MediaProjection.createVirtualDisplay", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102102, new C823880WTq(102102, "android.media.projection.MediaProjection.stop", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102100, new C823880WTq(102100, "android.media.projection.MediaProjectionManager.createScreenCaptureIntent", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100902, new C823880WTq(100902, "android.telephony.cdma.CdmaCellLocation.getBaseStationLatitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100903, new C823880WTq(100903, "android.telephony.cdma.CdmaCellLocation.getBaseStationLongitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100907, new C823880WTq(100907, "android.telephony.gsm.GsmCellLocation.getLac", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102016, new C823880WTq(102016, "android.telephony.CellIdentityLte.getTac", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10271, new C823880WTq(10271, "android.telephony.CellIdentityGsm.getLac", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10279, new C823880WTq(10279, "android.telephony.CellIdentityCdma.getLatitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10280, new C823880WTq(10280, "android.telephony.CellIdentityCdma.getLongitude", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10287, new C823880WTq(10287, "android.telephony.CellIdentityNr.getTac", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10290, new C823880WTq(10290, "android.telephony.CellIdentityTdscdma.getLac", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10295, new C823880WTq(10295, "android.telephony.CellIdentityWcdma.getLac", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100911, new C823880WTq(100911, "android.telephony.PhoneStateListener.onCellLocationChanged", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100900, new C823880WTq(100900, "android.telephony.TelephonyManager.getCellLocation", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4070, new C823880WTq(4070, "android.telephony.TelephonyManager.registerTelephonyCallback", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2824, new C823880WTq(2824, "android.view.PixelCopy.request", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2826, new C823880WTq(2826, "android.view.View.getDrawingCache", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10984, new C823880WTq(10984, "android.app.UiAutomation.takeScreenshot", "", "", new String[0], new String[]{"-794356015723542660", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10501, new C823880WTq(10501, "androidx.fragment.app.Fragment.onHiddenChanged", "", "", new String[0], new String[]{"6874342944401051481"}, "before"));
        LIZIZ.put(10502, new C823880WTq(10502, "androidx.fragment.app.Fragment.setUserVisibleHint", "", "", new String[0], new String[]{"6874342944401051481"}, "before"));
        LIZIZ.put(11098, new C823880WTq(11098, "android.app.Activity.startActivity", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11097, new C823880WTq(11097, "android.app.Activity.startActivityIfNeeded", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11094, new C823880WTq(11094, "android.app.Activity.startActivityForResult", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11093, new C823880WTq(11093, "android.app.Activity.startActivities", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11092, new C823880WTq(11092, "android.app.Activity.startActivityFromChild", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11091, new C823880WTq(11091, "android.app.Activity.startActivityFromFragment", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11090, new C823880WTq(11090, "android.content.Context.startActivity", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11089, new C823880WTq(11089, "android.content.Context.startActivities", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11088, new C823880WTq(11088, "androidx.fragment.app.Fragment.startActivity", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11087, new C823880WTq(11087, "androidx.fragment.app.Fragment.startActivityForResult", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11086, new C823880WTq(11086, "android.app.Fragment.startActivity", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11085, new C823880WTq(11085, "android.app.Fragment.startActivityForResult", "", "", new String[0], new String[]{"-6267612998153757685", "-7429938309886356696"}, "around"));
        LIZIZ.put(11084, new C823880WTq(11084, "android.content.Context.startService", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11083, new C823880WTq(11083, "android.content.Context.startForegroundService", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11063, new C823880WTq(11063, "android.content.Context.bindService", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11082, new C823880WTq(11082, "android.content.Context.bindIsolatedService", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11081, new C823880WTq(11081, "android.content.Context.bindServiceAsUser", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11080, new C823880WTq(11080, "android.content.Context.sendBroadcast", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11079, new C823880WTq(11079, "android.content.Context.sendBroadcastAsUser", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11078, new C823880WTq(11078, "android.content.Context.sendBroadcastWithMultiplePermissions", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11077, new C823880WTq(11077, "android.content.Context.sendOrderedBroadcast", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11076, new C823880WTq(11076, "android.content.Context.sendOrderedBroadcastAsUser", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11099, new C823880WTq(11099, "android.content.Context.sendStickyBroadcast", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11075, new C823880WTq(11075, "android.content.Context.sendStickyBroadcastAsUser", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11074, new C823880WTq(11074, "android.content.Context.sendStickyOrderedBroadcast", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11095, new C823880WTq(11095, "android.content.Context.sendStickyOrderedBroadcastAsUser", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(10972, new C823880WTq(10972, "android.content.ContentResolver.insert", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11073, new C823880WTq(11073, "android.content.ContentResolver.bulkInsert", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(10971, new C823880WTq(10971, "android.content.ContentResolver.update", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11072, new C823880WTq(11072, "android.content.ContentResolver.call", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11071, new C823880WTq(11071, "android.app.Activity.setResult", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11070, new C823880WTq(11070, "android.content.BroadcastReceiver.setResultExtras", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11069, new C823880WTq(11069, "android.content.BroadcastReceiver.setResult", "", "", new String[0], new String[]{"-6267612998153757685"}, "around"));
        LIZIZ.put(11068, new C823880WTq(11068, "android.content.ContentProvider.query", "", "", new String[0], new String[]{"-6267612998153757685"}, "before"));
        LIZIZ.put(11067, new C823880WTq(11067, "android.content.ContentProvider.call", "", "", new String[0], new String[]{"-6267612998153757685"}, "before"));
        LIZIZ.put(11066, new C823880WTq(11066, "android.content.ContentProvider.applyBatch", "", "", new String[0], new String[]{"-6267612998153757685"}, "before"));
        LIZIZ.put(11065, new C823880WTq(11065, "android.app.Service.onBind", "", "", new String[0], new String[]{"-6267612998153757685"}, "before"));
        LIZIZ.put(11064, new C823880WTq(11064, "android.content.ServiceConnection.onServiceConnected", "", "", new String[0], new String[]{"-6267612998153757685"}, "before"));
        LIZIZ.put(101900, new C823880WTq(101900, "android.telephony.TelephonyManager.getSubscriberId", "", "", new String[]{"network", "device_info"}, new String[]{"1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102000, new C823880WTq(102000, "android.telephony.TelephonyManager.getLine1Number", "", "", new String[]{"network", "device_info"}, new String[]{"1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102001, new C823880WTq(102001, "android.telephony.TelephonyManager.getVoiceMailNumber", "", "", new String[]{"network", "device_info"}, new String[]{"1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102012, new C823880WTq(102012, "android.telecom.TelecomManager.getLine1Number", "", "", new String[]{"network", "device_info"}, new String[]{"1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102013, new C823880WTq(102013, "android.telephony.TelephonyManager.getNetworkType", "", "", new String[]{"network"}, new String[]{"1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100702, new C823880WTq(100702, "android.hardware.SensorManager.getSensorList", "", "", new String[]{"motion"}, new String[]{"1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100703, new C823880WTq(100703, "android.hardware.SensorManager.getDefaultSensor", "", "", new String[]{"motion"}, new String[]{"1341532595983268394", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(300000, new C823880WTq(300000, "android.app.Dialog.show", "hb", "Hybrid", new String[0], new String[]{"-7429938309886356696", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(300001, new C823880WTq(300001, e3.d, "hb", "Hybrid", new String[0], new String[]{"-7429938309886356696"}, "before"));
        LIZIZ.put(300002, new C823880WTq(300002, e3.d, "hb", "Hybrid", new String[0], new String[]{"-7429938309886356696"}, "before"));
        LIZIZ.put(300003, new C823880WTq(300003, "com.lynx.jsbridge.CallbackImpl.invoke", "hb", "Hybrid", new String[0], new String[]{"-7429938309886356696"}, "before"));
        LIZIZ.put(300004, new C823880WTq(300004, "com.lynx.tasm.LynxTemplateRender.dispatchOnPageStart", "hb", "Hybrid", new String[0], new String[]{"-7429938309886356696"}, "before"));
        LIZIZ.put(102600, new C823880WTq(102600, "android.app.Activity.requestPermissions", "", "", new String[0], new String[]{"-1516358764934429257", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(11051, new C823880WTq(11051, "android.app.Activity.onRequestPermissionsResult", "", "", new String[0], new String[]{"-1516358764934429257"}, "before"));
        LIZIZ.put(102601, new C823880WTq(102601, "android.app.Fragment.requestPermissions", "", "", new String[0], new String[]{"-1516358764934429257", "-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(11052, new C823880WTq(11052, "android.app.Fragment.onRequestPermissionsResult", "", "", new String[0], new String[]{"-1516358764934429257"}, "before"));
        LIZIZ.put(11025, new C823880WTq(11025, "android.webkit.CookieManager.setCookie", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4165, new C823880WTq(4165, "android.app.ActivityManager.getMemoryInfo", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4166, new C823880WTq(4166, "android.content.pm.PackageManager.getApplicationInfo", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4167, new C823880WTq(4167, "android.content.pm.PackageManager.queryIntentActivityOptions", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4168, new C823880WTq(4168, "android.content.pm.PackageManager.getPackagesHoldingPermissions", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4169, new C823880WTq(4169, "android.content.pm.PackageManager.resolveActivityAsUser", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4163, new C823880WTq(4163, "android.os.StatFs.getBlockSizeLong", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4164, new C823880WTq(4164, "android.os.StatFs.getBlockCountLong", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4162, new C823880WTq(4162, "com.android.webview.chromium.a.setCookie", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4161, new C823880WTq(4161, "com.android.webview.chromium.a.getCookie", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4069, new C823880WTq(4069, "java.lang.Thread.getAllStackTraces", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(4068, new C823880WTq(4068, "android.view.WindowManager.getDefaultDisplay", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103204, new C823880WTq(103204, "androidx.health.connect.client.HealthConnectClient.getChanges", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103201, new C823880WTq(103201, "androidx.health.connect.client.HealthConnectClient.aggregateGroupByDuration", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101311, new C823880WTq(101311, "android.content.pm.PackageManager.queryIntentActivities", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103203, new C823880WTq(103203, "androidx.health.connect.client.HealthConnectClient.deleteRecords", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100915, new C823880WTq(100915, "android.telephony.TelephonyManager.getSimCarrierId", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100918, new C823880WTq(100918, "android.telephony.TelephonyManager.getSimOperatorName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103206, new C823880WTq(103206, "androidx.health.connect.client.HealthConnectClient.insertRecords", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102021, new C823880WTq(102021, "android.telephony.SubscriptionInfo.getNumber", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100916, new C823880WTq(100916, "android.telephony.TelephonyManager.getSimCarrierIdName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103200, new C823880WTq(103200, "androidx.health.connect.client.HealthConnectClient.aggregate", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103202, new C823880WTq(103202, "androidx.health.connect.client.HealthConnectClient.aggregateGroupByPeriod", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103207, new C823880WTq(103207, "androidx.health.connect.client.HealthConnectClient.readRecord", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102019, new C823880WTq(102019, "android.telephony.SubscriptionManager.getAccessibleSubscriptionInfoList", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103208, new C823880WTq(103208, "androidx.health.connect.client.HealthConnectClient.updateRecords", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100914, new C823880WTq(100914, "android.telephony.TelephonyManager.getCarrierIdFromSimMccMnc", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(3002, new C823880WTq(3002, "android.view.WindowManager.getCurrentWindowMetrics", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(110000, new C823880WTq(110000, "java.lang.reflect.Method.invoke", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100701, new C823880WTq(100701, "android.hardware.SensorManager.unregisterListener", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101807, new C823880WTq(101807, "android.content.ClipboardManager.setPrimaryClip", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2945, new C823880WTq(2945, "androidx.fragment.app.Fragment.requestPermissions", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101306, new C823880WTq(101306, "android.view.accessibility.AccessibilityManager.getInstalledAccessibilityServiceList", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100922, new C823880WTq(100922, "android.telephony.TelephonyManager.getSimCountryIso", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2918, new C823880WTq(2918, "android.os.StatFs.getBlockCount", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101307, new C823880WTq(101307, "android.view.accessibility.AccessibilityManager.getEnabledAccessibilityServiceList", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2907, new C823880WTq(2907, "android.os.StatFs.getAvailableBlocks", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2885, new C823880WTq(2885, "java.util.Locale.getCountry", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2883, new C823880WTq(2883, "android.os.StatFs.getBlockSize", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2881, new C823880WTq(2881, "androidx.core.app.ActivityCompat.requestPermissions", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102604, new C823880WTq(102604, "android.webkit.WebChromeClient.onPermissionRequest", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102605, new C823880WTq(102605, "android.webkit.PermissionRequest.grant", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102606, new C823880WTq(102606, "android.webkit.PermissionRequest.deny", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100700, new C823880WTq(100700, "android.hardware.SensorManager.registerListener", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102017, new C823880WTq(102017, "android.telephony.TelephonyManager.getEsn", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(103100, new C823880WTq(103100, "android.webkit.CookieManager.getCookie", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102101, new C823880WTq(102101, "android.media.projection.MediaProjectionManager.getMediaProjection", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100920, new C823880WTq(100920, "android.telephony.TelephonyManager.getNetworkOperatorName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100921, new C823880WTq(100921, "android.telephony.TelephonyManager.getNetworkCountryIso", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100919, new C823880WTq(100919, "android.telephony.TelephonyManager.getNetworkOperator", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100917, new C823880WTq(100917, "android.telephony.TelephonyManager.getSimOperator", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101310, new C823880WTq(101310, "android.content.pm.PackageManager.getPackagesForUid", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100908, new C823880WTq(100908, "android.telephony.gsm.GsmCellLocation.getPsc", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100901, new C823880WTq(100901, "android.telephony.cdma.CdmaCellLocation.getBaseStationId", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100904, new C823880WTq(100904, "android.telephony.cdma.CdmaCellLocation.getSystemId", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100905, new C823880WTq(100905, "android.telephony.cdma.CdmaCellLocation.getNetworkId", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100906, new C823880WTq(100906, "android.telephony.gsm.GsmCellLocation.getCid", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100003, new C823880WTq(100003, "android.webkit.WebChromeClient.onGeolocationPermissionsShowPrompt", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100012, new C823880WTq(100012, "android.webkit.GeolocationPermissions$Callback.invoke", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2758, new C823880WTq(2758, "android.text.ClipboardManager.setText", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2759, new C823880WTq(2759, "android.text.ClipboardManager.getText", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101800, new C823880WTq(101800, "android.content.ClipboardManager.clearPrimaryClip", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101804, new C823880WTq(101804, "android.content.ClipboardManager.getText", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(101808, new C823880WTq(101808, "android.content.ClipboardManager.setText", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2738, new C823880WTq(2738, "android.telephony.SubscriptionInfo.getMnc", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(2736, new C823880WTq(2736, "android.telephony.SubscriptionInfo.getMcc", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102020, new C823880WTq(102020, "android.telephony.SubscriptionManager.getPhoneNumber", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(1063, new C823880WTq(1063, "android.os.UserManager.isUserUnlocked", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102009, new C823880WTq(102009, "android.telephony.SubscriptionManager.getOpportunisticSubscriptions", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102010, new C823880WTq(102010, "android.telephony.SubscriptionManager.getSubscriptionsInGroup", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102008, new C823880WTq(102008, "android.telephony.SubscriptionManager.getActiveSubscriptionInfoList", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102007, new C823880WTq(102007, "android.telephony.SubscriptionManager.getActiveSubscriptionInfoForSimSlotIndex", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102018, new C823880WTq(102018, "android.telephony.SubscriptionManager.getCompleteActiveSubscriptionInfoList", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102005, new C823880WTq(102005, "android.telephony.SubscriptionManager.getActiveSubscriptionInfo", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100004, new C823880WTq(100004, "android.location.LocationManager.getCurrentLocation", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102500, new C823880WTq(102500, "android.accounts.AccountManager.getAccounts", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102501, new C823880WTq(102501, "android.accounts.AccountManager.getAccountsByType", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102502, new C823880WTq(102502, "android.accounts.AccountManager.getAccountsByTypeAndFeatures", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(220, new C823880WTq(220, "android.net.ConnectivityManager.getLinkProperties", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(225, new C823880WTq(225, "android.net.ConnectivityManager.getNetworkCapabilities", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(183, new C823880WTq(183, "android.net.ConnectivityManager.getActiveNetworkInfo", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(195, new C823880WTq(195, "android.net.ConnectivityManager.getNetworkInfo", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100000, new C823880WTq(100000, "android.location.LocationManager.getLastKnownLocation", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100001, new C823880WTq(100001, "android.location.LocationManager.requestLocationUpdates", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(102300, new C823880WTq(102300, "android.net.wifi.WifiManager.getScanResults", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(110, new C823880WTq(110, "android.accounts.AccountManager.getUserData", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(100002, new C823880WTq(100002, "android.location.LocationManager.requestSingleUpdate", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10270, new C823880WTq(10270, "android.telephony.CellIdentityGsm.getCid", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10269, new C823880WTq(10269, "android.telephony.CellIdentityGsm.getBsic", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10262, new C823880WTq(10262, "android.telephony.CellIdentityLte.getCi", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10268, new C823880WTq(10268, "android.telephony.CellIdentityLte.getPci", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10015, new C823880WTq(10015, "android.accounts.AccountManager.getPassword", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10249, new C823880WTq(10249, "android.provider.Browser.getAllBookmarks", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10243, new C823880WTq(10243, "android.os.UserManager.getUserName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10202, new C823880WTq(10202, "android.net.LinkProperties.getLinkAddresses", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10205, new C823880WTq(10205, "java.net.InetAddress.getHostAddress", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10204, new C823880WTq(10204, "java.net.InetAddress.getAllByName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10201, new C823880WTq(10201, "android.net.LinkProperties.getDnsServers", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10200, new C823880WTq(10200, "android.net.LinkProperties.getDhcpServerAddress", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10250, new C823880WTq(10250, "android.provider.Browser.getAllVisitedUrls", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10077, new C823880WTq(10077, "android.content.ClipData$Item.getText", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10010, new C823880WTq(10010, "android.accounts.AccountManager.getAccountsByTypeForPackage", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10007, new C823880WTq(10007, "android.accounts.AccountManager.getAccountsAsUser", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10017, new C823880WTq(10017, "android.accounts.AccountManager.getAuthTokenByFeatures", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10016, new C823880WTq(10016, "android.accounts.AccountManager.getAuthToken", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10316, new C823880WTq(10316, "android.telephony.SubscriptionInfo.getCountryIso", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10307, new C823880WTq(10307, "android.telephony.SmsManager.sendTextMessage", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10306, new C823880WTq(10306, "android.telephony.SmsManager.sendMultipartTextMessage", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10305, new C823880WTq(10305, "android.telephony.SmsManager.sendDataMessage", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10303, new C823880WTq(10303, "android.telephony.CellInfo.getCellSignalStrength", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10261, new C823880WTq(10261, "android.telephony.CellIdentityLte.getBandwidth", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10229, new C823880WTq(10229, "android.net.wifi.WifiInfo.getFrequency", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10228, new C823880WTq(10228, "android.net.wifi.WifiInfo.getRssi", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10218, new C823880WTq(10218, "android.net.NetworkInfo.getExtraInfo", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10217, new C823880WTq(10217, "android.net.NetworkInfo.getTypeName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10216, new C823880WTq(10216, "android.net.NetworkInfo.getType", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10215, new C823880WTq(10215, "android.net.NetworkInfo.getSubtypeName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10214, new C823880WTq(10214, "android.net.NetworkInfo.getSubtype", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10211, new C823880WTq(10211, "android.net.NetworkCapabilities.getSignalStrength", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10210, new C823880WTq(10210, "android.net.NetworkCapabilities.getLinkUpstreamBandwidthKbps", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10209, new C823880WTq(10209, "android.net.NetworkCapabilities.getLinkDownstreamBandwidthKbps", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10203, new C823880WTq(10203, "java.net.InetAddress.getAddress", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10159, new C823880WTq(10159, "android.location.LocationManager.getLastLocation", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10074, new C823880WTq(10074, "android.hardware.SensorManager.getSensors", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10072, new C823880WTq(10072, "android.hardware.SensorManager.getDynamicSensorList", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10070, new C823880WTq(10070, "android.hardware.Sensor.getType", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10069, new C823880WTq(10069, "android.hardware.Sensor.getStringType", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10068, new C823880WTq(10068, "android.hardware.Sensor.getPower", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10067, new C823880WTq(10067, "android.hardware.Sensor.getName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10054, new C823880WTq(10054, "android.content.pm.PackageManager.getPackageInfo", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10026, new C823880WTq(10026, "android.content.ComponentName.getPackageName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10025, new C823880WTq(10025, "android.content.ComponentName.getClassName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10014, new C823880WTq(10014, "android.accounts.AccountManager.setPassword", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10013, new C823880WTq(10013, "android.accounts.AccountManager.clearPassword", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10005, new C823880WTq(10005, "android.accounts.AccountManager.addAccountExplicitly", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10004, new C823880WTq(10004, "android.accounts.AccountManager.addAccount", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10002, new C823880WTq(10002, "android.accounts.Account.name", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10003, new C823880WTq(10003, "android.accounts.Account.type", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10928, new C823880WTq(10928, "android.accounts.AccountManager.getAccountsForPackage", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10879, new C823880WTq(10879, "android.accounts.AccountManager.getPackagesAndVisibilityForAccount", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10019, new C823880WTq(10019, "android.app.ActivityManager.MemoryInfo.advertisedMem", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10020, new C823880WTq(10020, "android.app.ActivityManager.MemoryInfo.availMem", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10021, new C823880WTq(10021, "android.app.ActivityManager.MemoryInfo.lowMemory", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10022, new C823880WTq(10022, "android.app.ActivityManager.MemoryInfo.threshold", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10023, new C823880WTq(10023, "android.app.ActivityManager.MemoryInfo.totalMem", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10027, new C823880WTq(10027, "android.app.ActivityManager.RunningAppProcessInfo.pkgList", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10028, new C823880WTq(10028, "android.app.ActivityManager.RunningServiceInfo.clientPackage", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10913, new C823880WTq(10913, "android.app.usage.StorageStatsManager.queryExternalStatsForUser", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10910, new C823880WTq(10910, "android.app.usage.StorageStatsManager.queryStatsForPackage", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10911, new C823880WTq(10911, "android.app.usage.StorageStatsManager.queryStatsForUid", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10912, new C823880WTq(10912, "android.app.usage.StorageStatsManager.queryStatsForUser", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10824, new C823880WTq(10824, "android.content.ClipboardManager.setPrimaryClipAsPackage", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10834, new C823880WTq(10834, "android.content.ClipData.addItem", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10835, new C823880WTq(10835, "android.content.ClipData.getItemAt", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10836, new C823880WTq(10836, "android.content.ClipData.setItemAt", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10035, new C823880WTq(10035, "android.content.pm.ApplicationInfo.dataDir", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10036, new C823880WTq(10036, "android.content.pm.ApplicationInfo.deviceProtectedDataDir", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10041, new C823880WTq(10041, "android.content.pm.ApplicationInfo.nativeLibraryDir", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10037, new C823880WTq(10037, "android.content.pm.ApplicationInfo.publicSourceDir", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10042, new C823880WTq(10042, "android.content.pm.ApplicationInfo.sharedLibraryFiles", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10038, new C823880WTq(10038, "android.content.pm.ApplicationInfo.sourceDir", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10039, new C823880WTq(10039, "android.content.pm.ApplicationInfo.splitPublicSourceDirs", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10040, new C823880WTq(10040, "android.content.pm.ApplicationInfo.splitSourceDirs", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10049, new C823880WTq(10049, "android.content.pm.PackageInfo.packageName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10044, new C823880WTq(10044, "android.content.pm.PackageItemInfo.packageName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10980, new C823880WTq(10980, "android.hardware.SensorManager.requestTriggerSensor", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10895, new C823880WTq(10895, "android.location.Address.getCountryCode", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10896, new C823880WTq(10896, "android.location.Address.getCountryName", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10878, new C823880WTq(10878, "android.location.Address.getPhone", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10914, new C823880WTq(10914, "android.location.LocationListener.onLocationChanged", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10234, new C823880WTq(10234, "android.net.wifi.ScanResult.channelWidth", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10235, new C823880WTq(10235, "android.net.wifi.ScanResult.frequency", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10929, new C823880WTq(10929, "android.net.wifi.WifiConfiguration.preSharedKey", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10974, new C823880WTq(10974, "android.net.wifi.WifiManager.getDhcpInfo", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10883, new C823880WTq(10883, "android.os.BatteryManager.getIntProperty", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10884, new C823880WTq(10884, "android.os.BatteryManager.getLongProperty", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10954, new C823880WTq(10954, "android.os.Build.BOARD", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10955, new C823880WTq(10955, "android.os.Build.BRAND", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10956, new C823880WTq(10956, "android.os.Build.CPU_ABI", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10958, new C823880WTq(10958, "android.os.Build.FIRST_SDK_INT", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10959, new C823880WTq(10959, "android.os.Build.MODEL", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10960, new C823880WTq(10960, "android.os.Build.SUPPORTED_ABIS", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10964, new C823880WTq(10964, "android.os.Build$VERSION.BASE_OS", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10961, new C823880WTq(10961, "android.os.Build$VERSION.RELEASE", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10962, new C823880WTq(10962, "android.os.Build$VERSION.SDK", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10963, new C823880WTq(10963, "android.os.Build$VERSION.SDK_INT", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10888, new C823880WTq(10888, "android.os.StatFs.getAvailableBlocksLong", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10889, new C823880WTq(10889, "android.os.StatFs.getAvailableBytes", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10886, new C823880WTq(10886, "android.os.StatFs.getFreeBlocks", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10887, new C823880WTq(10887, "android.os.StatFs.getFreeBlocksLong", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10885, new C823880WTq(10885, "android.os.StatFs.getFreeBytes", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10890, new C823880WTq(10890, "android.os.StatFs.getTotalBytes", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10968, new C823880WTq(10968, "android.provider.ContactsContract$Contacts.lookupContact", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10969, new C823880WTq(10969, "android.provider.ContactsContract$Contacts.openContactPhotoInputStream", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10982, new C823880WTq(10982, "android.provider.Settings$Global.getString", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10923, new C823880WTq(10923, "android.telecom.PhoneAccount.getAddress", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10927, new C823880WTq(10927, "android.telecom.PhoneAccount.getSubscriptionAddress", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10926, new C823880WTq(10926, "android.telecom.TelecomManager.getVoiceMailNumber", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10922, new C823880WTq(10922, "android.telephony.ServiceState.getCellBandwidths", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10919, new C823880WTq(10919, "android.telephony.ServiceState.getNetworkType", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10891, new C823880WTq(10891, "android.telephony.SmsManager.sendTextMessageWithoutPersisting", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10983, new C823880WTq(10983, "android.telephony.TelephonyManager.getCarrierConfig", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10908, new C823880WTq(10908, "android.telephony.TelephonyManager.getDataNetworkType", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10924, new C823880WTq(10924, "android.telephony.TelephonyManager.getMsisdn", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10907, new C823880WTq(10907, "android.telephony.TelephonyManager.getPhoneType", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10909, new C823880WTq(10909, "android.telephony.TelephonyManager.getVoiceNetworkType", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10965, new C823880WTq(10965, "android.telephony.TelephonyManager.sendVisualVoicemailSms", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10966, new C823880WTq(10966, "android.telephony.TelephonyManager.sendVisualVoicemailSmsForSubscriber", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10967, new C823880WTq(10967, "com.android.internal.telephony.IccSmsInterfaceManager.sendText", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10817, new C823880WTq(10817, "com.google.android.gms.auth.api.phone.SmsRetrieverClient.startSmsRetriever", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(10818, new C823880WTq(10818, "com.google.android.gms.auth.api.phone.SmsRetrieverClient.startSmsUserConsent", "", "", new String[0], new String[]{"-1089009759877283926", "-2308188677860475076"}, "around"));
        LIZIZ.put(11028, new C823880WTq(11028, "com.facebook.FacebookSdk.setDataProcessingOptions", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11035, new C823880WTq(11035, "com.google.firebase.analytics.FirebaseAnalytics.setUserId", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11037, new C823880WTq(11037, "com.google.firebase.analytics.FirebaseAnalytics.setUserProperty", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11031, new C823880WTq(11031, "com.appsflyer.AppsFlyerLib.setCollectOaid", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11030, new C823880WTq(11030, "com.appsflyer.AppsFlyerLib.setCollectIMEI", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11029, new C823880WTq(11029, "com.appsflyer.AppsFlyerLib.logEvent", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11036, new C823880WTq(11036, "com.google.firebase.analytics.FirebaseAnalytics.setAnalyticsCollectionEnabled", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11034, new C823880WTq(11034, "com.google.firebase.analytics.FirebaseAnalytics.logEvent", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11038, new C823880WTq(11038, "com.google.firebase.messaging.FirebaseMessaging.setDeliveryMetricsExportToBigQuery", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11032, new C823880WTq(11032, "com.appsflyer.AppsFlyerLib.setConsentData", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11033, new C823880WTq(11033, "com.appsflyer.AppsFlyerLib.setAdditionalData", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11055, new C823880WTq(11055, "com.google.android.gms.maps.GoogleMap.addCircle", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11056, new C823880WTq(11056, "com.iab.omid.library.bytedance1.adsession.media.MediaEvents.start", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11057, new C823880WTq(11057, "com.iab.omid.library.bytedance1.adsession.AdEvents.loaded", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11060, new C823880WTq(11060, "com.google.firebase.analytics.FirebaseAnalytics.setConsent", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11419, new C823880WTq(11419, "com.appsflyer.AppsFlyerConsent$Companion.forGDPRUser", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11510, new C823880WTq(11510, "com.appsflyer.AppsFlyerLib.setCollectAndroidID", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11512, new C823880WTq(11512, "com.google.android.gms.maps.model.Marker.setPosition", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11516, new C823880WTq(11516, "com.google.android.gms.maps.GoogleMap.moveCamera", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11518, new C823880WTq(11518, "com.google.android.gms.maps.GoogleMap.animateCamera", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11520, new C823880WTq(11520, "com.google.android.gms.maps.model.MarkerOptions.position", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11521, new C823880WTq(11521, "com.google.android.gms.maps.Projection.toScreenLocation", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11522, new C823880WTq(11522, "com.google.android.gms.maps.model.LatLngBounds.contains", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11523, new C823880WTq(11523, "com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11525, new C823880WTq(11525, "com.google.android.gms.maps.SupportMapFragment.newInstance", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11526, new C823880WTq(11526, "com.google.android.gms.maps.model.CircleOptions.center", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11527, new C823880WTq(11527, "com.google.android.gms.maps.model.LatLngBounds$Builder.include", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        LIZIZ.put(11528, new C823880WTq(11528, "com.google.android.gms.maps.GoogleMap.addMarker", "", "", new String[0], new String[]{"5769144783956059643"}, "around"));
        for (C823880WTq c823880WTq : LIZIZ.values()) {
            String[] strArr = c823880WTq.LJFF;
            C0WSV[] c0wsvArr = new C0WSV[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                c0wsvArr[i] = LIZ.get(strArr[i]);
            }
            c823880WTq.LJI = c0wsvArr;
            c823880WTq.LJFF = null;
        }
    }
}
