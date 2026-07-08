package kotlin.jvm.internal;

import X.C09AY;
import X.C1134160fcU;
import X.C1134860fdc;
import X.C1136650fgV;
import X.C1145980fvY;
import X.C1623606Xi;
import X.C500260Jjc;
import X.C784440Upu;
import X.InterfaceC1106030et7;
import X.InterfaceC1134150fcT;
import com.bytedance.android.livesdk.impl.revenue.strategy.firstrecharge.LiveFastFirstRechargeHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS31S0001000_17 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f987i0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0001000_17(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f987i0 = i;
    }

    public static final Object invoke$0(AwS31S0001000_17 awS31S0001000_17, Object obj) {
        C784440Upu.LIZ().LIZIZ(new C1134160fcU());
        int i = awS31S0001000_17.f987i0;
        if (i == 102 || i == 2) {
            C1134860fdc c1134860fdc = C1134860fdc.LIZ;
            if (C500260Jjc.LJJJI(InterfaceC1106030et7.d7.LIZ())) {
                LiveFastFirstRechargeHolder.LL.getClass();
                LiveFastFirstRechargeHolder.LLILZIL = Boolean.FALSE;
                LiveFastFirstRechargeHolder.LLJ = true;
                InterfaceC1134150fcT interfaceC1134150fcT = LiveFastFirstRechargeHolder.LLILZLL;
                if (interfaceC1134150fcT != null) {
                    interfaceC1134150fcT.LIZIZ();
                }
            }
            LiveFastFirstRechargeHolder.LL.getClass();
            Boolean bool = Boolean.FALSE;
            LiveFastFirstRechargeHolder.LLILZIL = bool;
            LiveFastFirstRechargeHolder.LIZ(bool, LiveFastFirstRechargeHolder.LLILLL, LiveFastFirstRechargeHolder.LLILLJJLI, LiveFastFirstRechargeHolder.LLILZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S0001000_17 awS31S0001000_17, Object obj) {
        boolean z;
        if (((C1136650fgV) obj).LIZIZ <= awS31S0001000_17.f987i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS31S0001000_17 awS31S0001000_17, Object obj) {
        return C1145980fvY.LIZ((C1145980fvY) obj, new C1623606Xi(Integer.valueOf(awS31S0001000_17.f987i0)), null, null, false, 14);
    }
}
