package kotlin.jvm.internal;

import X.C09AY;
import X.C0QWU;
import X.C0QWW;
import X.C418440Gaw;
import X.C670090QQd;
import X.C671660QWe;
import X.C814420VxA;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public class AwS5S0402000_10 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S0402000_10 awS5S0402000_10, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        ((ViewGroup) awS5S0402000_10.l0).addView(((C671660QWe) obj2).LIZ);
        C0QWU c0qwu = (C0QWU) awS5S0402000_10.l1;
        c0qwu.LJI = true;
        c0qwu.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        ((C0QWU) awS5S0402000_10.l1).LJIIIIZZ = ((awS5S0402000_10.i4 - awS5S0402000_10.i5) - iIntValue) + ((TextView) awS5S0402000_10.l2).getPaddingEnd();
        float f = C0QWW.LIZ;
        C0QWW.LIZJ((ViewGroup) awS5S0402000_10.l0, (TextView) awS5S0402000_10.l2, (C0QWU) awS5S0402000_10.l1, (C670090QQd) awS5S0402000_10.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S0402000_10 awS5S0402000_10, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        ((ViewGroup) awS5S0402000_10.l0).addView(((C671660QWe) obj2).LIZ);
        C0QWU c0qwu = (C0QWU) awS5S0402000_10.l1;
        c0qwu.LJI = true;
        c0qwu.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        C0QWU c0qwu2 = (C0QWU) awS5S0402000_10.l1;
        c0qwu2.LJIIIIZZ = (awS5S0402000_10.i4 - awS5S0402000_10.i5) - iIntValue;
        float f = C0QWW.LIZ;
        C0QWW.LIZJ((ViewGroup) awS5S0402000_10.l0, (TextView) awS5S0402000_10.l3, c0qwu2, (C670090QQd) awS5S0402000_10.l2);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS5S0402000_10(int r3, int r4, android.view.ViewGroup r5, android.widget.TextView r6, X.C0QWU r7, X.C670090QQd r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            if (r9 == 0) goto L16
            r1 = r2
            r1.l0 = r5
            r1.l1 = r7
            r1.i4 = r3
            r1.i5 = r4
            r1.l2 = r8
            r1.l3 = r6
            r0 = 2
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r7
            r1.i4 = r3
            r1.i5 = r4
            r1.l2 = r6
            r1.l3 = r8
            r0 = 2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S0402000_10.<init>(int, int, android.view.ViewGroup, android.widget.TextView, X.0QWU, X.0QQd, int):void");
    }
}
