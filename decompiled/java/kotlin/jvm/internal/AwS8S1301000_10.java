package kotlin.jvm.internal;

import X.C09AY;
import X.C13BV;
import X.C665760Q9m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS8S1301000_10 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S1301000_10 awS8S1301000_10, Object obj) {
        C665760Q9m c665760Q9m = (C665760Q9m) obj;
        Map<String, List<Map<?, ?>>> map = c665760Q9m.LLILLJJLI;
        map.put(awS8S1301000_10.s0, (List) awS8S1301000_10.l1);
        Map<String, List<Aweme>> map2 = c665760Q9m.LLILLL;
        map2.put(awS8S1301000_10.s0, (List) awS8S1301000_10.l2);
        Map<String, Integer> map3 = c665760Q9m.LLILZ;
        Integer num = (Integer) awS8S1301000_10.l3;
        String str = awS8S1301000_10.s0;
        if (num != null) {
            map3.put(str, Integer.valueOf(num.intValue()));
        }
        Map<String, Integer> map4 = c665760Q9m.LLILZIL;
        map4.put(awS8S1301000_10.s0, Integer.valueOf(awS8S1301000_10.i4));
        return C665760Q9m.LIZ(c665760Q9m, null, map, map2, map3, map4, 1);
    }

    public static final Object invoke$1(AwS8S1301000_10 awS8S1301000_10, Object obj) {
        C665760Q9m c665760Q9m = (C665760Q9m) obj;
        Map<String, List<Map<?, ?>>> map = c665760Q9m.LLILLJJLI;
        String str = awS8S1301000_10.s0;
        List list = (List) awS8S1301000_10.l1;
        List<Map<?, ?>> list2 = map.get(str);
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(list2);
        arrayList.addAll(list);
        map.put(str, arrayList);
        Map<String, List<Aweme>> map2 = c665760Q9m.LLILLL;
        String str2 = awS8S1301000_10.s0;
        List list3 = (List) awS8S1301000_10.l2;
        List<Aweme> list4 = map2.get(str2);
        if (list4 == null) {
            list4 = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(list4);
        arrayList2.addAll(list3);
        map2.put(str2, arrayList2);
        Map<String, Integer> map3 = c665760Q9m.LLILZ;
        Integer num = (Integer) awS8S1301000_10.l3;
        String str3 = awS8S1301000_10.s0;
        if (num != null) {
            map3.put(str3, Integer.valueOf(num.intValue()));
        }
        Map<String, Integer> map4 = c665760Q9m.LLILZIL;
        map4.put(awS8S1301000_10.s0, Integer.valueOf(awS8S1301000_10.i4));
        return C665760Q9m.LIZ(c665760Q9m, null, map, map2, map3, map4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1301000_10(String str, List list, C13BV c13bv, Integer num, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = list;
        this.l2 = c13bv;
        this.l3 = num;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S1301000_10(String str, String str2, List<? extends Map<?, ?>> list, List<? extends Aweme> list2, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = list;
        this.l3 = list2;
        this.i4 = num;
    }
}
