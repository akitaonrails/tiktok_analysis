package kotlin.jvm.internal;

import X.C09AY;
import X.C1397630mTR;
import X.C1716050ul1;
import X.C19EG;
import X.C238400w2;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS6S1310000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

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

    public static final Object invoke$0(AwS6S1310000_26 awS6S1310000_26, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LIZJ(0, awS6S1310000_26.s0, new AwS16S1210000_26((C1716050ul1) awS6S1310000_26.l2, "biometric_info_not_set", awS6S1310000_26.z4, (C19EG) awS6S1310000_26.l3, 0));
        if (!awS6S1310000_26.z4) {
            c1397630mTR.LIZJ(1, ((Context) awS6S1310000_26.l1).getString(2131840135), new AwS140S1100000_26((C1716050ul1) awS6S1310000_26.l2, "biometric_info_not_set", 4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S1310000_26 awS6S1310000_26, Object obj) {
        DeliveryInstructionState deliveryInstructionState = (DeliveryInstructionState) obj;
        LaneParams laneParams = new LaneParams();
        boolean z = awS6S1310000_26.z4;
        String str = awS6S1310000_26.s0;
        C238400w2 c238400w2 = (C238400w2) awS6S1310000_26.l1;
        C238400w2 c238400w22 = (C238400w2) awS6S1310000_26.l2;
        DeliveryInstructionViewModel deliveryInstructionViewModel = (DeliveryInstructionViewModel) awS6S1310000_26.l3;
        laneParams.plusAssign("is_success", Integer.valueOf(z ? 1 : 0));
        if (str != null) {
            laneParams.plusAssign("fail_reason", str);
        }
        laneParams.plusAssign("api_duration", Long.valueOf(c238400w2.element));
        laneParams.plusAssign("duration", Long.valueOf(c238400w22.element));
        laneParams.plusAssign("is_first_load", Integer.valueOf(deliveryInstructionViewModel.LLJI));
        return deliveryInstructionState.copy(deliveryInstructionState.pageStatus, deliveryInstructionState.saveLoadingStatus, deliveryInstructionState.itemList, deliveryInstructionState.pageLoaded, deliveryInstructionState.editDeliveryInstruction, deliveryInstructionState.curSelectItem, deliveryInstructionState.scrollerPos, deliveryInstructionState.backEvent, deliveryInstructionState.netEvent, deliveryInstructionState.toast, laneParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1310000_26(String str, boolean z, Context context, C1716050ul1 c1716050ul1, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z4 = z;
        this.l1 = context;
        this.l2 = c1716050ul1;
        this.l3 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1310000_26(boolean z, String str, C238400w2 c238400w2, C238400w2 c238400w22, DeliveryInstructionViewModel deliveryInstructionViewModel, int i) {
        super(1);
        this.$t = i;
        this.z4 = z;
        this.s0 = str;
        this.l1 = c238400w2;
        this.l2 = c238400w22;
        this.l3 = deliveryInstructionViewModel;
    }
}
