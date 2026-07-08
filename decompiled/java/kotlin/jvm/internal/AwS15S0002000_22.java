package kotlin.jvm.internal;

import X.C09AY;
import X.C21665519qf;
import X.C375830EoP;
import com.bytedance.ies.cutsame.util.Size;
import iyl.i3;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS15S0002000_22 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f957i0;
    public int i1;

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

    public static final Object invoke$0(AwS15S0002000_22 awS15S0002000_22, Object obj) {
        return C21665519qf.LIZ((C21665519qf) obj, null, null, new Size(awS15S0002000_22.f957i0, awS15S0002000_22.i1), null, null, null, null, 1019);
    }

    public static final Object invoke$1(AwS15S0002000_22 awS15S0002000_22, Object obj) {
        int i = awS15S0002000_22.f957i0;
        int i2 = awS15S0002000_22.i1;
        Boolean bool = Boolean.TRUE;
        return i3.LJIIIZ((i3) obj, i, i2, 0, null, 0, false, false, false, false, false, null, null, 0, new C375830EoP(new Pair(bool, bool)), null, null, false, null, false, 0.0f, null, 268369916);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0002000_22(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f957i0 = i;
        this.i1 = i2;
    }
}
