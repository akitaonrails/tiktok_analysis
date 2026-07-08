package kotlin.jvm.internal;

import X.C09AY;
import X.C0VSJ;
import X.C201955140j;
import X.C2188811AlT;
import X.C2354709Kn;
import X.C354090DuR;
import X.C355090Dw3;
import X.InterfaceC354120DuU;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS90S1000000_5 extends C09AY implements Function0 {
    public final int $t;
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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS90S1000000_5 awS90S1000000_5) {
        if (C2354709Kn.LIZIZ(awS90S1000000_5.s0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEFeedbackLog : ");
            sbLIZ.append("has useless nle data file, delete it ");
            C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
            C2354709Kn.LJIJJLI(awS90S1000000_5.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS90S1000000_5 awS90S1000000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("1.1 origin string: ");
        sbLIZ.append(awS90S1000000_5.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS90S1000000_5 awS90S1000000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("1.2 insert blank by text-framework: ");
        sbLIZ.append(awS90S1000000_5.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS90S1000000_5 awS90S1000000_5) {
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
        String str = awS90S1000000_5.s0;
        Iterator<InterfaceC354120DuU> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS90S1000000_5 awS90S1000000_5) {
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
        String str = awS90S1000000_5.s0;
        Iterator<InterfaceC354120DuU> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS90S1000000_5 awS90S1000000_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClear onClearUnCompleteRes  ");
        sbLIZ.append(awS90S1000000_5.s0);
        sbLIZ.append(' ');
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        new C0VSJ(awS90S1000000_5.s0).delete();
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
        C354090DuR.LIZJ(new C0VSJ(awS90S1000000_5.s0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1000000_5(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S1000000_5(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str2;
    }
}
