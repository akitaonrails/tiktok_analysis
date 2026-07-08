package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS14S0600000_2 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS14S0600000_2 awS14S0600000_2) {
        String str;
        ThoughtInfo thoughtInfo = (ThoughtInfo) awS14S0600000_2.l0;
        if (thoughtInfo == null || (str = thoughtInfo.textContent) == null) {
            str = "";
        }
        ((Function1) awS14S0600000_2.l1).invoke(Integer.valueOf(str.length()));
        ((C05P0) awS14S0600000_2.l3).setValue(str);
        ((Function0) awS14S0600000_2.l2).invoke();
        ((C05P0) awS14S0600000_2.l4).setValue(Boolean.TRUE);
        ((C05P0) awS14S0600000_2.l5).setValue(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S0600000_2 awS14S0600000_2) {
        Object objInvoke;
        Object objInvoke2;
        Object obj = awS14S0600000_2.l1;
        Object value = ((Map.Entry) awS14S0600000_2.l2).getValue();
        if (obj instanceof String) {
            objInvoke = ((Function1) awS14S0600000_2.l3).invoke(obj);
        } else {
            objInvoke = obj;
        }
        if (value instanceof String) {
            objInvoke2 = ((Function1) awS14S0600000_2.l3).invoke(value);
        } else {
            objInvoke2 = value;
        }
        if (!Intrinsics.LJFF(obj, objInvoke)) {
            ((Iterator) awS14S0600000_2.l4).remove();
        }
        if (!Intrinsics.LJFF(obj, objInvoke) || !Intrinsics.LJFF(value, objInvoke2)) {
            ((List) awS14S0600000_2.l5).add(new Pair(objInvoke, objInvoke2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS14S0600000_2(ThoughtInfo thoughtInfo, ThoughtInfo thoughtInfo2, Function1<? super Integer, Unit> function1, Function0<Unit> function0, C05P0<String> c05p0, C05P0<Boolean> c05p02, C05P0<Boolean> c05p03) {
        super(0);
        this.$t = c05p03;
        this.l0 = thoughtInfo;
        this.l1 = thoughtInfo2;
        this.l2 = function1;
        this.l3 = function0;
        this.l4 = c05p0;
        this.l5 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0600000_2(Object obj, Object obj2, Map.Entry entry, AwS93S1200000_8 awS93S1200000_8, Iterator it2, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = entry;
        this.l3 = awS93S1200000_8;
        this.l4 = it2;
        this.l5 = list;
    }
}
