package kotlin.jvm.internal;

import X.C09AY;
import X.C1715450uk3;
import X.C1730740v8i;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS16S0002000_26 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f959i0;
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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S0002000_26 awS16S0002000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("drop_down_list_name", "address");
        laneParams.plusAssign("item_num", Integer.valueOf(awS16S0002000_26.f959i0));
        laneParams.plusAssign("action_type", "click");
        laneParams.plusAssign("rank", Integer.valueOf(awS16S0002000_26.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS16S0002000_26 awS16S0002000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("drop_down_list_name", "one_box_search");
        laneParams.plusAssign("item_num", Integer.valueOf(awS16S0002000_26.f959i0));
        laneParams.plusAssign("rank", Integer.valueOf(awS16S0002000_26.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS16S0002000_26 awS16S0002000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_num", Integer.valueOf(awS16S0002000_26.f959i0));
        laneParams.plusAssign("rank", Integer.valueOf(awS16S0002000_26.i1));
        laneParams.plusAssign("action_type", "click");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS16S0002000_26 awS16S0002000_26, Object obj) {
        return C1730740v8i.LIZ((C1730740v8i) obj, null, null, null, null, Integer.valueOf(awS16S0002000_26.f959i0), null, awS16S0002000_26.i1, null, null, 431);
    }

    public static final Object invoke$4(AwS16S0002000_26 awS16S0002000_26, Object obj) {
        return C1715450uk3.LIZ((C1715450uk3) obj, null, Integer.valueOf(awS16S0002000_26.f959i0), Integer.valueOf(awS16S0002000_26.i1), null, 57);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0002000_26(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f959i0 = i;
        this.i1 = i2;
    }
}
