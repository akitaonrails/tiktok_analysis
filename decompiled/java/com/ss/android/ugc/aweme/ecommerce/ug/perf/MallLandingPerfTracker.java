package com.ss.android.ugc.aweme.ecommerce.ug.perf;

import X.C01GW;
import X.C034S;
import X.C054G;
import X.C09AE;
import X.C0PEM;
import X.C1018703yb;
import X.C1120604Zw;
import X.C1703900uRQ;
import X.C1703910uRR;
import X.C1703920uRS;
import X.C1703930uRT;
import X.C1703940uRU;
import X.C1703950uRV;
import X.C1703960uRW;
import X.C1703970uRX;
import X.C1703980uRY;
import X.C1703990uRZ;
import X.C1704000uRa;
import X.C1704010uRb;
import X.C1704020uRc;
import X.C1704070uRh;
import X.C1704080uRi;
import X.C1946007jm;
import X.C1AQS;
import X.C2188811AlT;
import X.C2232408os;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C823050WQl;
import X.EnumC1704040uRe;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class MallLandingPerfTracker implements IMallLandingPerfTracker {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C054G LIZ = C2296808zG.LIZ(new C2232408os(C823050WQl.LJFF()));
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(236));

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final String newPerfId() {
        String string = UUID.randomUUID().toString();
        C1704020uRc.LIZ.LIZIZ(string);
        return string;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void LIZJ(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703990uRZ(this, str, ((IApplicationDependencyService) iECommerceHostService).isColdStart(), jCurrentTimeMillis, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e A[Catch: all -> 0x0055, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x000b, B:5:0x000e, B:6:0x0015, B:9:0x001c, B:12:0x0023, B:15:0x002a, B:18:0x0031, B:21:0x0038, B:24:0x003f, B:27:0x0046, B:29:0x004c), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJIIIIZZ(X.EnumC1704040uRe r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int[] r1 = X.C1704030uRd.LIZ     // Catch: java.lang.Throwable -> L55
            int r0 = r6.ordinal()     // Catch: java.lang.Throwable -> L55
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L55
            r3 = -1
            switch(r0) {
                case 1: goto L52;
                case 2: goto L15;
                case 3: goto L1c;
                case 4: goto L23;
                case 5: goto L2a;
                case 6: goto L31;
                case 7: goto L38;
                case 8: goto L3f;
                case 9: goto L46;
                default: goto Le;
            }     // Catch: java.lang.Throwable -> L55
        Le:
            r1 = 0
            X.0uRc r0 = X.C1704020uRc.LIZ     // Catch: java.lang.Throwable -> L55
            r0.LIZ()     // Catch: java.lang.Throwable -> L55
            goto L53
        L15:
            long r1 = X.C1704020uRc.LIZJ     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L52
        L1c:
            long r1 = X.C1704020uRc.LIZLLL     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L52
        L23:
            long r1 = X.C1704020uRc.LJ     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L52
        L2a:
            long r1 = X.C1704020uRc.LIZLLL     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L52
        L31:
            long r1 = X.C1704020uRc.LJI     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L52
        L38:
            long r1 = X.C1704020uRc.LJFF     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L52
        L3f:
            long r1 = X.C1704020uRc.LJIIIIZZ     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L52
        L46:
            long r1 = X.C1704020uRc.LJIIIIZZ     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            long r1 = X.C1704020uRc.LJII     // Catch: java.lang.Throwable -> L55
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Le
        L52:
            r1 = 1
        L53:
            monitor-exit(r5)
            return r1
        L55:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker.LJIIIIZZ(X.0uRe):boolean");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void LIZ(Long l, String str) {
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703940uRU(this, str, EnumC1704040uRe.SEND_LANDING_REQUEST, l, System.currentTimeMillis(), null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void LJ(Long l, String str) {
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703920uRS(this, str, EnumC1704040uRe.LANDING_CONTAINER_READY, l, System.currentTimeMillis(), null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void LJFF(Long l, String str) {
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703950uRV(this, str, EnumC1704040uRe.SWITCH_TO_MALL, l, System.currentTimeMillis(), null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void LJI(Long l, String str) {
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703930uRT(this, str, EnumC1704040uRe.START_JUMP_LANDING, l, System.currentTimeMillis(), null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void onClickMallEntry(String str, Long l) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        EnumC1704040uRe enumC1704040uRe = EnumC1704040uRe.USER_CLICK_ENTRY;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1704000uRa(jCurrentTimeMillis, this, enumC1704040uRe, l, str, null, ((IApplicationDependencyService) iECommerceHostService).isColdStart()), 3);
    }

    public static boolean LJII(String str, boolean z, boolean z2) {
        String strLIZIZ;
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService == null || !iECommerceMallService.shouldShowMall2TabOrTopTab()) {
            return false;
        }
        if (z && (((strLIZIZ = C1704080uRi.LIZIZ(str)) == null || strLIZIZ.length() == 0) && (str == null || !a0.LJJIIZI(str, "landing_deeplink", false)))) {
            return false;
        }
        if (z2 && (C1704020uRc.LIZIZ == null || str == null || UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "mall_landing_perf_id") == null || !Intrinsics.LJFF(C1704020uRc.LIZIZ, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "mall_landing_perf_id")))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void LIZIZ(String str, String str2, Map map) {
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703970uRX(str2, map, this, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void LIZLLL(Long l, String str, Map map) {
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703910uRR(this, str, EnumC1704040uRe.FETCH_LANDING_RESPONSE, l, System.currentTimeMillis(), map, null), 3);
    }

    public final void LJIIIZ(EnumC1704040uRe enumC1704040uRe, String str, Map<String, ? extends Object> map) {
        C09AE c09ae;
        String str2;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && !map.isEmpty()) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("step", enumC1704040uRe.getValue());
        linkedHashMap.put("is_mall_tab_selected", Integer.valueOf(C1704020uRc.LJIIJ ? 1 : 0));
        linkedHashMap.put("is_mall_first_rendered", Integer.valueOf(C1704020uRc.LJIIJJI ? 1 : 0));
        linkedHashMap.put("is_cold_start", Integer.valueOf(C1704020uRc.LJIIL ? 1 : 0));
        linkedHashMap.put("enter_from", str);
        String str3 = C1704020uRc.LJIILJJIL;
        Object obj2 = "";
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("page_name", str3);
        if (Intrinsics.LJFF(linkedHashMap.get("page_name"), "")) {
            if (map != null && (obj = map.get("page_name")) != null) {
                obj2 = obj;
            }
            linkedHashMap.put("page_name", obj2);
        }
        long j = C1704020uRc.LIZJ;
        long j2 = C1704020uRc.LIZLLL;
        if (j != -1 && j2 != -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("duration_");
            sbLIZ.append(EnumC1704040uRe.USER_CLICK_ENTRY.getValue());
            sbLIZ.append("_to_");
            sbLIZ.append(EnumC1704040uRe.JUMP_TO_MALL.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(j2 - j));
        }
        long j3 = C1704020uRc.LJ;
        if (j2 != -1 && j3 != -1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("duration_");
            sbLIZ2.append(EnumC1704040uRe.JUMP_TO_MALL.getValue());
            sbLIZ2.append("_to_");
            sbLIZ2.append(EnumC1704040uRe.SWITCH_TO_MALL.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(j3 - j2));
        }
        long j4 = C1704020uRc.LJFF;
        if (j3 != -1 && j4 != -1) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("duration_");
            sbLIZ3.append(EnumC1704040uRe.SWITCH_TO_MALL.getValue());
            sbLIZ3.append("_to_");
            sbLIZ3.append(EnumC1704040uRe.START_JUMP_LANDING.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), Long.valueOf(j4 - j3));
        }
        long j5 = C1704020uRc.LJI;
        if (j3 != -1 && j5 != -1) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("duration_");
            sbLIZ4.append(EnumC1704040uRe.SWITCH_TO_MALL.getValue());
            sbLIZ4.append("_to_");
            sbLIZ4.append(EnumC1704040uRe.SEND_LANDING_REQUEST.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ4), Long.valueOf(j5 - j3));
        }
        long j6 = C1704020uRc.LJII;
        if (j5 != -1 && j6 != -1) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("duration_");
            sbLIZ5.append(EnumC1704040uRe.SEND_LANDING_REQUEST.getValue());
            sbLIZ5.append("_to_");
            sbLIZ5.append(EnumC1704040uRe.FETCH_LANDING_RESPONSE.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ5), Long.valueOf(j6 - j5));
        }
        long j7 = C1704020uRc.LJIIIIZZ;
        if (j4 != -1 && j7 != -1) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("duration_");
            sbLIZ6.append(EnumC1704040uRe.START_JUMP_LANDING.getValue());
            sbLIZ6.append("_to_");
            sbLIZ6.append(EnumC1704040uRe.LANDING_CONTAINER_READY.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ6), Long.valueOf(j7 - j4));
        }
        long j8 = C1704020uRc.LJIIIZ;
        if (j7 != -1 && j8 != -1) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("duration_");
            sbLIZ7.append(EnumC1704040uRe.LANDING_CONTAINER_READY.getValue());
            sbLIZ7.append("_to_");
            sbLIZ7.append(enumC1704040uRe.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ7), Long.valueOf(j8 - j7));
        }
        if (j6 != -1 && j8 != -1) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("duration_");
            sbLIZ8.append(EnumC1704040uRe.FETCH_LANDING_RESPONSE.getValue());
            sbLIZ8.append("_to_");
            sbLIZ8.append(EnumC1704040uRe.LANDING_MEANINGFUL_RENDERED.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ8), Long.valueOf(j8 - j6));
        }
        if (j4 != -1 && j8 != -1) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("duration_");
            sbLIZ9.append(EnumC1704040uRe.START_JUMP_LANDING.getValue());
            sbLIZ9.append("_to_");
            sbLIZ9.append(enumC1704040uRe.getValue());
            linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ9), Long.valueOf(j8 - j4));
        }
        if (j != -1) {
            linkedHashMap.put("userClickTimeStamp", Long.valueOf(j));
        }
        if (j2 != -1) {
            linkedHashMap.put("jumpToMallTimeStamp", Long.valueOf(j2));
        }
        if (j3 != -1) {
            linkedHashMap.put("switchToMallTimeStamp", Long.valueOf(j3));
        }
        if (j5 != -1) {
            linkedHashMap.put("sendLandingRequestTimeStamp", Long.valueOf(j5));
        }
        if (j6 != -1) {
            linkedHashMap.put("fetchLandingResponseTimeStamp", Long.valueOf(j6));
        }
        if (j4 != -1) {
            linkedHashMap.put("jumpLandingTimeStamp", Long.valueOf(j4));
        }
        if (j7 != -1) {
            linkedHashMap.put("landingContainerReadyTimeStamp", Long.valueOf(j7));
        }
        if (j8 != -1) {
            linkedHashMap.put("landingPageRenderedTimeStamp", Long.valueOf(j8));
        }
        C1018703yb.LIZIZ("rd_tiktokec_mall_landing_chain", linkedHashMap);
        if (enumC1704040uRe != EnumC1704040uRe.LANDING_MEANINGFUL_RENDERED && enumC1704040uRe != EnumC1704040uRe.LANDING_PAGE_UPDATED) {
            if (enumC1704040uRe == EnumC1704040uRe.START_JUMP_LANDING && ((Number) C1704070uRh.LIZJ.getValue()).longValue() > 0 && (str2 = C1704020uRc.LIZIZ) != null) {
                C09AE c09ae2 = (C09AE) ((ConcurrentHashMap) this.LIZJ.getValue()).get(str2);
                if (c09ae2 != null) {
                    c09ae2.LIZIZ(null);
                }
                ((ConcurrentHashMap) this.LIZJ.getValue()).put(str2, C23250099c.LIZLLL(this.LIZIZ, null, null, new C1703900uRQ(this, str, null), 3));
                return;
            }
            return;
        }
        String str4 = C1704020uRc.LIZIZ;
        if (str4 == null || (c09ae = (C09AE) ((ConcurrentHashMap) this.LIZJ.getValue()).remove(str4)) == null) {
            return;
        }
        c09ae.LIZIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void onSearchMixLandingFinished(String str, long j, String str2) {
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703980uRY(this, str, EnumC1704040uRe.LANDING_MEANINGFUL_RENDERED, str2, j, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void onStartJumpToMall(String str, Long l, boolean z) {
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        EnumC1704040uRe enumC1704040uRe = EnumC1704040uRe.JUMP_TO_MALL;
        C23250099c.LIZLLL(this.LIZ, null, null, new C1703960uRW(System.currentTimeMillis(), this, enumC1704040uRe, l, str, null, z), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker
    public final void onLandingFinished(String str, String str2, Map<String, ? extends Object> map, int i) {
        String str3;
        if (!C1704070uRh.LIZIZ()) {
            return;
        }
        Object obj = map.get("page_name");
        if ((obj instanceof String) && (str3 = (String) obj) != null) {
            C23250099c.LIZLLL(this.LIZ, null, null, new C1704010uRb(this, str, str2, str3, i, map, null), 3);
        }
    }
}
