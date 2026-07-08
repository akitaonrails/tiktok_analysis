package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C03O0;
import X.C03ZC;
import X.C03ZD;
import X.C03ZN;
import X.C1026803zu;
import X.C1388190mED;
import X.C1440005kM;
import X.C2097608Jq;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionTaxRouteCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public class AjS18S0110000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final void LIZ$0(AjS18S0110000_1 ajS18S0110000_1, View view) {
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap mapLJI = C2097608Jq.LJI(new Pair("page_name", "live_auction_info_needed"), new Pair("button_name", "add"), new Pair("button_type", "rfc_curp_info"));
            c03o0.getClass();
            C03O0.LJJIII("livesdk_tiktokec_button_click", mapLJI);
            if (ajS18S0110000_1.z1) {
                AssemVMLazy assemVMLazy = ((AuctionTaxRouteCell) ajS18S0110000_1.l0).LLJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AuctionTaxRouteCell.LLJJIII;
                ((AuctionAddressPayVM) assemVMLazy.getValue()).AQ2(C1388190mED.LIZIZ(view.getContext()));
            } else {
                AssemVMLazy assemVMLazy2 = ((AuctionTaxRouteCell) ajS18S0110000_1.l0).LLJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = AuctionTaxRouteCell.LLJJIII;
                ((AuctionAddressPayVM) assemVMLazy2.getValue()).BQ2(null);
            }
        }
    }

    public static final void LIZ$1(AjS18S0110000_1 ajS18S0110000_1, View view) {
        String str;
        if (view != null) {
            ((C03ZC) ajS18S0110000_1.l0).getOnViewMoreInstallmentPlansClickListener().invoke();
            if (ajS18S0110000_1.z1) {
                PaymentMethod paymentMethod = ((C03ZC) ajS18S0110000_1.l0).getPaymentMethod();
                if (paymentMethod != null) {
                    str = paymentMethod.id;
                } else {
                    str = null;
                }
                C1440005kM.LIZIZ(new C03ZN(str));
            }
        }
    }

    public static final void LIZ$2(AjS18S0110000_1 ajS18S0110000_1, View view) {
        String str;
        if (view != null) {
            ((C03ZD) ajS18S0110000_1.l0).getOnViewMoreInstallmentPlansClickListener().invoke();
            if (ajS18S0110000_1.z1) {
                PaymentMethod paymentMethod = ((C03ZD) ajS18S0110000_1.l0).getPaymentMethod();
                if (paymentMethod != null) {
                    str = paymentMethod.id;
                } else {
                    str = null;
                }
                C1440005kM.LIZIZ(new C03ZN(str));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS18S0110000_1(Object obj, boolean z, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS18S0110000_1(boolean z, AuctionTaxRouteCell auctionTaxRouteCell, C1026803zu c1026803zu, int i) {
        super(700L);
        this.$t = i;
        this.z1 = z;
        this.l0 = auctionTaxRouteCell;
    }
}
