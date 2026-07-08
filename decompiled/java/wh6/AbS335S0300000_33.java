package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1AIA;
import X.C1AIP;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AbS335S0300000_33 extends AbstractViewOnClickListenerC1637610siV {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS335S0300000_33 abS335S0300000_33, View view) {
        if (view != null) {
            C1AIP c1aip = ((C1AIA) abS335S0300000_33.l0).LIZJ;
            if (c1aip != null && c1aip.M6()) {
                return;
            }
            ((Function1) abS335S0300000_33.l1).invoke((View) abS335S0300000_33.l2);
        }
    }

    public static final void LIZ$1(AbS335S0300000_33 abS335S0300000_33, View view) {
        if (view != null) {
            C1AIP c1aip = ((C1AIA) abS335S0300000_33.l0).LIZJ;
            if (c1aip != null && c1aip.M6()) {
                return;
            }
            ((Function1) abS335S0300000_33.l1).invoke((View) abS335S0300000_33.l2);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AbS335S0300000_33(X.C1AIA r4, kotlin.jvm.functions.Function1 r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            r3.$t = r7
            if (r7 == 0) goto L11
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r2.l2 = r6
            r0 = 500(0x1f4, double:2.47E-321)
        Ld:
            r2.<init>(r0)
            return
        L11:
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r2.l2 = r6
            r0 = 300(0x12c, double:1.48E-321)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS335S0300000_33.<init>(X.1AIA, kotlin.jvm.functions.Function1, android.view.View, int):void");
    }
}
