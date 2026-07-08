package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C03BK;
import X.C03BN;
import X.C03BS;
import X.C03BT;
import X.C0HZQ;
import X.C719102rN;
import X.C752702wn;
import X.C799503Aj;
import X.EnumC805503Cr;
import X.InterfaceC1685420txc;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class AjS0S0401000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void LIZ$0(AjS0S0401000_1 ajS0S0401000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS0S0401000_1.l0).invoke(Boolean.valueOf(((C03BN) ajS0S0401000_1.l1).LLILZIL.isChecked()), (C752702wn) ajS0S0401000_1.l2, (C719102rN) ajS0S0401000_1.l3, EnumC805503Cr.BUTTON, Integer.valueOf(ajS0S0401000_1.i4));
        }
    }

    public static final void LIZ$1(AjS0S0401000_1 ajS0S0401000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS0S0401000_1.l0).invoke(Boolean.valueOf(((C03BT) ajS0S0401000_1.l1).LLILZ.isChecked()), (C752702wn) ajS0S0401000_1.l2, (C719102rN) ajS0S0401000_1.l3, EnumC805503Cr.BUTTON, Integer.valueOf(ajS0S0401000_1.i4));
        }
    }

    public static final void LIZ$2(AjS0S0401000_1 ajS0S0401000_1, View view) {
        boolean zIsChecked;
        if (view != null) {
            InterfaceC1685420txc interfaceC1685420txc = (InterfaceC1685420txc) ajS0S0401000_1.l0;
            C0HZQ c0hzq = ((C799503Aj) ajS0S0401000_1.l1).LLJJIJI;
            if (c0hzq != null) {
                zIsChecked = c0hzq.isChecked();
            } else {
                zIsChecked = false;
            }
            interfaceC1685420txc.invoke(Boolean.valueOf(zIsChecked), (C752702wn) ajS0S0401000_1.l2, (C719102rN) ajS0S0401000_1.l3, EnumC805503Cr.BUTTON, Integer.valueOf(ajS0S0401000_1.i4));
        }
    }

    public static final void LIZ$3(AjS0S0401000_1 ajS0S0401000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS0S0401000_1.l0).invoke(Boolean.valueOf(((C03BS) ajS0S0401000_1.l1).LLIZLLLIL), (C752702wn) ajS0S0401000_1.l2, (C719102rN) ajS0S0401000_1.l3, EnumC805503Cr.BUTTON, Integer.valueOf(ajS0S0401000_1.i4));
        }
    }

    public static final void LIZ$4(AjS0S0401000_1 ajS0S0401000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS0S0401000_1.l0).invoke(Boolean.valueOf(((C03BK) ajS0S0401000_1.l1).LLILZLL.isChecked()), (C752702wn) ajS0S0401000_1.l2, (C719102rN) ajS0S0401000_1.l3, EnumC805503Cr.BUTTON, Integer.valueOf(ajS0S0401000_1.i4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS0S0401000_1(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.i4 = i;
    }
}
