package kotlin.jvm.internal;

import X.AbstractC1669390tXl;
import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.AbstractC19875512pd;
import X.C020W;
import X.C05P0;
import X.C05P1;
import X.C05UN;
import X.C09AY;
import X.C0MAE;
import X.C118300cf;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1378605aS;
import X.C1674920tgg;
import X.C1676680tjW;
import X.C1679710toP;
import X.C1683170ttz;
import X.C1685500txk;
import X.C1685510txl;
import X.C1687630u1B;
import X.C1687730u1L;
import X.C19719212De;
import X.EnumC1685450txf;
import X.InterfaceC1673370teB;
import X.InterfaceC1675750ti1;
import X.InterfaceC1679550to9;
import X.InterfaceC1689940u4u;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o0.k;

/* JADX INFO: loaded from: classes26.dex */
public class AwS39S0600000_25 extends C09AY implements Function1 {
    public final int $t;
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
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS39S0600000_25 awS39S0600000_25, Object obj) {
        C0MAE c0mae = (C0MAE) obj;
        AbstractC19875512pd abstractC19875512pd = (AbstractC19875512pd) awS39S0600000_25.l0;
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(604);
        UserMatchedAssem userMatchedAssem = (UserMatchedAssem) awS39S0600000_25.l1;
        C1687630u1B c1687630u1B = (C1687630u1B) awS39S0600000_25.l2;
        C1685510txl c1685510txl = (C1685510txl) awS39S0600000_25.l3;
        EnumC1685450txf enumC1685450txf = (EnumC1685450txf) awS39S0600000_25.l4;
        c0mae.LIZJ(abstractC19875512pd.size(), new C020W(aFwS240S0000000_9, abstractC19875512pd, 72), new C020W(AFwS266S0000000_25.get$arr$(524), abstractC19875512pd, 73), new C19719212De(-632812321, new C1685500txk(abstractC19875512pd, userMatchedAssem, c1687630u1B, c1685510txl, enumC1685450txf), true));
        c0mae.LIZIZ("connect_now_footer", null, new C19719212De(-1720916634, new AwS487S0200000_25((EnumC1685450txf) awS39S0600000_25.l4, (C1295960jpS) awS39S0600000_25.l5, 5), true));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S0600000_25 awS39S0600000_25, Object obj) {
        float fFloatValue;
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        interfaceC1679550to9.LJJLIIIIJ(C1676680tjW.LIZIZ);
        interfaceC1679550to9.LJIIJ(((Number) ((C05P1) awS39S0600000_25.l1).getValue()).floatValue());
        interfaceC1679550to9.LJIIJJI(((Number) ((C05P1) awS39S0600000_25.l1).getValue()).floatValue());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (((C1378605aS) ((C05P1) awS39S0600000_25.l2).getValue()).LIZ >> 32));
        float fFloatValue2 = 0.0f;
        if (C1679710toP.LIZ((C05P1) awS39S0600000_25.l3)) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = ((Number) ((C05P1) awS39S0600000_25.l4).getValue()).floatValue();
        }
        interfaceC1679550to9.LJII(fIntBitsToFloat + fFloatValue);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((C1378605aS) ((C05P1) awS39S0600000_25.l2).getValue()).LIZ & 4294967295L));
        if (!C1679710toP.LIZ((C05P1) awS39S0600000_25.l3)) {
            fFloatValue2 = ((Number) ((C05P1) awS39S0600000_25.l5).getValue()).floatValue();
        }
        interfaceC1679550to9.LJI(fIntBitsToFloat2 + fFloatValue2);
        interfaceC1679550to9.LJLJL((AbstractC1669390tXl) ((C05UN) awS39S0600000_25.l0).LJIJJLI.getValue());
        interfaceC1679550to9.LJIILIIL(true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS39S0600000_25 awS39S0600000_25, Object obj) {
        long j = ((C1378605aS) obj).LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ((InterfaceC1675750ti1) awS39S0600000_25.l1).LIZ() >= 200) {
            ((InterfaceC1675750ti1) awS39S0600000_25.l1).LJIIIIZZ(jCurrentTimeMillis);
            C1294720jnS c1294720jnS = (C1294720jnS) ((C05P1) awS39S0600000_25.l2).getValue();
            FrameLayout frameLayout = (FrameLayout) ((C05P0) awS39S0600000_25.l3).getValue();
            Object value = ((C05P0) awS39S0600000_25.l4).getValue();
            if (c1294720jnS != null && frameLayout != null && value != null) {
                C1683170ttz.LJI(c1294720jnS, j, frameLayout);
                if (!((Boolean) ((C05P0) awS39S0600000_25.l5).getValue()).booleanValue()) {
                    C05P0 c05p0 = (C05P0) awS39S0600000_25.l5;
                    Boolean bool = Boolean.TRUE;
                    c05p0.setValue(bool);
                    ((Function2) awS39S0600000_25.l0).invoke(bool, "click_double_like");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS39S0600000_25 awS39S0600000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        AbstractC1686530tzP[] abstractC1686530tzPArr = (AbstractC1686530tzP[]) awS39S0600000_25.l0;
        List list = (List) awS39S0600000_25.l1;
        InterfaceC1689940u4u interfaceC1689940u4u = (InterfaceC1689940u4u) awS39S0600000_25.l2;
        C118300cf c118300cf = (C118300cf) awS39S0600000_25.l3;
        C118300cf c118300cf2 = (C118300cf) awS39S0600000_25.l4;
        C1674920tgg c1674920tgg = (C1674920tgg) awS39S0600000_25.l5;
        int length = abstractC1686530tzPArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            k.LIZIZ(abstractC1683310tuD, abstractC1686530tzPArr[i2], (InterfaceC1673370teB) ListProtector.get(list, i), interfaceC1689940u4u.getLayoutDirection(), c118300cf.element, c118300cf2.element, c1674920tgg.LIZ);
            i2++;
            i++;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S0600000_25(C05UN c05un, C05UN c05un2, C05P1<Float> c05p1, C05P1<C1378605aS> c05p12, C05P1<Boolean> c05p13, C05P1<Float> c05p14, C05P1<Float> c05p15) {
        super(1);
        this.$t = c05p15;
        this.l0 = c05un;
        this.l1 = c05un2;
        this.l2 = c05p1;
        this.l3 = c05p12;
        this.l4 = c05p13;
        this.l5 = c05p14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S0600000_25(AbstractC19875512pd abstractC19875512pd, AbstractC19875512pd<C1687730u1L> abstractC19875512pd2, UserMatchedAssem userMatchedAssem, C1687630u1B c1687630u1B, C1685510txl c1685510txl, EnumC1685450txf enumC1685450txf, C1295960jpS c1295960jpS) {
        super(1);
        this.$t = c1295960jpS;
        this.l0 = abstractC19875512pd;
        this.l1 = abstractC19875512pd2;
        this.l2 = userMatchedAssem;
        this.l3 = c1687630u1B;
        this.l4 = c1685510txl;
        this.l5 = enumC1685450txf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0600000_25(Function2 function2, InterfaceC1675750ti1 interfaceC1675750ti1, C05P0 c05p0, C05P0 c05p02, C05P0 c05p03, C05P0 c05p04, int i) {
        super(1);
        this.$t = i;
        this.l0 = function2;
        this.l1 = interfaceC1675750ti1;
        this.l2 = c05p0;
        this.l3 = c05p02;
        this.l4 = c05p03;
        this.l5 = c05p04;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS39S0600000_25(AbstractC1686530tzP[] abstractC1686530tzPArr, AbstractC1686530tzP[] abstractC1686530tzPArr2, List<? extends InterfaceC1673370teB> list, InterfaceC1689940u4u interfaceC1689940u4u, C118300cf c118300cf, C118300cf c118300cf2, C1674920tgg c1674920tgg) {
        super(1);
        this.$t = c1674920tgg;
        this.l0 = abstractC1686530tzPArr;
        this.l1 = abstractC1686530tzPArr2;
        this.l2 = list;
        this.l3 = interfaceC1689940u4u;
        this.l4 = c118300cf;
        this.l5 = c118300cf2;
    }
}
