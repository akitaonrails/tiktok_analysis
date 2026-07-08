package kotlin.jvm.internal;

import X.C005X;
import X.C07W7;
import X.C09AY;
import X.C1251350ifV;
import X.C1668880tWw;
import X.C2002707sv;
import X.C2016007v4;
import X.C291001Au;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS18S0010000_3 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0010000_3(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS18S0010000_3 awS18S0010000_3, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, null, false, false, null, null, null, null, new C291001Au(Boolean.valueOf(awS18S0010000_3.z0)), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, 31);
    }

    public static final Object invoke$1(AwS18S0010000_3 awS18S0010000_3, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, new C291001Au(Boolean.valueOf(awS18S0010000_3.z0)), false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 31);
    }

    public static final Object invoke$2(AwS18S0010000_3 awS18S0010000_3, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, null, false, false, null, null, null, null, null, null, null, new C291001Au(Boolean.valueOf(awS18S0010000_3.z0)), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 31);
    }

    public static final Object invoke$3(AwS18S0010000_3 awS18S0010000_3, Object obj) {
        boolean z = awS18S0010000_3.z0;
        obj.getClass();
        return new C005X(z);
    }

    public static final Object invoke$4(AwS18S0010000_3 awS18S0010000_3, Object obj) {
        boolean z = awS18S0010000_3.z0;
        obj.getClass();
        return new C2002707sv(z);
    }

    public static final Object invoke$5(AwS18S0010000_3 awS18S0010000_3, Object obj) {
        C2016007v4 c2016007v4 = (C2016007v4) obj;
        boolean z = awS18S0010000_3.z0;
        Function1<C07W7, Unit> function1 = c2016007v4.LLILLJJLI;
        C1668880tWw c1668880tWw = c2016007v4.LLILLL;
        Integer num = c2016007v4.LLILZ;
        String str = c2016007v4.LLILZIL;
        return new C2016007v4(c1668880tWw, c2016007v4.LLILZLL, num, str, c2016007v4.LLIZ, c2016007v4.LLJ, function1, c2016007v4.LLIZLLLIL, z);
    }
}
