package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C2188811AlT;
import X.C354090DuR;
import X.C355090Dw3;
import X.C356900Dyy;
import X.C357320Dze;
import X.InterfaceC354120DuU;
import X.InterfaceC356810Dyp;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS34S1101000_5 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS34S1101000_5 awS34S1101000_5) {
        if (((Map) awS34S1101000_5.l1).get(Integer.valueOf(awS34S1101000_5.i2)) == null) {
            ((Map) awS34S1101000_5.l1).put(Integer.valueOf(awS34S1101000_5.i2), new MutableLiveData());
        }
        LiveData liveData = (LiveData) ((Map) awS34S1101000_5.l1).get(Integer.valueOf(awS34S1101000_5.i2));
        if (liveData != null) {
            liveData.setValue(awS34S1101000_5.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS34S1101000_5 awS34S1101000_5) {
        InterfaceC356810Dyp interfaceC356810Dyp = ((C357320Dze) awS34S1101000_5.l1).LIZJ;
        if (interfaceC356810Dyp != null) {
            int i = awS34S1101000_5.i2;
            String str = awS34S1101000_5.s0;
            if (str == null) {
                str = "";
            }
            interfaceC356810Dyp.LIZ(new C356900Dyy(i, str));
        }
        ((C357320Dze) awS34S1101000_5.l1).LIZJ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS34S1101000_5 awS34S1101000_5) {
        InterfaceC356810Dyp interfaceC356810Dyp = ((C357320Dze) awS34S1101000_5.l1).LIZJ;
        if (interfaceC356810Dyp != null) {
            int i = awS34S1101000_5.i2;
            String str = awS34S1101000_5.s0;
            if (str == null) {
                str = "";
            }
            interfaceC356810Dyp.LIZ(new C356900Dyy(i, str));
        }
        ((C357320Dze) awS34S1101000_5.l1).LIZJ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS34S1101000_5 awS34S1101000_5) {
        C0E48 c0e48;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MattingLifecycle - onMattingErrorCallback error=");
        sbLIZ.append(awS34S1101000_5.i2);
        sbLIZ.append(" slotUUID=");
        sbLIZ.append(awS34S1101000_5.s0);
        sbLIZ.append(" curMattingState.mattingType=");
        sbLIZ.append(C354090DuR.LJIIJ.LIZIZ);
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
        String str = awS34S1101000_5.s0;
        int i = awS34S1101000_5.i2;
        for (InterfaceC354120DuU interfaceC354120DuU : copyOnWriteArraySet) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append("");
            interfaceC354120DuU.LIZ(str, C2188811AlT.LIZIZ(sbLIZ2), "");
        }
        if (!C354090DuR.LIZ.isEmpty() && (c0e48 = (C0E48) awS34S1101000_5.l1) != null) {
            c0e48.S7().LIZIZ(Boolean.TRUE, "editing_matting_task_ready", true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S1101000_5(int i, String str, C0E48 c0e48, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = c0e48;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S1101000_5(C357320Dze c357320Dze, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c357320Dze;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS34S1101000_5(Map map, Map<Integer, MutableLiveData<String>> map2, int i, String str) {
        super(0);
        this.$t = str;
        this.l1 = map;
        this.i2 = map2;
        this.s0 = i;
    }
}
