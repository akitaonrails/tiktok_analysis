package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class AbS359S0000000_2 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;

    public static final void LIZ$0(AbS359S0000000_2 abS359S0000000_2, View view) {
    }

    public static final void LIZ$1(AbS359S0000000_2 abS359S0000000_2, View view) {
    }

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS359S0000000_2(int i) {
        super(300L);
        this.$t = i;
    }
}
