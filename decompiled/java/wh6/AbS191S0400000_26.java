package wh6;

import X.AbstractC1720840usk;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C1720250urn;
import X.C1720760usc;
import X.InterfaceC1720050urT;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.ButtonDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;

/* JADX INFO: loaded from: classes27.dex */
public class AbS191S0400000_26 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS191S0400000_26 abS191S0400000_26, View view) {
        if (view != null) {
            C1720250urn c1720250urn = new C1720250urn(((ImageDO) abS191S0400000_26.l0).getObjId(), ((ImageDO) abS191S0400000_26.l0).getTrackingParams(), "button", (ImageView) abS191S0400000_26.l1, 8);
            InterfaceC1720050urT interfaceC1720050urT = (InterfaceC1720050urT) abS191S0400000_26.l2;
            if (interfaceC1720050urT != null) {
                interfaceC1720050urT.bL((StellarActionDO) abS191S0400000_26.l3, c1720250urn, null);
            }
        }
    }

    public static final void LIZ$1(AbS191S0400000_26 abS191S0400000_26, View view) {
        String str;
        InterfaceC1720050urT interfaceC1720050urT;
        if (view != null) {
            if (abS191S0400000_26.l0 instanceof ButtonDO) {
                str = "button";
            } else {
                str = "card";
            }
            C1720250urn c1720250urn = new C1720250urn(((BaseWidgetDO) abS191S0400000_26.l1).getObjId(), ((BaseWidgetDO) abS191S0400000_26.l1).getTrackingParams(), str, null, 24);
            C1720760usc c1720760usc = ((AbstractC1720840usk) abS191S0400000_26.l2).LL;
            if (c1720760usc != null && (interfaceC1720050urT = c1720760usc.LIZIZ) != null) {
                interfaceC1720050urT.bL((StellarActionDO) abS191S0400000_26.l3, c1720250urn, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS191S0400000_26(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
