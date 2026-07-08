package kotlin.jvm.internal;

import X.C09AY;
import X.C1744320vUc;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS28S0202000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS28S0202000_26 awS28S0202000_26, Object obj) {
        int size;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_num", Integer.valueOf(awS28S0202000_26.i2));
        laneParams.plusAssign("rank", Integer.valueOf(awS28S0202000_26.i3));
        laneParams.plusAssign("action_type", "click");
        laneParams.plusAssign("drop_down_list_area", ((DistrictFragment) awS28S0202000_26.l0).mS().LLJJI);
        List<District> list = ((District) ((C1744320vUc) awS28S0202000_26.l1).LIZ).parRegions;
        if (list != null) {
            size = list.size() + 1;
        } else {
            size = 0;
        }
        laneParams.plusAssign("max_region_level", Integer.valueOf(size));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS28S0202000_26 awS28S0202000_26, Object obj) {
        int size;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_num", Integer.valueOf(awS28S0202000_26.i2));
        laneParams.plusAssign("rank", Integer.valueOf(awS28S0202000_26.i3 + 1));
        laneParams.plusAssign("action_type", "click");
        laneParams.plusAssign("drop_down_list_area", ((DistrictFragment) awS28S0202000_26.l0).mS().LLJJI);
        List<District> list = ((District) ((C1744320vUc) awS28S0202000_26.l1).LIZ).parRegions;
        if (list != null) {
            size = list.size() + 1;
        } else {
            size = 0;
        }
        laneParams.plusAssign("max_region_level", Integer.valueOf(size));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S0202000_26(int i, int i2, int i3, DistrictFragment districtFragment, C1744320vUc<District> c1744320vUc) {
        super(1);
        this.$t = c1744320vUc;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = i3;
        this.l1 = districtFragment;
    }
}
