package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS5S0203000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S0203000_18 awS5S0203000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manual load more onComplete sessionId=");
        sbLIZ.append(awS5S0203000_18.i2);
        sbLIZ.append(" cursor=");
        sbLIZ.append(awS5S0203000_18.i3);
        sbLIZ.append(" next=");
        sbLIZ.append(awS5S0203000_18.i4);
        sbLIZ.append(" data.size=");
        sbLIZ.append(((List) awS5S0203000_18.l0).size());
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS5S0203000_18.l1).fT(Integer.valueOf(awS5S0203000_18.i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS5S0203000_18 awS5S0203000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore onComplete continuation.resume data.size=");
        sbLIZ.append(((List) awS5S0203000_18.l0).size());
        sbLIZ.append(" cursor=");
        sbLIZ.append(awS5S0203000_18.i2);
        sbLIZ.append(" next=");
        sbLIZ.append(awS5S0203000_18.i3);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS5S0203000_18.l1).fT(Integer.valueOf(awS5S0203000_18.i4)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS5S0203000_18(int r3, int r4, int r5, com.bytedance.hybrid.spark.raven.page.RavenFragment r6, java.util.List r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l0 = r7
            r1.i2 = r3
            r1.i3 = r4
            r1.l1 = r6
            r1.i4 = r5
            r0 = 0
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.i2 = r3
            r1.i3 = r4
            r1.i4 = r5
            r1.l0 = r7
            r1.l1 = r6
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S0203000_18.<init>(int, int, int, com.bytedance.hybrid.spark.raven.page.RavenFragment, java.util.List, int):void");
    }
}
