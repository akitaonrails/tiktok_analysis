package kotlin.jvm.internal;

import X.C09AY;
import X.C1A3K;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes34.dex */
public class AwS127S0201000_33 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS127S0201000_33 awS127S0201000_33, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((TakoSharePreviewAssem) awS127S0201000_33.l0).Co((C1A3K) awS127S0201000_33.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS127S0201000_33.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS127S0201000_33 awS127S0201000_33, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((TakoSharePreviewAssem) awS127S0201000_33.l0).Co((C1A3K) awS127S0201000_33.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS127S0201000_33.i2 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S0201000_33(TakoSharePreviewAssem takoSharePreviewAssem, C1A3K c1a3k, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = takoSharePreviewAssem;
        this.l1 = c1a3k;
        this.i2 = i;
    }
}
