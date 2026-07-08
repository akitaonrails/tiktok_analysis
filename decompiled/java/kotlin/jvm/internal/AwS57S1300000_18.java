package kotlin.jvm.internal;

import X.AbstractC1207590hWv;
import X.C062P;
import X.C098200Yq;
import X.C09AY;
import X.C1175850ghj;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1184530gvj;
import X.C1184710gw1;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1188530h2B;
import X.C1189060h32;
import X.C1190430h5F;
import X.C1191160h6Q;
import X.C1191440h6s;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1207610hWx;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13IQ;
import X.C1558520qew;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19HL;
import X.C20248814Kw;
import X.C20489080x;
import X.C20642515q3;
import X.C20656615sK;
import X.C343970De7;
import X.EnumC1190240h4w;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207490hWl;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiDetailContentHeaderNewRegionalAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiDetailContentHeaderRegionalWithIntroAssemBase;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.experiment.FypLocationPopUpCertCheckOpt;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS57S1300000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) awS57S1300000_18.l1;
        String str = awS57S1300000_18.s0;
        assembler.EQ2(poiDetailContentHeaderBaseAssemV3, new AwS57S1300000_18((C1188530h2B) awS57S1300000_18.l3, poiDetailContentHeaderBaseAssemV3, (PoiListApi.PoiDetailResponse) awS57S1300000_18.l2, str, 3));
        assembler.RQ2((PoiDetailContentHeaderBaseAssemV3) awS57S1300000_18.l1, AFwS256S0000000_18.get$arr$(355));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        String initialPoiId;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String str2;
        String fromGroupId;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        C1184710gw1 c1184710gw1 = (C1184710gw1) obj;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        C1185410gx9 c1185410gx9 = (C1185410gx9) awS57S1300000_18.l1;
        if (c1185410gx9 != null) {
            initialPoiId = c1185410gx9.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        String str3 = "";
        if (initialPoiId == null) {
            initialPoiId = "";
        }
        C1185410gx9 c1185410gx92 = (C1185410gx9) awS57S1300000_18.l1;
        if (c1185410gx92 == null || (initialEnterFrom = c1185410gx92.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        C1185410gx9 c1185410gx93 = (C1185410gx9) awS57S1300000_18.l1;
        if (c1185410gx93 == null || (initialEnterMethod = c1185410gx93.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailFoodHeaderAssem) awS57S1300000_18.l2).Oo();
        if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
            str = "";
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailFoodHeaderAssem) awS57S1300000_18.l2).Oo();
        if (c1184460gvcOo2 == null || (c1184480gve = c1184460gvcOo2.LLILLL) == null || (str2 = c1184480gve.LLILLJJLI) == null) {
            str2 = "";
        }
        String str4 = awS57S1300000_18.s0;
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS57S1300000_18.l3).getCollectInfo();
        if (collectInfo == null) {
            collectInfo = "";
        }
        C1185410gx9 c1185410gx94 = (C1185410gx9) awS57S1300000_18.l1;
        if (c1185410gx94 != null && (fromGroupId = c1185410gx94.getFromGroupId()) != null) {
            str3 = fromGroupId;
        }
        C1191160h6Q.LJIJJLI(c1191160h6Q, initialPoiId, initialEnterFrom, initialEnterMethod, str, str2, null, "poi_detail", "header_no_reviews", str4, collectInfo, null, null, null, null, str3, C1558520qew.LJIIL((PoiDetailFoodHeaderAssem) awS57S1300000_18.l2), null, ((PoiDetailFoodHeaderAssem) awS57S1300000_18.l2).Zo(), c1184710gw1, 80896);
        C1191160h6Q.LJJIIJ(((PoiDetailFoodHeaderAssem) awS57S1300000_18.l2).Zo(), C1558520qew.LJIIL((PoiDetailFoodHeaderAssem) awS57S1300000_18.l2), c1184710gw1, "poi_detail_general_header");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) obj, C343970De7.LIZ);
        Context context = (Context) awS57S1300000_18.l1;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) awS57S1300000_18.l2;
        String str2 = awS57S1300000_18.s0;
        PageFinder pageFinder = (PageFinder) awS57S1300000_18.l3;
        try {
            C1175850ghj.LIZ.getClass();
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJI(C20642515q3.LIZJ(R.color.f570cs));
                c1389890mGx.LJIIIZ(R.string.fws);
                c1389890mGx.LJIIJJI();
            }
            C1175850ghj.LIZ(context, poiDetailResponse);
            C1185430gxB.LIZ.getClass();
            C1185430gxB.LJIILLIIL(pageFinder, "poi_map", "click_copy_address_button", str2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        PoiDetailInfoAssem poiDetailInfoAssem = (PoiDetailInfoAssem) awS57S1300000_18.l1;
        assembler.EQ2(poiDetailInfoAssem, new AwS102S1200000_18(poiDetailInfoAssem, (PoiListApi.PoiDetailResponse) awS57S1300000_18.l2, awS57S1300000_18.s0, 18));
        PoiDetailInfoAssem poiDetailInfoAssem2 = (PoiDetailInfoAssem) awS57S1300000_18.l1;
        assembler.QQ2(poiDetailInfoAssem2, new AwS384S0200000_18((C13IQ) awS57S1300000_18.l3, (C13IQ<? extends PoiDetailHeaderAssem>) poiDetailInfoAssem2, (PoiDetailInfoAssem) 274));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = AFwS206S0000000_18.get$arr$(826);
        C20248814Kw.LIZJ(c20248814Kw, false, false, 0.01f, 0, null, null, null, 112);
        c20248814Kw.LIZIZ(new AwS97S1300000_18((C1190430h5F) awS57S1300000_18.l1, awS57S1300000_18.s0, (InterfaceC665370Q7z) awS57S1300000_18.l2, (PageFinder) awS57S1300000_18.l3, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        float fDoubleValue;
        int iLongValue;
        int value;
        C1184710gw1 c1184710gw1 = (C1184710gw1) obj;
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String str = awS57S1300000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String collectInfo = ((PoiListApi.PoiDetailResponse) awS57S1300000_18.l1).getCollectInfo();
        if (collectInfo != null) {
            str2 = collectInfo;
        }
        Double d = ((PoiReviewsApi.PoiReviewSummaryModel) awS57S1300000_18.l2).score;
        if (d != null) {
            fDoubleValue = (float) d.doubleValue();
        } else {
            fDoubleValue = 0.0f;
        }
        Long l = ((PoiReviewsApi.PoiReviewSummaryModel) awS57S1300000_18.l2).totalCount;
        if (l != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        Integer num = ((PoiReviewsApi.PoiReviewSummaryModel) awS57S1300000_18.l2).source;
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC1190240h4w.PoiReviewSource_Unknown.getValue();
        }
        Integer numValueOf = Integer.valueOf(value);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailFoodHeaderAssem) awS57S1300000_18.l3);
        PageFinder pageFinderZo = ((PoiDetailFoodHeaderAssem) awS57S1300000_18.l3).Zo();
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIJL(str, str2, fDoubleValue, iLongValue, numValueOf, interfaceC665370Q7zLJIIL, pageFinderZo, c1184710gw1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        C062P c062p = (C062P) obj;
        String name = ((PoiListApi.PoiDetailResponse) awS57S1300000_18.l1).getName();
        String address = ((PoiListApi.PoiDetailResponse) awS57S1300000_18.l1).getAddress();
        PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) awS57S1300000_18.l2;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) awS57S1300000_18.l1;
        poiDetailContentHeaderBaseAssemV3.getClass();
        c062p.LIZ = new C1184530gvj(awS57S1300000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS57S1300000_18.l1).isCollected()), 0, name, address, PoiDetailContentHeaderBaseAssemV3.No(poiDetailResponse), (C1188530h2B) awS57S1300000_18.l3, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS57S1300000_18.l1).getDataFromAnchor(), (boolean) (0 == true ? 1 : 0), 1412);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiDetailContentHeaderNewRegionalAssem) awS57S1300000_18.l1, new AwS102S1200000_18(awS57S1300000_18.s0, (PoiListApi.PoiDetailResponse) awS57S1300000_18.l2, (C1188530h2B) awS57S1300000_18.l3, 5));
        assembler.RQ2((PoiDetailContentHeaderNewRegionalAssem) awS57S1300000_18.l1, AFwS256S0000000_18.get$arr$(832));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiDetailContentHeaderNewRegionalAssem) awS57S1300000_18.l1, new AwS102S1200000_18(awS57S1300000_18.s0, (PoiListApi.PoiDetailResponse) awS57S1300000_18.l2, (C1188530h2B) awS57S1300000_18.l3, 6));
        assembler.RQ2((PoiDetailContentHeaderNewRegionalAssem) awS57S1300000_18.l1, AFwS256S0000000_18.get$arr$(834));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiDetailContentHeaderRegionalWithIntroAssemBase) awS57S1300000_18.l1, new AwS102S1200000_18(awS57S1300000_18.s0, (PoiListApi.PoiDetailResponse) awS57S1300000_18.l2, (C1188530h2B) awS57S1300000_18.l3, 7));
        PoiDetailContentHeaderRegionalWithIntroAssemBase poiDetailContentHeaderRegionalWithIntroAssemBase = (PoiDetailContentHeaderRegionalWithIntroAssemBase) awS57S1300000_18.l1;
        assembler.RQ2(poiDetailContentHeaderRegionalWithIntroAssemBase, new AwS597S0100000_18(poiDetailContentHeaderRegionalWithIntroAssemBase, 654));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((PoiDetailContentHeaderRegionalWithIntroAssemBase) awS57S1300000_18.l1, new AwS102S1200000_18(awS57S1300000_18.s0, (PoiListApi.PoiDetailResponse) awS57S1300000_18.l2, (C1188530h2B) awS57S1300000_18.l3, 8));
        assembler.RQ2((PoiDetailContentHeaderRegionalWithIntroAssemBase) awS57S1300000_18.l1, AFwS256S0000000_18.get$arr$(836));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS98S1000000_13(awS57S1300000_18.s0, 13);
        c20248814Kw.LIZIZ(new AwS296S0300000_18((C19HL) awS57S1300000_18.l1, (C1191440h6s) awS57S1300000_18.l2, (PageFinder) awS57S1300000_18.l3, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS57S1300000_18 awS57S1300000_18, Object obj) {
        final AbstractC1207590hWv abstractC1207590hWv = (AbstractC1207590hWv) awS57S1300000_18.l1;
        String str = awS57S1300000_18.s0;
        C19EG c19eg = (C19EG) awS57S1300000_18.l2;
        C1207520hWo c1207520hWo = (C1207520hWo) awS57S1300000_18.l3;
        abstractC1207590hWv.getClass();
        final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((C20656615sK) obj, 2622);
        TokenCert tokenCertLIZ = C1207610hWx.LIZ();
        if (FypLocationPopUpCertCheckOpt.INSTANCE.enable() || AbstractC1207590hWv.LIZ(c19eg, tokenCertLIZ)) {
            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
            InterfaceC1207030hW1 interfaceC1207030hW1 = new InterfaceC1207030hW1() { // from class: X.0hWz
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    awS562S0100000_18.invoke();
                    abstractC1207590hWv.getClass();
                    AbstractC1207590hWv.LIZJ(0);
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                    awS562S0100000_18.invoke();
                    abstractC1207590hWv.getClass();
                    AbstractC1207590hWv.LIZJ(i);
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str2) {
                    awS562S0100000_18.invoke();
                    abstractC1207590hWv.getClass();
                    AbstractC1207590hWv.LIZJ(i);
                }
            };
            c1207450hWh.getClass();
            ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJIJJ("poi", "fyp_interaction", tokenCertLIZ, c19eg, c1207520hWo, interfaceC1207030hW1, null);
            C20489080x.LIZ.getClass();
            C20489080x.LJIIIZ(str);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS57S1300000_18(X.C1188530h2B r3, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3 r4, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            if (r7 == 0) goto L12
            r1 = r2
            r1.s0 = r6
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r6
            r1.l2 = r5
            r1.l3 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS57S1300000_18.<init>(X.0h2B, com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(C1185410gx9 c1185410gx9, PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1185410gx9;
        this.l2 = poiDetailFoodHeaderAssem;
        this.s0 = str;
        this.l3 = poiDetailResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(C1190430h5F c1190430h5F, String str, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1190430h5F;
        this.s0 = str;
        this.l2 = interfaceC665370Q7z;
        this.l3 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(AbstractC1207590hWv abstractC1207590hWv, String str, C19EG c19eg, C1207520hWo c1207520hWo, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractC1207590hWv;
        this.s0 = str;
        this.l2 = c19eg;
        this.l3 = c1207520hWo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(Context context, PoiListApi.PoiDetailResponse poiDetailResponse, String str, PageFinder pageFinder, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.l2 = poiDetailResponse;
        this.s0 = str;
        this.l3 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(PoiDetailInfoAssem poiDetailInfoAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, C19719912Dl c19719912Dl, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiDetailInfoAssem;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = c19719912Dl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(PoiDetailContentHeaderNewRegionalAssem poiDetailContentHeaderNewRegionalAssem, String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1188530h2B c1188530h2B, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiDetailContentHeaderNewRegionalAssem;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = c1188530h2B;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(PoiDetailContentHeaderRegionalWithIntroAssemBase poiDetailContentHeaderRegionalWithIntroAssemBase, String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1188530h2B c1188530h2B, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiDetailContentHeaderRegionalWithIntroAssemBase;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = c1188530h2B;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(String str, C19HL c19hl, C1191440h6s c1191440h6s, PageFinder pageFinder, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19hl;
        this.l2 = c1191440h6s;
        this.l3 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1300000_18(String str, PoiListApi.PoiDetailResponse poiDetailResponse, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiDetailResponse;
        this.l2 = poiReviewSummaryModel;
        this.l3 = poiDetailFoodHeaderAssem;
    }
}
