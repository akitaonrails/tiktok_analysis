package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C013C;
import X.C03AZ;
import X.C049Y;
import X.C10516049i;
import X.C1389890mGx;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C719102rN;
import X.C919503ib;
import X.C974903rX;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.Button;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS5S1500000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AjS0S1500000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

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

    public static final void LIZ$0(AjS0S1500000_1 ajS0S1500000_1, View view) {
        String str;
        if (view != null) {
            C1748720vbi.LIZLLL(view, new C10516049i(), new AwS86S1200000_1(ajS0S1500000_1.s0, (Integer) ajS0S1500000_1.l3, (Float) ajS0S1500000_1.l4, 33));
            Function1 function1 = (Function1) ajS0S1500000_1.l1;
            if (function1 != null) {
                function1.invoke(((C719102rN) ajS0S1500000_1.l2).LLILZLL);
            }
            SnsDisplayInfo snsDisplayInfo = ((C719102rN) ajS0S1500000_1.l2).LLLILZJ;
            if (snsDisplayInfo != null && (str = snsDisplayInfo.snsPeriodLink) != null) {
                C919503ib.LIZIZ(((C03AZ) ajS0S1500000_1.l5).getContext(), str, new LinkedHashMap(), false).open();
            }
        }
    }

    public static final void LIZ$1(AjS0S1500000_1 ajS0S1500000_1, View view) {
        String str;
        if (view != null) {
            C1748720vbi.LIZLLL(((UsAddressItemVH) ajS0S1500000_1.l1).itemView, new C10516049i(), new AwS210S0300000_1((Address) ajS0S1500000_1.l3, (UsAddressItemVH) ajS0S1500000_1.l1, (C974903rX) ajS0S1500000_1.l5, 113));
            if (((C013C) ajS0S1500000_1.l2).element) {
                if (!((UsAddressItemVH) ajS0S1500000_1.l1).b6().d41() && !((UsAddressItemVH) ajS0S1500000_1.l1).b6().vj2()) {
                    ((UsAddressItemVH) ajS0S1500000_1.l1).b6().KM(view.getContext(), C1748730vbj.LIZ(view), (Address) ajS0S1500000_1.l3, null, null, Integer.valueOf(((UsAddressItemVH) ajS0S1500000_1.l1).LLJI), null, null, ajS0S1500000_1.s0, (Map) ajS0S1500000_1.l4);
                    return;
                } else {
                    ((UsAddressItemVH) ajS0S1500000_1.l1).b6().Pg1((Address) ajS0S1500000_1.l3);
                    return;
                }
            }
            Integer numIV1 = ((UsAddressItemVH) ajS0S1500000_1.l1).b6().iV1();
            if (numIV1 == null || numIV1.intValue() != 4 || !Intrinsics.LJFF(((C974903rX) ajS0S1500000_1.l5).LLILZLL, Boolean.FALSE) || (str = ((C974903rX) ajS0S1500000_1.l5).LLIZ) == null) {
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(((UsAddressItemVH) ajS0S1500000_1.l1).itemView);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$2(AjS0S1500000_1 ajS0S1500000_1, View view) {
        Integer num;
        if (view != null && (num = ((Button) ajS0S1500000_1.l1).type) != null) {
            if (num.intValue() == 1) {
                ((UsAddressItemVH) ajS0S1500000_1.l2).b6().KM(view.getContext(), C1748730vbj.LIZ(view), (Address) ajS0S1500000_1.l3, null, null, Integer.valueOf(((UsAddressItemVH) ajS0S1500000_1.l2).LLJI), ((Button) ajS0S1500000_1.l1).params, "c95166.d16671", ajS0S1500000_1.s0, (Map) ajS0S1500000_1.l4);
                C1748720vbi.LIZLLL(((UsAddressItemVH) ajS0S1500000_1.l2).itemView, new C049Y(), new AwS580S0100000_1((UsAddressItemVH) ajS0S1500000_1.l2, 947));
            } else {
                if (num.intValue() != 2) {
                    return;
                }
                ((UsAddressItemVH) ajS0S1500000_1.l2).b6().wX1(((C974903rX) ajS0S1500000_1.l5).LL, new AwS5S1500000_1((UsAddressItemVH) ajS0S1500000_1.l2, (UsAddressItemVH) view, (View) ajS0S1500000_1.l3, (Address) ajS0S1500000_1.l1, (Button) ajS0S1500000_1.s0, (String) ajS0S1500000_1.l4, (Map<String, String>) 7));
                C1748720vbi.LIZLLL(((UsAddressItemVH) ajS0S1500000_1.l2).itemView, new C049Y(), new AwS580S0100000_1((UsAddressItemVH) ajS0S1500000_1.l2, 948));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS0S1500000_1(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
        this.l4 = obj4;
        this.l5 = obj5;
    }
}
