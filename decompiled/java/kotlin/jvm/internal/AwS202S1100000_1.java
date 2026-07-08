package kotlin.jvm.internal;

import X.C03E7;
import X.C09AY;
import X.C10508049a;
import X.C1748720vbi;
import X.InterfaceC1631620sYq;
import android.os.SystemClock;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public class AwS202S1100000_1 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS202S1100000_1(String str, HashMap map, int i) {
        super(3);
        this.$t = i;
        this.l1 = map;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS202S1100000_1 awS202S1100000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        C03E7 c03e7 = C03E7.LIZ;
        HashMap map = (HashMap) awS202S1100000_1.l1;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
        String str = awS202S1100000_1.s0;
        c03e7.getClass();
        C1748720vbi.LIZJ(str, new C10508049a(), new AwS18S1100100_1(jElapsedRealtime, (String) obj3, map, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS202S1100000_1 awS202S1100000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        C03E7 c03e7 = C03E7.LIZ;
        HashMap map = (HashMap) awS202S1100000_1.l1;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
        String str = awS202S1100000_1.s0;
        c03e7.getClass();
        C1748720vbi.LIZJ(str, new C10508049a(), new AwS18S1100100_1(jElapsedRealtime, (String) obj3, map, 3));
        return Unit.LIZ;
    }
}
