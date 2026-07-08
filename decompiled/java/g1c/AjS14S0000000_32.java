package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public class AjS14S0000000_32 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;

    public static final void LIZ$0(AjS14S0000000_32 ajS14S0000000_32, View view) {
    }

    public static final void LIZ$1(AjS14S0000000_32 ajS14S0000000_32, View view) {
    }

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS14S0000000_32(int i) {
        super(700L);
        this.$t = i;
    }
}
