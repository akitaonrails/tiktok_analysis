package kotlin.jvm.internal;

import X.C09AY;
import X.C341440Da2;
import X.InterfaceC1665500tRU;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS10S0211000_8 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S0211000_8 awS10S0211000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AIPortraitTabFragment) awS10S0211000_8.l0).MR((InterfaceC1665500tRU) awS10S0211000_8.l1, awS10S0211000_8.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS10S0211000_8.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S0211000_8 awS10S0211000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((AIPortraitTabFragment) awS10S0211000_8.l0).NR((InterfaceC1665500tRU) awS10S0211000_8.l1, awS10S0211000_8.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS10S0211000_8.i3 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S0211000_8(AIPortraitTabFragment aIPortraitTabFragment, AIPortraitTabFragment aIPortraitTabFragment2, InterfaceC1665500tRU<PortraitStyleItem> interfaceC1665500tRU, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = aIPortraitTabFragment;
        this.l1 = aIPortraitTabFragment2;
        this.z2 = interfaceC1665500tRU;
        this.i3 = z ? 1 : 0;
    }
}
