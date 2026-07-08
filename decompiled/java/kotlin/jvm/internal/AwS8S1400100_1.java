package kotlin.jvm.internal;

import X.C03O0;
import X.C09AY;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class AwS8S1400100_1 extends C09AY implements Function2 {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S1400100_1 awS8S1400100_1, Object obj, Object obj2) {
        Resources resources;
        String string;
        if (((Boolean) obj).booleanValue()) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS8S1400100_1.l1;
            if (orderSubmitAssemViewModel.r.LIZJ) {
                OrderSubmitAssemViewModel.KS2(orderSubmitAssemViewModel, (Context) awS8S1400100_1.l2, (Boolean) awS8S1400100_1.l3);
            } else {
                orderSubmitAssemViewModel.aR2((Context) awS8S1400100_1.l2, awS8S1400100_1.s0, (Boolean) awS8S1400100_1.l3, (Integer) awS8S1400100_1.l4, Long.valueOf(awS8S1400100_1.j5));
            }
        } else {
            Context context = (Context) awS8S1400100_1.l2;
            if (context != null && (resources = context.getResources()) != null && (string = resources.getString(2131832779)) != null) {
                ((OrderSubmitAssemViewModel) awS8S1400100_1.l1).rT2(string);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S1400100_1 awS8S1400100_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_payment_continue", "{}");
        }
        if (zBooleanValue) {
            ((OrderSubmitAssemViewModel) awS8S1400100_1.l1).U = true;
            C03O0.LJJJJLL(C03O0.LIZ, "riplay_agree", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2, 8388575);
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS8S1400100_1.l1;
        if (orderSubmitAssemViewModel.r.LIZJ) {
            OrderSubmitAssemViewModel.KS2(orderSubmitAssemViewModel, (Context) awS8S1400100_1.l2, (Boolean) awS8S1400100_1.l3);
        } else {
            orderSubmitAssemViewModel.aR2((Context) awS8S1400100_1.l2, awS8S1400100_1.s0, (Boolean) awS8S1400100_1.l3, (Integer) awS8S1400100_1.l4, Long.valueOf(awS8S1400100_1.j5));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS8S1400100_1 awS8S1400100_1, Object obj, Object obj2) {
        Resources resources;
        String string;
        if (((Boolean) obj).booleanValue()) {
            ((MiniOspViewModel) awS8S1400100_1.l1).FQ2((Context) awS8S1400100_1.l2, awS8S1400100_1.s0, (Boolean) awS8S1400100_1.l3, (Integer) awS8S1400100_1.l4, Long.valueOf(awS8S1400100_1.j5));
        } else {
            Context context = (Context) awS8S1400100_1.l2;
            if (context != null && (resources = context.getResources()) != null && (string = resources.getString(2131832779)) != null) {
                MiniOspViewModel miniOspViewModel = (MiniOspViewModel) awS8S1400100_1.l1;
                miniOspViewModel.getClass();
                miniOspViewModel.setState(new AwS52S1000000_1(string, 28));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS8S1400100_1 awS8S1400100_1, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            ((MiniOspViewModel) awS8S1400100_1.l1).LLLLIL = true;
            C03O0.LJJJJLL(C03O0.LIZ, "riplay_agree", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2, 8388575);
        }
        ((MiniOspViewModel) awS8S1400100_1.l1).FQ2((Context) awS8S1400100_1.l2, awS8S1400100_1.s0, (Boolean) awS8S1400100_1.l3, (Integer) awS8S1400100_1.l4, Long.valueOf(awS8S1400100_1.j5));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1400100_1(long j, Context context, OrderSubmitAssemViewModel orderSubmitAssemViewModel, Boolean bool, Integer num, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = context;
        this.l3 = bool;
        this.s0 = str;
        this.l4 = num;
        this.j5 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1400100_1(MiniOspViewModel miniOspViewModel, Context context, String str, Boolean bool, Integer num, long j, int i) {
        super(2);
        this.$t = i;
        this.l1 = miniOspViewModel;
        this.l2 = context;
        this.s0 = str;
        this.l3 = bool;
        this.l4 = num;
        this.j5 = j;
    }
}
