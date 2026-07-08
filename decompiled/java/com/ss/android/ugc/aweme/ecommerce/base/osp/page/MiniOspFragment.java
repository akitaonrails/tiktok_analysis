package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AnonymousClass0317;
import X.AnonymousClass0368;
import X.AnonymousClass0408;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C034S;
import X.C03H5;
import X.C03JV;
import X.C03KR;
import X.C03O1;
import X.C03P5;
import X.C03T7;
import X.C03VO;
import X.C03WX;
import X.C03XA;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1383230m6D;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1389920mH0;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1725830v0n;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C1AQS;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23271099x;
import X.C2341109Fh;
import X.C2371409Qy;
import X.C338490DOt;
import X.C343970De7;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C817603Hi;
import X.C827303Lb;
import X.C886203dE;
import X.C894803ec;
import X.C897103ez;
import X.C897503f3;
import X.C904203g8;
import X.C914303hl;
import X.C948503nH;
import X.C955103oL;
import X.C985403tE;
import X.C987103tV;
import X.C989403ts;
import X.EnumC837803Pc;
import X.EnumC872903b5;
import X.InterfaceC0148002o;
import X.InterfaceC1058150ddt;
import X.InterfaceC1164530gPT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC911603hK;
import X.InterfaceC988703tl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS29S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipOpenCashierParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipPaymentMethodChangeEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoPaymentFailedPopupMessage;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayMiddleFailedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniOspFragment extends ECBaseFragment implements InterfaceC988703tl, InterfaceC1164530gPT, c, InterfaceC724530SbT, InterfaceC1058150ddt {
    public static final C03T7 LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static MiniOspFragment LLJJJJLIIL = null;
    public static boolean LLJJL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvHELIOSLGExKTYpZyAgOGs8KCg2ZgglJyYcOzUKOy40JSAiPQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public FrameLayout LLILZ;
    public FrameLayout LLILZIL;
    public TuxNavBar LLILZLL;
    public C1749280vcc LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public C03O1 LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public final BPEAHandler LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public C1397510mTF LLJJIJIL;
    public C1397510mTF LLJJJ;
    public final AsS29S0100000_1 LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MiniOspFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/MiniOspViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJ = new C03T7();
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void MR() {
        C817603Hi.LJFF = null;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "mini_order_submit";
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "OrderSubmitFragment";
    }

    public MiniOspFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MiniOspViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 866);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(138);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 867), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 868), aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 869), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 863));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 864));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 865));
        this.LLJJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJIL = new AsS29S0100000_1(this, 1);
    }

    public final MiniOspViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (MiniOspViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        WR().LLLFF.LJIIL(this, "a2270.b2768", null);
        ModuleManager moduleManager = WR().LLLFFI;
        if (moduleManager != null) {
            String str = WR().LLLFF.LIZJ;
            if (str == null) {
                str = "";
            }
            moduleManager.LJJIIZ = str;
        }
        C817603Hi.LJFF = WR().LLLFF.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1250250idj VR() {
        /*
            r8 = this;
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131832958(0x7f11307e, float:1.9298985E38)
            java.lang.String r3 = r1.getString(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r0 = r8.WR()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r0.LLIZ
            r4 = 0
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.paymentMethods
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText r1 = r0.topSecurityText
            if (r1 == 0) goto Lb1
            java.lang.String r2 = r1.getLink()
            java.lang.String r0 = r1.getText()
            if (r0 == 0) goto Lb2
            boolean r0 = X.C770702zh.LIZIZ(r2)
            if (r0 == 0) goto Lb2
            r5 = 1
        L2d:
            if (r1 == 0) goto L81
            java.lang.String r0 = r1.getText()
            if (r0 == 0) goto L81
            java.lang.String r7 = r1.getText()
        L39:
            X.0idj r6 = new X.0idj
            r6.<init>()
            r6.LIZJ = r3
            boolean r0 = X.C897103ez.LIZ()
            if (r0 != 0) goto L48
            if (r5 == 0) goto L80
        L48:
            com.bytedance.tux.navigation.TuxNavBar r3 = r8.LLILZLL
            if (r5 == 0) goto L53
            r0 = 2130772921(0x7f0103b9, float:1.7148974E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L53:
            r1 = 2131100635(0x7f0603db, float:1.7813657E38)
            r0 = 2130774665(0x7f010a89, float:1.7152511E38)
            android.text.SpannableString r0 = X.C908903gt.LIZIZ(r3, r7, r1, r0, r4)
            r6.LIZLLL = r0
            kotlin.jvm.internal.AwS14S1110000_1 r1 = new kotlin.jvm.internal.AwS14S1110000_1
            r0 = 0
            r1.<init>(r5, r8, r2, r0)
            r6.LIZ(r1)
            com.bytedance.tux.navigation.TuxNavBar r4 = r8.LLILZLL
            if (r4 == 0) goto L80
            X.049G r3 = new X.049G
            r3.<init>()
            r0 = 48
            kotlin.jvm.internal.AFwS185S0000000_1 r2 = kotlin.jvm.internal.AFwS185S0000000_1.get$arr$(r0)
            kotlin.jvm.internal.AwS89S0110000_1 r1 = new kotlin.jvm.internal.AwS89S0110000_1
            r0 = 3
            r1.<init>(r5, r8, r0)
            X.C1748720vbi.LJFF(r4, r3, r2, r1)
        L80:
            return r6
        L81:
            boolean r0 = X.C870903al.LIZ()
            r1 = 2131832780(0x7f112fcc, float:1.9298623E38)
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r0 = r8.WR()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r0.LLIZ
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling r0 = r0.starlingTexts
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.guaranteeInfo
            if (r0 == 0) goto L9e
            java.lang.String r7 = r0.text
            if (r7 != 0) goto L39
        L9e:
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String r7 = r0.getString(r1)
            goto L39
        La7:
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String r7 = r0.getString(r1)
            goto L39
        Lb0:
            r1 = r4
        Lb1:
            r2 = r4
        Lb2:
            r5 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment.VR():X.0idj");
    }

    public final void finish() {
        IEventCenter iEventCenter;
        if (WR().LLLLIILL) {
            return;
        }
        WR().LLLLIILL = true;
        if (WR().PQ2().LIZIZ() && (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) != null) {
            iEventCenter.LIZ("ec_close_mini_osp", C1741890vQh.LJIIIIZZ(WR().wQ2(WR().LLLF)));
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        WR().LLJJIJI = "return";
        finish();
        return false;
    }

    @Override // X.InterfaceC988703tl
    public final boolean onBackPressed() {
        WR().LLJJIJI = "return";
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LLJJJJ.getClass();
        C03T7.LIZIZ("MiniOspFragment#onDestroy", false);
        C03O1 c03o1 = this.LLJI;
        if (c03o1 != null) {
            c03o1.LJIJJ(WR().LLJJIJI);
        }
        LLJJJJLIIL = null;
        C03O1 c03o12 = this.LLJI;
        if (c03o12 != null) {
            c03o12.LIZ.clear();
            c03o12.LIZIZ = -1L;
            c03o12.LJI = -1L;
            c03o12.LJII = -1L;
            c03o12.LJIIIIZZ = 0;
            c03o12.LIZJ = -1L;
            c03o12.LIZLLL = -1L;
            c03o12.LJ = -1L;
            c03o12.LJFF = -1L;
            ((ArrayList) c03o12.LJIIIZ).clear();
            ((ArrayList) c03o12.LJIIJ).clear();
            ((ArrayList) c03o12.LJIIL).clear();
            ((ArrayList) c03o12.LJIIJJI).clear();
            ((ArrayList) c03o12.LJIILIIL).clear();
            ((ArrayList) c03o12.LJIILJJIL).clear();
            ((ArrayList) c03o12.LJIILL).clear();
            c03o12.LJIILLIIL.LIZ = null;
            c03o12.LJIJJLI = null;
            c03o12.LJIL = null;
            BPEAHandler bPEAHandler = c03o12.LJIJ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacks(c03o12.LJJ);
            }
            c03o12.LJIJ = null;
            c03o12.LJIJI = false;
        }
        MiniOspViewModel miniOspViewModelWR = WR();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_osp_resend_order_create", miniOspViewModelWR);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_payment_change_mini_osp", miniOspViewModelWR);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_payment_refresh_cashier", miniOspViewModelWR);
        }
        C914303hl.LIZ.getClass();
        C914303hl.LIZJ(this);
        IEventCenter iEventCenter4 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter4 != null) {
            iEventCenter4.LIZJ("ec_pay_middle_successed", this);
        }
        IEventCenter iEventCenter5 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter5 != null) {
            iEventCenter5.LIZJ("ec_pay_middle_failed", this);
        }
        IEventCenter iEventCenter6 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter6 != null) {
            iEventCenter6.LIZJ("ec_resend_pay_request", this);
        }
        IEventCenter iEventCenter7 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter7 != null) {
            iEventCenter7.LIZJ("ec_payment_error_dialog", this);
        }
        IEventCenter iEventCenter8 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter8 != null) {
            iEventCenter8.LIZJ("ec_pipo_change_payment_method", this);
        }
        IEventCenter iEventCenter9 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter9 != null) {
            iEventCenter9.LIZJ("ec_membership_open_cashier", this);
        }
        IEventCenter iEventCenter10 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter10 != null) {
            iEventCenter10.LIZJ("payment_ccdc_bindcard_tips", this);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(MiniOspFragment.class.getName());
        }
        super.onResume();
        C03O1 c03o1 = this.LLJI;
        if (c03o1 != null) {
            c03o1.LIZIZ = SystemClock.elapsedRealtime();
        }
        LLJJJJ.getClass();
        C03T7.LIZIZ("MiniOspFragment#onResume", true);
        if (WR().LLLLLIL) {
            WR().LLLLLIL = false;
            MiniOspViewModel.eR2(WR(), false, false, false, null, null, 127);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        IECommerceHostService iECommerceHostService;
        super.onStart();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor == null || !rootPageMonitor.LJFF()) {
            return;
        }
        C03O1 c03o1 = this.LLJI;
        if (c03o1 != null) {
            c03o1.LJ = SystemClock.elapsedRealtime();
            c03o1.LJFF += SystemClock.elapsedRealtime() - c03o1.LIZLLL;
        }
        MiniOspViewModel miniOspViewModelWR = WR();
        miniOspViewModelWR.withState(new AwS580S0100000_1(miniOspViewModelWR, 405));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        IECommerceHostService iECommerceHostService;
        C03O1 c03o1;
        super.onStop();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor != null && rootPageMonitor.LJFF()) {
            C03O1 c03o12 = this.LLJI;
            if (c03o12 != null) {
                c03o12.LIZLLL = SystemClock.elapsedRealtime();
            }
            WR().LLJJIJI = "close";
            C03O1 c03o13 = this.LLJI;
            if (c03o13 != null) {
                c03o13.LJIJJ(WR().LLJJIJI);
            }
        }
        if (C904203g8.LJIIJ || (c03o1 = this.LLJI) == null) {
            return;
        }
        C03O1.LJIJ(c03o1, WR().LLJJIII, WR().LLJJIJI, WR().hi1(true), WR().LLLFF.LJIIJ(), WR().LLJZ, Boolean.valueOf(WR().DQ2()), Boolean.valueOf(WR().LLLF), 3576);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        String strLIZIZ;
        String string;
        BillInfoData billInfoData;
        List<ShopOrderNew> list;
        String string2;
        BillInfoData billInfoData2 = WR().LLIZ;
        if (billInfoData2 == null || billInfoData2.addonOrder == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("addon_order,");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (strLIZIZ.length() > 0) {
            ((HashMap) map).put("ui_elements_data", strLIZIZ);
        }
        MiniOspViewModel miniOspViewModelWR = WR();
        C03JV c03jv = (C03JV) miniOspViewModelWR.vmDispatcher.getState();
        Map<String, Object> mapLJIIJ = miniOspViewModelWR.LLLFF.LJIIJ();
        if (mapLJIIJ != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string2 = value.toString()) == null) {
                    string2 = "";
                }
                ((HashMap) map).put(key, string2);
            }
        }
        if (c03jv.LL != 0) {
            Integer num = miniOspViewModelWR.LLLILZJ;
            if (num == null || (string = num.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            HashMap map2 = (HashMap) map;
            map2.put("biz_type", string);
            map2.put("content_list_size", String.valueOf(c03jv.LLILLJJLI.size()));
            int i = c03jv.LL;
            if (i != 2 && i != 3) {
                BillInfoData billInfoData3 = miniOspViewModelWR.LLIZ;
                if (billInfoData3 != null && billInfoData3.LJ().length != 0 && (billInfoData = miniOspViewModelWR.LLIZ) != null && (list = billInfoData.newShopOrders) != null && !list.isEmpty()) {
                    if (c03jv.LLILLJJLI.isEmpty()) {
                        map2.put("blank_type", "empty_data_list");
                    }
                } else {
                    map2.put("blank_type", "no_meta_data");
                    return true;
                }
            } else {
                map2.put("blank_type", "error_status");
                return true;
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (viewOnAttachStateChangeListenerC20604515jv.getChildCount() > 0 && viewOnAttachStateChangeListenerC20604515jv.getHeight() > 0)) {
            return false;
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 116));
    }

    public final void bu(String str) {
        ConstraintLayout constraintLayout = this.LLIZLLLIL;
        if (constraintLayout != null) {
            C1383230m6D c1383230m6D = new C1383230m6D(new C1389920mH0(str, null, null, 8189), 30);
            C1389890mGx c1389890mGx = new C1389890mGx(constraintLayout);
            c1389890mGx.LIZ = c1383230m6D;
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ModuleManager moduleManager = WR().LLLFFI;
        if (moduleManager != null) {
            moduleManager.LJIIIZ(this);
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        if (WR().PQ2().LIZ()) {
            tuxImmersionBarLIZLLL.LJIIIZ(0);
        } else {
            tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        }
        tuxImmersionBarLIZLLL.LIZLLL();
        LLJJJJLIIL = this;
        C03O1 c03o1 = WR().LLILZLL;
        this.LLJI = c03o1;
        if (c03o1 != null) {
            HashMap<String, Object> map = WR().LLJJJJ;
            ConcurrentHashMap<String, Object> concurrentHashMap = c03o1.LIZ;
            if (map != null) {
                concurrentHashMap.putAll(map);
            }
        }
        C03O1 c03o12 = this.LLJI;
        Context contextN3 = null;
        if (c03o12 != null) {
            ConcurrentHashMap<String, Object> concurrentHashMap2 = c03o12.LIZ;
            concurrentHashMap2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            concurrentHashMap2.put("page_name", "mini_order_submit");
            c03o12.LIZJ = SystemClock.elapsedRealtime();
            c03o12.LJIJ = new BPEAHandler(Looper.getMainLooper());
            c03o12.LJIJI = false;
            c03o12.LJIILLIIL.LIZ = null;
        }
        MiniOspViewModel miniOspViewModelWR = WR();
        int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(miniOspViewModelWR.LLLILZJ), "order_submit", null, null, 12);
        BillInfoData billInfoData = miniOspViewModelWR.LLIZ;
        if (billInfoData == null) {
            C03WX c03wx = miniOspViewModelWR.LLJJL;
            if (c03wx != null) {
                if (c03wx.LJII != null) {
                    miniOspViewModelWR.jR2(0);
                    C948503nH.LJI(miniOspViewModelWR, C23271099x.INSTANCE, new C03KR(miniOspViewModelWR, iLJIIJJI, null));
                } else if (c03wx != null && c03wx.LJIIIIZZ != null) {
                    miniOspViewModelWR.jR2(0);
                    miniOspViewModelWR.setState(new AwS16S0010000_1(true, 23));
                    C948503nH.LJI(miniOspViewModelWR, C23271099x.INSTANCE, new C827303Lb(miniOspViewModelWR, iLJIIJJI, null));
                }
            }
        } else {
            contextN3 = null;
            miniOspViewModelWR.zQ2(billInfoData, new BillInfoRequest(null, 0, null, true, true, true, AnonymousClass0368.LIZ(), null, null, null, null, true, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, iLJIIJJI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), true, null, null);
            if (miniOspViewModelWR.LLJLLL) {
                miniOspViewModelWR.LLJLLL = false;
                BillInfoData billInfoData2 = miniOspViewModelWR.LLIZ;
                if (billInfoData2 != null) {
                    miniOspViewModelWR.WQ2(billInfoData2);
                }
            }
        }
        C914303hl.LIZ.getClass();
        C914303hl.LJ("order_submit");
        C914303hl.LIZLLL(this, "order_submit");
        if (C897103ez.LIZ()) {
            Context context = getContext();
            if (context != null) {
                contextN3 = C786410Ut5.N3(context);
            }
            C1725830v0n.LIZ(contextN3, C989403ts.LIZ());
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_pay_middle_successed", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_pay_middle_failed", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZLLL("ec_resend_pay_request", this);
        }
        IEventCenter iEventCenter4 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter4 != null) {
            iEventCenter4.LIZLLL("ec_payment_error_dialog", this);
        }
        IEventCenter iEventCenter5 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter5 != null) {
            iEventCenter5.LIZLLL("ec_pipo_change_payment_method", this);
        }
        IEventCenter iEventCenter6 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter6 != null) {
            iEventCenter6.LIZLLL("ec_membership_open_cashier", this);
        }
        IEventCenter iEventCenter7 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter7 != null) {
            iEventCenter7.LIZLLL("payment_ccdc_bindcard_tips", this);
        }
        MiniOspViewModel miniOspViewModelWR2 = WR();
        IEventCenter iEventCenter8 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter8 != null) {
            iEventCenter8.LIZLLL("ec_osp_resend_order_create", miniOspViewModelWR2);
        }
        IEventCenter iEventCenter9 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter9 != null) {
            iEventCenter9.LIZLLL("ec_payment_change_mini_osp", miniOspViewModelWR2);
        }
        IEventCenter iEventCenter10 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter10 != null) {
            iEventCenter10.LIZLLL("ec_payment_refresh_cashier", miniOspViewModelWR2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C03O1 c03o1;
        String str3;
        Type type;
        String string;
        C19EG activity;
        Context context;
        String str4;
        Type type2;
        C03VO c03vo;
        Type type3;
        PaymentMethodsData paymentMethodsData;
        PaymentMethod paymentMethodLIZIZ;
        C19EG c19egLIZIZ;
        n nVar;
        ShippingAddress shippingAddress;
        Type type4;
        String str5;
        Type type5;
        C03VO c03vo2;
        PaymentMethod paymentMethod = null;
        address = null;
        Address address = null;
        switch (str.hashCode()) {
            case -1413704395:
                if (str.equals("ec_resend_pay_request")) {
                    C736680Sv4.LJIJJ(WR(), new AwS580S0100000_1(this, 117));
                }
                break;
            case -247382535:
                if (str.equals("ec_payment_error_dialog")) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type5 = C2371409Qy.LIZJ(C13LE.LJII(C03VO.class));
                        } else {
                            type5 = new TypeToken<C03VO>() { // from class: X.03Ta
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type5);
                        if (!(objFromJson instanceof C03VO)) {
                            objFromJson = null;
                        }
                        c03vo2 = (C03VO) objFromJson;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (c03vo2 != null) {
                        str5 = c03vo2.LIZ;
                    } else {
                        str5 = null;
                    }
                    try {
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1AF0.LJ(e2);
                        return;
                    }
                }
                break;
            case -63025501:
                if (str.equals("ec_pipo_change_payment_method")) {
                    try {
                        Gson gsonLJFF2 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                            type4 = C2371409Qy.LIZJ(C13LE.LJII(MembershipPaymentMethodChangeEvent.class));
                        } else {
                            type4 = new TypeToken<MembershipPaymentMethodChangeEvent>() { // from class: X.03Tf
                            }.getType();
                        }
                        Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type4);
                        if (!(objFromJson2 instanceof MembershipPaymentMethodChangeEvent)) {
                            objFromJson2 = null;
                        }
                        MembershipPaymentMethodChangeEvent membershipPaymentMethodChangeEvent = (MembershipPaymentMethodChangeEvent) objFromJson2;
                        if (membershipPaymentMethodChangeEvent != null && Intrinsics.LJFF(membershipPaymentMethodChangeEvent.type, "add_new_payment_method")) {
                            MiniOspViewModel.eR2(WR(), false, false, false, null, null, 127);
                            break;
                        }
                    } catch (s e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return;
                    }
                }
                break;
            case 175485686:
                if (str.equals("ec_membership_open_cashier")) {
                    Context activity2 = getActivity();
                    if (activity2 != null || (activity2 = getContext()) != null) {
                        try {
                            Gson gsonLJFF3 = C1741890vQh.LJFF();
                            C1120604Zw.LIZ.getClass();
                            C1121904a9 c1121904a9LIZIZ3 = C1120604Zw.LIZIZ();
                            if (c1121904a9LIZIZ3 != null && c1121904a9LIZIZ3.LJII) {
                                type3 = C2371409Qy.LIZJ(C13LE.LJII(MembershipOpenCashierParams.class));
                            } else {
                                type3 = new TypeToken<MembershipOpenCashierParams>() { // from class: X.03Te
                                }.getType();
                            }
                            Object objFromJson3 = GsonProtectorUtils.fromJson(gsonLJFF3, str2, type3);
                            if (!(objFromJson3 instanceof MembershipOpenCashierParams)) {
                                objFromJson3 = null;
                            }
                            MembershipOpenCashierParams membershipOpenCashierParams = (MembershipOpenCashierParams) objFromJson3;
                            if (membershipOpenCashierParams != null) {
                                C2341109Fh.LIZ.getClass();
                                C2341109Fh.LJ("ec_membership_open_cashier");
                                MiniOspViewModel miniOspViewModelWR = WR();
                                C886203dE.LIZ.getClass();
                                if (C886203dE.LJIIIZ(membershipOpenCashierParams)) {
                                    BillInfoData billInfoData = miniOspViewModelWR.LLIZ;
                                    if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (paymentMethodLIZIZ = C886203dE.LIZIZ(paymentMethodsData, membershipOpenCashierParams)) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity2)) != null) {
                                        FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                                        BillInfoData billInfoData2 = miniOspViewModelWR.LLIZ;
                                        if (billInfoData2 != null && (shippingAddress = billInfoData2.shippingAddress) != null) {
                                            address = shippingAddress.shippingAddress;
                                        }
                                        PaymentInfo paymentInfoLIZ = C886203dE.LIZ(paymentMethodsData, membershipOpenCashierParams);
                                        if (paymentInfoLIZ == null) {
                                            paymentInfoLIZ = miniOspViewModelWR.LLJIJIL;
                                        }
                                        HashMap map = new HashMap();
                                        HashMap<String, Object> map2 = membershipOpenCashierParams.LIZ;
                                        if (map2 != null) {
                                            map.putAll(map2);
                                        }
                                        String str6 = membershipOpenCashierParams.source;
                                        if (str6 != null) {
                                            map.put("source", str6);
                                        }
                                        String str7 = membershipOpenCashierParams.currency;
                                        BillInfoData billInfoData3 = miniOspViewModelWR.LLIZ;
                                        if (billInfoData3 == null || (nVar = billInfoData3.preRiskParam) == null) {
                                            nVar = new n();
                                        }
                                        nVar.LJJIIJ("pi_is_save", "true");
                                        nVar.LJJIIJ("pi_ocr", "false");
                                        nVar.LJJIIJ("seller_id", membershipOpenCashierParams.merchantUserId);
                                        nVar.LJJIIJ("amount", membershipOpenCashierParams.amount);
                                        EnterParams enterParams = new EnterParams(null, null, null, paymentMethodsData, null, false, paymentInfoLIZ, map, null, null, address, null, str7, "bind_not_pay", null, null, null, null, null, null, false, nVar, null, Boolean.FALSE, miniOspViewModelWR.LLLIIIL, null, Boolean.FALSE, false, null, null, null, null, miniOspViewModelWR.LLIZ, null, null, null, null, null, null, null, null, false, null, null, true, false, null, false, false, false);
                                        enterParams.LJJIJIIJI = EnumC837803Pc.MEMBERSHIP;
                                        C894803ec.LIZ(supportFragmentManager, paymentMethodLIZIZ, enterParams, null, "ADD_NEW_CARD", EnumC872903b5.ADD_CCDC);
                                        break;
                                    }
                                } else {
                                    MiniOspViewModel.cR2(miniOspViewModelWR, activity2, null, true, membershipOpenCashierParams, 24);
                                    break;
                                }
                            }
                        } catch (s e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            return;
                        }
                    }
                }
                break;
            case 266667747:
                if (str.equals("payment_ccdc_bindcard_tips") && (context = getContext()) != null) {
                    try {
                        Gson gsonLJFF4 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ4 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ4 != null && c1121904a9LIZIZ4.LJII) {
                            type2 = C2371409Qy.LIZJ(C13LE.LJII(C03VO.class));
                        } else {
                            type2 = new TypeToken<C03VO>() { // from class: X.03Tb
                            }.getType();
                        }
                        Object objFromJson4 = GsonProtectorUtils.fromJson(gsonLJFF4, str2, type2);
                        if (!(objFromJson4 instanceof C03VO)) {
                            objFromJson4 = null;
                        }
                        c03vo = (C03VO) objFromJson4;
                    } catch (s e5) {
                        TryCatchGuardChecker.doCheck(e5);
                    }
                    if (c03vo == null) {
                        str4 = null;
                    } else {
                        str4 = c03vo.LIZIZ;
                    }
                    C897503f3.LJIIJ(context, str4, null);
                    break;
                }
                break;
            case 333593967:
                if (str.equals("ec_pay_middle_failed")) {
                    try {
                        Gson gsonLJFF5 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ5 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ5 != null && c1121904a9LIZIZ5.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(PayMiddleFailedEvent.class));
                        } else {
                            type = new TypeToken<PayMiddleFailedEvent>() { // from class: X.03TY
                            }.getType();
                        }
                        Object objFromJson5 = GsonProtectorUtils.fromJson(gsonLJFF5, str2, type);
                        if (!(objFromJson5 instanceof PayMiddleFailedEvent)) {
                            objFromJson5 = null;
                        }
                        PayMiddleFailedEvent payMiddleFailedEvent = (PayMiddleFailedEvent) objFromJson5;
                        if (payMiddleFailedEvent != null && (string = payMiddleFailedEvent.errorMessage) != null && (activity = getActivity()) != null) {
                            String string2 = PipoPaymentFailedPopupMessage.LIZ().title;
                            if (string2 == null) {
                                string2 = getResources().getString(2131850904);
                            }
                            String string3 = PipoPaymentFailedPopupMessage.LIZ().action;
                            if (string3 == null) {
                                string3 = getResources().getString(2131850903);
                            }
                            if (string.length() == 0) {
                                string = getResources().getString(2131832569);
                            }
                            C1397580mTM c1397580mTM = new C1397580mTM(activity);
                            c1397580mTM.LIZIZ(string);
                            c1397580mTM.LJI(string2);
                            C985403tE.LIZ(c1397580mTM, new AwS52S1000000_1(string3, 46));
                            c1397580mTM.LJII = false;
                            new C1397510mTF(c1397580mTM).LIZLLL();
                            break;
                        }
                    } catch (s e6) {
                        TryCatchGuardChecker.doCheck(e6);
                        return;
                    }
                }
                break;
            case 1025755504:
                if (str.equals("ec_pay_middle_successed") && (c03o1 = this.LLJI) != null) {
                    PaymentInfo paymentInfo = WR().LLJIJIL;
                    if (paymentInfo != null) {
                        paymentMethod = paymentInfo.paymentMethod;
                    }
                    try {
                        if (C03P5.LIZ()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(c03o1.LIZ);
                            String strLJJIIZ = "";
                            if (paymentMethod == null || (str3 = paymentMethod.id) == null) {
                                str3 = "";
                            }
                            linkedHashMap.put("payment_method_id", str3);
                            if (paymentMethod != null) {
                                strLJJIIZ = paymentMethod.LJJIIZ();
                            }
                            linkedHashMap.put("pay_type", strLJJIIZ);
                            Boolean bool = Boolean.FALSE;
                            linkedHashMap.put("is_poll_order", bool);
                            linkedHashMap.put("is_three_order_campaign", bool);
                            linkedHashMap.put("source", "FE_QUERY");
                            C03O1.LJJIJIIJIL("rd_pipo_payment_success", linkedHashMap);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
        Window window;
        boolean z;
        String name;
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        this.LLILLL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLILZIL = (FrameLayout) view.findViewById(R.id.y04);
        this.LLILZLL = (TuxNavBar) view.findViewById(R.id.y08);
        this.LLILZ = (FrameLayout) view.findViewById(R.id.ccd);
        this.LLIZ = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLIZLLLIL = (ConstraintLayout) view.findViewById(R.id.eqx);
        if (!WR().PQ2().LJI(this, view)) {
            if (getContext() != null) {
                TuxNavBar tuxNavBar = this.LLILZLL;
                if (tuxNavBar != null) {
                    C0OM1 c0om1 = new C0OM1();
                    Context context = getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context)) != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c0om1.LIZJ(iIntValue);
                    c0om1.LIZJ = VR();
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                    c1251150ifB.LIZLLL = true;
                    c1251150ifB.LJIIIIZZ = getString(2131823350);
                    c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1770));
                    c0om1.LIZIZ(c1251150ifB);
                    c0om1.LIZLLL = true;
                    tuxNavBar.setNavActions(c0om1);
                }
                C1749280vcc c1749280vcc = this.LLIZ;
                if (c1749280vcc != null) {
                    c1749280vcc.LIZIZ(C786410Ut5.Td(C786410Ut5.ne(requireContext()), R.layout.b3s, this.LLIZLLLIL, false));
                }
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
                ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).createFpsMonitor("tiktokec_anchor_order_submit").LIZIZ(this.LLILLL);
                C19EG activity = getActivity();
                if (activity != null && (window = activity.getWindow()) != null) {
                    new KeyBoardVisibilityUtil(getLifecycle(), window, view, null, new AwS437S0200000_1(this, view, 39));
                }
                if (!this.LLJILLL) {
                    this.LLJILLL = true;
                    C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 1031), 3);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                    viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(this.LLJJJIL);
                }
            }
            C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 1038), 3);
        }
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03TJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C03JV) obj).LL);
            }
        }, null, new AwS615S0100000_1(this, 326), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03TA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJLIIIJLLLLLLLZ);
            }
        }, null, new AwS615S0100000_1(this, 242), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03Tl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLILZJ;
            }
        }, null, new AwS615S0100000_1(this, 252), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03Un
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLIZZ;
            }
        }, null, new AwS615S0100000_1(this, 262), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03TB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLILLL;
            }
        }, null, new AwS615S0100000_1(this, 289), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03V2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJIJIIJIL;
            }
        }, null, new AwS615S0100000_1(this, 299), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03V9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJIJIL;
            }
        }, null, new AwS615S0100000_1(this, 304), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03JI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJJ);
            }
        }, null, new AwS615S0100000_1(this, 314), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03TN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJJJ);
            }
        }, null, new AwS615S0100000_1(this, 325), 6);
        C736680Sv4.LJIIIZ(this, WR(), new C2217381BqS() { // from class: X.03TH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJJJJIL);
            }
        }, new C2217381BqS() { // from class: X.03Um
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJL;
            }
        }, null, new AwS650S0100000_1(this, 37), 12);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03Tj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJI;
            }
        }, null, new AwS615S0100000_1(this, 251), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03Tn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJIII;
            }
        }, null, new AwS615S0100000_1(this, 264), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03TK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C03JV) obj).LLJJ);
            }
        }, null, new AwS615S0100000_1(this, 310), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03Ut
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLFF;
            }
        }, null, new AwS615S0100000_1(this, 318), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03Ux
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLIILIL;
            }
        }, null, new AwS615S0100000_1(this, 334), 6);
        C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.03NY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLIIL;
            }
        }, null, new AwS615S0100000_1(this, 340), 6);
        ModuleManager moduleManager = WR().LLLFFI;
        if (moduleManager != null) {
            moduleManager.LIZJ(view);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            C03XA.LIZ.getClass();
            viewLIZJ = C03XA.LIZJ(activity, R.layout.b3r, viewGroup, false);
        } else {
            viewLIZJ = null;
        }
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
