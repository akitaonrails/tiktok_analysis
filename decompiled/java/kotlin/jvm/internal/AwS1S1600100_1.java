package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S1600100_1 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public long j7;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S1600100_1 awS1S1600100_1, Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        PaymentMethodsData paymentMethodsData;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PaymentInfo paymentInfo = (PaymentInfo) obj2;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS1S1600100_1.l1;
        PaymentInfo paymentInfo2 = (PaymentInfo) awS1S1600100_1.l2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - awS1S1600100_1.j7);
        if (zBooleanValue) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "-1";
        }
        Summary summary = (Summary) awS1S1600100_1.l3;
        BillInfoData billInfoData = ((OrderSubmitAssemViewModel) awS1S1600100_1.l1).LLJJI;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            str2 = paymentMethodsData.consultationId;
        } else {
            str2 = null;
        }
        OrderSubmitAssemViewModel.BS2(orderSubmitAssemViewModel, "sdk_done", paymentInfo2, lValueOf, str, summary, str2, null, null, null, null, null, null, 16320);
        if (!zBooleanValue) {
            ((OrderSubmitAssemViewModel) awS1S1600100_1.l1).rT2(((Context) awS1S1600100_1.l4).getResources().getString(2131832779));
            ((OrderSubmitAssemViewModel) awS1S1600100_1.l1).setState(AFwS228S0000000_1.get$arr$(476));
        } else {
            if (paymentInfo != null) {
                ((OrderSubmitAssemViewModel) awS1S1600100_1.l1).kT2(paymentInfo, false, false, "paypal process", false, false, false);
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = (OrderSubmitAssemViewModel) awS1S1600100_1.l1;
            if (orderSubmitAssemViewModel2.r.LIZJ) {
                OrderSubmitAssemViewModel.KS2(orderSubmitAssemViewModel2, (Context) awS1S1600100_1.l4, (Boolean) awS1S1600100_1.l5);
            } else {
                orderSubmitAssemViewModel2.aR2((Context) awS1S1600100_1.l4, awS1S1600100_1.s0, (Boolean) awS1S1600100_1.l5, (Integer) awS1S1600100_1.l6, Long.valueOf(awS1S1600100_1.j7));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1600100_1 awS1S1600100_1, Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        Resources resources;
        String string;
        PaymentMethodsData paymentMethodsData;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        List<PaymentElement> list = (List) obj2;
        String str3 = (String) obj3;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS1S1600100_1.l1;
        PaymentInfo paymentInfo = (PaymentInfo) awS1S1600100_1.l2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - awS1S1600100_1.j7);
        if (zBooleanValue) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "-1";
        }
        Summary summary = (Summary) awS1S1600100_1.l3;
        BillInfoData billInfoData = ((OrderSubmitAssemViewModel) awS1S1600100_1.l1).LLJJI;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            str2 = paymentMethodsData.consultationId;
        } else {
            str2 = null;
        }
        OrderSubmitAssemViewModel.BS2(orderSubmitAssemViewModel, "sdk_done", paymentInfo, lValueOf, str, summary, str2, null, null, null, null, null, null, 16320);
        if (!zBooleanValue) {
            Context context = (Context) awS1S1600100_1.l4;
            if (context != null && (resources = context.getResources()) != null && (string = resources.getString(2131832960)) != null) {
                ((OrderSubmitAssemViewModel) awS1S1600100_1.l1).rT2(string);
            }
            ((OrderSubmitAssemViewModel) awS1S1600100_1.l1).setState(AFwS228S0000000_1.get$arr$(514));
        } else {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = (OrderSubmitAssemViewModel) awS1S1600100_1.l1;
            PaymentInfo paymentInfo2 = (PaymentInfo) awS1S1600100_1.l2;
            if (paymentInfo2 != null) {
                PaymentMethod paymentMethod = paymentInfo2.paymentMethod;
                if (paymentMethod != null) {
                    paymentMethod.LJIIIIZZ = str3;
                }
                PaymentMethodInfo paymentMethodInfo = paymentInfo2.paymentMethodInfo;
                if (paymentMethodInfo != null) {
                    paymentMethodInfo.setPaymentElements(list);
                }
            } else {
                paymentInfo2 = null;
            }
            orderSubmitAssemViewModel2.kT2(paymentInfo2, false, false, "venmo process", false, false, false);
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = (OrderSubmitAssemViewModel) awS1S1600100_1.l1;
            if (orderSubmitAssemViewModel3.r.LIZJ) {
                OrderSubmitAssemViewModel.KS2(orderSubmitAssemViewModel3, (Context) awS1S1600100_1.l4, (Boolean) awS1S1600100_1.l5);
            } else {
                orderSubmitAssemViewModel3.aR2((Context) awS1S1600100_1.l4, awS1S1600100_1.s0, (Boolean) awS1S1600100_1.l5, (Integer) awS1S1600100_1.l6, Long.valueOf(awS1S1600100_1.j7));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1600100_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, PaymentInfo paymentInfo, long j, Summary summary, Context context, Boolean bool, String str, Integer num, int i) {
        super(3);
        this.$t = i;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = paymentInfo;
        this.j7 = j;
        this.l3 = summary;
        this.l4 = context;
        this.l5 = bool;
        this.s0 = str;
        this.l6 = num;
    }
}
