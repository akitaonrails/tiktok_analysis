package kotlin.jvm.internal;

import X.C09AY;
import X.C0M0P;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS5S2201000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AwS5S2201000_8 awS5S2201000_8) {
        ((DraftBoxFragment) awS5S2201000_8.l2).NR(awS5S2201000_8.i4, (C0M0P) awS5S2201000_8.l3, awS5S2201000_8.s0, awS5S2201000_8.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S2201000_8 awS5S2201000_8) {
        ((DraftBoxFragment) awS5S2201000_8.l2).NR(awS5S2201000_8.i4, (C0M0P) awS5S2201000_8.l3, awS5S2201000_8.s0, awS5S2201000_8.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S2201000_8(DraftBoxFragment draftBoxFragment, int i, C0M0P c0m0p, String str, String str2, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = draftBoxFragment;
        this.i4 = i;
        this.l3 = c0m0p;
        this.s0 = str;
        this.s1 = str2;
    }
}
