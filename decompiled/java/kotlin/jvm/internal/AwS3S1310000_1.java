package kotlin.jvm.internal;

import X.C09AY;
import X.C2262851Dhb;
import X.C2262861Dhc;
import X.C2262991Dhp;
import X.C238400w2;
import X.C259800zU;
import X.C833003Ng;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS3S1310000_1 extends C09AY implements Function1 {
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
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S1310000_1 awS3S1310000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("is_success", Integer.valueOf(awS3S1310000_1.z4 ? 1 : 0));
        String str = awS3S1310000_1.s0;
        if (str != null) {
            laneParams.plusAssign("fail_reason", str);
        }
        laneParams.plusAssign("api_duration", Long.valueOf(((C238400w2) awS3S1310000_1.l1).element));
        laneParams.plusAssign("duration", Long.valueOf(((C238400w2) awS3S1310000_1.l2).element));
        laneParams.plusAssign("is_first_load", Integer.valueOf(((DeliveryPanelViewModel) awS3S1310000_1.l3).LLJJJJ));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS3S1310000_1 awS3S1310000_1, Object obj) {
        return C2262851Dhb.LIZ((C2262851Dhb) obj, null, null, null, null, null, null, null, null, null, new C2262861Dhc(new C833003Ng(awS3S1310000_1.z4, 2), (String) ((C259800zU) awS3S1310000_1.l1).element, (Price) null, (Integer) null, (Integer) 32, (Integer) ((C259800zU) awS3S1310000_1.l2).element, (ECRichText) null, awS3S1310000_1.s0, (Boolean) null, (C2262991Dhp) ((C259800zU) awS3S1310000_1.l3).element, (Boolean) null, (Integer) null, 6988), null, 1535);
    }

    public static final Object invoke$2(AwS3S1310000_1 awS3S1310000_1, Object obj) {
        AddressSelectState addressSelectState = (AddressSelectState) obj;
        LaneParams laneParams = new LaneParams();
        boolean z = awS3S1310000_1.z4;
        String str = awS3S1310000_1.s0;
        C238400w2 c238400w2 = (C238400w2) awS3S1310000_1.l1;
        C238400w2 c238400w22 = (C238400w2) awS3S1310000_1.l2;
        AddressSelectViewModel addressSelectViewModel = (AddressSelectViewModel) awS3S1310000_1.l3;
        laneParams.plusAssign("is_success", Integer.valueOf(z ? 1 : 0));
        if (str != null) {
            laneParams.plusAssign("fail_reason", str);
        }
        laneParams.plusAssign("api_duration", Long.valueOf(c238400w2.element));
        laneParams.plusAssign("duration", Long.valueOf(c238400w22.element));
        laneParams.plusAssign("is_first_load", Integer.valueOf(addressSelectViewModel.LLJJI));
        return addressSelectState.copy(addressSelectState.selectedAddress, addressSelectState.status, addressSelectState.renderDataList, addressSelectState.selectedRegions, addressSelectState.applyBtnEnable, addressSelectState.currentAddressSelectType, addressSelectState.selectCountry, addressSelectState.chooseLocation, addressSelectState.reachableAddress, laneParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1310000_1(boolean z, C259800zU c259800zU, C259800zU c259800zU2, String str, C259800zU c259800zU3, int i) {
        super(1);
        this.$t = i;
        this.z4 = z;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.s0 = str;
        this.l3 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1310000_1(boolean z, String str, C238400w2 c238400w2, C238400w2 c238400w22, AddressSelectViewModel addressSelectViewModel, int i) {
        super(1);
        this.$t = i;
        this.z4 = z;
        this.s0 = str;
        this.l1 = c238400w2;
        this.l2 = c238400w22;
        this.l3 = addressSelectViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1310000_1(boolean z, String str, C238400w2 c238400w2, C238400w2 c238400w22, DeliveryPanelViewModel deliveryPanelViewModel, int i) {
        super(1);
        this.$t = i;
        this.z4 = z;
        this.s0 = str;
        this.l1 = c238400w2;
        this.l2 = c238400w22;
        this.l3 = deliveryPanelViewModel;
    }
}
