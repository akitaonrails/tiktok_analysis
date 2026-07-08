package com.ss.android.ugc.aweme.im.sdk.psp;

import X.AbstractC207271168v;
import X.AbstractC207272168w;
import X.C13BV;
import X.C1602200rnO;
import X.C169O;
import X.C1BCA;
import X.C207256168g;
import X.C207262168m;
import X.C2188811AlT;
import X.C270200AiQ;
import X.EnumC312610CNf;
import X.InterfaceC1006670cIr;
import X.InterfaceC829930Wh5;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.experiment.IMImageCacheSizeSetting;
import com.ss.android.ugc.aweme.im.sdk.psp.IMPSPManager;
import com.ss.android.ugc.aweme.im.service.psp.IIMPSPManager;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS492S0200000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class IMPSPManager implements IIMPSPManager {
    public static volatile boolean LIZIZ;
    public static final IMPSPManager LIZ = new IMPSPManager();
    public static final Map<String, AbstractC207272168w> LIZJ = new ConcurrentHashMap();
    public static final Map<String, AbstractC207271168v> LIZLLL = new ConcurrentHashMap();
    public static final List<AbstractC207271168v> LJ = new ArrayList();

    public static final class Service implements IIMPSPManager {
        public final /* synthetic */ IMPSPManager LIZ = IMPSPManager.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.psp.IIMPSPManager
        public final void init() {
            this.LIZ.init();
        }
    }

    public final void LIZ() {
        synchronized (this) {
            try {
                if (LIZIZ) {
                    return;
                }
                LIZIZ = true;
                C169O.LIZ();
                C169O.LIZ();
                ArrayList<AbstractC207272168w> arrayList = new ArrayList();
                arrayList.add(new C207262168m());
                arrayList.add(new AbstractC207272168w() { // from class: X.168i
                    public final String LIZ = "app_log";

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.AbstractC207272168w
                    public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) {
                        String str;
                        Map map;
                        long jLongValue;
                        boolean z;
                        Object obj;
                        Object inputData;
                        JSONObject jSONObject;
                        TTMParamData tTMParamData;
                        ITTMParamData actualParamData;
                        Long l;
                        Map<?, ?> map2 = c207274168y.LIZIZ;
                        Object obj2 = map2.get("event_name");
                        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                            Object obj3 = map2.get("event_params");
                            if ((obj3 instanceof Map) && (map = (Map) obj3) != null) {
                                Object obj4 = map2.get("append_original_params");
                                if ((obj4 instanceof Long) && (l = (Long) obj4) != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                if (jLongValue == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C830490Whz c830490Whz = new C830490Whz();
                                for (Map.Entry entry : map.entrySet()) {
                                    c830490Whz.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                                }
                                if (z) {
                                    Object[] objArrLIZ = interfaceC805220ViK.LIZ();
                                    if (objArrLIZ != null) {
                                        obj = objArrLIZ[0];
                                    } else {
                                        obj = null;
                                    }
                                    if ((obj instanceof TTMParamData) && (tTMParamData = (TTMParamData) obj) != null && (actualParamData = tTMParamData.getActualParamData()) != null) {
                                        inputData = actualParamData.getInputData();
                                    } else {
                                        inputData = null;
                                    }
                                    if ((inputData instanceof JSONObject) && (jSONObject = (JSONObject) inputData) != null) {
                                        Iterator<String> itKeys = jSONObject.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            c830490Whz.put(next, jSONObject.get(next).toString());
                                        }
                                    }
                                }
                                C0I0B.LJFF.LIZIZ();
                                C20684815ws.LJIILLIIL(str, c830490Whz);
                                LIZLLL(c207274168y, null);
                            }
                        }
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.1699
                    public final String LIZ = "im_conv_context";

                    @Override // X.AbstractC207272168w
                    public final void LIZ() {
                        C169O.LIZ();
                    }

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
                    @Override // X.AbstractC207272168w
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(X.C207274168y r10, X.InterfaceC805220ViK r11) {
                        /*
                            Method dump skipped, instruction units count: 204
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1699.LIZIZ(X.168y, X.0ViK):void");
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.169D
                    public final C01GW LIZ = C452501pT.LIZIZ(new C169C());

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return "im_send_request";
                    }

                    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:40:0x00a2, B:43:0x00ae, B:57:0x00fc, B:44:0x00bc, B:46:0x00c4, B:48:0x00c8, B:50:0x00d4, B:52:0x00e0, B:55:0x00ed), top: B:73:0x00a2 }] */
                    @Override // X.AbstractC207272168w
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(X.C207274168y r19, X.InterfaceC805220ViK r20) {
                        /*
                            Method dump skipped, instruction units count: 391
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C169D.LIZIZ(X.168y, X.0ViK):void");
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.168x
                    public final String LIZ = "im_pull_message";

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.AbstractC207272168w
                    public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) {
                        Long l;
                        String str;
                        Map<?, ?> map = c207274168y.LIZIZ;
                        Object obj = map.get("inbox_type");
                        if ((obj instanceof Long) && (l = (Long) obj) != null) {
                            int iLongValue = (int) l.longValue();
                            Object obj2 = map.get("trigger_reason");
                            if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                                boolean zLJFF = Intrinsics.LJFF(map.get("is_force"), 1L);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("execute: inboxType=");
                                sbLIZ.append(iLongValue);
                                sbLIZ.append(", triggerReason=");
                                sbLIZ.append(str);
                                sbLIZ.append(", isForce=");
                                sbLIZ.append(zLJFF);
                                C2188811AlT.LIZIZ(sbLIZ);
                                C169O.LIZ();
                                C0YOP.LIZ(str, zLJFF, iLongValue, C2097908Jt.LIZJ(new Pair("is_force", Boolean.valueOf(zLJFF))), 8);
                                LIZLLL(c207274168y, null);
                            }
                        }
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.0kr1
                    public final String LIZ = "im_delay";

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.AbstractC207272168w
                    public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) {
                        Long l;
                        long jLongValue;
                        Object obj = c207274168y.LIZIZ.get("interval");
                        if (obj instanceof Long) {
                            l = (Long) obj;
                        } else {
                            l = null;
                        }
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("execute: delayTimeInMillis=");
                        sbLIZ.append(jLongValue);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (jLongValue <= 0) {
                            LIZLLL(c207274168y, null);
                        } else {
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1335360kr0(jLongValue, this, c207274168y, null), 3);
                        }
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.168k
                    public final String LIZ = "social_interaction_persistence_storage";

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    /* JADX WARN: Type inference failed for: r3v0, types: [X.05C2] */
                    @Override // X.AbstractC207272168w
                    public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) {
                        Map map;
                        Long l;
                        Map<?, ?> map2 = c207274168y.LIZIZ;
                        if (!C2205708kZ.LIZ()) {
                            return;
                        }
                        Object obj = map2.get("event_name");
                        if ((obj instanceof String) && obj != null) {
                            Object obj2 = map2.get("event_params");
                            if ((obj2 instanceof Map) && (map = (Map) obj2) != null) {
                                boolean z = map.get("to_uid") instanceof String;
                                System.currentTimeMillis();
                                Object obj3 = map2.get("expire_time");
                                if ((obj3 instanceof Long) && (l = (Long) obj3) != null) {
                                    l.longValue();
                                }
                                ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                                C1227904rF.LIZ.getClass();
                                C1227904rF.LJI(map);
                                C23250099c.LIZLLL((InterfaceC497601wk) C0CRA.LIZ.getValue(), null, null, new C1313205By(new Object() { // from class: X.05C2
                                }, null), 3);
                                C2206208ke.LIZIZ.LIZIZ(map2);
                                LIZLLL(c207274168y, null);
                            }
                        }
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.169K
                    public final String LIZ = "im_get_history_messages";

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x00ee  */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
                    /* JADX WARN: Removed duplicated region for block: B:92:0x00b6 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:94:0x001c A[SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r13v1, types: [X.13BV] */
                    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
                    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
                    @Override // X.AbstractC207272168w
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(X.C207274168y r20, X.InterfaceC805220ViK r21) {
                        /*
                            Method dump skipped, instruction units count: 353
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C169K.LIZIZ(X.168y, X.0ViK):void");
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.168r
                    public final String LIZ = "im_write_fake_streak_data";

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.AbstractC207272168w
                    public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) {
                        IStreakService.LJJIIZ.getClass();
                        C06LY.LIZ().l(c207274168y.LIZIZ, new AwS492S0200000_31(this, c207274168y, 0));
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.0ks7
                    public final String LIZ = "im_gecko_preload";

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x000f, B:8:0x0013, B:9:0x001c, B:11:0x0022, B:13:0x002a, B:15:0x002e, B:16:0x0034, B:18:0x0038, B:23:0x0041, B:24:0x0047, B:26:0x004b, B:30:0x0053, B:31:0x005c, B:34:0x007c, B:36:0x008b, B:37:0x008e), top: B:44:0x0000 }] */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x000f, B:8:0x0013, B:9:0x001c, B:11:0x0022, B:13:0x002a, B:15:0x002e, B:16:0x0034, B:18:0x0038, B:23:0x0041, B:24:0x0047, B:26:0x004b, B:30:0x0053, B:31:0x005c, B:34:0x007c, B:36:0x008b, B:37:0x008e), top: B:44:0x0000 }] */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
                    @Override // X.AbstractC207272168w
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(X.C207274168y r8, X.InterfaceC805220ViK r9) {
                        /*
                            r7 = this;
                            java.util.Map<?, ?> r1 = r8.LIZIZ     // Catch: java.lang.Throwable -> L97
                            java.lang.String r0 = "list"
                            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L97
                            r4 = 0
                            if (r1 == 0) goto L8e
                            boolean r0 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L97
                            if (r0 == 0) goto L8e
                            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L97
                            if (r1 == 0) goto L8e
                            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
                            r3.<init>()     // Catch: java.lang.Throwable -> L97
                            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Throwable -> L97
                        L1c:
                            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L97
                            if (r0 == 0) goto L7c
                            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L97
                            boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L97
                            if (r0 == 0) goto L79
                            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L97
                            if (r1 == 0) goto L7a
                            java.lang.String r0 = "bundle"
                            java.lang.Object r5 = r1.get(r0)     // Catch: java.lang.Throwable -> L97
                        L34:
                            boolean r0 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L97
                            if (r0 == 0) goto L3b
                            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L97
                            goto L3c
                        L3b:
                            r5 = r4
                        L3c:
                            if (r1 == 0) goto L3f
                            goto L41
                        L3f:
                            r2 = r4
                            goto L47
                        L41:
                            java.lang.String r0 = "channel"
                            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L97
                        L47:
                            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L97
                            if (r0 == 0) goto L4e
                            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L97
                            goto L4f
                        L4e:
                            r2 = r4
                        L4f:
                            if (r5 == 0) goto L5c
                            if (r2 == 0) goto L5c
                            X.06Rk r0 = new X.06Rk     // Catch: java.lang.Throwable -> L97
                            r0.<init>(r2, r5)     // Catch: java.lang.Throwable -> L97
                            r3.add(r0)     // Catch: java.lang.Throwable -> L97
                            goto L1c
                        L5c:
                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L97
                            java.lang.String r0 = "execute, bundle="
                            r1.append(r0)     // Catch: java.lang.Throwable -> L97
                            r1.append(r5)     // Catch: java.lang.Throwable -> L97
                            java.lang.String r0 = " or channel="
                            r1.append(r0)     // Catch: java.lang.Throwable -> L97
                            r1.append(r2)     // Catch: java.lang.Throwable -> L97
                            java.lang.String r0 = " is null"
                            r1.append(r0)     // Catch: java.lang.Throwable -> L97
                            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97
                            goto L1c
                        L79:
                            r1 = r4
                        L7a:
                            r5 = r4
                            goto L34
                        L7c:
                            X.0ks8 r0 = com.ss.android.ugc.aweme.im.streak.api.IStreakResourceService.LIZ     // Catch: java.lang.Throwable -> L97
                            r0.getClass()     // Catch: java.lang.Throwable -> L97
                            X.01GW<com.ss.android.ugc.aweme.im.streak.api.IStreakResourceService> r0 = X.C1336060ks8.LIZIZ     // Catch: java.lang.Throwable -> L97
                            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L97
                            com.ss.android.ugc.aweme.im.streak.api.IStreakResourceService r0 = (com.ss.android.ugc.aweme.im.streak.api.IStreakResourceService) r0     // Catch: java.lang.Throwable -> L97
                            if (r0 == 0) goto L8e
                            r0.LIZ(r3)     // Catch: java.lang.Throwable -> L97
                        L8e:
                            r7.LIZLLL(r8, r4)     // Catch: java.lang.Throwable -> L97
                            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L97
                            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L97
                            goto La3
                        L97:
                            r1 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                            X.00Yq r0 = new X.00Yq
                            r0.<init>(r1)
                            X.C189200o6.m2constructorimpl(r0)
                        La3:
                            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
                            if (r2 == 0) goto Lbb
                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                            java.lang.String r0 = "exception, error="
                            r1.append(r0)
                            r1.append(r2)
                            X.C2188811AlT.LIZIZ(r1)
                            X.C1AF0.LJ(r2)
                        Lbb:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1336050ks7.LIZIZ(X.168y, X.0ViK):void");
                    }
                });
                arrayList.add(new AbstractC207272168w() { // from class: X.0kqx
                    public final String LIZ = "im_update_cache_space_size";

                    @Override // X.AbstractC207272168w
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.AbstractC207272168w
                    public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) {
                        String str;
                        Long l;
                        long jLongValue;
                        Object next;
                        long jLongValue2;
                        Object obj = c207274168y.LIZIZ.get("cache_space");
                        if ((obj instanceof String) && (str = (String) obj) != null) {
                            Object obj2 = c207274168y.LIZIZ.get("new_size");
                            if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
                                long jLongValue3 = l.longValue();
                                C1326200kcE c1326200kcE = C1326200kcE.LIZ;
                                long j = 0;
                                if (c1326200kcE.LIZ(str) > 0) {
                                    jLongValue = c1326200kcE.LIZ(str);
                                } else {
                                    IMImageCacheSizeSetting.LIZ.getClass();
                                    Long l2 = ((IMImageCacheSizeSetting.IMImageCacheSizeConfig) IMImageCacheSizeSetting.LIZJ.getValue()).cacheSizeMap.get(str);
                                    if (l2 != null) {
                                        jLongValue = l2.longValue();
                                    } else {
                                        jLongValue = 536870912;
                                    }
                                }
                                long j2 = jLongValue3 - jLongValue;
                                if (j2 == 0) {
                                    return;
                                }
                                if (j2 < 0) {
                                    c1326200kcE.LIZJ(jLongValue3, str);
                                    return;
                                }
                                C06TB[] c06tbArrValues = C06TB.values();
                                ArrayList arrayList2 = new ArrayList(c06tbArrValues.length);
                                int length = c06tbArrValues.length;
                                int i = 0;
                                while (i < length) {
                                    C06TB c06tb = c06tbArrValues[i];
                                    C1326200kcE c1326200kcE2 = C1326200kcE.LIZ;
                                    if (c1326200kcE2.LIZ(c06tb.getSpace()) > j) {
                                        jLongValue2 = c1326200kcE2.LIZ(str);
                                    } else {
                                        IMImageCacheSizeSetting.LIZ.getClass();
                                        Long l3 = ((IMImageCacheSizeSetting.IMImageCacheSizeConfig) IMImageCacheSizeSetting.LIZJ.getValue()).cacheSizeMap.get(c06tb.getSpace());
                                        if (l3 != null) {
                                            jLongValue2 = l3.longValue();
                                        } else {
                                            jLongValue2 = 536870912;
                                        }
                                    }
                                    String space = c06tb.getSpace();
                                    String space2 = c06tb.getSpace();
                                    Keva kevaLIZIZ = c1326200kcE2.LIZIZ();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("cache_space_used_");
                                    sbLIZ.append(space2);
                                    arrayList2.add(new C1335340kqy(space, jLongValue2, jLongValue2 - kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L)));
                                    i++;
                                    j = 0;
                                }
                                Iterator it2 = arrayList2.iterator();
                                if (!it2.hasNext()) {
                                    next = null;
                                } else {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        long j3 = ((C1335340kqy) next).LIZJ;
                                        do {
                                            Object next2 = it2.next();
                                            long j4 = ((C1335340kqy) next2).LIZJ;
                                            if (j3 < j4) {
                                                next = next2;
                                                j3 = j4;
                                            }
                                        } while (it2.hasNext());
                                    }
                                }
                                C1335340kqy c1335340kqy = (C1335340kqy) next;
                                if (c1335340kqy == null) {
                                    return;
                                }
                                if (!Intrinsics.LJFF(c1335340kqy.LIZ, str)) {
                                    if (c1335340kqy.LIZJ < j2) {
                                        return;
                                    }
                                    long j5 = c1335340kqy.LIZIZ - j2;
                                    C1326200kcE c1326200kcE3 = C1326200kcE.LIZ;
                                    c1326200kcE3.LIZJ(jLongValue3, str);
                                    c1326200kcE3.LIZJ(j5, c1335340kqy.LIZ);
                                }
                                LIZLLL(c207274168y, null);
                            }
                        }
                    }
                });
                arrayList.add(new C207256168g());
                if (((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL()) {
                    arrayList.add(new AbstractC207272168w() { // from class: X.168o
                        public final String LIZ = "im_dm_resource_manage";

                        @Override // X.AbstractC207272168w
                        public final String LIZJ() {
                            return this.LIZ;
                        }

                        @Override // X.AbstractC207272168w
                        public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) throws Exception {
                            List<Map> list;
                            String str;
                            String str2;
                            Map mapLJ;
                            String str3;
                            if (!((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL()) {
                                return;
                            }
                            Object obj = c207274168y.LIZIZ.get("intentionList");
                            if ((obj instanceof List) && (list = (List) obj) != null) {
                                for (Map map : list) {
                                    Object obj2 = map.get("intention");
                                    if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                                        Object obj3 = map.get("strategyTag");
                                        if ((obj3 instanceof String) && (str2 = (String) obj3) != null) {
                                            Object obj4 = map.get("intentionParams");
                                            if (!(obj4 instanceof Map) || (mapLJ = (Map) obj4) == null) {
                                                mapLJ = C2097608Jq.LJ();
                                            }
                                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
                                            linkedHashMap.put("strategyTag", str2);
                                            try {
                                                ((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LJIIIIZZ(str, linkedHashMap);
                                                if (((Number) C0B4M.LIZ.getValue()).doubleValue() > 0.0d) {
                                                    Object obj5 = map.get("idForLocalEvent");
                                                    if (obj5 instanceof String) {
                                                        str3 = (String) obj5;
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    C0WT8.LIZ(str, str2, str3);
                                                }
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                if (C169O.LIZIZ()) {
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    });
                }
                for (AbstractC207272168w abstractC207272168w : arrayList) {
                    ((ConcurrentHashMap) LIZJ).put(abstractC207272168w.LIZJ(), abstractC207272168w);
                }
                LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ() {
        ArrayList<AbstractC207271168v> arrayList;
        List<AbstractC207271168v> list = LJ;
        synchronized (list) {
            try {
                arrayList = new ArrayList(list);
                ((ArrayList) list).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (AbstractC207271168v abstractC207271168v : arrayList) {
            LIZ.getClass();
            LIZLLL(abstractC207271168v);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.psp.IIMPSPManager
    public final void init() {
        if (!((Boolean) C270200AiQ.LIZ.getValue()).booleanValue()) {
            C169O.LIZ();
            return;
        }
        C169O.LIZ();
        if (TTMStrategyCenterManager.isInit()) {
            LIZ();
        }
        TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.168t
            @Override // X.InterfaceC829930Wh5
            public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttmStrategyCenterStateChange with ");
                sbLIZ.append(enumC829940Wh6.name());
                C2188811AlT.LIZIZ(sbLIZ);
                C169O.LIZ();
                if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                    IMPSPManager.LIZ.LIZ();
                    return;
                }
                if (enumC829940Wh6 != EnumC829940Wh6.TTMStateAccountChanging) {
                    return;
                }
                IMPSPManager.LIZ.getClass();
                C169O.LIZ();
                Iterator it2 = ((ConcurrentHashMap) IMPSPManager.LIZJ).values().iterator();
                while (it2.hasNext()) {
                    ((AbstractC207272168w) it2.next()).LIZ();
                }
            }
        });
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0CR9
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                if (c1602200rnO2.LIZJ()) {
                    C23250099c.LIZLLL((InterfaceC497601wk) C0CRA.LIZ.getValue(), null, null, new C1313105Bx(jCurrentTimeMillis, null), 3);
                    C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                }
            }
        });
    }

    public static void LIZJ(AbstractC207271168v abstractC207271168v) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerScene, scene name ");
        sbLIZ.append(abstractC207271168v.LJ());
        C2188811AlT.LIZIZ(sbLIZ);
        C169O.LIZ();
        ((ConcurrentHashMap) LIZLLL).put(abstractC207271168v.LJ(), abstractC207271168v);
        if (!LIZIZ) {
            List<AbstractC207271168v> list = LJ;
            synchronized (list) {
                try {
                    ((ArrayList) list).add(abstractC207271168v);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        LIZLLL(abstractC207271168v);
    }

    public static void LIZLLL(AbstractC207271168v abstractC207271168v) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerSceneInner, scene name ");
        sbLIZ.append(abstractC207271168v.LJ());
        C2188811AlT.LIZIZ(sbLIZ);
        C169O.LIZ();
        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(abstractC207271168v.LJ(), C13BV.INSTANCE, null, abstractC207271168v);
    }
}
