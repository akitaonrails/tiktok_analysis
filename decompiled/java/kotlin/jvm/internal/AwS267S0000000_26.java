package kotlin.jvm.internal;

import X.C09AY;
import X.C1742800vSA;
import X.EnumC476430ImH;
import X.EnumC585200MxK;
import X.InterfaceC0148002o;
import X.InterfaceC1755830vnB;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.adapter.RegionAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS267S0000000_26 extends C09AY implements Function1 {
    public final int $t;

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
    public AwS267S0000000_26(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS267S0000000_26(RegionAdapter regionAdapter, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS267S0000000_26 awS267S0000000_26, Object obj) {
        return new RegionAdapter.IndicatorViewHolder((ViewGroup) obj);
    }

    public static final Object invoke$1(AwS267S0000000_26 awS267S0000000_26, Object obj) {
        ((InterfaceC1755830vnB) obj).R4();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS267S0000000_26 awS267S0000000_26, Object obj) {
        ((InterfaceC1755830vnB) obj).LJJLIIIJJIZ();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AwS267S0000000_26 awS267S0000000_26, Object obj) {
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0vSE] */
    public static final Object invoke$4(AwS267S0000000_26 awS267S0000000_26, Object obj) {
        return C1742800vSA.LIZ((C1742800vSA) obj, null, null, new InterfaceC0148002o() { // from class: X.0vSE
        }, null, 0, false, null, false, null, null, 1019);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS267S0000000_26(boolean z, int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS267S0000000_26(int i, EnumC476430ImH enumC476430ImH, EnumC585200MxK enumC585200MxK, int i2) {
        super(1);
        this.$t = i2;
    }
}
