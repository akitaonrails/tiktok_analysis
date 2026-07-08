package kotlin.jvm.internal;

import X.C09AY;
import X.C1306060k5k;
import X.C1306950k7B;
import X.C1306960k7C;
import X.C1307030k7J;
import com.bytedance.android.starship.wrapper.StarshipWrapper;
import com.bytedance.android.starship.wrapper.StarshipWrapper2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class AwS35S0000100_20 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S0000100_20(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS35S0000100_20 awS35S0000100_20, Object obj) {
        C1306060k5k c1306060k5k = (C1306060k5k) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", c1306060k5k.LIZ);
        linkedHashMap.put("extra", c1306060k5k.LIZJ);
        linkedHashMap.put("error", c1306060k5k.LIZIZ);
        C1306950k7B c1306950k7B = StarshipWrapper.Companion;
        long j = awS35S0000100_20.j0;
        c1306950k7B.getClass();
        StarshipWrapper.onStrategyResult(j, linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS35S0000100_20 awS35S0000100_20, Object obj) {
        C1306060k5k c1306060k5k = (C1306060k5k) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", c1306060k5k.LIZ);
        linkedHashMap.put("extra", c1306060k5k.LIZJ);
        linkedHashMap.put("error", c1306060k5k.LIZIZ);
        C1306950k7B c1306950k7B = StarshipWrapper.Companion;
        long j = awS35S0000100_20.j0;
        c1306950k7B.getClass();
        StarshipWrapper.onRunStrategyResult(j, linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS35S0000100_20 awS35S0000100_20, Object obj) {
        C1306060k5k c1306060k5k = (C1306060k5k) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", c1306060k5k.LIZ);
        linkedHashMap.put("extra", c1306060k5k.LIZJ);
        linkedHashMap.put("error", c1306060k5k.LIZIZ);
        C1306960k7C c1306960k7C = StarshipWrapper2.Companion;
        long j = awS35S0000100_20.j0;
        c1306960k7C.getClass();
        StarshipWrapper2.onStrategyResult(j, linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS35S0000100_20 awS35S0000100_20, Object obj) {
        C1306060k5k c1306060k5k = (C1306060k5k) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", c1306060k5k.LIZ);
        linkedHashMap.put("extra", c1306060k5k.LIZJ);
        linkedHashMap.put("error", c1306060k5k.LIZIZ);
        C1306960k7C c1306960k7C = StarshipWrapper2.Companion;
        long j = awS35S0000100_20.j0;
        c1306960k7C.getClass();
        StarshipWrapper2.onRunStrategyResult(j, linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS35S0000100_20 awS35S0000100_20, Object obj) {
        C1307030k7J c1307030k7J = (C1307030k7J) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isSuccess", Boolean.valueOf(c1307030k7J.LIZ));
        linkedHashMap.put("errorMsg", c1307030k7J.LIZIZ);
        linkedHashMap.put("errorCode", Integer.valueOf(c1307030k7J.LIZJ));
        C1306960k7C c1306960k7C = StarshipWrapper2.Companion;
        long j = awS35S0000100_20.j0;
        c1306960k7C.getClass();
        StarshipWrapper2.onUpdateStrategiesConfig(j, linkedHashMap);
        return Unit.LIZ;
    }
}
