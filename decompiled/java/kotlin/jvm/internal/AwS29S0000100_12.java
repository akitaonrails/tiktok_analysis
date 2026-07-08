package kotlin.jvm.internal;

import X.C09AY;
import X.C0U23;
import X.C773210UUt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS29S0000100_12 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0000100_12(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS29S0000100_12 awS29S0000100_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        long j = awS29S0000100_12.j0;
        c773210UUt.getClass();
        c773210UUt.LIZJ.put("error_msg", String.valueOf(j));
        c773210UUt.LJIIJJI("system_event_stream_bitrate_error", "");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S0000100_12 awS29S0000100_12, Object obj) {
        boolean z;
        if (((C0U23) obj).LIZ == awS29S0000100_12.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS29S0000100_12 awS29S0000100_12, Object obj) {
        boolean z;
        if (((C0U23) obj).LIZ == awS29S0000100_12.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS29S0000100_12 awS29S0000100_12, Object obj) {
        boolean z;
        if (((C0U23) obj).LIZ == awS29S0000100_12.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS29S0000100_12 awS29S0000100_12, Object obj) {
        boolean z;
        if (((C0U23) obj).LIZ == awS29S0000100_12.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
