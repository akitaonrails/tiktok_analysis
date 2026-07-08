package kotlin.jvm.internal;

import X.C09AY;
import X.C1683080ttq;
import X.C1689580u4K;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS32S1201000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AwS32S1201000_19 awS32S1201000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1683080ttq.LJIIIZ((Context) awS32S1201000_19.l1, awS32S1201000_19.s0, (Function0) awS32S1201000_19.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS32S1201000_19.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S1201000_19 awS32S1201000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689580u4K.LIZIZ((Context) awS32S1201000_19.l1, awS32S1201000_19.s0, (Function0) awS32S1201000_19.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS32S1201000_19.i3 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S1201000_19(int i, Context context, String str, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = context;
        this.s0 = str;
        this.l2 = function0;
        this.i3 = i;
    }
}
