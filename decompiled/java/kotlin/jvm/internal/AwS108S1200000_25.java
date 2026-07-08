package kotlin.jvm.internal;

import X.C09AY;
import X.C1212320heY;
import X.C1622010sJL;
import X.C1623940sMS;
import X.C1647720syo;
import X.C1652410t6N;
import X.C1678560tmY;
import X.C1694480uCE;
import X.C1696490uFT;
import X.C1696500uFU;
import X.C1697110uGT;
import X.C390150FRl;
import X.EnumC1678550tmX;
import X.InterfaceC1692460u8y;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import v7.o;

/* JADX INFO: loaded from: classes26.dex */
public class AwS108S1200000_25 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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

    public static final Object invoke$0(AwS108S1200000_25 awS108S1200000_25, Object obj) {
        InterfaceC1692460u8y interfaceC1692460u8y = (InterfaceC1692460u8y) obj;
        String str = awS108S1200000_25.s0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
        C1212320heY<String> c1212320heY = C1696500uFU.LJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
        c1212320heY.getClass();
        interfaceC1692460u8y.LIZJ(c1212320heY, str);
        if (((C1678560tmY) awS108S1200000_25.l1).LIZ.LIZJ() == EnumC1678550tmX.Open) {
            interfaceC1692460u8y.LIZJ(C1694480uCE.LJIJJ, new C1697110uGT(null, new AwS403S0200000_2((C1678560tmY) awS108S1200000_25.l1, (InterfaceC497601wk) awS108S1200000_25.l2, 7)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS108S1200000_25 awS108S1200000_25, Object obj) {
        ((C1647720syo) awS108S1200000_25.l1).c3((C390150FRl) awS108S1200000_25.l2, awS108S1200000_25.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS108S1200000_25 r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS108S1200000_25.invoke$2(kotlin.jvm.internal.AwS108S1200000_25, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS108S1200000_25 awS108S1200000_25, Object obj) {
        C1622010sJL c1622010sJL = ((C1623940sMS) awS108S1200000_25.l1).LJIILL;
        c1622010sJL.LIZIZ = (AVMusic) obj;
        c1622010sJL.LIZJ = awS108S1200000_25.s0;
        ((o) awS108S1200000_25.l2).LIZJ(1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS108S1200000_25(C1623940sMS c1623940sMS, C1623940sMS c1623940sMS2, String str, o<Integer> oVar) {
        super(1);
        this.$t = oVar;
        this.l1 = c1623940sMS;
        this.s0 = c1623940sMS2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S1200000_25(C1647720syo c1647720syo, C390150FRl c390150FRl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1647720syo;
        this.l2 = c390150FRl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S1200000_25(String str, C1652410t6N c1652410t6N, Effect effect, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1652410t6N;
        this.l2 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS108S1200000_25(String str, C1678560tmY c1678560tmY, InterfaceC497601wk interfaceC497601wk, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1678560tmY;
        this.l2 = interfaceC497601wk;
    }
}
