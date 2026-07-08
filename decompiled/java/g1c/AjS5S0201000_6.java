package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C21375718l1;
import X.C21376318l7;
import X.C430120Gtm;
import X.C430140Gto;
import X.C434680H2s;
import X.InterfaceC430130Gtn;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class AjS5S0201000_6 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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

    public static final void LIZ$0(AjS5S0201000_6 ajS5S0201000_6, View view) {
        InterfaceC430130Gtn interfaceC430130Gtn;
        if (view != null && (interfaceC430130Gtn = ((C430120Gtm) ajS5S0201000_6.l0).LLILZ) != null) {
            interfaceC430130Gtn.LIZJ((C21375718l1) ajS5S0201000_6.l1, ajS5S0201000_6.i2);
        }
    }

    public static final void LIZ$1(AjS5S0201000_6 ajS5S0201000_6, View view) {
        InterfaceC430130Gtn interfaceC430130Gtn;
        if (view != null && (interfaceC430130Gtn = ((C434680H2s) ajS5S0201000_6.l0).LLILLJJLI) != null) {
            interfaceC430130Gtn.LIZJ(((C430140Gto) ajS5S0201000_6.l1).itemView, ajS5S0201000_6.i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS5S0201000_6(C430120Gtm c430120Gtm, C21375718l1 c21375718l1, int i, C21376318l7 c21376318l7, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = c430120Gtm;
        this.l1 = c21375718l1;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS5S0201000_6(C434680H2s c434680H2s, C430140Gto c430140Gto, int i, C21376318l7 c21376318l7, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = c434680H2s;
        this.l1 = c430140Gto;
        this.i2 = i;
    }
}
