package kotlin.jvm.internal;

import X.C09AY;
import X.C1189060h32;
import X.C1196140hES;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS6S2110000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S2110000_18 awS6S2110000_18, Object obj) {
        int iLongValue;
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(awS6S2110000_18.z3)), "is_success");
        Long l = (Long) awS6S2110000_18.l2;
        if (l != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = -1;
        }
        c1196140hES.LJII(iLongValue, "duration");
        String str = awS6S2110000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1196140hES.LJIIIIZZ("creation_id", str);
        String str3 = awS6S2110000_18.s1;
        if (str3 != null) {
            str2 = str3;
        }
        c1196140hES.LJ("content_type", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S2110000_18 awS6S2110000_18, Object obj) {
        int iIntValue;
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(awS6S2110000_18.z3)), "is_success");
        Integer num = (Integer) awS6S2110000_18.l2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c1196140hES.LJII(iIntValue, "duration");
        String str = awS6S2110000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1196140hES.LJIIIIZZ("creation_id", str);
        String str3 = awS6S2110000_18.s1;
        if (str3 != null) {
            str2 = str3;
        }
        c1196140hES.LJ("content_type", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S2110000_18 awS6S2110000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(awS6S2110000_18.z3 ? 1 : 0, "load lynx status");
        Integer num = (Integer) awS6S2110000_18.l2;
        if (num != null) {
            c1196140hES.LIZIZ(num.intValue(), "lynx error code");
        }
        String str = awS6S2110000_18.s0;
        if (str != null) {
            c1196140hES.LJ("url", str);
        }
        String str2 = awS6S2110000_18.s1;
        if (str2 != null) {
            c1196140hES.LJFF("reason", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS6S2110000_18 awS6S2110000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(awS6S2110000_18.z3 ? 1 : 0, "load lynx status");
        Integer num = (Integer) awS6S2110000_18.l2;
        if (num != null) {
            c1196140hES.LIZIZ(num.intValue(), "lynx error code");
        }
        String str = awS6S2110000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1196140hES.LJ("url", str);
        String str3 = awS6S2110000_18.s1;
        if (str3 != null) {
            str2 = str3;
        }
        c1196140hES.LJFF("reason", str2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2110000_18(String str, Long l, boolean z, String str2, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l2 = l;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2110000_18(boolean z, Integer num, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l2 = num;
        this.s0 = str;
        this.s1 = str2;
    }
}
