package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C856020Xi4;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS116S1000000_32 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return this.s0;
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$1(AwS116S1000000_32 awS116S1000000_32) {
        C856020Xi4 c856020Xi4 = new C856020Xi4();
        c856020Xi4.LIZ.put("last_class", awS116S1000000_32.s0);
        return c856020Xi4;
    }

    public static final Object invoke$2(AwS116S1000000_32 awS116S1000000_32) {
        C856020Xi4 c856020Xi4 = new C856020Xi4();
        c856020Xi4.LIZ.put("last_class", awS116S1000000_32.s0);
        return c856020Xi4;
    }

    public static final Object invoke$3(AwS116S1000000_32 awS116S1000000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChainRecordCallback btm=");
        sbLIZ.append(awS116S1000000_32.s0);
        sbLIZ.append(" error");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1000000_32(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
