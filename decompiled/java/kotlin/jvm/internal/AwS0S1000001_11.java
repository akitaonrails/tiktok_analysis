package kotlin.jvm.internal;

import X.C09AY;
import X.C0RFV;
import X.C291001Au;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS0S1000001_11 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public String s0;

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

    public static final Object invoke$0(AwS0S1000001_11 awS0S1000001_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new Pair(awS0S1000001_11.s0, Float.valueOf(awS0S1000001_11.f1))), null, 402653183);
    }

    public static final Object invoke$1(AwS0S1000001_11 awS0S1000001_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new Pair(awS0S1000001_11.s0, Float.valueOf(awS0S1000001_11.f1))), null, null, 469762047);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1000001_11(String str, float f, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.f1 = f;
    }
}
