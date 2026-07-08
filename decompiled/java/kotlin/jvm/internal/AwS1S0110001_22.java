package kotlin.jvm.internal;

import X.C09AY;
import X.C1419590n2r;
import X.C1422810n83;
import X.C1424470nAj;
import X.C443120HZe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS1S0110001_22 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public Object l0;
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

    public static final Object invoke$0(AwS1S0110001_22 awS1S0110001_22, Object obj) {
        return C1422810n83.LIZ((C1422810n83) obj, null, null, new C443120HZe(Boolean.valueOf(awS1S0110001_22.z1), (C1419590n2r) awS1S0110001_22.l0, Float.valueOf(awS1S0110001_22.f2)), null, null, 111);
    }

    public static final Object invoke$1(AwS1S0110001_22 awS1S0110001_22, Object obj) {
        return C1424470nAj.LIZ((C1424470nAj) obj, 0, 0, null, null, null, null, null, null, new C443120HZe(Boolean.valueOf(awS1S0110001_22.z1), (C1419590n2r) awS1S0110001_22.l0, Float.valueOf(awS1S0110001_22.f2)), null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0110001_22(boolean z, C1419590n2r c1419590n2r, float f, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1419590n2r;
        this.f2 = f;
    }
}
