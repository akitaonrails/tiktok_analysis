package com.ss.android.ugc.aweme.ecommerce.ug.popup.service;

import X.AnonymousClass0185;
import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0PEM;
import X.C1018703yb;
import X.C123100dR;
import X.C1435305jb;
import X.C1740220vO0;
import X.C1740230vO1;
import X.C1740260vO4;
import X.C1740280vO6;
import X.C1740290vO7;
import X.C1740300vO8;
import X.C1740320vOA;
import X.C1740600vOc;
import X.C1740620vOe;
import X.C1740930vP9;
import X.C1740990vPF;
import X.C1741890vQh;
import X.C1766860w4y;
import X.C189200o6;
import X.C1942307jB;
import X.C1946007jm;
import X.C1947207jy;
import X.C1DFH;
import X.C2107308Nj;
import X.C21278418Ow;
import X.C2211631BhB;
import X.C2296808zG;
import X.C23250099c;
import X.C314470CUj;
import X.C324250CnP;
import X.C703302op;
import X.C823050WQl;
import X.EnumC1157630gEL;
import X.EnumC1740250vO3;
import X.InterfaceC1364105Vn;
import X.InterfaceC2211711BhJ;
import X.InterfaceC824510WWb;
import X.RunnableC1740310vO9;
import android.app.Activity;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgResumeLoadShopTabExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS121S1000000_4;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgPopupService implements IEcUgPopupService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final boolean A8() {
        C1740300vO8.LIZ.getClass();
        return C1740300vO8.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void E8() {
        C1435305jb.LIZ.set(true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void C8(int i) {
        C1435305jb.LIZ.set(false);
        if (i < 0) {
            Long l = ((EcUgResumeLoadShopTabExperiment.EcUgResumeLoadShopTabModel) EcUgResumeLoadShopTabExperiment.LIZIZ.getValue()).timeoutResumeLoad;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue > 0) {
                    C1435305jb.LIZIZ(jLongValue, "timeout_resume");
                    return;
                }
                return;
            }
            return;
        }
        if (i > 0) {
            C1435305jb.LIZIZ(((long) i) * 1000, "delay_load");
        } else {
            C1435305jb.LIZ("immediately_load");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final boolean D8(String str) {
        return C1740290vO7.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final boolean I8(String str) {
        return C1740290vO7.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void checkPageSourceInfo(String str) {
        String str2;
        String host;
        if (C1740280vO6.LIZ.checkBtm) {
            C1740300vO8.LIZ.getClass();
            if (C1740300vO8.LIZIZ) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str3 = "";
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                linkedHashMap.put("page_source_info", str2);
                if (str != null && !a0.LJJJIL(str)) {
                    boolean zLJJIIZI = a0.LJJIIZI(str, "b0865", false);
                    boolean zLJJIIZI2 = a0.LJJIIZI(str, "b0482", false);
                    linkedHashMap.put("has_top_tab", Integer.valueOf(zLJJIIZI ? 1 : 0));
                    linkedHashMap.put("has_bottom_tab", Integer.valueOf(zLJJIIZI2 ? 1 : 0));
                    String str4 = C1740300vO8.LIZJ;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    linkedHashMap.put("origin_schema", str3);
                    if (C703302op.LIZ(str4)) {
                        Uri uriLJ = C1946007jm.LJ(str4);
                        linkedHashMap.put("schema", uriLJ.buildUpon().clearQuery().build().toString());
                        String host2 = uriLJ.getHost();
                        if ((host2 != null && a0.LJJIIZI(host2, "lynxview", false)) || ((host = uriLJ.getHost()) != null && a0.LJJIIZI(host, "webview", false))) {
                            linkedHashMap.put("channel", C1946007jm.LJ(C1947207jy.LIZJ(str4)).buildUpon().clearQuery().build().toString());
                        }
                    }
                }
                C1018703yb.LIZIZ("rd_tiktokec_check_shoptab_btm", linkedHashMap);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final boolean isFromEcUg(Map<String, ? extends Object> map) {
        return C1740230vO1.LIZ(map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final boolean isFromEcUgVSA(Map<String, ? extends Object> map) {
        String string;
        Object obj;
        if (map != null && (obj = map.get("from_ec_ug")) != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        return Intrinsics.LJFF(string, EnumC1157630gEL.VSA.getValue());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void onPopupFragmentOnDestroy(Activity activity, Map<String, ? extends Object> map) {
        if (map != null && C1740230vO1.LIZ(map)) {
            C1740220vO0.LIZ(EnumC1740250vO3.DISMISS, activity, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void onPopupFragmentRenderCompleted(Activity activity, Map<String, ? extends Object> map) {
        if (map != null && C1740230vO1.LIZ(map)) {
            C1740220vO0.LIZ(EnumC1740250vO3.RENDER_COMPLETED, activity, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F8(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService.F8(android.content.Context, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void onPdpFragmentRenderCompleted(Activity activity, boolean z, Map<String, ? extends Object> map) {
        if (map != null && C1740230vO1.LIZ(map) && C1740220vO0.LIZIZ(map)) {
            C1740220vO0.LIZ(EnumC1740250vO3.RENDER_COMPLETED, activity, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void onPdpFragmentOnDestroy(Activity activity, InterfaceC2211711BhJ interfaceC2211711BhJ, boolean z, Map<String, ? extends Object> map) {
        if (map != null && C1740230vO1.LIZ(map)) {
            if (z) {
                C2211631BhB.LJIILIIL(interfaceC2211711BhJ);
            }
            if (C1740220vO0.LIZIZ(map)) {
                C1740220vO0.LIZ(EnumC1740250vO3.DISMISS, activity, map);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void onPopupFragmentExpandFull(Activity activity, String str, Map<String, ? extends Object> map, String str2) {
        if (map != null && C1740230vO1.LIZ(map)) {
            Long l = ((EcUgResumeLoadShopTabExperiment.EcUgResumeLoadShopTabModel) EcUgResumeLoadShopTabExperiment.LIZIZ.getValue()).expandResumeLoad;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue > 0) {
                    C1435305jb.LIZIZ(jLongValue, "expand_resume");
                }
            }
            C1740600vOc c1740600vOcLIZ = C1740620vOe.LIZ(activity);
            try {
                C1740320vOA c1740320vOA = C1740320vOA.LIZ;
                AwS121S1000000_4 awS121S1000000_4 = new AwS121S1000000_4("full_screen", 0);
                c1740320vOA.getClass();
                C823050WQl.LIZJ().execute(new RunnableC1740310vO9(str2, str, c1740600vOcLIZ, awS121S1000000_4));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final AnonymousClass0956 G8(String str, C1740990vPF c1740990vPF, AwS570S0100000_26 awS570S0100000_26, AwS570S0100000_26 awS570S0100000_262, String str2) {
        boolean z;
        IECommerceAnchorService iECommerceAnchorService;
        ProductListModel productListModelLJLJJL;
        if (str2 != null && !a0.LJJJIL(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str2 = UUID.randomUUID().toString();
            C1740260vO4 c1740260vO4 = C1740260vO4.LIZ;
            Uri uriLIZJ = UriProtector.parse(str);
            c1740260vO4.getClass();
            try {
                HashMap map = new HashMap();
                if (C1740260vO4.LIZIZ(uriLIZJ)) {
                    map.put("ec_ug_landing_uuid", str2);
                } else if (((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIJ(uriLIZJ)) {
                    HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(C1942307jB.LIZIZ(uriLIZJ, "half_search_for_mall_params"));
                    if (mapLJIIJ == null) {
                        mapLJIIJ = new HashMap<>();
                    }
                    mapLJIIJ.put("ec_ug_landing_uuid", str2);
                    if (mapLJIIJ.get("from_ec_ug") == null) {
                        mapLJIIJ.put("from_ec_ug", EnumC1157630gEL.DEFAULT);
                    }
                    String strLIZLLL = C314470CUj.LIZLLL(mapLJIIJ);
                    if (C123100dR.LIZ(strLIZLLL)) {
                        map.put("half_search_for_mall_params", strLIZLLL);
                    }
                } else if (C1740930vP9.LIZ(uriLIZJ) || (Intrinsics.LJFF(uriLIZJ.getHost(), "ec") && Intrinsics.LJFF(uriLIZJ.getPath(), "/store"))) {
                    HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(AnonymousClass0185.LJ(uriLIZJ, "trackParams"));
                    if (mapLJIIJ2 == null) {
                        mapLJIIJ2 = new HashMap<>();
                    }
                    mapLJIIJ2.put("ec_ug_landing_uuid", str2);
                    if (mapLJIIJ2.get("from_ec_ug") == null) {
                        mapLJIIJ2.put("from_ec_ug", EnumC1157630gEL.DEFAULT);
                    }
                    String strLIZLLL2 = C314470CUj.LIZLLL(mapLJIIJ2);
                    if (C123100dR.LIZ(strLIZLLL2)) {
                        map.put("trackParams", strLIZLLL2);
                    }
                } else if (Intrinsics.LJFF(uriLIZJ.getPath(), "/video_list")) {
                    HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(AnonymousClass0185.LJ(uriLIZJ, "log_extra"));
                    if (mapLJIIJ3 == null) {
                        mapLJIIJ3 = new HashMap<>();
                    }
                    mapLJIIJ3.put("ec_ug_landing_uuid", str2);
                    if (mapLJIIJ3.get("from_ec_ug") == null) {
                        mapLJIIJ3.put("from_ec_ug", EnumC1157630gEL.DEFAULT.getValue());
                    }
                    String strLIZLLL3 = C314470CUj.LIZLLL(mapLJIIJ3);
                    if (C123100dR.LIZ(strLIZLLL3)) {
                        map.put("log_extra", strLIZLLL3);
                    }
                }
                if (!map.isEmpty()) {
                    uriLIZJ = AnonymousClass0185.LIZJ(uriLIZJ, map);
                } else {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            str = String.valueOf(uriLIZJ);
        }
        C21278418Ow.LIZ.getClass();
        if (C21278418Ow.LJIIIIZZ(str) && (productListModelLJLJJL = (iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJJL()) != null) {
            Map<String, Object> map2 = productListModelLJLJJL.trackParams;
            if (map2 != null) {
                map2.put("ec_ug_landing_uuid", str2);
            }
            iECommerceAnchorService.LJJI(productListModelLJLJJL, "ec_ug_vsa_plp_cache");
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C324250CnP(str2, awS570S0100000_26, null), 3);
        c1740990vPF.invoke(str, new AwS368S0200000_2(anonymousClass0956LIZLLL, awS570S0100000_262, 154));
        return anonymousClass0956LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void onPdpFragmentOnCreate(Activity activity, InterfaceC2211711BhJ interfaceC2211711BhJ, boolean z, Map<String, ? extends Object> map, String str) {
        String str2;
        String string;
        if (z) {
            str2 = "seven_tenths_screen";
        } else {
            str2 = "full_screen";
        }
        if (map != null && C1740230vO1.LIZ(map)) {
            if (z) {
                C2211631BhB.LJIILJJIL(interfaceC2211711BhJ);
                if (C1740230vO1.LIZ(map)) {
                    C1740220vO0.LIZ(EnumC1740250vO3.SHOW, activity, map);
                    C1740600vOc c1740600vOcLIZ = C1740620vOe.LIZ(activity);
                    try {
                        C1740320vOA c1740320vOA = C1740320vOA.LIZ;
                        AwS121S1000000_4 awS121S1000000_4 = new AwS121S1000000_4(str2, 0);
                        c1740320vOA.getClass();
                        C823050WQl.LIZJ().execute(new RunnableC1740310vO9(str, "product_detail", c1740600vOcLIZ, awS121S1000000_4));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            Object obj = map.get("from_ec_ug");
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(string, EnumC1157630gEL.VSA.getValue())) {
                C1766860w4y.LIZ.getClass();
                C1766860w4y.LJIIIZ(null, null, true);
            }
            if (C1740220vO0.LIZIZ(map)) {
                C1740220vO0.LIZ(EnumC1740250vO3.SHOW, activity, map);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void onPopupFragmentOnCreate(Activity activity, String str, Map<String, ? extends Object> map, String str2, String str3) {
        if (map != null && C1740230vO1.LIZ(map)) {
            C1740220vO0.LIZ(EnumC1740250vO3.SHOW, activity, map);
            C1740600vOc c1740600vOcLIZ = C1740620vOe.LIZ(activity);
            try {
                C1740320vOA c1740320vOA = C1740320vOA.LIZ;
                AwS121S1000000_4 awS121S1000000_4 = new AwS121S1000000_4(str3, 0);
                c1740320vOA.getClass();
                C823050WQl.LIZJ().execute(new RunnableC1740310vO9(str2, str, c1740600vOcLIZ, awS121S1000000_4));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x02ca: MOVE (r2 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:134218442), block:B:129:0x02ca */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024b A[Catch: all -> 0x02cc, TryCatch #1 {all -> 0x02cc, blocks: (B:91:0x01f9, B:94:0x0202, B:96:0x020c, B:97:0x0210, B:99:0x021c, B:105:0x022d, B:107:0x024b, B:110:0x0254, B:112:0x025a, B:113:0x025d, B:115:0x0275, B:118:0x027c, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:124:0x02a6, B:126:0x02b8, B:104:0x0229), top: B:135:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0275 A[Catch: all -> 0x02cc, TryCatch #1 {all -> 0x02cc, blocks: (B:91:0x01f9, B:94:0x0202, B:96:0x020c, B:97:0x0210, B:99:0x021c, B:105:0x022d, B:107:0x024b, B:110:0x0254, B:112:0x025a, B:113:0x025d, B:115:0x0275, B:118:0x027c, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:124:0x02a6, B:126:0x02b8, B:104:0x0229), top: B:135:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0288 A[Catch: all -> 0x02cc, TryCatch #1 {all -> 0x02cc, blocks: (B:91:0x01f9, B:94:0x0202, B:96:0x020c, B:97:0x0210, B:99:0x021c, B:105:0x022d, B:107:0x024b, B:110:0x0254, B:112:0x025a, B:113:0x025d, B:115:0x0275, B:118:0x027c, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:124:0x02a6, B:126:0x02b8, B:104:0x0229), top: B:135:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b8 A[Catch: all -> 0x02cc, TryCatch #1 {all -> 0x02cc, blocks: (B:91:0x01f9, B:94:0x0202, B:96:0x020c, B:97:0x0210, B:99:0x021c, B:105:0x022d, B:107:0x024b, B:110:0x0254, B:112:0x025a, B:113:0x025d, B:115:0x0275, B:118:0x027c, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:124:0x02a6, B:126:0x02b8, B:104:0x0229), top: B:135:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x02c9, TryCatch #0 {all -> 0x02c9, blocks: (B:3:0x0011, B:5:0x0019, B:6:0x001f, B:8:0x002a, B:11:0x003b, B:13:0x0045, B:15:0x0067, B:17:0x006b, B:18:0x006e, B:21:0x0074, B:23:0x007c, B:25:0x0082, B:27:0x0086, B:28:0x0088, B:29:0x0092, B:31:0x0098, B:33:0x00a4, B:35:0x00aa, B:70:0x0159, B:73:0x016a, B:77:0x017b, B:76:0x0173, B:78:0x017e, B:84:0x01aa, B:87:0x01b3, B:90:0x01bf, B:36:0x00ae, B:37:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c9, B:43:0x00d2, B:45:0x00d8, B:47:0x00e4, B:49:0x00ea, B:50:0x00ee, B:51:0x00f2, B:53:0x00f8, B:55:0x0105, B:56:0x0109, B:57:0x0113, B:58:0x0114, B:59:0x0118, B:61:0x011e, B:63:0x012a, B:65:0x0130, B:66:0x0134, B:67:0x013f, B:69:0x0145, B:20:0x0072), top: B:134:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: all -> 0x02c9, TryCatch #0 {all -> 0x02c9, blocks: (B:3:0x0011, B:5:0x0019, B:6:0x001f, B:8:0x002a, B:11:0x003b, B:13:0x0045, B:15:0x0067, B:17:0x006b, B:18:0x006e, B:21:0x0074, B:23:0x007c, B:25:0x0082, B:27:0x0086, B:28:0x0088, B:29:0x0092, B:31:0x0098, B:33:0x00a4, B:35:0x00aa, B:70:0x0159, B:73:0x016a, B:77:0x017b, B:76:0x0173, B:78:0x017e, B:84:0x01aa, B:87:0x01b3, B:90:0x01bf, B:36:0x00ae, B:37:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c9, B:43:0x00d2, B:45:0x00d8, B:47:0x00e4, B:49:0x00ea, B:50:0x00ee, B:51:0x00f2, B:53:0x00f8, B:55:0x0105, B:56:0x0109, B:57:0x0113, B:58:0x0114, B:59:0x0118, B:61:0x011e, B:63:0x012a, B:65:0x0130, B:66:0x0134, B:67:0x013f, B:69:0x0145, B:20:0x0072), top: B:134:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x02c9, TryCatch #0 {all -> 0x02c9, blocks: (B:3:0x0011, B:5:0x0019, B:6:0x001f, B:8:0x002a, B:11:0x003b, B:13:0x0045, B:15:0x0067, B:17:0x006b, B:18:0x006e, B:21:0x0074, B:23:0x007c, B:25:0x0082, B:27:0x0086, B:28:0x0088, B:29:0x0092, B:31:0x0098, B:33:0x00a4, B:35:0x00aa, B:70:0x0159, B:73:0x016a, B:77:0x017b, B:76:0x0173, B:78:0x017e, B:84:0x01aa, B:87:0x01b3, B:90:0x01bf, B:36:0x00ae, B:37:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c9, B:43:0x00d2, B:45:0x00d8, B:47:0x00e4, B:49:0x00ea, B:50:0x00ee, B:51:0x00f2, B:53:0x00f8, B:55:0x0105, B:56:0x0109, B:57:0x0113, B:58:0x0114, B:59:0x0118, B:61:0x011e, B:63:0x012a, B:65:0x0130, B:66:0x0134, B:67:0x013f, B:69:0x0145, B:20:0x0072), top: B:134:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[Catch: all -> 0x02c9, TryCatch #0 {all -> 0x02c9, blocks: (B:3:0x0011, B:5:0x0019, B:6:0x001f, B:8:0x002a, B:11:0x003b, B:13:0x0045, B:15:0x0067, B:17:0x006b, B:18:0x006e, B:21:0x0074, B:23:0x007c, B:25:0x0082, B:27:0x0086, B:28:0x0088, B:29:0x0092, B:31:0x0098, B:33:0x00a4, B:35:0x00aa, B:70:0x0159, B:73:0x016a, B:77:0x017b, B:76:0x0173, B:78:0x017e, B:84:0x01aa, B:87:0x01b3, B:90:0x01bf, B:36:0x00ae, B:37:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c9, B:43:0x00d2, B:45:0x00d8, B:47:0x00e4, B:49:0x00ea, B:50:0x00ee, B:51:0x00f2, B:53:0x00f8, B:55:0x0105, B:56:0x0109, B:57:0x0113, B:58:0x0114, B:59:0x0118, B:61:0x011e, B:63:0x012a, B:65:0x0130, B:66:0x0134, B:67:0x013f, B:69:0x0145, B:20:0x0072), top: B:134:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[Catch: all -> 0x02c9, TryCatch #0 {all -> 0x02c9, blocks: (B:3:0x0011, B:5:0x0019, B:6:0x001f, B:8:0x002a, B:11:0x003b, B:13:0x0045, B:15:0x0067, B:17:0x006b, B:18:0x006e, B:21:0x0074, B:23:0x007c, B:25:0x0082, B:27:0x0086, B:28:0x0088, B:29:0x0092, B:31:0x0098, B:33:0x00a4, B:35:0x00aa, B:70:0x0159, B:73:0x016a, B:77:0x017b, B:76:0x0173, B:78:0x017e, B:84:0x01aa, B:87:0x01b3, B:90:0x01bf, B:36:0x00ae, B:37:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c9, B:43:0x00d2, B:45:0x00d8, B:47:0x00e4, B:49:0x00ea, B:50:0x00ee, B:51:0x00f2, B:53:0x00f8, B:55:0x0105, B:56:0x0109, B:57:0x0113, B:58:0x0114, B:59:0x0118, B:61:0x011e, B:63:0x012a, B:65:0x0130, B:66:0x0134, B:67:0x013f, B:69:0x0145, B:20:0x0072), top: B:134:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd A[Catch: all -> 0x02c9, TryCatch #0 {all -> 0x02c9, blocks: (B:3:0x0011, B:5:0x0019, B:6:0x001f, B:8:0x002a, B:11:0x003b, B:13:0x0045, B:15:0x0067, B:17:0x006b, B:18:0x006e, B:21:0x0074, B:23:0x007c, B:25:0x0082, B:27:0x0086, B:28:0x0088, B:29:0x0092, B:31:0x0098, B:33:0x00a4, B:35:0x00aa, B:70:0x0159, B:73:0x016a, B:77:0x017b, B:76:0x0173, B:78:0x017e, B:84:0x01aa, B:87:0x01b3, B:90:0x01bf, B:36:0x00ae, B:37:0x00b3, B:38:0x00b7, B:40:0x00bd, B:42:0x00c9, B:43:0x00d2, B:45:0x00d8, B:47:0x00e4, B:49:0x00ea, B:50:0x00ee, B:51:0x00f2, B:53:0x00f8, B:55:0x0105, B:56:0x0109, B:57:0x0113, B:58:0x0114, B:59:0x0118, B:61:0x011e, B:63:0x012a, B:65:0x0130, B:66:0x0134, B:67:0x013f, B:69:0x0145, B:20:0x0072), top: B:134:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0202 A[Catch: all -> 0x02cc, TRY_ENTER, TryCatch #1 {all -> 0x02cc, blocks: (B:91:0x01f9, B:94:0x0202, B:96:0x020c, B:97:0x0210, B:99:0x021c, B:105:0x022d, B:107:0x024b, B:110:0x0254, B:112:0x025a, B:113:0x025d, B:115:0x0275, B:118:0x027c, B:120:0x0288, B:122:0x0292, B:123:0x029c, B:124:0x02a6, B:126:0x02b8, B:104:0x0229), top: B:135:0x01f9 }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v55, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v67, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v70, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v90 */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C443120HZe B8(boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService.B8(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):X.0HZe");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final Object H8(Fragment fragment, String str, boolean z, boolean z2, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC824510WWb interfaceC824510WWb, boolean z3, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C1740300vO8.LIZ.LIZ(fragment, str, z, z2, function2, interfaceC824510WWb, z3, interfaceC1364105Vn);
    }
}
