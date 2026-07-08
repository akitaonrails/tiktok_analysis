package kotlin.jvm.internal;

import X.C09AY;
import X.C1207400hWc;
import X.C1207520hWo;
import X.C1207850hXL;
import X.C2188811AlT;
import X.C2191641Aq2;
import X.C849850XVn;
import X.InterfaceC1207030hW1;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.WhiteNoiseAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS70S0100100_18 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
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

    public static final Object invoke$0(AwS70S0100100_18 awS70S0100100_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set timer ");
        sbLIZ.append(awS70S0100100_18.j1);
        sbLIZ.append(" and end at ");
        sbLIZ.append(((WhiteNoiseAssem) awS70S0100100_18.l0).LLJJIJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS70S0100100_18 awS70S0100100_18) {
        String str;
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((C1207850hXL) awS70S0100100_18.l0).LIZ.getResources().getString(2131836200), true);
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS70S0100100_18.j1;
        C1207520hWo c1207520hWo = ((C1207850hXL) awS70S0100100_18.l0).LIZIZ;
        String str2 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
        } else {
            str = null;
        }
        c1207400hWc.getClass();
        C1207400hWc.LIZJ(jCurrentTimeMillis, str, str2, false);
        InterfaceC1207030hW1 interfaceC1207030hW1 = ((C1207850hXL) awS70S0100100_18.l0).LJII;
        if (interfaceC1207030hW1 != null) {
            interfaceC1207030hW1.LIZIZ(3, "click outside to dismiss pre popup");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS70S0100100_18 awS70S0100100_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("erase fail ");
        sbLIZ.append(awS70S0100100_18.j1);
        sbLIZ.append(": ");
        sbLIZ.append(((Throwable) awS70S0100100_18.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS70S0100100_18 awS70S0100100_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SqliteDatabase: insert event: ");
        sbLIZ.append((C2191641Aq2) awS70S0100100_18.l0);
        sbLIZ.append(" to db failed with id:");
        sbLIZ.append(awS70S0100100_18.j1);
        sbLIZ.append(" < 0!");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0100100_18(long j, WhiteNoiseAssem whiteNoiseAssem, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = whiteNoiseAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0100100_18(long j, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0100100_18(C1207850hXL c1207850hXL, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1207850hXL;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0100100_18(C2191641Aq2 c2191641Aq2, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2191641Aq2;
        this.j1 = j;
    }
}
