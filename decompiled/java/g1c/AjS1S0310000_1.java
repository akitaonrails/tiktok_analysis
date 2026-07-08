package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C03AZ;
import X.C049Y;
import X.C10516049i;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C919503ib;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress.USLogisticSelectAddressItemVH;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS26S0310000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AjS1S0310000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS1S0310000_1 ajS1S0310000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL((View) ajS1S0310000_1.l0, new C049Y(), new AwS89S0110000_1((UserRightDetail) ajS1S0310000_1.l1, ajS1S0310000_1.z3, 23));
            String str = ((UserRightDetail) ajS1S0310000_1.l1).detailPageSchema;
            if (str != null && !a0.LJJJIL(str)) {
                C919503ib.LIZIZ(((C03AZ) ajS1S0310000_1.l2).getContext(), str, new LinkedHashMap(), false).open();
            }
        }
    }

    public static final void LIZ$1(AjS1S0310000_1 ajS1S0310000_1, View view) {
        if (view != null) {
            USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH = (USLogisticSelectAddressItemVH) ajS1S0310000_1.l0;
            C1748720vbi.LIZLLL(uSLogisticSelectAddressItemVH.itemView, new C10516049i(), new AwS26S0310000_1(uSLogisticSelectAddressItemVH, (USLogisticSelectAddressItemVH) ajS1S0310000_1.z3, (boolean) ajS1S0310000_1.l1, (Address) AFwS228S0000000_1.get$arr$(927), (Function1<? super LaneParams, Unit>) 8));
            AddressSelectViewModel.iR2((AddressSelectViewModel) ((USLogisticSelectAddressItemVH) ajS1S0310000_1.l0).LLJILJILJ.getValue(), view.getContext(), C1748730vbj.LIZ(((USLogisticSelectAddressItemVH) ajS1S0310000_1.l0).itemView), ((ReachableAddress) ajS1S0310000_1.l2).address, 48);
        }
    }

    public static final void LIZ$2(AjS1S0310000_1 ajS1S0310000_1, View view) {
        if (view != null) {
            USLogisticSelectAddressItemVH uSLogisticSelectAddressItemVH = (USLogisticSelectAddressItemVH) ajS1S0310000_1.l0;
            boolean z = ajS1S0310000_1.z3;
            Address address = (Address) ajS1S0310000_1.l1;
            int i = USLogisticSelectAddressItemVH.LLJILLL;
            C1748720vbi.LIZLLL(uSLogisticSelectAddressItemVH.itemView, new C10516049i(), new AwS26S0310000_1(uSLogisticSelectAddressItemVH, (USLogisticSelectAddressItemVH) z, (boolean) address, (Address) null, (Function1<? super LaneParams, Unit>) 8));
            if (ajS1S0310000_1.z3) {
                ((AddressSelectViewModel) ((USLogisticSelectAddressItemVH) ajS1S0310000_1.l0).LLJILJILJ.getValue()).qR2((ReachableAddress) ajS1S0310000_1.l2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS1S0310000_1(Object obj, boolean z, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
