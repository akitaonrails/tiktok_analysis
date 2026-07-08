package kotlin.jvm.internal;

import X.C09AY;
import X.C108F;
import X.C108I;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS8S0020000_28 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;

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

    public static final Object invoke$0(AwS8S0020000_28 awS8S0020000_28, Object obj) {
        C108F c108f = C108F.LIZ;
        C108I c108i = C108I.LLILZ;
        boolean z = awS8S0020000_28.z0;
        boolean z2 = awS8S0020000_28.z1;
        c108f.getClass();
        C108F.LIZJ(c108i, z, z2, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S0020000_28 awS8S0020000_28, Object obj) {
        C108F c108f = C108F.LIZ;
        C108I c108i = C108I.LLILZIL;
        boolean z = awS8S0020000_28.z0;
        boolean z2 = awS8S0020000_28.z1;
        c108f.getClass();
        C108F.LIZJ(c108i, z, z2, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0020000_28(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
