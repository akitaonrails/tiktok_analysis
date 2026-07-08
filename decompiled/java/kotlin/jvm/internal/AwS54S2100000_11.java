package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C259800zU;
import X.C703900RjI;
import X.C703910RjJ;
import java.util.ArrayDeque;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS54S2100000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS54S2100000_11 awS54S2100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addPoint ");
        sbLIZ.append(awS54S2100000_11.s0);
        sbLIZ.append(' ');
        sbLIZ.append(awS54S2100000_11.s1);
        sbLIZ.append(": ");
        sbLIZ.append(((C259800zU) awS54S2100000_11.l2).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS54S2100000_11 awS54S2100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueuePendingTask drop_capacity_total aid=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS54S2100000_11.s0);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(awS54S2100000_11.s1);
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS54S2100000_11 awS54S2100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runWhenSlotVisibleOrPend immediate_disabled aid=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS54S2100000_11.s0);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(awS54S2100000_11.s1);
        sbLIZ.append(" generation=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS54S2100000_11 awS54S2100000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runWhenSlotVisibleOrPend immediate_visible aid=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS54S2100000_11.s0);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(awS54S2100000_11.s1);
        sbLIZ.append(" generation=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS54S2100000_11 awS54S2100000_11) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runWhenSlotVisibleOrPend enqueue aid=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS54S2100000_11.s0);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(awS54S2100000_11.s1);
        sbLIZ.append(" generation=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LIZJ);
        sbLIZ.append(" visible=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LIZLLL.get(awS54S2100000_11.s0));
        sbLIZ.append(" pendingForSlot=");
        ArrayDeque<C703910RjJ> arrayDeque = ((C703900RjI) awS54S2100000_11.l2).LJ.get(awS54S2100000_11.s0);
        if (arrayDeque != null) {
            size = arrayDeque.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS54S2100000_11.l2).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S2100000_11(C703900RjI c703900RjI, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c703900RjI;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS54S2100000_11(String str, String str2, String str3, C259800zU<Long> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }
}
