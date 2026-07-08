package com.ss.android.ugc.aweme.poi.search;

import X.C09JN;
import X.C0C64;
import X.C0PEM;
import X.C1165730gRP;
import X.C1185430gxB;
import X.C1186030gy9;
import X.C1189060h32;
import X.C1197490hGd;
import X.C1197690hGx;
import X.C1197700hGy;
import X.C1197710hGz;
import X.C1197720hH0;
import X.C1197840hHC;
import X.C1197910hHJ;
import X.C1198110hHd;
import X.C1198630hIT;
import X.C1198830hIn;
import X.C1198850hIp;
import X.C1198880hIs;
import X.C1199080hJC;
import X.C1199110hJF;
import X.C1199140hJI;
import X.C1199160hJK;
import X.C1199490hJr;
import X.C1199590hK1;
import X.C11S5;
import X.C123100dR;
import X.C1279604za;
import X.C1367960lha;
import X.C13BV;
import X.C1499850p8J;
import X.C15438062q;
import X.C1701940uOG;
import X.C19EG;
import X.C2088308Gb;
import X.C2188811AlT;
import X.C23250099c;
import X.C2365509Or;
import X.C2550409z4;
import X.C292490BdH;
import X.C297510BlN;
import X.C305410By7;
import X.C627660Ojc;
import X.C839940WxE;
import X.C844470XAv;
import X.EnumC1198680hIY;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import Y.AfS5S0000100_18;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.experiment.PoiExpandScopeMetaDataExp;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi.search.data.PoiSearchFilterDataItem;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS33S0000100_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchVM extends AssemListViewModel<C1197490hGd, C1198630hIT, C1199490hJr> {
    public static final /* synthetic */ int LLLFFI = 0;
    public boolean LL;
    public boolean LLILLJJLI;
    public String LLILZ;
    public String LLILZLL;
    public List<String> LLJ;
    public String LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public Long LLJILJILJ;
    public Long LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public double LLJJJ;
    public double LLJJJIL;
    public boolean LLJJJJ;
    public PoiMobParam LLJJJJJIL;
    public final C1199110hJF LLJJJJLIIL;
    public final Set<String> LLJJL;
    public final ConcurrentHashMap<String, String> LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public PoiData LLJLIL;
    public C1198850hIp LLJLILLLLZIIL;
    public C1198830hIn LLJLL;
    public C1197690hGx LLJLLIL;
    public C1197720hH0 LLJLLL;
    public final C1197700hGy LLJZ;
    public PoiData LLJZIJLIL;
    public C1198630hIT LLL;
    public String LLLF;
    public String LLLFF;
    public EnumC1198680hIY LLILLL = EnumC1198680hIY.ADD_LOCATION;
    public List<MediaLocationMetaDataModel> LLILZIL = new ArrayList();
    public final List<InterfaceC1891350zJl> LLIZ = Collections.synchronizedList(new ArrayList());
    public final List<PoiSearchFilterDataItem> LLIZLLLIL = new ArrayList();

    public final boolean FQ2() {
        Map<String, String> map;
        if (!this.LL && !this.LLILLJJLI) {
            return zQ2();
        }
        PoiMobParam poiMobParam = this.LLJJJJJIL;
        return C123100dR.LIZ((poiMobParam == null || (map = poiMobParam.creationExtraData) == null) ? null : map.get("rec_poi_id_list"));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1197490hGd(0);
    }

    public PoiSearchVM() {
        C1197840hHC.LIZ.getClass();
        this.LLJ = C1197840hHC.LIZ();
        this.LLJILJIL = true;
        this.LLJJI = wQ2();
        this.LLJJIII = "";
        this.LLJJIJI = "";
        this.LLJJJJLIIL = new C1199110hJF();
        this.LLJJL = Collections.synchronizedSet(new HashSet());
        this.LLJJLIIIJLLLLLLLZ = new ConcurrentHashMap<>();
        this.LLJZ = new C1197700hGy();
    }

    public final boolean wQ2() {
        boolean z;
        boolean z2;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        C844470XAv.LIZ.getClass();
        boolean zLJ = iLocationBaseServiceForMT.LJ(C844470XAv.LIZ());
        boolean zLJJIJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJ();
        boolean z3 = (this.LLJJJ == 0.0d || this.LLJJJIL == 0.0d) ? false : true;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_add_location_show_distance", true) == 1) {
            z = true;
            if (zLJ && zLJJIJ) {
                z2 = true;
            }
            this.LLJJ = z2;
            return !z ? false : false;
        }
        z = false;
        z2 = false;
        this.LLJJ = z2;
        return !z ? false : false;
    }

    public final boolean zQ2() {
        if (!C297510BlN.LIZ()) {
            return true;
        }
        C1197840hHC.LIZ.getClass();
        boolean z = (((ArrayList) C1197840hHC.LIZ()).isEmpty() ^ true) || (((ArrayList) this.LLJ).isEmpty() ^ true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isUseCache :");
        boolean z2 = !z;
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        return z2;
    }

    public final void CQ2(String str) {
        String str2;
        String str3;
        C1197690hGx c1197690hGx = this.LLJLLIL;
        if (c1197690hGx != null) {
            C1197710hGz c1197710hGz = C1197710hGz.LIZ;
            PoiMobParam poiMobParam = this.LLJJJJJIL;
            if (poiMobParam != null) {
                str2 = poiMobParam.enterFrom;
                str3 = poiMobParam.creationId;
            } else {
                str2 = null;
                str3 = null;
            }
            c1197710hGz.getClass();
            C1197710hGz.LIZ(c1197690hGx, str2, str3, str);
            c1197690hGx.LIZLLL = true;
        }
        this.LLJLLIL = null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1198630hIT> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 504));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1199490hJr>> r9) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchVM.onRefresh(X.05Vn):java.lang.Object");
    }

    public final long xQ2(C1197720hH0 c1197720hH0) {
        C1197690hGx c1197690hGx;
        Long l;
        if (c1197720hH0 != null && (c1197690hGx = c1197720hH0.LJFF) != null && (l = c1197690hGx.LIZIZ) != null) {
            return l.longValue();
        }
        return this.LLJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: BQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1199490hJr r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1199490hJr>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1199230hJR
            if (r0 == 0) goto L20
            r6 = r10
            X.0hJR r6 = (X.C1199230hJR) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L6d
        L20:
            X.0hJR r6 = new X.0hJR
            r6.<init>(r8, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.0hJg r4 = X.C1199380hJg.LIZ     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = r9.LIZIZ     // Catch: java.lang.Exception -> L73
            int r0 = r9.LIZ     // Catch: java.lang.Exception -> L73
            r4.getClass()     // Catch: java.lang.Exception -> L73
            X.C1199380hJg.LIZIZ = r1     // Catch: java.lang.Exception -> L73
            X.C1199380hJg.LIZJ = r0     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = r9.LIZIZ     // Catch: java.lang.Exception -> L73
            int r3 = r9.LIZ     // Catch: java.lang.Exception -> L73
            r4.getClass()     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L4e
            int r0 = r0.length()     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 == 0) goto L54
            goto L57
        L54:
            java.lang.String r2 = "search"
            goto L59
        L57:
            java.lang.String r2 = "recommend"
        L59:
            kotlin.jvm.internal.AwS8S1001000_18 r1 = new kotlin.jvm.internal.AwS8S1001000_18     // Catch: java.lang.Exception -> L73
            r0 = 2
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Exception -> L73
            java.lang.String r0 = "loadmore_request"
            r4.LIZJ(r0, r1)     // Catch: java.lang.Exception -> L73
            r6.LLILLL = r5     // Catch: java.lang.Exception -> L73
            java.lang.Object r2 = r8.EQ2(r9, r6)     // Catch: java.lang.Exception -> L73
            if (r2 != r7) goto L70
            return r7
        L6d:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L73
        L70:
            X.0CbV r2 = (X.AbstractC316870CbV) r2     // Catch: java.lang.Exception -> L73
            return r2
        L73:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r2 = new X.0Cb9
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchVM.onLoadMore(X.0hJr, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Type inference failed for: r11v12, types: [T] */
    /* JADX WARN: Type inference failed for: r11v16, types: [T] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r3v54, types: [T, com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PoiSearchResultWrapper] */
    /* JADX WARN: Type inference failed for: r4v28, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(X.C1199490hJr r58, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1199490hJr>> r59) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchVM.EQ2(X.0hJr, X.05Vn):java.lang.Object");
    }

    public static boolean yQ2(C1199490hJr c1199490hJr, boolean z, String str) {
        boolean z2;
        boolean z3;
        boolean z4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        boolean z5 = C2550409z4.LIZ;
        if (z5) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(',');
        sbLIZ.append(c1199490hJr.LIZ);
        sbLIZ.append(',');
        String str2 = c1199490hJr.LIZIZ;
        if (str2 != null && str2.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        sbLIZ.append(z3);
        sbLIZ.append(',');
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z5) {
            return false;
        }
        String str3 = c1199490hJr.LIZIZ;
        if (str3 != null && str3.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            if (!z4 || c1199490hJr.LIZ != 1) {
                return false;
            }
            return true;
        }
        if (!z4 || Intrinsics.LJFF(str, "") || c1199490hJr.LIZ == 1) {
            return false;
        }
        return true;
    }

    public final void GQ2(C19EG c19eg, PoiData poiData, EnumC1198680hIY enumC1198680hIY) {
        String str;
        if (poiData == null || (str = this.LLILZ) == null) {
            return;
        }
        setState(AFwS256S0000000_18.get$arr$(666));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1198110hHd(str, poiData, this, enumC1198680hIY, c19eg, null), 2);
    }

    public static Object DQ2(C1199140hJI c1199140hJI, Long l, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        CertProviderManagerKt.findCert("bpea-poi_search_empty_search_client_rank", 1476448272, "evru");
        try {
            return new C1199080hJC(c1199140hJI, l, z, null).invoke(interfaceC1364105Vn);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public final void vQ2(String str, String str2, String str3, int i, C1197720hH0 c1197720hH0) {
        boolean z;
        String str4;
        String str5;
        C1199590hK1 c1199590hK1LIZIZ;
        Long lValueOf;
        if (C123100dR.LIZ(str)) {
            long j = i + 1;
            double d = this.LLJJJ;
            double d2 = this.LLJJJIL;
            List<MediaLocationMetaDataModel> list = this.LLILZIL;
            boolean z2 = this.LLJJJJ;
            long jXQ2 = xQ2(c1197720hH0);
            C1198880hIs c1198880hIs = EnumC1198680hIY.Companion;
            EnumC1198680hIY enumC1198680hIY = this.LLILLL;
            c1198880hIs.getClass();
            if (enumC1198680hIY != EnumC1198680hIY.POI_RE_TAG && enumC1198680hIY != EnumC1198680hIY.POI_EDIT_POST) {
                z = false;
            } else {
                z = true;
            }
            String str6 = null;
            if (z) {
                str4 = this.LLILZ;
            } else {
                str4 = null;
            }
            PoiMobParam poiMobParam = this.LLJJJJJIL;
            if (poiMobParam != null) {
                str5 = poiMobParam.enterFrom;
            } else {
                str5 = null;
            }
            if (i != 0) {
                str6 = this.LLJJLIIIJLLLLLLLZ.get(str);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1197910hHJ.LIZ(linkedHashMap, this.LLJJJJJIL);
            C1199140hJI c1199140hJI = new C1199140hJI(d2, d, list, 3000L, str, "NEARBY", 20L, j, z2, jXQ2, str4, str5, str6, str2, str3, C1189060h32.LJJIIJZLJL(linkedHashMap), null, null, null, null, null, null, null, null, null, -133849208, 31);
            PoiSearchApi.LIZ.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
            c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
            c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
            c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
            c1499850p8JCreateBuilder.LJIIIZ = 0;
            PoiSearchApi poiSearchApi = (PoiSearchApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PoiSearchApi.class);
            String strLIZJ = C1199160hJK.LIZJ(jCurrentTimeMillis2);
            C844470XAv.LIZ.getClass();
            String strValueOf = String.valueOf(C844470XAv.LJIIJ);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            try {
                double d3 = c1199140hJI.LIZIZ;
                double d4 = c1199140hJI.LIZ;
                TokenCert tokenCertWith = TokenCert.Companion.with("bpea-poi_search_encrypt_location_data");
                tokenCertWith.auth("hyqv");
                c1199590hK1LIZIZ = C839940WxE.LIZIZ(d3, d4, tokenCertWith);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1199590hK1LIZIZ = null;
            }
            if (c1199590hK1LIZIZ != null && !C305410By7.LIZ) {
                linkedHashMap2.put("encrypt_location", c1199590hK1LIZIZ.LIZIZ + ',' + c1199590hK1LIZIZ.LIZ);
            } else {
                linkedHashMap2.put("encrypt_location", "");
            }
            PoiExpandScopeMetaDataExp.LIZ.getClass();
            if (PoiExpandScopeMetaDataExp.LIZ()) {
                linkedHashMap2.put("encrypt_meta_location", C1279604za.LIZ(c1199140hJI.LIZJ));
            }
            C1186030gy9.LIZ(new AwS562S0100000_18(linkedHashMap2, (Map<String, Object>) 871));
            String strLIZ = C2088308Gb.LIZ(C2365509Or.LJ(linkedHashMap2));
            C1367960lha.LIZ.getClass();
            String strLIZIZ = C1367960lha.LIZIZ();
            String appLanguage = ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage();
            String str7 = c1199140hJI.LJFF;
            long j2 = c1199140hJI.LIZLLL;
            long j3 = c1199140hJI.LJI;
            if (j3 <= 0) {
                j3 = 20;
            }
            long j4 = c1199140hJI.LJII;
            if (j4 <= 0) {
                j4 = 1;
            }
            C844470XAv.LIZ.getClass();
            int i2 = C844470XAv.LJIIJ;
            String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            String strValueOf2 = String.valueOf(C844470XAv.LJ());
            boolean z3 = c1199140hJI.LJIIIIZZ;
            String strLIZ2 = C292490BdH.LIZ();
            long j5 = c1199140hJI.LJIIIZ;
            if (j5 > 0) {
                lValueOf = Long.valueOf(j5);
            } else {
                lValueOf = null;
            }
            poiSearchApi.LIZ("application/json", strLIZJ, strValueOf, ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJII(new PoiSearchRequestBody(strLIZIZ, appLanguage, str7, j2, j3, j4, 0, i2, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, strValueOf2, "1.2.0-rc.5", jCurrentTimeMillis2, z3 ? 1 : 0, 0, 4, strLIZ2, strLIZ, lValueOf, c1199140hJI.LJIIJ, c1199140hJI.LJIIJJI, c1199140hJI.LJIIL, c1199140hJI.LJIILIIL, c1199140hJI.LJIILJJIL, c1199140hJI.LJIILL, null, null, c1199140hJI.LJIJ, c1199140hJI.LJIJI, c1199140hJI.LJIJJ, null)).toJsonObject(), 1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS5S0000100_18(jCurrentTimeMillis, 2), new C09JN() { // from class: X.0hH6
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PoiSearchApi$Companion@bc2d.addSearchRcmdSample$2");
                    C1199460hJo c1199460hJo = C1199460hJo.LIZ;
                    C1199450hJn c1199450hJn = new C1199450hJn("poi_search");
                    c1199450hJn.LIZLLL = "add_search_rcmd_sample";
                    c1199450hJn.LIZ(0L);
                    c1199460hJo.getClass();
                    C1199460hJo.LIZ(c1199450hJn);
                    C1C7U.LIZIZ("PoiSearchApi$Companion@bc2d.addSearchRcmdSample$2");
                }
            });
            LocationNetTracker.LIZIZ(null, new AwS33S0000100_18(jCurrentTimeMillis, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static void AQ2(PoiSearchVM poiSearchVM, int i, C1199490hJr c1199490hJr, C1197720hH0 c1197720hH0, long j, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, List list, int i2) {
        String str;
        String str2;
        Integer num;
        String str3;
        ?? arrayList;
        String str4;
        Integer num2;
        Boolean boolIsCacheForSearch;
        List<PoiData> list2;
        String str5;
        String str6;
        Integer num3;
        Boolean boolIsCacheForSearch2;
        List list3 = list;
        if ((i2 & 64) != 0) {
            list3 = null;
        }
        poiSearchVM.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        long jXQ2 = poiSearchVM.xQ2(c1197720hH0);
        String str7 = c1199490hJr.LIZIZ;
        if (str7 == null) {
            str = "default_search_poi";
        } else {
            str = "search_poi";
        }
        if (i != -1) {
            if (i != 0) {
                if (i == 1 && poiSearchResultWrapper != null) {
                    C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                    PoiMobParam poiMobParam = poiSearchVM.LLJJJJJIL;
                    if (poiMobParam != null) {
                        str5 = poiMobParam.enterFrom;
                    } else {
                        str5 = null;
                    }
                    if (str7 == null) {
                        str7 = "";
                    }
                    int i3 = c1199490hJr.LIZ - 1;
                    C13BV c13bv = C13BV.INSTANCE;
                    PoiSearchApi.PoiSearchResult poiSearchResult = poiSearchResultWrapper.poiSearchResult;
                    if (poiSearchResult != null) {
                        str6 = poiSearchResult.logId;
                    } else {
                        str6 = null;
                    }
                    String str8 = poiSearchVM.LLILZLL;
                    Long lValueOf = Long.valueOf(jXQ2);
                    PoiMobParam poiMobParam2 = poiSearchVM.LLJJJJJIL;
                    if (poiMobParam2 != null) {
                        num3 = poiMobParam2.awemeType;
                    } else {
                        num3 = null;
                    }
                    PoiSearchApi.PoiSearchResult poiSearchResult2 = poiSearchResultWrapper.poiSearchResult;
                    if (poiSearchResult2 != null) {
                        boolIsCacheForSearch2 = poiSearchResult2.isCacheForSearch();
                    } else {
                        boolIsCacheForSearch2 = null;
                    }
                    int i4 = poiSearchResultWrapper.useSessionCache;
                    String str9 = poiSearchVM.LLJJIII;
                    String str10 = poiSearchVM.LLJJIJI;
                    c1185430gxB.getClass();
                    C1185430gxB.LJJJJLL(str5, str, str7, 0, i3, jCurrentTimeMillis, c13bv, str6, c13bv, str8, lValueOf, num3, 0, poiMobParam2, boolIsCacheForSearch2, i4, str9, str10, 0);
                    return;
                }
                return;
            }
            if (poiSearchResultWrapper == null) {
                return;
            }
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            PoiMobParam poiMobParam3 = poiSearchVM.LLJJJJJIL;
            if (poiMobParam3 != null) {
                str3 = poiMobParam3.enterFrom;
            } else {
                str3 = null;
            }
            if (str7 == null) {
                str7 = "";
            }
            int i5 = c1199490hJr.LIZ - 1;
            PoiSearchApi.PoiSearchResult poiSearchResult3 = poiSearchResultWrapper.poiSearchResult;
            if (poiSearchResult3 != null && (list2 = poiSearchResult3.poiList) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<PoiData> it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str11 = it2.next().poiId;
                    if (str11 == null) {
                        str11 = "";
                    }
                    arrayList.add(str11);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            PoiSearchApi.PoiSearchResult poiSearchResult4 = poiSearchResultWrapper.poiSearchResult;
            if (poiSearchResult4 != null) {
                str4 = poiSearchResult4.logId;
            } else {
                str4 = null;
            }
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            String str12 = poiSearchVM.LLILZLL;
            Long lValueOf2 = Long.valueOf(jXQ2);
            PoiMobParam poiMobParam4 = poiSearchVM.LLJJJJJIL;
            if (poiMobParam4 != null) {
                num2 = poiMobParam4.awemeType;
            } else {
                num2 = null;
            }
            PoiSearchApi.PoiSearchResult poiSearchResult5 = poiSearchResultWrapper.poiSearchResult;
            if (poiSearchResult5 != null) {
                boolIsCacheForSearch = poiSearchResult5.isCacheForSearch();
            } else {
                boolIsCacheForSearch = null;
            }
            int i6 = poiSearchResultWrapper.useSessionCache;
            String str13 = poiSearchVM.LLJJIII;
            String str14 = poiSearchVM.LLJJIJI;
            c1185430gxB2.getClass();
            C1185430gxB.LJJJJLL(str3, str, str7, 1, i5, jCurrentTimeMillis, arrayList, str4, list3, str12, lValueOf2, num2, 0, poiMobParam4, boolIsCacheForSearch, i6, str13, str14, 0);
            return;
        }
        C1185430gxB c1185430gxB3 = C1185430gxB.LIZ;
        PoiMobParam poiMobParam5 = poiSearchVM.LLJJJJJIL;
        if (poiMobParam5 != null) {
            str2 = poiMobParam5.enterFrom;
        } else {
            str2 = null;
        }
        if (str7 == null) {
            str7 = "";
        }
        int i7 = (-1) + c1199490hJr.LIZ;
        C13BV c13bv2 = C13BV.INSTANCE;
        Long lValueOf3 = Long.valueOf(jXQ2);
        PoiMobParam poiMobParam6 = poiSearchVM.LLJJJJJIL;
        if (poiMobParam6 != null) {
            num = poiMobParam6.awemeType;
        } else {
            num = null;
        }
        String str15 = poiSearchVM.LLJJIII;
        String str16 = poiSearchVM.LLJJIJI;
        c1185430gxB3.getClass();
        C1185430gxB.LJJJJLL(str2, str, str7, 0, i7, jCurrentTimeMillis, c13bv2, null, c13bv2, null, lValueOf3, num, 0, poiMobParam6, null, 0, str15, str16, 0);
    }
}
