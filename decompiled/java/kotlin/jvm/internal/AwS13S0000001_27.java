package kotlin.jvm.internal;

import X.C09AY;
import X.C1855260yNY;
import X.C291001Au;
import X.EnumC1855280yNa;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS13S0000001_27 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0000001_27(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS13S0000001_27 awS13S0000001_27, Object obj) {
        EnumC1855280yNa enumC1855280yNa;
        C1855260yNY c1855260yNY = (C1855260yNY) obj;
        if (awS13S0000001_27.f0 > 0.2d) {
            enumC1855280yNa = EnumC1855280yNa.HIGH_VOLUME;
        } else {
            enumC1855280yNa = EnumC1855280yNa.LOW_VOLUME;
        }
        return C1855260yNY.LIZ(c1855260yNY, false, false, null, null, null, enumC1855280yNa, null, 95);
    }

    public static final Object invoke$1(AwS13S0000001_27 awS13S0000001_27, Object obj) {
        return C1855260yNY.LIZ((C1855260yNY) obj, false, false, null, null, null, null, new C291001Au(Float.valueOf(awS13S0000001_27.f0)), 63);
    }
}
