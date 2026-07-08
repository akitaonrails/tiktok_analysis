package kotlin.jvm.internal;

import X.C09AY;
import X.C1741890vQh;
import X.C948003nC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS5S1001000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1001000_1(String str, int i) {
        super(1);
        this.$t = i;
        this.i1 = 3;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS5S1001000_1 awS5S1001000_1, Object obj) {
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        int i = awS5S1001000_1.i1;
        Object obj2 = awS5S1001000_1.s0;
        if (obj2 == null) {
            obj2 = 2131832569;
        }
        return deliveryPanelState.copy(deliveryPanelState.changePage, deliveryPanelState.apply, deliveryPanelState.selectedLogistic, deliveryPanelState.selectedShipToInfo, deliveryPanelState.addressRenderData, deliveryPanelState.status, deliveryPanelState.logisticList, deliveryPanelState.claimVoucherExceptionUX, deliveryPanelState.exposedItems, deliveryPanelState.exposedAddOnItems, deliveryPanelState.dispatchInfo, deliveryPanelState.shippingToAddressInfo, deliveryPanelState.logistics, deliveryPanelState.pdpLogisticModule, deliveryPanelState.privacyPolicyStatement, deliveryPanelState.shippingPolicyModule, deliveryPanelState.hasMapLocationChanged, deliveryPanelState.tab, deliveryPanelState.pickupSelectAddress, deliveryPanelState.pickUpList, deliveryPanelState.pickupSelectIdx, i, new C948003nC<>(obj2), deliveryPanelState.getPudoAddressStatus, deliveryPanelState.pudoSelectedLogistic, deliveryPanelState.centerAddress, deliveryPanelState.pudoSource, deliveryPanelState.changeAddressJumpSchema);
    }

    public static final Object invoke$1(AwS5S1001000_1 awS5S1001000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("page_name", "logistics");
        laneParams.plusAssign("sub_page_name", "shipping");
        laneParams.plusAssign("previous_page", "product_detail");
        laneParams.plusAssign("option_type", "shipping_type");
        laneParams.plusAssign("rank", Integer.valueOf(awS5S1001000_1.i1));
        laneParams.plusAssign("option_type", "shipping_type");
        try {
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(awS5S1001000_1.s0);
            if (mapLJIIJ != null) {
                laneParams.withParamsGroup(mapLJIIJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1001000_1(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }
}
