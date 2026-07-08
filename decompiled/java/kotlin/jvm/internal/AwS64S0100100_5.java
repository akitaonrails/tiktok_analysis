package kotlin.jvm.internal;

import X.C09AY;
import X.C0E3T;
import X.C0FX3;
import X.C352310DrZ;
import X.C358160E2k;
import X.C373320EkM;
import X.C373590Ekn;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic.NleClipTimeAdjustData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS64S0100100_5 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
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

    public static final Object invoke$0(AwS64S0100100_5 awS64S0100100_5) {
        ((C373320EkM) awS64S0100100_5.l0).Y3(C352310DrZ.LIZ(awS64S0100100_5.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS64S0100100_5 awS64S0100100_5) {
        C358160E2k c358160E2k = (C358160E2k) awS64S0100100_5.l0;
        long j = awS64S0100100_5.j1;
        NleClipTimeAdjustData nleClipTimeAdjustDataLIZ = c358160E2k.LL.LLJJJJ.LIZ();
        if (nleClipTimeAdjustDataLIZ != null) {
            long j2 = nleClipTimeAdjustDataLIZ.startTime;
            long j3 = nleClipTimeAdjustDataLIZ.endTime;
            long j4 = nleClipTimeAdjustDataLIZ.duration;
            long jLIZLLL = C352310DrZ.LIZLLL(50L);
            if (j >= j3 - jLIZLLL) {
                c358160E2k.LL.i3(new AwS3S0000001_5(0.0f, 7));
                C0E3T c0e3t = c358160E2k.LL;
                c0e3t.LLJJJIL.LIZIZ(j2, new C0FX3(c0e3t, 9), true, true);
            } else if (j < j2 - jLIZLLL) {
                c358160E2k.LL.i3(new AwS3S0000001_5(0.0f, 7));
                C0E3T c0e3t2 = c358160E2k.LL;
                c0e3t2.LLJJJIL.LIZIZ(j2, new C0FX3(c0e3t2, 11), true, true);
            } else {
                c358160E2k.LL.i3(new AwS3S0000001_5(((j - j2) * 1.0f) / j4, 7));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS64S0100100_5 awS64S0100100_5) {
        ((C373590Ekn) awS64S0100100_5.l0).Y3(C352310DrZ.LIZ(awS64S0100100_5.j1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0100100_5(C358160E2k c358160E2k, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c358160E2k;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0100100_5(C373320EkM c373320EkM, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c373320EkM;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0100100_5(C373590Ekn c373590Ekn, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c373590Ekn;
        this.j1 = j;
    }
}
