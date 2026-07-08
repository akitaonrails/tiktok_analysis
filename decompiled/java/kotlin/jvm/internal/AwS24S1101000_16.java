package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1040740dBo;
import X.C1040820dBw;
import X.C1041000dCE;
import X.C1043500dGG;
import X.C1E1Y;
import X.C2266291Dn9;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS24S1101000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS24S1101000_16 awS24S1101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1041000dCE.LIZ.getClass();
        c1023640ckE.withParam(C1041000dCE.LIZIZ, String.valueOf(awS24S1101000_16.i2));
        c1023640ckE.withParam(C1041000dCE.LIZJ, awS24S1101000_16.s0);
        C1040820dBw.LIZ.getClass();
        c1023640ckE.withParam(C1040820dBw.LIZLLL, ((C1040740dBo) awS24S1101000_16.l1).LL.getCurrentUrl());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S1101000_16 awS24S1101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LLJI, 1);
        c1023640ckE.withParam(C1043500dGG.LLJIJIL, ((C1040740dBo) awS24S1101000_16.l1).LL.getUrl());
        c1023640ckE.withParam(C1043500dGG.LLJILJILJ, awS24S1101000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLJILJIL, Integer.valueOf(awS24S1101000_16.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS24S1101000_16 awS24S1101000_16, Object obj) {
        Long lValueOf;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2266291Dn9.LIZ.getClass();
        c1023640ckE.withParam(C2266291Dn9.LIZLLL, awS24S1101000_16.s0);
        C1002190cBd c1002190cBd = C2266291Dn9.LIZIZ;
        if (((Integer) awS24S1101000_16.l1) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE.withParam(c1002190cBd, lValueOf);
        c1023640ckE.withParam(C2266291Dn9.LIZJ, Long.valueOf(awS24S1101000_16.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS24S1101000_16 awS24S1101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1E1Y.LIZ.getClass();
        c1023640ckE.withParam(C1E1Y.LJFF, "get_rule_from_pack");
        c1023640ckE.withParam(C1E1Y.LJJIJL, ((AwemeRawAd) awS24S1101000_16.l1).getWebUrl());
        c1023640ckE.withParam(C1E1Y.LIZLLL, awS24S1101000_16.s0);
        c1023640ckE.withParam(C1E1Y.LIZJ, Long.valueOf(awS24S1101000_16.i2));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS24S1101000_16(int r3, X.C1040740dBo r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto L10
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.i2 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.i2 = r3
            r1.s0 = r5
            r1.l1 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS24S1101000_16.<init>(int, X.0dBo, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1101000_16(AwemeRawAd awemeRawAd, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = awemeRawAd;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1101000_16(String str, Integer num, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = num;
        this.i2 = i;
    }
}
