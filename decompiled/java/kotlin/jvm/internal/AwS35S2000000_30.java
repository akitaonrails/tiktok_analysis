package kotlin.jvm.internal;

import X.C09AY;
import X.C13SB;
import X.C2225308nj;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS35S2000000_30 extends C09AY implements Function0 {
    public final int $t;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS35S2000000_30 awS35S2000000_30) {
        C13SB.LJIIZILJ(awS35S2000000_30.s0);
        C13SB.LJIIZILJ(awS35S2000000_30.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS35S2000000_30 awS35S2000000_30) throws C2225308nj, IOException {
        C13SB.LJJI(awS35S2000000_30.s0, awS35S2000000_30.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S2000000_30(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
