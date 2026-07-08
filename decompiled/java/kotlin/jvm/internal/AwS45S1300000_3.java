package kotlin.jvm.internal;

import X.C087J;
import X.C09AY;
import X.C15438062q;
import X.C1553800qXK;
import X.C19423210ys;
import X.C201955140j;
import X.C2097908Jt;
import X.C443120HZe;
import X.C7740030o;
import X.InterfaceC2032907xn;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mix.base.InterfacePreloadData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class AwS45S1300000_3 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS45S1300000_3 awS45S1300000_3, Object obj) {
        if (obj != null) {
            ((C1553800qXK) awS45S1300000_3.l1).LIZ.put(awS45S1300000_3.s0, obj);
            Function2 function2 = (Function2) awS45S1300000_3.l2;
            if (function2 != null) {
                function2.invoke(((InterfacePreloadData) awS45S1300000_3.l3).path, obj);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S1300000_3 awS45S1300000_3, Object obj) {
        if (obj != null) {
            ((C1553800qXK) awS45S1300000_3.l1).LIZ.put(awS45S1300000_3.s0, obj);
            Function2 function2 = (Function2) awS45S1300000_3.l2;
            if (function2 != null) {
                function2.invoke(((InterfacePreloadData) awS45S1300000_3.l3).path, obj);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS45S1300000_3 awS45S1300000_3, Object obj) {
        if (obj != null) {
            ((C1553800qXK) awS45S1300000_3.l1).LIZ.put(awS45S1300000_3.s0, obj);
            Function2 function2 = (Function2) awS45S1300000_3.l2;
            if (function2 != null) {
                function2.invoke(((InterfacePreloadData) awS45S1300000_3.l3).path, obj);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS45S1300000_3 awS45S1300000_3, Object obj) {
        long j;
        String unzipPath;
        List<Effect> list = (List) obj;
        C201955140j.LIZIZ("JEFF", "Effects downloaded");
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        int i = 16;
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Effect effect : list) {
            linkedHashMap.put(effect.getEffectId(), effect);
        }
        List list2 = (List) awS45S1300000_3.l1;
        Map map = (Map) awS45S1300000_3.l3;
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ2 >= 16) {
            i = iLIZIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (Object obj2 : list2) {
            Effect effect2 = (Effect) linkedHashMap.get(map.get(obj2));
            if (effect2 != null) {
                unzipPath = effect2.getUnzipPath();
            } else {
                unzipPath = null;
            }
            linkedHashMap2.put(obj2, unzipPath);
        }
        String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), linkedHashMap2);
        json.toString();
        if (Intrinsics.LJFF(awS45S1300000_3.s0, "model")) {
            C087J c087j = (C087J) awS45S1300000_3.l2;
            for (Effect effect3 : list) {
                InterfaceC2032907xn interfaceC2032907xn = c087j.LLILLJJLI;
                C443120HZe<Integer, Long, Long> c443120HZe = C087J.LLIZ;
                interfaceC2032907xn.LIZ(c443120HZe.getFirst().intValue(), c443120HZe.getSecond().longValue(), c443120HZe.getThird().longValue(), effect3.getUnzipPath());
            }
        } else {
            InterfaceC2032907xn interfaceC2032907xn2 = ((C087J) awS45S1300000_3.l2).LLILLJJLI;
            Pair<Integer, Long> pair = C087J.LLIZLLLIL;
            int iIntValue = pair.getFirst().intValue();
            long jLongValue = pair.getSecond().longValue();
            C19423210ys.LIZ.getClass();
            if (C19423210ys.LIZJ) {
                j = 1;
            } else {
                j = 0;
            }
            interfaceC2032907xn2.LIZ(iIntValue, jLongValue, j, json);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S1300000_3(C1553800qXK c1553800qXK, C1553800qXK c1553800qXK2, String str, Function2<? super String, ? super n, Unit> function2, InterfacePreloadData interfacePreloadData) {
        super(1);
        this.$t = interfacePreloadData;
        this.l1 = c1553800qXK;
        this.s0 = c1553800qXK2;
        this.l2 = str;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS45S1300000_3(List list, List<String> list2, String str, C087J c087j, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = list;
        this.s0 = list2;
        this.l2 = str;
        this.l3 = c087j;
    }
}
