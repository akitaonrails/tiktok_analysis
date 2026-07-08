package kotlin.jvm.internal;

import X.C09AY;
import X.C390640FTi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS0S0004000_32 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f950i0;
    public int i1;
    public int i2;
    public int i3;

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

    public static final Object invoke$0(AwS0S0004000_32 awS0S0004000_32, Object obj) {
        return C390640FTi.LIZ((C390640FTi) obj, null, null, null, null, null, awS0S0004000_32.f950i0, awS0S0004000_32.i1, awS0S0004000_32.i2, awS0S0004000_32.i3, 543);
    }

    public static final Object invoke$1(AwS0S0004000_32 awS0S0004000_32, Object obj) {
        return C390640FTi.LIZ((C390640FTi) obj, null, null, null, null, null, awS0S0004000_32.f950i0, awS0S0004000_32.i1, awS0S0004000_32.i2, awS0S0004000_32.i3, 543);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0004000_32(int i, int i2, int i3, int i4, int i5) {
        super(1);
        this.$t = i5;
        this.f950i0 = i;
        this.i1 = i2;
        this.i2 = i3;
        this.i3 = i4;
    }
}
