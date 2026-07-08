package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS4S1210100_26 extends C09AY implements Function1 {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S1210100_26 awS4S1210100_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("is_success", Integer.valueOf(awS4S1210100_26.z3 ? 1 : 0));
        String str = awS4S1210100_26.s0;
        if (str != null) {
            laneParams.plusAssign("fail_reason", str);
        }
        laneParams.plusAssign("api_duration", (Long) awS4S1210100_26.l1);
        laneParams.plusAssign("duration", Long.valueOf(awS4S1210100_26.j4));
        laneParams.plusAssign("is_first_load", (Integer) awS4S1210100_26.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1210100_26 awS4S1210100_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("is_success", Integer.valueOf(awS4S1210100_26.z3 ? 1 : 0));
        String str = awS4S1210100_26.s0;
        if (str != null) {
            laneParams.plusAssign("fail_reason", str);
        }
        laneParams.plusAssign("api_duration", (Long) awS4S1210100_26.l1);
        laneParams.plusAssign("duration", Long.valueOf(awS4S1210100_26.j4));
        laneParams.plusAssign("is_first_load", (Integer) awS4S1210100_26.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1210100_26(long j, Integer num, Long l, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.s0 = "";
        this.l1 = l;
        this.j4 = j;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1210100_26(long j, Integer num, Long l, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.s0 = str;
        this.l1 = l;
        this.j4 = j;
        this.l2 = num;
    }
}
