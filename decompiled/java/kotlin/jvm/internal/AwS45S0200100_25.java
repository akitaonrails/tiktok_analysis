package kotlin.jvm.internal;

import X.C09AY;
import X.C1665510tRV;
import X.InterfaceC1675750ti1;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS45S0200100_25 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
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
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS45S0200100_25 awS45S0200100_25) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ((InterfaceC1675750ti1) awS45S0200100_25.l1).LIZ() > awS45S0200100_25.j2) {
            ((InterfaceC1675750ti1) awS45S0200100_25.l1).LJIIIIZZ(jCurrentTimeMillis);
            ((Function0) awS45S0200100_25.l0).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S0200100_25 awS45S0200100_25) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ((InterfaceC1675750ti1) awS45S0200100_25.l1).LIZ() > awS45S0200100_25.j2) {
            ((InterfaceC1675750ti1) awS45S0200100_25.l1).LJIIIIZZ(jCurrentTimeMillis);
            ((Function0) awS45S0200100_25.l0).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
    public static final Object invoke$2(AwS45S0200100_25 awS45S0200100_25) {
        long jLongValue;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = (Long) ((C1665510tRV) awS45S0200100_25.l0).LIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jElapsedRealtime - jLongValue > awS45S0200100_25.j2) {
            ((C1665510tRV) awS45S0200100_25.l0).LIZ = Long.valueOf(jElapsedRealtime);
            ((Function0) awS45S0200100_25.l1).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
    public static final Object invoke$3(AwS45S0200100_25 awS45S0200100_25) {
        long jLongValue;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = (Long) ((C1665510tRV) awS45S0200100_25.l0).LIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jElapsedRealtime - jLongValue > awS45S0200100_25.j2) {
            ((C1665510tRV) awS45S0200100_25.l0).LIZ = Long.valueOf(jElapsedRealtime);
            ((Function0) awS45S0200100_25.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS45S0200100_25 awS45S0200100_25) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ((InterfaceC1675750ti1) awS45S0200100_25.l1).LIZ() >= awS45S0200100_25.j2) {
            ((InterfaceC1675750ti1) awS45S0200100_25.l1).LJIIIIZZ(jCurrentTimeMillis);
            ((Function0) awS45S0200100_25.l0).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
    public static final Object invoke$5(AwS45S0200100_25 awS45S0200100_25) {
        long jLongValue;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = (Long) ((C1665510tRV) awS45S0200100_25.l0).LIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jElapsedRealtime - jLongValue > awS45S0200100_25.j2) {
            ((C1665510tRV) awS45S0200100_25.l0).LIZ = Long.valueOf(jElapsedRealtime);
            ((Function0) awS45S0200100_25.l1).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS45S0200100_25) (LINE:67108867) kotlin.jvm.internal.AwS45S0200100_25.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS45S0200100_25) (LINE:67108869) kotlin.jvm.internal.AwS45S0200100_25.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS45S0200100_25] */
    public AwS45S0200100_25(long j, long j2, Function0<Unit> function0, InterfaceC1675750ti1 interfaceC1675750ti1) {
        long j3;
        Object obj;
        c09ay.$t = interfaceC1675750ti1;
        c09ay.j2 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = function0;
        ?? c09ay = new C09AY(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS45S0200100_25) (LINE:67174407) kotlin.jvm.internal.AwS45S0200100_25.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS45S0200100_25(C1665510tRV c1665510tRV, C1665510tRV<Long> c1665510tRV2, long j, Function0<Unit> function0) {
        Object obj;
        super(0);
        this.$t = function0;
        this.l0 = c1665510tRV;
        this.j2 = c1665510tRV2;
        this.l1 = obj;
    }
}
