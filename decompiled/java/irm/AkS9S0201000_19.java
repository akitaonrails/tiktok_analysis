package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1214930hil;
import X.C1226110i0n;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AkS9S0201000_19 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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

    public static final void LIZ$0(AkS9S0201000_19 akS9S0201000_19, View view) {
        Function2<? super C1226110i0n<?>, ? super Integer, Unit> function2 = ((C1214930hil) akS9S0201000_19.l0).LLJJ;
        if (function2 != null) {
            function2.invoke((C1226110i0n) akS9S0201000_19.l1, Integer.valueOf(akS9S0201000_19.i2));
        }
    }

    public static final void LIZ$1(AkS9S0201000_19 akS9S0201000_19, View view) {
        Function2<? super C1226110i0n<?>, ? super Integer, Unit> function2 = ((C1214930hil) akS9S0201000_19.l0).LLJJ;
        if (function2 != null) {
            function2.invoke((C1226110i0n) akS9S0201000_19.l1, Integer.valueOf(akS9S0201000_19.i2));
        }
    }

    public AkS9S0201000_19(C1214930hil c1214930hil, C1226110i0n c1226110i0n, int i, int i2) {
        this.$t = i2;
        this.l0 = c1214930hil;
        this.l1 = c1226110i0n;
        this.i2 = i;
    }
}
