package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C036A;
import X.C037T;
import X.C03DI;
import X.C03DZ;
import X.C03H5;
import X.C03MG;
import X.C03O0;
import X.C03P4;
import X.C03Q4;
import X.C03T6;
import X.C03T7;
import X.C03U8;
import X.C03VH;
import X.C03VL;
import X.C03VM;
import X.C03VO;
import X.C03VY;
import X.C03XA;
import X.C04JT;
import X.C04JW;
import X.C098200Yq;
import X.C0C64;
import X.C0H9I;
import X.C0OM1;
import X.C0ZP4;
import X.C1008803x0;
import X.C10515049h;
import X.C1058220de0;
import X.C1077804Jk;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C13LP;
import X.C1504130pFD;
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
import X.C20515215Pi;
import X.C20691715xz;
import X.C2174021A6m;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C2371409Qy;
import X.C338490DOt;
import X.C423190Gib;
import X.C425700Gme;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C770702zh;
import X.C7768031q;
import X.C7806033c;
import X.C786410Ut5;
import X.C802003Bi;
import X.C803103Bt;
import X.C817603Hi;
import X.C832503Nb;
import X.C834903Nz;
import X.C835903Oj;
import X.C836003Ok;
import X.C843303Rf;
import X.C853303Vb;
import X.C853603Ve;
import X.C854203Vk;
import X.C897103ez;
import X.C897503f3;
import X.C904203g8;
import X.C907803gi;
import X.C908903gt;
import X.C914303hl;
import X.C936503lL;
import X.C939603lq;
import X.C953203o2;
import X.C960203pA;
import X.C963303pf;
import X.C983603sw;
import X.C985403tE;
import X.C987103tV;
import X.C989403ts;
import X.C994103ud;
import X.EnumC805703Ct;
import X.InterfaceC0148002o;
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
import X.InterfaceC988703tl;
import Y.ARunnableS101S0100000_1;
import Y.AsS29S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.EcChangeSupplyInfoEventParams;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.EcChangeSupplyInfoModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.sea.view.SeaOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.us.view.UsOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.EditDeliveryInstructionCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.OspAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.ageconfirm.AgeConfirmCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.bonus.BonusInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.policy.UserTrustCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.bonus.SeaBonusCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.extrafee.PaymentExtraFeeCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.right.UserRightsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.right.v2.UserRightModuleCellV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop.MXAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop.ShopInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.span.SpanCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.UnreachableExpendCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.UnreachableHeadCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.UnreachableSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.USOspAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.USOspPudoAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.discount.USPlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.refundable.USRefundableSampleCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.right.USUserBenefitPanelCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.rightguidance.RightGuidanceModuleCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shopify.USEmailAuthorizeCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary.USOrderSummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable.USUnreachableExpandCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable.USUnreachableHeadCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable.USUnreachableSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.USUserTrustCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPiBindingGrowthConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoPaymentFailedPopupMessage;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoCollectionStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderSubmitRefreshEventParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarousel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayMiddleFailedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RecipientIdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RetentionDialogInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS121S0110000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import nla.a;
import nla.b;
import org.json.JSONException;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSubmitFragment extends ECBaseFragment implements InterfaceC988703tl, InterfaceC1164530gPT, c, InterfaceC724530SbT {
    public static final C03P4 LLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public static OrderSubmitFragment LLLILZJ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSExKTYpZyAgOGs8KCg2Zgo+LSohGzAuJCYnDjctLiI2JjE=";
    public FrameLayout LLILLL;
    public C20691715xz LLILZ;
    public FrameLayout LLILZIL;
    public TuxNavBar LLILZLL;
    public C1749280vcc LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public C936503lL LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 885));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 888));
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public C425700Gme LLJJIJIL;
    public C423190Gib LLJJJ;
    public C20515215Pi LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public C939603lq LLJJJJLIIL;
    public b LLJJL;
    public final BPEAHandler LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public C1397510mTF LLJLLIL;
    public C1397510mTF LLJLLL;
    public boolean LLJZ;
    public long LLJZIJLIL;
    public boolean LLL;
    public View LLLF;
    public ViewGroup LLLFF;
    public C03T6 LLLFFI;
    public boolean LLLFZ;
    public C04JT LLLI;
    public final AsS29S0100000_1 LLLII;
    public final C2174021A6m LLLIIII;
    public final OrderSubmitFragment$processLifeCycleObserver$1 LLLIIIIL;
    public final C01GW LLLIIIL;
    public C19719912Dl LLLIIL;
    public View LLLIILIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OrderSubmitFragment.class, "assemViewModel", "getAssemViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(OrderSubmitFragment.class, "addressViewModel", "getAddressViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/address/OspAddressViewModel;", 0), new C2217381BqS(OrderSubmitFragment.class, "paymentInfoVM", "getPaymentInfoVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/payment/PaymentInfoViewModel;", 0), new C2217381BqS(OrderSubmitFragment.class, "bottomVM", "getBottomVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/bottom/OspBottomViewModel;", 0), new C2217381BqS(OrderSubmitFragment.class, "shopVM", "getShopVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/core/vm/OspShopViewModel;", 0)};
        LLLIL = new C03P4();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void MR() {
        C817603Hi.LJFF = null;
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
        return "OrderSubmitFragment";
    }

    public OrderSubmitFragment() {
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
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 874);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(143);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 880), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 881), aFwS228S0000000_1, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 882), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspAddressViewModel.class);
        AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1(c19719912DlLIZ2, 883);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(144);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 884), aFwS228S0000000_12, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new AwS545S0100000_1((Fragment) this, 886), aFwS228S0000000_12, null, null, null);
            z3 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = true;
            z = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS545S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 889), aFwS228S0000000_12, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PaymentInfoViewModel.class);
        AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1(c19719912DlLIZ3, 890);
        AFwS228S0000000_1 aFwS228S0000000_13 = AFwS228S0000000_1.get$arr$(146);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new C452070Ho5(), new C1622206Wu(this, z3), new C338490DOt(this, z3), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 891), aFwS228S0000000_13, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
            z4 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new AwS545S0100000_1((Fragment) this, 892), aFwS228S0000000_13, null, null, null);
            z4 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z4 = true;
            z = false;
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS545S0100000_13, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 893), aFwS228S0000000_13, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(OspBottomViewModel.class);
        AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ4, 894);
        AFwS228S0000000_1 aFwS228S0000000_14 = AFwS228S0000000_1.get$arr$(147);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new C452070Ho5(), new C1622206Wu(this, z4), new C338490DOt(this, z4), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 872), aFwS228S0000000_14, new C451460Hn6(this, z4), new C451620HnM(this, z4), new C987103tV(this, z4));
            z5 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new AwS545S0100000_1((Fragment) this, 873), aFwS228S0000000_14, null, null, null);
            z5 = true;
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z5 = true;
            z = false;
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS545S0100000_14, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 875), aFwS228S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJI = assemVMLazy4;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(OspShopViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ5, 876);
        AFwS228S0000000_1 aFwS228S0000000_15 = AFwS228S0000000_1.get$arr$(142);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS545S0100000_15, new C452070Ho5(), new C1622206Wu(this, z5), new C338490DOt(this, z5), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 877), aFwS228S0000000_15, new C451460Hn6(this, z5), new C451620HnM(this, z5), new C987103tV(this, z5));
            z6 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy5 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS545S0100000_15, new AwS545S0100000_1((Fragment) this, 878), aFwS228S0000000_15, null, null, null);
            z6 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ5);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(this);
            AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 879);
            C451460Hn6 c451460Hn6 = new C451460Hn6(this, z);
            C451620HnM c451620HnM = new C451620HnM(this, z);
            C987103tV c987103tV = new C987103tV(this, z);
            z6 = true;
            assemVMLazy5 = new AssemVMLazy(function0LJIIJ, awS545S0100000_15, c452070Ho5, c1622206WuLJII, c338490DOtLJIIIZ, awS545S0100000_16, aFwS228S0000000_15, c451460Hn6, c451620HnM, c987103tV);
        }
        this.LLJJIJIIJIL = assemVMLazy5;
        this.LLJJJJJIL = z6;
        this.LLJJL = new a();
        this.LLJJLIIIJLLLLLLLZ = new BPEAHandler(Looper.getMainLooper());
        this.LLLFFI = new C03T6(this);
        this.LLLFZ = z6;
        this.LLLII = new AsS29S0100000_1(this, 2);
        this.LLLIIII = new C2174021A6m();
        this.LLLIIIIL = new OrderSubmitFragment$processLifeCycleObserver$1();
        this.LLLIIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 887));
    }

    public final OspAddressViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZ;
        return (OspAddressViewModel) assemVMLazy.getValue();
    }

    public final OrderSubmitAssemViewModel ZR() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final FrameLayout aS() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ccd) : null;
            this.LLILZIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout bS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cju) : null;
            this.LLILLL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final TuxTextView cS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cjv) : null;
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C936503lL dS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gxz) : null;
            this.LLJILJIL = (C936503lL) viewFindViewById;
        }
        return (C936503lL) viewFindViewById;
    }

    public final C853603Ve gS() {
        return (C853603Ve) this.LLJILJILJ.getValue();
    }

    public final C20691715xz hS() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
            this.LLILZ = (C20691715xz) viewFindViewById;
        }
        return (C20691715xz) viewFindViewById;
    }

    public final C1749280vcc iS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLIZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final TuxNavBar kS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y08) : null;
            this.LLILZLL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:67)(8:6|(1:8)|9|(1:11)(1:46)|12|(1:14)(1:45)|15|(3:47|(9:50|(1:52)|53|(1:55)(2:63|(1:65)(1:66))|56|(1:58)|59|(1:61)|62)|78)(7:17|(1:19)(1:44)|20|(1:22)(1:43)|23|(0)(2:27|(12:31|(1:42)(1:35)|36|(4:39|(3:255|41|258)(1:257)|256|37)|254|68|(1:70)|71|(1:73)(1:234)|74|(1:76)|77))|78))|79|(9:85|(1:87)|88|(1:90)(1:176)|91|(1:93)(1:175)|94|(4:96|(1:98)(1:174)|99|(2:101|(4:103|(1:105)|106|(8:110|(1:112)|113|(4:115|(3:117|(1:121)|122)|123|(3:125|(1:127)(1:154)|128))(1:(4:156|(3:158|(1:162)|163)|164|(3:166|(1:168)(1:170)|169)))|129|(1:131)|132|(3:149|(1:151)(1:153)|152)(4:136|(1:138)|139|(2:(1:144)|145)))))(2:171|(1:173)))|146)(8:(0)(20:180|(1:182)|183|(1:185)|186|(1:188)(1:219)|189|(1:191)|192|(1:218)(1:196)|197|(4:200|SW:201|274|198)|263|220|(1:222)(1:232)|(1:224)(1:231)|225|(4:228|(3:287|230|290)(1:289)|288|226)|286|233)|148|252|235|(5:238|(3:240|(2:244|261)(1:262)|245)(3:260|246|247)|250|251|236)|259|250|251)|147|148|252|235|(1:236)|259|250|251) */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x075c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x075d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        r1 = r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0740 A[Catch: all -> 0x075c, TryCatch #0 {all -> 0x075c, blocks: (B:235:0x0727, B:236:0x073a, B:238:0x0740, B:240:0x0748, B:242:0x074e, B:244:0x0752, B:246:0x0758, B:247:0x075b), top: B:252:0x0727 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mS() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment.mS():void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        ZR().LLLZLZ.LJIIL(this, "a2270.b2768", null);
        ModuleManager moduleManager = ZR().LLZIL;
        if (moduleManager != null) {
            moduleManager.LJIIIIZZ(ZR().LLLZLZ.LIZ("a2270.b2768"));
        }
        C817603Hi.LJFF = ZR().LLLZLZ.LIZLLL;
    }

    public final C1250250idj VR() {
        String string;
        int i;
        int i2;
        BillStarlingText billStarlingText;
        Context context;
        BillInfoData billInfoData;
        BillInfoSetting billInfoSetting;
        MainOrderSetting mainOrderSetting;
        Integer num;
        BillInfoSetting billInfoSetting2;
        PageHeaderSetting pageHeaderSetting;
        Integer num2;
        BillInfoData billInfoData2;
        PageHeaderCarousel pageHeaderCarousel;
        List<PageHeaderCarouselContent> list;
        String str;
        String str2;
        String string2 = getResources().getString(2131832958);
        String string3 = getResources().getString(2131832959);
        BillInfoData billInfoData3 = ZR().LLJJI;
        BillStarling billStarling = billInfoData3 != null ? billInfoData3.starlingTexts : null;
        boolean zLIZ = EcomPiBindingGrowthConfigSettings.LIZ();
        if (C7806033c.LJIJJLI()) {
            cS().setTuxFont(71);
            if (billStarling != null) {
                BillStarlingText billStarlingText2 = billStarling.checkoutTitle;
                if (billStarlingText2 != null && (str2 = billStarlingText2.text) != null) {
                    string2 = str2;
                }
                BillStarlingText billStarlingText3 = billStarling.encryptedInfoForSubTitle;
                if (billStarlingText3 != null && (str = billStarlingText3.text) != null) {
                    string3 = str;
                }
            }
        } else {
            string2 = getResources().getString(2131848093);
            b bVar = this.LLJJL;
            if (bVar != null) {
                string2 = getResources().getString(bVar.LJ());
            }
            string3 = "";
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string2;
        BillInfoData billInfoData4 = ZR().LLJJI;
        if (billInfoData4 == null || (billInfoSetting2 = billInfoData4.settings) == null || (pageHeaderSetting = billInfoSetting2.pageHeaderSetting) == null || (num2 = pageHeaderSetting.pageHeaderStyle) == null || num2.intValue() != 1 || (billInfoData2 = ZR().LLJJI) == null || (pageHeaderCarousel = billInfoData2.pageHeaderCarousel) == null || (list = pageHeaderCarousel.carouselContent) == null || !(!list.isEmpty())) {
            BillInfoData billInfoData5 = ZR().LLJJI;
            if (billInfoData5 != null && billInfoData5.platformRight != null && (billInfoData = ZR().LLJJI) != null && (billInfoSetting = billInfoData.settings) != null && (mainOrderSetting = billInfoSetting.mainOrderSetting) != null && (num = mainOrderSetting.rightsDisplayStyle) != null && num.intValue() == 1) {
                c1250250idj.LIZLLL = " ";
                return c1250250idj;
            }
            BillInfoData billInfoData6 = ZR().LLJJI;
            if (billInfoData6 != null && billInfoData6.rightGuidanceModule != null) {
                c1250250idj.LIZLLL = "";
                return c1250250idj;
            }
            if (!C897103ez.LIZ()) {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("ecom_osp_guarantee_title", false)) {
                    if (C770702zh.LIZIZ(string3) && (context = getContext()) != null) {
                        SpannableString spannableString = new SpannableString(string3);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ != null ? numLIZJ.intValue() : -7829368), 0, spannableString.length(), 17);
                        c1250250idj.LIZLLL = spannableString;
                        return c1250250idj;
                    }
                }
            }
            TuxNavBar tuxNavBarKS = kS();
            if (billStarling == null || (billStarlingText = billStarling.guaranteeInfo) == null || (string = billStarlingText.text) == null) {
                string = getResources().getString(2131832780);
            }
            if (zLIZ) {
                i = R.attr.fp;
                i2 = R.raw.icon_shield_ticktok_fill;
            } else {
                i = R.attr.o9;
                i2 = R.raw.icon_shield_tick;
            }
            c1250250idj.LIZLLL = C908903gt.LIZIZ(tuxNavBarKS, string, i, i2, null);
            c1250250idj.LIZ(new AwS121S0110000_1(zLIZ, this, 0));
            C1748720vbi.LJFF(kS(), new C10515049h(), AFwS185S0000000_1.get$arr$(49), new AwS580S0100000_1(this, 119));
            return c1250250idj;
        }
        c1250250idj.LIZJ = "";
        return c1250250idj;
    }

    @Override // X.InterfaceC988703tl
    public final boolean onBackPressed() {
        BillInfoData billInfoData;
        RetentionDialogInfo retentionDialogInfo;
        C983603sw c983603sw;
        Context context;
        ZR().LLJZ = "return";
        if (((Boolean) C03VL.LIZ.getValue()).booleanValue()) {
            return false;
        }
        C983603sw c983603sw2 = ZR().H;
        if (c983603sw2 == null || !c983603sw2.LIZLLL(this, ZR()) || (context = getContext()) == null) {
            C983603sw c983603sw3 = ZR().H;
            boolean z = C770702zh.LIZ(c983603sw3 != null ? c983603sw3.LJ : null) && C03VH.LIZ() && ((c983603sw = ZR().H) == null || !c983603sw.LIZIZ) && C03U8.LIZ;
            if (ZR().WQ2()) {
                return false;
            }
            if (!z && (billInfoData = ZR().LLJJI) != null && (retentionDialogInfo = billInfoData.retentionDialogInfo) != null && Intrinsics.LJFF(retentionDialogInfo.enableRetentionDialog, Boolean.TRUE)) {
                return false;
            }
            boolean zQS2 = ZR().qS2();
            if (!ZR().LLLF && !ZR().LLLIIIL && !zQS2 && !ZR().r.LIZJ) {
                return false;
            }
            C03O0.LJJLIIIJILLIZJL(C03O0.LIZ, "quit_checkout", null, null, null, null, true, 30);
            C19EG activity = getActivity();
            boolean z2 = ZR().LLLIIIL;
            if (activity != null) {
                C03VY c03vyLIZ = C853303Vb.LIZ(zQS2 ? 1 : z2 ? 2 : 0);
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                c1397580mTM.LJFF(c03vyLIZ.LIZ);
                c1397580mTM.LIZ(c03vyLIZ.LIZIZ);
                C985403tE.LIZ(c1397580mTM, new AwS367S0200000_1(this, c03vyLIZ, 379));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        } else {
            C983603sw c983603sw4 = ZR().H;
            if (c983603sw4 != null) {
                c983603sw4.LJ(context);
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C03O0 c03o0 = C03O0.LIZ;
        String str = ZR().LLJZ;
        c03o0.getClass();
        C03O0.LJJLIIJ(str);
        Object c098200Yq = null;
        LLLILZJ = null;
        C03O0.LJIIIIZZ();
        C914303hl.LIZ.getClass();
        C914303hl.LIZJ(this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("restore_sku_quantity_event", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_membership_upgrade", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_pay_middle_successed", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_pay_middle_failed", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_resend_pay_request", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_payment_error_dialog", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_no_pay_after_save_address", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("payment_ccdc_bindcard_tips", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_update_address_location", this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_change_supply_info", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_order_submit_page_refresh", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_osp_animation_show", this);
        }
        ZR().tT2();
        ZR().uT2();
        C03Q4.LIZ.getClass();
        ((ArrayList) C03Q4.LIZJ).clear();
        C03Q4.LIZIZ = null;
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this.LLLIIIIL);
        C994103ud.LIZ.getClass();
        if (C1008803x0.LIZ() && C994103ud.LIZIZ.compareAndSet(true, false)) {
            try {
                IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
                if (iProbeService != null) {
                    iProbeService.LJIIJJI(new C1504130pFD("tts_cashier"));
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        C20691715xz c20691715xzHS = hS();
        if (c20691715xzHS != null && (viewTreeObserver = c20691715xzHS.getViewTreeObserver()) != null) {
            C04JT c04jt = this.LLLI;
            viewTreeObserver.removeOnPreDrawListener(c04jt);
            C2187701Ajg.LIZIZ(viewTreeObserver, c04jt, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.LLLI = null;
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        C853603Ve c853603VeGS = gS();
        if (c853603VeGS != null) {
            c853603VeGS.LLILLL.removeCallbacksAndMessages(null);
            c853603VeGS.getClass();
            c853603VeGS.LL = null;
            C803103Bt c803103Bt = c853603VeGS.LLILLJJLI;
            ((ArrayList) c803103Bt.LLILLJJLI).clear();
            ((ArrayList) c803103Bt.LLILLL).clear();
            c803103Bt.LLILZ.clear();
            c803103Bt.LLILZIL = null;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C853603Ve c853603VeGS = gS();
        if (c853603VeGS != null) {
            c853603VeGS.LLILLL.removeCallbacksAndMessages(null);
            c853603VeGS.getClass();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(OrderSubmitFragment.class.getName());
        }
        super.onResume();
        if (ZR().r.LIZJ) {
            ZR().setState(new AwS580S0100000_1(EnumC805703Ct.ORDER_HAVE_CREATED, 395));
        }
        C03O0.LIZ.getClass();
        C03O0.LJZ();
        MiniOspFragment.LLJJJJ.getClass();
        C03T7.LIZIZ("OrderSubmitFragment#onResume", false);
        C853603Ve c853603VeGS = gS();
        if (c853603VeGS != null) {
            c853603VeGS.LLILLL.removeCallbacksAndMessages(null);
            c853603VeGS.getClass();
            if (c853603VeGS.LLILLJJLI.getCount() > 0) {
                ARunnableS101S0100000_1 aRunnableS101S0100000_1 = new ARunnableS101S0100000_1((Object) c853603VeGS, 32);
                c853603VeGS.getClass();
                C786410Ut5.LJLIIL(c853603VeGS.LLILZIL, c853603VeGS.LLILLL, aRunnableS101S0100000_1);
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZ;
        if (((PaymentInfoViewModel) assemVMLazy.getValue()).LLILZ) {
            ((PaymentInfoViewModel) this.LLJJIII.getValue()).LLILZ = false;
            OrderSubmitAssemViewModel.OS2(ZR(), false, false, null, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 8388607);
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModelZR = ZR();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_tts_cashier_payment_seconed_installation_check", true)) {
            orderSubmitAssemViewModelZR.withState(new AwS580S0100000_1(orderSubmitAssemViewModelZR, 415));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Activity activityLIZ;
        super.onStart();
        if (C036A.LIZIZ()) {
            C03O0.LIZ.getClass();
            C03O0.LJII();
            OrderSubmitAssemViewModel orderSubmitAssemViewModelZR = ZR();
            orderSubmitAssemViewModelZR.withState(new AwS580S0100000_1(orderSubmitAssemViewModelZR, 417));
        }
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C2174021A6m c2174021A6m = this.LLLIIII;
        c2174021A6m.LJI = AFwS185S0000000_1.get$arr$(531);
        c2174021A6m.LIZIZ(activityLIZ);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Activity activityLIZ;
        super.onStop();
        if (C036A.LIZIZ()) {
            C03O0.LIZ.getClass();
            C03O0.LJ = SystemClock.elapsedRealtime();
            ZR().LLJZ = "close";
            C03O0.LJJLIIJ(ZR().LLJZ);
        }
        if (!C904203g8.LJIIJ) {
            C736680Sv4.LJIJJ(ZR(), new AwS580S0100000_1(this, 122));
        }
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        this.LLLIIII.LIZJ(activityLIZ);
    }

    public final void qS() {
        if (ZR().LLLLIIL) {
            ZR().LLLLIIL = false;
            b aVar = (b) C834903Nz.LIZ(this, "order_submit", null, null, 14);
            if (aVar == null) {
                aVar = new a();
            }
            this.LLJJL = aVar;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(Intrinsics.LJFF(ZR().o.LIZJ, "us") ? UsOspBottomWidget.class : SeaOspBottomWidget.class);
            if (Intrinsics.LJFF(this.LLLIIL, c19719912DlLIZ)) {
                return;
            }
            C19719912Dl c19719912Dl = this.LLLIIL;
            if (c19719912Dl != null) {
                C723850SaN.LJIIIIZZ(this, c19719912Dl);
            }
            FrameLayout frameLayoutAS = aS();
            if (frameLayoutAS != null) {
                C786410Ut5.LJJJJIZL(frameLayoutAS);
            }
            this.LLLIIL = c19719912DlLIZ;
            C723850SaN.LIZ(this, false, null, new AwS367S0200000_1(this, c19719912DlLIZ, 377), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Pp(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment.Pp(java.util.Map):boolean");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 120));
    }

    public final void nS(C037T c037t) {
        String str = c037t.LIZ;
        if (str == null) {
            return;
        }
        Integer num = c037t.LIZIZ;
        Integer num2 = c037t.LIZJ;
        if (num != null) {
            if (num2 != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(this);
                c1389880mGw.LJIIIZ(str);
                c1389880mGw.LJ(num.intValue());
                c1389880mGw.LJI(num2.intValue());
                c1389880mGw.LJIIJ();
                return;
            }
            C1389880mGw c1389880mGw2 = new C1389880mGw(this);
            c1389880mGw2.LJIIIZ(str);
            c1389880mGw2.LJ(num.intValue());
            c1389880mGw2.LJIIJ();
            return;
        }
        C1389880mGw c1389880mGw3 = new C1389880mGw(this);
        c1389880mGw3.LJIIIZ(str);
        c1389880mGw3.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String strGenCacheKey;
        super.onCreate(bundle);
        ModuleManager moduleManager = ZR().LLZIL;
        if (moduleManager != null) {
            moduleManager.LJIIIZ(this);
        }
        ZR().W = this.LLLFFI;
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZLLL();
        LLLILZJ = this;
        HashMap<String, Object> map = ZR().LLLIL;
        if (map != null) {
            map.put("cart_source_list", TextUtils.join(",", C843303Rf.LJFF));
        }
        HashMap<String, Object> map2 = ZR().LLLIL;
        if (map2 != null) {
            map2.put("source_total_times", Integer.valueOf(((ArrayList) C843303Rf.LJFF).size()));
        }
        ModuleManager moduleManager2 = ZR().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJJIJIL = ((ArrayList) C843303Rf.LJFF).size();
        }
        HashMap<String, Object> map3 = ZR().LLLIL;
        if (map3 != null) {
            map3.put("is_preload", 0);
        }
        HashMap<String, Object> map4 = ZR().LLLIL;
        if (map4 != null) {
            map4.put("is_full_preload", 0);
        }
        for (Map.Entry<String, Integer> entry : C843303Rf.LJ.entrySet()) {
            HashMap<String, Object> map5 = ZR().LLLIL;
            if (map5 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(entry.getKey());
                sbLIZ.append("_times");
                map5.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
            }
        }
        ((ArrayList) C843303Rf.LJFF).clear();
        C843303Rf.LJ.clear();
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> map6 = ZR().LLLIL;
        c03o0.getClass();
        C03O0.LJJI(map6);
        C03O0.LJIJJLI();
        BillInfoRequest billInfoRequest = ZR().p;
        Context contextN3 = null;
        if (billInfoRequest != null) {
            strGenCacheKey = billInfoRequest.genCacheKey(null);
        } else {
            strGenCacheKey = null;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_intercept_enter_checkout_opt", true, false) && ZR().x && ZR().LLJJI == null && C843303Rf.LIZLLL(Integer.valueOf(ZR().LL), strGenCacheKey)) {
            ZR().D = true;
        } else if (ZR().LLJJI == null && C843303Rf.LIZLLL(Integer.valueOf(ZR().LL), strGenCacheKey)) {
            ZR().C = true;
        }
        ZR().TQ2();
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
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_membership_upgrade", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_pay_middle_successed", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_pay_middle_failed", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_resend_pay_request", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_payment_error_dialog", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_no_pay_after_save_address", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("payment_ccdc_bindcard_tips", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_update_address_location", this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_change_supply_info", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_order_submit_page_refresh", this);
        }
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZLLL("ec_osp_animation_show", this);
        }
        ZR().pT2();
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this.LLLIIIIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052 A[PHI: r9 r10 r11
      0x0052: PHI (r9v5 boolean) = (r9v3 boolean), (r9v1 boolean) binds: [B:28:0x0050, B:48:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r10v5 boolean) = (r10v3 boolean), (r10v1 boolean) binds: [B:28:0x0050, B:48:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r11v4 boolean) = (r11v1 boolean), (r11v5 boolean) binds: [B:28:0x0050, B:48:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rS(androidx.recyclerview.widget.RecyclerView r14) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = r14.getLayoutManager()
            boolean r0 = r8 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r12 = 0
            if (r0 == 0) goto Lbc
            androidx.recyclerview.widget.LinearLayoutManager r8 = (androidx.recyclerview.widget.LinearLayoutManager) r8
            if (r8 == 0) goto Lbc
            int r7 = r8.findFirstVisibleItemPosition()
            int r6 = r8.findLastVisibleItemPosition()
            r0 = -1
            if (r7 == r0) goto L61
            if (r6 == r0) goto L61
            if (r7 > r6) goto L61
            if (r7 > r6) goto L61
            r11 = 0
            r10 = 0
            r9 = 0
        L21:
            android.view.View r1 = r8.findViewByPosition(r7)
            if (r1 == 0) goto Lb6
            java.lang.Object r3 = r1.getTag()
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Lb3
            java.lang.String r3 = (java.lang.String) r3
        L31:
            r5 = 1
            if (r3 == 0) goto L50
            int r2 = r3.hashCode()
            r0 = -1985463743(0xffffffff89a83a41, float:-4.049931E-33)
            if (r2 == r0) goto La9
            r0 = -1590363138(0xffffffffa134fbfe, float:-6.131988E-19)
            if (r2 == r0) goto L9f
            r0 = -1097578074(0xffffffffbe9449a6, float:-0.2896244)
            if (r2 != r0) goto L50
            java.lang.String r0 = "us_order_summary_item_view"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L50
            r10 = 1
        L50:
            if (r11 == 0) goto L62
        L52:
            if (r10 == 0) goto L62
            r13.LLJZ = r5
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r13.ZR()
            X.0P0T r0 = r0.a0
            if (r0 == 0) goto L61
            r0.show()
        L61:
            return
        L62:
            if (r9 == 0) goto Lb6
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r13.ZR()
            boolean r0 = r0.LLLZIL
            if (r0 != 0) goto Lb6
            r0 = 2131389262(0x7f0a6b4e, float:1.8399062E38)
            android.view.View r4 = r1.findViewById(r0)
            android.widget.FrameLayout r3 = r13.aS()
            if (r4 == 0) goto Lb6
            if (r3 == 0) goto Lb6
            r2 = 2
            int[] r0 = new int[r2]
            r4.getLocationOnScreen(r0)
            r1 = r0[r5]
            int r0 = r4.getHeight()
            int r1 = r1 + r0
            int[] r0 = new int[r2]
            r3.getLocationOnScreen(r0)
            r0 = r0[r5]
            if (r1 >= r0) goto Lb6
            r13.LLJZ = r5
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r13.ZR()
            X.0P0T r0 = r0.a0
            if (r0 == 0) goto L61
            r0.show()
            return
        L9f:
            java.lang.String r0 = "us_platform_discount_item_view"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L50
            r11 = 1
            goto L52
        La9:
            java.lang.String r0 = "s_points_item_view"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L50
            r9 = 1
            goto L50
        Lb3:
            r3 = r12
            goto L31
        Lb6:
            if (r7 == r6) goto L61
            int r7 = r7 + 1
            goto L21
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment.rS(androidx.recyclerview.widget.RecyclerView):void");
    }

    public final void sS(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        C7768031q c7768031q;
        if (ZR().getState().LLZZ) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1 && iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                List<InterfaceC1891350zJl> list = ZR().getState().LLILLJJLI;
                if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                    return;
                }
                while (true) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition != null && viewFindViewByPosition.isShown()) {
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, list);
                        if ((objLJJJLZIJ instanceof C7768031q) && (c7768031q = (C7768031q) objLJJJLZIJ) != null) {
                            Object tag = viewFindViewByPosition.getTag();
                            if (!(tag instanceof String)) {
                                tag = null;
                            }
                            if (Intrinsics.LJFF(tag, "payment_info_cell_view")) {
                                Boolean bool = c7768031q.LLJJIII;
                                Boolean bool2 = Boolean.TRUE;
                                if (!Intrinsics.LJFF(bool, bool2) && !Intrinsics.LJFF(c7768031q.LLJJI, bool2)) {
                                    ZR().setState(AFwS228S0000000_1.get$arr$(145));
                                    return;
                                }
                            }
                        }
                    }
                    if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                        iFindFirstVisibleItemPosition++;
                    } else {
                        return;
                    }
                }
            }
        }
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
        PayMiddleFailedEvent payMiddleFailedEvent;
        String strLIZ;
        C19EG activity;
        String str3;
        String str4;
        Type type2;
        Context context;
        String str5;
        Type type3;
        C03VO c03vo;
        Object obj;
        String str6;
        String str7;
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
        String str8 = null;
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
                    PaymentInfo paymentInfo = ZR().LLJJJ;
                    if (paymentInfo == null || !Intrinsics.LJFF(paymentInfo.isValid, Boolean.TRUE)) {
                        OrderSubmitAssemViewModel.oT2(ZR(), "payment_methods", false);
                        ZR().LLJJLIIIJLLLLLLLZ = true;
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
                            type6 = new TypeToken<EcChangeSupplyInfoEventParams>() { // from class: X.03Th
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type6);
                        if (!(objFromJson instanceof EcChangeSupplyInfoEventParams)) {
                            objFromJson = null;
                        }
                        EcChangeSupplyInfoEventParams ecChangeSupplyInfoEventParams = (EcChangeSupplyInfoEventParams) objFromJson;
                        if (ecChangeSupplyInfoEventParams != null && (identityInfo = ZR().LLZLI) != null && identityInfo.getRecipientIdentityInfo() != null) {
                            IdentityInfo identityInfo4 = ZR().LLZLI;
                            if (identityInfo4 != null) {
                                identityInfoCollectionStyle = identityInfo4.getIdentityInfoCollectionStyle();
                            } else {
                                identityInfoCollectionStyle = null;
                            }
                            if (identityInfoCollectionStyle == IdentityInfoCollectionStyle.STYLE1) {
                                IdentityInfo identityInfo5 = ZR().LLZLI;
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
                                    OrderSubmitAssemViewModel orderSubmitAssemViewModelZR = ZR();
                                    BillInfoData billInfoData = ZR().LLJJI;
                                    if (billInfoData != null && (identityInfo2 = billInfoData.identityInfo) != null) {
                                        BillInfoData billInfoData2 = ZR().LLJJI;
                                        if (billInfoData2 != null && (identityInfo3 = billInfoData2.identityInfo) != null && (recipientIdentityInfo = identityInfo3.getRecipientIdentityInfo()) != null) {
                                            EcChangeSupplyInfoModel ecChangeSupplyInfoModel2 = ecChangeSupplyInfoEventParams.supplyInfo;
                                            if (ecChangeSupplyInfoModel2 != null) {
                                                str8 = ecChangeSupplyInfoModel2.encryptedInfoId;
                                            }
                                            recipientIdentityInfoCopy = recipientIdentityInfo.copy(str8, recipientIdentityInfo.identityInfoCollectionPageSchema, recipientIdentityInfo.identityInfoVerificationMode, recipientIdentityInfo.unfilledNoteIcon, recipientIdentityInfo.unfilledNote, recipientIdentityInfo.filledNoteIcon, recipientIdentityInfo.filledNote, recipientIdentityInfo.sceneCode, recipientIdentityInfo.daInfo);
                                        }
                                        identityInfoCopy = identityInfo2.copy(identityInfo2.hintText, identityInfo2.identityRequired, identityInfo2.identityInfoOption, identityInfo2.identityInfoPanel, identityInfo2.identityInfoCollectionStyle, recipientIdentityInfoCopy, identityInfo2.enableAddressIdentity, identityInfo2.title);
                                    }
                                    orderSubmitAssemViewModelZR.IQ2(identityInfoCopy);
                                    OrderSubmitAssemViewModel.OS2(ZR(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.IDENTITY_INFO.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
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
                            type5 = new TypeToken<C854203Vk>() { // from class: X.03Tg
                            }.getType();
                        }
                        Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type5);
                        if (!(objFromJson2 instanceof C854203Vk)) {
                            objFromJson2 = null;
                        }
                        C854203Vk c854203Vk = (C854203Vk) objFromJson2;
                        if (c854203Vk != null && Intrinsics.LJFF(c854203Vk.LIZ, "order_submit")) {
                            OrderSubmitAssemViewModel.OS2(ZR(), false, false, null, false, true, false, null, null, false, null, null, new ChangeInfo(C03DI.UPDATE_MAP_LOCATION.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380381);
                            break;
                        }
                    } catch (s e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return;
                    }
                }
                break;
            case -1479762956:
                if (str.equals("ec_membership_upgrade")) {
                    OrderSubmitAssemViewModel.OS2(ZR(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.MEMBERSHIP_CHANGE.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
                }
                break;
            case -1413704395:
                if (str.equals("ec_resend_pay_request")) {
                    C736680Sv4.LJIJJ(ZR(), new AwS580S0100000_1(this, 121));
                }
                break;
            case -1136609639:
                if (str.equals("restore_sku_quantity_event") && (c802003Bi = ZR().LLLLZIL) != null && (num2 = c802003Bi.LIZIZ) != null) {
                    int iIntValue = num2.intValue();
                    C939603lq c939603lq = this.LLJJJJLIIL;
                    if (c939603lq != null) {
                        c939603lq.setQuantity(iIntValue);
                    }
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
                            type4 = new TypeToken<C03VO>() { // from class: X.03Tc
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
                    if (c03vo2 == null) {
                        str6 = null;
                        str7 = null;
                    } else {
                        str6 = c03vo2.LIZ;
                        str7 = c03vo2.LIZJ;
                    }
                    oS(str6, null, str7);
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
                    OrderSubmitAssemViewModel orderSubmitAssemViewModelZR2 = ZR();
                    if (num4 != null) {
                        num4.intValue();
                        if (num4.intValue() == C03MG.BONUS.getValue()) {
                            orderSubmitAssemViewModelZR2.Z = true;
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
                            type3 = new TypeToken<C03VO>() { // from class: X.03Td
                            }.getType();
                        }
                        Object objFromJson4 = GsonProtectorUtils.fromJson(gsonLJFF4, str2, type3);
                        if (!(objFromJson4 instanceof C03VO)) {
                            objFromJson4 = null;
                        }
                        c03vo = (C03VO) objFromJson4;
                    } catch (s e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    if (c03vo == null) {
                        str5 = null;
                    } else {
                        str5 = c03vo.LIZIZ;
                    }
                    C897503f3.LJIIJ(context, str5, null);
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
                            type2 = new TypeToken<PayMiddleFailedEvent>() { // from class: X.03TZ
                            }.getType();
                        }
                        Object objFromJson5 = GsonProtectorUtils.fromJson(gsonLJFF5, str2, type2);
                        if (!(objFromJson5 instanceof PayMiddleFailedEvent)) {
                            objFromJson5 = null;
                        }
                        payMiddleFailedEvent = (PayMiddleFailedEvent) objFromJson5;
                    } catch (s e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        payMiddleFailedEvent = null;
                    }
                    if (ZR().GT2()) {
                        ZR().HS2(false);
                        break;
                    } else {
                        C907803gi.LIZ.getClass();
                        if (C907803gi.LJIJ()) {
                            if (payMiddleFailedEvent != null) {
                                str3 = payMiddleFailedEvent.errorCode;
                                str4 = payMiddleFailedEvent.errorMessage;
                            } else {
                                str3 = null;
                                str4 = null;
                            }
                            oS(str3, str4, null);
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
                            C985403tE.LIZ(c1397580mTM, new AwS115S1100000_1(string2, this, 53));
                            c1397580mTM.LJII = false;
                            new C1397510mTF(c1397580mTM).LIZLLL();
                            break;
                        }
                    }
                }
                break;
            case 1025755504:
                if (str.equals("ec_pay_middle_successed")) {
                    C03O0 c03o0 = C03O0.LIZ;
                    PaymentInfo paymentInfo2 = ZR().LLJJJ;
                    if (paymentInfo2 != null) {
                        paymentMethod = paymentInfo2.paymentMethod;
                    }
                    c03o0.getClass();
                    C03O0.LJLI(paymentMethod, false, false, "FE_QUERY");
                    C19EG activity2 = getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
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
                            type = new TypeToken<OrderSubmitRefreshEventParams>() { // from class: X.03Ti
                            }.getType();
                        }
                        Object objFromJson6 = GsonProtectorUtils.fromJson(gsonLJFF6, str2, type);
                        if (!(objFromJson6 instanceof OrderSubmitRefreshEventParams)) {
                            objFromJson6 = null;
                        }
                        orderSubmitRefreshEventParams = (OrderSubmitRefreshEventParams) objFromJson6;
                    } catch (s e6) {
                        TryCatchGuardChecker.doCheck(e6);
                    }
                    OrderSubmitAssemViewModel orderSubmitAssemViewModelZR3 = ZR();
                    if (orderSubmitRefreshEventParams != null && (num = orderSubmitRefreshEventParams.changeType) != null) {
                        value = num.intValue();
                    } else {
                        value = C03DI.DEFAULT.getValue();
                    }
                    OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModelZR3, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(value, null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
                }
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        int i;
        Window window;
        super.onViewCreated(view, bundle);
        b aVar = (b) C834903Nz.LIZ(this, "order_submit", null, null, 14);
        if (aVar == null) {
            aVar = new a();
        }
        this.LLJJL = aVar;
        C03T6 c03t6 = this.LLLFFI;
        if (c03t6 != null) {
            View viewFindViewById = this.LLIZLLLIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.eqx);
                } else {
                    viewFindViewById = null;
                }
                this.LLIZLLLIL = (ConstraintLayout) viewFindViewById;
            }
            c03t6.LIZ.LLLFF = (ViewGroup) viewFindViewById;
        }
        TuxNavBar tuxNavBarKS = kS();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LJIIIIZZ = getString(2131823350);
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1777));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ = VR();
        c0om1.LIZLLL = true;
        tuxNavBarKS.setNavActions(c0om1);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(requireContext());
        View viewFindViewById2 = this.LLIZLLLIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.eqx);
            } else {
                viewFindViewById2 = null;
            }
            this.LLIZLLLIL = (ConstraintLayout) viewFindViewById2;
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.b48, (ViewGroup) viewFindViewById2, false);
        this.LLLIILIL = viewTd;
        if (viewTd != null) {
            iS().LIZIZ(viewTd);
        }
        if (C953203o2.LIZJ()) {
            iS().setClickable(true);
            C786410Ut5.I7(new AjS10S0000000_1(19), iS());
        }
        hS().setItemAnimator(null);
        if (C963303pf.LIZ()) {
            C832503Nb c832503Nb = C832503Nb.LIZ;
            C20691715xz c20691715xzHS = hS();
            c832503Nb.getClass();
            c20691715xzHS.LJIILJJIL(USOspAddressCell.class, USOspPudoAddressCell.class, USUnreachableExpandCell.class, USUnreachableHeadCell.class, USUnreachableSkuCell.class, PaymentExtraFeeCell.class, USPaymentInfoCell.class, USOrderSummaryCell.class, USUserTrustCell.class, USAddonOrderCell.class, SpanCell.class, EditDeliveryInstructionCell.class, USEmailAuthorizeCell.class, USAggregationOrderCell.class, USAggregationOrderSingleSkuCell.class, USPlatformDiscountsCell.class, SeaBonusCell.class, BonusInfoCell.class, OspAddressCell.class, UnreachableExpendCell.class, UnreachableHeadCell.class, UnreachableSkuCell.class, ShopInfoCell.class, PaymentInfoCell2.class, CpfCell.class, PlatformDiscountsCell.class, SummaryCell.class, UserTrustCell.class, MXAggregationOrderCell.class, UserRightsCell.class, UserRightModuleCellV2.class, USUserBenefitPanelCell.class, RightGuidanceModuleCell.class, USRefundableSampleCell.class, AgeConfirmCell.class);
        } else {
            hS().LJIILJJIL(USOspAddressCell.class, USOspPudoAddressCell.class, USUnreachableExpandCell.class, USUnreachableHeadCell.class, USUnreachableSkuCell.class, PaymentExtraFeeCell.class, USPaymentInfoCell.class, USOrderSummaryCell.class, USUserTrustCell.class, USAddonOrderCell.class, SpanCell.class, EditDeliveryInstructionCell.class, USEmailAuthorizeCell.class, USAggregationOrderCell.class, USAggregationOrderSingleSkuCell.class, USPlatformDiscountsCell.class, SeaBonusCell.class, BonusInfoCell.class, OspAddressCell.class, UnreachableExpendCell.class, UnreachableHeadCell.class, UnreachableSkuCell.class, ShopInfoCell.class, PaymentInfoCell2.class, CpfCell.class, PlatformDiscountsCell.class, SummaryCell.class, UserTrustCell.class, MXAggregationOrderCell.class, UserRightsCell.class, UserRightModuleCellV2.class, USUserBenefitPanelCell.class, RightGuidanceModuleCell.class, USRefundableSampleCell.class, AgeConfirmCell.class);
        }
        hS().addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.na, requireContext()), C0H9I.LIZ(8.0d), 0.0f));
        hS().addOnScrollListener(this.LLLII);
        hS().setNestedScrollingEnabled(false);
        hS().setItemViewCacheSize(((Number) C03VM.LIZ.getValue()).intValue());
        C786410Ut5.x3(hS().getViewTreeObserver(), new C04JW(this, 3));
        C786410Ut5.x3(hS().getViewTreeObserver(), new C04JW(this, 4));
        if (ZR().LLLZI) {
            hS().setItemAnimator(null);
        }
        Context context = getContext();
        if (context != null) {
            C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Tr
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C03JV) obj).LLLJL;
                }
            }, null, new AwS615S0100000_1(this, 311), 6);
            C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Jl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C03JV) obj).LLLLLILLIL);
                }
            }, null, new AwS615S0100000_1(this, 321), 6);
            C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03TC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C03JV) obj).LLILZIL;
                }
            }, null, new AwS437S0200000_1(this, context, 38), 6);
            C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Tq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C03JV) obj).LLJL;
                }
            }, null, new AwS615S0100000_1(this, 279), 6);
            C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03TM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C03JV) obj).LLZZ);
                }
            }, null, new AwS615S0100000_1(this, 287), 6);
            C19EG activity = getActivity();
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            View view4 = getView();
            if (window != null && view4 != null) {
                new KeyBoardVisibilityUtil(getLifecycle(), window, view4, null, new AwS437S0200000_1(view4, this, 40));
            }
            if (ZR().LLLZI) {
                C03DZ.LIZJ(aS());
            }
        }
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Jw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJLL;
            }
        }, C736820SvI.LIZLLL(), new AwS615S0100000_1(this, 257), 4);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03TX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLILLJJLI;
            }
        }, null, new AwS615S0100000_1(this, 316), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03TI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C03JV) obj).LL);
            }
        }, null, new AwS615S0100000_1(this, 270), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Jb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLZZLLIL;
            }
        }, null, new AwS615S0100000_1(this, 254), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03T8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJLIIIJLLLLLLLZ);
            }
        }, null, new AwS615S0100000_1(this, 265), 6);
        C736680Sv4.LJIIIZ(this, ZR(), new C2217381BqS() { // from class: X.03Ji
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLLLLLL);
            }
        }, new C2217381BqS() { // from class: X.03T9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJLIIIJLLLLLLLZ);
            }
        }, null, new AwS650S0100000_1(this, 33), 12);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Tm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLILZJ;
            }
        }, null, new AwS615S0100000_1(this, 285), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Jd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLILZLLLI;
            }
        }, null, new AwS615S0100000_1(this, 294), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03TD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLILLL;
            }
        }, null, new AwS615S0100000_1(this, 305), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03V3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJIJIIJIL;
            }
        }, null, new AwS615S0100000_1(this, 319), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03VA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJIJIL;
            }
        }, null, new AwS615S0100000_1(this, 331), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03JJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJJ);
            }
        }, null, new AwS615S0100000_1(this, 338), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03TO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJJJ);
            }
        }, null, new AwS615S0100000_1(this, 243), 6);
        C736680Sv4.LJIIIZ(this, ZR(), new C2217381BqS() { // from class: X.03TG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJJJJJIL);
            }
        }, new C2217381BqS() { // from class: X.03Uk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJL;
            }
        }, null, new AwS650S0100000_1(this, 30), 12);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Tp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJJJLIIL;
            }
        }, null, new AwS615S0100000_1(this, 266), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Tk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJI;
            }
        }, null, new AwS615S0100000_1(this, 278), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03To
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLJJIII;
            }
        }, null, new AwS615S0100000_1(this, 295), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03TL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C03JV) obj).LLJJ);
            }
        }, null, new AwS615S0100000_1(this, 260), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Ur
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLFF;
            }
        }, null, new AwS615S0100000_1(this, 274), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Uv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLIILIL;
            }
        }, null, new AwS615S0100000_1(this, 281), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Uz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLIL;
            }
        }, null, new AwS615S0100000_1(this, 290), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03V6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLILZ;
            }
        }, null, new AwS615S0100000_1(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03TE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS615S0100000_1(this, 306), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03VE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLLIL;
            }
        }, null, new AwS615S0100000_1(this, 327), 6);
        ZR();
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Jz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLLZZ;
            }
        }, null, new AwS615S0100000_1(this, 341), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Je
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLZ;
            }
        }, null, new AwS615S0100000_1(this, 244), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Ja
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLZZJLIL;
            }
        }, null, new AwS615S0100000_1(this, 253), 6);
        OrderSubmitAssemViewModel orderSubmitAssemViewModelZR = ZR();
        selectSubscribe(orderSubmitAssemViewModelZR, new C2217381BqS() { // from class: X.03Jq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLZI;
            }
        }, new C2217381BqS() { // from class: X.03Jc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLZIL;
            }
        }, new C2217381BqS() { // from class: X.03Jt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLZLL;
            }
        }, new C2217381BqS() { // from class: X.03Ju
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLZLLIL;
            }
        }, C736820SvI.LIZIZ(orderSubmitAssemViewModelZR.usedInReusedScene), null, new C1077804Jk(this, 7));
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Jx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLZ;
            }
        }, null, new AwS615S0100000_1(this, 317), 6);
        if (C836003Ok.LIZ() || C835903Oj.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03VD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C03JV) obj).LLZL;
                }
            }, null, new AwS615S0100000_1(this, 328), 6);
        }
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Ts
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLZLI;
            }
        }, null, new AwS615S0100000_1(this, 335), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Jm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLLZI);
            }
        }, null, new AwS615S0100000_1(this, 342), 6);
        C736680Sv4.LJIIIIZZ(this, ZR(), new C2217381BqS() { // from class: X.03Jn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLZLL);
            }
        }, null, new AwS615S0100000_1(this, 245), 6);
        mS();
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> map = ZR().LLLIL;
        ModuleManager moduleManager = ZR().LLZIL;
        if (moduleManager != null) {
            i = moduleManager.LJIILLIIL;
        } else {
            i = 0;
        }
        c03o0.getClass();
        ConcurrentHashMap<String, Object> concurrentHashMap = C03O0.LIZIZ;
        if (map != null) {
            Object obj = map.get("is_preload");
            if (obj == null) {
                obj = 0;
            }
            concurrentHashMap.put("is_preload", obj);
            Object obj2 = map.get("is_full_preload");
            if (obj2 == null) {
                obj2 = 0;
            }
            concurrentHashMap.put("is_full_preload", obj2);
            concurrentHashMap.put("order_preload_type", Integer.valueOf(i));
            Object obj3 = map.get("cart_enter_source");
            if (obj3 != null) {
                concurrentHashMap.put("cart_enter_source", obj3);
            }
            Object obj4 = map.get("pdp_enter_source");
            if (obj4 != null) {
                concurrentHashMap.put("pdp_enter_source", obj4);
            }
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModelZR2 = ZR();
        OspAddressViewModel ospAddressViewModelWR = WR();
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZ;
        orderSubmitAssemViewModelZR2.kS2(this, ospAddressViewModelWR, (PaymentInfoViewModel) assemVMLazy.getValue(), (OspBottomViewModel) this.LLJJIJI.getValue(), (OspShopViewModel) this.LLJJIJIIJIL.getValue());
        ModuleManager moduleManager2 = ZR().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LIZJ(view);
        }
        C723850SaN.LIZ(this, false, null, new AwS580S0100000_1(this, 1090), 3);
    }

    public final void oS(String str, String str2, String str3) {
        try {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showPaymentErrorDialogAndClear, errorCode: ");
            sbLIZ.append(str);
            sbLIZ.append("; action: ");
            sbLIZ.append(str3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZJ;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            C03XA.LIZ.getClass();
            viewLIZJ = C03XA.LIZJ(activity, R.layout.b3x, viewGroup, false);
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
