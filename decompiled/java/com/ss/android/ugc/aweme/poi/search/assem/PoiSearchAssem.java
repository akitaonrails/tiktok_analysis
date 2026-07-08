package com.ss.android.ugc.aweme.poi.search.assem;

import X.AbstractC1201400hMw;
import X.AbstractC1202400hOY;
import X.AbstractC21673619ry;
import X.AbstractC2361009My;
import X.AbstractC738140SxQ;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C036E;
import X.C06MM;
import X.C09AE;
import X.C09JN;
import X.C0C64;
import X.C0CZT;
import X.C0HW7;
import X.C0KFD;
import X.C0NBH;
import X.C0PEM;
import X.C1155340gAe;
import X.C1189060h32;
import X.C1192290h8F;
import X.C1194750hCD;
import X.C1196320hEk;
import X.C1197440hGY;
import X.C1197490hGd;
import X.C1197500hGe;
import X.C1197510hGf;
import X.C1197520hGg;
import X.C1197580hGm;
import X.C1197600hGo;
import X.C1197720hH0;
import X.C1197730hH1;
import X.C1197760hH4;
import X.C1197820hHA;
import X.C1197840hHC;
import X.C1198490hIF;
import X.C1198520hII;
import X.C1198560hIM;
import X.C1198600hIQ;
import X.C1198610hIR;
import X.C1198630hIT;
import X.C1198650hIV;
import X.C1198670hIX;
import X.C1198710hIb;
import X.C1198770hIh;
import X.C1198810hIl;
import X.C1198830hIn;
import X.C1198850hIp;
import X.C1198860hIq;
import X.C1198870hIr;
import X.C1198890hIt;
import X.C1198910hIv;
import X.C1198920hIw;
import X.C1198940hIy;
import X.C1199450hJn;
import X.C1199460hJo;
import X.C1200940hMC;
import X.C1205490hTX;
import X.C1207340hWW;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1209050hZH;
import X.C1220000hqw;
import X.C1252710ihh;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1499850p8J;
import X.C15438062q;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1626990sRN;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1723500ux2;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C1893080zMY;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C19EG;
import X.C1EMR;
import X.C20509915Nh;
import X.C20603715jn;
import X.C2084808Es;
import X.C21673919s1;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2365509Or;
import X.C2371409Qy;
import X.C2508409sI;
import X.C262100zr;
import X.C297500BlM;
import X.C297510BlN;
import X.C298190BmT;
import X.C300190Bph;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C431260Gvc;
import X.C444540Hbw;
import X.C444550Hbx;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444630Hc5;
import X.C444640Hc6;
import X.C444690HcB;
import X.C444940Hca;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C686930Qx1;
import X.C723580SZw;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.DialogC1389620mGW;
import X.EnumC1197740hH2;
import X.EnumC1198660hIW;
import X.EnumC1198680hIY;
import X.EnumC1198780hIi;
import X.EnumC1205470hTV;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1197900hHI;
import X.InterfaceC1197930hHL;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207170hWF;
import X.InterfaceC1891350zJl;
import X.InterfaceC21676019sM;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687820QyS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS118S0100000_18;
import Y.ARunnableS37S0110000_18;
import Y.ARunnableS87S0200000_18;
import Y.AfS187S0100000_18;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.google.gson.s;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityRequestBody;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityViewModel;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.creation.PoiCreateEntranceAbility;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM;
import com.ss.android.ugc.aweme.poi.creator.vm.PoiSearchCreatorVM;
import com.ss.android.ugc.aweme.poi.experiment.AddLocationGpsAuthGuideExperiment;
import com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig;
import com.ss.android.ugc.aweme.poi.search.IPoiSearchAbility;
import com.ss.android.ugc.aweme.poi.search.PoiIpRecommendTipCell;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem;
import com.ss.android.ugc.aweme.poi.search.item.PoiSearchCell;
import com.ss.android.ugc.aweme.poi.search.item.PoiSearchCellLeft;
import com.ss.android.ugc.aweme.poi.search.item.PoiSearchCellRight;
import com.ss.android.ugc.aweme.poi.search.item.PoiSearchCreatorCell;
import com.ss.android.ugc.aweme.poi.search.ui.PoiDetailPublishLoadMoreFooterCell;
import com.ss.android.ugc.aweme.poi.search.ui.PoiPublishLoadMoreFooterCell;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchAssem extends UIListContentAssem<PoiSearchVM> implements InterfaceC1197930hHL, InterfaceC1141530foN {
    public static final C1198870hIr LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public View LLIZLLLIL;
    public C1749280vcc LLJ;
    public List<Boolean> LLJIJIL;
    public List<Boolean> LLJILJIL;
    public TuxTextView LLJILJILJ;
    public DialogC1389620mGW LLJILLL;
    public View LLJJI;
    public final C736950SvV LLJJIII;
    public final boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public C20509915Nh LLJJJJLIIL;
    public volatile String LLJJL;
    public C1198490hIF LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public float LLJLIL;
    public C09AE LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C736950SvV LLJLLIL;
    public final C736950SvV LLJLLL;
    public final AssemVMLazy LLJZ;
    public C1197580hGm LLJZIJLIL;
    public C1194750hCD LLL;
    public List<String> LLLF;
    public C1198710hIb LLLFF;
    public final C01GW LLLFFI;
    public final List<String> LLJI = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIZILJ();
    public final C1559260qg8 LLJJ = new C1559260qg8(new C723580SZw(this, C1155340gAe.class, "PoiSearchHierarchyData"), checkSupervisorPrepared());

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0hIr] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiSearchAssem.class, "poiActivityVm", "getPoiActivityVm()Lcom/ss/android/ugc/aweme/poi/activity/PoiActivityViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFZ = new Object() { // from class: X.0hIr
        };
    }

    private final void Aq() {
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hIm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197490hGd) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 173), 6);
    }

    private final void vq() {
        PoiActivityViewModel poiActivityViewModelLp = lp();
        poiActivityViewModelLp.getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "poi_create_activity_add_location_banner", false, false)) {
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            try {
                Object objFromJson = GsonProtectorUtils.fromJson(C2365509Or.LIZ(), C2365509Or.LJ(new PoiActivityRequestBody(Collections.singletonList("activity"))), C2371409Qy.LIZJ(C13LE.LJII(n.class)));
                if (!(objFromJson instanceof n)) {
                    objFromJson = null;
                }
                n nVar = (n) objFromJson;
                if (nVar != null) {
                    C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
                    c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
                    c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
                    c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
                    c1499850p8JCreateBuilder.LJIIIZ = 0;
                    PoiActivityApi poiActivityApi = (PoiActivityApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PoiActivityApi.class);
                    PoiActivityApi.LIZ.getClass();
                    C844470XAv.LIZ.getClass();
                    C0NBH.LIZ(poiActivityApi.LIZ("application/json", C2084808Es.LIZ(String.valueOf(C844470XAv.LJIIJ) + PoiEnableExperiment.LIZIZ() + jCurrentTimeMillis), String.valueOf(C844470XAv.LJIIJ), nVar)).LJJLL(new AfS187S0100000_18(poiActivityViewModelLp, 36), new C09JN() { // from class: X.00Ok
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("PoiActivityViewModel@6aee.fetchAddLocationActivityInfo$1$res$2");
                            C1C7U.LIZIZ("PoiActivityViewModel@6aee.fetchAddLocationActivityInfo$1$res$2");
                        }
                    });
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0hCC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155530gAx) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 171), 6);
    }

    private final void wq() {
        PoiSearchVM poiSearchVMJo = Jo();
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        poiSearchVMJo.asyncSubscribe(new C2217381BqS() { // from class: X.0hHW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1197490hGd c1197490hGd = (C1197490hGd) obj;
                c1197490hGd.getClass();
                return C627260Oiy.LIZJ(c1197490hGd);
            }
        }, this, c1770850wBP, AFwS256S0000000_18.get$arr$(670), new AwS562S0100000_18(this, 2023), new AwS597S0100000_18(this, 511));
    }

    private final void xq() {
        PoiSearchVM poiSearchVMJo = Jo();
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        poiSearchVMJo.asyncSubscribe(new C2217381BqS() { // from class: X.0hIj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1197490hGd c1197490hGd = (C1197490hGd) obj;
                c1197490hGd.getClass();
                return C627260Oiy.LIZLLL(c1197490hGd);
            }
        }, this, c1770850wBP, new AwS597S0100000_18(this, 512), new AwS562S0100000_18(this, 2030), new AwS597S0100000_18(this, 513));
    }

    private final void yq() {
        PoiSearchVM poiSearchVMJo = Jo();
        C1197520hGg c1197520hGg = new C2217381BqS() { // from class: X.0hGg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197490hGd) obj).LLILZ;
            }
        };
        C1197500hGe c1197500hGe = new C2217381BqS() { // from class: X.0hGe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197490hGd) obj).LLILZIL;
            }
        };
        C1197510hGf c1197510hGf = new C2217381BqS() { // from class: X.0hGf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197490hGd) obj).LLILZLL;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        selectSubscribe(poiSearchVMJo, c1197520hGg, c1197500hGe, c1197510hGf, c1770850wBP, null, C1209050hZH.get$arr$(1));
    }

    private final void zq() {
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hHS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197490hGd) obj).LLJ;
            }
        }, null, new AwS632S0100000_18(this, 172), 6);
    }

    @Override // X.InterfaceC1197930hHL, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC1197930hHL
    public void Sp(String str, String str2) {
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public PoiSearchAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(524);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiSearchVM.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(676);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((AbstractC738140SxQ) this, 2041);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIII = new C736950SvV(c19719912DlLIZ, aFwS206S0000000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS562S0100000_18, c451610HnL, c723700Sa8);
        this.LLJJIJI = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL();
        this.LLJJIJIL = true;
        this.LLJJJIL = true;
        this.LLJJJJ = true;
        AFwS206S0000000_18 aFwS206S0000000_182 = AFwS206S0000000_18.get$arr$(522);
        this.LLJLLIL = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_182, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(668), new AwS562S0100000_18((AbstractC738140SxQ) this, 2017), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJLLL = new C736950SvV(C13LE.LIZ(PoiSearchCreatorVM.class), AFwS206S0000000_18.get$arr$(523), c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(669), new AwS562S0100000_18((AbstractC738140SxQ) this, 2020), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiActivityViewModel.class);
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ2, 2038), AFwS256S0000000_18.get$arr$(675), null, true);
        this.LLLF = new ArrayList();
        this.LLLFFI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2040));
    }

    private final void N4() {
        try {
            ((InterfaceC1197900hHI) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1197900hHI.class), null)).N4();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi_search", e.getMessage());
        }
    }

    private final boolean Oo() {
        C0CZT.LIZ.getClass();
        boolean zLIZ = C0CZT.LIZ();
        boolean z = !C1198890hIt.LIZIZ.LIZIZ();
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        Context context = Go().getContext();
        c1200940hMC.getClass();
        boolean z2 = !C1200940hMC.LIZIZ(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initAgeGraduationBanner isGraduationUser=");
        sbLIZ.append(zLIZ);
        sbLIZ.append(", nonHitFc=");
        sbLIZ.append(z);
        sbLIZ.append(", nonGpsGranted=");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!zLIZ || !z) {
            return false;
        }
        C1207340hWW.LIZ.getClass();
        if (C1207340hWW.LJI("poi", "add_location")) {
            pq(z2);
            return true;
        }
        pq(false);
        return true;
    }

    private final void Qp() {
        C20509915Nh c20509915Nh = this.LLJJJJLIIL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZIZ();
        }
        this.LLJJJJLIIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean Zo() {
        /*
            r5 = this;
            X.0hWW r0 = X.C1207340hWW.LIZ
            r0.getClass()
            java.lang.String r1 = "poi"
            java.lang.String r0 = "add_location"
            boolean r0 = X.C1207340hWW.LJI(r1, r0)
            r4 = 0
            if (r0 != 0) goto L11
            return r4
        L11:
            boolean r0 = r5.LLJLL
            if (r0 == 0) goto L56
            X.0hGm r0 = r5.LLJZIJLIL
            if (r0 == 0) goto L56
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L54
            r0 = 1
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C1189060h32.LJIILJJIL(r0)
            if (r0 == 0) goto L56
            r3 = 1
        L2b:
            X.0hCD r0 = r5.LLL
            if (r0 == 0) goto L52
            r2 = 1
        L30:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "creatorOnboardingBannerShowing:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ",activityBannerShowing:"
            r1.append(r0)
            r1.append(r2)
            r0 = 32
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r3 != 0) goto L51
            if (r2 != 0) goto L51
            r4 = 1
        L51:
            return r4
        L52:
            r2 = 0
            goto L30
        L54:
            r0 = 0
            goto L20
        L56:
            r3 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem.Zo():boolean");
    }

    private final PoiActivityViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (PoiActivityViewModel) assemVMLazy.getValue();
    }

    private final void qq() {
        String string;
        String string2;
        if (C0HW7.LIZ) {
            C1749280vcc c1749280vcc = this.LLJ;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            Context context = getContext();
            C1749280vcc c1749280vcc2 = this.LLJ;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            EnumC444680HcA enumC444680HcA = EnumC444680HcA.UNAVAILABLE;
            c1749280vcc.setStatus(C444600Hc2.LIZ(context, c1749280vcc2, C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.FIXED, (Float) null, 6), new C444550Hbx(Boolean.TRUE, (Integer) null, 6), null, 2131833894, new C444560Hby(EnumC444580Hc0.NO_BUTTON, null, null, null, null, 30), new C444590Hc1(3))));
            C1749280vcc c1749280vcc3 = this.LLJ;
            C444690HcB.LIZ(enumC444680HcA, c1749280vcc3 != null ? c1749280vcc3 : null);
        } else {
            PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) withState(Jo(), AFwS256S0000000_18.get$arr$(672));
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_magnify_glass;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            if (poiSearchResultWrapper == null || (string = poiSearchResultWrapper.hintMainTitle) == null) {
                C1749280vcc c1749280vcc4 = this.LLJ;
                if (c1749280vcc4 == null) {
                    c1749280vcc4 = null;
                }
                string = c1749280vcc4.getContext().getString(2131844734);
            }
            c1722300uv6.LJI = string;
            if (poiSearchResultWrapper == null || (string2 = poiSearchResultWrapper.hintSubtitle) == null) {
                C1749280vcc c1749280vcc5 = this.LLJ;
                if (c1749280vcc5 == null) {
                    c1749280vcc5 = null;
                }
                string2 = c1749280vcc5.getContext().getString(2131844733);
            }
            c1722300uv6.LJIIIIZZ = string2;
            C1749280vcc c1749280vcc6 = this.LLJ;
            (c1749280vcc6 != null ? c1749280vcc6 : null).setStatus(c1722300uv6);
        }
        C786410Ut5.LLF(8, Go());
    }

    public final void Bq() {
        if (this.LLJJIJIIJIL) {
            return;
        }
        N4();
    }

    @Override // X.InterfaceC1197930hHL
    public void Cd() {
        IPoiMapService iPoiMapService;
        if (C1189060h32.LJIILJJIL(PoiCoreConfig.LIZ.userCreatePoiEnable) && Jo().LLILLL == EnumC1198680hIY.ADD_LOCATION && (iPoiMapService = (IPoiMapService) PluggableExtentionKt.pluggableSpi$default(IPoiMapService.class, false, false, false, 14, null)) != null && iPoiMapService.LJFF()) {
            C723850SaN.LIZLLL(this, new AwS589S0100000_10(this, 115));
        }
    }

    public final void Ep() {
        C786410Ut5.LLF(8, Go());
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        String str = (String) withState(Jo(), AFwS256S0000000_18.get$arr$(674));
        EnumC444680HcA enumC444680HcA = EnumC444680HcA.NO_CONTENT;
        C444630Hc5 c444630Hc5LIZ = C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.FIXED, (Float) null, 6), new C444550Hbx(Boolean.TRUE, Integer.valueOf(R.drawable.nf), 4), 2131833893, 2131833886, new C444560Hby(EnumC444580Hc0.SQUARED_BUTTON, 3, 2131833882, 1, new AwS562S0100000_18(this, 2039)), new C444590Hc1(3));
        if (str != null && str.length() > 0) {
            C1749280vcc c1749280vcc2 = this.LLJ;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            Context context = getContext();
            C1749280vcc c1749280vcc3 = this.LLJ;
            if (c1749280vcc3 == null) {
                c1749280vcc3 = null;
            }
            c1749280vcc2.setStatus(C444600Hc2.LIZ(context, c1749280vcc3, c444630Hc5LIZ));
            C1749280vcc c1749280vcc4 = this.LLJ;
            C444690HcB.LIZ(enumC444680HcA, c1749280vcc4 != null ? c1749280vcc4 : null);
            C1197730hH1.LIZ.LJ(EnumC1197740hH2.SEARCH, C13LP.LJJLIIIJ(Jo().LLJ, ",", null, null, 0, null, null, 62));
            return;
        }
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        View view = this.LLIZLLLIL;
        if (view == null) {
            view = null;
        }
        Context context2 = view.getContext();
        TokenCert tokenCertLJFF = C1198600hIQ.LJFF();
        c1200940hMC.getClass();
        boolean zLIZ = C1200940hMC.LIZ(context2, tokenCertLJFF);
        boolean zLIZIZ = C1200940hMC.LIZIZ(Go().getContext());
        if (zLIZ) {
            if (!zLIZIZ) {
                tq();
                return;
            }
            C1749280vcc c1749280vcc5 = this.LLJ;
            if (c1749280vcc5 == null) {
                c1749280vcc5 = null;
            }
            Context context3 = getContext();
            C1749280vcc c1749280vcc6 = this.LLJ;
            if (c1749280vcc6 == null) {
                c1749280vcc6 = null;
            }
            c1749280vcc5.setStatus(C444600Hc2.LIZ(context3, c1749280vcc6, c444630Hc5LIZ));
            C1749280vcc c1749280vcc7 = this.LLJ;
            C444690HcB.LIZ(enumC444680HcA, c1749280vcc7 != null ? c1749280vcc7 : null);
            C1197730hH1.LIZ.LJ(EnumC1197740hH2.RECOMMEND, C13LP.LJJLIIIJ(Jo().LLJ, ",", null, null, 0, null, null, 62));
            return;
        }
        C1155340gAe c1155340gAeSp = sp();
        if (Intrinsics.LJFF(c1155340gAeSp != null ? c1155340gAeSp.LL : null, "video_edit_page")) {
            C1749280vcc c1749280vcc8 = this.LLJ;
            if (c1749280vcc8 == null) {
                c1749280vcc8 = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc8, 8);
            TuxTextView tuxTextView = this.LLJILJILJ;
            C786410Ut5.LLLLZLL(tuxTextView != null ? tuxTextView : null, 0);
            return;
        }
        C1749280vcc c1749280vcc9 = this.LLJ;
        if (c1749280vcc9 == null) {
            c1749280vcc9 = null;
        }
        Context context4 = getContext();
        C1749280vcc c1749280vcc10 = this.LLJ;
        if (c1749280vcc10 == null) {
            c1749280vcc10 = null;
        }
        c1749280vcc9.setStatus(C444600Hc2.LIZ(context4, c1749280vcc10, c444630Hc5LIZ));
        C1749280vcc c1749280vcc11 = this.LLJ;
        C444690HcB.LIZ(enumC444680HcA, c1749280vcc11 != null ? c1749280vcc11 : null);
        C1197730hH1.LIZ.LJ(EnumC1197740hH2.RECOMMEND, C13LP.LJJLIIIJ(Jo().LLJ, ",", null, null, 0, null, null, 62));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLLFFI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        if (C1189060h32.LJIILJJIL(PoiCoreConfig.LIZ.userCreatePoiEnable)) {
            c20603715jn.LIZLLL = PoiDetailPublishLoadMoreFooterCell.class;
        } else {
            c20603715jn.LIZLLL = PoiPublishLoadMoreFooterCell.class;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "poi_search_show_intermediate_result", false, false)) {
            c20603715jn.LJIILJJIL = true;
        }
        return c20603715jn;
    }

    public final void Ip() {
        C1198520hII c1198520hII = C1198520hII.LIZ;
        EnumC1198660hIW enumC1198660hIW = EnumC1198660hIW.ALLOW;
        c1198520hII.getClass();
        C1198520hII.LIZLLL(enumC1198660hIW);
        C1197760hH4.LIZ.getClass();
        if (!C1197760hH4.LIZ()) {
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            View view = this.LLIZLLLIL;
            if (iLocationBaseServiceForMT.LJ((view != null ? view : null).getContext())) {
                Up("click_show", C1198600hIQ.LIZLLL, true, new AwS562S0100000_18(this, 2019));
                return;
            } else {
                fq("click_show", C1198600hIQ.LIZJ, true, new AwS562S0100000_18(this, 2018));
                return;
            }
        }
        C1198560hIM c1198560hIM = C1198560hIM.LIZ;
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            view2 = null;
        }
        Context context = view2.getContext();
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        C1155340gAe c1155340gAeSp = sp();
        String str = c1155340gAeSp != null ? c1155340gAeSp.LL : null;
        AwS632S0100000_18 awS632S0100000_18 = new AwS632S0100000_18(this, 169);
        c1198560hIM.getClass();
        C1198560hIM.LIZJ(context, fragmentLJIIJ, true, str, awS632S0100000_18);
    }

    public final void LJ() {
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLJ;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        if (c1749280vcc2.getBackground() != null) {
            C1749280vcc c1749280vcc3 = this.LLJ;
            if (c1749280vcc3 == null) {
                c1749280vcc3 = null;
            }
            c1749280vcc3.setBackground(null);
        }
        C339190DRl.LIZLLL(Go());
        C1749280vcc c1749280vcc4 = this.LLJ;
        (c1749280vcc4 != null ? c1749280vcc4 : null).LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r1 == X.EnumC1205470hTV.SUCCESS) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (X.C1197760hH4.LIZJ(r0.getContext(), r2) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("checkPreciseGPSBanner needPromoteWithCert false, cert:");
        r1.append(X.C1198600hIQ.LJI(true));
        X.C2188811AlT.LIZIZ(r1);
        r1 = X.C1197730hH1.LIZ;
        r0 = r15.LLIZLLLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r10 = r0.getContext();
        r1.getClass();
        r1.LIZJ("poi_search_promote_precise_banner_not_show", new kotlin.jvm.internal.AwS38S0310000_18(r10, true, X.C1198600hIQ.LJI(true), (X.EnumC1207930hXT) null, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ap() {
        /*
            r15 = this;
            X.0hH4 r0 = X.C1197760hH4.LIZ
            r0.getClass()
            boolean r0 = X.C1197760hH4.LIZ()
            if (r0 != 0) goto L11
            boolean r0 = X.C300190Bph.LIZ()
            if (r0 == 0) goto L3d
        L11:
            r11 = 1
            com.bytedance.bpea.cert.token.TokenCert r2 = X.C1198600hIQ.LJI(r11)
            boolean r0 = X.C300190Bph.LIZ()
            r8 = 0
            r4 = 0
            if (r0 == 0) goto L44
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS> r3 = com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS.class
            r7 = 14
            r5 = r4
            r6 = r4
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS r1 = (com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS) r1
            if (r1 == 0) goto L42
            android.view.View r0 = r15.LLIZLLLIL
            if (r0 != 0) goto L31
            r0 = r8
        L31:
            android.content.Context r0 = r0.getContext()
            X.0hTV r1 = r1.LIZIZ(r0, r2)
        L39:
            X.0hTV r0 = X.EnumC1205470hTV.SUCCESS
            if (r1 != r0) goto L53
        L3d:
            boolean r0 = r15.Zo()
            return r0
        L42:
            r1 = r8
            goto L39
        L44:
            android.view.View r0 = r15.LLIZLLLIL
            if (r0 != 0) goto L49
            r0 = r8
        L49:
            android.content.Context r0 = r0.getContext()
            boolean r0 = X.C1197760hH4.LIZJ(r0, r2)
            if (r0 != 0) goto L3d
        L53:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkPreciseGPSBanner needPromoteWithCert false, cert:"
            r1.append(r0)
            com.bytedance.bpea.cert.token.TokenCert r0 = X.C1198600hIQ.LJI(r11)
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.0hH1 r1 = X.C1197730hH1.LIZ
            android.view.View r0 = r15.LLIZLLLIL
            if (r0 != 0) goto L6d
            r0 = r8
        L6d:
            android.content.Context r10 = r0.getContext()
            r1.getClass()
            com.bytedance.bpea.cert.token.TokenCert r12 = X.C1198600hIQ.LJI(r11)
            kotlin.jvm.internal.AwS38S0310000_18 r9 = new kotlin.jvm.internal.AwS38S0310000_18
            r14 = 2
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r0 = "poi_search_promote_precise_banner_not_show"
            r1.LIZJ(r0, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem.ap():boolean");
    }

    public final PoiCreatorVM mp() {
        return (PoiCreatorVM) this.LLJLLIL.getValue();
    }

    public final PoiSearchCreatorVM op() {
        return (PoiSearchCreatorVM) this.LLJLLL.getValue();
    }

    public final C1155340gAe sp() {
        return (C1155340gAe) this.LLJJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public PoiSearchVM ip() {
        return (PoiSearchVM) this.LLJJIII.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zp() {
        C1722300uv6 c1722300uv6;
        Pair pair;
        PoiCreateEntranceAbility poiCreateEntranceAbility;
        if (Intrinsics.LJFF(k7(), ((C1197490hGd) Jo().getState()).LL)) {
            C1749280vcc c1749280vcc = this.LLJ;
            String str = null;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            TuxTextView tuxTextView = this.LLJILJILJ;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            Tp();
            PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) withState(Jo(), AFwS256S0000000_18.get$arr$(671));
            boolean z = !Lo(getContext());
            boolean zLIZ = C298190BmT.LIZ();
            AbstractC21673619ry adapter = Go().getAdapter();
            boolean z2 = adapter != null && adapter.getItemCount() > 0;
            boolean z3 = poiSearchResultWrapper != null && poiSearchResultWrapper.code == 10001;
            if (zLIZ && z) {
                this.LLJJJJJIL = true;
                C786410Ut5.LLF(z2 ? 0 : 8, Go());
                up(z2, new C1198810hIl(this));
            } else if (z3) {
                qq();
            } else {
                C786410Ut5.LLF(8, Go());
                if (C0HW7.LIZ) {
                    if (z) {
                        EnumC444680HcA enumC444680HcA = EnumC444680HcA.NO_NETWORK;
                        pair = new Pair(enumC444680HcA, enumC444680HcA);
                    } else {
                        EnumC444680HcA enumC444680HcA2 = EnumC444680HcA.SOMETHING_WRONG;
                        pair = new Pair(enumC444680HcA2, enumC444680HcA2);
                    }
                    EnumC444680HcA enumC444680HcA3 = (EnumC444680HcA) pair.getFirst();
                    EnumC444680HcA enumC444680HcA4 = (EnumC444680HcA) pair.getSecond();
                    C1749280vcc c1749280vcc2 = this.LLJ;
                    if (c1749280vcc2 == null) {
                        c1749280vcc2 = null;
                    }
                    Context context = getContext();
                    C1749280vcc c1749280vcc3 = this.LLJ;
                    if (c1749280vcc3 == null) {
                        c1749280vcc3 = null;
                    }
                    str = null;
                    c1749280vcc2.setStatus(C444600Hc2.LIZ(context, c1749280vcc3, C444540Hbw.LIZ(enumC444680HcA3, new C444640Hc6(EnumC444620Hc4.FIXED, (Float) null, 6), new C444550Hbx(Boolean.TRUE, (Integer) null, 6), null, null, new C444560Hby(EnumC444580Hc0.SQUARED_BUTTON, 3, null, 1, new AwS562S0100000_18(this, 2032), 4), new C444590Hc1(3))));
                    C1749280vcc c1749280vcc4 = this.LLJ;
                    if (c1749280vcc4 == null) {
                        c1749280vcc4 = null;
                    }
                    C444690HcB.LIZ(enumC444680HcA4, c1749280vcc4);
                } else {
                    C1749280vcc c1749280vcc5 = this.LLJ;
                    if (c1749280vcc5 == null) {
                        c1749280vcc5 = null;
                    }
                    if (z) {
                        c1722300uv6 = new C1722300uv6();
                        C1893080zMY.LIZ(c1722300uv6, new AwS562S0100000_18(this, 2033));
                    } else {
                        c1722300uv6 = new C1722300uv6();
                        C1893080zMY.LJFF(c1722300uv6, new AwS562S0100000_18(this, 2035));
                    }
                    c1749280vcc5.setStatus(c1722300uv6);
                }
            }
            Fp();
            this.LLJJJIL = false;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (poiCreateEntranceAbility = (PoiCreateEntranceAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, str), PoiCreateEntranceAbility.class, str)) != null) {
                poiCreateEntranceAbility.Su2();
            }
            if (this.LLJLL) {
                PoiCreatorVM poiCreatorVMMp = mp();
                poiCreatorVMMp.getClass();
                poiCreatorVMMp.setState(new AwS32S0010000_18(false, 21));
            }
        }
    }

    private final void Gp() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        PoiSearchVM poiSearchVMJo = Jo();
        C686930Qx1 c686930Qx1 = new C686930Qx1(c19egLIZ);
        int iLIZ = C2508409sI.LIZ();
        poiSearchVMJo.LLJLILLLLZIIL = iLIZ != 3 ? iLIZ != 5 ? new C1198850hIp(R.layout.e9k, c686930Qx1) : new C1198850hIp(R.layout.e9m, c686930Qx1) : new C1198850hIp(R.layout.e9n, c686930Qx1);
    }

    private final void Jp() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        C1723500ux2[] c1723500ux2Arr = new C1723500ux2[1];
        int iLIZ = C2508409sI.LIZ();
        c1723500ux2Arr[0] = new C1723500ux2(50002, iLIZ != 3 ? iLIZ != 5 ? PoiSearchCell.class : PoiSearchCellLeft.class : PoiSearchCellRight.class);
        viewOnAttachStateChangeListenerC20604515jvGo.LJIJ(c1723500ux2Arr);
        if (C297510BlN.LIZ()) {
            Go().LJIJ(new C1723500ux2(50001, PoiSearchCreatorCell.class));
        }
        Go().LJIILJJIL(PoiIpRecommendTipCell.class);
    }

    private final void Xp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestLocationWhenCreate findNearbyPlacesJumpToSearch:");
        AddLocationGpsAuthGuideExperiment.LIZ.getClass();
        Boolean bool = Boolean.TRUE;
        AddLocationGpsAuthGuideExperiment.LsAddLocationGpsAuthGuideConfig lsAddLocationGpsAuthGuideConfig = AddLocationGpsAuthGuideExperiment.LIZIZ;
        sbLIZ.append(Intrinsics.LJFF(bool, lsAddLocationGpsAuthGuideConfig.findNearbyPlacesJumpToSearch));
        sbLIZ.append(", vm.fromFindNearbyPlaceClick:");
        sbLIZ.append(Jo().LLJJIJIIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(bool, lsAddLocationGpsAuthGuideConfig.findNearbyPlacesJumpToSearch) && Jo().LLJJIJIIJIL) {
            TokenCert tokenCertLJ = C1198600hIQ.LJ();
            C1198560hIM c1198560hIM = C1198560hIM.LIZ;
            View view = this.LLIZLLLIL;
            if (view == null) {
                view = null;
            }
            Context context = view.getContext();
            c1198560hIM.getClass();
            if (C1198560hIM.LIZ(context, tokenCertLJ)) {
                C1155340gAe c1155340gAeSp = sp();
                aq(this, tokenCertLJ, c1155340gAeSp != null ? c1155340gAeSp.LLILLJJLI : null, "add_location", new AwS562S0100000_18(this, 2029), true);
                return;
            }
            return;
        }
        if (!C1697810uHb.LJIILJJIL(EnumC1198680hIY.ADD_LOCATION, EnumC1198680hIY.LOCATION_STICKER).contains(Jo().LLILLL) || Jo().LLJJIJIL) {
            return;
        }
        C1197440hGY c1197440hGY = C1197440hGY.LIZIZ;
        C0CZT.LIZ.getClass();
        boolean z = (C0CZT.LIZ() && (C1198890hIt.LIZIZ.LIZIZ() ^ true)) ? false : true;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("requestLocationWhenCreate frequency:");
        sbLIZ2.append(!c1197440hGY.LIZIZ());
        sbLIZ2.append(", showPopup:");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (c1197440hGY.LIZIZ() || !z) {
            return;
        }
        TokenCert tokenCertLJ2 = C1198600hIQ.LJ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("requestLocationWhenCreate enable:");
        C1197760hH4.LIZ.getClass();
        sbLIZ3.append(C1197760hH4.LIZ());
        sbLIZ3.append(",isPopupAllowed:");
        C1207340hWW.LIZ.getClass();
        sbLIZ3.append(C1207340hWW.LJIIIZ(tokenCertLJ2));
        sbLIZ3.append(",cert:");
        sbLIZ3.append(tokenCertLJ2);
        C2188811AlT.LIZIZ(sbLIZ3);
        C1198560hIM c1198560hIM2 = C1198560hIM.LIZ;
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            view2 = null;
        }
        Context context2 = view2.getContext();
        c1198560hIM2.getClass();
        if (C300190Bph.LIZ()) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            if ((iLocationServiceForLS != null ? iLocationServiceForLS.LIZ(context2, tokenCertLJ2, "search_poi") : null) != EnumC1205470hTV.SUCCESS) {
                return;
            }
        } else if (C1197760hH4.LIZ() && !C1207340hWW.LJIIIZ(tokenCertLJ2)) {
            return;
        }
        c1197440hGY.LJI(true);
        C1155340gAe c1155340gAeSp2 = sp();
        aq(this, tokenCertLJ2, c1155340gAeSp2 != null ? c1155340gAeSp2.LLILLJJLI : null, "add_location", new AwS562S0100000_18(this, 2031), false);
    }

    private final void cp() {
        Boolean boolValueOf;
        if (Jo().LLILLL == EnumC1198680hIY.POI_RE_TAG) {
            return;
        }
        C1197760hH4.LIZ.getClass();
        if (C1197760hH4.LIZ()) {
            if (C300190Bph.LIZ()) {
                ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                if ((iLocationServiceForLS != null ? iLocationServiceForLS.LIZIZ(getContext(), C1198600hIQ.LJI(false)) : null) != EnumC1205470hTV.SUCCESS) {
                    return;
                }
            }
            C1198560hIM c1198560hIM = C1198560hIM.LIZ;
            View view = this.LLIZLLLIL;
            if (view == null) {
                view = null;
            }
            Context context = view.getContext();
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
            C1155340gAe c1155340gAeSp = sp();
            String str = c1155340gAeSp != null ? c1155340gAeSp.LL : null;
            AwS632S0100000_18 awS632S0100000_18 = new AwS632S0100000_18(this, 170);
            c1198560hIM.getClass();
            C1198560hIM.LIZJ(context, fragmentLJIIJ, false, str, awS632S0100000_18);
            return;
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null) {
            View view2 = this.LLIZLLLIL;
            if (view2 == null) {
                view2 = null;
            }
            boolValueOf = Boolean.valueOf(iLocationBaseServiceForMT.LJ(view2.getContext()));
        } else {
            boolValueOf = null;
        }
        boolean zLJIILJJIL = C1189060h32.LJIILJJIL(boolValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("convertPreciseGPSWhenCreate not met exp, isSystemPrecise:");
        sbLIZ.append(zLJIILJJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLJIILJJIL) {
            Up("direct_show", C1198600hIQ.LJ, false, new AwS562S0100000_18(this, 2022));
        } else {
            C1155340gAe c1155340gAeSp2 = sp();
            fq(c1155340gAeSp2 != null ? c1155340gAeSp2.LLILLJJLI : null, C1198600hIQ.LJII() ? TokenCert.Companion.with("bpea-poi_search_request_system_conversion_popup_for_precise") : TokenCert.Companion.with("bpea-poi_search_request_system_conversion_popup"), false, new AwS562S0100000_18(this, 2021));
        }
    }

    private final void kq() {
        Go().addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.0hHV
            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                String str;
                String str2;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        float rawY = motionEvent.getRawY();
                        PoiSearchAssem poiSearchAssem = this.LL;
                        if (rawY - poiSearchAssem.LLJLIL <= (-poiSearchAssem.LLJL)) {
                            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                            String strK7 = poiSearchAssem.k7();
                            C1155340gAe c1155340gAeSp = this.LL.sp();
                            if (c1155340gAeSp != null) {
                                str = c1155340gAeSp.LL;
                            } else {
                                str = null;
                            }
                            String strK72 = this.LL.k7();
                            if (strK72 != null && strK72.length() != 0) {
                                str2 = "search_poi";
                            } else {
                                str2 = "default_search_poi";
                            }
                            PoiMobParam poiMobParam = this.LL.Jo().LLJJJJJIL;
                            C443120HZe<String, String, String> c443120HZeLIZLLL = C1197910hHJ.LIZLLL(this.LL.Jo());
                            c1185430gxB.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (C123100dR.LIZ(str)) {
                                linkedHashMap.put("enter_from", str);
                            }
                            if (C123100dR.LIZ(str2)) {
                                linkedHashMap.put("enter_method", str2);
                            }
                            C1197910hHJ.LIZ(linkedHashMap, poiMobParam);
                            C1197910hHJ.LIZIZ(linkedHashMap, c443120HZeLIZLLL, strK7);
                            C20684815ws.LJIILLIIL("poi_search_slide_up", linkedHashMap);
                        }
                    }
                    return false;
                }
                this.LL.LLJLIL = motionEvent.getRawY();
                return false;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void tq() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem.tq():void");
    }

    private final void yp() {
        Go().addOnItemTouchListener(new C0KFD() { // from class: X.0hJ3
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
                View view = this.LL.LLIZLLLIL;
                if (view == null) {
                    view = null;
                }
                C0DLI.LIZ(c19egLIZ, view);
                return false;
            }
        });
    }

    public final void Ap() {
        PoiCreateEntranceAbility poiCreateEntranceAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (poiCreateEntranceAbility = (PoiCreateEntranceAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), PoiCreateEntranceAbility.class, null)) != null) {
            poiCreateEntranceAbility.WJ();
        }
        Qp();
        withState(Jo(), new AwS597S0100000_18(this, 515));
        this.LLJJJIL = false;
        if (this.LLJLL) {
            PoiCreatorVM poiCreatorVMMp = mp();
            poiCreatorVMMp.getClass();
            poiCreatorVMMp.setState(new AwS32S0010000_18(false, 21));
        }
    }

    public final void Bp() {
        C786410Ut5.LLF(8, Go());
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        String str = (String) withState(Jo(), AFwS256S0000000_18.get$arr$(673));
        if (str != null && str.length() > 0) {
            C1749280vcc c1749280vcc2 = this.LLJ;
            C1749280vcc c1749280vcc3 = c1749280vcc2 != null ? c1749280vcc2 : null;
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LJ(c1722300uv6);
            c1749280vcc3.setStatus(c1722300uv6);
            C1197730hH1.LIZ.LJ(EnumC1197740hH2.SEARCH, C13LP.LJJLIIIJ(Jo().LLJ, ",", null, null, 0, null, null, 62));
            return;
        }
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        View view = this.LLIZLLLIL;
        if (view == null) {
            view = null;
        }
        Context context = view.getContext();
        TokenCert tokenCertLJFF = C1198600hIQ.LJFF();
        c1200940hMC.getClass();
        boolean zLIZ = C1200940hMC.LIZ(context, tokenCertLJFF);
        boolean zLIZIZ = C1200940hMC.LIZIZ(Go().getContext());
        if (zLIZ) {
            if (!zLIZIZ) {
                tq();
                return;
            }
            C1749280vcc c1749280vcc4 = this.LLJ;
            C1749280vcc c1749280vcc5 = c1749280vcc4 != null ? c1749280vcc4 : null;
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            C1893080zMY.LJ(c1722300uv62);
            c1749280vcc5.setStatus(c1722300uv62);
            C1197730hH1.LIZ.LJ(EnumC1197740hH2.RECOMMEND, C13LP.LJJLIIIJ(Jo().LLJ, ",", null, null, 0, null, null, 62));
            return;
        }
        C1155340gAe c1155340gAeSp = sp();
        if (Intrinsics.LJFF(c1155340gAeSp != null ? c1155340gAeSp.LL : null, "video_edit_page")) {
            C1749280vcc c1749280vcc6 = this.LLJ;
            if (c1749280vcc6 == null) {
                c1749280vcc6 = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc6, 8);
            TuxTextView tuxTextView = this.LLJILJILJ;
            C786410Ut5.LLLLZLL(tuxTextView != null ? tuxTextView : null, 0);
            return;
        }
        C1749280vcc c1749280vcc7 = this.LLJ;
        C1749280vcc c1749280vcc8 = c1749280vcc7 != null ? c1749280vcc7 : null;
        C1722300uv6 c1722300uv63 = new C1722300uv6();
        C1893080zMY.LJ(c1722300uv63);
        c1749280vcc8.setStatus(c1722300uv63);
        C1197730hH1.LIZ.LJ(EnumC1197740hH2.RECOMMEND, C13LP.LJJLIIIJ(Jo().LLJ, ",", null, null, 0, null, null, 62));
    }

    public final void So() {
        if (C1198670hIX.LIZ[Jo().LLILLL.ordinal()] == 4) {
            return;
        }
        if (Oo()) {
            this.LLJJIJIL = false;
            return;
        }
        C1207340hWW.LIZ.getClass();
        if (!C1207340hWW.LJI("poi", "add_location")) {
            Vo();
            return;
        }
        C013C c013c = new C013C();
        C1198940hIy c1198940hIyKp = kp(new AwS419S0200000_18(this, c013c, 95));
        this.LLJJI = c1198940hIyKp != null ? c1198940hIyKp.LIZ : null;
        if (Zo()) {
            Go().LJIJJ();
            boolean z = c013c.element;
            this.LLJJIJIIJIL = !z;
            if (z) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkAndShowBanner headerView:");
            sbLIZ.append(this.LLJJI);
            C2188811AlT.LIZIZ(sbLIZ);
            View view = this.LLJJI;
            if (view != null) {
                C1198560hIM c1198560hIM = C1198560hIM.LIZ;
                View view2 = this.LLIZLLLIL;
                if (view2 == null) {
                    view2 = null;
                }
                Context context = view2.getContext();
                EnumC1198780hIi enumC1198780hIi = c1198940hIyKp != null ? c1198940hIyKp.LIZIZ : null;
                c1198560hIM.getClass();
                if (C300190Bph.LIZ()) {
                    ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                    if (iLocationServiceForLS == null || enumC1198780hIi == null) {
                        return;
                    }
                    int i = C1198770hIh.LIZ[enumC1198780hIi.ordinal()];
                    if (i != 1) {
                        if (i != 2 || iLocationServiceForLS.LIZIZ(context, C1198600hIQ.LJI(true)) != EnumC1205470hTV.SUCCESS) {
                            return;
                        }
                    } else if (iLocationServiceForLS.LIZ(context, C1198600hIQ.LJFF, "search_poi") != EnumC1205470hTV.SUCCESS) {
                        return;
                    }
                }
                if ((c1198940hIyKp != null ? c1198940hIyKp.LIZIZ : null) == EnumC1198780hIi.PROMOTE_PRECISE) {
                    C1198650hIV.LIZIZ.LJIIIIZZ();
                    C1198520hII c1198520hII = C1198520hII.LIZ;
                    EnumC1198660hIW enumC1198660hIW = EnumC1198660hIW.SHOW;
                    c1198520hII.getClass();
                    C1198520hII.LIZLLL(enumC1198660hIW);
                }
                this.LLJJIJIL = false;
                Go().LJ(0, view);
            }
        }
    }

    public final void Tp() {
        if (Go().getHeaderCount() != 0) {
            Go().LJIJJ();
        }
        PoiSearchCreatorVM poiSearchCreatorVMOp = op();
        poiSearchCreatorVMOp.getClass();
        poiSearchCreatorVMOp.LL = true;
        poiSearchCreatorVMOp.setState(new AwS32S0010000_18(false, 22));
    }

    public final void Vo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAndShowCreatorInviteBanner isFirstTimeShowBanner:");
        sbLIZ.append(this.LLJJIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJIJIL && C297510BlN.LIZIZ()) {
            try {
                C1197840hHC.LIZ.getClass();
                boolean zLIZIZ = C1197820hHA.LIZIZ.LIZIZ();
                boolean zLIZ = C297500BlM.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isBannerShown:");
                sbLIZ2.append(this.LLJJIJIIJIL);
                sbLIZ2.append(", isCreator:");
                sbLIZ2.append(zLIZ);
                sbLIZ2.append(", hitCreatorBannerFreq:");
                sbLIZ2.append(zLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                View view = this.LLJJI;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                boolean z = true;
                if ((viewGroup != null && viewGroup.getChildCount() > 0) || this.LLJJIJIIJIL) {
                    z = false;
                }
                if (zLIZ || zLIZIZ || !z) {
                    return;
                }
                PoiSearchCreatorVM poiSearchCreatorVMOp = op();
                poiSearchCreatorVMOp.getClass();
                if (!C297510BlN.LIZIZ() || C297500BlM.LIZ()) {
                    return;
                }
                C23250099c.LIZLLL(poiSearchCreatorVMOp.getAssemVMScope(), C0PEM.LIZJ, null, new C1197600hGo(poiSearchCreatorVMOp, null), 2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
                c1205490hTX.getClass();
                C1205490hTX.LIZLLL(c1emr, "check_and_show_creator_banner", null, e);
            }
        }
    }

    public final void Wp() {
        TokenCert tokenCertWith = C1198600hIQ.LJII() ? TokenCert.Companion.with("bpea-poi_search_auto_for_precise") : TokenCert.Companion.with("bpea-poi_search_auto");
        C1155340gAe c1155340gAeSp = sp();
        aq(this, tokenCertWith, c1155340gAeSp != null ? c1155340gAeSp.LLILLJJLI : null, "add_location", new AwS562S0100000_18(this, 2027), false);
    }

    public final void bp() {
        if (C297510BlN.LIZIZ()) {
            if (!C297500BlM.LIZ()) {
                C1197840hHC.LIZ.getClass();
                if (!(!((ArrayList) C1197840hHC.LIZ()).isEmpty())) {
                    return;
                }
            }
            Go().getState().LJFF(null);
        }
    }

    public final void dp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("decideAndShowBannerHeaderViewIfNeed ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C2188811AlT.LIZIZ(sbLIZ);
        C1207340hWW.LIZ.getClass();
        if (C1207340hWW.LJI("poi", "add_location")) {
            boolean z = false;
            if (C1198670hIX.LIZ[Jo().LLILLL.ordinal()] != 4) {
                C013C c013c = new C013C();
                C1198940hIy c1198940hIyKp = kp(new AwS419S0200000_18(this, c013c, 96));
                this.LLJJI = c1198940hIyKp != null ? c1198940hIyKp.LIZ : null;
                if (Zo()) {
                    Go().LJIJJ();
                    if (!c013c.element) {
                        View view = this.LLJJI;
                        if (view != null) {
                            if ((c1198940hIyKp != null ? c1198940hIyKp.LIZIZ : null) == EnumC1198780hIi.PROMOTE_PRECISE) {
                                C1198650hIV.LIZIZ.LJIIIIZZ();
                                C1198520hII c1198520hII = C1198520hII.LIZ;
                                EnumC1198660hIW enumC1198660hIW = EnumC1198660hIW.SHOW;
                                c1198520hII.getClass();
                                C1198520hII.LIZLLL(enumC1198660hIW);
                            }
                            this.LLJJIJIL = false;
                            Go().LJ(0, view);
                        }
                        z = true;
                    }
                    this.LLJJIJIIJIL = z;
                }
            }
        }
    }

    public final void ep() {
        LJ();
        bp();
        String strK7 = k7();
        if (strK7 == null || strK7.length() == 0) {
            hp(this, false);
        } else {
            uh(k7(), true);
        }
    }

    public final void lq() {
        withState(lp(), new AwS597S0100000_18(this, 514));
    }

    @Override // X.InterfaceC1197930hHL
    public void ls() {
        Go().getState().LJFF(null);
        Go().LJIJ(new C1723500ux2(50001, PoiSearchCreatorCell.class));
        PoiSearchCreatorVM poiSearchCreatorVMOp = op();
        poiSearchCreatorVMOp.getClass();
        poiSearchCreatorVMOp.LL = true;
        poiSearchCreatorVMOp.setState(new AwS32S0010000_18(false, 22));
        uh(null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Context context = getContext();
        InputMethodManager inputMethodManager = (InputMethodManager) (context != null ? C786410Ut5.H2(context, "input_method") : null);
        Context context2 = getContext();
        inputMethodManager.hideSoftInputFromWindow((context2 != null ? C1388190mED.LIZ(context2) : null).getWindow().getDecorView().getWindowToken(), 0);
        withState(lp(), new AwS597S0100000_18(this, 508));
        Qp();
        nf(null);
        C09AE c09ae = this.LLJLILLLLZIIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJZIJLIL = null;
        C1548820qPI.LJIIIIZZ("creatorStoreDetailChoosePoi", this);
    }

    @Override // X.AbstractC738140SxQ
    public void onPause() {
        super.onPause();
        List<String> list = this.LLJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (true) {
            View view = null;
            if (!it2.hasNext()) {
                this.LLJIJIL = arrayList;
                ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZJ(null);
                return;
            }
            String next = it2.next();
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            View view2 = this.LLIZLLLIL;
            if (view2 != null) {
                view = view2;
            }
            Context context = view.getContext();
            c19741112Lp.getClass();
            arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, next)));
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        List<String> list = this.LLJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            View view = this.LLIZLLLIL;
            if (view != null) {
                view = view;
            }
            Context context = view.getContext();
            c19741112Lp.getClass();
            arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, next)));
        }
        this.LLJILJIL = arrayList;
        List<Boolean> list2 = this.LLJIJIL;
        if (list2 == null) {
            list2 = null;
        }
        ArrayList arrayList2 = (ArrayList) C13LP.LLIILII(arrayList, list2);
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it3.next();
                if (((Boolean) pair.getFirst()).booleanValue() != ((Boolean) pair.getSecond()).booleanValue()) {
                    hp(this, false);
                    dp();
                    break;
                }
            }
        }
        if (!this.LLJJJIL) {
            C1198560hIM c1198560hIM = C1198560hIM.LIZ;
            View view2 = this.LLIZLLLIL;
            Context context2 = (view2 != null ? view2 : null).getContext();
            EnumC1198680hIY enumC1198680hIY = Jo().LLILLL;
            c1198560hIM.getClass();
            this.LLJJJ = C1198560hIM.LIZLLL(context2, enumC1198680hIY);
        }
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LJI("search_poi", new AbstractC2361009My() { // from class: X.0hIa
            @Override // X.AbstractC2361009My
            public final Map<String, String> mobExtraParams() {
                return C2097908Jt.LIZJ(new Pair("enter_from", "search_poi"));
            }
        });
    }

    public final void Fp() {
        yp();
    }

    @Override // X.InterfaceC1197930hHL
    public String k7() {
        return this.LLJJL;
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    public static boolean Lo(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    private void No(boolean z) {
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        List<Boolean> list = this.LLJILJIL;
        if (list == null) {
            list = null;
        }
        if (!list.contains(Boolean.TRUE)) {
            PoiSearchVM poiSearchVMJo = Jo();
            boolean zLJIL = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION");
            poiSearchVMJo.LLJJJ = 0.0d;
            poiSearchVMJo.LLJJJIL = 0.0d;
            poiSearchVMJo.LLJJJJ = zLJIL;
            uh(null, true);
            return;
        }
        LJ();
        if (z) {
            PoiSearchVM poiSearchVMJo2 = Jo();
            if ((poiSearchVMJo2.LLJJJ != 0.0d || poiSearchVMJo2.LLJJJIL != 0.0d) && C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_search_cache_optimize", true) == 2) {
                uh(null, true);
                return;
            }
        }
        Pair pairLIZLLL = C1198600hIQ.LIZLLL();
        C1207450hWh.LIZ.LJIIL("poi", "add_location", (AbstractC1202400hOY) pairLIZLLL.getFirst(), (AbstractC1202400hOY) pairLIZLLL.getSecond(), new InterfaceC687820QyS() { // from class: X.0hIU
            @Override // X.InterfaceC687820QyS
            public final void LIZ(LocationData locationData) {
                if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return;
                }
                C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS87S0200000_18(this.LIZ, locationData, 13));
            }

            @Override // X.InterfaceC687820QyS
            public final void onError(int i, String str) {
                if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return;
                }
                C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS118S0100000_18(this.LIZ, 45));
            }
        }, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026d A[Catch: Exception -> 0x03ba, PHI: r7
      0x026d: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v6 java.lang.String) binds: [B:103:0x0267, B:101:0x0263] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x03ba, blocks: (B:3:0x0001, B:4:0x000d, B:6:0x0015, B:8:0x0020, B:10:0x0024, B:12:0x0028, B:13:0x002a, B:15:0x0030, B:17:0x0034, B:21:0x003d, B:27:0x0048, B:29:0x004d, B:28:0x004b, B:31:0x0070, B:33:0x0076, B:35:0x0093, B:37:0x0097, B:38:0x009b, B:40:0x00b2, B:39:0x00ad, B:43:0x00bd, B:46:0x00c3, B:48:0x00c9, B:49:0x00cd, B:51:0x00dd, B:53:0x00e1, B:54:0x00e5, B:55:0x0127, B:65:0x014c, B:67:0x015a, B:76:0x016e, B:77:0x0170, B:78:0x01a6, B:80:0x0230, B:81:0x0232, B:83:0x0238, B:84:0x023a, B:94:0x0255, B:96:0x0259, B:100:0x0261, B:106:0x026d, B:111:0x027a, B:113:0x0282, B:114:0x028c, B:116:0x029b, B:118:0x02a3, B:119:0x02a5, B:120:0x02aa, B:122:0x02c0, B:123:0x02c2, B:125:0x02c8, B:126:0x02cc, B:128:0x02d0, B:130:0x02d4, B:131:0x02d8, B:133:0x02e0, B:143:0x02fc, B:145:0x0304, B:148:0x030a, B:150:0x0320, B:151:0x0322, B:108:0x0273, B:64:0x0148), top: B:157:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: Exception -> 0x03ba, TryCatch #0 {Exception -> 0x03ba, blocks: (B:3:0x0001, B:4:0x000d, B:6:0x0015, B:8:0x0020, B:10:0x0024, B:12:0x0028, B:13:0x002a, B:15:0x0030, B:17:0x0034, B:21:0x003d, B:27:0x0048, B:29:0x004d, B:28:0x004b, B:31:0x0070, B:33:0x0076, B:35:0x0093, B:37:0x0097, B:38:0x009b, B:40:0x00b2, B:39:0x00ad, B:43:0x00bd, B:46:0x00c3, B:48:0x00c9, B:49:0x00cd, B:51:0x00dd, B:53:0x00e1, B:54:0x00e5, B:55:0x0127, B:65:0x014c, B:67:0x015a, B:76:0x016e, B:77:0x0170, B:78:0x01a6, B:80:0x0230, B:81:0x0232, B:83:0x0238, B:84:0x023a, B:94:0x0255, B:96:0x0259, B:100:0x0261, B:106:0x026d, B:111:0x027a, B:113:0x0282, B:114:0x028c, B:116:0x029b, B:118:0x02a3, B:119:0x02a5, B:120:0x02aa, B:122:0x02c0, B:123:0x02c2, B:125:0x02c8, B:126:0x02cc, B:128:0x02d0, B:130:0x02d4, B:131:0x02d8, B:133:0x02e0, B:143:0x02fc, B:145:0x0304, B:148:0x030a, B:150:0x0320, B:151:0x0322, B:108:0x0273, B:64:0x0148), top: B:157:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void jq(java.lang.String r71) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem.jq(java.lang.String):void");
    }

    private final C1198940hIy kp(Function0<Unit> function0) {
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        View view = null;
        if (iLocationBaseServiceForMT == null) {
            return null;
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            view = view2;
        }
        return iLocationBaseServiceForMT.LJIIJJI(view.getContext(), Go(), new AwS384S0200000_18(this, iLocationBaseServiceForMT, 152), new AwS562S0100000_18(this, 2024), new AwS562S0100000_18(function0, (Function0<Unit>) 2025));
    }

    private final void pq(boolean z) {
        C1198710hIb c1198710hIb;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showAgeGraduationBanner showTurnOnLocation:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1198890hIt c1198890hIt = C1198890hIt.LIZIZ;
        Context context = getContext();
        AwS562S0100000_18 awS562S0100000_18 = null;
        if (context != null) {
            c1198710hIb = new C1198710hIb(context);
        } else {
            c1198710hIb = null;
        }
        this.LLLFF = c1198710hIb;
        if (c1198710hIb != null) {
            if (z) {
                awS562S0100000_18 = new AwS562S0100000_18(this, 2034);
            }
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(this, 2036);
            c1198710hIb.LLILZ.setMovementMethod(C431260Gvc.LIZ);
            if (z) {
                if (z) {
                    c1198710hIb.LLILLL.setText(c1198710hIb.LL.getString(2131825251));
                    TuxTextView tuxTextView = c1198710hIb.LLILZ;
                    C444940Hca c444940Hca = new C444940Hca();
                    c444940Hca.LIZLLL(0);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_location_north_east_fill;
                    c444940Hca.LIZ = c419910GdJ;
                    c444940Hca.LIZJ = c1198710hIb.LL.getString(2131825250);
                    c444940Hca.LIZIZ = false;
                    c444940Hca.LIZIZ(52);
                    c444940Hca.LJIIIIZZ = new AwS562S0100000_18(awS562S0100000_18, 2452);
                    tuxTextView.setText(c444940Hca.LIZ(c1198710hIb.LL));
                }
            } else {
                c1198710hIb.LLILLL.setText(c1198710hIb.LL.getString(2131825249));
                TuxTextView tuxTextView2 = c1198710hIb.LLILZ;
                C444940Hca c444940Hca2 = new C444940Hca();
                c444940Hca2.LIZLLL(0);
                c444940Hca2.LIZJ = c1198710hIb.LL.getString(2131825248);
                c444940Hca2.LIZIZ = false;
                c444940Hca2.LIZIZ(52);
                c444940Hca2.LJIIIIZZ = new AwS562S0100000_18(c1198710hIb, 2451);
                tuxTextView2.setText(c444940Hca2.LIZ(c1198710hIb.LL));
            }
            C786410Ut5.I7(new AkS87S0100000_18(awS562S0100000_182, 49), c1198710hIb.LLILZIL);
        }
        Tp();
        Go().LJ(0, this.LLLFF);
        c1198890hIt.LJI(true);
    }

    @Override // X.InterfaceC1197930hHL
    public void Eb(boolean z) {
        HandlerHook.viewPost(LJJIJL(), new ARunnableS37S0110000_18(this, z, 0));
    }

    @Override // X.InterfaceC1141530foN
    public void mh2(C262100zr c262100zr) {
        String string;
        if (Intrinsics.LJFF(c262100zr.LIZ, "creatorStoreDetailChoosePoi")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                string = interfaceC1107590evd.getString("poi_id");
            } else {
                string = null;
            }
            jq(string);
        }
    }

    @Override // X.InterfaceC1197930hHL
    public void nf(String str) {
        this.LLJJL = str;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean zZL0;
        IPoiSearchAbility iPoiSearchAbility;
        C1548820qPI.LIZLLL("creatorStoreDetailChoosePoi", this);
        this.LLIZLLLIL = view;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (iPoiSearchAbility = (IPoiSearchAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), IPoiSearchAbility.class, null)) != null) {
            zZL0 = iPoiSearchAbility.zL0();
        } else {
            zZL0 = false;
        }
        this.LLJLL = zZL0;
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJL = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
        List<String> list = this.LLJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            Context context = view.getContext();
            c19741112Lp.getClass();
            arrayList.add(Boolean.valueOf(C19741112Lp.LIZLLL(context, str)));
        }
        this.LLJIJIL = arrayList;
        this.LLJILJIL = arrayList;
        this.LLJJLIIIJLLLLLLLZ = new C1198490hIF();
        C1198560hIM c1198560hIM = C1198560hIM.LIZ;
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            view3 = null;
        }
        Context context2 = view3.getContext();
        EnumC1198680hIY enumC1198680hIY = Jo().LLILLL;
        c1198560hIM.getClass();
        this.LLJJJ = C1198560hIM.LIZLLL(context2, enumC1198680hIY);
        Xp();
        super.onViewCreated(view);
        View view4 = this.LLIZLLLIL;
        if (view4 == null) {
            view4 = null;
        }
        this.LLJ = (C1749280vcc) view4.findViewById(R.id.w28);
        View view5 = this.LLIZLLLIL;
        if (view5 == null) {
            view5 = null;
        }
        this.LLJILJILJ = (TuxTextView) view5.findViewById(R.id.zim);
        Jp();
        Gp();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        final C1198830hIn c1198830hIn = new C1198830hIn(viewOnAttachStateChangeListenerC20604515jvGo);
        final AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 509);
        C786410Ut5.w3(viewOnAttachStateChangeListenerC20604515jvGo.getViewTreeObserver(), new ViewTreeObserver.OnDrawListener() { // from class: X.0hIN
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                InterfaceC1891350zJl next;
                C1198630hIT c1198630hIT;
                C1197720hH0 c1197720hH0;
                Long l;
                String str2;
                C1197720hH0 c1197720hH02;
                C1198830hIn c1198830hIn2 = c1198830hIn;
                C1198860hIq c1198860hIq = c1198830hIn2.LIZIZ;
                if (c1198860hIq == null || !Intrinsics.LJFF(c1198860hIq.LIZ, c1198830hIn2.LIZJ)) {
                    Iterator<InterfaceC1891350zJl> it2 = c1198830hIn.LIZ.getListItems().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (next instanceof C1198630hIT) {
                                break;
                            }
                        }
                    }
                    if (!(next instanceof C1198630hIT) || (c1198630hIT = (C1198630hIT) next) == null) {
                        return;
                    }
                    C1198610hIR c1198610hIR = c1198630hIT.LLILZ;
                    String str3 = c1198610hIR != null ? c1198610hIR.LIZJ : null;
                    C1198830hIn c1198830hIn3 = c1198830hIn;
                    C1198860hIq c1198860hIq2 = c1198830hIn3.LIZIZ;
                    if (c1198860hIq2 == null) {
                        c1198830hIn3.LIZIZ = new C1198860hIq();
                    } else if (Intrinsics.LJFF(c1198860hIq2.LIZ, str3)) {
                        return;
                    }
                    C1198860hIq c1198860hIq3 = c1198830hIn.LIZIZ;
                    if (c1198860hIq3 != null) {
                        c1198860hIq3.LIZ = str3;
                    }
                    C1198610hIR c1198610hIR2 = c1198630hIT.LLILZ;
                    if (c1198610hIR2 == null || (c1197720hH0 = c1198610hIR2.LJI) == null || (l = c1197720hH0.LIZJ) == null) {
                        return;
                    }
                    long jLongValue = l.longValue();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = jCurrentTimeMillis - jLongValue;
                    String str4 = (str3 == null || str3.length() == 0) ? "default_search_poi" : "search_poi";
                    c1197720hH0.LIZLLL = Long.valueOf(jCurrentTimeMillis);
                    Function1<C1197720hH0, Unit> function1 = awS597S0100000_18;
                    if (function1 != null) {
                        function1.invoke(c1197720hH0);
                    }
                    C1199460hJo c1199460hJo = C1199460hJo.LIZ;
                    C1199450hJn c1199450hJn = new C1199450hJn("poi_search_render");
                    c1199450hJn.LIZ(j);
                    c1199450hJn.LIZLLL = str4;
                    c1199460hJo.getClass();
                    C1199460hJo.LIZ(c1199450hJn);
                    Long l2 = c1197720hH0.LIZIZ;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        C1199450hJn c1199450hJn2 = new C1199450hJn("poi_search_single_latency");
                        c1199450hJn2.LIZ(jCurrentTimeMillis - jLongValue2);
                        C1198610hIR c1198610hIR3 = c1198630hIT.LLILZ;
                        if (c1198610hIR3 == null || (c1197720hH02 = c1198610hIR3.LJI) == null || (str2 = c1197720hH02.LIZ) == null) {
                            str2 = "";
                        }
                        c1199450hJn2.LIZLLL = str2;
                        C1199460hJo.LIZ(c1199450hJn2);
                    }
                }
            }
        });
        Jo().LLJLL = c1198830hIn;
        Go().setLayoutManager(new LinearLayoutManager(getContext()) { // from class: com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem.onViewCreated.3
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                LocationNetTracker.LocationNetRequestInfo locationNetRequestInfo;
                InterfaceC1891350zJl next;
                C1198630hIT c1198630hIT;
                String str2;
                C1197720hH0 c1197720hH0;
                Long l;
                String str3;
                super.onLayoutCompleted(c21673919s1);
                C1198830hIn c1198830hIn2 = c1198830hIn;
                C1198860hIq c1198860hIq = c1198830hIn2.LIZLLL;
                if (c1198860hIq != null && Intrinsics.LJFF(c1198860hIq.LIZ, c1198830hIn2.LIZJ)) {
                    return;
                }
                Iterator<InterfaceC1891350zJl> it2 = c1198830hIn2.LIZ.getListItems().iterator();
                while (true) {
                    locationNetRequestInfo = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof C1198630hIT) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (!(next instanceof C1198630hIT) || (c1198630hIT = (C1198630hIT) next) == null) {
                    return;
                }
                C1198610hIR c1198610hIR = c1198630hIT.LLILZ;
                if (c1198610hIR != null) {
                    str2 = c1198610hIR.LIZJ;
                } else {
                    str2 = null;
                }
                C1198860hIq c1198860hIq2 = c1198830hIn2.LIZLLL;
                if (c1198860hIq2 == null) {
                    c1198830hIn2.LIZLLL = new C1198860hIq();
                } else if (Intrinsics.LJFF(c1198860hIq2.LIZ, str2)) {
                    return;
                }
                C1198860hIq c1198860hIq3 = c1198830hIn2.LIZLLL;
                if (c1198860hIq3 != null) {
                    c1198860hIq3.LIZ = str2;
                }
                C1198610hIR c1198610hIR2 = c1198630hIT.LLILZ;
                if (c1198610hIR2 == null || (c1197720hH0 = c1198610hIR2.LJI) == null || (l = c1197720hH0.LIZJ) == null) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                if (str2 != null && str2.length() != 0) {
                    str3 = "search_poi";
                } else {
                    str3 = "default_search_poi";
                }
                C1199460hJo c1199460hJo = C1199460hJo.LIZ;
                C1199450hJn c1199450hJn = new C1199450hJn("poi_search_render_layout");
                c1199450hJn.LIZ(jCurrentTimeMillis);
                c1199450hJn.LIZLLL = str3;
                c1199460hJo.getClass();
                C1199460hJo.LIZ(c1199450hJn);
                PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = c1197720hH0.LJI;
                if (poiSearchResultWrapper != null) {
                    locationNetRequestInfo = poiSearchResultWrapper.LL;
                }
                LocationNetTracker.LIZIZ(locationNetRequestInfo, new AwS132S1100000_18(c1197720hH0, str2, 14));
            }
        });
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            C1196320hEk.LIZIZ(Go(), C1558360qeg.LJFF(fragmentLJIIJ, null));
        }
        C1192290h8F.LIZ(this, "poi_search_list", null, false, null, null, 30);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 510));
        kq();
        vq();
        xq();
        wq();
        zq();
        yq();
        Aq();
        hp(this, true);
        cp();
        PerfMonitorService perfMonitorService = (PerfMonitorService) PluggableExtentionKt.pluggableSpi$default(PerfMonitorService.class, false, false, false, 14, null);
        if (perfMonitorService != null) {
            perfMonitorService.LJ(Go(), "poi_search");
        }
        Cd();
    }

    public static final void hp(PoiSearchAssem poiSearchAssem, boolean z) {
        CertProviderManagerKt.findCert("bpea-poi_search_fetcher_location", 1476395008, "mttu");
        try {
            poiSearchAssem.No(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private final void up(boolean z, Function0<Unit> function0) {
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new C20509915Nh(new AwS562S0100000_18(this, 2026), new AwS562S0100000_18(function0, (Function0<Unit>) 2028), true);
        }
        C20509915Nh c20509915Nh = this.LLJJJJLIIL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZ();
        }
        C1749280vcc c1749280vcc = null;
        if (z) {
            C1749280vcc c1749280vcc2 = this.LLJ;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc2, 8);
            C1749280vcc c1749280vcc3 = this.LLJ;
            if (c1749280vcc3 != null) {
                c1749280vcc = c1749280vcc3;
            }
            C1626990sRN.LIZIZ(c1749280vcc.getContext());
            return;
        }
        C1749280vcc c1749280vcc4 = this.LLJ;
        if (c1749280vcc4 == null) {
            c1749280vcc4 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc4, 0);
        if (C0HW7.LIZ) {
            EnumC444680HcA enumC444680HcA = EnumC444680HcA.NO_NETWORK;
            C444630Hc5 c444630Hc5LIZ = C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.FIXED, (Float) null, 6), null, null, null, new C444560Hby(EnumC444580Hc0.SQUARED_BUTTON, 3, null, 1, new AwS419S0200000_18(this, (PoiSearchAssem) function0, (Function0<Unit>) 99), 4), new C444590Hc1(3));
            C1749280vcc c1749280vcc5 = this.LLJ;
            if (c1749280vcc5 == null) {
                c1749280vcc5 = null;
            }
            Context context = getContext();
            C1749280vcc c1749280vcc6 = this.LLJ;
            if (c1749280vcc6 == null) {
                c1749280vcc6 = null;
            }
            c1749280vcc5.setStatus(C444600Hc2.LIZ(context, c1749280vcc6, c444630Hc5LIZ));
            C1749280vcc c1749280vcc7 = this.LLJ;
            if (c1749280vcc7 != null) {
                c1749280vcc = c1749280vcc7;
            }
            C444690HcB.LIZ(enumC444680HcA, c1749280vcc);
            return;
        }
        C1749280vcc c1749280vcc8 = this.LLJ;
        if (c1749280vcc8 == null) {
            c1749280vcc8 = null;
        }
        Pair<String, String> pairLIZ = C1626990sRN.LIZ(c1749280vcc8.getContext());
        C1749280vcc c1749280vcc9 = this.LLJ;
        if (c1749280vcc9 != null) {
            c1749280vcc = c1749280vcc9;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        String first = pairLIZ.getFirst();
        String second = pairLIZ.getSecond();
        AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18(this, (PoiSearchAssem) function0, (Function0<Unit>) 98);
        Double dValueOf = Double.valueOf(72.0d);
        C1893080zMY.LIZJ(c1722300uv6, first, second, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), R.raw.icon_large_refresh, awS419S0200000_18);
        c1749280vcc.setStatus(c1722300uv6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022a  */
    @Override // X.InterfaceC1197930hHL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uh(java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem.uh(java.lang.String, boolean):void");
    }

    private final void fq(String str, TokenCert tokenCert, boolean z, final Function0<Unit> function0) {
        String str2;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        View view = this.LLIZLLLIL;
        if (view == null) {
            view = null;
        }
        Activity activity = (Activity) view.getContext();
        C1155340gAe c1155340gAeSp = sp();
        if (c1155340gAeSp == null || (str2 = c1155340gAeSp.LL) == null) {
            str2 = "video_post_page";
        }
        iLocationBaseServiceForMT.LJIJJLI("poi", "add_location", tokenCert, activity, new C1207520hWo("search_poi", str, null, str2, false, false, null, null, null, 500), new InterfaceC1207030hW1() { // from class: X.0hIk
            @Override // X.InterfaceC1207030hW1
            public final void LIZIZ(int i, String str3) {
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZJ(int i) {
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZ() {
                this.LIZ.Bq();
                function0.invoke();
            }
        }, true, z);
    }

    public final void Up(String str, TokenCert tokenCert, boolean z, final Function0<Unit> function0) {
        String str2;
        Activity activityLIZ;
        String str3;
        AbstractC1201400hMw abstractC1201400hMw = null;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        C1197760hH4.LIZ.getClass();
        String str4 = "video_post_page";
        View view = null;
        if (C1197760hH4.LIZ()) {
            if (iLocationBaseServiceForMT != null) {
                View view2 = this.LLIZLLLIL;
                if (view2 != null) {
                    view = view2;
                }
                if (iLocationBaseServiceForMT.LJII(view.getContext()) && (activityLIZ = C06MM.LIZ(getContext())) != null) {
                    Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
                    C1155340gAe c1155340gAeSp = sp();
                    if (c1155340gAeSp != null && (str3 = c1155340gAeSp.LL) != null) {
                        str4 = str3;
                    }
                    iLocationBaseServiceForMT.LIZLLL(activityLIZ, fragmentLJIIJ, new C1207520hWo("search_poi", str, null, str4, false, false, null, null, null, 500), new InterfaceC1207170hWF() { // from class: X.0hIc
                        @Override // X.InterfaceC1207170hWF
                        public final void LIZ(C1208240hXy c1208240hXy) {
                        }

                        @Override // X.InterfaceC1207170hWF
                        public final void LIZIZ(C1208000hXa c1208000hXa) {
                            if (c1208000hXa.LIZ == EnumC1207930hXT.Granted) {
                                this.LIZ.Bq();
                                function0.invoke();
                            }
                        }
                    }, "biz");
                    return;
                }
                return;
            }
            return;
        }
        boolean zLJIIJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIJ();
        boolean zLJJIJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJ();
        if (!z) {
            if (zLJIIJ) {
                abstractC1201400hMw = C1198920hIw.LIZIZ;
            } else {
                abstractC1201400hMw = C1198910hIv.LIZIZ;
            }
        }
        if (zLJIIJ || !zLJJIJ) {
            ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            C1155340gAe c1155340gAeSp2 = sp();
            if (c1155340gAeSp2 != null && (str2 = c1155340gAeSp2.LL) != null) {
                str4 = str2;
            }
            View view3 = this.LLIZLLLIL;
            if (view3 != null) {
                view = view3;
            }
            iLocationBaseServiceForMT2.LIZJ("search_poi", str4, (Activity) view.getContext(), abstractC1201400hMw, tokenCert, new AwS419S0200000_18(this, (PoiSearchAssem) function0, (Function0<Unit>) 97), null, null, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void aq(final com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem r21, com.bytedance.bpea.basics.Cert r22, java.lang.String r23, java.lang.String r24, final kotlin.jvm.functions.Function0 r25, boolean r26) {
        /*
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestPermission cert:"
            r2.append(r0)
            r1 = r22
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            java.lang.String r10 = "video_post_page"
            r9 = 0
            r11 = 0
            r2 = r21
            if (r26 == 0) goto L63
            X.0hWo r6 = new X.0hWo
            java.lang.String r7 = "video_post_page"
            java.lang.String r8 = "location_guide_text"
            X.0gAe r0 = r2.sp()
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.LL
            if (r0 == 0) goto L2a
            r10 = r0
        L2a:
            r16 = 500(0x1f4, float:7.0E-43)
            r12 = r11
            r13 = r9
            r14 = r9
            r15 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L33:
            X.0hWh r7 = X.C1207450hWh.LIZ
            android.view.View r0 = r2.LLIZLLLIL
            if (r0 != 0) goto L3a
            r0 = r9
        L3a:
            android.content.Context r0 = r0.getContext()
            boolean r0 = r7.LJII(r11, r0)
            if (r0 != 0) goto L62
            java.lang.String r8 = "poi"
            android.view.View r0 = r2.LLIZLLLIL
            if (r0 == 0) goto L4b
            r9 = r0
        L4b:
            android.content.Context r3 = r9.getContext()
            android.app.Activity r3 = (android.app.Activity) r3
            X.0hIZ r0 = new X.0hIZ
            r4 = r25
            r0.<init>()
            r14 = 0
            r9 = r24
            r10 = r1
            r11 = r3
            r12 = r6
            r13 = r0
            r7.LJIJJ(r8, r9, r10, r11, r12, r13, r14)
        L62:
            return
        L63:
            X.0hWo r6 = new X.0hWo
            java.lang.String r13 = "search_poi"
            X.0gAe r0 = r2.sp()
            if (r0 == 0) goto L72
            java.lang.String r0 = r0.LL
            if (r0 == 0) goto L72
            r10 = r0
        L72:
            X.0C64 r5 = X.C0C64.LJIILLIIL()
            java.lang.String r4 = "poi_search_page_permission_popup"
            r3 = 31744(0x7c00, float:4.4483E-41)
            r0 = 1
            int r3 = r5.LJIJ(r3, r0, r4, r11)
            r0 = 2
            if (r3 != r0) goto Laa
            X.0gAe r0 = r2.sp()
            if (r0 == 0) goto La8
            java.lang.String r3 = r0.LL
        L8a:
            java.lang.String r0 = "video_edit_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto Laa
            r17 = 1
        L94:
            r22 = 484(0x1e4, float:6.78E-43)
            r14 = r23
            r12 = r6
            r15 = r9
            r16 = r10
            r18 = r11
            r19 = r9
            r20 = r9
            r21 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L33
        La8:
            r3 = r9
            goto L8a
        Laa:
            r17 = 0
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem.aq(com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem, com.bytedance.bpea.basics.Cert, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, boolean):void");
    }
}
