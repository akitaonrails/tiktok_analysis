package kotlin.jvm.internal;

import X.AbstractC2267441Dp0;
import X.AbstractC2267451Dp1;
import X.C09AY;
import X.C1557260qcu;
import X.C1557270qcv;
import X.C1668650tWZ;
import X.C2267041DoM;
import X.C2267051DoN;
import X.C2267061DoO;
import X.C2267431Doz;
import X.C2267461Dp2;
import X.C2267481Dp4;
import X.EnumC1671200tag;
import X.InterfaceC1631620sYq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS3S0200002_35 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public float f3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS3S0200002_35 awS3S0200002_35, Object obj) {
        C2267061DoO c2267061DoOLIZ = ((C2267051DoN) obj).LIZ(((C2267461Dp2) ((AbstractC2267441Dp0) awS3S0200002_35.l0)).LIZJ);
        AbstractC2267441Dp0 abstractC2267441Dp0 = (AbstractC2267441Dp0) awS3S0200002_35.l0;
        C1557260qcu c1557260qcu = (C1557260qcu) awS3S0200002_35.l1;
        float f = awS3S0200002_35.f2;
        float f2 = awS3S0200002_35.f3;
        C2267061DoO c2267061DoOInvoke = C2267431Doz.LIZIZ[abstractC2267441Dp0.LIZIZ][c1557260qcu.LIZIZ].invoke(c2267061DoOLIZ, c1557260qcu.LIZ);
        c2267061DoOInvoke.LJIIIZ(new C1668650tWZ(f));
        c2267061DoOInvoke.LJIIJ(c2267061DoOInvoke.LIZIZ.LIZIZ(new C1668650tWZ(f2)));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0200002_35 awS3S0200002_35, Object obj) {
        C2267041DoM c2267041DoM = (C2267041DoM) obj;
        EnumC1671200tag enumC1671200tag = c2267041DoM.LJII;
        enumC1671200tag.getClass();
        AbstractC2267451Dp1 abstractC2267451Dp1 = (AbstractC2267451Dp1) awS3S0200002_35.l0;
        int i = abstractC2267451Dp1.LIZIZ;
        if (i < 0) {
            if (enumC1671200tag == EnumC1671200tag.Ltr) {
                i += 2;
            } else {
                i = (-i) - 1;
            }
        }
        int i2 = ((C1557270qcv) awS3S0200002_35.l1).LIZIZ;
        if (i2 < 0) {
            if (enumC1671200tag == EnumC1671200tag.Ltr) {
                i2 += 2;
            } else {
                i2 = (-i2) - 1;
            }
        }
        C2267061DoO c2267061DoOLIZ = c2267041DoM.LIZ(((C2267481Dp4) abstractC2267451Dp1).LIZJ);
        C1557270qcv c1557270qcv = (C1557270qcv) awS3S0200002_35.l1;
        float f = awS3S0200002_35.f2;
        float f2 = awS3S0200002_35.f3;
        InterfaceC1631620sYq<C2267061DoO, Object, EnumC1671200tag, C2267061DoO> interfaceC1631620sYq = C2267431Doz.LIZ[i][i2];
        Object obj2 = c1557270qcv.LIZ;
        EnumC1671200tag enumC1671200tag2 = c2267041DoM.LJII;
        enumC1671200tag2.getClass();
        C2267061DoO c2267061DoOInvoke = interfaceC1631620sYq.invoke(c2267061DoOLIZ, obj2, enumC1671200tag2);
        c2267061DoOInvoke.LJIIIZ(new C1668650tWZ(f));
        c2267061DoOInvoke.LJIIJ(c2267061DoOInvoke.LIZIZ.LIZIZ(new C1668650tWZ(f2)));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0200002_35(AbstractC2267441Dp0 abstractC2267441Dp0, C1557260qcu c1557260qcu, float f, float f2, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC2267441Dp0;
        this.l1 = c1557260qcu;
        this.f2 = f;
        this.f3 = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0200002_35(AbstractC2267451Dp1 abstractC2267451Dp1, C1557270qcv c1557270qcv, float f, float f2, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC2267451Dp1;
        this.l1 = c1557270qcv;
        this.f2 = f;
        this.f3 = f2;
    }
}
