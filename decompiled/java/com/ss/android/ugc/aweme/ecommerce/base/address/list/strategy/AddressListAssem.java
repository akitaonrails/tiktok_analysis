package com.ss.android.ugc.aweme.ecommerce.base.address.list.strategy;

import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.AnonymousClass0408;
import X.C013C;
import X.C01D1;
import X.C01GW;
import X.C034S;
import X.C036A;
import X.C03NS;
import X.C0OM1;
import X.C1120604Zw;
import X.C1121904a9;
import X.C118300cf;
import X.C1237450iJ5;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1637806bA;
import X.C1741890vQh;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C1AQS;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C2371409Qy;
import X.C259800zU;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C7879035x;
import X.C817603Hi;
import X.C955103oL;
import X.C976403rm;
import X.C985403tE;
import X.EnumC955203oM;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC990303u1;
import X.InterfaceC990403u2;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeDialogMessage;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;
import pha.d;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressListAssem extends UIContentAssem implements c, InterfaceC990403u2, InterfaceC1164530gPT, InterfaceC990303u1 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public int LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public LinearLayout LLJJIII;
    public TuxNavBar LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public C1749280vcc LLJJIJIL;
    public TuxTextView LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddressListAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/address/list/AddressListAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddressListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressListAssemViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 63), AFwS228S0000000_1.get$arr$(42), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 61));
        this.LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 64));
        this.LLJIJIL = 1;
        this.LLJILJILJ = true;
        this.LLJILLL = "other reason";
        this.LLJJ = true;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "AddressListAssem";
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final AddressListAssemViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (AddressListAssemViewModel) assemVMLazy.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0378.LIZ().LIZJ("ec_show_notice_dialog", this);
        AnonymousClass0378.LIZ().LIZJ("ec_show_notice_exception_ux_dialog", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C036A.LIZIZ() ? "close" : "return";
        if (Go().LLJILLL) {
            c259800zU.element = "next";
        }
        withState(Go(), new AwS367S0200000_1(this, (AddressListAssem) c259800zU, (C259800zU<String>) 38));
    }

    @Override // X.InterfaceC990403u2
    public final void Cb(Function0<Unit> function0) {
        withState(Go(), new AwS580S0100000_1(this, 772));
    }

    @Override // X.InterfaceC990303u1
    public final boolean K4(Map<String, String> map) {
        AddressListAssemViewModel addressListAssemViewModelGo = Go();
        C013C c013c = new C013C();
        addressListAssemViewModelGo.ml(new AwS367S0200000_1(c013c, (C013C) map, (Map<String, String>) 35));
        if (c013c.element) {
            return true;
        }
        AddressListAssemViewModel addressListAssemViewModelGo2 = Go();
        C118300cf c118300cf = new C118300cf();
        addressListAssemViewModelGo2.ml(new AwS580S0100000_1(c118300cf, 62));
        if (c118300cf.element == -1) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
            if (viewOnAttachStateChangeListenerC20604515jv == null) {
                viewOnAttachStateChangeListenerC20604515jv = null;
            }
            if (viewOnAttachStateChangeListenerC20604515jv.getChildCount() > 0) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJI;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                    viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv3;
                }
                if (viewOnAttachStateChangeListenerC20604515jv2.getHeight() > 0) {
                    return false;
                }
            }
            ((HashMap) map).put("blank_type", "empty_view");
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Intent intent;
        String stringExtra;
        Intent intent2;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        Intent intent3;
        super.onViewCreated(view);
        this.LLJILJIL = SystemClock.elapsedRealtime();
        this.LLJJI = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ah9);
        this.LLJJIII = (LinearLayout) view.findViewById(R.id.nic);
        this.LLJJIJI = (TuxNavBar) view.findViewById(R.id.xzl);
        this.LLJJIJIIJIL = (C197039127h) view.findViewById(R.id.cmg);
        this.LLJJIJIL = (C1749280vcc) view.findViewById(R.id.w0t);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.tv_policy);
        C976403rm c976403rm = AddressPageStarter.AddressListEnterParams.Companion;
        C19EG activity = getActivity();
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        c976403rm.getClass();
        AddressPageStarter.AddressListEnterParams addressListEnterParamsLIZIZ = C976403rm.LIZIZ(intent);
        C19EG activity2 = getActivity();
        if (activity2 != null && (intent3 = activity2.getIntent()) != null) {
            try {
                stringExtra = intent3.getStringExtra("lib_track_rtn_id");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        Go().wQ2(addressListEnterParamsLIZIZ, stringExtra, null);
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
            if (viewOnAttachStateChangeListenerC20604515jv == null) {
                viewOnAttachStateChangeListenerC20604515jv = null;
            }
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("biz_type", null), new Pair("region", null), new Pair("page_name", "shipping_info"), new Pair("template", null));
            String str = (String) mapLJIIIIZZ.get("biz_type");
            if (str != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str);
            } else {
                numLJIIJJI = null;
            }
            EnumC955203oM enumC955203oMLIZ = C955103oL.LIZ(numLJIIJJI);
            String str2 = (String) mapLJIIIIZZ.get("page_name");
            String str3 = (String) mapLJIIIIZZ.get("region");
            String str4 = (String) mapLJIIIIZZ.get("template");
            if (str4 != null) {
                numLJIIJJI2 = C2095008Iq.LJIIJJI(str4);
            } else {
                numLJIIJJI2 = null;
            }
            AnonymousClass0408 anonymousClass0408 = AnonymousClass0408.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            anonymousClass0408.getClass();
            IComponentStrategyService iComponentStrategyServiceLIZLLL = AnonymousClass0408.LIZLLL(enumC955203oMLIZ, str2, str3, numLJIIJJI2);
            if (iComponentStrategyServiceLIZLLL == null) {
                iComponentStrategyServiceLIZLLL = new DefaultAddressListStrategyService();
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJI;
            if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
                viewOnAttachStateChangeListenerC20604515jv2 = null;
            }
            iComponentStrategyServiceLIZLLL.LIZLLL(viewOnAttachStateChangeListenerC20604515jv2);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJI;
            if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
                viewOnAttachStateChangeListenerC20604515jv3 = null;
            }
            viewOnAttachStateChangeListenerC20604515jv3.setLifecycleOwner(activity3);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJI;
            if (viewOnAttachStateChangeListenerC20604515jv4 == null) {
                viewOnAttachStateChangeListenerC20604515jv4 = null;
            }
            viewOnAttachStateChangeListenerC20604515jv4.setLayoutManager(new LinearLayoutManager(getContext()));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IPerformanceOptDependencyService.class.getName();
                if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
            }
            C03NS c03nsCreateFpsMonitor = ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).createFpsMonitor("tiktokec_anchor_shipping_info");
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJI;
            if (viewOnAttachStateChangeListenerC20604515jv5 == null) {
                viewOnAttachStateChangeListenerC20604515jv5 = null;
            }
            c03nsCreateFpsMonitor.LIZIZ(viewOnAttachStateChangeListenerC20604515jv5);
            if (Go().d41()) {
                LinearLayout linearLayout = this.LLJJIII;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                C786410Ut5.LJLLLLLL(0, linearLayout);
                TuxNavBar tuxNavBar = this.LLJJIJI;
                if (tuxNavBar == null) {
                    tuxNavBar = null;
                }
                C0OM1 c0om1 = new C0OM1();
                C1237450iJ5.LIZ(c0om1, activity3.getString(2131832973), activity3);
                tuxNavBar.setNavActions(c0om1);
                C197039127h c197039127h = this.LLJJIJIIJIL;
                if (c197039127h == null) {
                    c197039127h = null;
                }
                C786410Ut5.I7(new AjS60S0100000_1(this, 105), c197039127h);
            } else {
                LinearLayout linearLayout2 = this.LLJJIII;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                C786410Ut5.LJLLLLLL(8, linearLayout2);
                TuxNavBar tuxNavBar2 = this.LLJJIJI;
                if (tuxNavBar2 == null) {
                    tuxNavBar2 = null;
                }
                C0OM1 c0om12 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                int iLJLIL = ((d) this.LLJI.getValue()).LJLIL();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = iLJLIL;
                c1251150ifB.LJIIIIZZ = C786410Ut5.M3(C7879035x.LIZ()).getString(2131823332);
                c1251150ifB.LIZJ(new AwS545S0100000_1(activity3, 1655));
                c0om12.LJ(c1251150ifB);
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = activity3.getString(((d) this.LLJI.getValue()).LJIILL());
                c0om12.LIZJ = c1250250idj;
                c0om12.LIZLLL = true;
                tuxNavBar2.setNavActions(c0om12);
            }
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.03tG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((AddressListState) obj).getStatus());
            }
        }, null, new AwS615S0100000_1(this, 197), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.03tO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressItems();
            }
        }, null, new AwS615S0100000_1(this, 198), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.03tK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressListState) obj).getAddressState();
            }
        }, null, new AwS615S0100000_1(this, 199), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.03tQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressListState) obj).getSelectAddressId();
            }
        }, null, new AwS615S0100000_1(this, 200), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.03tM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddressListState) obj).getPolicyItemVO();
            }
        }, null, new AwS615S0100000_1(this, 196), 6);
        AnonymousClass0378.LIZ().LIZLLL("ec_show_notice_dialog", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_show_notice_exception_ux_dialog", this);
        Go().It0(null);
        if (!Go().LLJJJJJIL.LIZ) {
            C19EG activity4 = getActivity();
            if (activity4 != null && (intent2 = activity4.getIntent()) != null) {
                Go().LLJJJJJIL.LJIILIIL(intent2);
            }
            C19EG activity5 = getActivity();
            if (activity5 != null) {
                C817603Hi c817603Hi = Go().LLJJJJJIL;
                String str5 = c817603Hi.LIZJ;
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                btmSDK.registerBtmPageOnCreate(activity5, "a2270.b3894", str5);
                c817603Hi.LIZ = true;
                c817603Hi.LIZLLL = btmSDK.getPageId(PageFinder.via(activity5));
            }
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        C19EG activity;
        Type type2;
        if (Intrinsics.LJFF(str, "ec_show_notice_dialog")) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(NoticeDialogMessage.class));
                } else {
                    type = new TypeToken<NoticeDialogMessage>() { // from class: X.03tS
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof NoticeDialogMessage)) {
                    objFromJson = null;
                }
                NoticeDialogMessage noticeDialogMessage = (NoticeDialogMessage) objFromJson;
                if (noticeDialogMessage != null && (activity = getActivity()) != null) {
                    C1397580mTM c1397580mTM = new C1397580mTM(activity);
                    String str3 = noticeDialogMessage.titleText;
                    if (str3 != null) {
                        c1397580mTM.LJI(str3);
                    }
                    String str4 = noticeDialogMessage.contentText;
                    if (str4 != null) {
                        c1397580mTM.LIZIZ(str4);
                    }
                    String str5 = noticeDialogMessage.confirmButtonText;
                    if (str5 != null) {
                        C985403tE.LIZ(c1397580mTM, new AwS115S1100000_1(activity, str5, 41));
                    }
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return;
                }
                return;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (Intrinsics.LJFF(str, "ec_show_notice_exception_ux_dialog")) {
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJII(ExceptionUX.class));
                } else {
                    type2 = new TypeToken<ExceptionUX>() { // from class: X.03tI
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type2);
                if (!(objFromJson2 instanceof ExceptionUX)) {
                    objFromJson2 = null;
                }
                ExceptionUX exceptionUX = (ExceptionUX) objFromJson2;
                if (exceptionUX != null) {
                    Go();
                    AddressListAssemViewModel.yQ2(getContext(), exceptionUX, new AwS545S0100000_1(this, 62));
                }
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
