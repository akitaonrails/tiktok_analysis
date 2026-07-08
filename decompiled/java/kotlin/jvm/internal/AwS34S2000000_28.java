package kotlin.jvm.internal;

import X.C09AY;
import X.C106R;
import X.C1163504gr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS34S2000000_28 extends C09AY implements Function0 {
    public final int $t;
    public String s0;
    public String s1 = "settings";

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS34S2000000_28 awS34S2000000_28) {
        if (Intrinsics.LJFF(awS34S2000000_28.s0, awS34S2000000_28.s1)) {
            C106R.LIZ.getClass();
            C1163504gr.LIZIZ.onEventV3("privacy_center_enter", C106R.LIZIZ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS34S2000000_28 awS34S2000000_28) {
        if (Intrinsics.LJFF(awS34S2000000_28.s0, awS34S2000000_28.s1)) {
            C106R.LIZ.getClass();
            C1163504gr.LIZIZ.onEventV3("privacy_center_enter", C106R.LIZIZ());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S2000000_28(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
