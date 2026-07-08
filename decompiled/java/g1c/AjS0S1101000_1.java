package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0378;
import X.AnonymousClass0483;
import X.C03AB;
import X.C1007903wr;
import X.C1741890vQh;
import X.C1748720vbi;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.events.ZipCodeSelectedEvent;
import kotlin.jvm.internal.AwS16S0001000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AjS0S1101000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i2;
    public Object l1;
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS0S1101000_1 ajS0S1101000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL(((C03AB) ajS0S1101000_1.l1).itemView, new AnonymousClass0483(), new AwS16S0001000_1(ajS0S1101000_1.i2, 1));
            AnonymousClass0378.LIZ().LIZ("ec_zipcode_selected_event", C1741890vQh.LJIIIIZZ(new ZipCodeSelectedEvent(ajS0S1101000_1.s0)));
        }
    }

    public static final void LIZ$1(AjS0S1101000_1 ajS0S1101000_1, View view) {
        if (view != null) {
            ((C1007903wr) ajS0S1101000_1.l1).LLILLJJLI.invoke(Integer.valueOf(ajS0S1101000_1.i2), ajS0S1101000_1.s0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS0S1101000_1(Object obj, String str, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
