package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C1032880cz8;
import X.C1032890cz9;
import X.C2188811AlT;
import X.C2274521E1a;
import X.C625790Ogb;
import X.InterfaceC1033130czX;
import X.InterfaceC1033150czZ;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS0S3101000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S3101000_16 awS0S3101000_16, Object obj) {
        C1032890cz9 c1032890cz9 = C1032890cz9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS0S3101000_16.s0);
        sbLIZ.append(" preload finish, cacheKey=");
        sbLIZ.append(awS0S3101000_16.s1);
        sbLIZ.append(",adId=");
        sbLIZ.append(awS0S3101000_16.s2);
        C2188811AlT.LIZIZ(sbLIZ);
        c1032890cz9.getClass();
        C625790Ogb.LIZ();
        String str = awS0S3101000_16.s0;
        C1032890cz9.LIZIZ(awS0S3101000_16.i4, (InterfaceC1033130czX) awS0S3101000_16.l3, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S3101000_16 awS0S3101000_16, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS0S3101000_16.s0);
        sbLIZ.append(" preload finish, cacheKey=");
        sbLIZ.append(awS0S3101000_16.s1);
        sbLIZ.append(",adId=");
        sbLIZ.append(awS0S3101000_16.s2);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = awS0S3101000_16.s0;
        C1032880cz8.LIZIZ(awS0S3101000_16.i4, (InterfaceC1033150czZ) awS0S3101000_16.l3, str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S3101000_16 awS0S3101000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2274521E1a.LIZ.getClass();
        c1023640ckE.withParam(C2274521E1a.LJJJJZI, awS0S3101000_16.s0);
        c1023640ckE.withParam(C2274521E1a.LIZIZ, awS0S3101000_16.s1);
        c1023640ckE.withParam(C2274521E1a.LJJJJLL, Long.valueOf(awS0S3101000_16.i4));
        c1023640ckE.withParam(C2274521E1a.LJJIFFI, awS0S3101000_16.s2);
        ((Function1) awS0S3101000_16.l3).invoke(c1023640ckE);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3101000_16(int i, String str, String str2, String str3, Function1 function1, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
        this.s2 = str3;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3101000_16(String str, String str2, String str3, InterfaceC1033130czX interfaceC1033130czX, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = interfaceC1033130czX;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3101000_16(String str, String str2, String str3, InterfaceC1033150czZ interfaceC1033150czZ, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = interfaceC1033150czZ;
        this.i4 = i;
    }
}
