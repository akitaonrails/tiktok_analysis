package kotlin.jvm.internal;

import X.C09AY;
import X.C773210UUt;
import X.EnumC773230UUv;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS11S0002000_12 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f953i0;
    public int i1;

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

    public static final Object invoke$0(AwS11S0002000_12 awS11S0002000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        String strValueOf = String.valueOf(awS11S0002000_12.f953i0);
        String strValueOf2 = String.valueOf(awS11S0002000_12.i1);
        c773210UUt.LJ(strValueOf);
        c773210UUt.LJIIJJI("system_event_stream_error_received", strValueOf2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S0002000_12 awS11S0002000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        String strValueOf = String.valueOf(awS11S0002000_12.f953i0);
        String strValueOf2 = String.valueOf(awS11S0002000_12.i1);
        c773210UUt.LJ(strValueOf);
        c773210UUt.LJIIJJI("system_event_stream_error_received", strValueOf2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS11S0002000_12 awS11S0002000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        String strValueOf = String.valueOf(awS11S0002000_12.f953i0);
        String strValueOf2 = String.valueOf(awS11S0002000_12.i1);
        c773210UUt.LIZ("system_exit_stream_error");
        c773210UUt.LJ(strValueOf);
        c773210UUt.LJIIJ(strValueOf2);
        if (c773210UUt.LIZ == EnumC773230UUv.STATE_T2) {
            C773210UUt.LJIILJJIL(c773210UUt);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS11S0002000_12 awS11S0002000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        String strValueOf = String.valueOf(awS11S0002000_12.f953i0);
        String strValueOf2 = String.valueOf(awS11S0002000_12.i1);
        c773210UUt.LJ(strValueOf);
        c773210UUt.LJIIJJI("system_event_live_end_report_multi_times", strValueOf2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0002000_12(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f953i0 = i;
        this.i1 = i2;
    }
}
