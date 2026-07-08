package kotlin.jvm.internal;

import X.C09AY;
import X.C893803eS;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS0S1231000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i6;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;
    public boolean z5;

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

    public static final Object invoke$0(AwS0S1231000_26 awS0S1231000_26, Object obj) {
        boolean z;
        Integer num;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("url", awS0S1231000_26.s0);
        laneParams.plusAssign("index", String.valueOf(awS0S1231000_26.i6));
        laneParams.plusAssign("has_set_placeholder", C893803eS.LIZ(awS0S1231000_26.z3));
        laneParams.plusAssign("load_success", C893803eS.LIZ(awS0S1231000_26.z4));
        laneParams.plusAssign("disk_hit", (Integer) awS0S1231000_26.l1);
        laneParams.plusAssign("is_repeat_load", C893803eS.LIZ(awS0S1231000_26.z5));
        if (!awS0S1231000_26.z3 && !awS0S1231000_26.z4 && ((num = (Integer) awS0S1231000_26.l1) == null || num.intValue() != 2)) {
            z = true;
        } else {
            z = false;
        }
        laneParams.plusAssign("is_blank", C893803eS.LIZ(z));
        Boolean bool = (Boolean) awS0S1231000_26.l2;
        if (bool != null) {
            laneParams.plusAssign("is_first_show", C893803eS.LIZ(bool.booleanValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1231000_26 awS0S1231000_26, Object obj) {
        boolean z;
        Integer num;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("url", awS0S1231000_26.s0);
        laneParams.plusAssign("index", String.valueOf(awS0S1231000_26.i6));
        laneParams.plusAssign("has_set_placeholder", C893803eS.LIZ(awS0S1231000_26.z3));
        laneParams.plusAssign("load_success", C893803eS.LIZ(awS0S1231000_26.z4));
        laneParams.plusAssign("disk_hit", (Integer) awS0S1231000_26.l1);
        laneParams.plusAssign("is_repeat_load", C893803eS.LIZ(awS0S1231000_26.z5));
        if (!awS0S1231000_26.z3 && !awS0S1231000_26.z4 && ((num = (Integer) awS0S1231000_26.l1) == null || num.intValue() != 2)) {
            z = true;
        } else {
            z = false;
        }
        laneParams.plusAssign("is_blank", C893803eS.LIZ(z));
        Boolean bool = (Boolean) awS0S1231000_26.l2;
        if (bool != null) {
            laneParams.plusAssign("is_first_show", C893803eS.LIZ(bool.booleanValue()));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1231000_26(String str, int i, boolean z, boolean z2, Integer num, boolean z3, Boolean bool, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i6 = i;
        this.z3 = z;
        this.z4 = z2;
        this.l1 = num;
        this.z5 = z3;
        this.l2 = bool;
    }
}
