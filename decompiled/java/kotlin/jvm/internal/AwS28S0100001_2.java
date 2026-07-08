package kotlin.jvm.internal;

import X.C05UN;
import X.C06XG;
import X.C09AY;
import X.C13LZ;
import X.C15438062q;
import X.C1677280tkU;
import X.C1677480tko;
import X.C1690080u58;
import X.InterfaceC1564820qp6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS28S0100001_2 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S0100001_2 awS28S0100001_2) {
        float fLIZLLL = C13LZ.LIZLLL(((C05UN) awS28S0100001_2.l0).LJ.LIZLLL().floatValue(), 0.0f, 1.0f);
        float f = awS28S0100001_2.f1;
        return Float.valueOf(f + ((1.0f - f) * fLIZLLL));
    }

    public static final Object invoke$1(AwS28S0100001_2 awS28S0100001_2) {
        float fFloatValue;
        C1677480tko c1677480tko = (C1677480tko) awS28S0100001_2.l0;
        if (c1677480tko != null) {
            fFloatValue = ((Number) c1677480tko.LIZLLL()).floatValue();
        } else {
            fFloatValue = awS28S0100001_2.f1;
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Object invoke$2(AwS28S0100001_2 awS28S0100001_2) {
        InterfaceC1564820qp6 interfaceC1564820qp6LJIIIZ = ((C1690080u58) awS28S0100001_2.l0).LJIIIZ();
        float f = awS28S0100001_2.f1;
        List<C06XG> listLJII = interfaceC1564820qp6LJIIIZ.LJII();
        ArrayList arrayList = new ArrayList();
        for (C06XG c06xg : listLJII) {
            C06XG c06xg2 = c06xg;
            int offset = c06xg2.getOffset();
            int offset2 = c06xg2.getOffset() + c06xg2.getSize();
            int iLIZLLL = interfaceC1564820qp6LJIIIZ.LIZLLL();
            int iLIZIZ = interfaceC1564820qp6LJIIIZ.LIZIZ();
            float fMax = Math.max(0, Math.min(offset2, iLIZIZ) - Math.max(offset, iLIZLLL)) / c06xg2.getSize();
            if (f > 0.0f && fMax >= 0.7f) {
                arrayList.add(c06xg);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((C06XG) it2.next()).getIndex()));
        }
        return new Pair(arrayList2, Boolean.valueOf(((C1690080u58) awS28S0100001_2.l0).LIZIZ()));
    }

    public static final Object invoke$3(AwS28S0100001_2 awS28S0100001_2) {
        InterfaceC1564820qp6 interfaceC1564820qp6LJIIIZ = ((C1690080u58) awS28S0100001_2.l0).LJIIIZ();
        int iLIZLLL = interfaceC1564820qp6LJIIIZ.LIZLLL();
        int iLIZIZ = interfaceC1564820qp6LJIIIZ.LIZIZ();
        List<C06XG> listLJII = interfaceC1564820qp6LJIIIZ.LJII();
        int[] iArr = new int[listLJII.size()];
        int i = 0;
        for (C06XG c06xg : listLJII) {
            float f = awS28S0100001_2.f1;
            int size = c06xg.getSize() + c06xg.getOffset();
            if (Math.min(size, iLIZIZ) - Math.max(r1, iLIZLLL) >= f * 0.7f) {
                iArr[i] = c06xg.getIndex();
                i++;
            }
        }
        return Arrays.copyOf(iArr, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0100001_2(C05UN c05un, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05un;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S0100001_2(C1677480tko c1677480tko, C1677480tko<Float, C1677280tkU> c1677480tko2, float f) {
        super(0);
        this.$t = f;
        this.l0 = c1677480tko;
        this.f1 = c1677480tko2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0100001_2(C1690080u58 c1690080u58, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1690080u58;
        this.f1 = f;
    }
}
