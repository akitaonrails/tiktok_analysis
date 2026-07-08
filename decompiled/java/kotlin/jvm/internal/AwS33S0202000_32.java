package kotlin.jvm.internal;

import X.AbstractRunnableC21164217s0;
import X.C09AY;
import X.C1202330hOR;
import X.C15438062q;
import X.C1766560w4U;
import X.C21172017tG;
import X.C21332318e1;
import X.C2188811AlT;
import X.C2441009hQ;
import android.view.View;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS33S0202000_32 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS33S0202000_32 awS33S0202000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedScrollAccepted: child=");
        sbLIZ.append((View) awS33S0202000_32.l0);
        sbLIZ.append(", target=");
        sbLIZ.append((View) awS33S0202000_32.l1);
        sbLIZ.append(", axes=");
        sbLIZ.append(awS33S0202000_32.i2);
        sbLIZ.append(", type=");
        sbLIZ.append(awS33S0202000_32.i3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS33S0202000_32 awS33S0202000_32) {
        boolean z;
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(((AbsSceneAdaptationScene) awS33S0202000_32.l0).requireFragmentActivity());
        tuxImmersionBarLJ.LIZIZ.LJIIL();
        tuxImmersionBarLJ.LJ(((C1202330hOR) awS33S0202000_32.l1).LJI);
        boolean z2 = false;
        tuxImmersionBarLJ.LIZ(false);
        tuxImmersionBarLJ.LIZJ(false, false);
        if (C2441009hQ.LJIIIIZZ(awS33S0202000_32.i2) > 0.5d) {
            z = true;
        } else {
            z = false;
        }
        tuxImmersionBarLJ.LIZIZ.LJIIJ(z);
        if (C2441009hQ.LJIIIIZZ(awS33S0202000_32.i3) > 0.5d) {
            z2 = true;
        }
        tuxImmersionBarLJ.LIZIZ.LJII(z2);
        tuxImmersionBarLJ.LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS33S0202000_32 awS33S0202000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedScrollAccepted: child=");
        sbLIZ.append((View) awS33S0202000_32.l0);
        sbLIZ.append(", target=");
        sbLIZ.append((View) awS33S0202000_32.l1);
        sbLIZ.append(", axes=");
        sbLIZ.append(awS33S0202000_32.i2);
        sbLIZ.append(", type=");
        sbLIZ.append(awS33S0202000_32.i3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS33S0202000_32 awS33S0202000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result:");
        sbLIZ.append((Integer) awS33S0202000_32.l0);
        sbLIZ.append(",childCount:");
        sbLIZ.append(awS33S0202000_32.i2);
        sbLIZ.append(",drawIndex:");
        sbLIZ.append(awS33S0202000_32.i3);
        sbLIZ.append("biz:");
        sbLIZ.append(((C21332318e1) awS33S0202000_32.l1).LIZ.LL.LIZ.LIZIZ);
        sbLIZ.append(",tempName:");
        sbLIZ.append(((C21332318e1) awS33S0202000_32.l1).LIZ.LL.LJIIJJI());
        sbLIZ.append(",key:");
        sbLIZ.append(((C21332318e1) awS33S0202000_32.l1).LIZ.getElementId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS33S0202000_32 awS33S0202000_32) {
        StringBuilder sb = new StringBuilder("Bucket ");
        sb.append(awS33S0202000_32.i2);
        sb.append(" is running, last execution order is ");
        sb.append(awS33S0202000_32.i3);
        sb.append(", offer ");
        sb.append(((C21172017tG) awS33S0202000_32.l0).LL);
        sb.append(" to pending queue. Queue review is ");
        LinkedList<AbstractRunnableC21164217s0> linkedList = (LinkedList) awS33S0202000_32.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedList, 10));
        for (AbstractRunnableC21164217s0 abstractRunnableC21164217s0 : linkedList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(abstractRunnableC21164217s0.LLILLL);
            sbLIZ.append('-');
            sbLIZ.append(abstractRunnableC21164217s0.LLILZ);
            sbLIZ.append('-');
            sbLIZ.append(abstractRunnableC21164217s0.LL);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append(arrayList);
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS33S0202000_32(int i, int i2, int i3, C21172017tG c21172017tG, LinkedList<AbstractRunnableC21164217s0> linkedList) {
        super(0);
        this.$t = linkedList;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = i3;
        this.l1 = c21172017tG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0202000_32(View view, View view2, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = view;
        this.l1 = view2;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0202000_32(AbsSceneAdaptationScene absSceneAdaptationScene, C1202330hOR c1202330hOR, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = absSceneAdaptationScene;
        this.l1 = c1202330hOR;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0202000_32(Integer num, int i, int i2, C21332318e1 c21332318e1, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = num;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = c21332318e1;
    }
}
