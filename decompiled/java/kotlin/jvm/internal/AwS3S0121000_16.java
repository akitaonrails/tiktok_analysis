package kotlin.jvm.internal;

import X.C09AY;
import X.C1072730e1P;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS3S0121000_16 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public boolean z1;
    public boolean z2;

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

    public static final Object invoke$0(AwS3S0121000_16 awS3S0121000_16) {
        String str;
        C1072730e1P c1072730e1P = (C1072730e1P) awS3S0121000_16.l0;
        if (awS3S0121000_16.z1) {
            str = "fb_sign_up";
        } else {
            str = "fb_login";
        }
        c1072730e1P.LJII(str, 1, new AwS15S0111000_16(c1072730e1P, awS3S0121000_16.i3, awS3S0121000_16.z2, 0), new AwS15S0111000_16((C1072730e1P) awS3S0121000_16.l0, awS3S0121000_16.i3, awS3S0121000_16.z2, 1), new AwS15S0111000_16((C1072730e1P) awS3S0121000_16.l0, awS3S0121000_16.i3, awS3S0121000_16.z2, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0121000_16 awS3S0121000_16) {
        String str;
        C1072730e1P c1072730e1P = (C1072730e1P) awS3S0121000_16.l0;
        if (awS3S0121000_16.z1) {
            str = "fb_sign_up";
        } else {
            str = "fb_login";
        }
        c1072730e1P.LJII(str, 1, new AwS15S0111000_16(c1072730e1P, awS3S0121000_16.i3, awS3S0121000_16.z2, 3), new AwS15S0111000_16((C1072730e1P) awS3S0121000_16.l0, awS3S0121000_16.i3, awS3S0121000_16.z2, 4), new AwS15S0111000_16((C1072730e1P) awS3S0121000_16.l0, awS3S0121000_16.i3, awS3S0121000_16.z2, 5));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0121000_16(C1072730e1P c1072730e1P, boolean z, int i, boolean z2, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1072730e1P;
        this.z1 = z;
        this.i3 = i;
        this.z2 = z2;
    }
}
