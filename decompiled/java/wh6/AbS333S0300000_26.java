package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1720250urn;
import X.C1720760usc;
import X.EnumC1720960usw;
import X.InterfaceC1720050urT;
import X.InterfaceC1720550usH;
import X.InterfaceC1720700usW;
import android.view.View;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.ttpay.portal.wallet.BalanceButtonDO;
import com.bytedance.pipo.ttpay.portal.wallet.BalanceCardAdapter;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class AbS333S0300000_26 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS333S0300000_26 abS333S0300000_26, View view) {
        StellarActionDO action;
        InterfaceC1720050urT interfaceC1720050urT;
        if (view != null && (action = ((CardDO) abS333S0300000_26.l0).getAction()) != null) {
            String objId = ((CardDO) abS333S0300000_26.l0).getObjId();
            if (objId == null) {
                objId = ((CardDO) abS333S0300000_26.l0).getId();
            }
            C1720250urn c1720250urn = new C1720250urn(objId, ((CardDO) abS333S0300000_26.l0).getTrackingParams(), "card", (View) abS333S0300000_26.l1, 8);
            C1720760usc c1720760usc = (C1720760usc) abS333S0300000_26.l2;
            if (c1720760usc != null && (interfaceC1720050urT = c1720760usc.LIZIZ) != null) {
                interfaceC1720050urT.bL(action, c1720250urn, null);
            }
        }
    }

    public static final void LIZ$1(AbS333S0300000_26 abS333S0300000_26, View view) {
        InterfaceC1720050urT interfaceC1720050urT;
        if (view != null && (interfaceC1720050urT = (InterfaceC1720050urT) abS333S0300000_26.l0) != null) {
            interfaceC1720050urT.bL((StellarActionDO) abS333S0300000_26.l1, (C1720250urn) abS333S0300000_26.l2, null);
        }
    }

    public static final void LIZ$2(AbS333S0300000_26 abS333S0300000_26, View view) {
        InterfaceC1720050urT interfaceC1720050urT;
        if (view != null && (interfaceC1720050urT = (InterfaceC1720050urT) abS333S0300000_26.l0) != null) {
            interfaceC1720050urT.bL((StellarActionDO) abS333S0300000_26.l1, (C1720250urn) abS333S0300000_26.l2, null);
        }
    }

    public static final void LIZ$3(AbS333S0300000_26 abS333S0300000_26, View view) {
        if (view != null) {
            BalanceButtonDO balanceButtonDO = (BalanceButtonDO) abS333S0300000_26.l0;
            C1720250urn c1720250urn = new C1720250urn(balanceButtonDO.objId, balanceButtonDO.trackingParams, "button", null, 24);
            InterfaceC1720700usW interfaceC1720700usWR5 = ((BalanceCardAdapter) abS333S0300000_26.l1).R5();
            if (interfaceC1720700usWR5 != null) {
                interfaceC1720700usWR5.bL((StellarActionDO) abS333S0300000_26.l2, c1720250urn, null);
            }
        }
    }

    public static final void LIZ$4(AbS333S0300000_26 abS333S0300000_26, View view) {
        String str;
        if (view != null) {
            String id = ((InterfaceC1720550usH) abS333S0300000_26.l0).getId();
            Map<String, Object> map = ((InterfaceC1720550usH) abS333S0300000_26.l0).LLILZLL().LIZ;
            if (Intrinsics.LJFF(((InterfaceC1720550usH) abS333S0300000_26.l0).getType(), EnumC1720960usw.CARD_BUTTON.getValue())) {
                str = "button";
            } else {
                str = "card";
            }
            C1720250urn c1720250urn = new C1720250urn(id, map, str, null, 24);
            InterfaceC1720700usW interfaceC1720700usWR5 = ((StellarCardAdapter) abS333S0300000_26.l1).R5();
            if (interfaceC1720700usWR5 != null) {
                interfaceC1720700usWR5.bL((StellarActionDO) abS333S0300000_26.l2, c1720250urn, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS333S0300000_26(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
