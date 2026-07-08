package kotlin.jvm.internal;

import X.AbstractC1569120qw2;
import X.C09AY;
import X.C1569070qvx;
import X.C1569080qvy;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS62S2100000_24 extends C09AY implements Function0 {
    public final int $t;
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

    public static final Object invoke$0(AwS62S2100000_24 awS62S2100000_24) {
        Object next;
        C1569070qvx c1569070qvx = C1569070qvx.LIZ;
        AbstractC1569120qw2 abstractC1569120qw2 = (AbstractC1569120qw2) awS62S2100000_24.l2;
        String str = awS62S2100000_24.s1;
        c1569070qvx.getClass();
        C1569070qvx.LJIIIIZZ(abstractC1569120qw2, str);
        Map<AbstractC1569120qw2, List<C1569080qvy>> map = C1569070qvx.LJFF;
        Object arrayList = ((LinkedHashMap) map).get((AbstractC1569120qw2) awS62S2100000_24.l2);
        if (arrayList == null) {
            AbstractC1569120qw2 abstractC1569120qw22 = (AbstractC1569120qw2) awS62S2100000_24.l2;
            arrayList = new ArrayList();
            map.put(abstractC1569120qw22, (List<C1569080qvy>) arrayList);
        }
        List list = (List) arrayList;
        String str2 = awS62S2100000_24.s1;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C1569080qvy) next).LIZ, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1569080qvy c1569080qvy = (C1569080qvy) next;
        if (c1569080qvy == null) {
            c1569080qvy = new C1569080qvy(awS62S2100000_24.s1, System.currentTimeMillis());
            list.add(c1569080qvy);
        }
        c1569080qvy.LIZLLL.add(awS62S2100000_24.s0);
        C1569070qvx.LJI.put((AbstractC1569120qw2) awS62S2100000_24.l2, awS62S2100000_24.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS62S2100000_24 awS62S2100000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS62S2100000_24.s0);
        sbLIZ.append('[');
        sbLIZ.append(awS62S2100000_24.s1);
        sbLIZ.append("]: ");
        sbLIZ.append((Map) awS62S2100000_24.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S2100000_24(AbstractC1569120qw2 abstractC1569120qw2, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = abstractC1569120qw2;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S2100000_24(String str, String str2, String str3, Map<String, Object> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }
}
