package kotlin.jvm.internal;

import X.AbstractC1677260tkS;
import X.C05P1;
import X.C09AY;
import X.C1668650tWZ;
import X.C1675860tiC;
import X.C1677580tky;
import X.C1677810tlL;
import X.C1677830tlN;
import X.C1685910tyP;
import X.C259800zU;
import X.EnumC1671200tag;
import X.InterfaceC1669010tX9;
import X.InterfaceC1677860tlQ;
import X.InterfaceC1690500u5o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS2S0600001_25 extends C09AY implements Function1 {
    public final int $t;
    public float f6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS2S0600001_25 awS2S0600001_25, Object obj) {
        float fLJJJJLL;
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        long j = ((C1685910tyP) ((C05P1) awS2S0600001_25.l1).getValue()).LIZ;
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) awS2S0600001_25.l0;
        EnumC1671200tag enumC1671200tag = (EnumC1671200tag) awS2S0600001_25.l2;
        C05P1 c05p1 = (C05P1) awS2S0600001_25.l3;
        C05P1 c05p12 = (C05P1) awS2S0600001_25.l4;
        if (enumC1671200tag == EnumC1671200tag.Rtl) {
            fLJJJJLL = 0.0f;
        } else {
            fLJJJJLL = interfaceC1690500u5o.LJJJJLL(((C1668650tWZ) c05p1.getValue()).LL + ((C1668650tWZ) c05p12.getValue()).LL);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fLJJJJLL)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        float fLJJJJLL2 = interfaceC1669010tX9.LJJJJLL(((C1668650tWZ) ((C05P1) awS2S0600001_25.l5).getValue()).LL);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(interfaceC1669010tX9.LJJJJLL(awS2S0600001_25.f6))) & 4294967295L) | (Float.floatToRawIntBits(fLJJJJLL2) << 32);
        float fLJJJJLL3 = interfaceC1669010tX9.LJJJJLL(((C1668650tWZ) ((C05P1) awS2S0600001_25.l5).getValue()).LL) / 2;
        C1675860tiC.LJIIL(interfaceC1669010tX9, j, jFloatToRawIntBits, jFloatToRawIntBits2, (4294967295L & ((long) Float.floatToRawIntBits(fLJJJJLL3))) | (Float.floatToRawIntBits(fLJJJJLL3) << 32), null, 0, 240);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [T, X.0tlN] */
    public static final Object invoke$1(AwS2S0600001_25 awS2S0600001_25, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        C259800zU c259800zU = (C259800zU) awS2S0600001_25.l0;
        ?? c1677830tlN = new C1677830tlN(awS2S0600001_25.l1, ((InterfaceC1677860tlQ) awS2S0600001_25.l2).LIZLLL(), (AbstractC1677260tkS) awS2S0600001_25.l3, jLongValue, ((InterfaceC1677860tlQ) awS2S0600001_25.l2).LJFF(), jLongValue, new AwS569S0100000_25((C1677580tky) awS2S0600001_25.l4, 791));
        C1677810tlL.LJI(c1677830tlN, jLongValue, awS2S0600001_25.f6, (InterfaceC1677860tlQ) awS2S0600001_25.l2, (C1677580tky) awS2S0600001_25.l4, (Function1) awS2S0600001_25.l5);
        c259800zU.element = c1677830tlN;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0600001_25(C259800zU c259800zU, C259800zU<C1677830tlN<T, V>> c259800zU2, T t, InterfaceC1677860tlQ<T, V> interfaceC1677860tlQ, V v, C1677580tky<T, V> c1677580tky, float f, Function1<? super C1677830tlN<T, V>, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = t;
        this.l3 = interfaceC1677860tlQ;
        this.l4 = v;
        this.f6 = c1677580tky;
        this.l5 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0600001_25(InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC1690500u5o interfaceC1690500u5o2, float f, C05P1<C1685910tyP> c05p1, EnumC1671200tag enumC1671200tag, C05P1<C1668650tWZ> c05p12, C05P1<C1668650tWZ> c05p13, C05P1<C1668650tWZ> c05p14) {
        super(1);
        this.$t = c05p14;
        this.l0 = interfaceC1690500u5o;
        this.f6 = interfaceC1690500u5o2;
        this.l1 = f;
        this.l2 = c05p1;
        this.l3 = enumC1671200tag;
        this.l4 = c05p12;
        this.l5 = c05p13;
    }
}
