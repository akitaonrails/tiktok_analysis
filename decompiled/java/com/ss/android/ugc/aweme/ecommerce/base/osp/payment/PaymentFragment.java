package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AbstractC1252750ihl;
import X.AnonymousClass0340;
import X.C004I;
import X.C01GW;
import X.C034P;
import X.C034S;
import X.C035M;
import X.C038N;
import X.C03DI;
import X.C03DZ;
import X.C03ML;
import X.C03OE;
import X.C03OT;
import X.C03Q4;
import X.C03T7;
import X.C03VO;
import X.C03WD;
import X.C03WH;
import X.C03WK;
import X.C03XU;
import X.C098200Yq;
import X.C0HI3;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C123100dR;
import X.C1250250idj;
import X.C1257480ipO;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C1765020w20;
import X.C178200mK;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C1AQS;
import X.C2174021A6m;
import X.C2187451AjH;
import X.C2248351CzJ;
import X.C2371409Qy;
import X.C443120HZe;
import X.C444920HcY;
import X.C452501pT;
import X.C616540OGe;
import X.C722002rq;
import X.C756102xL;
import X.C786410Ut5;
import X.C806103Cx;
import X.C842503Qx;
import X.C851503Uj;
import X.C864903Zn;
import X.C866903a7;
import X.C869503aX;
import X.C869603aY;
import X.C870903al;
import X.C871203ao;
import X.C897103ez;
import X.C897503f3;
import X.C904203g8;
import X.C908903gt;
import X.C943803mW;
import X.DialogC1389620mGW;
import X.EnumC837803Pc;
import X.EnumC863903Zd;
import X.EnumC882203ca;
import X.InterfaceC1058150ddt;
import X.InterfaceC1075600e62;
import X.InterfaceC1164530gPT;
import X.InterfaceC1171660gay;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.InterfaceC988203tg;
import X.InterfaceC988703tl;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomMergeBalanceAndInstallmentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPiBindingGrowthConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.container.PaymentCheckoutFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfoToolTips;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.AwS10S1210000_1;
import kotlin.jvm.internal.AwS145S0400000_16;
import kotlin.jvm.internal.AwS14S1110000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import p8b.c;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentFragment extends ECBaseFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory>, InterfaceC988703tl, InterfaceC988203tg, c, InterfaceC1164530gPT, InterfaceC1058150ddt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSExKTYpZyAgOGs8KDY+LSs4Zx8yMSgpJzsVOiQrJCo9PA==";
    public ConstraintLayout LLILLL;
    public TuxNavBar LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public C0HI3 LLIZ;
    public RecyclerView LLIZLLLIL;
    public C943803mW LLJ;
    public C197039127h LLJI;
    public View LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public LinearLayout LLJJI;
    public TuxTextView LLJJIII;
    public DirectCheckoutBottomWidget LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxSheet LLJJJJJIL;
    public PaymentMethod LLJLLIL;
    public PaymentMethod LLJLLL;
    public PaymentMethod LLJZ;
    public String LLJZIJLIL;
    public Function2<? super ChangeInfo, ? super InterfaceC1364105Vn<? super C842503Qx>, ? extends Object> LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public String LLLFFI;
    public boolean LLLFZ;
    public final lifecycleAwareLazy LLLII;
    public final C01GW LLLIIII;
    public boolean LLLIIIIL;
    public final C01GW LLLIIIL;
    public final String[] LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C2174021A6m LLLILZJ;
    public final PaymentFragment$processLifeCycleObserver$1 LLLILZLLLI;
    public PaymentCheckoutFragment LLLIZZ;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 929));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 928));
    public EnterParams LLJJJJLIIL = new EnterParams(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
    public InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit> LLJJL = AFwS326S0000000_1.get$arr$(2);
    public Function0<Unit> LLJJLIIIJLLLLLLLZ = AFwS185S0000000_1.get$arr$(50);
    public Function1<? super PaymentMethod, Unit> LLJL = AFwS228S0000000_1.get$arr$(157);
    public Function1<? super EnumC863903Zd, Unit> LLJLIL = AFwS228S0000000_1.get$arr$(158);
    public final AFwS228S0000000_1 LLJLILLLLZIIL = AFwS228S0000000_1.get$arr$(156);
    public Function0<Unit> LLJLL = AFwS185S0000000_1.get$arr$(51);
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 921));

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "payment_method";
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "PaymentFragment";
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public PaymentFragment() {
        AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(this, 38);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 927);
        this.LLLII = new lifecycleAwareLazy(this, awS545S0100000_1, new AwS145S0400000_16(this, awS545S0100000_1, c19719912DlLIZ, awS615S0100000_1, 4));
        this.LLLIIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 922));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 926));
        String[] strArr = new String[4];
        int i = 0;
        do {
            strArr[i] = null;
            i++;
        } while (i < 4);
        this.LLLIIL = strArr;
        this.LLLIILIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 925));
        this.LLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 924));
        this.LLLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 923));
        this.LLLILZJ = new C2174021A6m();
        this.LLLILZLLLI = new PaymentFragment$processLifeCycleObserver$1(this);
    }

    public final boolean BS() {
        PaymentElement paymentElement;
        String str;
        PaymentMethod paymentMethod = this.LLJLLIL;
        if (paymentMethod == null || (paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, yS().pR2(paymentMethod, "save_element"))) == null || (str = paymentElement.paramValue) == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    public final ConstraintLayout ZR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cb4) : null;
            this.LLILLL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C197039127h aS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cal) : null;
            this.LLJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final LinearLayout bS() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bottom_promotion_container) : null;
            this.LLJJIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final int cS() {
        OspPlaceOrderButton ospPlaceOrderButton;
        Map<String, PlaceOrderButtonInfo> map;
        if (C03WK.LIZ(this.LLJJJJLIIL)) {
            BillInfoData billInfoData = this.LLJJJJLIIL.LJIILLIIL;
            boolean z = (billInfoData == null || (ospPlaceOrderButton = billInfoData.ospPlaceOrderButton) == null || (map = ospPlaceOrderButton.placeOrderButtonByScene) == null || map.get(C03ML.COMBINED_PAYMENT.getValue()) == null) ? false : true;
            if (Intrinsics.LJFF(this.LLJJJJLIIL.paySource, "ordersubmit")) {
                return z ? 2131840161 : 2131840160;
            }
            return 2131832918;
        }
        Integer num = this.LLJJJJLIIL.buttonType;
        int iOrdinal = EnumC882203ca.NEXT.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            return 2131833062;
        }
        int iOrdinal2 = EnumC882203ca.CONTINUE.ordinal();
        if (num == null || num.intValue() != iOrdinal2) {
            return (num == null || num.intValue() != EnumC882203ca.SAVE.ordinal()) ? 2131833063 : 2131832562;
        }
        return 2131833061;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return TrackNodeStore.LIZLLL(this.LLJZIJLIL, this);
    }

    public final DirectCheckoutBottomWidget dS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fui) : null;
            this.LLJJIJI = (DirectCheckoutBottomWidget) viewFindViewById;
        }
        return (DirectCheckoutBottomWidget) viewFindViewById;
    }

    public final RecyclerView gS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gy_) : null;
            this.LLIZLLLIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C03WH iS() {
        return (C03WH) this.LLLIIIL.getValue();
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return (ViewModelProvider.Factory) this.LLLI.getValue();
    }

    public final TuxTextView kS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q5r) : null;
            this.LLJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6 A[PHI: r5
      0x00b6: PHI (r5v1 java.lang.String) = 
      (r5v0 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
      (r5v3 java.lang.String)
     binds: [B:61:0x00b3, B:34:0x005a, B:36:0x005e, B:38:0x0062, B:40:0x0066, B:42:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder mS() {
        /*
            r19 = this;
            r1 = r19
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r1.LLJJJJLIIL
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r3 = r0.LJIILLIIL
            r6 = 0
            if (r3 == 0) goto Lba
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton r0 = r3.ospPlaceOrderButton
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentPlaceOrderButton r0 = r0.paymentPlaceOrderButton
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonInfo r0 = r0.placeOrderButton
            if (r0 == 0) goto Lba
            java.lang.String r4 = r0.buttonText
        L17:
            java.lang.String r2 = "order_submit_recommend_payment_button"
            if (r3 == 0) goto Lb8
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton r0 = r3.ospPlaceOrderButton
            if (r0 == 0) goto Lb8
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentPlaceOrderButton r0 = r0.paymentPlaceOrderButton
            if (r0 == 0) goto Lb8
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonInfo r0 = r0.placeOrderButton
            if (r0 == 0) goto Lb8
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r8 = r0.buttonTextRichText
            if (r8 == 0) goto Lb8
            X.03B0 r7 = new X.03B0
            X.127h r0 = r1.aS()
            r7.<init>(r0, r2)
            r11 = 0
            r14 = 126(0x7e, float:1.77E-43)
            r9 = r6
            r10 = r6
            r12 = r6
            r13 = r6
            X.C03B0.LIZ(r7, r8, r9, r10, r11, r12, r13, r14)
            android.text.SpannableStringBuilder r10 = r7.LIZJ
        L40:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r1.LLJJJJLIIL
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r3 = r0.LJIILLIIL
            if (r3 == 0) goto Lb2
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton r0 = r3.ospPlaceOrderButton
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentPlaceOrderButton r0 = r0.paymentPlaceOrderButton
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonInfo r0 = r0.placeOrderButton
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubtextArea r0 = r0.subtextArea
            if (r0 == 0) goto Lb2
            java.lang.String r5 = r0.content
        L58:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton r0 = r3.ospPlaceOrderButton
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentPlaceOrderButton r0 = r0.paymentPlaceOrderButton
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonInfo r0 = r0.placeOrderButton
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubtextArea r0 = r0.subtextArea
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r12 = r0.contentRichText
            if (r12 == 0) goto Lb6
            X.03B0 r11 = new X.03B0
            X.127h r0 = r1.aS()
            r11.<init>(r0, r2)
            r15 = 0
            r18 = 126(0x7e, float:1.77E-43)
            r13 = r6
            r14 = r6
            r16 = r6
            r17 = r6
            X.C03B0.LIZ(r11, r12, r13, r14, r15, r16, r17, r18)
            android.text.SpannableStringBuilder r12 = r11.LIZJ
        L83:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = r1.LLJJJJLIIL
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r0.LJIILLIIL
            if (r0 == 0) goto Laf
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton r2 = r0.ospPlaceOrderButton
            if (r2 == 0) goto Lb0
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubtextArea r0 = r2.subtextArea
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r8 = r0.icon
        L93:
            X.03Fj r0 = X.C812503Fj.LIZ
            android.content.Context r3 = r1.requireContext()
            if (r2 == 0) goto Lad
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonStyle r7 = r2.buttonStyle
        L9d:
            r11 = 0
            r0.getClass()
            r9 = r6
            android.text.SpannableStringBuilder r1 = X.C812503Fj.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r0 = r1.length()
            if (r0 != 0) goto Lbd
            return r6
        Lad:
            r7 = r6
            goto L9d
        Laf:
            r2 = r6
        Lb0:
            r8 = r6
            goto L93
        Lb2:
            r5 = r6
            if (r3 == 0) goto Lb6
            goto L58
        Lb6:
            r12 = r6
            goto L83
        Lb8:
            r10 = r6
            goto L40
        Lba:
            r4 = r6
            goto L17
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment.mS():android.text.SpannableStringBuilder");
    }

    public final C0HI3 nS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
            this.LLIZ = (C0HI3) viewFindViewById;
        }
        return (C0HI3) viewFindViewById;
    }

    public final TuxTextView oS() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.utr) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // X.InterfaceC988703tl
    public final boolean onBackPressed() {
        if (this.LLLIIIIL) {
            return false;
        }
        PaymentViewModel.RR2(yS(), null, null, 5);
        return true;
    }

    public final TuxIconView qS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uts) : null;
            this.LLILZLL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final C943803mW rS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w40) : null;
            this.LLJ = (C943803mW) viewFindViewById;
        }
        return (C943803mW) viewFindViewById;
    }

    public final TuxTextView sS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.yfr) : null;
            this.LLJILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView uS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.total_price) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final CharSequence wS() {
        Integer numValueOf;
        String quantityString;
        Resources resources;
        BillInfoData billInfoData = this.LLJJJJLIIL.LJIILLIIL;
        SpannableString spannableString = null;
        if (billInfoData == null || (numValueOf = Integer.valueOf(billInfoData.LJIIJ())) == null) {
            Context context = getContext();
            if (context != null) {
                return context.getString(2131848100);
            }
        } else {
            Context context2 = getContext();
            int iIntValue = numValueOf.intValue();
            if (context2 == null || (resources = context2.getResources()) == null || (quantityString = resources.getQuantityString(2131755294, iIntValue, Integer.valueOf(iIntValue))) == null) {
                quantityString = "";
            }
            spannableString = new SpannableString(quantityString);
            int iLJJJ = a0.LJJJ(spannableString, e3.h, 0, false, 6);
            int iLJJJ2 = a0.LJJJ(spannableString, ")", 0, false, 6) + 1;
            if (iLJJJ != -1 && iLJJJ2 != -1 && iLJJJ < iLJJJ2) {
                C786410Ut5.p2(spannableString, new C444920HcY(31, true), iLJJJ, iLJJJ2, 33);
            }
        }
        return spannableString;
    }

    public final PaymentViewModel yS() {
        return (PaymentViewModel) this.LLLII.getValue();
    }

    public final boolean zS() {
        PaymentMethod paymentMethod = this.LLJLLIL;
        return (paymentMethod != null && paymentMethod.LJJLI()) || this.LLJLLL != null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        if (yS().LLJJLIIIJLLLLLLLZ.LIZ) {
            return;
        }
        yS().LLJJLIIIJLLLLLLLZ.LIZJ = this.LLJJJJLIIL.LIZLLL;
        yS().LLJJLIIIJLLLLLLLZ.LJIIL(this, "a2270.b6108", null);
    }

    public final void VR() {
        List<? extends Object> list;
        C19EG activity = getActivity();
        if (activity != null) {
            C1744700vVE.LIZIZ(activity);
        }
        PaymentMethod paymentMethod = this.LLJLLIL;
        if (paymentMethod != null && paymentMethod.LJI != null) {
            Map<String, String> map = yS().LLJZIJLIL;
            PaymentMethod paymentMethod2 = this.LLJLLIL;
            if (((LinkedHashMap) map).get(paymentMethod2 != null ? paymentMethod2.id : null) == null) {
                C1389890mGx c1389890mGx = new C1389890mGx(aS());
                c1389890mGx.LJIIJ(requireContext().getString(2131833154));
                c1389890mGx.LJIIJJI();
                return;
            }
        }
        PaymentViewModel.RR2(yS(), getContext(), new AwS650S0100000_1(this, 4), 2);
        String[] strArr = this.LLLIIL;
        if (yS().LLJJIII == null || (list = yS().LLJJIII) == null) {
            return;
        }
        for (Object obj : (ArrayList) list) {
            if (obj instanceof C866903a7) {
                if (((C866903a7) obj).LIZJ != null) {
                    strArr[0] = ",card_number";
                } else {
                    strArr[0] = null;
                }
            } else if (obj instanceof C869503aX) {
                if (((C869503aX) obj).LIZJ != null) {
                    strArr[1] = ",date";
                } else {
                    strArr[1] = null;
                }
            } else if (obj instanceof C869603aY) {
                C869603aY c869603aY = (C869603aY) obj;
                if (Intrinsics.LJFF(c869603aY.LIZ.paramName, "cvv")) {
                    if (c869603aY.LIZJ != null) {
                        strArr[2] = ",code";
                    } else {
                        strArr[2] = null;
                    }
                } else if (Intrinsics.LJFF(c869603aY.LIZ.paramName, "holder_name")) {
                    if (c869603aY.LIZJ != null) {
                        strArr[3] = ",card_holder";
                    } else {
                        strArr[3] = null;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC988203tg
    public final void Z0() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IActivityStackDependencyService iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin != null ? iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin != null);
            iECommerceHostService = iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        if (((IActivityStackDependencyService) iECommerceHostService).isAppBackGround()) {
            this.LLLFFI = "close";
        }
        if (C904203g8.LJIIJ) {
            return;
        }
        C03WH c03whIS = iS();
        String str = this.LLLFFI;
        this.LLLFFI = null;
        if (str == null) {
            str = "return";
        }
        c03whIS.LJIJI(str, this.LLJLLIL, BS(), Boolean.valueOf(yS().oR2().LJI), yS().oR2().LJII.toString(), yS().oR2().LJIIIIZZ, Integer.valueOf(zS() ? 1 : 0), yS().LLJJLIIIJLLLLLLLZ.LIZ("a2270.b6108"), this.LLJJJJLIIL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        PaymentMethodsData paymentMethodsData;
        PaymentMethod paymentMethodLJIIIZ;
        IEventCenter iEventCenter;
        IEventCenter iEventCenter2;
        super.onDestroy();
        if (this.LLJLLIL == null || !this.LLLF) {
            this.LLJLL.invoke();
        }
        PaymentViewModel paymentViewModelYS = yS();
        paymentViewModelYS.getClass();
        IEventCenter iEventCenter3 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter3 != null) {
            iEventCenter3.LIZJ("ec_resend_pay_request", paymentViewModelYS);
            iEventCenter3.LIZJ("ec_payment_page_refresh_data", paymentViewModelYS);
            iEventCenter3.LIZJ("ec_order_result_received", paymentViewModelYS);
            iEventCenter3.LIZJ("ec_payment_continue", paymentViewModelYS);
            iEventCenter3.LIZJ("ec_payment_sns_bind_refresh", paymentViewModelYS);
            iEventCenter3.LIZJ("ec_payment_change", paymentViewModelYS);
            iEventCenter3.LIZJ("ec_payment_update_cached_card_info", paymentViewModelYS);
            iEventCenter3.LIZJ("ec_payment_refresh_cashier", paymentViewModelYS);
        }
        C786410Ut5.LJIIJ((DialogC1389620mGW) this.LLLIILIL.getValue());
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this.LLLILZLLLI);
        C03WH.LJIILIIL = null;
        C03WH.LJIILJJIL = null;
        EventBus.LIZLLL().LJJI(this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("payment_ccdc_bindcard_tips", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_payment_activate_direct_pay", this);
        C03Q4.LIZ.getClass();
        ((ArrayList) C03Q4.LIZJ).clear();
        C03Q4.LIZIZ = null;
        PaymentViewModel paymentViewModelYS2 = yS();
        if (C03WK.LIZ(paymentViewModelYS2.LLJ)) {
            if (C03XU.LIZIZ().updateCacheInfo <= 0 || (iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) == null) {
                return;
            }
            iEventCenter2.LIZ("ec_payment_update_cached_card_info", "{}");
            return;
        }
        EnterParams enterParams = paymentViewModelYS2.LLJ;
        if (enterParams == null || (paymentMethodsData = enterParams.paymentData) == null || (paymentMethodLJIIIZ = paymentMethodsData.LJIIIZ()) == null || !paymentMethodLJIIIZ.LJJLI() || (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) == null) {
            return;
        }
        iEventCenter.LIZ("ec_payment_update_cached_card_info", "{}");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
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
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(PaymentFragment.class.getName());
        }
        super.onResume();
        MiniOspFragment.LLJJJJ.getClass();
        C03T7.LIZIZ("PaymentFragment#onResume", false);
        try {
            if (yS().LLLFFI) {
                yS().LLLFFI = false;
                Integer num = this.LLJJJJLIIL.buttonType;
                int iOrdinal = EnumC882203ca.PAY_NOW.ordinal();
                if (num == null || num.intValue() != iOrdinal) {
                    this.LLJLL.invoke();
                } else if (yS().LLJJJJ != null) {
                    PaymentViewModel.LR2(yS());
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (this.LLLFZ) {
            PaymentViewModel paymentViewModelYS = yS();
            paymentViewModelYS.getClass();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ecom_tts_cashier_payment_seconed_installation_check", true)) {
                paymentViewModelYS.withState(new AwS580S0100000_1(paymentViewModelYS, 152));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Activity activityLIZ;
        super.onStart();
        if (this.LLJJJJLIIL.LIZ) {
            onVisible();
        }
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        this.LLLILZJ.LJI = new AwS545S0100000_1(this, 935);
        this.LLLILZJ.LIZIZ(activityLIZ);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Activity activityLIZ;
        super.onStop();
        if (this.LLJJJJLIIL.LIZ) {
            Z0();
        }
        this.LLLFZ = true;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        this.LLLILZJ.LIZJ(activityLIZ);
    }

    @Override // X.InterfaceC988203tg
    public final void onVisible() {
        C03WH c03whIS = iS();
        c03whIS.getClass();
        c03whIS.LJII = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    public final void FS(PaymentMethod paymentMethod) {
        PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips;
        PaymentServiceFeeInfo paymentServiceFeeInfo;
        String str;
        if (this.LLJJJJLIIL.LJJIJIIJI != EnumC837803Pc.SECOND_PAY) {
            C786410Ut5.LLLLZLL(oS(), 8);
            C786410Ut5.LLLLLLZZ(qS(), 8);
            return;
        }
        if (paymentMethod != null && (paymentServiceFeeInfo = paymentMethod.paymentServiceFeeInfo) != null && (str = paymentServiceFeeInfo.paymentServiceFeeTips) != null) {
            oS().setText(str);
            C786410Ut5.LLLLZLL(oS(), 0);
            C786410Ut5.LLLLLLZZ(qS(), 0);
        } else {
            C786410Ut5.LLLLZLL(oS(), 8);
            C786410Ut5.LLLLLLZZ(qS(), 8);
            if (paymentMethod != null) {
            }
            C786410Ut5.LLLLLLZZ(qS(), 8);
        }
        PaymentServiceFeeInfo paymentServiceFeeInfo2 = paymentMethod.paymentServiceFeeInfo;
        if (paymentServiceFeeInfo2 != null && (paymentServiceFeeInfoToolTips = paymentServiceFeeInfo2.paymentServiceFeeToolTips) != null) {
            C786410Ut5.LLLLLLZZ(qS(), 0);
            Context context = getContext();
            if (context != null) {
                C786410Ut5.I7(new AjS20S0300000_1(context, paymentServiceFeeInfoToolTips, this, 9), qS());
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        C786410Ut5.LLLLLLZZ(qS(), 8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1739450vMl
    public final boolean Pp(Map<String, String> map) {
        PaymentState paymentStateFQ2 = yS().FQ2();
        HashMap map2 = (HashMap) map;
        map2.put("content_list_size", String.valueOf(paymentStateFQ2.getPaymentList().size()));
        if (paymentStateFQ2.getPaymentList().isEmpty()) {
            map2.put("blank_type", "empty_data_list");
            return true;
        }
        if (this.LLJJJJLIIL.paymentData == null) {
            map2.put("blank_type", "no_meta_data");
            return true;
        }
        if (nS().getChildCount() > 0 && nS().getHeight() > 0) {
            return false;
        }
        map2.put("blank_type", "empty_view");
        return true;
    }

    public final boolean WR(PaymentMethod paymentMethod) {
        ActivateHelper activateHelper = ActivateHelper.LIZ;
        PaymentMethodsData paymentMethodsData = yS().LLJJIJIL;
        activateHelper.getClass();
        if (ActivateHelper.LJIIIIZZ(paymentMethod, paymentMethodsData) && !yS().LLLFZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233  */
    /* JADX WARN: Type inference failed for: r4v73, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v77, types: [T, java.lang.Integer] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r32) {
        /*
            Method dump skipped, instruction units count: 2810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAddCCDCCard(C03OE c03oe) {
        PaymentInfo paymentInfo;
        Pair pair;
        List<InstallmentPlan> list;
        String str;
        String str2;
        PaymentInfo paymentInfo2;
        String str3 = c03oe.LIZIZ;
        if (str3 != null) {
            boolean z = false;
            switch (str3.hashCode()) {
                case -904117629:
                    if (!str3.equals("ADD_NEW_CCI_BR")) {
                        return;
                    }
                    break;
                case -904117039:
                    if (!str3.equals("ADD_NEW_CCI_US")) {
                        return;
                    }
                    break;
                case -386829518:
                    if (!str3.equals("SELECT_INSTALLMENT_PLAN") || (paymentInfo = c03oe.LIZ) == null) {
                        return;
                    }
                    if (paymentInfo.LIZIZ()) {
                        pair = new Pair(paymentInfo.LIZIZ, paymentInfo.LIZJ);
                    } else {
                        pair = new Pair(paymentInfo.paymentMethod, paymentInfo.paymentMethodInfo);
                    }
                    PaymentMethod paymentMethod = (PaymentMethod) pair.getFirst();
                    PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) pair.getSecond();
                    if (paymentMethod == null) {
                        return;
                    }
                    InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
                    InstallmentPlan installmentPlan = null;
                    if (installmentInfo != null && (list = installmentInfo.installmentPlans) != null) {
                        Iterator<InstallmentPlan> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                InstallmentPlan next = it2.next();
                                InstallmentPlan installmentPlan2 = next;
                                String str4 = installmentPlan2.tenure;
                                if (paymentMethodInfo != null) {
                                    str = paymentMethodInfo.tenure;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str4, str)) {
                                    String str5 = installmentPlan2.installmentOptionId;
                                    if (paymentMethodInfo != null) {
                                        str2 = paymentMethodInfo.installmentOptionId;
                                    } else {
                                        str2 = null;
                                    }
                                    if (Intrinsics.LJFF(str5, str2)) {
                                        installmentPlan = next;
                                    }
                                }
                            }
                        }
                        installmentPlan = installmentPlan;
                    }
                    PaymentViewModel paymentViewModelYS = yS();
                    List<? extends Object> list2 = PaymentViewModel.LLLI;
                    paymentViewModelYS.VR2(paymentMethod, installmentPlan, false);
                    if (!paymentMethod.LJJJJLI()) {
                        C864903Zn c864903Zn = C864903Zn.LIZ;
                        String str6 = paymentMethod.id;
                        c864903Zn.getClass();
                        if (!C864903Zn.LIZ(str6) && !EcomMergeBalanceAndInstallmentSettings.LIZ(paymentMethod.id)) {
                            return;
                        }
                    }
                    if (this.LLJJJJLIIL.LJJIFFI) {
                        VR();
                        return;
                    }
                    PaymentViewModel paymentViewModelYS2 = yS();
                    paymentViewModelYS2.getClass();
                    paymentViewModelYS2.withState(new AwS367S0200000_1(paymentViewModelYS2, paymentMethod, 91));
                    return;
                case -331668371:
                    if (!str3.equals("ADD_NEW_CARD")) {
                        return;
                    }
                    break;
                case 1643743903:
                    if (!str3.equals("EDIT_ADDRESS") || (paymentInfo2 = c03oe.LIZ) == null) {
                        return;
                    }
                    PaymentViewModel paymentViewModelYS3 = yS();
                    paymentViewModelYS3.getClass();
                    paymentViewModelYS3.withState(new AwS367S0200000_1(paymentViewModelYS3, paymentInfo2, 93));
                    return;
                case 2037140572:
                    if (!str3.equals("ADD_NEW_CCI_SEA")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            PaymentInfo paymentInfo3 = c03oe.LIZ;
            if (paymentInfo3 == null) {
                return;
            }
            this.LLLFF = true;
            if (c03oe.LJ && this.LLJJJJLIIL.LJJIJIIJI == EnumC837803Pc.OCP) {
                z = true;
            }
            PaymentViewModel paymentViewModelYS4 = yS();
            String str7 = c03oe.LIZJ;
            if (str7 == null) {
                str7 = "";
            }
            paymentViewModelYS4.getClass();
            paymentViewModelYS4.withState(new AwS10S1210000_1(paymentInfo3, paymentViewModelYS4, str7, z, 3));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlikLaunchInputCodeSheetEventSecondPay(AnonymousClass0340 anonymousClass0340) {
        if (anonymousClass0340.LIZ) {
            VR();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlikLaunchPayDirectlyEventSecondPay(C034P c034p) {
        if (!c034p.LIZIZ) {
            return;
        }
        VR();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Type type;
        if (Intrinsics.LJFF(this.LLJJJJLIIL, new EnterParams(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false))) {
            String string = C1257480ipO.LIZ.getString("PAYMENT_STATE", "");
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(EnterParams.class));
                } else {
                    type = new TypeToken<EnterParams>() { // from class: X.03ak
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
                if (!(objFromJson instanceof EnterParams)) {
                    objFromJson = null;
                }
                EnterParams enterParams = (EnterParams) objFromJson;
                if (enterParams != null) {
                    this.LLJJJJLIIL = enterParams;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("payment_ccdc_bindcard_tips", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_payment_activate_direct_pay", this);
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this.LLLILZLLLI);
        super.onCreate(bundle);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEcAddCardPageCloseEvent(C871203ao c871203ao) {
        if (this.LLJJJJLIIL.LJJIFFI && this.LLLFF) {
            VR();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEcUSRetryCashierLoadingEvent(C851503Uj c851503Uj) {
        if (c851503Uj.LIZ) {
            DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) this.LLLIILIL.getValue();
            dialogC1389620mGW.setCanceledOnTouchOutside(true);
            C786410Ut5.J4(dialogC1389620mGW);
        } else {
            try {
                C786410Ut5.LJIIJ((DialogC1389620mGW) this.LLLIILIL.getValue());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1257480ipO.LIZ.storeString("PAYMENT_STATE", C1741890vQh.LJIIIIZZ(this.LLJJJJLIIL));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentSelectedEvent$ecommerce_transaction_release(C03OT c03ot) {
        if (!PaymentViewModel.ER2(yS())) {
            return;
        }
        PaymentMethod paymentMethod = c03ot.LIZ;
        withState(yS(), new AwS210S0300000_1(this, paymentMethod, c03ot, 26));
        withState(yS(), new AwS210S0300000_1(this, paymentMethod, c03ot, 27));
        if (C03WK.LIZ(this.LLJJJJLIIL)) {
            PaymentViewModel paymentViewModelYS = yS();
            PaymentMethod paymentMethod2 = c03ot.LIZLLL;
            boolean z = c03ot.LIZJ;
            paymentViewModelYS.getClass();
            if (paymentMethod2 != null && paymentMethod != null) {
                paymentViewModelYS.UR2(paymentMethod2, "sub_payment_type_element", C1697810uHb.LJIIJJI(new PaymentElement("sub_payment_id_element", "sub_payment_id_element", paymentMethod.id, null, Boolean.FALSE), new PaymentElement("sub_payment_token_element", "sub_payment_token_element", paymentMethod.token, null, Boolean.FALSE)));
                String str = paymentMethod2.id;
                String str2 = paymentMethod.id;
                if (z) {
                    Map<String, String> map = paymentViewModelYS.LLJZ;
                    if (str == null) {
                        str = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    map.put(str, str2);
                } else {
                    Map<String, String> map2 = paymentViewModelYS.LLJLLL;
                    if (str == null) {
                        str = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    map2.put(str, str2);
                }
                paymentMethod2.LIZ = paymentMethod;
                paymentViewModelYS.setState(new AwS210S0300000_1(paymentViewModelYS, paymentMethod2, paymentMethod, 30));
                return;
            }
            return;
        }
        VR();
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        PaymentCheckoutFragment paymentCheckoutFragment = this.LLLIZZ;
        if (paymentCheckoutFragment != null) {
            paymentCheckoutFragment.SR(f);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        PaymentCheckoutFragment paymentCheckoutFragment = this.LLLIZZ;
        if (paymentCheckoutFragment != null) {
            paymentCheckoutFragment.LLLLIIIILLL(tuxSheet, i);
        }
    }

    public final C1250250idj hS(String str, LinkText linkText) {
        String link;
        String string;
        int i;
        int i2;
        Integer numValueOf;
        boolean z = true;
        boolean z2 = !C03WK.LIZ(this.LLJJJJLIIL);
        if (linkText != null) {
            link = linkText.getLink();
        } else {
            link = null;
        }
        boolean zLIZ = EcomPiBindingGrowthConfigSettings.LIZ();
        if (linkText == null || linkText.getText() == null || !C123100dR.LIZ(link) || zLIZ) {
            z = false;
        }
        if (linkText != null && linkText.getText() != null) {
            string = linkText.getText();
        } else if (!C870903al.LIZ() || (string = this.LLJJJJLIIL.LJJIJIIJIL) == null) {
            string = getResources().getString(2131832780);
        }
        if (z) {
            str = "    " + str;
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        if ((C897103ez.LIZ() || z) && z2) {
            View viewFindViewById = this.LLILZ;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.xzl);
                } else {
                    viewFindViewById = null;
                }
                this.LLILZ = (TuxNavBar) viewFindViewById;
            }
            TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
            if (zLIZ) {
                i = R.attr.fp;
                i2 = R.raw.icon_shield_ticktok_fill;
            } else {
                i = R.attr.o9;
                i2 = R.raw.icon_shield_tick;
            }
            if (z) {
                numValueOf = Integer.valueOf(R.raw.icon_chevron_right_small_fill_ltr);
            } else {
                numValueOf = null;
            }
            c1250250idj.LIZLLL = C908903gt.LIZIZ(tuxNavBar, string, i, i2, numValueOf);
        }
        c1250250idj.LIZ(new AwS14S1110000_1(z, this, link, 1));
        c1250250idj.LJFF = R.drawable.b5j;
        c1250250idj.LJI = null;
        return c1250250idj;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        String str3;
        Type type;
        C03VO c03vo;
        Object obj = null;
        if (Intrinsics.LJFF(str, "payment_ccdc_bindcard_tips")) {
            Context context = getContext();
            if (context != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(C03VO.class));
                    } else {
                        type = new TypeToken<C03VO>() { // from class: X.03a5
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
                if (c03vo == null) {
                    str3 = null;
                } else {
                    str3 = c03vo.LIZIZ;
                }
                C897503f3.LJIIJ(context, str3, null);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "ec_payment_activate_direct_pay")) {
            ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(str2);
            if (concurrentHashMapLIZ != null) {
                obj = concurrentHashMapLIZ.get("payment_change_reason");
            }
            if (Intrinsics.LJFF(obj, Integer.valueOf(C03DI.BNPL_ACTIVATION.getValue()))) {
                ActivateHelper activateHelper = ActivateHelper.LIZ;
                PaymentMethodsData paymentMethodsData = yS().LLJJIJIL;
                PaymentMethod paymentMethod = this.LLJLLIL;
                activateHelper.getClass();
                if (ActivateHelper.LJIIIIZZ(paymentMethod, paymentMethodsData)) {
                    yS().LLLFZ = true;
                    aS().performClick();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList arrayList;
        int i;
        String str;
        List<PaymentMethod> list;
        super.onViewCreated(view, bundle);
        if (this.LLJJJJLIIL.LIZ) {
            new C2248351CzJ(this);
        }
        UR();
        C03WH c03whIS = iS();
        EnterParams enterParams = this.LLJJJJLIIL;
        Map<String, Object> mapLIZ = yS().LLJJLIIIJLLLLLLLZ.LIZ("a2270.b6108");
        if (!c03whIS.LJIIIZ) {
            PaymentMethodsData paymentMethodsData = enterParams.paymentData;
            String strLJJLIIIJ = null;
            if (paymentMethodsData != null && (list = paymentMethodsData.paymentMethods) != null) {
                arrayList = new ArrayList();
                for (PaymentMethod paymentMethod : list) {
                    PaymentMethod paymentMethod2 = paymentMethod;
                    if (!(paymentMethod2 instanceof PaymentMethod) || paymentMethod2 == null || paymentMethod2.LIZ()) {
                        arrayList.add(paymentMethod);
                    }
                }
            } else {
                arrayList = null;
            }
            PaymentMethodsData paymentMethodsData2 = enterParams.paymentData;
            if (paymentMethodsData2 != null) {
                ArrayList arrayList2 = new ArrayList();
                Collection collection = paymentMethodsData2.storedMethods;
                if (collection == null) {
                    collection = C13BV.INSTANCE;
                }
                arrayList2.addAll(collection);
                Object obj = arrayList;
                if (arrayList == null) {
                    obj = C13BV.INSTANCE;
                }
                arrayList2.addAll(obj);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((PaymentMethod) it2.next()).LJJIIZ());
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(233), 30);
            }
            PaymentMethodsData paymentMethodsData3 = enterParams.paymentData;
            if (paymentMethodsData3 != null && paymentMethodsData3.LJIIIZ() != null) {
                i = 1;
            } else {
                i = 0;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c03whIS.LIZ);
            if (strLJJLIIIJ != null) {
                linkedHashMap.put("payment_option", strLJJLIIIJ);
            }
            if (mapLIZ != null) {
                C038N.LIZ(linkedHashMap, mapLIZ);
            }
            linkedHashMap.put("is_credit_show", Integer.valueOf(i));
            if (!enterParams.LIZ) {
                str = "full_screen";
            } else {
                str = "seven_screen";
            }
            linkedHashMap.put("page_show_type", str);
            linkedHashMap.put("source_previous_page", C03WH.LJJIFFI(enterParams));
            String str2 = enterParams.LJI;
            if (str2 != null) {
                linkedHashMap.put("trigger_event", str2);
            }
            String strLIZ = C03WD.LIZ(enterParams);
            if (strLIZ != null) {
                linkedHashMap.put("bnpl_status", strLIZ);
            }
            C03WH.LJJII("tiktokec_enter_page", linkedHashMap);
            c03whIS.LJIIIZ = true;
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aqi, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:272:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C443120HZe GS(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment r11, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState r12, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 1640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment.GS(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, boolean):X.0HZe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.02xF] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    public final void ES(PaymentState paymentState, ButtonStyle buttonStyle, PaymentMethod paymentMethod, String str) {
        Summary summaryLIZIZ;
        ?? LIZ;
        Summary summary;
        Price price;
        ?? r12;
        Context context;
        String priceStr = str;
        if (!Intrinsics.LJFF(this.LLJJJJLIIL.LJIIJ, Boolean.TRUE) && !this.LLJJJJLIIL.LIZIZ()) {
            C03DZ.LIZJ(aS());
            C03DZ.LIZ(dS());
            if (buttonStyle != null) {
                int i = C806103Cx.LIZ[buttonStyle.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && (context = getContext()) != null) {
                                aS().LJJJJL(new AwS580S0100000_1(context, 134));
                                return;
                            }
                            return;
                        }
                        aS().setButtonVariant(4);
                        return;
                    }
                    aS().setButtonVariant(1);
                    return;
                }
                aS().setButtonVariant(0);
                return;
            }
            return;
        }
        C03DZ.LIZ(aS());
        DirectCheckoutBottomWidget directCheckoutBottomWidgetDS = dS();
        if (directCheckoutBottomWidgetDS != null) {
            C03DZ.LIZJ(directCheckoutBottomWidgetDS);
        }
        C443120HZe c443120HZeGS = GS(this, paymentState, yS().LLJJIJIL, true);
        boolean zBooleanValue = ((Boolean) c443120HZeGS.getFirst()).booleanValue();
        String str2 = (String) c443120HZeGS.getSecond();
        List list = (List) c443120HZeGS.getThird();
        EnterParams enterParams = this.LLJJJJLIIL;
        BillInfoData billInfoData = enterParams.LJIILLIIL;
        C035M c035m = null;
        if (billInfoData != null) {
            str2 = str2;
            zBooleanValue = zBooleanValue;
            list = list;
            c035m = null;
            summaryLIZIZ = C722002rq.LIZIZ(billInfoData, str2, zBooleanValue, list, null, null);
        } else {
            summaryLIZIZ = null;
        }
        enterParams.LJIJI = summaryLIZIZ;
        BillInfoData billInfoData2 = enterParams.LJIILLIIL;
        if (billInfoData2 != null) {
            LIZ = C756102xL.LIZ(billInfoData2, str2, zBooleanValue, list, c035m, c035m, false, 56);
        } else {
            LIZ = c035m;
        }
        enterParams.LJIJJ = LIZ;
        if (!this.LLJJJJLIIL.LIZIZ() ? ((summary = this.LLJJJJLIIL.LJIJI) == null || (price = summary.total) == null || (priceStr = price.getPriceStr()) == null) && (priceStr = this.LLJJJJLIIL.price) == null : priceStr == null && (priceStr = this.LLJJJJLIIL.price) == null) {
            priceStr = "";
        }
        DirectCheckoutBottomWidget directCheckoutBottomWidgetDS2 = dS();
        if (directCheckoutBottomWidgetDS2 == null) {
            return;
        }
        EnterParams enterParams2 = this.LLJJJJLIIL;
        String str3 = enterParams2.LJIIL;
        ButtonInfo buttonInfo = enterParams2.LJIILIIL;
        Summary summary2 = enterParams2.LJIJI;
        if (summary2 != null) {
            r12 = summary2.totalDiscountBenefitText;
        } else {
            r12 = c035m;
        }
        Object awS580S0100000_1 = c035m;
        if (!enterParams2.LIZIZ()) {
            awS580S0100000_1 = new AwS580S0100000_1(this, 130);
        }
        DirectCheckoutBottomWidget.LIZ(directCheckoutBottomWidgetDS2, str3, buttonInfo, paymentMethod, priceStr, r12, awS580S0100000_1);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
