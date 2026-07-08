package com.ss.android.ugc.aweme.multi.maker;

import X.AbstractC1066890drz;
import X.C09CT;
import X.C0X9S;
import X.C1024380clQ;
import X.C1067020dsC;
import X.C1067240dsY;
import X.C1067260dsa;
import X.C1067310dsf;
import X.C1120604Zw;
import X.C1121904a9;
import X.C123100dR;
import X.C13BV;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1687430u0r;
import X.C1741890vQh;
import X.C19724912Fj;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2371409Qy;
import X.C712520RxC;
import X.C743880TFy;
import X.C786410Ut5;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC1430380nKG;
import X.EnumC993060bwu;
import X.InterfaceC1050330dRH;
import X.InterfaceC1393560mMs;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501310pAf;
import X.InterfaceC1501350pAj;
import X.InterfaceC2174708fZ;
import X.InterfaceC705550Rlx;
import Y.ARunnableS2S1110000_13;
import android.app.Dialog;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spark.bullet.IBulletService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class GamingAnchorMaker extends AbstractC1066890drz {
    public boolean LLJ;
    public final C1067260dsa LLJI = new C1067260dsa();
    public final AttributionUtil LLJIJIL = new AttributionUtil();
    public AnchorExtra LLJILJIL;

    public static final class AnchorExtra {

        @C09CT("anchor_control")
        public final int anchorControl;

        @C09CT("is_schema_lynx")
        public final boolean isSchemaLynx = true;

        @C09CT("gecko_channel")
        public final ArrayList<String> geckoChannel = new ArrayList<>();

        @C09CT("game_id")
        public final String gameId = "";

        @C09CT("game_name")
        public final String gameName = "";

        @C09CT("android_pkg_name")
        public final String androidPkgName = "";

        @C09CT("after_sale_anchor")
        public final AfterSaleAnchor afterSaleAnchor = new AfterSaleAnchor();

        @C09CT("attribution_related")
        public final AttributionRelated attributionRelated = new AttributionRelated();

        @C09CT("global_game_id")
        public final String globalGameId = "";

        @C09CT("upload_params")
        public final HashMap<String, String> uploadParams = new HashMap<>();

        @C09CT("fe_preload_data")
        public final String fePreloadData = "";

        public static final class AfterSaleAnchor {

            @C09CT("schema")
            public final String schema = "";
        }

        public static final class AttributionRelated {

            @C09CT("attribution_link_type")
            public final int linkType;

            @C09CT("adjust_impression_android")
            public final String adjustImpression = "";

            @C09CT("adjust_click")
            public final String adjustClick = "";

            @C09CT("adjust_click_to_landing_page")
            public final String adjustClickToLandingPage = "";

            @C09CT("appsflyer_impression_android")
            public final String appsflyerImpression = "";

            @C09CT("appsflyer_click")
            public final String appsflyerClick = "";

            @C09CT("appsflyer_click_to_landing_page")
            public final String appsflyerClickToLandingPage = "";
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class AttributionUtil {
        public static final /* synthetic */ int LJ = 0;
        public boolean LIZ;
        public boolean LIZIZ;
        public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
        public ARunnableS2S1110000_13 LIZLLL;

        public interface AttributionApi {
            @InterfaceC1501160pAQ
            @InterfaceC1501310pAf({"x-tt-dataflow-id: 671088641"})
            C0X9S<String> monitor(@InterfaceC2174708fZ String str);

            @InterfaceC1501160pAQ
            @InterfaceC1501310pAf({"x-tt-dataflow-id: 671088641"})
            C0X9S<String> monitorWithHeader(@InterfaceC2174708fZ String str, @InterfaceC1501350pAj("User-Agent") String str2);
        }

        public static String LIZ() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Mozilla/5.0 (Linux; Android ");
            sbLIZ.append(Build.VERSION.RELEASE);
            sbLIZ.append("; ");
            sbLIZ.append(Build.MODEL);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final AnchorExtra LJJIJIL() {
        if (this.LLJILJIL == null) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            AnchorExtra anchorExtra = null;
            String extra = anchorCommonStruct != null ? anchorCommonStruct.getExtra() : null;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, extra, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<AnchorExtra>() { // from class: X.0dsb
                }.getType() : C2371409Qy.LIZJ(C13LE.LJ(AnchorExtra.class)));
                if (!(objFromJson instanceof AnchorExtra)) {
                    objFromJson = null;
                }
                anchorExtra = (AnchorExtra) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLJILJIL = anchorExtra;
        }
        return this.LLJILJIL;
    }

    public final boolean LJJLIIIJJI() {
        n nVarLJIILIIL;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        Object obj = null;
        String extra = anchorCommonStruct != null ? anchorCommonStruct.getExtra() : null;
        if (extra == null || extra.length() == 0) {
            return false;
        }
        p pVar = new p();
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        k kVar = GsonProtectorUtils.parse(pVar, anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null);
        k kVarLJJIIZ = (kVar == null || (nVarLJIILIIL = kVar.LJIILIIL()) == null) ? null : nVarLJIILIIL.LJJIIZ("is_schema_lynx");
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVarLJJIIZ, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<Boolean>() { // from class: X.0dsc
            }.getType() : C2371409Qy.LIZJ(C13LE.LJ(Boolean.class)));
            if (!(objFromJson instanceof Boolean)) {
                objFromJson = null;
            }
            obj = objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Intrinsics.LJFF(obj, Boolean.TRUE);
    }

    public final boolean LJJLIIIJJIZ() {
        C1067020dsC c1067020dsC = C1067020dsC.LIZ;
        List<AnchorCommonStruct> anchors = LJIIZILJ().getAnchors();
        if (anchors == null) {
            anchors = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(anchors);
        c1067020dsC.getClass();
        return C1067020dsC.LIZ(arrayList).size() == 1;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new GamingAnchorMaker();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.TIKTOK_GAME.getTYPE();
    }

    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        return LJJLIIIJJI();
    }

    public final String LJJIJIIJI() {
        if (LJJLIIIJJIZ()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        C1067020dsC c1067020dsC = C1067020dsC.LIZ;
        List<AnchorCommonStruct> anchors = LJIIZILJ().getAnchors();
        if (anchors == null) {
            anchors = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(anchors);
        c1067020dsC.getClass();
        ArrayList arrayListLIZ = C1067020dsC.LIZ(arrayList);
        return (arrayListLIZ.size() < 1 || ((AnchorCommonStruct) ListProtector.get(arrayListLIZ, 0)).getType() != EnumC1430380nKG.TIKTOK_GAME.getTYPE()) ? "2" : "1";
    }

    public final String LJJIL() {
        AnchorExtra anchorExtraLJJIJIL = LJJIJIL();
        if (anchorExtraLJJIJIL == null) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                return anchorCommonStruct.getSchema();
            }
            return null;
        }
        int i = anchorExtraLJJIJIL.anchorControl;
        if (i == 1) {
            C844470XAv.LIZ.getClass();
            return C743880TFy.LIZ(C844470XAv.LIZ(), anchorExtraLJJIJIL.androidPkgName) ? anchorExtraLJJIJIL.afterSaleAnchor.schema : LJJIJL(anchorExtraLJJIJIL);
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                return LJJIJL(anchorExtraLJJIJIL);
            }
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 != null) {
                return anchorCommonStruct2.getSchema();
            }
            return null;
        }
        C844470XAv.LIZ.getClass();
        if (C743880TFy.LIZ(C844470XAv.LIZ(), anchorExtraLJJIJIL.androidPkgName)) {
            return anchorExtraLJJIJIL.afterSaleAnchor.schema;
        }
        AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
        if (anchorCommonStruct3 != null) {
            return anchorCommonStruct3.getSchema();
        }
        return null;
    }

    public final void LJJLIIIJLJLI() {
        Iterable iterable;
        Type type;
        n nVarLJIILIIL;
        if (LJJLIIIJJI()) {
            p pVar = new p();
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            k kVar = GsonProtectorUtils.parse(pVar, anchorCommonStruct != null ? anchorCommonStruct.getExtra() : null);
            k kVarLJJIIZ = (kVar == null || (nVarLJIILIIL = kVar.LJIILIIL()) == null) ? null : nVarLJIILIIL.LJJIIZ("gecko_channel");
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                    type = new TypeToken<List<? extends String>>() { // from class: X.0dsZ
                    }.getType();
                } else {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII)));
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVarLJJIIZ, type);
                if (!(objFromJson instanceof List)) {
                    objFromJson = null;
                }
                iterable = (Iterable) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                iterable = null;
            }
            ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).G0();
            C1024380clQ.LJIILJJIL(null, iterable != null ? C1687430u0r.LIZ(iterable) : null);
        }
    }

    public final boolean LJJLIIIJLLLLLLLZ() {
        AnchorExtra.AttributionRelated attributionRelated;
        AnchorExtra anchorExtraLJJIJIL = LJJIJIL();
        return (anchorExtraLJJIJIL == null || (attributionRelated = anchorExtraLJJIJIL.attributionRelated) == null || 3 != attributionRelated.linkType) ? false : true;
    }

    public static String LJJIJL(AnchorExtra anchorExtra) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://google_play?package_name=");
        sbLIZ.append(anchorExtra.androidPkgName);
        return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon().appendQueryParameter("to_page", "store").build().toString();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        LJJIIJ(c2344009Gk);
        if (!LJJLIIIJJIZ()) {
            LJJLIIIJL("mp_click", LJJIJIIJI(), "item_play");
        }
    }

    public final String LJJIJIIJIL(String str) {
        String id;
        String str2;
        n nVar = new n();
        try {
            nVar.LJJIIJ("enter_from", LJIJJLI());
            nVar.LJJIIJ("from_source", str);
            nVar.LJJIIJ("from_group_id", LJIIZILJ().getAid());
            nVar.LJJIIJ("from_author_id", AwemeExtKt.getAuthorUid(LJIIZILJ()));
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                id = anchorCommonStruct.getId();
            } else {
                id = null;
            }
            nVar.LJJIIJ("scene_id", id);
            if (LJJLIIIJJIZ()) {
                str2 = "item_play";
            } else {
                str2 = "anchor_list";
            }
            nVar.LJJIIJ("position", str2);
            nVar.LJJIIJ("anchor_type", LJJIJIIJI());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return nVar.toString();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        AttributionUtil attributionUtil = this.LLJIJIL;
        ARunnableS2S1110000_13 aRunnableS2S1110000_13 = attributionUtil.LIZLLL;
        if (aRunnableS2S1110000_13 != null) {
            attributionUtil.LIZJ.removeCallbacks(aRunnableS2S1110000_13);
        }
        attributionUtil.LIZLLL = null;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C1067310dsf c1067310dsf = new C1067310dsf(null);
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(c1067310dsf);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        this.LLJ = true;
        LJJLIIIJLJLI();
        super.p1(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String str;
        String str2;
        AnchorExtra.AfterSaleAnchor afterSaleAnchor;
        LJJII(c2344009Gk, true, true);
        if (!this.LLJ) {
            LJJLIIIJLJLI();
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        AnchorExtra anchorExtraLJJIJIL = LJJIJIL();
        String str3 = null;
        if (anchorExtraLJJIJIL != null) {
            str = anchorExtraLJJIJIL.fePreloadData;
        } else {
            str = null;
        }
        C1067310dsf c1067310dsf = new C1067310dsf(str);
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(c1067310dsf);
        AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(this, c2344009Gk, 32);
        String strLJJIL = LJJIL();
        if (strLJJIL != null && u.LJJIIJZLJL(strLJJIL, "aweme://google_play?package_name=", false)) {
            AnchorExtra anchorExtraLJJIJIL2 = LJJIJIL();
            if (anchorExtraLJJIJIL2 != null && anchorExtraLJJIJIL2.anchorControl == 3) {
                AnchorExtra anchorExtra = this.LLJILJIL;
                if (anchorExtra != null && (afterSaleAnchor = anchorExtra.afterSaleAnchor) != null) {
                    str3 = afterSaleAnchor.schema;
                }
                if (C123100dR.LIZ(str3)) {
                    ((IBulletService) ServiceManager.get().getService(IBulletService.class)).LIZ(LJIILJJIL(), UriProtector.parse(str3).buildUpon().appendQueryParameter("extra", LJJIJIIJIL("store")).build().toString());
                }
            }
            C19724912Fj.LIZLLL().LJII(strLJJIL);
            AttributionUtil attributionUtil = this.LLJIJIL;
            String strLIZ = C1067240dsY.LIZ(LJJIJIL(), EnumC993060bwu.TYPE_CLICK, LJIJJLI());
            boolean zLJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
            if (!attributionUtil.LIZIZ) {
                attributionUtil.LIZIZ = true;
                if (strLIZ != null && strLIZ.length() != 0) {
                    C823050WQl.LIZLLL().submit(new ARunnableS2S1110000_13(attributionUtil, strLIZ, zLJJLIIIJLLLLLLLZ, 1));
                }
            }
        } else {
            awS382S0200000_16.invoke(strLJJIL);
            AttributionUtil attributionUtil2 = this.LLJIJIL;
            String strLIZ2 = C1067240dsY.LIZ(LJJIJIL(), EnumC993060bwu.TYPE_CLICK_LANDING_PAGE, LJIJJLI());
            boolean zLJJLIIIJLLLLLLLZ2 = LJJLIIIJLLLLLLLZ();
            if (!attributionUtil2.LIZIZ) {
                attributionUtil2.LIZIZ = true;
                if (strLIZ2 != null && strLIZ2.length() != 0) {
                    C823050WQl.LIZLLL().submit(new ARunnableS2S1110000_13(attributionUtil2, strLIZ2, zLJJLIIIJLLLLLLLZ2, 1));
                }
            }
        }
        String strLJJIJIIJI = LJJIJIIJI();
        if (LJJLIIIJJIZ()) {
            str2 = "item_play";
        } else {
            str2 = "anchor_list";
        }
        LJJLIIIJL("mp_click", strLJJIJIIJI, str2);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJIL(C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1050330dRH interfaceC1050330dRH) {
        C1067260dsa c1067260dsa = this.LLJI;
        c1067260dsa.getClass();
        c1067260dsa.LIZ = new HashMap<>();
        c1067260dsa.LIZIZ = new HashMap<>();
        LJJLIIIJL("mp_show", LJJIJIIJI(), "item_play");
        if (!this.LLJ) {
            LJJLIIIJLJLI();
        }
        if (LJJLIIIJJIZ()) {
            AttributionUtil attributionUtil = this.LLJIJIL;
            String strLIZ = C1067240dsY.LIZ(LJJIJIL(), EnumC993060bwu.TYPE_IMPRESSION, LJIJJLI());
            boolean zLJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
            if (attributionUtil.LIZLLL == null) {
                ARunnableS2S1110000_13 aRunnableS2S1110000_13 = new ARunnableS2S1110000_13(attributionUtil, strLIZ, zLJJLIIIJLLLLLLLZ, 0);
                attributionUtil.LIZLLL = aRunnableS2S1110000_13;
                C786410Ut5.LJLIIL(3000L, attributionUtil.LIZJ, aRunnableS2S1110000_13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119 A[LOOP:0: B:53:0x0113->B:55:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJL(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker.LJJLIIIJL(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLIIL(C712520RxC c712520RxC, Dialog dialog, boolean z, boolean z2, boolean z3) {
        LJJLIIIJL("mp_show", LJJIJIIJI(), "anchor_list");
        AttributionUtil attributionUtil = this.LLJIJIL;
        String strLIZ = C1067240dsY.LIZ(LJJIJIL(), EnumC993060bwu.TYPE_IMPRESSION, LJIJJLI());
        boolean zLJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (!attributionUtil.LIZ) {
            attributionUtil.LIZ = true;
            if (strLIZ != null && strLIZ.length() != 0) {
                C823050WQl.LIZLLL().submit(new ARunnableS2S1110000_13(attributionUtil, strLIZ, zLJJLIIIJLLLLLLLZ, 1));
            }
        }
    }
}
