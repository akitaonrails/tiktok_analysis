package oqa;

import X.C01GW;
import X.C034B;
import X.C03PI;
import X.C03SE;
import X.C03WH;
import X.C03WK;
import X.C03XU;
import X.C03YI;
import X.C03YL;
import X.C03ZA;
import X.C03ZJ;
import X.C03ZM;
import X.C0H1U;
import X.C0HEZ;
import X.C12ES;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C14EU;
import X.C1841350y17;
import X.C1842040y2E;
import X.C19ME;
import X.C1DUH;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C452501pT;
import X.C770702zh;
import X.C7830034a;
import X.C786410Ut5;
import X.C812203Fg;
import X.C899503fN;
import X.C960203pA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends LinearLayout implements c {
    public static final /* synthetic */ int LLLL = 0;
    public C1841350y17 LL;
    public TuxIconView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public LinearLayout LLILZLL;
    public CardView LLIZ;
    public TuxTextView LLIZLLLIL;
    public SmartImageView LLJ;
    public ConstraintLayout LLJI;
    public TuxIconView LLJIJIL;
    public FrameLayout LLJILJIL;
    public LinearLayout LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public C21411818qq LLJJIJIL;
    public C21411818qq LLJJJ;
    public C03ZM LLJJJIL;
    public LinearLayout LLJJJJ;
    public ConstraintLayout LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C1331730kl9 LLJJLIIIJLLLLLLLZ;
    public final View LLJL;
    public PaymentViewModel LLJLIL;
    public HashMap<String, Object> LLJLILLLLZIIL;
    public C03WH LLJLL;
    public String LLJLLIL;
    public Function2<? super PaymentMethod, ? super Function1<? super String, Unit>, Unit> LLJLLL;
    public Function1<? super PaymentMethod, Unit> LLJZ;
    public String LLJZIJLIL;
    public Function1<? super PaymentMethod, Unit> LLL;
    public Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> LLLF;
    public Function1<? super PaymentMethod, Unit> LLLFF;
    public Function1<? super PaymentMethod, Unit> LLLFFI;
    public Function1<? super String, Unit> LLLFZ;
    public boolean LLLI;
    public final C01GW LLLII;
    public PaymentMethod LLLIIII;
    public final boolean LLLIIIIL;
    public boolean LLLIIIL;
    public ButtonStyle LLLIIL;
    public String LLLIILIL;
    public final C1DUH LLLIL;
    public boolean LLLILZ;
    public C03ZA LLLILZJ;
    public final C01GW LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public final ARunnableS101S0100000_1 LLLJL;

    @Override // p8b.c
    public String getViewName() {
        return "PaymentMethodView";
    }

    private final TuxIconView getIcToolTips() {
        return (TuxIconView) this.LLLILZLLLI.getValue();
    }

    private final C812203Fg getLayoutActivePromotion() {
        return (C812203Fg) this.LLJJL.getValue();
    }

    private final Handler getMainHandler() {
        return (Handler) this.LLLII.getValue();
    }

    private final TuxTextView getPaymentRemainingAmount() {
        return (TuxTextView) this.LLJJJJLIIL.getValue();
    }

    public final boolean LIZIZ() {
        PaymentViewModel paymentViewModel = this.LLJLIL;
        return C03WK.LIZ(paymentViewModel != null ? paymentViewModel.LLJ : null);
    }

    public final boolean LIZJ() {
        return this.LLJL.findViewById(R.id.wge).getVisibility() == 0 || this.LLJL.findViewById(R.id.jxt).getVisibility() == 0 || this.LLJL.findViewById(R.id.iconEditSEA).getVisibility() == 0;
    }

    public final void LIZLLL() {
        C03SE c03se = C03PI.LJIJI;
        PaymentMethod paymentMethod = this.LLLIIII;
        PaymentViewModel paymentViewModel = this.LLJLIL;
        PaymentMethodsData paymentMethodsData = paymentViewModel != null ? paymentViewModel.LLJJIJIL : null;
        c03se.getClass();
        if (!C03SE.LJJIIZ(paymentMethod, paymentMethodsData)) {
            C0H1U.LIZIZ(getIcToolTips());
        } else {
            C12ES.LJIILL(0, getIcToolTips());
            C786410Ut5.I7(new AjS60S0100000_1(this, 108), getIcToolTips());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqa.h.LJ():void");
    }

    public final void LJFF() {
        Integer num;
        PaymentTip paymentTip;
        InstallmentPlan installmentPlanRR2;
        PaymentMethod paymentMethod = this.LLLIIII;
        if (paymentMethod != null && (num = paymentMethod.interactionStyle) != null) {
            int iIntValue = num.intValue();
            if (paymentMethod.LJJJI() && iIntValue >= C03YL.HAVE_REMAINING_AMOUNT_NO_INSTALLMENT_PREPOSITION.getType() && !LIZIZ()) {
                PaymentMethod paymentMethod2 = this.LLLIIII;
                PaymentViewModel paymentViewModel = this.LLJLIL;
                if (((paymentViewModel == null || (installmentPlanRR2 = paymentViewModel.rR2(paymentMethod2, "Get selected installment plan for remaining amount")) == null || (paymentTip = installmentPlanRR2.remainAmountTips) == null) && (paymentMethod2 == null || (paymentTip = paymentMethod2.remainAmountTips) == null)) || !C770702zh.LIZIZ(paymentTip.tips) || (!this.LLLI && !Intrinsics.LJFF(paymentTip.showDescriptionDefault, Boolean.TRUE))) {
                    C0H1U.LIZIZ(getPaymentRemainingAmount());
                    LJII(false);
                    return;
                }
                C12ES.LJIILL(0, getPaymentRemainingAmount());
                getPaymentRemainingAmount().setText(paymentTip.tips);
                Integer numLIZIZ = PaymentTip.LIZIZ(paymentTip, C960203pA.LIZIZ(getContext()), 2);
                if (numLIZIZ != null || (numLIZIZ = C1308910kAL.LIZJ(R.attr.vd, getContext())) != null) {
                    getPaymentRemainingAmount().setTextColor(numLIZIZ.intValue());
                }
                LJII(true);
                return;
            }
        }
        C0H1U.LIZIZ(getPaymentRemainingAmount());
        LJII(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = r6.LLLIIII
            r4 = 0
            if (r2 == 0) goto L43
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r1 = r6.LLJLIL
            if (r1 == 0) goto L43
            java.lang.String r0 = "payment bnpl installment promotion check"
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r5 = r1.rR2(r2, r0)
        Lf:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LLLIIII
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L41
            boolean r0 = r0.LJJJI()
            if (r0 != r2) goto L41
            if (r5 != 0) goto L41
            r1 = 1
        L1e:
            boolean r0 = r6.LLLI
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LLLIIII
            if (r0 == 0) goto L45
            boolean r0 = r0.LJJJJL()
            if (r0 != r2) goto L45
            X.03SE r0 = X.C03PI.LJIJI
            r0.getClass()
            boolean r0 = X.C03SE.LJIL(r5, r4)
            if (r0 == 0) goto L45
            if (r1 != 0) goto L45
            com.bytedance.tux.input.TuxTextView r0 = r6.getPayPromotionDiscountFromXml()
            X.C0H1U.LIZIZ(r0)
            return
        L41:
            r1 = 0
            goto L1e
        L43:
            r5 = r4
            goto Lf
        L45:
            boolean r0 = r6.LLLILZ
            if (r0 == 0) goto L51
            com.bytedance.tux.input.TuxTextView r0 = r6.getPayPromotionDiscountFromXml()
            X.C0H1U.LIZIZ(r0)
            return
        L51:
            boolean r0 = r6.LLLI
            if (r0 == 0) goto L9e
            boolean r0 = r6.LIZJ()
            if (r0 != 0) goto L9e
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LLLIIII
            java.lang.String r2 = X.C03ZO.LIZ(r0)
            if (r2 == 0) goto L9e
            int r0 = r2.length()
            if (r0 <= 0) goto L9e
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r6.LLJLIL
            if (r0 == 0) goto L7f
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LLJZIJLIL
            if (r1 == 0) goto L7f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LLLIIII
            if (r0 == 0) goto L77
            java.lang.String r4 = r0.id
        L77:
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r4)
            if (r0 != 0) goto L8f
        L7f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LLLIIII
            if (r0 == 0) goto L87
            X.03Of r0 = r0.LJI
            if (r0 == 0) goto L8f
        L87:
            com.bytedance.tux.input.TuxTextView r0 = r6.getPayPromotionDiscountFromXml()
            X.C0H1U.LIZIZ(r0)
            return
        L8f:
            com.bytedance.tux.input.TuxTextView r0 = r6.getPayPromotionDiscountFromXml()
            r0.setText(r2)
            com.bytedance.tux.input.TuxTextView r0 = r6.getPayPromotionDiscountFromXml()
            X.C12ES.LJIILL(r3, r0)
            return
        L9e:
            com.bytedance.tux.input.TuxTextView r0 = r6.getPayPromotionDiscountFromXml()
            X.C0H1U.LIZIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oqa.h.LJIIJ():void");
    }

    public final LinearLayout getCardIconAreFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ddy);
            this.LLJILJILJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getExtraInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hiq);
            this.LLJJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getFlItemLeftFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i1w);
            this.LLJILJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView getIcNoticeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.juh);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconEditFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxt);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconEditSEAFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iconEditSEA);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getIconsContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k5c);
            this.LLJJJJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getIvArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l5g);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C03ZM getLvBindAndPayFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ntk);
            this.LLJJJIL = (C03ZM) callbackFindViewById;
        }
        return (C03ZM) callbackFindViewById;
    }

    public final TuxTextView getPayPromotionDiscountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q4e);
            this.LLJJIJIIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getPaymentMethodIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q5_);
            this.LLJ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final ConstraintLayout getPaymentViewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q5w);
            this.LLJJJJJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C1841350y17 getRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sp_);
            this.LL = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final ConstraintLayout getRightLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rightLayout);
            this.LLJI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getServiceFeeInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uts);
            this.LLJJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsx);
            this.LLJJIJIL = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final C21411818qq getSwitchButtonTokoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wsy);
            this.LLJJJ = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    public final CardView getTagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x0u);
            this.LLIZ = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final LinearLayout getTagExtraLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.x19);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvBindNoteFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2j);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvBonusPromotionTag() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2l);
            this.LLJJIJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvCcdcCardTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z2s);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z4s);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentServiceFeePromotion() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z5a);
            this.LLJJIII = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final boolean getSwitchChecked() {
        return getSwitchButtonFromXml().isChecked() || getSwitchButtonTokoFromXml().isChecked();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
    }

    public final boolean getAlwaysShowPaymentTips() {
        return this.LLLIIIL;
    }

    public final String getBindAndPayPmId() {
        return this.LLJZIJLIL;
    }

    public final C1331730kl9 getCircleOption() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final Function2<PaymentMethod, Function1<? super String, Unit>, Unit> getGetBindUrl() {
        return this.LLJLLL;
    }

    public final boolean getHideRadio() {
        return this.LLLIZZ;
    }

    public final C03ZA getItemVO() {
        return this.LLLILZJ;
    }

    public final Function1<PaymentMethod, Unit> getOnBonusPromotionClickListener() {
        return this.LLLFFI;
    }

    public final Function1<String, Unit> getOnCheckedListener() {
        return this.LLLFZ;
    }

    public final Function2<PaymentMethod, InterestFeePromotion, Unit> getOnInterestingFeePromotionClickListener() {
        return this.LLLF;
    }

    public final Function1<PaymentMethod, Unit> getOnPromotionClickListener() {
        return this.LLL;
    }

    public final Function1<PaymentMethod, Unit> getOnServiceFeePromotionClickListener() {
        return this.LLLFF;
    }

    public final String getPaySource() {
        return this.LLJLLIL;
    }

    public final C03WH getPaymentLogger() {
        return this.LLJLL;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.LLLIIII;
    }

    public final PaymentViewModel getPaymentViewModel() {
        return this.LLJLIL;
    }

    public final boolean getRecommendPaymentConfirm() {
        return this.LLLILZ;
    }

    public final Function1<PaymentMethod, Unit> getRemoveBindMethod() {
        return this.LLJZ;
    }

    public final String getSaleRegion() {
        return this.LLLIILIL;
    }

    public final boolean getShouldHidePromotion() {
        return this.LLLJIL;
    }

    public final ButtonStyle getStyle() {
        return this.LLLIIL;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.LLJLILLLLZIIL;
    }

    public final boolean getUseCcdcRadio() {
        return this.LLLJ;
    }

    public final boolean getUseDefaultRadio() {
        return this.LLLIIIIL;
    }

    public h(Context context) {
        super(context, null, 0);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1668));
        this.LLJJL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1667));
        C12ES.LIZJ(4.0f, context);
        C12ES.LIZJ(22.0f, context);
        C12ES.LIZJ(14.0f, context);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C12ES.LIZJ(2.0f, context);
        this.LLJJLIIIJLLLLLLLZ = new C1331730kl9(c1331750klB);
        this.LLL = AFwS228S0000000_1.get$arr$(691);
        this.LLLFF = AFwS228S0000000_1.get$arr$(692);
        this.LLLFFI = AFwS228S0000000_1.get$arr$(689);
        this.LLLFZ = AFwS228S0000000_1.get$arr$(690);
        this.LLLII = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(389));
        this.LLLIIIIL = true;
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1666));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setBackgroundColor(C960203pA.LIZ(R.attr.c3, context));
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
        C1DUH c1duh = (C1DUH) C1842040y2E.LIZ(layoutInflaterNe, R.layout.aqt, this, true, ViewDataBinding.LIZJ(null));
        this.LLLIL = c1duh;
        this.LLJL = c1duh.LLILZ;
        getRadioFromXml().setBackground(null);
        this.LLLJL = new ARunnableS101S0100000_1((Object) this, 62);
    }

    private final void setSwitchChecked(boolean z) {
        getSwitchButtonFromXml().setChecked(z);
        getSwitchButtonTokoFromXml().setChecked(z);
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
    public final PaymentMethod LIZ(String str) {
        PaymentInfo paymentInfo;
        List<? extends Object> list = PaymentViewModel.LLLI;
        if (C03YI.LJIIJ()) {
            PaymentMethod paymentMethod = this.LLLIIII;
            PaymentViewModel paymentViewModel = this.LLJLIL;
            InstallmentPlan installmentPlanRR2 = null;
            paymentMethod = null;
            PaymentMethod paymentMethod2 = null;
            if (paymentViewModel != null) {
                EnterParams enterParams = paymentViewModel.LLJ;
                if (enterParams != null && (paymentInfo = enterParams.paymentInfo) != null) {
                    paymentMethod2 = paymentInfo.LIZIZ;
                }
                installmentPlanRR2 = paymentViewModel.rR2(paymentMethod2, str);
            }
            PaymentMethod paymentMethodLIZLLL = C03YI.LIZLLL(paymentMethod, installmentPlanRR2, "PaymentMethodView_getCachedPaymentMethod");
            if (paymentMethodLIZLLL == null) {
                return this.LLLIIII;
            }
            return paymentMethodLIZLLL;
        }
        return this.LLLIIII;
    }

    public final void LJI(boolean z) {
        if (!z) {
            C0H1U.LIZIZ(this.LLJL.findViewById(R.id.wsx));
            C0H1U.LIZIZ(this.LLJL.findViewById(R.id.wsy));
        } else if (this.LLLIIL == ButtonStyle.TOKO_STYLE) {
            C12ES.LJIILL(0, this.LLJL.findViewById(R.id.wsy));
        } else {
            C12ES.LJIILL(0, this.LLJL.findViewById(R.id.wsx));
        }
    }

    public final void LJII(boolean z) {
        C19ME c19me;
        int i;
        ViewGroup.LayoutParams layoutParams = getLayoutActivePromotion().getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            if (z) {
                i = R.id.z5y;
            } else {
                i = R.id.z5c;
            }
            if (c19me.topToBottom != i) {
                c19me.topToBottom = i;
                C812203Fg layoutActivePromotion = getLayoutActivePromotion();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(layoutActivePromotion);
                layoutActivePromotion.setLayoutParams(c19me);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPaymentChooseSaveEvent(C7830034a c7830034a) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPaymentChooseSaveEvent: ");
        sbLIZ.append(c7830034a.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        getMainHandler().removeCallbacks(this.LLLJL);
        C786410Ut5.LJLIIL(10L, getMainHandler(), this.LLLJL);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPaymentInstallmentPromotionEvent(C034B c034b) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInstallmentPromotionEvent: ");
        sbLIZ.append(c034b.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        LJIIJ();
        LJFF();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentPromotionUIUpdateEvent(C03ZJ c03zj) {
        if (C899503fN.LIZIZ(c03zj.LIZ, this.LLLIIII)) {
            PaymentViewModel paymentViewModel = this.LLJLIL;
            if ((paymentViewModel != null && PaymentViewModel.ER2(paymentViewModel)) || !C03XU.LIZIZ().fixPromotionUpdate || C03XU.LIZIZ().ensureIdentifierAsSame) {
                if (C03XU.LIZIZ().ensureIdentifierAsSame) {
                    PaymentViewModel paymentViewModel2 = this.LLJLIL;
                    if (paymentViewModel2 != null) {
                        if (!Intrinsics.LJFF(paymentViewModel2.nR2(), c03zj.LJ)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                LJIIIIZZ(c03zj.LIZIZ, c03zj.LIZJ, c03zj.LIZLLL);
                C03ZA c03za = this.LLLILZJ;
                if (c03za != null) {
                    c03za.LJFF = Intrinsics.LJFF(c03zj.LIZIZ, Boolean.TRUE);
                }
                C03ZA c03za2 = this.LLLILZJ;
                if (c03za2 != null) {
                    c03za2.LJI = Intrinsics.LJFF(c03zj.LIZJ, Boolean.TRUE);
                }
                C03ZA c03za3 = this.LLLILZJ;
                if (c03za3 != null) {
                    c03za3.LJII = Intrinsics.LJFF(c03zj.LIZLLL, Boolean.TRUE);
                }
            }
        }
    }

    public final void setAlwaysShowPaymentTips(boolean z) {
        this.LLLIIIL = z;
    }

    public final void setBindAndPayPmId(String str) {
        this.LLJZIJLIL = str;
    }

    public final void setCardIconAreFromXml(LinearLayout linearLayout) {
        this.LLJILJILJ = linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0213  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.03ZM] */
    /* JADX WARN: Type inference failed for: r19v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v1, types: [X.03WJ] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.03WH] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setChecked(boolean r35) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqa.h.setChecked(boolean):void");
    }

    public final void setExtraInfoFromXml(TuxTextView tuxTextView) {
        this.LLJJI = tuxTextView;
    }

    public final void setFlItemLeftFromXml(FrameLayout frameLayout) {
        this.LLJILJIL = frameLayout;
    }

    public final void setGetBindUrl(Function2<? super PaymentMethod, ? super Function1<? super String, Unit>, Unit> function2) {
        this.LLJLLL = function2;
    }

    public final void setHideRadio(boolean z) {
        this.LLLIZZ = z;
    }

    public final void setIcNoticeFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setIconEditFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setIconEditSEAFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setIconsContainerFromXml(LinearLayout linearLayout) {
        this.LLJJJJ = linearLayout;
    }

    public final void setItemVO(C03ZA c03za) {
        this.LLLILZJ = c03za;
    }

    public final void setIvArrowFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setLvBindAndPayFromXml(C03ZM c03zm) {
        this.LLJJJIL = c03zm;
    }

    public final void setOnBonusPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLFFI = function1;
    }

    public final void setOnCheckedListener(Function1<? super String, Unit> function1) {
        this.LLLFZ = function1;
    }

    public final void setOnInterestingFeePromotionClickListener(Function2<? super PaymentMethod, ? super InterestFeePromotion, Unit> function2) {
        this.LLLF = function2;
    }

    public final void setOnPromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLL = function1;
    }

    public final void setOnServiceFeePromotionClickListener(Function1<? super PaymentMethod, Unit> function1) {
        this.LLLFF = function1;
    }

    public final void setPayPromotionDiscountFromXml(TuxTextView tuxTextView) {
        this.LLJJIJIIJIL = tuxTextView;
    }

    public final void setPaySource(String str) {
        this.LLJLLIL = str;
    }

    public final void setPaymentLogger(C03WH c03wh) {
        this.LLJLL = c03wh;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r11) {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqa.h.setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):void");
    }

    public final void setPaymentMethodIconFromXml(SmartImageView smartImageView) {
        this.LLJ = smartImageView;
    }

    public final void setPaymentViewContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJJJJJIL = constraintLayout;
    }

    public final void setPaymentViewModel(PaymentViewModel paymentViewModel) {
        this.LLJLIL = paymentViewModel;
    }

    public final void setRadioFromXml(C1841350y17 c1841350y17) {
        this.LL = c1841350y17;
    }

    public final void setRecommendPaymentConfirm(boolean z) {
        this.LLLILZ = z;
    }

    public final void setRemoveBindMethod(Function1<? super PaymentMethod, Unit> function1) {
        this.LLJZ = function1;
    }

    public final void setRightLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJI = constraintLayout;
    }

    public final void setSaleRegion(String str) {
        this.LLLIILIL = str;
    }

    public final void setServiceFeeInfoFromXml(TuxTextView tuxTextView) {
        this.LLJJ = tuxTextView;
    }

    public final void setShouldHidePromotion(boolean z) {
        this.LLLJIL = z;
    }

    public final void setStyle(ButtonStyle buttonStyle) {
        this.LLLIIL = buttonStyle;
        if (buttonStyle == ButtonStyle.TOKO_STYLE) {
            ((TuxTextView) this.LLJL.findViewById(R.id.z2i)).setTextColorRes(R.attr.dt);
            getRadioFromXml().LIZ(C0HEZ.LIZ(R.attr.dt, getContext()), C0HEZ.LIZ(R.attr.a01, getContext()));
        }
    }

    public final void setSwitchButtonFromXml(C21411818qq c21411818qq) {
        this.LLJJIJIL = c21411818qq;
    }

    public final void setSwitchButtonTokoFromXml(C21411818qq c21411818qq) {
        this.LLJJJ = c21411818qq;
    }

    public final void setTagContainerFromXml(CardView cardView) {
        this.LLIZ = cardView;
    }

    public final void setTagExtraLayoutFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setTrackParams(HashMap<String, Object> map) {
        this.LLJLILLLLZIIL = map;
    }

    public final void setTvBindNoteFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setTvBonusPromotionTag(TuxTextView tuxTextView) {
        this.LLJJIJI = tuxTextView;
    }

    public final void setTvCcdcCardTipFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvNameFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setTvPaymentServiceFeePromotion(TuxTextView tuxTextView) {
        this.LLJJIII = tuxTextView;
    }

    public final void setUseCcdcRadio(boolean z) {
        this.LLLJ = z;
    }

    public final void setUseDefaultRadio(boolean z) {
        if (this.LLLIZZ) {
            C12ES.LJIILL(4, this.LLJL.findViewById(R.id.sp_));
        } else if (z) {
            LJI(false);
        } else {
            C0H1U.LIZIZ(this.LLJL.findViewById(R.id.sp_));
            LJI(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[PHI: r5 r9
      0x003f: PHI (r5v5 boolean) = (r5v0 boolean), (r5v0 boolean), (r5v6 boolean) binds: [B:99:0x0218, B:101:0x021e, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r9v6 java.lang.String) = (r9v1 java.lang.String), (r9v1 java.lang.String), (r9v7 java.lang.String) binds: [B:99:0x0218, B:101:0x021e, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.Boolean r27, java.lang.Boolean r28, java.lang.Boolean r29) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oqa.h.LJIIIIZZ(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void");
    }
}
