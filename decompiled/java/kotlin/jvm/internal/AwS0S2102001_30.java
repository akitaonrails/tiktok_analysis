package kotlin.jvm.internal;

import X.AbstractC20187113yn;
import X.C09AY;
import X.EnumC1782200wTi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS0S2102001_30 extends C09AY implements Function0 {
    public final int $t;
    public float f5;
    public int i3;
    public int i4;
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

    public static final Object invoke$0(AwS0S2102001_30 awS0S2102001_30) {
        if (awS0S2102001_30.i3 == EnumC1782200wTi.DOWNLOAD_INFO_READ_TIMEOUT.ordinal()) {
            ((AbstractC20187113yn) awS0S2102001_30.l2).LJ(awS0S2102001_30.s0, awS0S2102001_30.i3, awS0S2102001_30.i4, awS0S2102001_30.f5, awS0S2102001_30.s1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2102001_30 awS0S2102001_30) {
        AbstractC20187113yn abstractC20187113yn;
        if (awS0S2102001_30.i3 == EnumC1782200wTi.DOWNLOAD_INFO_READ_TIMEOUT.ordinal() && (abstractC20187113yn = (AbstractC20187113yn) awS0S2102001_30.l2) != null) {
            abstractC20187113yn.LJ(awS0S2102001_30.s0, awS0S2102001_30.i3, awS0S2102001_30.i4, awS0S2102001_30.f5, awS0S2102001_30.s1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2102001_30(int i, AbstractC20187113yn abstractC20187113yn, String str, int i2, float f, String str2, int i3) {
        super(0);
        this.$t = i3;
        this.i3 = i;
        this.l2 = abstractC20187113yn;
        this.s0 = str;
        this.i4 = i2;
        this.f5 = f;
        this.s1 = str2;
    }
}
