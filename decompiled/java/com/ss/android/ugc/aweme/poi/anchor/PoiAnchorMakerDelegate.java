package com.ss.android.ugc.aweme.poi.anchor;

import X.AnonymousClass0206;
import X.C01GW;
import X.C04UD;
import X.C09AE;
import X.C0A0U;
import X.C1022820ciu;
import X.C1183680guM;
import X.C1183860gue;
import X.C1185470gxF;
import X.C1185490gxH;
import X.C1185550gxN;
import X.C1185900gxw;
import X.C1188440h22;
import X.C1188470h25;
import X.C1188730h2V;
import X.C1188740h2W;
import X.C1188750h2X;
import X.C1188770h2Z;
import X.C1188810h2d;
import X.C1188910h2n;
import X.C1188950h2r;
import X.C1189060h32;
import X.C1195370hDD;
import X.C1205210hT5;
import X.C1205490hTX;
import X.C123100dR;
import X.C1386820mC0;
import X.C1554610qYd;
import X.C1697810uHb;
import X.C1EMR;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344009Gk;
import X.C280270Ayf;
import X.C452501pT;
import X.C698670Rar;
import X.C848030XOn;
import X.InterfaceC1197120hG2;
import X.InterfaceC665370Q7z;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.cache.PoiDetailDataCacheExp;
import com.ss.android.ugc.aweme.poi.preload.PoiAnchorPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS119S1200000_2;
import kotlin.jvm.internal.AwS58S2100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorMakerDelegate implements InterfaceC1197120hG2 {
    public static final boolean LLJJIII;
    public Aweme LLILLJJLI;
    public C1188440h22 LLILLL;
    public C1185490gxH LLILZ;
    public PoiAnchorExtra LLILZIL;
    public PoiDataStruct LLILZLL;
    public AnchorCommonStruct LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public final C01GW LL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(203));
    public final C1188910h2n LLJJI = new C1188910h2n(this);

    @Override // X.InterfaceC1197120hG2
    public final void LLZ() {
    }

    static {
        Keva keva = C1185900gxw.LIZ;
        boolean z = keva.getBoolean("clickPoiAnchorIsFirstLaunch", true);
        if (z) {
            keva.storeBoolean("clickPoiAnchorIsFirstLaunch", false);
        }
        LLJJIII = z;
    }

    @Override // X.InterfaceC1197120hG2
    public final String LIZLLL() {
        String str;
        PoiAnchorInfo poiAnchorInfo;
        String str2;
        PoiDataStruct poiDataStruct = this.LLILZLL;
        boolean z = false;
        if (poiDataStruct != null && poiDataStruct.isProductAnchor()) {
            z = true;
        }
        if (z) {
            PoiDataStruct poiDataStruct2 = this.LLILZLL;
            if (poiDataStruct2 != null && (poiAnchorInfo = poiDataStruct2.videoAnchor) != null && (str2 = poiAnchorInfo.title) != null && C123100dR.LIZ(str2)) {
                return str2;
            }
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                return anchorCommonStruct.getKeyword();
            }
        } else {
            PoiDataStruct poiDataStruct3 = this.LLILZLL;
            if (poiDataStruct3 != null && (str = poiDataStruct3.poiName) != null && C123100dR.LIZ(str)) {
                return str;
            }
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 != null) {
                return anchorCommonStruct2.getKeyword();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002d A[PHI: r1
      0x002d: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v4 java.lang.String) binds: [B:31:0x004e, B:20:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c A[PHI: r0
      0x004c: PHI (r0v4 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra) = 
      (r0v3 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra)
      (r0v6 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra)
     binds: [B:27:0x0040, B:29:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1197120hG2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIZ() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLILLJJLI
            r2 = 0
            if (r0 == 0) goto L13
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r0.getPoiDataStruct()
            if (r0 == 0) goto L13
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L13
            java.lang.String r1 = r0.suffix
            if (r1 != 0) goto L15
        L13:
            java.lang.String r1 = ""
        L15:
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 != 0) goto L52
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r3.LLILZLL
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.poi.PoiAddressInfo r0 = r0.addressInfo
            if (r0 == 0) goto L3e
            java.lang.String r1 = r0.cityName
            if (r1 == 0) goto L3e
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L3e
        L2d:
            int r0 = r1.length()
            if (r0 == 0) goto L51
            java.lang.String r0 = r3.LIZLLL()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L51
            return r1
        L3e:
            com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra r0 = r3.LLILZIL
            if (r0 != 0) goto L4c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLILLJJLI
            com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra r0 = X.C1188470h25.LIZ(r0)
            r3.LLILZIL = r0
            if (r0 == 0) goto L51
        L4c:
            java.lang.String r1 = r0.poiCityName
            if (r1 == 0) goto L51
            goto L2d
        L51:
            return r2
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate.LJJIZ():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[PHI: r0
      0x0044: PHI (r0v2 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra) = 
      (r0v1 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra)
      (r0v5 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra)
     binds: [B:14:0x0038, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[PHI: r0
      0x0074: PHI (r0v9 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra) = 
      (r0v8 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra)
      (r0v11 com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra)
     binds: [B:34:0x0068, B:36:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000f A[PHI: r0
      0x000f: PHI (r0v21 java.lang.Long) = (r0v3 java.lang.Long), (r0v23 java.lang.Long) binds: [B:18:0x0046, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1197120hG2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LLIL(int r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r7.LLILZLL
            r3 = 0
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.videoCount
            if (r0 == 0) goto L36
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L36
        Lf:
            long r5 = r0.longValue()
        L13:
            long r1 = (long) r8
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L4c
            android.content.res.Resources r1 = X.C1BWL.LIZJ()
            r0 = 2131829383(0x7f112287, float:1.9291734E38)
            java.lang.String r4 = r1.getString(r0)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r1 = X.C1843500y4a.LIZIZ(r5)
            r0 = 0
            r2[r0] = r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r0 = X.C786410Ut5.j4(r4, r0)
            return r0
        L36:
            com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra r0 = r7.LLILZIL
            if (r0 != 0) goto L44
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra r0 = X.C1188470h25.LIZ(r0)
            r7.LLILZIL = r0
            if (r0 == 0) goto L49
        L44:
            java.lang.Long r0 = r0.videoCount
            if (r0 == 0) goto L49
            goto Lf
        L49:
            r5 = 0
            goto L13
        L4c:
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r7.LLILZLL
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.poi.PoiAddressInfo r0 = r0.addressInfo
            if (r0 == 0) goto L66
            java.lang.String r1 = r0.cityName
            if (r1 == 0) goto L66
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L66
            r3 = r1
        L5f:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L77
            return r3
        L66:
            com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra r0 = r7.LLILZIL
            if (r0 != 0) goto L74
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra r0 = X.C1188470h25.LIZ(r0)
            r7.LLILZIL = r0
            if (r0 == 0) goto L5f
        L74:
            java.lang.String r3 = r0.poiCityName
            goto L5f
        L77:
            r0 = 2131836778(0x7f113f6a, float:1.9306732E38)
            java.lang.String r0 = X.C20642515q3.LJI(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate.LLIL(int):java.lang.String");
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLIZZ(Aweme aweme) {
        if (aweme != null) {
            C1188750h2X.LIZ.getClass();
            C1188750h2X.LIZ(aweme);
            String aid = aweme.getAid();
            if (C123100dR.LIZ(aid) && aid != null) {
                C1188750h2X.LIZIZ.remove(aid);
            }
        }
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLJJIJI(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol) {
        if (C1185470gxF.LIZJ() && C1185470gxF.LIZ()) {
            C1554610qYd.LIZLLL(interfaceC665370Q7z, FcpStandardPreloadProtocol.class, fcpStandardPreloadProtocol);
        }
    }

    @Override // X.InterfaceC1197120hG2
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> LLJJJJLIIL(Aweme aweme, String str) {
        String str2;
        String str3;
        if (C1185470gxF.LIZJ() && C1185470gxF.LIZ()) {
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct != null) {
                str2 = poiDataStruct.collectInfo;
            } else {
                str2 = null;
            }
            String strLJIIJJI = C1189060h32.LJIIJJI(str2, "local_service_key_category");
            if (strLJIIJJI == null) {
                strLJIIJJI = "";
            }
            PoiDataStruct poiDataStruct2 = aweme.getPoiDataStruct();
            if (poiDataStruct2 != null) {
                str3 = poiDataStruct2.poiId;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            boolean zContains = PoiDetailDataCacheExp.LIZ().industries.contains(strLJIIJJI);
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            C1185550gxN.LJ("preload_trigger", new C848030XOn(str, aid, strLJIIJJI, zContains));
            if (zContains) {
                synchronized (C1183680guM.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str3);
                    sbLIZ.append('_');
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append('_');
                    sbLIZ.append((int) (Math.random() * ((double) 10000)));
                    C1183680guM.LIZIZ.put(str3, new C1183860gue(C2188811AlT.LIZIZ(sbLIZ)));
                }
                new AwS58S2100000_18(aweme, strLJIIJJI, str3, 0);
                return C2097908Jt.LIZJ(new Pair(PoiAnchorPreloadTask.class, new AwS119S1200000_2(this, str, aweme, 5)));
            }
            new AwS58S2100000_18(aweme, strLJIIJJI, str3, 1);
        }
        return null;
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLIL(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol) {
        if (C1185470gxF.LIZJ() && C1185470gxF.LIZ()) {
            C1554610qYd.LIZJ(interfaceC665370Q7z, FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(fcpStandardPreloadProtocol));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    @Override // X.InterfaceC1197120hG2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZLLLI(com.ss.android.ugc.aweme.feed.model.Aweme r2, java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            r1 = this;
            r1.LLILLJJLI = r2
            X.0h24 r0 = X.C1188460h24.LIZ
            r0.getClass()
            X.0h22 r0 = X.C1188460h24.LJ(r2, r3, r4)
            r1.LLILLL = r0
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r2.getPoiDataStruct()
            r1.LLILZLL = r0
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = X.C1188460h24.LIZ(r2)
            r1.LLIZ = r0
            X.0h2V r0 = X.C1185490gxH.Companion
            r0.getClass()
            X.0gxH r0 = X.C1188730h2V.LJ(r2)
            r1.LLILZ = r0
            if (r5 == 0) goto L3d
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r1.LLILZLL
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.schema
            if (r0 != 0) goto L3a
        L32:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r1.LLIZ
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getSchema()
        L3a:
            r1.LLIZLLLIL = r0
            return
        L3d:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r1.LLIZ
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getSchema()
            goto L3a
        L46:
            r0 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate.LLLILZLLLI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):void");
    }

    public final void LIZ(Aweme aweme, String str, String str2, String str3, C2344009Gk c2344009Gk) {
        C1188950h2r c1188950h2r = C1188950h2r.LIZ;
        C1188440h22 c1188440h22 = this.LLILLL;
        C1185490gxH c1185490gxH = this.LLILZ;
        C1188910h2n c1188910h2n = this.LLJJI;
        c1188950h2r.getClass();
        C1188730h2V c1188730h2V = C1185490gxH.Companion;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", str2);
        c2344009Gk2.LJIIIIZZ("enter_method", str);
        C1189060h32.LJIIIIZZ(c2344009Gk2, str3);
        c2344009Gk2.LJII(c2344009Gk.LIZ);
        c1188730h2V.getClass();
        C1188730h2V.LIZ(c2344009Gk2, c1185490gxH);
        C1188950h2r.LJ(c2344009Gk2, c1188440h22);
        C1188950h2r.LJFF(c2344009Gk2, aweme);
        C1188950h2r.LIZJ(c2344009Gk2, aweme);
        C1188950h2r.LIZ(c2344009Gk2, aweme);
        c1188910h2n.invoke(c2344009Gk2);
        c2344009Gk2.LJII(((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ());
        C20684815ws.LJIILLIIL("multi_anchor_entrance_expand", c2344009Gk2.LIZ);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLFFI(int i, int i2, int i3, int i4, int i5, int i6) {
        String aid;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = i4;
        this.LLJILJILJ = i5;
        this.LLJILLL = i6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordTextLayoutParams (");
        sbLIZ.append(i);
        sbLIZ.append(',');
        sbLIZ.append(i2);
        sbLIZ.append(',');
        sbLIZ.append(i3);
        sbLIZ.append(',');
        sbLIZ.append(i4);
        sbLIZ.append(',');
        sbLIZ.append(i5);
        sbLIZ.append(',');
        sbLIZ.append(i6);
        sbLIZ.append("); awemeId=");
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LJJLL(Aweme aweme, String str, String str2, boolean z, String str3, C2344009Gk c2344009Gk, PageFinder pageFinder, Function1<? super C2344009Gk, Unit> function1) {
        Map<String, String> map;
        String aid;
        PoiAnchorExtra poiAnchorExtraLIZ;
        C1188750h2X.LIZ.getClass();
        AwemeRawAd pseudoAdData = null;
        if (C280270Ayf.LIZ() && (aid = aweme.getAid()) != null && (poiAnchorExtraLIZ = C1188470h25.LIZ(aweme)) != null) {
            C1188810h2d c1188810h2d = C1188750h2X.LJI;
            c1188810h2d.LIZ = 0;
            c1188810h2d.LIZIZ = System.currentTimeMillis();
            ConcurrentHashMap<String, C09AE> concurrentHashMap = C1188750h2X.LIZJ;
            C09AE c09ae = concurrentHashMap.get(aid);
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            concurrentHashMap.remove(aid);
            concurrentHashMap.put(aid, C23250099c.LIZLLL(C1188750h2X.LJ, null, null, new C1188740h2W(poiAnchorExtraLIZ, str2, aweme, aid, null), 3));
        }
        this.LLJJ = z;
        C1188950h2r c1188950h2r = C1188950h2r.LIZ;
        C1188440h22 c1188440h22 = this.LLILLL;
        C1185490gxH c1185490gxH = this.LLILZ;
        C1188910h2n c1188910h2n = this.LLJJI;
        c1188950h2r.getClass();
        C1188730h2V c1188730h2V = C1185490gxH.Companion;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", str2);
        c2344009Gk2.LJIIIIZZ("enter_method", str);
        C1189060h32.LJIIIIZZ(c2344009Gk2, str3);
        C1188950h2r.LJ(c2344009Gk2, c1188440h22);
        c1188730h2V.getClass();
        C1188730h2V.LIZ(c2344009Gk2, c1185490gxH);
        C1188950h2r.LIZ(c2344009Gk2, aweme);
        C1188950h2r.LIZLLL(c2344009Gk2, aweme);
        C1386820mC0.LIZ(c2344009Gk2);
        C1188950h2r.LJFF(c2344009Gk2, aweme);
        C1205210hT5.LIZ(null, c2344009Gk2, str2, "enter_multi_anchor_show");
        if (c2344009Gk != null) {
            map = c2344009Gk.LIZ;
        } else {
            map = null;
        }
        c2344009Gk2.LJII(map);
        C1188950h2r.LIZJ(c2344009Gk2, aweme);
        C1188950h2r.LJI(c2344009Gk2, str2);
        if (c1188910h2n != null) {
            c1188910h2n.invoke(c2344009Gk2);
        }
        c2344009Gk2.LJII(((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ());
        if (C04UD.LIZ()) {
            if (function1 != null) {
                function1.invoke(c2344009Gk2);
            }
        } else {
            C20684815ws.LJIILLIIL("multi_anchor_entrance_show", c2344009Gk2.LIZ);
            C698670Rar.LIZ.getClass();
            C698670Rar.LIZ(c2344009Gk2, aweme, str2, true);
        }
        if (!z) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo != null) {
                    pseudoAdData = commerceVideoAuthInfo.getPseudoAdData();
                }
            } else {
                pseudoAdData = awemeRawAd;
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", pseudoAdData);
            c1022820ciuLIZLLL.LIZJ("poi_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLJJJJ(Aweme aweme, String str, String str2, String str3, boolean z, boolean z2, String str4, C2344009Gk c2344009Gk, Function1<? super C2344009Gk, Unit> function1) {
        Map map;
        float f;
        boolean z3;
        boolean z4;
        String str5;
        C1188750h2X.LIZ.getClass();
        C1188750h2X.LJ();
        if (C280270Ayf.LIZ()) {
            C1188750h2X.LIZ(aweme);
            C1188810h2d c1188810h2d = C1188750h2X.LJI;
            c1188810h2d.getClass();
            PoiAnchorExtra poiAnchorExtraLIZ = C1188470h25.LIZ(aweme);
            if (poiAnchorExtraLIZ != null) {
                c1188810h2d.LIZ++;
                try {
                    str5 = poiAnchorExtraLIZ.ctrPred;
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1205490hTX.LIZ.LJ(C1EMR.FEED_ANCHOR_CTR_SCORE_PARSE_ERROR, e);
                }
                if (str5 != null) {
                    f = CastFloatProtector.parseFloat(str5);
                } else {
                    f = 0.0f;
                }
                if (f > ((Number) C0A0U.LIZ.getValue()).floatValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1195370hDD c1195370hDD = C1195370hDD.LIZ;
                if (c1188810h2d.LIZ > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - c1188810h2d.LIZIZ);
                c1195370hDD.getClass();
                c1195370hDD.LIZJ("ctr_predict_actual", new C1188770h2Z(f, iCurrentTimeMillis, str2, z3, z4));
            }
        }
        C1188950h2r c1188950h2r = C1188950h2r.LIZ;
        C1188440h22 c1188440h22 = this.LLILLL;
        C1185490gxH c1185490gxH = this.LLILZ;
        C1188910h2n c1188910h2n = this.LLJJI;
        c1188950h2r.getClass();
        C1188730h2V c1188730h2V = C1185490gxH.Companion;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_method", str);
        c2344009Gk2.LJIIIIZZ("enter_from", str2);
        c2344009Gk2.LIZJ(z2 ? 1 : 0, "expand");
        c2344009Gk2.LJIIIIZZ("comment_anchor_tab", str3);
        C1189060h32.LJIIIIZZ(c2344009Gk2, str4);
        C1188950h2r.LJ(c2344009Gk2, c1188440h22);
        c1188730h2V.getClass();
        C1188730h2V.LIZ(c2344009Gk2, c1185490gxH);
        C1188950h2r.LIZ(c2344009Gk2, aweme);
        C1188950h2r.LIZLLL(c2344009Gk2, aweme);
        C1386820mC0.LIZ(c2344009Gk2);
        c2344009Gk2.LJIIIIZZ("click_method", "click_anchor");
        if (c2344009Gk != null) {
            map = c2344009Gk.LIZ;
        } else {
            map = null;
        }
        c2344009Gk2.LJII(map);
        C1188950h2r.LIZJ(c2344009Gk2, aweme);
        C1188950h2r.LJFF(c2344009Gk2, aweme);
        C1205210hT5.LIZ(null, c2344009Gk2, str2, "enter_multi_anchor_click");
        C1188950h2r.LJI(c2344009Gk2, str2);
        if (c1188910h2n != null) {
            c1188910h2n.invoke(c2344009Gk2);
        }
        c2344009Gk2.LJII(((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZ());
        if (C04UD.LIZ()) {
            if (function1 != null) {
                function1.invoke(c2344009Gk2);
            }
        } else {
            C698670Rar.LIZ.getClass();
            C698670Rar.LIZ(c2344009Gk2, aweme, str2, false);
            C20684815ws.LJIILLIIL("multi_anchor_entrance_click", c2344009Gk2.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f  */
    @Override // X.InterfaceC1197120hG2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIIL(android.content.Context r27, android.view.View r28, com.ss.android.ugc.aweme.feed.model.Aweme r29, java.lang.String r30, java.lang.String r31, X.C2344009Gk r32, boolean r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, boolean r37, X.EnumC1188920h2o r38, java.lang.String r39, kotlin.jvm.functions.Function1<? super X.C2344009Gk, kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate.LLLLIIL(android.content.Context, android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, X.09Gk, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, X.0h2o, java.lang.String, kotlin.jvm.functions.Function1):void");
    }
}
