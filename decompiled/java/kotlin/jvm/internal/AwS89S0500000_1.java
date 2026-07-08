package kotlin.jvm.internal;

import X.C03PI;
import X.C09AY;
import X.C1018703yb;
import X.C875203bS;
import X.C875803bY;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class AwS89S0500000_1 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS89S0500000_1 awS89S0500000_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_payment_continue", "{}");
        }
        if (zBooleanValue) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = (Map) awS89S0500000_1.l4;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("button_name", "riplay_agree");
            if (obj2 != null) {
                linkedHashMap.put("page_link", obj2);
            }
            C1018703yb.LIZIZ("tiktokec_button_click", linkedHashMap);
        }
        ((C03PI) awS89S0500000_1.l0).LJII((PaymentInfo) awS89S0500000_1.l1, null, (Boolean) awS89S0500000_1.l2, ((PaymentHalfFragment) awS89S0500000_1.l3).getView(), new AwS545S0100000_1((PaymentHalfFragment) awS89S0500000_1.l3, 1177));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS89S0500000_1 awS89S0500000_1, Object obj, Object obj2) {
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        C875203bS c875203bS = C875203bS.LIZ;
        Context context = (Context) awS89S0500000_1.l0;
        AwS65S0500000_1 awS65S0500000_1 = new AwS65S0500000_1((PaymentInfoViewModel) awS89S0500000_1.l2, (FragmentManager) awS89S0500000_1.l3, paymentMethod, (OrderSubmitAssemViewModel) awS89S0500000_1.l4, context, 2);
        C875803bY c875803bY = (C875803bY) awS89S0500000_1.l1;
        c875203bS.getClass();
        C875203bS.LIZ(context, paymentMethod, awS65S0500000_1, null, c875803bY);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS89S0500000_1(C03PI c03pi, C03PI c03pi2, PaymentInfo paymentInfo, Boolean bool, PaymentHalfFragment paymentHalfFragment, Map<String, ? extends Object> map) {
        super(2);
        this.$t = map;
        this.l0 = c03pi;
        this.l1 = c03pi2;
        this.l2 = paymentInfo;
        this.l3 = bool;
        this.l4 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0500000_1(Context context, C875803bY c875803bY, PaymentInfoViewModel paymentInfoViewModel, FragmentManager fragmentManager, OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = c875803bY;
        this.l2 = paymentInfoViewModel;
        this.l3 = fragmentManager;
        this.l4 = orderSubmitAssemViewModel;
    }
}
