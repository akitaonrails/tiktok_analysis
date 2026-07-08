package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1009990cOD;
import X.C1010120cOQ;
import X.C1011150cQ5;
import X.C1018400cbm;
import X.C1018410cbn;
import X.C1023640ckE;
import X.C1040740dBo;
import X.C1043500dGG;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.history.AdWebHistoryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS9S0101100_16 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS9S0101100_16 awS9S0101100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJII, Long.valueOf(awS9S0101100_16.j2));
        Aweme aweme = ((C1011150cQ5) awS9S0101100_16.l0).LLIZ;
        if (aweme != null && C1010120cOQ.LJIJJLI(aweme)) {
            c1023640ckE.withParam(C1009990cOD.LJFF, ((C1011150cQ5) awS9S0101100_16.l0).LJJIII(awS9S0101100_16.i1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0101100_16 awS9S0101100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJII, Long.valueOf(awS9S0101100_16.j2));
        c1023640ckE.withParam(C1009990cOD.LJFF, ((C1011150cQ5) awS9S0101100_16.l0).LJJIII(awS9S0101100_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS9S0101100_16 awS9S0101100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJII, Long.valueOf(awS9S0101100_16.j2));
        c1023640ckE.withParam(C1009990cOD.LJFF, ((C1011150cQ5) awS9S0101100_16.l0).LJJIII(awS9S0101100_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS9S0101100_16 awS9S0101100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1018410cbn.LIZ.getClass();
        c1023640ckE.withParam(C1018410cbn.LIZLLL, ((C1018400cbm) awS9S0101100_16.l0).LIZ);
        c1023640ckE.withParam(C1018410cbn.LJI, Long.valueOf(awS9S0101100_16.i1));
        c1023640ckE.withParam(C1018410cbn.LIZJ, Long.valueOf(awS9S0101100_16.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS9S0101100_16 awS9S0101100_16, Object obj) {
        int iIntValue;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        C1002190cBd c1002190cBd = C1043500dGG.LLJILLL;
        Integer num = ((AdWebHistoryFragment) awS9S0101100_16.l0).LLILZLL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c1023640ckE.withParam(c1002190cBd, Integer.valueOf(iIntValue));
        c1023640ckE.withParam(C1043500dGG.LLJJI, Integer.valueOf(awS9S0101100_16.i1));
        c1023640ckE.withParam(C1043500dGG.LLJJIII, "history");
        c1023640ckE.withParam(C1043500dGG.LLJJIJI, Long.valueOf(awS9S0101100_16.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS9S0101100_16 awS9S0101100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(((C1040740dBo) awS9S0101100_16.l0).LLILLL));
        c1023640ckE.withParam(C1043500dGG.LJIILLIIL, ((C1040740dBo) awS9S0101100_16.l0).LLJI);
        c1023640ckE.withParam(C1043500dGG.LJJIFFI, Integer.valueOf(awS9S0101100_16.i1));
        c1023640ckE.withParam(C1043500dGG.LJIL, Long.valueOf(awS9S0101100_16.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS9S0101100_16 awS9S0101100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext(((Aweme) awS9S0101100_16.l0).getAwemeRawAd());
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJIJIL, String.valueOf(awS9S0101100_16.j2));
        c1023640ckE.withParam(C1009990cOD.LJJIJL, Integer.valueOf(awS9S0101100_16.i1 + 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0101100_16(int i, long j, Aweme aweme, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.j2 = j;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0101100_16(long j, C1011150cQ5 c1011150cQ5, int i, int i2) {
        super(1);
        this.$t = i2;
        this.j2 = j;
        this.l0 = c1011150cQ5;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0101100_16(C1018400cbm c1018400cbm, int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1018400cbm;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0101100_16(C1040740dBo c1040740dBo, int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1040740dBo;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0101100_16(AdWebHistoryFragment adWebHistoryFragment, int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = adWebHistoryFragment;
        this.i1 = i;
        this.j2 = j;
    }
}
