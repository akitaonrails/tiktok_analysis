package kotlin.jvm.internal;

import X.C09AY;
import X.C0I7D;
import X.C1389890mGx;
import X.C20441214yg;
import X.C2188811AlT;
import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS155S1100000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS155S1100000_6 awS155S1100000_6) {
        C1389890mGx c1389890mGx = new C1389890mGx((C0I7D) awS155S1100000_6.l1);
        c1389890mGx.LJIIJ(awS155S1100000_6.s0);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS155S1100000_6 awS155S1100000_6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show daily task toast, ");
        sbLIZ.append(awS155S1100000_6.s0);
        C20441214yg.LIZIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS155S1100000_6.l1);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.ezq);
        c1389890mGx.LJIIJ(awS155S1100000_6.s0);
        c1389890mGx.LJ(Integer.valueOf(R.style.y0));
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS155S1100000_6 awS155S1100000_6) {
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS155S1100000_6.l1);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.ezq);
        c1389890mGx.LJIIJ(awS155S1100000_6.s0);
        c1389890mGx.LJ(Integer.valueOf(R.style.y0));
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS155S1100000_6 awS155S1100000_6) {
        Activity activity = (Activity) awS155S1100000_6.l1;
        if (activity != null) {
            String str = awS155S1100000_6.s0;
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS155S1100000_6 awS155S1100000_6) {
        Activity activity = (Activity) awS155S1100000_6.l1;
        if (activity != null) {
            String str = awS155S1100000_6.s0;
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS155S1100000_6(android.app.Activity r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS155S1100000_6.<init>(android.app.Activity, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S1100000_6(C0I7D c0i7d, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0i7d;
        this.s0 = str;
    }
}
