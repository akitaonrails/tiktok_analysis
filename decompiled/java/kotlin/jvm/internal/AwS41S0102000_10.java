package kotlin.jvm.internal;

import X.C09AY;
import X.C651650PhD;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes11.dex */
public class AwS41S0102000_10 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final Object invoke$0(AwS41S0102000_10 awS41S0102000_10) {
        int i = awS41S0102000_10.i1 - awS41S0102000_10.i2;
        int i2 = i - 2;
        if (i2 >= 0 && Intrinsics.LJFF(((StringBuilder) awS41S0102000_10.l0).substring(i2, i), "\n\n")) {
            ((StringBuilder) awS41S0102000_10.l0).replace(i2, i, "");
        } else {
            int i3 = i - 1;
            if (i3 >= 0 && Intrinsics.LJFF(((StringBuilder) awS41S0102000_10.l0).substring(i3, i), "\n")) {
                ((StringBuilder) awS41S0102000_10.l0).replace(i3, i, "");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S0102000_10 awS41S0102000_10) {
        C651650PhD.LJFF.remove(Integer.valueOf(awS41S0102000_10.i1));
        C651650PhD.LIZLLL.remove(Integer.valueOf(awS41S0102000_10.i2));
        EventBus.LIZLLL().LJJI((C651650PhD) awS41S0102000_10.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0102000_10(int i, int i2, C651650PhD c651650PhD, int i3) {
        super(0);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = c651650PhD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S0102000_10(int i, int i2, StringBuilder sb, int i3) {
        super(0);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = sb;
    }
}
