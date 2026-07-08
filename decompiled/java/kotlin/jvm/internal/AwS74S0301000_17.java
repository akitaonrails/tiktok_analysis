package kotlin.jvm.internal;

import X.AbstractC1126600fQI;
import X.AbstractC1136420fg8;
import X.AbstractC1136440fgA;
import X.AnonymousClass0054;
import X.C01AG;
import X.C01AN;
import X.C09AY;
import X.C1121950fIn;
import X.C1127050fR1;
import X.C1128910fU1;
import X.C1129480fUw;
import X.C1135280feI;
import X.C1143680frq;
import X.C1146270fw1;
import X.C1324720kZq;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1136020ffU;
import Y.ARunnableS113S0100000_13;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS74S0301000_17 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS74S0301000_17 awS74S0301000_17) {
        ((AbstractC1136440fgA) awS74S0301000_17.l0).getClass();
        ((AbstractC1136440fgA) awS74S0301000_17.l0).LJIIL(awS74S0301000_17.i3, (GiftMessage) awS74S0301000_17.l1, (C1135280feI) awS74S0301000_17.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS74S0301000_17 awS74S0301000_17) {
        ((AbstractC1136440fgA) awS74S0301000_17.l0).LJIILJJIL(awS74S0301000_17.i3, (GiftMessage) awS74S0301000_17.l1, (C1135280feI) awS74S0301000_17.l2, "prepareAssetsModel fail", null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS74S0301000_17 awS74S0301000_17) {
        int i;
        if (((Boolean) awS74S0301000_17.l0).booleanValue()) {
            i = ((C1121950fIn) awS74S0301000_17.l1).LLILZLL;
        } else {
            i = ((C1121950fIn) awS74S0301000_17.l1).LLILZIL;
        }
        if (i == awS74S0301000_17.i3) {
            ((Function0) awS74S0301000_17.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS74S0301000_17 awS74S0301000_17) {
        ((AbstractC1136420fg8) awS74S0301000_17.l0).getClass();
        ((AbstractC1136420fg8) awS74S0301000_17.l0).LJIILJJIL(awS74S0301000_17.i3, (InterfaceC1136020ffU) awS74S0301000_17.l1, (C1135280feI) awS74S0301000_17.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS74S0301000_17 awS74S0301000_17) {
        ((AbstractC1136420fg8) awS74S0301000_17.l0).LJIILLIIL(awS74S0301000_17.i3, (InterfaceC1136020ffU) awS74S0301000_17.l1, (C1135280feI) awS74S0301000_17.l2, "prepareAssetsModel fail", null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS74S0301000_17 awS74S0301000_17) {
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        C1129480fUw c1129480fUw = (C1129480fUw) ((LinkedHashMap) ((C1128910fU1) awS74S0301000_17.l0).LJIIIIZZ).get((C01AG) awS74S0301000_17.l1);
        if (c1129480fUw != null) {
            c1129480fUw.LLILLL = awS74S0301000_17.i3;
        }
        List<AbstractC1126600fQI<? extends AnonymousClass0054>> listInvoke = ((C1128910fU1) awS74S0301000_17.l0).LJFF.invoke();
        if (listInvoke != null) {
            C01AN c01an = (C01AN) awS74S0301000_17.l2;
            listInvoke.addAll(c01an.LIZ, c01an.LIZJ);
        }
        C1127050fR1 c1127050fR1 = ((C1128910fU1) awS74S0301000_17.l0).LIZJ;
        if (c1127050fR1 != null && (linkedList = c1127050fR1.LL) != null) {
            C01AN c01an2 = (C01AN) awS74S0301000_17.l2;
            linkedList.addAll(c01an2.LIZ, c01an2.LIZJ);
        }
        C1127050fR1 c1127050fR12 = ((C1128910fU1) awS74S0301000_17.l0).LIZJ;
        if (c1127050fR12 != null) {
            C01AN c01an3 = (C01AN) awS74S0301000_17.l2;
            c1127050fR12.notifyItemRangeInserted(c01an3.LIZ, c01an3.LIZJ.size());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS74S0301000_17 awS74S0301000_17) {
        C1324720kZq c1324720kZq;
        C1324720kZq c1324720kZq2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1146270fw1) awS74S0301000_17.l0).getNameTag());
        sbLIZ.append(' ');
        sbLIZ.append(((C1146270fw1) awS74S0301000_17.l0).LLJILJIL);
        sbLIZ.append(" onEnd isPoweringUp = ");
        sbLIZ.append(((C1146270fw1) awS74S0301000_17.l0).LLJJ);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        C1146270fw1 c1146270fw1 = (C1146270fw1) awS74S0301000_17.l0;
        if (c1146270fw1.LLJJ) {
            FrameLayout frameLayout = (FrameLayout) awS74S0301000_17.l1;
            if (frameLayout != null) {
                c1146270fw1.LLJJIII = frameLayout;
                c1146270fw1.LLJJIJI = new C1324720kZq(frameLayout.getContext());
                C1324720kZq c1324720kZq3 = c1146270fw1.LLJJIJI;
                if (c1324720kZq3 != null) {
                    C786410Ut5.W5(c1324720kZq3, c1146270fw1.LIZJ(frameLayout));
                }
                frameLayout.addView(c1146270fw1.LLJJIJI);
                c1146270fw1.LLJJIJIIJIL = true;
                C1143680frq.LJ(c1146270fw1.LLJJIJI, "tiktok_live_interaction_demand_16", "seat_top2_animation.webp", ImageView.ScaleType.CENTER_INSIDE);
            }
            C1146270fw1 c1146270fw12 = (C1146270fw1) awS74S0301000_17.l0;
            FrameLayout frameLayout2 = (FrameLayout) awS74S0301000_17.l1;
            int i = awS74S0301000_17.i3;
            c1146270fw12.getClass();
            if (frameLayout2 != null) {
                c1146270fw12.LLJJIJIL = new C1324720kZq(frameLayout2.getContext());
                C1324720kZq c1324720kZq4 = c1146270fw12.LLJJIJIL;
                if (c1324720kZq4 != null) {
                    C786410Ut5.W5(c1324720kZq4, c1146270fw12.LIZLLL(frameLayout2));
                }
                frameLayout2.addView(c1146270fw12.LLJJIJIL);
                C1324720kZq c1324720kZq5 = c1146270fw12.LLJJIJIL;
                if ((c1324720kZq5 instanceof C1324720kZq) && c1324720kZq5 != null) {
                    c1324720kZq5.setActualImageResource(c1146270fw12.LJI(i, c1146270fw12.LLJ));
                }
            }
            C1146270fw1 c1146270fw13 = (C1146270fw1) awS74S0301000_17.l0;
            if (!c1146270fw13.LLILLJJLI && (c1324720kZq2 = c1146270fw13.LLILZLL) != null) {
                HandlerHook.viewPostDelay(c1324720kZq2, new ARunnableS113S0100000_13(c1146270fw13, 308), 10L);
            }
        }
        C1146270fw1 c1146270fw14 = (C1146270fw1) awS74S0301000_17.l0;
        if (!c1146270fw14.LLJJ && !c1146270fw14.LLILLJJLI && (c1324720kZq = c1146270fw14.LLILZLL) != null) {
            C500260Jjc.LJIILLIIL(c1324720kZq);
        }
        Function0 function0 = (Function0) awS74S0301000_17.l2;
        if (function0 != null) {
            function0.invoke();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((C1146270fw1) awS74S0301000_17.l0).getNameTag());
        sbLIZ2.append(' ');
        sbLIZ2.append(((C1146270fw1) awS74S0301000_17.l0).LLJILJIL);
        sbLIZ2.append(" onEnd false isInProcessQueue = ");
        sbLIZ2.append(((C1146270fw1) awS74S0301000_17.l0).LLJILLL);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ2));
        C1146270fw1 c1146270fw15 = (C1146270fw1) awS74S0301000_17.l0;
        c1146270fw15.LLJILLL = false;
        c1146270fw15.LLJILJIL = 0;
        c1146270fw15.LJII();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S0301000_17(C1128910fU1 c1128910fU1, C01AG c01ag, int i, C01AN c01an, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1128910fU1;
        this.l1 = c01ag;
        this.i3 = i;
        this.l2 = c01an;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S0301000_17(AbstractC1136420fg8 abstractC1136420fg8, int i, InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = abstractC1136420fg8;
        this.i3 = i;
        this.l1 = interfaceC1136020ffU;
        this.l2 = c1135280feI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S0301000_17(AbstractC1136440fgA abstractC1136440fgA, int i, GiftMessage giftMessage, C1135280feI c1135280feI, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = abstractC1136440fgA;
        this.i3 = i;
        this.l1 = giftMessage;
        this.l2 = c1135280feI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS74S0301000_17(C1146270fw1 c1146270fw1, C1146270fw1 c1146270fw12, FrameLayout frameLayout, int i, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c1146270fw1;
        this.l1 = c1146270fw12;
        this.i3 = frameLayout;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS74S0301000_17(Boolean bool, Boolean bool2, C1121950fIn c1121950fIn, int i, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = bool;
        this.l1 = bool2;
        this.i3 = c1121950fIn;
        this.l2 = i;
    }
}
