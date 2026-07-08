package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AbstractC21673719rz;
import X.AnonymousClass0378;
import X.C019F;
import X.C01D1;
import X.C034S;
import X.C037Q;
import X.C03DI;
import X.C03H5;
import X.C03MG;
import X.C03O0;
import X.C03VO;
import X.C03XA;
import X.C098200Yq;
import X.C0KFD;
import X.C0ZP4;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1383230m6D;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1389920mH0;
import X.C1390130mHL;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LP;
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
import X.C19FO;
import X.C19GS;
import X.C1AF0;
import X.C1AQS;
import X.C20691715xz;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2371409Qy;
import X.C338490DOt;
import X.C343970De7;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C7862035g;
import X.C786410Ut5;
import X.C802003Bi;
import X.C814420VxA;
import X.C817603Hi;
import X.C832403Na;
import X.C832503Nb;
import X.C843303Rf;
import X.C850603Ua;
import X.C854203Vk;
import X.C897103ez;
import X.C897503f3;
import X.C904203g8;
import X.C908703gr;
import X.C914303hl;
import X.C936503lL;
import X.C936803lO;
import X.C950403na;
import X.C955003oK;
import X.C963303pf;
import X.C985403tE;
import X.C987103tV;
import X.C989403ts;
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
import Y.ARunnableS101S0100000_1;
import Y.ARunnableS70S0200000_1;
import Y.ATListenerS437S0100000_1;
import Y.AsS29S0100000_1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.EcChangeSupplyInfoEventParams;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.EcChangeSupplyInfoModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoPaymentFailedPopupMessage;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoCollectionStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderSubmitRefreshEventParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayMiddleFailedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RecipientIdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS141S0101000_1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaOneStepOrderSubmitFragment extends ECBaseFragment implements InterfaceC988703tl, InterfaceC1164530gPT, c, InterfaceC724530SbT, InterfaceC1058150ddt {
    public static final C037Q LLLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZJ;
    public static SeaOneStepOrderSubmitFragment LLLILZLLLI = null;
    public static final int LLLIZZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZyAgOGs8KCg2ZhYpKAA9LRY4LD8cOiEpOxwmKiglPQkhKSIhLCEn";
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final BPEAHandler LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public C1397510mTF LLJILLL;
    public C1397510mTF LLJJ;
    public C850603Ua LLJJI;
    public C1749280vcc LLJJIII;
    public ConstraintLayout LLJJIJI;
    public C20691715xz LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public TuxTextView LLJJJ;
    public FrameLayout LLJJJIL;
    public FrameLayout LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public C950403na LLJJJJLIIL;
    public FrameLayout LLJJL;
    public C936503lL LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C1390130mHL LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public ValueAnimator LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public long LLL;
    public boolean LLLF;
    public long LLLFF;
    public Long LLLFFI;
    public String LLLFZ;
    public long LLLI;
    public C936803lO LLLII;
    public long LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public FrameLayout LLLIIL;
    public KeyBoardVisibilityUtil LLLIILIL;
    public final AsS29S0100000_1 LLLIL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.037Q] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaOneStepOrderSubmitFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLILZJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(SeaOneStepOrderSubmitFragment.class, "addressViewModel", "getAddressViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/address/OspAddressViewModel;", 0), new C2217381BqS(SeaOneStepOrderSubmitFragment.class, "skuSpecViewModel", "getSkuSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0), new C2217381BqS(SeaOneStepOrderSubmitFragment.class, "paymentInfoVM", "getPaymentInfoVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/payment/PaymentInfoViewModel;", 0), new C2217381BqS(SeaOneStepOrderSubmitFragment.class, "bottomVM", "getBottomVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/bottom/OspBottomViewModel;", 0), new C2217381BqS(SeaOneStepOrderSubmitFragment.class, "shopVM", "getShopVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/core/vm/OspShopViewModel;", 0)};
        LLLILZ = new Object() { // from class: X.037Q
        };
        LLLIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
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

    public SeaOneStepOrderSubmitFragment() {
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
        boolean z6;
        AssemVMLazy assemVMLazy6;
        boolean z7;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 916);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(150);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 902), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 903), aFwS228S0000000_1, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 904), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspAddressViewModel.class);
        AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1(c19719912DlLIZ2, 905);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(151);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 908), aFwS228S0000000_12, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new AwS545S0100000_1((Fragment) this, 909), aFwS228S0000000_12, null, null, null);
            z3 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = true;
            z = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 906), aFwS228S0000000_12, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZ = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SeaSkuSpecViewModel.class);
        AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1(c19719912DlLIZ3, 907);
        AFwS228S0000000_1 aFwS228S0000000_13 = AFwS228S0000000_1.get$arr$(152);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new C452070Ho5(), new C1622206Wu(this, z3), new C338490DOt(this, z3), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 910), aFwS228S0000000_13, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
            z4 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new AwS545S0100000_1((Fragment) this, 911), aFwS228S0000000_13, null, null, null);
            z4 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z4 = true;
            z = false;
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 912), aFwS228S0000000_13, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZIL = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PaymentInfoViewModel.class);
        AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ4, 913);
        AFwS228S0000000_1 aFwS228S0000000_14 = AFwS228S0000000_1.get$arr$(153);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new C452070Ho5(), new C1622206Wu(this, z4), new C338490DOt(this, z4), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 914), aFwS228S0000000_14, new C451460Hn6(this, z4), new C451620HnM(this, z4), new C987103tV(this, z4));
            z5 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new AwS545S0100000_1((Fragment) this, 915), aFwS228S0000000_14, null, null, null);
            z5 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z5 = true;
            z = false;
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 917), aFwS228S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy4;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(OspBottomViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ5, 918);
        AFwS228S0000000_1 aFwS228S0000000_15 = AFwS228S0000000_1.get$arr$(148);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS545S0100000_15, new C452070Ho5(), new C1622206Wu(this, z5), new C338490DOt(this, z5), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 895), aFwS228S0000000_15, new C451460Hn6(this, z5), new C451620HnM(this, z5), new C987103tV(this, z5));
            z6 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy5 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS545S0100000_15, new AwS545S0100000_1((Fragment) this, 896), aFwS228S0000000_15, null, null, null);
            z6 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z6 = true;
            z = false;
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS545S0100000_15, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 897), aFwS228S0000000_15, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy5;
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(OspShopViewModel.class);
        AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1(c19719912DlLIZ6, 898);
        AFwS228S0000000_1 aFwS228S0000000_16 = AFwS228S0000000_1.get$arr$(149);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS545S0100000_16, new C452070Ho5(), new C1622206Wu(this, z6), new C338490DOt(this, z6), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 899), aFwS228S0000000_16, new C451460Hn6(this, z6), new C451620HnM(this, z6), new C987103tV(this, z6));
            z7 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy6 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS545S0100000_16, new AwS545S0100000_1((Fragment) this, 900), aFwS228S0000000_16, null, null, null);
            z7 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ6);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(this);
            AwS545S0100000_1 awS545S0100000_17 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 901);
            C451460Hn6 c451460Hn6 = new C451460Hn6(this, z);
            C451620HnM c451620HnM = new C451620HnM(this, z);
            C987103tV c987103tV = new C987103tV(this, z);
            z7 = true;
            assemVMLazy6 = new AssemVMLazy(function0LJIIJ, awS545S0100000_16, c452070Ho5, c1622206WuLJII, c338490DOtLJIIIZ, awS545S0100000_17, aFwS228S0000000_16, c451460Hn6, c451620HnM, c987103tV);
        }
        this.LLIZLLLIL = assemVMLazy6;
        this.LLJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJLILLLLZIIL = z7;
        this.LLLIL = new AsS29S0100000_1(this, 3);
    }

    public final void VR() {
        C1390130mHL c1390130mHL = this.LLJLIL;
        if (c1390130mHL != null) {
            C786410Ut5.LLZ(c1390130mHL, 8);
        }
        View view = this.LLJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final void WR() {
        if (this.LLLF) {
            C936803lO c936803lO = this.LLLII;
            if (c936803lO != null) {
                aS().setState(new AwS580S0100000_1(c936803lO, 1111));
                bS().a = c936803lO.LIZIZ;
            }
            this.LLLF = false;
            this.LLLFFI = null;
            this.LLLFZ = null;
            AssemVMLazy assemVMLazy = this.LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZJ;
            ((OspBottomViewModel) assemVMLazy.getValue()).xQ2();
        }
    }

    public final SeaSkuSpecViewModel aS() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZJ;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    public final OrderSubmitAssemViewModel bS() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZJ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final boolean cS() {
        if (!this.LLLF && !dS()) {
            return false;
        }
        iS();
        return true;
    }

    public final void finish() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C20691715xz c20691715xz = this.LLJJIJIIJIL;
        if (c20691715xz != null) {
            c20691715xz.removeOnScrollListener(this.LLLIL);
        }
        ValueAnimator valueAnimator = this.LLJLLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJLLL = null;
        aS().LLJILJILJ = null;
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        bS().LLLZLZ.LJIIL(this, "a2270.b2768", null);
        ModuleManager moduleManager = bS().LLZIL;
        if (moduleManager != null) {
            moduleManager.LJIIIIZZ(bS().LLLZLZ.LIZ("a2270.b2768"));
        }
        C817603Hi.LJFF = bS().LLLZLZ.LIZLLL;
    }

    public final boolean dS() {
        return bS().LLLZ || bS().C;
    }

    public final void iS() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLLI < 1000) {
            return;
        }
        this.LLLI = jCurrentTimeMillis;
        C1389880mGw c1389880mGw = new C1389880mGw(this);
        Context context = getContext();
        c1389880mGw.LJIIIZ(context != null ? context.getString(2131832982) : null);
        c1389880mGw.LIZLLL(1000L);
        c1389880mGw.LJIIJ();
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        if (bS().getState().LLILZLL) {
            bS().jT2();
            return true;
        }
        bS().LLJZ = "return";
        return false;
    }

    @Override // X.InterfaceC988703tl
    public final boolean onBackPressed() {
        if (bS().getState().LLILZLL) {
            bS().jT2();
            return true;
        }
        bS().LLJZ = "return";
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        BillInfoData billInfoData;
        SkuSelection skuSelection;
        super.onDestroy();
        HashMap<String, Object> map = bS().LLLIL;
        if (Intrinsics.LJFF(map != null ? map.get("previous_page") : null, "product_detail") && (billInfoData = bS().LLJJI) != null && (skuSelection = billInfoData.skuSelection) != null) {
            List<OrderShopDigest> list = bS().LLILZIL;
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
            AnonymousClass0378.LIZ().LIZ("ec_sea_one_step_osp_panel_close", C1741890vQh.LJIIIIZZ(new C955003oK(skuSelection.productId, Integer.valueOf(iIntValue), C13LP.LLIIII(aS().getState().LL))));
        }
        LLLILZLLLI = null;
        C03O0.LIZ.getClass();
        C03O0.LJIIIIZZ();
        bS().uT2();
        C914303hl.LIZ.getClass();
        C914303hl.LIZJ(this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("restore_sku_quantity_event", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_pay_middle_successed", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_pay_middle_failed", this);
        }
        IEventCenter iEventCenter4 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter4 != null) {
            iEventCenter4.LIZJ("ec_resend_pay_request", this);
        }
        IEventCenter iEventCenter5 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter5 != null) {
            iEventCenter5.LIZJ("ec_payment_error_dialog", this);
        }
        IEventCenter iEventCenter6 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter6 != null) {
            iEventCenter6.LIZJ("ec_no_pay_after_save_address", this);
        }
        IEventCenter iEventCenter7 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter7 != null) {
            iEventCenter7.LIZJ("payment_ccdc_bindcard_tips", this);
        }
        IEventCenter iEventCenter8 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter8 != null) {
            iEventCenter8.LIZJ("ec_update_address_location", this);
        }
        IEventCenter iEventCenter9 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter9 != null) {
            iEventCenter9.LIZJ("ec_change_supply_info", this);
        }
        IEventCenter iEventCenter10 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter10 != null) {
            iEventCenter10.LIZJ("ec_order_submit_page_refresh", this);
        }
        IEventCenter iEventCenter11 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter11 != null) {
            iEventCenter11.LIZJ("ec_osp_animation_show", this);
        }
        AnonymousClass0378.LIZ().LIZJ("ec_localized_size_changed", this);
        bS().tT2();
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SeaOneStepOrderSubmitFragment.class.getName());
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
        OrderSubmitAssemViewModel orderSubmitAssemViewModelBS = bS();
        orderSubmitAssemViewModelBS.withState(new AwS580S0100000_1(orderSubmitAssemViewModelBS, 417));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        IECommerceHostService iECommerceHostService;
        AddonOrder addonOrder;
        super.onStop();
        Integer numValueOf = null;
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
            bS().LLJZ = "close";
        }
        if (C904203g8.LJIIJ) {
            return;
        }
        C03O0 c03o0 = C03O0.LIZ;
        boolean z = bS().LLJLL;
        String str = bS().LLJZ;
        Boolean boolValueOf = Boolean.valueOf(bS().LLLIIII);
        Boolean boolValueOf2 = Boolean.valueOf(bS().LLLIIIIL);
        HashMap<String, Object> mapHi1 = bS().hi1(true);
        String strWR2 = bS().wR2();
        BillInfoData billInfoData = bS().LLJJI;
        if (billInfoData != null && (addonOrder = billInfoData.addonOrder) != null) {
            numValueOf = Integer.valueOf(addonOrder.LIZ());
        }
        C03O0.LJJLIIIJJIZ(c03o0, z, str, boolValueOf, boolValueOf2, mapHi1, null, null, null, strWR2, numValueOf, bS().PR2(), bS().iR2(), bS().LLLZLZ.LJIIJ(), bS().IR2(), null, null, null, null, null, null, null, bS().LLLZLL, null, null, null, null, null, null, null, null, null, null, null, -4226592, 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        BillInfoData billInfoData = bS().LLJJI;
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
        if (bS().Pp(map)) {
            return true;
        }
        C20691715xz c20691715xz = this.LLJJIJIIJIL;
        if (c20691715xz == null || (c20691715xz.getChildCount() > 0 && c20691715xz.getHeight() > 0)) {
            return false;
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 123));
    }

    public final void bu(String str) {
        ConstraintLayout constraintLayout = this.LLJJIJI;
        if (constraintLayout != null) {
            C1383230m6D c1383230m6D = new C1383230m6D(new C1389920mH0(str, null, null, 8189), 30);
            C1389890mGx c1389890mGx = new C1389890mGx(constraintLayout);
            c1389890mGx.LIZ = c1383230m6D;
            c1389890mGx.LJIIJJI();
        }
    }

    public final void hS(int i) {
        C20691715xz c20691715xz = this.LLJJIJIIJIL;
        if (c20691715xz == null || i < 0) {
            return;
        }
        AwS141S0101000_1 awS141S0101000_1 = new AwS141S0101000_1(c20691715xz, i, 0);
        if (c20691715xz.isComputingLayout()) {
            HandlerHook.viewPost(c20691715xz, new ARunnableS101S0100000_1(awS141S0101000_1, 10));
        } else {
            awS141S0101000_1.invoke();
        }
    }

    public final void kS(final boolean z) {
        FrameLayout frameLayout;
        final View viewFindViewById;
        boolean z2;
        final int measuredHeight;
        final int height;
        TimeInterpolator accelerateInterpolator;
        int width;
        View view;
        AppCompatTextView appCompatTextView;
        if (this.LLJLILLLLZIIL == z || this.LLJZ) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLL < 200) {
            return;
        }
        this.LLL = jCurrentTimeMillis;
        this.LLJLILLLLZIIL = z;
        this.LLJLL = true;
        if (!this.LLJZ && (frameLayout = this.LLJJJJ) != null && (viewFindViewById = frameLayout.findViewById(R.id.u47)) != null) {
            CharSequence text = null;
            if ((viewFindViewById instanceof TuxTextView) && (appCompatTextView = (AppCompatTextView) viewFindViewById) != null) {
                text = appCompatTextView.getText();
            }
            int i = 0;
            if (text != null && text.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
                return;
            }
            ValueAnimator valueAnimator = this.LLJLLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z) {
                measuredHeight = this.LLJZIJLIL;
                if (measuredHeight <= 0) {
                    Object parent = viewFindViewById.getParent();
                    if ((parent instanceof View) && (view = (View) parent) != null) {
                        width = view.getWidth();
                    } else {
                        width = 0;
                    }
                    viewFindViewById.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    measuredHeight = viewFindViewById.getMeasuredHeight();
                    this.LLJZIJLIL = measuredHeight;
                }
            } else {
                measuredHeight = 0;
            }
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById;
            if (tuxTextView.getVisibility() == 8) {
                height = 0;
            } else {
                height = tuxTextView.getHeight();
            }
            if (z) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            if (height == measuredHeight) {
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LLLLZLL(tuxTextView, i);
                C786410Ut5.B5(tuxTextView, 1.0f);
                return;
            }
            this.LLJZ = true;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, measuredHeight);
            valueAnimatorOfInt.setDuration(120L);
            if (z) {
                accelerateInterpolator = new DecelerateInterpolator();
            } else {
                accelerateInterpolator = new AccelerateInterpolator();
            }
            valueAnimatorOfInt.setInterpolator(accelerateInterpolator);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.03Tz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int i2;
                    int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    layoutParams.height = iIntValue;
                    C786410Ut5.R6((TuxTextView) viewFindViewById, layoutParams);
                    if (z) {
                        i2 = measuredHeight;
                    } else {
                        i2 = height;
                    }
                    if (i2 < 1) {
                        i2 = 1;
                    }
                    C786410Ut5.B5((TuxTextView) viewFindViewById, C13LZ.LIZLLL(iIntValue / i2, 0.0f, 1.0f));
                }
            });
            valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.03U0
                public boolean LL;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL = true;
                    this.LLILLJJLI.LLJZ = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment = this.LLILLJJLI;
                    seaOneStepOrderSubmitFragment.LLJZ = false;
                    seaOneStepOrderSubmitFragment.LLJLLL = null;
                    if (this.LL) {
                        return;
                    }
                    if (!z) {
                        C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById, 8);
                    }
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    layoutParams.height = -2;
                    C786410Ut5.R6((TuxTextView) viewFindViewById, layoutParams);
                    C786410Ut5.B5((TuxTextView) viewFindViewById, 1.0f);
                }
            });
            valueAnimatorOfInt.start();
            this.LLJLLL = valueAnimatorOfInt;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String strGenCacheKey;
        super.onCreate(bundle);
        ModuleManager moduleManager = bS().LLZIL;
        if (moduleManager != null) {
            moduleManager.LJIIIZ(this);
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZLLL();
        LLLILZLLLI = this;
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> map = bS().LLLIL;
        c03o0.getClass();
        C03O0.LJJI(map);
        C03O0.LJIJJLI();
        BillInfoRequest billInfoRequest = bS().p;
        Context contextN3 = null;
        if (billInfoRequest != null) {
            strGenCacheKey = billInfoRequest.genCacheKey(null);
        } else {
            strGenCacheKey = null;
        }
        if (bS().LLJJI == null) {
            boolean z = C843303Rf.LIZ;
            if (C843303Rf.LIZLLL(Integer.valueOf(bS().LL), strGenCacheKey)) {
                bS().C = true;
            }
        }
        bS().TQ2();
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
            iEventCenter.LIZLLL("restore_sku_quantity_event", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_pay_middle_successed", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZLLL("ec_pay_middle_failed", this);
        }
        IEventCenter iEventCenter4 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter4 != null) {
            iEventCenter4.LIZLLL("ec_resend_pay_request", this);
        }
        IEventCenter iEventCenter5 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter5 != null) {
            iEventCenter5.LIZLLL("ec_payment_error_dialog", this);
        }
        IEventCenter iEventCenter6 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter6 != null) {
            iEventCenter6.LIZLLL("ec_no_pay_after_save_address", this);
        }
        IEventCenter iEventCenter7 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter7 != null) {
            iEventCenter7.LIZLLL("payment_ccdc_bindcard_tips", this);
        }
        IEventCenter iEventCenter8 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter8 != null) {
            iEventCenter8.LIZLLL("ec_update_address_location", this);
        }
        IEventCenter iEventCenter9 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter9 != null) {
            iEventCenter9.LIZLLL("ec_change_supply_info", this);
        }
        IEventCenter iEventCenter10 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter10 != null) {
            iEventCenter10.LIZLLL("ec_order_submit_page_refresh", this);
        }
        IEventCenter iEventCenter11 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter11 != null) {
            iEventCenter11.LIZLLL("ec_osp_animation_show", this);
        }
        AnonymousClass0378.LIZ().LIZLLL("ec_localized_size_changed", this);
        bS().pT2();
    }

    public final View ZR(MotionEvent motionEvent, View view) {
        if (view != null && view.isShown() && gS(motionEvent, view)) {
            if (!(view instanceof ViewGroup)) {
                return view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View viewZR = ZR(motionEvent, viewGroup.getChildAt(childCount));
                if (viewZR != null) {
                    return viewZR;
                }
            }
            return view;
        }
        return null;
    }

    public final boolean gS(MotionEvent motionEvent, View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth() + i;
        int height = view.getHeight() + i2;
        if (motionEvent.getRawX() < i || motionEvent.getRawX() > width || motionEvent.getRawY() < i2 || motionEvent.getRawY() > height) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        int value;
        Integer num;
        Type type;
        Type type2;
        String strLIZ;
        C19EG activity;
        Context context;
        String str3;
        Type type3;
        C03VO c03vo;
        Object obj;
        String str4;
        Type type4;
        C03VO c03vo2;
        C802003Bi c802003Bi;
        Integer num2;
        Type type5;
        Type type6;
        IdentityInfo identityInfo;
        IdentityInfoCollectionStyle identityInfoCollectionStyle;
        Integer sceneCode;
        Integer num3;
        IdentityInfo identityInfo2;
        IdentityInfo identityInfo3;
        RecipientIdentityInfo recipientIdentityInfo;
        RecipientIdentityInfo recipientIdentityInfo2;
        OrderSubmitRefreshEventParams orderSubmitRefreshEventParams = null;
        String str5 = null;
        recipientIdentityInfoCopy = null;
        recipientIdentityInfoCopy = null;
        RecipientIdentityInfo recipientIdentityInfoCopy = null;
        identityInfoCopy = null;
        IdentityInfo identityInfoCopy = null;
        Integer num4 = null;
        PaymentMethod paymentMethod = null;
        switch (str.hashCode()) {
            case -2064356983:
                if (str.equals("ec_no_pay_after_save_address")) {
                    PaymentInfo paymentInfo = bS().LLJJJ;
                    if (paymentInfo == null || !Intrinsics.LJFF(paymentInfo.isValid, Boolean.TRUE)) {
                        OrderSubmitAssemViewModel.oT2(bS(), "payment_methods", false);
                        bS().LLJJLIIIJLLLLLLLZ = true;
                    }
                }
                break;
            case -1899682512:
                if (str.equals("ec_change_supply_info")) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type6 = C2371409Qy.LIZJ(C13LE.LJII(EcChangeSupplyInfoEventParams.class));
                        } else {
                            type6 = new TypeToken<EcChangeSupplyInfoEventParams>() { // from class: X.03UX
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type6);
                        if (!(objFromJson instanceof EcChangeSupplyInfoEventParams)) {
                            objFromJson = null;
                        }
                        EcChangeSupplyInfoEventParams ecChangeSupplyInfoEventParams = (EcChangeSupplyInfoEventParams) objFromJson;
                        if (ecChangeSupplyInfoEventParams != null && (identityInfo = bS().LLZLI) != null && identityInfo.getRecipientIdentityInfo() != null) {
                            IdentityInfo identityInfo4 = bS().LLZLI;
                            if (identityInfo4 != null) {
                                identityInfoCollectionStyle = identityInfo4.getIdentityInfoCollectionStyle();
                            } else {
                                identityInfoCollectionStyle = null;
                            }
                            if (identityInfoCollectionStyle == IdentityInfoCollectionStyle.STYLE1) {
                                IdentityInfo identityInfo5 = bS().LLZLI;
                                if (identityInfo5 != null && (recipientIdentityInfo2 = identityInfo5.getRecipientIdentityInfo()) != null) {
                                    sceneCode = recipientIdentityInfo2.getSceneCode();
                                } else {
                                    sceneCode = null;
                                }
                                EcChangeSupplyInfoModel ecChangeSupplyInfoModel = ecChangeSupplyInfoEventParams.supplyInfo;
                                if (ecChangeSupplyInfoModel != null) {
                                    num3 = ecChangeSupplyInfoModel.sceneCode;
                                } else {
                                    num3 = null;
                                }
                                if (Intrinsics.LJFF(sceneCode, num3)) {
                                    OrderSubmitAssemViewModel orderSubmitAssemViewModelBS = bS();
                                    BillInfoData billInfoData = bS().LLJJI;
                                    if (billInfoData != null && (identityInfo2 = billInfoData.identityInfo) != null) {
                                        BillInfoData billInfoData2 = bS().LLJJI;
                                        if (billInfoData2 != null && (identityInfo3 = billInfoData2.identityInfo) != null && (recipientIdentityInfo = identityInfo3.getRecipientIdentityInfo()) != null) {
                                            EcChangeSupplyInfoModel ecChangeSupplyInfoModel2 = ecChangeSupplyInfoEventParams.supplyInfo;
                                            if (ecChangeSupplyInfoModel2 != null) {
                                                str5 = ecChangeSupplyInfoModel2.encryptedInfoId;
                                            }
                                            recipientIdentityInfoCopy = recipientIdentityInfo.copy(str5, recipientIdentityInfo.identityInfoCollectionPageSchema, recipientIdentityInfo.identityInfoVerificationMode, recipientIdentityInfo.unfilledNoteIcon, recipientIdentityInfo.unfilledNote, recipientIdentityInfo.filledNoteIcon, recipientIdentityInfo.filledNote, recipientIdentityInfo.sceneCode, recipientIdentityInfo.daInfo);
                                        }
                                        identityInfoCopy = identityInfo2.copy(identityInfo2.hintText, identityInfo2.identityRequired, identityInfo2.identityInfoOption, identityInfo2.identityInfoPanel, identityInfo2.identityInfoCollectionStyle, recipientIdentityInfoCopy, identityInfo2.enableAddressIdentity, identityInfo2.title);
                                    }
                                    orderSubmitAssemViewModelBS.IQ2(identityInfoCopy);
                                    OrderSubmitAssemViewModel.OS2(bS(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.IDENTITY_INFO.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
                                }
                            }
                            break;
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                break;
            case -1585073227:
                if (str.equals("ec_update_address_location")) {
                    try {
                        Gson gsonLJFF2 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                            type5 = C2371409Qy.LIZJ(C13LE.LJII(C854203Vk.class));
                        } else {
                            type5 = new TypeToken<C854203Vk>() { // from class: X.03UW
                            }.getType();
                        }
                        Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type5);
                        if (!(objFromJson2 instanceof C854203Vk)) {
                            objFromJson2 = null;
                        }
                        C854203Vk c854203Vk = (C854203Vk) objFromJson2;
                        if (c854203Vk != null && Intrinsics.LJFF(c854203Vk.LIZ, "order_submit")) {
                            OrderSubmitAssemViewModel.OS2(bS(), false, false, null, false, true, false, null, null, false, null, null, new ChangeInfo(C03DI.UPDATE_MAP_LOCATION.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380381);
                            break;
                        }
                    } catch (s e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return;
                    }
                }
                break;
            case -1413704395:
                if (str.equals("ec_resend_pay_request")) {
                    C736680Sv4.LJIJJ(bS(), new AwS580S0100000_1(this, 124));
                }
                break;
            case -1196015749:
                if (str.equals("ec_localized_size_changed")) {
                    bS().NQ2();
                }
                break;
            case -1136609639:
                if (str.equals("restore_sku_quantity_event") && (c802003Bi = bS().LLLLZIL) != null && (num2 = c802003Bi.LIZIZ) != null) {
                    aS().setState(new AwS16S0001000_1(num2.intValue(), 27));
                    break;
                }
                break;
            case -247382535:
                if (str.equals("ec_payment_error_dialog")) {
                    try {
                        Gson gsonLJFF3 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ3 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ3 != null && c1121904a9LIZIZ3.LJII) {
                            type4 = C2371409Qy.LIZJ(C13LE.LJII(C03VO.class));
                        } else {
                            type4 = new TypeToken<C03VO>() { // from class: X.03UV
                            }.getType();
                        }
                        Object objFromJson3 = GsonProtectorUtils.fromJson(gsonLJFF3, str2, type4);
                        if (!(objFromJson3 instanceof C03VO)) {
                            objFromJson3 = null;
                        }
                        c03vo2 = (C03VO) objFromJson3;
                    } catch (s e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    if (c03vo2 != null) {
                        str4 = c03vo2.LIZ;
                    } else {
                        str4 = null;
                    }
                    try {
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        C1AF0.LJ(e4);
                        return;
                    }
                }
                break;
            case 129259948:
                if (str.equals("ec_osp_animation_show")) {
                    HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
                    if (mapLJIIJ != null) {
                        obj = mapLJIIJ.get("type");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Integer) {
                        num4 = (Integer) obj;
                    }
                    OrderSubmitAssemViewModel orderSubmitAssemViewModelBS2 = bS();
                    if (num4 != null) {
                        num4.intValue();
                        if (num4.intValue() == C03MG.BONUS.getValue()) {
                            orderSubmitAssemViewModelBS2.Z = true;
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
                            type3 = C2371409Qy.LIZJ(C13LE.LJII(C03VO.class));
                        } else {
                            type3 = new TypeToken<C03VO>() { // from class: X.03UZ
                            }.getType();
                        }
                        Object objFromJson4 = GsonProtectorUtils.fromJson(gsonLJFF4, str2, type3);
                        if (!(objFromJson4 instanceof C03VO)) {
                            objFromJson4 = null;
                        }
                        c03vo = (C03VO) objFromJson4;
                    } catch (s e5) {
                        TryCatchGuardChecker.doCheck(e5);
                    }
                    if (c03vo == null) {
                        str3 = null;
                    } else {
                        str3 = c03vo.LIZIZ;
                    }
                    C897503f3.LJIIJ(context, str3, null);
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
                            type2 = C2371409Qy.LIZJ(C13LE.LJII(PayMiddleFailedEvent.class));
                        } else {
                            type2 = new TypeToken<PayMiddleFailedEvent>() { // from class: X.03UU
                            }.getType();
                        }
                        Object objFromJson5 = GsonProtectorUtils.fromJson(gsonLJFF5, str2, type2);
                        if (!(objFromJson5 instanceof PayMiddleFailedEvent)) {
                            objFromJson5 = null;
                        }
                        PayMiddleFailedEvent payMiddleFailedEvent = (PayMiddleFailedEvent) objFromJson5;
                        if (payMiddleFailedEvent != null && (strLIZ = payMiddleFailedEvent.LIZ()) != null && (activity = getActivity()) != null) {
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
                            C985403tE.LIZ(c1397580mTM, new AwS115S1100000_1(string2, this, 55));
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
                if (str.equals("ec_pay_middle_successed")) {
                    C03O0 c03o0 = C03O0.LIZ;
                    PaymentInfo paymentInfo2 = bS().LLJJJ;
                    if (paymentInfo2 != null) {
                        paymentMethod = paymentInfo2.paymentMethod;
                    }
                    c03o0.getClass();
                    C03O0.LJLI(paymentMethod, false, false, "FE_QUERY");
                    finish();
                }
                break;
            case 1074613024:
                if (str.equals("ec_order_submit_page_refresh")) {
                    try {
                        Gson gsonLJFF6 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ6 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ6 != null && c1121904a9LIZIZ6.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(OrderSubmitRefreshEventParams.class));
                        } else {
                            type = new TypeToken<OrderSubmitRefreshEventParams>() { // from class: X.03UY
                            }.getType();
                        }
                        Object objFromJson6 = GsonProtectorUtils.fromJson(gsonLJFF6, str2, type);
                        if (!(objFromJson6 instanceof OrderSubmitRefreshEventParams)) {
                            objFromJson6 = null;
                        }
                        orderSubmitRefreshEventParams = (OrderSubmitRefreshEventParams) objFromJson6;
                    } catch (s e7) {
                        TryCatchGuardChecker.doCheck(e7);
                    }
                    OrderSubmitAssemViewModel orderSubmitAssemViewModelBS3 = bS();
                    if (orderSubmitRefreshEventParams != null && (num = orderSubmitRefreshEventParams.changeType) != null) {
                        value = num.intValue();
                    } else {
                        value = C03DI.DEFAULT.getValue();
                    }
                    OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModelBS3, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(value, null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.0Say, X.0wBP] */
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
        C20691715xz c20691715xz;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        Object obj = null;
        AbstractC21673719rz abstractC21673719rz = null;
        if (context != null) {
            this.LLJJIII = (C1749280vcc) view.findViewById(R.id.w28);
            this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.trr);
            this.LLJJIJIIJIL = (C20691715xz) view.findViewById(R.id.rn0);
            this.LLJJIJIL = (ViewGroup) view.findViewById(R.id.eux);
            view.findViewById(R.id.yc1);
            ViewGroup viewGroup = this.LLJJIJIL;
            if (viewGroup != null) {
                abstractC21673719rz = null;
                C426750GoL.LJIIIZ(viewGroup, null, 0, null, null, false, 29);
            }
            this.LLJJJJ = (FrameLayout) view.findViewById(R.id.agq);
            this.LLJJJJJIL = (FrameLayout) view.findViewById(R.id.yg8);
            this.LLJJL = (FrameLayout) view.findViewById(R.id.ry4);
            this.LLJJLIIIJLLLLLLLZ = (C936503lL) view.findViewById(R.id.gxz);
            this.LLJJJ = (TuxTextView) view.findViewById(R.id.cbf);
            this.LLJJJIL = (FrameLayout) view.findViewById(R.id.ccd);
            this.LLLIIL = (FrameLayout) view.findViewById(R.id.woy);
            this.LLJL = view.findViewById(R.id.nn5);
            this.LLJLIL = (C1390130mHL) view.findViewById(R.id.nmj);
            View view2 = this.LLJL;
            if (view2 != null) {
                view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.03Vc
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        return true;
                    }
                });
            }
            FrameLayout frameLayout = this.LLJJJIL;
            if (frameLayout != null) {
                frameLayout.setOnTouchListener(new ATListenerS437S0100000_1(this, 8));
            }
            C20691715xz c20691715xz2 = this.LLJJIJIIJIL;
            if (c20691715xz2 != null) {
                c20691715xz2.setItemAnimator(abstractC21673719rz);
            }
            C20691715xz c20691715xz3 = this.LLJJIJIIJIL;
            if (c20691715xz3 != null) {
                c20691715xz3.addOnItemTouchListener(new C0KFD() { // from class: X.03nL
                    public final GestureDetector LL;

                    {
                        this.LL = new GestureDetector(this.LLILLJJLI.requireContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.03nK
                            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                                C20691715xz c20691715xz4;
                                boolean zDS = seaOneStepOrderSubmitFragment.dS();
                                SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment = seaOneStepOrderSubmitFragment;
                                if ((!seaOneStepOrderSubmitFragment.LLLF && !zDS) || seaOneStepOrderSubmitFragment.LLLIIIIL || (c20691715xz4 = seaOneStepOrderSubmitFragment.LLJJIJIIJIL) == null) {
                                    return false;
                                }
                                if (!zDS) {
                                    seaOneStepOrderSubmitFragment.getClass();
                                    View viewFindChildViewUnder = c20691715xz4.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                                    if (viewFindChildViewUnder != null && seaOneStepOrderSubmitFragment.gS(motionEvent, viewFindChildViewUnder.findViewById(R.id.u50))) {
                                        return false;
                                    }
                                }
                                View viewFindChildViewUnder2 = c20691715xz4.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                                View viewZR = seaOneStepOrderSubmitFragment.ZR(motionEvent, viewFindChildViewUnder2);
                                if (viewZR != null) {
                                    do {
                                        if (viewZR.isShown() && (viewZR.hasOnClickListeners() || viewZR.isLongClickable() || (viewZR.isFocusable() && !(viewZR instanceof ViewGroup)))) {
                                            seaOneStepOrderSubmitFragment.iS();
                                            return true;
                                        }
                                        if (viewZR == viewFindChildViewUnder2) {
                                            break;
                                        }
                                        Object parent = viewZR.getParent();
                                        if (!(parent instanceof View)) {
                                            break;
                                        }
                                        viewZR = (View) parent;
                                    } while (viewZR != null);
                                }
                                return false;
                            }
                        });
                    }

                    @Override // X.InterfaceC21676019sM
                    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment = this.LLILLJJLI;
                        if ((seaOneStepOrderSubmitFragment.LLLF || seaOneStepOrderSubmitFragment.dS()) && this.LL.onTouchEvent(motionEvent)) {
                            return true;
                        }
                        if (!this.LLILLJJLI.aS().LLJILJIL) {
                            return false;
                        }
                        if (motionEvent.getAction() == 2) {
                            this.LLILLJJLI.aS().EQ2(false);
                            return true;
                        }
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        View viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                        if (viewFindChildViewUnder != null) {
                            SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment2 = this.LLILLJJLI;
                            View viewFindViewById = viewFindChildViewUnder.findViewById(R.id.vhb);
                            View viewFindViewById2 = viewFindChildViewUnder.findViewById(R.id.vha);
                            View viewFindViewById3 = viewFindChildViewUnder.findViewById(R.id.vh_);
                            if (seaOneStepOrderSubmitFragment2.gS(motionEvent, viewFindViewById) || seaOneStepOrderSubmitFragment2.gS(motionEvent, viewFindViewById2) || seaOneStepOrderSubmitFragment2.gS(motionEvent, viewFindViewById3)) {
                                return false;
                            }
                        }
                        this.LLILLJJLI.aS().EQ2(false);
                        return true;
                    }
                });
            }
            if (C963303pf.LIZIZ()) {
                C832503Nb c832503Nb = C832503Nb.LIZ;
                C20691715xz c20691715xz4 = this.LLJJIJIIJIL;
                c832503Nb.getClass();
                C832503Nb.LIZ(c20691715xz4);
            } else {
                C832403Na.LIZIZ(this.LLJJIJIIJIL);
            }
            C20691715xz c20691715xz5 = this.LLJJIJIIJIL;
            if (c20691715xz5 != null) {
                c20691715xz5.addOnScrollListener(this.LLLIL);
            }
            C20691715xz c20691715xz6 = this.LLJJIJIIJIL;
            if (c20691715xz6 != null) {
                c20691715xz6.setItemViewCacheSize(15);
            }
            C850603Ua c850603Ua = new C850603Ua(context, 1, false);
            this.LLJJI = c850603Ua;
            C20691715xz c20691715xz7 = this.LLJJIJIIJIL;
            if (c20691715xz7 != null) {
                c20691715xz7.setLayoutManager(c850603Ua);
            }
            aS().LLJILJILJ = new C908703gr(this);
            C1749280vcc c1749280vcc = this.LLJJIII;
            if (c1749280vcc != null) {
                c1749280vcc.LIZIZ(C786410Ut5.Td(C786410Ut5.ne(requireContext()), R.layout.b4d, this.LLJJIJI, false));
            }
            C1770850wBP c1770850wBP = abstractC21673719rz;
            C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03UD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C03JV) obj2).LLLJL;
                }
            }, c1770850wBP, new AwS615S0100000_1(this, 271), 6);
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
                    name = c1770850wBP;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                iECommerceHostService = iPerformanceOptDependencyServiceCreateIPerformanceOptDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
            }
            ((IPerformanceOptDependencyService) iECommerceHostService).createFpsMonitor("tiktokec_anchor_order_submit").LIZIZ(this.LLJJIJIIJIL);
            C19EG activity = getActivity();
            if ((activity instanceof C19GS) && activity != null) {
                this.LLLIILIL = new KeyBoardVisibilityUtil((C19FO) activity, (Integer) 32, (Function2<? super Boolean, ? super Integer, Unit>) new AwS437S0200000_1(view, this, 15));
            }
            HandlerHook.viewPost(view, new ARunnableS70S0200000_1(view, this, 33));
            obj = c1770850wBP;
        }
        ?? r11 = obj;
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03Jr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).e;
            }
        }, r11, new AwS615S0100000_1(this, 312), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03II
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).c;
            }
        }, r11, new AwS615S0100000_1(this, 258), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03Uc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLILLJJLI;
            }
        }, r11, new AwS615S0100000_1(this, 346), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03UQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLILZIL;
            }
        }, r11, new AwS615S0100000_1(this, 247), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03Ub
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLILZLL);
            }
        }, r11, new AwS615S0100000_1(this, 322), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03TV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C03JV) obj2).LL);
            }
        }, r11, new AwS615S0100000_1(this, 337), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03UA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLJJLIIIJLLLLLLLZ);
            }
        }, r11, new AwS615S0100000_1(this, 344), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03UP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJL;
            }
        }, r11, new AwS615S0100000_1(this, 246), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03Tt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLILZJ;
            }
        }, r11, new AwS615S0100000_1(this, 255), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03Uo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLIZZ;
            }
        }, r11, new AwS615S0100000_1(this, 267), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03UG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLILLL;
            }
        }, r11, new AwS615S0100000_1(this, 280), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03V1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJIJIIJIL;
            }
        }, r11, new AwS615S0100000_1(this, 288), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03V8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJIJIL;
            }
        }, r11, new AwS615S0100000_1(this, 297), 6);
        C736680Sv4.LJIIIZ(this, bS(), new C2217381BqS() { // from class: X.03JH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLJJJ);
            }
        }, new C2217381BqS() { // from class: X.03Jk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Long.valueOf(((C03JV) obj2).LLJJJIL);
            }
        }, r11, new AwS650S0100000_1(this, 34), 12);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03UN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJI;
            }
        }, r11, new AwS615S0100000_1(this, 329), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03UO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLJJIII;
            }
        }, r11, new AwS615S0100000_1(this, 345), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03TP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C03JV) obj2).LLJJ);
            }
        }, r11, new AwS615S0100000_1(this, 291), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03Us
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLFF;
            }
        }, r11, new AwS615S0100000_1(this, 301), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03Uw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLIILIL;
            }
        }, r11, new AwS615S0100000_1(this, 308), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03V0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLIL;
            }
        }, r11, new AwS615S0100000_1(this, 323), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03V7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLILZ;
            }
        }, r11, new AwS615S0100000_1(this, 332), 6);
        C736680Sv4.LJIIIZ(this, bS(), new C2217381BqS() { // from class: X.03NW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLIIIILLL;
            }
        }, new C2217381BqS() { // from class: X.03NZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLIIL;
            }
        }, r11, new AwS650S0100000_1(this, 36), 12);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03Uf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLZZIL;
            }
        }, r11, new AwS615S0100000_1(this, 248), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03NN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLLLJ;
            }
        }, r11, new AwS615S0100000_1(this, 261), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03NO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLJ;
            }
        }, r11, new AwS615S0100000_1(this, 268), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03UH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).LLLLLIL;
            }
        }, r11, new AwS615S0100000_1(this, 276), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03TT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C03JV) obj2).LLZZ);
            }
        }, r11, new AwS615S0100000_1(this, 282), 6);
        C736680Sv4.LJIIIIZZ(this, aS(), new C2217381BqS() { // from class: X.03lV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C936903lP) obj2).LLILZLL;
            }
        }, r11, new AwS615S0100000_1(this, 298), 6);
        C736680Sv4.LJIIIIZZ(this, bS(), new C2217381BqS() { // from class: X.03K2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C03JV) obj2).d;
            }
        }, r11, new AwS615S0100000_1(this, 313), 6);
        C736680Sv4.LJIIIIZZ(this, aS(), new C2217381BqS() { // from class: X.03VF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C936903lP) obj2).LLILLJJLI;
            }
        }, r11, new AwS615S0100000_1(this, 330), 6);
        C736680Sv4.LJIIIZ(this, aS(), new C2217381BqS() { // from class: X.03lX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C936903lP) obj2).LLIZLLLIL;
            }
        }, new C2217381BqS() { // from class: X.03VJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C936903lP) obj2).LLJ;
            }
        }, r11, new AwS650S0100000_1(this, 35), 12);
        C723850SaN.LIZ(this, false, r11, new AwS581S0100000_2(this, 704), 3);
        if (bS().LLLZI && bS().LLJJI == null) {
            C20691715xz c20691715xz8 = this.LLJJIJIIJIL;
            if (c20691715xz8 != null) {
                ModuleManager moduleManager = bS().LLZIL;
                if (moduleManager != null) {
                    moduleManager.LJIILLIIL = 1;
                }
                c20691715xz8.setInPreview(true);
                C7862035g c7862035g = C7862035g.LIZ;
                OrderSubmitAssemViewModel orderSubmitAssemViewModelBS = bS();
                SeaSkuSpecViewModel seaSkuSpecViewModelAS = aS();
                c7862035g.getClass();
                C7862035g.LIZ(this, orderSubmitAssemViewModelBS, seaSkuSpecViewModelAS, false);
            }
        } else if (bS().C && bS().LLJJI == null && (c20691715xz = this.LLJJIJIIJIL) != null) {
            ModuleManager moduleManager2 = bS().LLZIL;
            if (moduleManager2 != null) {
                moduleManager2.LJIILLIIL = 2;
            }
            c20691715xz.setInPreview(true);
            C7862035g c7862035g2 = C7862035g.LIZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModelBS2 = bS();
            SeaSkuSpecViewModel seaSkuSpecViewModelAS2 = aS();
            c7862035g2.getClass();
            C7862035g.LIZ(this, orderSubmitAssemViewModelBS2, seaSkuSpecViewModelAS2, true);
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModelBS3 = bS();
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZJ;
        orderSubmitAssemViewModelBS3.kS2(this, (OspAddressViewModel) assemVMLazy.getValue(), (PaymentInfoViewModel) this.LLILZLL.getValue(), (OspBottomViewModel) this.LLIZ.getValue(), (OspShopViewModel) this.LLIZLLLIL.getValue());
        ModuleManager moduleManager3 = bS().LLZIL;
        if (moduleManager3 != null) {
            moduleManager3.LIZJ(view);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            C03XA.LIZ.getClass();
            viewLIZJ = C03XA.LIZJ(activity, R.layout.avm, viewGroup, false);
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
