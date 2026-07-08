package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC1690640u62;
import X.C09AY;
import X.C0ET4;
import X.C1448500nnU;
import X.C1642280sq2;
import X.C1642300sq4;
import X.C1644050sst;
import X.C1644920suI;
import X.C1648160szW;
import X.C1650960t42;
import X.C1656080tCI;
import X.C1657820tF6;
import X.C1690020u52;
import X.C1690030u53;
import X.C1694480uCE;
import X.C1696490uFT;
import X.C1697110uGT;
import X.C19457211Ak;
import X.C19457311Al;
import X.C19A3;
import X.C1DRG;
import X.C297380BlA;
import X.C559610Lx9;
import X.C577500Mku;
import X.InterfaceC1692460u8y;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import Y.ARunnableS125S0100000_25;
import Y.ARunnableS94S0200000_25;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.record.UIDelayRecordPageFactoryKt$createMinorComponents$22$1$1;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS76S0210000_25 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS76S0210000_25 awS76S0210000_25, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue <= 0) {
            ((C1656080tCI) awS76S0210000_25.l0).LIZ.H2(new C1448500nnU(iIntValue));
        }
        if (!awS76S0210000_25.z2) {
            C1656080tCI c1656080tCI = (C1656080tCI) awS76S0210000_25.l0;
            c1656080tCI.LIZJ.post(new ARunnableS125S0100000_25(c1656080tCI, 38));
            C1656080tCI c1656080tCI2 = (C1656080tCI) awS76S0210000_25.l0;
            c1656080tCI2.LIZJ.post(new ARunnableS94S0200000_25(c1656080tCI2, (C1644050sst) awS76S0210000_25.l1, 9));
        }
        ((C1656080tCI) awS76S0210000_25.l0).LIZ.H3();
        Runnable runnable = ((C1644050sst) awS76S0210000_25.l1).LJ;
        if (runnable != null) {
            ((C1656080tCI) awS76S0210000_25.l0).LIZJ.post(runnable);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS76S0210000_25 awS76S0210000_25, Object obj) {
        int i;
        i3 i3Var = (i3) obj;
        int iLJFF = C577500Mku.LJFF(((C1648160szW) awS76S0210000_25.l0).LIZ);
        if (awS76S0210000_25.z2) {
            i = R.attr.zs;
        } else {
            ((C1650960t42) awS76S0210000_25.l1).getClass();
            C1657820tF6.LIZ.getClass();
            if (C1657820tF6.LIZIZ()) {
                i = 0;
            } else {
                i = R.attr.ee;
            }
        }
        return i3.LJIIIZ(i3Var, iLJFF, 0, i, null, 0, false, false, false, false, false, null, null, 0, null, null, null, false, null, false, 0.0f, null, 268435382);
    }

    public static final Object invoke$2(AwS76S0210000_25 awS76S0210000_25, Object obj) {
        ((C19457211Ak) obj).LJIIJJI((C19457311Al) awS76S0210000_25.l0, (LifecycleOwner) awS76S0210000_25.l1, awS76S0210000_25.z2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS76S0210000_25 awS76S0210000_25, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1642280sq2 c1642280sq2LIZ = C1642300sq4.LIZ((C1DRG) obj, (C19A3) awS76S0210000_25.l1, R.id.sz5, awS76S0210000_25.z2);
        ((C559610Lx9) awS76S0210000_25.l0).getClass();
        C559610Lx9.LIZ(c1642280sq2LIZ);
        c1642280sq2LIZ.afterInit$als_release(jUptimeMillis);
        return c1642280sq2LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS76S0210000_25 awS76S0210000_25, Object obj) {
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1644920suI c1644920suI = new C1644920suI((C19A3) awS76S0210000_25.l1, c1drg, R.id.sz5, C297380BlA.LIZ(), awS76S0210000_25.z2);
        c1644920suI.getLifecycle().addObserver(new UIDelayRecordPageFactoryKt$createMinorComponents$22$1$1(c1drg, c1644920suI));
        ((C559610Lx9) awS76S0210000_25.l0).getClass();
        C559610Lx9.LIZ(c1644920suI);
        c1644920suI.afterInit$als_release(jUptimeMillis);
        return c1644920suI;
    }

    public static final Object invoke$5(AwS76S0210000_25 awS76S0210000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        List list = (List) awS76S0210000_25.l0;
        boolean z = awS76S0210000_25.z2;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C1690020u52) ListProtector.get(list, i)).LJIIIIZZ(abstractC1683310tuD, z);
        }
        List list2 = (List) awS76S0210000_25.l1;
        boolean z2 = awS76S0210000_25.z2;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C1690020u52) ListProtector.get(list2, i2)).LJIIIIZZ(abstractC1683310tuD, z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS76S0210000_25 awS76S0210000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        List list = (List) awS76S0210000_25.l0;
        boolean z = awS76S0210000_25.z2;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C1690030u53) ListProtector.get(list, i)).LJIILLIIL(abstractC1683310tuD, z);
        }
        List list2 = (List) awS76S0210000_25.l1;
        boolean z2 = awS76S0210000_25.z2;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C1690030u53) ListProtector.get(list2, i2)).LJIILLIIL(abstractC1683310tuD, z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS76S0210000_25 awS76S0210000_25, Object obj) {
        InterfaceC1692460u8y interfaceC1692460u8y = (InterfaceC1692460u8y) obj;
        if (awS76S0210000_25.z2) {
            AwS403S0200000_2 awS403S0200000_2 = new AwS403S0200000_2((AbstractC1690640u62) awS76S0210000_25.l0, (InterfaceC497601wk) awS76S0210000_25.l1, 80);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
            interfaceC1692460u8y.LIZJ(C1694480uCE.LJJ, new C1697110uGT(null, awS403S0200000_2));
            interfaceC1692460u8y.LIZJ(C1694480uCE.LJJIFFI, new C1697110uGT(null, new AwS403S0200000_2((AbstractC1690640u62) awS76S0210000_25.l0, (InterfaceC497601wk) awS76S0210000_25.l1, 81)));
        } else {
            AwS403S0200000_2 awS403S0200000_22 = new AwS403S0200000_2((AbstractC1690640u62) awS76S0210000_25.l0, (InterfaceC497601wk) awS76S0210000_25.l1, 82);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
            interfaceC1692460u8y.LIZJ(C1694480uCE.LJJI, new C1697110uGT(null, awS403S0200000_22));
            interfaceC1692460u8y.LIZJ(C1694480uCE.LJJII, new C1697110uGT(null, new AwS403S0200000_2((AbstractC1690640u62) awS76S0210000_25.l0, (InterfaceC497601wk) awS76S0210000_25.l1, 83)));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0210000_25(C1648160szW c1648160szW, boolean z, C1650960t42 c1650960t42, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1648160szW;
        this.z2 = z;
        this.l1 = c1650960t42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0210000_25(C19457311Al c19457311Al, LifecycleOwner lifecycleOwner, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19457311Al;
        this.l1 = lifecycleOwner;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS76S0210000_25(List list, List<C1690020u52> list2, List<C1690020u52> list3, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.l1 = list2;
        this.z2 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0210000_25(boolean z, AbstractC1690640u62 abstractC1690640u62, InterfaceC497601wk interfaceC497601wk, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = abstractC1690640u62;
        this.l1 = interfaceC497601wk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0210000_25(C0ET4 c0et4, C559610Lx9 c559610Lx9, C19A3 c19a3, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = c19a3;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS76S0210000_25(C1656080tCI c1656080tCI, boolean z, C1644050sst c1644050sst, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1656080tCI;
        this.z2 = z;
        this.l1 = c1644050sst;
    }
}
