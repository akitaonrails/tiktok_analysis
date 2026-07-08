package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS38S0102000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS38S0102000_2 awS38S0102000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore start, cursor = ");
        sbLIZ.append(awS38S0102000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS38S0102000_2.l0).fT(Integer.valueOf(awS38S0102000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS38S0102000_2 awS38S0102000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore waiting manual response, cursor = ");
        sbLIZ.append(awS38S0102000_2.i1);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS38S0102000_2.l0).fT(Integer.valueOf(awS38S0102000_2.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS38S0102000_2 awS38S0102000_2) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performLoadMore enter responseSessionId=");
        sbLIZ.append(awS38S0102000_2.i1);
        sbLIZ.append(" bodyLayoutSize=");
        sbLIZ.append(awS38S0102000_2.i2);
        sbLIZ.append(" pendingPreLoadContinuation=");
        if (((RavenFragment) awS38S0102000_2.l0).LLJLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS38S0102000_2.l0).fT(Integer.valueOf(awS38S0102000_2.i1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS38S0102000_2(int r3, int r4, com.bytedance.hybrid.spark.raven.page.RavenFragment r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.i1 = r3
            r1.i2 = r4
            r1.l0 = r5
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r5
            r1.i2 = r4
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS38S0102000_2.<init>(int, int, com.bytedance.hybrid.spark.raven.page.RavenFragment, int):void");
    }
}
