package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C0M7M;
import X.C1447350nld;
import X.C189200o6;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23260099m;
import X.C375070EnB;
import X.C529220KpE;
import X.C529300KpM;
import X.InterfaceC1364105Vn;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS45S0100100_8 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS45S0100100_8 awS45S0100100_8, Object obj) {
        C0LAB c0labLIZ = C375070EnB.LIZ((Bundle) awS45S0100100_8.l0, String.valueOf(awS45S0100100_8.j1));
        if (c0labLIZ != null) {
            C20684815ws.LJIILLIIL("choose_shorter_video_popup_cancel", c0labLIZ.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S0100100_8 awS45S0100100_8, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChooseCoverCompressUtil, setImageCompressPath, cost: ");
        sbLIZ.append(System.currentTimeMillis() - awS45S0100100_8.j1);
        C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        ((Function1) awS45S0100100_8.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS45S0100100_8 awS45S0100100_8, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS45S0100100_8.l0;
            C529300KpM c529300KpM = C529300KpM.LIZIZ;
            C189200o6.m2constructorimpl(c529300KpM);
            interfaceC1364105Vn.resumeWith(c529300KpM);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS45S0100100_8.l0;
            C529220KpE c529220KpE = new C529220KpE(awS45S0100100_8.j1);
            C189200o6.m2constructorimpl(c529220KpE);
            interfaceC1364105Vn2.resumeWith(c529220KpE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0100100_8(long j, C1447350nld c1447350nld, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1447350nld;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0100100_8(C23260099m c23260099m, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c23260099m;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0100100_8(Bundle bundle, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = bundle;
        this.j1 = j;
    }
}
