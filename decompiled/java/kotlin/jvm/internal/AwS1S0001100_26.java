package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS1S0001100_26 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f966i0;
    public long j1;

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

    public static final Object invoke$0(AwS1S0001100_26 awS1S0001100_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("drop_down_list_name", "one_box_search");
        laneParams.plusAssign("item_num", Integer.valueOf(awS1S0001100_26.f966i0));
        laneParams.plusAssign("stay_time", String.valueOf(awS1S0001100_26.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0001100_26 awS1S0001100_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_num", Integer.valueOf(awS1S0001100_26.f966i0));
        laneParams.plusAssign("stay_time", Long.valueOf(awS1S0001100_26.j1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0001100_26(int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.f966i0 = i;
        this.j1 = j;
    }
}
