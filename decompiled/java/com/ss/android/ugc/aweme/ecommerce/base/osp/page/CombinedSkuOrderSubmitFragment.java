package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AnonymousClass0378;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C034S;
import X.C037P;
import X.C03H5;
import X.C03O0;
import X.C03OX;
import X.C03R7;
import X.C03RS;
import X.C03RT;
import X.C03RV;
import X.C03VO;
import X.C03VY;
import X.C03XA;
import X.C049X;
import X.C098200Yq;
import X.C0P0T;
import X.C0Q4Y;
import X.C0ZP4;
import X.C1077704Jj;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1383230m6D;
import X.C1389890mGx;
import X.C1389920mH0;
import X.C1391190mJ3;
import X.C1391600mJi;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1725830v0n;
import X.C1741890vQh;
import X.C1748720vbi;
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
import X.C20600815jK;
import X.C20603715jn;
import X.C21142917oZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23271099x;
import X.C2371409Qy;
import X.C338490DOt;
import X.C343970De7;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C719702rT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C755402xE;
import X.C786410Ut5;
import X.C802003Bi;
import X.C814420VxA;
import X.C817603Hi;
import X.C832503Nb;
import X.C836003Ok;
import X.C843303Rf;
import X.C853303Vb;
import X.C897103ez;
import X.C897503f3;
import X.C903103fx;
import X.C904203g8;
import X.C914303hl;
import X.C939703lr;
import X.C948503nH;
import X.C954603oG;
import X.C955003oK;
import X.C963303pf;
import X.C983603sw;
import X.C985403tE;
import X.C987103tV;
import X.C989403ts;
import X.EnumC1235690iGF;
import X.InterfaceC0148002o;
import X.InterfaceC1058150ddt;
import X.InterfaceC1164530gPT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.addnote.USCombinedSkuAddNoteCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.mainorder.USCombinedSkuMainOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.payment.USCombinedSkuExtraFeeCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.shopify.USCombinedSkuEmailAuthorizeCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.USCombinedSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.span.USCombinedSkuSpanCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.USCombinedSkuBioCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USCombineAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.bonus.USHalfPageBonusCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.discount.USPlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.right.USUserBenefitPanelCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary.USOrderSummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable.USHalfPageUnreachableCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.HalfPageUserTrustCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.address.USHalfAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.gift.USHalfFreeGiftCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.logistics.USHalfLogisticsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.quantity.USHalfQuantityCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.sns.OneStepSnsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.virtual.USHalfDigitalDeliveryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.virtual.USHalfVirtualInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoPaymentFailedPopupMessage;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayMiddleFailedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcCombinedSkuOspRollbackConfig;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class CombinedSkuOrderSubmitFragment extends ECBaseFragment implements InterfaceC988703tl, InterfaceC1164530gPT, c, InterfaceC724530SbT, InterfaceC1058150ddt {
    public static final C037P LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static CombinedSkuOrderSubmitFragment LLJZIJLIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyHELIOSAgOGs8KCg2ZgYjJC06JiAoGiQmBzcoLD0APSchIDsVOiQrJCo9PA==";
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public C939703lr LLJIJIL;
    public final BPEAHandler LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public C1397510mTF LLJJIII;
    public C1397510mTF LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C21142917oZ LLJJIJIL;
    public C1749280vcc LLJJJ;
    public ConstraintLayout LLJJJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public ConstraintLayout LLJJJJLIIL;
    public TuxIconView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public ConstraintLayout LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final AsS29S0100000_1 LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.037P] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CombinedSkuOrderSubmitFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(CombinedSkuOrderSubmitFragment.class, "addressViewModel", "getAddressViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/address/OspAddressViewModel;", 0), new C2217381BqS(CombinedSkuOrderSubmitFragment.class, "paymentInfoVM", "getPaymentInfoVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/payment/PaymentInfoViewModel;", 0), new C2217381BqS(CombinedSkuOrderSubmitFragment.class, "bottomVM", "getBottomVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/bottom/OspBottomViewModel;", 0), new C2217381BqS(CombinedSkuOrderSubmitFragment.class, "shopVM", "getShopVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/core/vm/OspShopViewModel;", 0)};
        LLJLLL = new Object() { // from class: X.037P
        };
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
        return "order_submit";
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
        return "CombinedSkuOrderSubmitFragment";
    }

    public CombinedSkuOrderSubmitFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        boolean z3;
        AssemVMLazy assemVMLazy3;
        boolean z4;
        AssemVMLazy assemVMLazy4;
        boolean z5;
        AssemVMLazy assemVMLazy5;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 858);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(130);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 842), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 844), aFwS228S0000000_1, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 845), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspAddressViewModel.class);
        AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1(c19719912DlLIZ2, 846);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(131);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 847), aFwS228S0000000_12, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new AwS545S0100000_1((Fragment) this, 848), aFwS228S0000000_12, null, null, null);
            z3 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = true;
            z = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 850), aFwS228S0000000_12, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PaymentInfoViewModel.class);
        AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1(c19719912DlLIZ3, 851);
        AFwS228S0000000_1 aFwS228S0000000_13 = AFwS228S0000000_1.get$arr$(132);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new C452070Ho5(), new C1622206Wu(this, z3), new C338490DOt(this, z3), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 852), aFwS228S0000000_13, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
            z4 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new AwS545S0100000_1((Fragment) this, 853), aFwS228S0000000_13, null, null, null);
            z4 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z4 = true;
            z = false;
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 854), aFwS228S0000000_13, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZIL = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(OspBottomViewModel.class);
        AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ4, 855);
        AFwS228S0000000_1 aFwS228S0000000_14 = AFwS228S0000000_1.get$arr$(133);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new C452070Ho5(), new C1622206Wu(this, z4), new C338490DOt(this, z4), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 856), aFwS228S0000000_14, new C451460Hn6(this, z4), new C451620HnM(this, z4), new C987103tV(this, z4));
            z5 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new AwS545S0100000_1((Fragment) this, 857), aFwS228S0000000_14, null, null, null);
            z5 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z5 = true;
            z = false;
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 859), aFwS228S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy4;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(OspShopViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ5, 860);
        AFwS228S0000000_1 aFwS228S0000000_15 = AFwS228S0000000_1.get$arr$(134);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS545S0100000_15, new C452070Ho5(), new C1622206Wu(this, z5), new C338490DOt(this, z5), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 837), aFwS228S0000000_15, new C451460Hn6(this, z5), new C451620HnM(this, z5), new C987103tV(this, z5));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy5 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS545S0100000_15, new AwS545S0100000_1((Fragment) this, 838), aFwS228S0000000_15, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS545S0100000_15, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 839), aFwS228S0000000_15, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLIZ = assemVMLazy5;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 840));
        this.LLJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 843));
        this.LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 841));
        this.LLJILJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 849));
        this.LLJLLIL = new AsS29S0100000_1(this, 0);
    }

    public final OrderSubmitAssemViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final void finish() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        VR().LLLZLZ.LJIIL(this, "a2270.b2768", null);
        ModuleManager moduleManager = VR().LLZIL;
        if (moduleManager != null) {
            moduleManager.LJIIIIZZ(VR().LLLZLZ.LIZ("a2270.b2768"));
        }
        C817603Hi.LJFF = VR().LLLZLZ.LIZLLL;
    }

    public final boolean WR() {
        C983603sw c983603sw;
        Context context;
        C983603sw c983603sw2 = VR().H;
        if (c983603sw2 != null && c983603sw2.LIZLLL(this, VR()) && (context = getContext()) != null) {
            C983603sw c983603sw3 = VR().H;
            if (c983603sw3 != null) {
                c983603sw3.LJ(context);
            }
            return true;
        }
        if (VR().WQ2()) {
            return false;
        }
        boolean zQS2 = VR().qS2();
        if ((VR().LLLF || VR().LLLIIIL || zQS2 || VR().r.LIZJ) && (c983603sw = VR().H) != null) {
            C903103fx c903103fx = C903103fx.LIZ;
            C03OX c03ox = c983603sw.LIZ;
            c903103fx.getClass();
            boolean zLJ = C903103fx.LJ(c03ox);
            if (zLJ && !Intrinsics.LJFF(c983603sw.LJII, Boolean.TRUE) && zLJ) {
                C03O0.LJJLIIIJILLIZJL(C03O0.LIZ, "quit_checkout", null, null, null, null, true, 30);
                C19EG activity = getActivity();
                boolean z = VR().LLLIIIL;
                if (activity != null) {
                    C03VY c03vyLIZ = C853303Vb.LIZ(zQS2 ? 1 : z ? 2 : 0);
                    C1397580mTM c1397580mTM = new C1397580mTM(activity);
                    c1397580mTM.LJFF(c03vyLIZ.LIZ);
                    c1397580mTM.LIZ(c03vyLIZ.LIZIZ);
                    C985403tE.LIZ(c1397580mTM, new AwS367S0200000_1(this, c03vyLIZ, 378));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
                return true;
            }
        }
        VR().dR2(new AwS580S0100000_1(this, 114));
        return false;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        VR().LLJZ = "return";
        return WR();
    }

    @Override // X.InterfaceC988703tl
    public final boolean onBackPressed() {
        VR().LLJZ = "return";
        return WR();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        BillInfoData billInfoData;
        SkuSelection skuSelection;
        super.onDestroy();
        if (!EcCombinedSkuOspRollbackConfig.LIZ().checkedSpecsToPdpRollback) {
            HashMap<String, Object> map = VR().LLLIL;
            if (Intrinsics.LJFF(map != null ? map.get("previous_page") : null, "product_detail") && (billInfoData = VR().LLJJI) != null && (skuSelection = billInfoData.skuSelection) != null) {
                List<OrderShopDigest> list = VR().LLILZIL;
                int iIntValue = 0;
                if (list != null) {
                    Iterator<OrderShopDigest> it2 = list.iterator();
                    while (it2.hasNext()) {
                        List<OrderSKUDTO> list2 = it2.next().orderSKUs;
                        if (list2 != null) {
                            Iterator<OrderSKUDTO> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                Integer num = it3.next().quantity;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                }
                            }
                        }
                    }
                }
                String str = skuSelection.productId;
                Integer numValueOf = Integer.valueOf(iIntValue);
                String[] strArr = VR().N;
                AnonymousClass0378.LIZ().LIZ("ec_combined_sku_osp_panel_close", C1741890vQh.LJIIIIZZ(new C955003oK(str, numValueOf, strArr != null ? C13LQ.LJJLL(strArr) : null)));
            }
        }
        LLJZIJLIL = null;
        C03O0.LIZ.getClass();
        C03O0.LJIIIIZZ();
        VR().uT2();
        C914303hl.LIZ.getClass();
        C914303hl.LIZJ(this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("restore_sku_quantity_event", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_pay_middle_successed", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_pay_middle_failed", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_resend_pay_request", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_payment_error_dialog", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("payment_ccdc_bindcard_tips", this);
        AnonymousClass0378.LIZ().LIZJ("ec_localized_size_changed", this);
        VR().tT2();
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(CombinedSkuOrderSubmitFragment.class.getName());
        }
        super.onResume();
        C03O0.LIZ.getClass();
        C03O0.LJZ();
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
        C03O0.LIZ.getClass();
        C03O0.LJII();
        OrderSubmitAssemViewModel orderSubmitAssemViewModelVR = VR();
        orderSubmitAssemViewModelVR.withState(new AwS580S0100000_1(orderSubmitAssemViewModelVR, 417));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        IECommerceHostService iECommerceHostService;
        AddonOrder addonOrder;
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
            C03O0.LIZ.getClass();
            C03O0.LJ = SystemClock.elapsedRealtime();
            VR().LLJZ = "close";
        }
        if (C904203g8.LJIIJ) {
            return;
        }
        C03O0 c03o0 = C03O0.LIZ;
        boolean z = VR().LLJLL;
        String str = VR().LLJZ;
        boolean z2 = VR().LLLIIII;
        boolean z3 = VR().LLLIIIIL;
        HashMap<String, Object> mapHi1 = VR().hi1(true);
        String strWR2 = VR().wR2();
        BillInfoData billInfoData = VR().LLJJI;
        Integer numValueOf = (billInfoData == null || (addonOrder = billInfoData.addonOrder) == null) ? null : Integer.valueOf(addonOrder.LIZ());
        String strPR2 = VR().PR2();
        String strIR2 = VR().iR2();
        boolean zLJI = VR().h.LJI();
        BillInfoData billInfoData2 = VR().LLJJI;
        C03O0.LJJLIIIJJIZ(c03o0, z, str, Boolean.valueOf(z2), Boolean.valueOf(z3), mapHi1, null, null, null, strWR2, numValueOf, strPR2, strIR2, VR().LLLZLZ.LJIIJ(), VR().IR2(), null, null, null, null, null, null, null, VR().LLLZLL, null, null, null, null, null, Boolean.valueOf(zLJI), billInfoData2 != null ? billInfoData2.newShopOrders : null, null, null, null, null, -809532960, 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        BillInfoData billInfoData = VR().LLJJI;
        String strLIZIZ = "";
        if (billInfoData != null && billInfoData.addonOrder != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("addon_order,");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (strLIZIZ.length() > 0) {
            ((HashMap) map).put("ui_elements_data", strLIZIZ);
        }
        if (VR().Pp(map)) {
            return true;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (viewOnAttachStateChangeListenerC20604515jv.getChildCount() > 0 && viewOnAttachStateChangeListenerC20604515jv.getHeight() > 0)) {
            return false;
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 113));
    }

    public final void ZR(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            if (iFindFirstVisibleItemPosition != -1 && iFindLastCompletelyVisibleItemPosition != -1 && iFindFirstVisibleItemPosition <= iFindLastCompletelyVisibleItemPosition && iFindFirstVisibleItemPosition <= iFindLastCompletelyVisibleItemPosition) {
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition != null) {
                        Object tag = viewFindViewByPosition.getTag();
                        if (!(tag instanceof String)) {
                            tag = null;
                        }
                        if (Intrinsics.LJFF(tag, "us_order_summary_item_view")) {
                            z = true;
                        } else {
                            if (Intrinsics.LJFF(tag, "s_points_item_view")) {
                                z2 = true;
                            }
                            if (z || z2) {
                            }
                        }
                        C0P0T c0p0t = VR().a0;
                        if (c0p0t != null) {
                            this.LLJLILLLLZIIL = true;
                            c0p0t.show();
                            return;
                        }
                    }
                    if (iFindFirstVisibleItemPosition == iFindLastCompletelyVisibleItemPosition) {
                        return;
                    } else {
                        iFindFirstVisibleItemPosition++;
                    }
                }
            }
        }
    }

    public final void aS(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        String str;
        SnsPeriodModule snsPeriodModule;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (true) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null && Intrinsics.LJFF(viewFindViewByPosition.getTag(), "one_step_sns_view_tag")) {
                    View viewFindViewById = viewFindViewByPosition.findViewById(R.id.pmd);
                    List<InterfaceC1891350zJl> list = VR().getState().LLILLJJLI;
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                        if (interfaceC1891350zJl instanceof C719702rT) {
                            arrayList.add(interfaceC1891350zJl);
                        }
                    }
                    C719702rT c719702rT = (C719702rT) C13LP.LJJJLL(arrayList);
                    if (c719702rT != null && (snsPeriodModule = c719702rT.LLILZLL.snsPeriodModule) != null) {
                        str = snsPeriodModule.unSelectedToast;
                    } else {
                        str = null;
                    }
                    if (viewFindViewById != null && viewFindViewById.getVisibility() == 0 && str != null && str.length() != 0) {
                        OrderSubmitAssemViewModel orderSubmitAssemViewModelVR = VR();
                        C0P0T c0p0t = orderSubmitAssemViewModelVR.b0;
                        new AwS545S0100000_1(orderSubmitAssemViewModelVR, 1518);
                        if (c0p0t != null) {
                            c0p0t.dismiss();
                        }
                        OrderSubmitAssemViewModel orderSubmitAssemViewModelVR2 = VR();
                        C450720Hlu c450720Hlu = new C450720Hlu(viewFindViewById.getContext());
                        c450720Hlu.LLILZ = str;
                        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                        c1391600mJi.LIZIZ = viewFindViewById;
                        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                        c1391600mJi.LJIIL = true;
                        c1391600mJi.LJIIIZ = true;
                        c450720Hlu.LJIIIZ(true, null);
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
                        c1391600mJi2.LJIIIIZZ = iLIZIZ;
                        c1391600mJi2.LJIJJ = true;
                        c1391600mJi2.LJIJJLI = false;
                        c1391600mJi2.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                        orderSubmitAssemViewModelVR2.b0 = c450720Hlu.LIZIZ();
                        C0P0T c0p0t2 = VR().b0;
                        if (c0p0t2 != null) {
                            c0p0t2.show();
                        }
                        VR().c0 = false;
                        return;
                    }
                    return;
                }
                if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                    iFindFirstVisibleItemPosition++;
                } else {
                    return;
                }
            }
        }
    }

    public final void bu(String str) {
        ConstraintLayout constraintLayout = this.LLJJJIL;
        if (constraintLayout != null) {
            C1383230m6D c1383230m6D = new C1383230m6D(new C1389920mH0(str, null, null, 8189), 30);
            C1389890mGx c1389890mGx = new C1389890mGx(constraintLayout);
            c1389890mGx.LIZ = c1383230m6D;
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String strGenCacheKey;
        super.onCreate(bundle);
        ModuleManager moduleManager = VR().LLZIL;
        if (moduleManager != null) {
            moduleManager.LJIIIZ(this);
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZLLL();
        LLJZIJLIL = this;
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> map = VR().LLLIL;
        c03o0.getClass();
        C03O0.LJJI(map);
        C03O0.LJIJJLI();
        BillInfoRequest billInfoRequest = VR().p;
        Context contextN3 = null;
        if (billInfoRequest != null) {
            strGenCacheKey = billInfoRequest.genCacheKey(null);
        } else {
            strGenCacheKey = null;
        }
        if (VR().LLJJI == null) {
            boolean z = C843303Rf.LIZ;
            if (C843303Rf.LIZLLL(Integer.valueOf(VR().LL), strGenCacheKey)) {
                VR().C = true;
            }
        }
        VR().TQ2();
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
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("restore_sku_quantity_event", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_pay_middle_successed", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_pay_middle_failed", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_resend_pay_request", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_payment_error_dialog", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("payment_ccdc_bindcard_tips", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_localized_size_changed", this);
        VR().pT2();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C802003Bi c802003Bi;
        Integer num;
        String str3;
        Type type;
        C03VO c03vo;
        Context context;
        String str4;
        Type type2;
        C03VO c03vo2;
        String strLIZ;
        C19EG activity;
        Type type3;
        PayMiddleFailedEvent payMiddleFailedEvent = null;
        PaymentMethod paymentMethod = null;
        switch (str.hashCode()) {
            case -1413704395:
                if (str.equals("ec_resend_pay_request")) {
                    C736680Sv4.LJIJJ(VR(), new AwS580S0100000_1(this, 115));
                }
                break;
            case -1196015749:
                if (str.equals("ec_localized_size_changed")) {
                    VR().NQ2();
                }
                break;
            case -1136609639:
                if (str.equals("restore_sku_quantity_event") && (c802003Bi = VR().LLLLZIL) != null && (num = c802003Bi.LIZIZ) != null) {
                    int iIntValue = num.intValue();
                    C939703lr c939703lr = this.LLJIJIL;
                    if (c939703lr != null) {
                        c939703lr.setQuantity(iIntValue);
                    }
                    break;
                }
                break;
            case -247382535:
                if (str.equals("ec_payment_error_dialog")) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(C03VO.class));
                        } else {
                            type = new TypeToken<C03VO>() { // from class: X.03US
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                        if (!(objFromJson instanceof C03VO)) {
                            objFromJson = null;
                        }
                        c03vo = (C03VO) objFromJson;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (c03vo != null) {
                        str3 = c03vo.LIZ;
                    } else {
                        str3 = null;
                    }
                    try {
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1AF0.LJ(e2);
                        return;
                    }
                }
                break;
            case 266667747:
                if (str.equals("payment_ccdc_bindcard_tips") && (context = getContext()) != null) {
                    try {
                        Gson gsonLJFF2 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                            type2 = C2371409Qy.LIZJ(C13LE.LJII(C03VO.class));
                        } else {
                            type2 = new TypeToken<C03VO>() { // from class: X.03UT
                            }.getType();
                        }
                        Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type2);
                        if (!(objFromJson2 instanceof C03VO)) {
                            objFromJson2 = null;
                        }
                        c03vo2 = (C03VO) objFromJson2;
                    } catch (s e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    if (c03vo2 == null) {
                        str4 = null;
                    } else {
                        str4 = c03vo2.LIZIZ;
                    }
                    C897503f3.LJIIJ(context, str4, null);
                    break;
                }
                break;
            case 333593967:
                if (str.equals("ec_pay_middle_failed")) {
                    try {
                        Gson gsonLJFF3 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ3 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ3 != null && c1121904a9LIZIZ3.LJII) {
                            type3 = C2371409Qy.LIZJ(C13LE.LJII(PayMiddleFailedEvent.class));
                        } else {
                            type3 = new TypeToken<PayMiddleFailedEvent>() { // from class: X.03UR
                            }.getType();
                        }
                        Object objFromJson3 = GsonProtectorUtils.fromJson(gsonLJFF3, str2, type3);
                        if (!(objFromJson3 instanceof PayMiddleFailedEvent)) {
                            objFromJson3 = null;
                        }
                        payMiddleFailedEvent = (PayMiddleFailedEvent) objFromJson3;
                    } catch (s e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    if (VR().GT2()) {
                        VR().HS2(false);
                        break;
                    } else if (payMiddleFailedEvent != null && (strLIZ = payMiddleFailedEvent.LIZ()) != null && (activity = getActivity()) != null) {
                        String string = PipoPaymentFailedPopupMessage.LIZ().title;
                        if (string == null) {
                            string = getResources().getString(2131850904);
                        }
                        String string2 = PipoPaymentFailedPopupMessage.LIZ().action;
                        if (string2 == null) {
                            string2 = getResources().getString(2131850903);
                        }
                        if (strLIZ.length() == 0) {
                            strLIZ = getResources().getString(2131832569);
                        }
                        C1397580mTM c1397580mTM = new C1397580mTM(activity);
                        c1397580mTM.LIZIZ(strLIZ);
                        c1397580mTM.LJI(string);
                        C985403tE.LIZ(c1397580mTM, new AwS115S1100000_1(string2, this, 54));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        break;
                    }
                }
                break;
            case 1025755504:
                if (str.equals("ec_pay_middle_successed")) {
                    C03O0 c03o0 = C03O0.LIZ;
                    PaymentInfo paymentInfo = VR().LLJJJ;
                    if (paymentInfo != null) {
                        paymentMethod = paymentInfo.paymentMethod;
                    }
                    c03o0.getClass();
                    C03O0.LJLI(paymentMethod, false, false, "FE_QUERY");
                    finish();
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numValueOf;
        BillInfoData billInfoData;
        Object obj;
        String str;
        Class<? extends PowerCell<?>> cls;
        RecyclerView.LayoutManager layoutManager;
        IECommerceHostService iECommerceHostService;
        Window window;
        boolean z;
        String name;
        C20600815jK<InterfaceC1891350zJl> state;
        Class<? extends PowerCell<?>> cls2;
        super.onViewCreated(view, bundle);
        int i = 1;
        int i2 = 4;
        Map map = null;
        if (getContext() != null) {
            this.LLJJIJIL = (C21142917oZ) view.findViewById(R.id.trr);
            this.LLJJJ = (C1749280vcc) view.findViewById(R.id.w28);
            this.LLJJJIL = (ConstraintLayout) view.findViewById(R.id.eqx);
            this.LLJJJJ = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
            this.LLJJJJJIL = (FrameLayout) view.findViewById(R.id.ccd);
            this.LLJJJJLIIL = (ConstraintLayout) view.findViewById(R.id.e2h);
            this.LLJJL = (TuxIconView) view.findViewById(R.id.j8z);
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.j91);
            this.LLJL = view.findViewById(R.id.j90);
            this.LLJLIL = (ConstraintLayout) view.findViewById(R.id.j8y);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                C20603715jn c20603715jn = new C20603715jn();
                c20603715jn.LJIIIIZZ = new OptimizeAbility(i, true ? 1 : 0, map, i2);
                viewOnAttachStateChangeListenerC20604515jv2.setListConfig(c20603715jn);
            }
            HashMap<String, Object> map2 = VR().LLLIL;
            if (map2 != null) {
                obj = map2.get("source_page_type");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (C963303pf.LIZ()) {
                C832503Nb c832503Nb = C832503Nb.LIZ;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJJJ;
                c832503Nb.getClass();
                if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                    Class<? extends PowerCell<?>>[] clsArr = new Class[23];
                    clsArr[0] = USHalfAddressCell.class;
                    clsArr[1] = USCombinedSkuMainOrderCell.class;
                    clsArr[2] = USHalfQuantityCell.class;
                    clsArr[3] = USCombinedSkuCell.class;
                    clsArr[4] = USHalfPaymentCell.class;
                    clsArr[5] = USCombinedSkuBioCell.class;
                    clsArr[6] = HalfPageUserTrustCell.class;
                    clsArr[7] = USCombinedSkuExtraFeeCell.class;
                    clsArr[8] = USHalfFreeGiftCell.class;
                    clsArr[9] = USHalfPageBonusCell.class;
                    clsArr[10] = USCombinedSkuSpanCell.class;
                    clsArr[11] = USCombinedSkuEmailAuthorizeCell.class;
                    clsArr[12] = USCombinedSkuAddNoteCell.class;
                    clsArr[13] = USPaymentInfoCell.class;
                    clsArr[14] = USUserBenefitPanelCell.class;
                    clsArr[15] = USHalfLogisticsCell.class;
                    if (C954603oG.LIZ(str)) {
                        cls2 = USOrderSummaryCell.class;
                    } else {
                        cls2 = USHalfPageOrderSummaryCell.class;
                    }
                    clsArr[16] = cls2;
                    clsArr[17] = USHalfVirtualInfoCell.class;
                    clsArr[18] = USHalfDigitalDeliveryCell.class;
                    clsArr[19] = USPlatformDiscountsCell.class;
                    clsArr[20] = USCombineAggregationOrderCell.class;
                    clsArr[21] = USHalfPageUnreachableCell.class;
                    clsArr[22] = OneStepSnsCell.class;
                    viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(clsArr);
                }
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJJJ;
                if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                    Class<? extends PowerCell<?>>[] clsArr2 = new Class[23];
                    clsArr2[0] = USHalfAddressCell.class;
                    clsArr2[1] = USCombinedSkuMainOrderCell.class;
                    clsArr2[2] = USHalfQuantityCell.class;
                    clsArr2[3] = USCombinedSkuCell.class;
                    clsArr2[4] = USHalfPaymentCell.class;
                    clsArr2[5] = USCombinedSkuBioCell.class;
                    clsArr2[6] = HalfPageUserTrustCell.class;
                    clsArr2[7] = USCombinedSkuExtraFeeCell.class;
                    clsArr2[8] = USHalfFreeGiftCell.class;
                    clsArr2[9] = USHalfPageBonusCell.class;
                    clsArr2[10] = USCombinedSkuSpanCell.class;
                    clsArr2[11] = USCombinedSkuEmailAuthorizeCell.class;
                    clsArr2[12] = USCombinedSkuAddNoteCell.class;
                    clsArr2[13] = USPaymentInfoCell.class;
                    clsArr2[14] = USUserBenefitPanelCell.class;
                    clsArr2[15] = USHalfLogisticsCell.class;
                    if (C954603oG.LIZ(str)) {
                        cls = USOrderSummaryCell.class;
                    } else {
                        cls = USHalfPageOrderSummaryCell.class;
                    }
                    clsArr2[16] = cls;
                    clsArr2[17] = USHalfVirtualInfoCell.class;
                    clsArr2[18] = OneStepSnsCell.class;
                    clsArr2[19] = USHalfDigitalDeliveryCell.class;
                    clsArr2[20] = USPlatformDiscountsCell.class;
                    clsArr2[21] = USCombineAggregationOrderCell.class;
                    clsArr2[22] = USHalfPageUnreachableCell.class;
                    viewOnAttachStateChangeListenerC20604515jv4.LJIILJJIL(clsArr2);
                }
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                viewOnAttachStateChangeListenerC20604515jv5.addOnScrollListener(this.LLJLLIL);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv6 != null && (state = viewOnAttachStateChangeListenerC20604515jv6.getState()) != null) {
                state.LIZLLL = C0Q4Y.BUFFER;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv7 = this.LLJJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv7 != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv7.getLayoutManager();
            } else {
                layoutManager = null;
            }
            boolean z2 = layoutManager instanceof LinearLayoutManager;
            ConstraintLayout constraintLayout = this.LLJJJJLIIL;
            if (constraintLayout != null) {
                C786410Ut5.I7(new AjS60S0100000_1(this, 144), constraintLayout);
            }
            C1748720vbi.LIZIZ(this, new C049X(), AFwS228S0000000_1.get$arr$(911));
            C1749280vcc c1749280vcc = this.LLJJJ;
            if (c1749280vcc != null) {
                c1749280vcc.LIZIZ(C786410Ut5.Td(C786410Ut5.ne(requireContext()), R.layout.b3o, this.LLJJJIL, false));
            }
            C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03UJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C03JV) obj2).LLLJL;
                }
            }, null, new AwS615S0100000_1(this, 293), 6);
            if (C836003Ok.LIZ()) {
                C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03VC
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C03JV) obj2).LLZL;
                    }
                }, null, new AwS615S0100000_1(this, 303), 6);
            }
            C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03UL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C03JV) obj2).LLZLI;
                }
            }, null, new AwS615S0100000_1(this, 309), 6);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IPerformanceOptDependencyService iPerformanceOptDependencyServiceCreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
                if (iPerformanceOptDependencyServiceCreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IPerformanceOptDependencyService.class.getName();
                if (iPerformanceOptDependencyServiceCreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                    name = iPerformanceOptDependencyServiceCreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                iECommerceHostService = iPerformanceOptDependencyServiceCreateIPerformanceOptDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
            }
            ((IPerformanceOptDependencyService) iECommerceHostService).createFpsMonitor("tiktokec_anchor_order_submit").LIZIZ(this.LLJJJJ);
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                new KeyBoardVisibilityUtil(getLifecycle(), window, view, null, new AwS437S0200000_1(this, view, 41));
            }
            if (VR().LLLZI && !this.LLJJIJIIJIL) {
                this.LLJJIJIIJIL = true;
                C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 1023), 3);
            }
        }
        C736680Sv4.LJIIIZ(this, VR(), new C2217381BqS() { // from class: X.03Jy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLZLLIL;
            }
        }, new C2217381BqS() { // from class: X.03Js
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLZLLLL;
            }
        }, null, new AwS650S0100000_1(this, 32), 12);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03Ud
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLILLJJLI;
            }
        }, null, new AwS615S0100000_1(this, 256), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03TS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C03JV) obj2).LL);
            }
        }, null, new AwS615S0100000_1(this, 263), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03U9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLJJLIIIJLLLLLLLZ);
            }
        }, null, new AwS615S0100000_1(this, 273), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03UF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLILZJ;
            }
        }, null, new AwS615S0100000_1(this, 275), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03Up
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLIZZ;
            }
        }, null, new AwS615S0100000_1(this, 286), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03Jj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLZZZIL);
            }
        }, null, new AwS615S0100000_1(this, 296), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03K1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLZL;
            }
        }, null, new AwS615S0100000_1(this, 307), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03UM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLILLL;
            }
        }, null, new AwS615S0100000_1(this, 320), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03V4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJIJIIJIL;
            }
        }, null, new AwS615S0100000_1(this, 336), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03VB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJIJIL;
            }
        }, null, new AwS615S0100000_1(this, 343), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03JK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLJJJ);
            }
        }, null, new AwS615S0100000_1(this, 240), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03TQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLJJJJ);
            }
        }, null, new AwS615S0100000_1(this, 249), 6);
        C736680Sv4.LJIIIZ(this, VR(), new C2217381BqS() { // from class: X.03TR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLJJJJJIL);
            }
        }, new C2217381BqS() { // from class: X.03Ul
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJL;
            }
        }, null, new AwS650S0100000_1(this, 31), 12);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03UE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJJJLIIL;
            }
        }, null, new AwS615S0100000_1(this, 272), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03UI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJI;
            }
        }, null, new AwS615S0100000_1(this, 283), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03UK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJIII;
            }
        }, null, new AwS615S0100000_1(this, 302), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03TU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C03JV) obj2).LLJJ);
            }
        }, null, new AwS615S0100000_1(this, 259), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03Uq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLFF;
            }
        }, null, new AwS615S0100000_1(this, 269), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03Uu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLIILIL;
            }
        }, null, new AwS615S0100000_1(this, 277), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03Uy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLIL;
            }
        }, null, new AwS615S0100000_1(this, 284), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03V5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLILZ;
            }
        }, null, new AwS615S0100000_1(this, 292), 6);
        OrderSubmitAssemViewModel orderSubmitAssemViewModelVR = VR();
        selectSubscribe(orderSubmitAssemViewModelVR, new C2217381BqS() { // from class: X.03NV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLIIIILLL;
            }
        }, new C2217381BqS() { // from class: X.03NX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLIIL;
            }
        }, new C2217381BqS() { // from class: X.03Jv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLIILL;
            }
        }, C736820SvI.LIZIZ(orderSubmitAssemViewModelVR.usedInReusedScene), null, new C1077704Jj(this, 14));
        Integer numValueOf2 = null;
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03Ue
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLZZIL;
            }
        }, null, new AwS615S0100000_1(this, 333), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03NP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLLLJ;
            }
        }, null, new AwS615S0100000_1(this, 339), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03NQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLJ;
            }
        }, null, new AwS615S0100000_1(this, 241), 6);
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03UC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLLIL;
            }
        }, null, new AwS615S0100000_1(this, 250), 6);
        if (VR().C && VR().LLJJI == null) {
            ModuleManager moduleManager = VR().LLZIL;
            if (moduleManager != null) {
                moduleManager.LJIILLIIL = 2;
            }
            C755402xE c755402xE = C755402xE.LIZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModelVR2 = VR();
            c755402xE.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z3 = C843303Rf.LIZ;
            BillInfoRequest billInfoRequest = orderSubmitAssemViewModelVR2.p;
            String strGenCacheKey = null;
            if (billInfoRequest != null) {
                strGenCacheKey = billInfoRequest.genCacheKey(null);
            }
            BillInfoRequest billInfoRequest2 = orderSubmitAssemViewModelVR2.p;
            if (billInfoRequest2 != null) {
                numValueOf = Integer.valueOf(billInfoRequest2.getBuyType());
            } else {
                numValueOf = null;
            }
            C03RS c03rsLIZIZ = C843303Rf.LIZIZ(numValueOf, strGenCacheKey);
            if (c03rsLIZIZ != null) {
                BillInfoRequest billInfoRequest3 = orderSubmitAssemViewModelVR2.p;
                if (billInfoRequest3 != null) {
                    numValueOf2 = Integer.valueOf(billInfoRequest3.countSkuNum());
                }
                C03RT c03rt = c03rsLIZIZ.LIZ;
                C03RT c03rt2 = C03RT.DONE;
                if (c03rt == c03rt2) {
                    if (orderSubmitAssemViewModelVR2.LLJJI == null && orderSubmitAssemViewModelVR2.C) {
                        HashMap<String, Object> map3 = orderSubmitAssemViewModelVR2.LLLIL;
                        if (map3 != null) {
                            map3.put("is_preload", 1);
                        }
                        C03RV c03rv = C03RV.LIZ;
                        OrderSubmitFragment.LLLIL.getClass();
                        OrderSubmitFragment orderSubmitFragment = OrderSubmitFragment.LLLILZJ;
                        c03rv.getClass();
                        C03RV.LIZ(orderSubmitFragment, c03rsLIZIZ, true, c03rt2, numValueOf2, null);
                        ModuleManager.LJJJLIIL = System.currentTimeMillis() - jCurrentTimeMillis;
                        BillInfoResponse billInfoResponse = c03rsLIZIZ.LIZIZ;
                        if (billInfoResponse != null) {
                            billInfoData = (BillInfoData) billInfoResponse.data;
                        } else {
                            billInfoData = null;
                        }
                        C755402xE.LIZIZ(billInfoData, orderSubmitAssemViewModelVR2);
                    }
                } else if (c03rt == C03RT.PRELOADING) {
                    C948503nH.LJI(orderSubmitAssemViewModelVR2, C23271099x.INSTANCE, new C03R7(orderSubmitAssemViewModelVR2, jCurrentTimeMillis, c03rsLIZIZ, numValueOf2, null));
                }
            }
            if (!this.LLJJIJIIJIL) {
                this.LLJJIJIIJIL = true;
                C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 1023), 3);
            }
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModelVR3 = VR();
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        orderSubmitAssemViewModelVR3.kS2(this, (OspAddressViewModel) assemVMLazy.getValue(), (PaymentInfoViewModel) this.LLILZIL.getValue(), (OspBottomViewModel) this.LLILZLL.getValue(), (OspShopViewModel) this.LLIZ.getValue());
        ModuleManager moduleManager2 = VR().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LIZJ(view);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            C03XA.LIZ.getClass();
            viewLIZJ = C03XA.LIZJ(activity, R.layout.b3n, viewGroup, false);
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
