package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AbS685S0100000_1 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

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
    public AbS685S0100000_1(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS685S0100000_1 abS685S0100000_1, View view) {
        if (view != null) {
            ((Function0) abS685S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$1(AbS685S0100000_1 abS685S0100000_1, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) abS685S0100000_1.l0) != null) {
            function0.invoke();
        }
    }
}
