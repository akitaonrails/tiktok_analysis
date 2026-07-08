package kotlin.jvm.internal;

import X.AbstractC316870CbV;
import X.C09AY;
import X.C1165310gQj;
import X.C1167940gUy;
import X.C1177210gjv;
import X.C1178140glQ;
import X.C1178200glW;
import X.C15438062q;
import X.C189200o6;
import X.C2205251BSp;
import X.C23260099m;
import X.C316640Cb8;
import X.C317290CcB;
import X.C323380Cm0;
import X.InterfaceC1177040gje;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public class AwS483S0200000_18 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS483S0200000_18(C1165310gQj c1165310gQj, C23260099m c23260099m, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1165310gQj;
        this.l1 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS483S0200000_18(C1178140glQ c1178140glQ, C1177210gjv c1177210gjv, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1178140glQ;
        this.l1 = c1177210gjv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS483S0200000_18(C1178140glQ c1178140glQ, C1178200glW c1178200glW, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1178140glQ;
        this.l1 = c1178200glW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS483S0200000_18(C2205251BSp c2205251BSp, C1177210gjv c1177210gjv, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2205251BSp;
        this.l1 = c1177210gjv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS483S0200000_18(C2205251BSp c2205251BSp, C1178200glW c1178200glW, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2205251BSp;
        this.l1 = c1178200glW;
    }

    public static final Object invoke$0(AwS483S0200000_18 awS483S0200000_18, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Pair pair = (Pair) obj2;
        C1178140glQ c1178140glQ = (C1178140glQ) awS483S0200000_18.l0;
        c1178140glQ.LIZ = (Bitmap) obj3;
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        c1178140glQ.LJ = fFloatValue;
        c1178140glQ.LIZLLL = fFloatValue2;
        c1178140glQ.LJFF = ((C1178200glW) awS483S0200000_18.l1).LIZ().floatValue();
        c1178140glQ.LIZIZ = String.valueOf(zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS483S0200000_18 awS483S0200000_18, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Pair pair = (Pair) obj2;
        C2205251BSp c2205251BSpLIZLLL = ((InterfaceC1177040gje) awS483S0200000_18.l0).LIZLLL((Bitmap) obj3);
        c2205251BSpLIZLLL.LJ(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        c2205251BSpLIZLLL.LIZIZ(((C1178200glW) awS483S0200000_18.l1).LIZ().floatValue());
        c2205251BSpLIZLLL.LIZJ(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS483S0200000_18 awS483S0200000_18, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Pair pair = (Pair) obj2;
        C1178140glQ c1178140glQ = (C1178140glQ) awS483S0200000_18.l0;
        c1178140glQ.LIZ = (Bitmap) obj3;
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        c1178140glQ.LJ = fFloatValue;
        c1178140glQ.LIZLLL = fFloatValue2;
        c1178140glQ.LJFF = ((C1177210gjv) awS483S0200000_18.l1).LIZ().floatValue();
        c1178140glQ.LIZIZ = String.valueOf(zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS483S0200000_18 awS483S0200000_18, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Pair pair = (Pair) obj2;
        C2205251BSp c2205251BSpLIZLLL = ((InterfaceC1177040gje) awS483S0200000_18.l0).LIZLLL((Bitmap) obj3);
        c2205251BSpLIZLLL.LJ(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        c2205251BSpLIZLLL.LIZIZ(((C1177210gjv) awS483S0200000_18.l1).LIZ().floatValue());
        c2205251BSpLIZLLL.LIZJ(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS483S0200000_18 awS483S0200000_18, Object obj, Object obj2, Object obj3) {
        List<MixStruct> list = (List) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        long jLongValue = ((Number) obj3).longValue();
        List<String> list2 = ((C1165310gQj) awS483S0200000_18.l0).LJII;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<MixStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            String str = it2.next().mixId;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        ((ArrayList) list2).addAll(arrayList);
        ((C1165310gQj) awS483S0200000_18.l0).LIZ = 0;
        if (!list.isEmpty() && zBooleanValue) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS483S0200000_18.l1;
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Long lValueOf = Long.valueOf(jLongValue);
            List<C1167940gUy> listLIZ = ((C1165310gQj) awS483S0200000_18.l0).LIZ(list);
            c317290CcB.getClass();
            C323380Cm0 c323380Cm0 = new C323380Cm0(null, lValueOf, listLIZ);
            C189200o6.m2constructorimpl(c323380Cm0);
            interfaceC1364105Vn.resumeWith(c323380Cm0);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS483S0200000_18.l1;
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            List<C1167940gUy> listLIZ2 = ((C1165310gQj) awS483S0200000_18.l0).LIZ(list);
            c317290CcB2.getClass();
            C316640Cb8 c316640Cb8 = new C316640Cb8(listLIZ2);
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn2.resumeWith(c316640Cb8);
        }
        return Unit.LIZ;
    }
}
