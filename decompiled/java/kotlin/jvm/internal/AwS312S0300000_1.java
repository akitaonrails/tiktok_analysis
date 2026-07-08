package kotlin.jvm.internal;

import X.C03F8;
import X.C03FA;
import X.C03FC;
import X.C03Y2;
import X.C09AY;
import X.C0H1U;
import X.C1019103yf;
import X.C418440Gaw;
import X.C770702zh;
import X.C808003Dq;
import X.C814420VxA;
import X.C860903Xz;
import X.C919503ib;
import X.EnumC1014603xw;
import X.InterfaceC1631620sYq;
import X.InterfaceC960503pD;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSubViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingPolicySection;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.USLogisticVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shippingmethod.USShippingMethodsVH;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS312S0300000_1 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS312S0300000_1(LogisticAdapter.LogisticViewHolder logisticViewHolder, C03FC c03fc, LogisticExpressionArea logisticExpressionArea, int i) {
        super(3);
        this.$t = i;
        this.l0 = logisticViewHolder;
        this.l1 = c03fc;
        this.l2 = logisticExpressionArea;
    }

    public static final Object invoke$0(AwS312S0300000_1 awS312S0300000_1, Object obj, Object obj2, Object obj3) {
        LogisticsDescription logisticsDescription;
        View view = (View) obj;
        String str = (String) obj2;
        if (str != null && str.length() != 0) {
            C03F8 c03f8 = (C03F8) ((LogisticAdapter.LogisticViewHolder) awS312S0300000_1.l0).LLJJI.getValue();
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = ((LogisticExpressionArea) awS312S0300000_1.l2).extraInfo;
            if (logisticsExpressionAreaExtraInfo != null) {
                logisticsDescription = logisticsExpressionAreaExtraInfo.popUpInfo;
            } else {
                logisticsDescription = null;
            }
            LogisticDTO logisticDTO = ((C03FC) awS312S0300000_1.l1).LIZ;
            c03f8.LIZ(view, str, logisticsDescription, logisticDTO.eventTrackInfo, logisticDTO);
        } else {
            ((LogisticAdapter.LogisticViewHolder) awS312S0300000_1.l0).X5().DR2(((C03FC) awS312S0300000_1.l1).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS312S0300000_1 awS312S0300000_1, Object obj, Object obj2, Object obj3) {
        LogisticsDescription logisticsDescription;
        View view = (View) obj;
        String str = (String) obj2;
        C03F8 c03f8 = (C03F8) ((USShippingMethodsVH) awS312S0300000_1.l0).LLJILJILJ.getValue();
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = ((LogisticExpressionArea) awS312S0300000_1.l1).extraInfo;
        Map<String, String> map = null;
        if (logisticsExpressionAreaExtraInfo != null) {
            logisticsDescription = logisticsExpressionAreaExtraInfo.popUpInfo;
        } else {
            logisticsDescription = null;
        }
        LogisticDTO logisticDTO = (LogisticDTO) awS312S0300000_1.l2;
        if (logisticDTO != null) {
            map = logisticDTO.eventTrackInfo;
        }
        c03f8.LIZ(view, str, logisticsDescription, map, logisticDTO);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS312S0300000_1 awS312S0300000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PaymentInfo paymentInfo = (PaymentInfo) obj2;
        if (paymentInfo == null) {
            paymentInfo = (PaymentInfo) awS312S0300000_1.l0;
        }
        if (zBooleanValue) {
            ((Function1) awS312S0300000_1.l1).invoke(new C860903Xz(C03Y2.SUCCESS, paymentInfo.paymentMethodInfo, paymentInfo.paymentMethod, paymentInfo));
            ((Function0) awS312S0300000_1.l2).invoke();
        } else {
            ((Function1) awS312S0300000_1.l1).invoke(new C860903Xz(C03Y2.PAY_ERROR, 14));
            ((Function0) awS312S0300000_1.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS312S0300000_1 awS312S0300000_1, Object obj, Object obj2, Object obj3) {
        LogisticsDescription logisticsDescription;
        View view = (View) obj;
        String str = (String) obj2;
        if (str != null && str.length() != 0) {
            C03F8 c03f8 = (C03F8) ((USLogisticVH) awS312S0300000_1.l0).LLJJIII.getValue();
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = ((LogisticExpressionArea) awS312S0300000_1.l2).extraInfo;
            if (logisticsExpressionAreaExtraInfo != null) {
                logisticsDescription = logisticsExpressionAreaExtraInfo.popUpInfo;
            } else {
                logisticsDescription = null;
            }
            LogisticDTO logisticDTO = ((C03FC) awS312S0300000_1.l1).LIZ;
            c03f8.LIZ(view, str, logisticsDescription, logisticDTO.eventTrackInfo, logisticDTO);
        } else {
            ((USLogisticVH) awS312S0300000_1.l0).a6().DR2(((C03FC) awS312S0300000_1.l1).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS312S0300000_1 awS312S0300000_1, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        String str = (String) obj2;
        ShippingPolicyModule shippingPolicyModule = (ShippingPolicyModule) awS312S0300000_1.l0;
        List<ShippingPolicySection> list = shippingPolicyModule.sections;
        if (list != null) {
            LogisticSelectFragment logisticSelectFragment = (LogisticSelectFragment) awS312S0300000_1.l2;
            String str2 = shippingPolicyModule.title;
            logisticSelectFragment.getClass();
            LinearLayout linearLayout = new LinearLayout(logisticSelectFragment.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            for (ShippingPolicySection shippingPolicySection : list) {
                if (C770702zh.LIZIZ(shippingPolicySection.header)) {
                    TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                    tuxTextView.setText(shippingPolicySection.header);
                    tuxTextView.setTextColorRes(R.attr.a1h);
                    tuxTextView.setTuxFont(42);
                    C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxTextView);
                    linearLayout.addView(tuxTextView);
                }
                if (C770702zh.LIZIZ(shippingPolicySection.content)) {
                    TuxTextView tuxTextView2 = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                    tuxTextView2.setText(shippingPolicySection.content);
                    tuxTextView2.setTextColorRes(R.attr.a1h);
                    tuxTextView2.setTuxFont(51);
                    C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxTextView2);
                    linearLayout.addView(tuxTextView2);
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            try {
                C808003Dq.LJFF(C808003Dq.LIZLLL(linearLayout, str2, true, null, 52), logisticSelectFragment.getChildFragmentManager(), null, null, 12);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR75, e, null);
            }
        } else if (str != null) {
            C919503ib.LIZIZ(view.getContext(), str, new LinkedHashMap(), false).open();
        }
        C03FA.LIZLLL("shipping_policy", null, null, null, null, null, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS312S0300000_1 awS312S0300000_1, Object obj, Object obj2, Object obj3) {
        LogisticsDescription logisticsDescription;
        View view = (View) obj;
        String str = (String) obj2;
        if (str != null && str.length() != 0) {
            C03F8 c03f8 = (C03F8) ((LogisticSubViewHolder) awS312S0300000_1.l0).LLJJI.getValue();
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = ((LogisticExpressionArea) awS312S0300000_1.l2).extraInfo;
            if (logisticsExpressionAreaExtraInfo != null) {
                logisticsDescription = logisticsExpressionAreaExtraInfo.popUpInfo;
            } else {
                logisticsDescription = null;
            }
            LogisticDTO logisticDTO = ((C03FC) awS312S0300000_1.l1).LIZ;
            c03f8.LIZ(view, str, logisticsDescription, logisticDTO.eventTrackInfo, logisticDTO);
        } else {
            ((LogisticSubViewHolder) awS312S0300000_1.l0).X5().DR2(((C03FC) awS312S0300000_1.l1).LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS312S0300000_1(LogisticSubViewHolder logisticSubViewHolder, C03FC c03fc, LogisticExpressionArea logisticExpressionArea, int i) {
        super(3);
        this.$t = i;
        this.l0 = logisticSubViewHolder;
        this.l1 = c03fc;
        this.l2 = logisticExpressionArea;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS312S0300000_1(ShippingPolicyModule shippingPolicyModule, InterfaceC960503pD interfaceC960503pD, LogisticSelectFragment logisticSelectFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = shippingPolicyModule;
        this.l1 = interfaceC960503pD;
        this.l2 = logisticSelectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS312S0300000_1(PaymentInfo paymentInfo, AwS367S0200000_1 awS367S0200000_1, Function0 function0, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentInfo;
        this.l1 = awS367S0200000_1;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS312S0300000_1(USLogisticVH uSLogisticVH, C03FC c03fc, LogisticExpressionArea logisticExpressionArea, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSLogisticVH;
        this.l1 = c03fc;
        this.l2 = logisticExpressionArea;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS312S0300000_1(USShippingMethodsVH uSShippingMethodsVH, LogisticExpressionArea logisticExpressionArea, LogisticDTO logisticDTO, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSShippingMethodsVH;
        this.l1 = logisticExpressionArea;
        this.l2 = logisticDTO;
    }
}
