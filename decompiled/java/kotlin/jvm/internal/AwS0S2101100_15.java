package kotlin.jvm.internal;

import X.C09AY;
import X.C919390a25;
import X.C921520a5W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS0S2101100_15 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public long j4;
    public Object l2;
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

    public static final Object invoke$0(AwS0S2101100_15 awS0S2101100_15) {
        C921520a5W.LJLILLLLZI((C921520a5W) awS0S2101100_15.l2, awS0S2101100_15.j4, awS0S2101100_15.s0, awS0S2101100_15.i3, awS0S2101100_15.s1, Boolean.TRUE, null, null, null, null, null, 992);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2101100_15 awS0S2101100_15) {
        ((C919390a25) awS0S2101100_15.l2).LJJJLIIL(awS0S2101100_15.j4, awS0S2101100_15.s0, awS0S2101100_15.i3, awS0S2101100_15.s1, Boolean.TRUE, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2101100_15(C919390a25 c919390a25, long j, String str, int i, String str2, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = c919390a25;
        this.j4 = j;
        this.s0 = str;
        this.i3 = i;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2101100_15(C921520a5W c921520a5W, long j, String str, int i, String str2, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = c921520a5W;
        this.j4 = j;
        this.s0 = str;
        this.i3 = i;
        this.s1 = str2;
    }
}
