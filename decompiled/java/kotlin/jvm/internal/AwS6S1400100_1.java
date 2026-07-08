package kotlin.jvm.internal;

import X.C09AY;
import X.C1388190mED;
import X.C19EG;
import X.C908503gp;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS6S1400100_1 extends C09AY implements Function1 {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S1400100_1 awS6S1400100_1, Object obj) {
        ((OrderSubmitAssemViewModel) awS6S1400100_1.l1).kT2((PaymentInfo) obj, false, false, "blik code entered", false, false, false);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS6S1400100_1.l1;
        if (orderSubmitAssemViewModel.r.LIZJ) {
            OrderSubmitAssemViewModel.KS2(orderSubmitAssemViewModel, (Context) awS6S1400100_1.l2, (Boolean) awS6S1400100_1.l3);
        } else {
            orderSubmitAssemViewModel.aR2((Context) awS6S1400100_1.l2, awS6S1400100_1.s0, (Boolean) awS6S1400100_1.l3, (Integer) awS6S1400100_1.l4, Long.valueOf(awS6S1400100_1.j5));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S1400100_1 awS6S1400100_1, Object obj) {
        C19EG c19egLIZIZ;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        Context context = (Context) awS6S1400100_1.l1;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed()) {
            ((OrderSubmitAssemViewModel) awS6S1400100_1.l2).kT2(paymentInfo, false, false, "bizum phone entered", false, false, false);
            C908503gp.LJ();
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS6S1400100_1.l2;
            if (orderSubmitAssemViewModel.r.LIZJ) {
                OrderSubmitAssemViewModel.KS2(orderSubmitAssemViewModel, (Context) awS6S1400100_1.l1, (Boolean) awS6S1400100_1.l3);
            } else {
                orderSubmitAssemViewModel.aR2((Context) awS6S1400100_1.l1, awS6S1400100_1.s0, (Boolean) awS6S1400100_1.l3, (Integer) awS6S1400100_1.l4, Long.valueOf(awS6S1400100_1.j5));
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS6S1400100_1(long r3, android.content.Context r5, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r6, java.lang.Boolean r7, java.lang.Integer r8, java.lang.String r9, int r10) {
        /*
            r2 = this;
            r2.$t = r10
            if (r10 == 0) goto L16
            r1 = r2
            r1.l1 = r5
            r1.l2 = r6
            r1.l3 = r7
            r1.s0 = r9
            r1.l4 = r8
            r1.j5 = r3
            r0 = 1
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l1 = r6
            r1.l2 = r5
            r1.l3 = r7
            r1.s0 = r9
            r1.l4 = r8
            r1.j5 = r3
            r0 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS6S1400100_1.<init>(long, android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, java.lang.Boolean, java.lang.Integer, java.lang.String, int):void");
    }
}
