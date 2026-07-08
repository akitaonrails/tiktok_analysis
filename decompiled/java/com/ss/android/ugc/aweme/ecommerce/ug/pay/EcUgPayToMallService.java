package com.ss.android.ugc.aweme.ecommerce.ug.pay;

import X.AnonymousClass0185;
import X.AnonymousClass0957;
import X.C098200Yq;
import X.C0AA0;
import X.C1323720kYE;
import X.C13LP;
import X.C1740050vNj;
import X.C1740920vP8;
import X.C18159079h;
import X.C189200o6;
import X.C1976807ok;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2399609ak;
import X.C314470CUj;
import X.C7880035y;
import X.C928003jy;
import X.InterfaceC1870830ymf;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.pay.EcPayToMallExpandAB;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgPayToMallService implements IEcUgPayToMallService {
    public Map<String, Object> LIZ;
    public AnonymousClass0957<n> LIZIZ;

    public static boolean LJI() {
        ILiveOuterService iLiveOuterService;
        if (((Boolean) C0AA0.LIZ.getValue()).booleanValue() && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
            return iLiveOuterService.m4();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final C1740920vP8 getTracker() {
        return new C1740920vP8();
    }

    public EcUgPayToMallService() {
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
        if (iEcUgBackButtonServiceOfficial != null) {
            iEcUgBackButtonServiceOfficial.LJ(new AwS570S0100000_26(this, 653));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final AnonymousClass0957<n> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final Map<String, Object> LIZLLL() {
        return this.LIZ;
    }

    public static String LJFF(Map map) {
        Object obj;
        String string;
        Object obj2 = map.get("enter_from");
        if ((obj2 != null && (string = obj2.toString()) != null && !Intrinsics.LJFF(string, "null")) || ((obj = map.get("enter_from_info")) != null && (string = obj.toString()) != null)) {
            return string;
        }
        return "miss_enter_from";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final String LIZ(String str) {
        int iIntValue;
        Integer numValueOf;
        String strLIZLLL;
        Uri uri;
        long jCurrentTimeMillis;
        if (C18159079h.LIZ()) {
            return str;
        }
        Uri uri2 = UriProtector.parse(str);
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(AnonymousClass0185.LJ(uri2, "shop_tab_ab"));
        if (numLJIIJJI == null || (numValueOf = Integer.valueOf((iIntValue = numLJIIJJI.intValue()))) == null || numValueOf.intValue() <= 1 || (strLIZLLL = C1976807ok.LIZLLL(uri2, "url")) == null || (uri = UriProtector.parse(strLIZLLL)) == null) {
            return str;
        }
        C1740050vNj c1740050vNj = C1740050vNj.LIZ;
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        String strLJ = AnonymousClass0185.LJ(uri, "pay_to_mall_source");
        String strLJ2 = AnonymousClass0185.LJ(uri, "pay_type");
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(AnonymousClass0185.LJ(uri, "pay_to_mall_landing_schema_cached"));
        Long lLJIILIIL = C2095008Iq.LJIILIIL(AnonymousClass0185.LJ(uri2, "pay_to_mall_previous_time"));
        if (lLJIILIIL != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - lLJIILIIL.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        c1740050vNj.getClass();
        C1740050vNj.LIZ(c1740050vNj, "router_to_landing", Long.valueOf(jCurrentTimeMillis), str, strLJ2, numValueOf2, strLJ, numLJIIJJI2, null, 260);
        return String.valueOf(AnonymousClass0185.LIZIZ(uri2, "url", String.valueOf(AnonymousClass0185.LIZIZ(uri, "pay_to_mall_previous_time", String.valueOf(System.currentTimeMillis())))));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final void appendScrollFeedTo(h hVar) {
        EcPayToMallExpandAB.Config config = EcPayToMallExpandAB.LIZ;
        EcPayToMallExpandAB.Config config2 = EcPayToMallExpandAB.LIZIZ;
        List<String> list = config2.sourcePages;
        if (list != null && !list.isEmpty() && config2.scrollToFeed) {
            n nVar = new n();
            C2399609ak.LIZLLL(nVar, "scrollToFeeds", "action");
            n nVar2 = new n();
            C2399609ak.LIZLLL(nVar2, "mall_anchor", "name");
            C2399609ak.LIZLLL(nVar2, "anchor", "type");
            C2399609ak.LJ(nVar2, "config", nVar);
            hVar.LJJIFFI(nVar2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final Integer getPayToMallMethodV3(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        EcPayToMallExpandAB.Config config = EcPayToMallExpandAB.LIZ;
        Map<String, Integer> map = EcPayToMallExpandAB.LIZIZ.sourceToPTMMethod;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final Pair<Boolean, Map<String, Object>> mallParamsV2(Map<String, Object> map) {
        String string;
        if (LJI()) {
            return new Pair<>(Boolean.TRUE, null);
        }
        EcPayToMallExpandAB.Config config = EcPayToMallExpandAB.LIZIZ;
        List<String> list = config.sourcePages;
        if (list != null && !list.isEmpty()) {
            map.remove("back_btn_disable");
            Object obj = map.get("source_page_type");
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            String strLJFF = LJFF(map);
            if (!C13LP.LJJJJ(string, config.sourcePages)) {
                return new Pair<>(Boolean.TRUE, null);
            }
            return new Pair<>(Boolean.TRUE, LJ(string, strLJFF, new AwS605S0100000_26(config, 281)));
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final Pair<Integer, Map<String, Object>> mallParamsV3(Map<String, Object> map) {
        String string;
        if (LJI()) {
            return new Pair<>(null, null);
        }
        Object obj = map.get("source_page_type");
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        String strLJFF = LJFF(map);
        Integer payToMallMethodV3 = getPayToMallMethodV3(string);
        if (payToMallMethodV3 != null) {
            int iIntValue = payToMallMethodV3.intValue();
            map.remove("back_btn_disable");
            if (iIntValue <= 1) {
                return new Pair<>(Integer.valueOf(iIntValue), null);
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            Map mapLJ = LJ(string, strLJFF, AFwS268S0000000_26.get$arr$(302));
            mapLJ.put("shop_tab_ab", Integer.valueOf(iIntValue));
            return new Pair<>(numValueOf, mapLJ);
        }
        return new Pair<>(null, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final void setBackButtonDataDeferred(AnonymousClass0957<n> anonymousClass0957) {
        this.LIZIZ = anonymousClass0957;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final void setPayToMallParams(Map<String, Object> map) {
        this.LIZ = map;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final Uri LIZJ(Uri uri, Uri uri2) {
        Integer numLJIIJJI;
        Uri uri3;
        int i;
        if (C18159079h.LIZ() || (numLJIIJJI = C2095008Iq.LJIIJJI(AnonymousClass0185.LJ(uri, "shop_tab_ab"))) == null || numLJIIJJI.intValue() <= 1) {
            return uri2;
        }
        String strLIZLLL = C1976807ok.LIZLLL(uri2, "url");
        if (strLIZLLL != null && (uri3 = UriProtector.parse(strLIZLLL)) != null) {
            C1740050vNj c1740050vNj = C1740050vNj.LIZ;
            String strLJ = AnonymousClass0185.LJ(uri3, "pay_to_mall_source");
            String strLJ2 = AnonymousClass0185.LJ(uri3, "pay_type");
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(AnonymousClass0185.LJ(uri3, "pay_to_mall_landing_schema_cached"));
            String strValueOf = String.valueOf(uri);
            IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
            if (iEcUgBackButtonServiceOfficial != null && iEcUgBackButtonServiceOfficial.getInMallTab()) {
                i = 1;
            } else {
                i = 0;
            }
            c1740050vNj.getClass();
            C1740050vNj.LIZ(c1740050vNj, "router_to_mall", null, strValueOf, strLJ2, numLJIIJJI, strLJ, numLJIIJJI2, Integer.valueOf(i), 6);
        }
        Uri.Builder builderLIZ = C1976807ok.LIZ(uri2, new Pair("shop_tab_ab", numLJIIJJI));
        C1976807ok.LIZJ(builderLIZ, new Pair("pay_to_mall_previous_time", Long.valueOf(System.currentTimeMillis())));
        return builderLIZ.build();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final String getDiversionSchema(Context context, String str) {
        String str2;
        String strLJJIFFI;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        PayToMallData payToMallDataLIZ = C7880035y.LIZ(context, str);
        if (payToMallDataLIZ == null || (str2 = payToMallDataLIZ.diversionSchema) == null || (strLJJIFFI = u.LJJIFFI(str2, "__PAY_TO_MALL_PREVIOUS_TIME__", strValueOf, false)) == null) {
            return null;
        }
        return u.LJJIFFI(strLJJIFFI, "__PAY_TO_MALL_START_TIME__", strValueOf, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d9 A[LOOP:2: B:174:0x02d9->B:216:0x036f, LOOP_START, PHI: r17
      0x02d9: PHI (r17v1 int) = (r17v0 int), (r17v2 int) binds: [B:172:0x02d5, B:216:0x036f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJ(java.lang.String r21, java.lang.String r22, kotlin.jvm.functions.Function1 r23) {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.pay.EcUgPayToMallService.LJ(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):java.util.Map");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final void saveDiversionSchema(Context context, String str, String str2) {
        PayToMallData payToMallDataLIZ = C7880035y.LIZ(context, str);
        if (payToMallDataLIZ == null) {
            payToMallDataLIZ = new PayToMallData(null);
        }
        payToMallDataLIZ.diversionSchema = str2;
        try {
            InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323720kYE.LIZ(context);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ec_pay_to_mall_info_");
            sbLIZ.append(str);
            C189200o6.m2constructorimpl(Boolean.valueOf(interfaceC1870830ymfLIZ.LJIIIIZZ(C314470CUj.LIZLLL(payToMallDataLIZ), C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final String handleMiddlePageUrlAfterPaySuccess(String str, Integer num, String str2, String str3) {
        if (C18159079h.LIZ() || num == null || num.intValue() <= 1) {
            return str;
        }
        C1740050vNj c1740050vNj = C1740050vNj.LIZ;
        c1740050vNj.getClass();
        C1740050vNj.LIZ(c1740050vNj, "order_pay_success", null, str, str3, num, str2, null, null, 262);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Uri.Builder builderLIZ = C1976807ok.LIZ(UriProtector.parse(str), new Pair("pay_to_mall_start_time", Long.valueOf(jCurrentTimeMillis)));
        C1976807ok.LIZJ(builderLIZ, new Pair("pay_to_mall_previous_time", Long.valueOf(jCurrentTimeMillis)));
        return builderLIZ.build().toString();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService
    public final C928003jy handlePaySuccessWithLandingSchema(String str, String str2, String str3, Integer num) {
        if (C18159079h.LIZ()) {
            return null;
        }
        C1740050vNj c1740050vNj = C1740050vNj.LIZ;
        c1740050vNj.getClass();
        C1740050vNj.LIZ(c1740050vNj, "order_pay_success", null, str, str2, num, str3, 1, null, 262);
        return new C928003jy(new Pair[]{new Pair("shop_tab_ab", num)}, new Pair[]{new Pair("pay_type", str2), new Pair("pay_to_mall_landing_schema_cached", 1), new Pair("pay_to_mall_start_time", Long.valueOf(System.currentTimeMillis())), new Pair("pay_to_mall_previous_time", Long.valueOf(System.currentTimeMillis()))});
    }
}
