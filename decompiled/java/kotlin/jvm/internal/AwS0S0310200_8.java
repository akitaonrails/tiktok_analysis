package kotlin.jvm.internal;

import X.C09AY;
import X.C578720Mms;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import x5h.d;

/* JADX INFO: loaded from: classes9.dex */
public class AwS0S0310200_8 extends C09AY implements Function0 {
    public final int $t;
    public long j4;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS0S0310200_8 awS0S0310200_8) {
        ((d) awS0S0310200_8.l0).LIZIZ();
        C578720Mms.LIZIZ((ShortVideoContext) awS0S0310200_8.l1, System.currentTimeMillis() - awS0S0310200_8.j4, awS0S0310200_8.j5, ((d) awS0S0310200_8.l0).LIZIZ, null);
        ((Function1) awS0S0310200_8.l2).invoke(Boolean.valueOf(awS0S0310200_8.z3));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0310200_8 awS0S0310200_8) {
        ((d) awS0S0310200_8.l0).LIZIZ();
        C578720Mms.LIZIZ((ShortVideoContext) awS0S0310200_8.l1, System.currentTimeMillis() - awS0S0310200_8.j4, awS0S0310200_8.j5, ((d) awS0S0310200_8.l0).LIZIZ, null);
        ((Function1) awS0S0310200_8.l2).invoke(Boolean.valueOf(awS0S0310200_8.z3));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:long), (r1 I:kotlin.jvm.internal.AwS0S0310200_8) (LINE:117440521) kotlin.jvm.internal.AwS0S0310200_8.j5 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000b: IPUT (r9 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS0S0310200_8) (LINE:117440523) kotlin.jvm.internal.AwS0S0310200_8.l2 java.lang.Object, block:B:2:0x0000 */
    public AwS0S0310200_8(d dVar, d dVar2, ShortVideoContext shortVideoContext, long j, long j2, Function1<? super Boolean, Unit> function1, boolean z) {
        long j3;
        Object obj;
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = dVar;
        this.l1 = dVar2;
        this.j4 = shortVideoContext;
        this.j5 = j3;
        this.l2 = obj;
        this.z3 = function1;
    }
}
