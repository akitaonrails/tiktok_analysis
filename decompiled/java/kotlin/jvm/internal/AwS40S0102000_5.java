package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C2188811AlT;
import X.C354090DuR;
import X.C355090Dw3;
import X.C376260Ep6;
import X.InterfaceC354120DuU;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS40S0102000_5 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS40S0102000_5 awS40S0102000_5) {
        ((C376260Ep6) awS40S0102000_5.l0).LLLLLJIL(awS40S0102000_5.i1, awS40S0102000_5.i2, "preview_content");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S0102000_5 awS40S0102000_5) {
        C0E48 c0e48;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MattingLifecycle - onMattingErrorCallback error=");
        sbLIZ.append(awS40S0102000_5.i1);
        sbLIZ.append(" ext=");
        sbLIZ.append(awS40S0102000_5.i2);
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
        int i = awS40S0102000_5.i1;
        int i2 = awS40S0102000_5.i2;
        for (InterfaceC354120DuU interfaceC354120DuU : copyOnWriteArraySet) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append("");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(i2);
            sbLIZ3.append("");
            interfaceC354120DuU.LIZ("", strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (!C354090DuR.LIZ.isEmpty() && (c0e48 = (C0E48) awS40S0102000_5.l0) != null) {
            c0e48.S7().LIZIZ(Boolean.TRUE, "editing_matting_task_ready", true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0102000_5(int i, int i2, C0E48 c0e48, int i3) {
        super(0);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = c0e48;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0102000_5(C376260Ep6 c376260Ep6, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c376260Ep6;
        this.i1 = i;
        this.i2 = i2;
    }
}
