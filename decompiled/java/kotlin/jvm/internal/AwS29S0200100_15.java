package kotlin.jvm.internal;

import X.C055500If;
import X.C098J;
import X.C09AY;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C920360a3e;
import X.C924810aAp;
import X.C925310aBd;
import X.C975960bVK;
import X.C975970bVL;
import X.InterfaceC925460aBs;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS29S0200100_15 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS29S0200100_15 awS29S0200100_15, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        long j = awS29S0200100_15.j2;
        RandomMatchFragment randomMatchFragment = (RandomMatchFragment) awS29S0200100_15.l0;
        if (j == randomMatchFragment.LLLJ && !randomMatchFragment.LLLJIL) {
            C1295960jpS c1295960jpS = randomMatchFragment.LLLIIII;
            if (c1295960jpS != null) {
                c1295960jpS.setComposition(c1294720jnS);
            }
            ((Function0) awS29S0200100_15.l1).invoke();
        }
        C20441214yg.LJ("RandomMatchFragment", "afterSetComposition");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S0200100_15 awS29S0200100_15, Object obj) {
        C098J<Long, Boolean> c098j;
        C975970bVL c975970bVL = (C975970bVL) awS29S0200100_15.l0;
        c975970bVL.LJIIIIZZ = true;
        C975960bVK c975960bVK = c975970bVL.LJII;
        if (c975960bVK != null && (c098j = c975960bVK.LJJIZ) != null) {
            c098j.put(Long.valueOf(awS29S0200100_15.j2), Boolean.TRUE);
        }
        C975960bVK c975960bVK2 = ((C975970bVL) awS29S0200100_15.l0).LJII;
        if (c975960bVK2 != null) {
            c975960bVK2.LJJJ = true;
        }
        ((Function0) awS29S0200100_15.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS29S0200100_15 awS29S0200100_15, Object obj) {
        C055500If c055500If = (C055500If) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("join.execute success status=");
        sbLIZ.append(c055500If.LIZ);
        C20441214yg.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C920360a3e.LIZ.getClass();
        C920360a3e.LJFF(1);
        C925310aBd c925310aBd = (C925310aBd) awS29S0200100_15.l0;
        long j = awS29S0200100_15.j2;
        InterfaceC925460aBs interfaceC925460aBs = (InterfaceC925460aBs) awS29S0200100_15.l1;
        c925310aBd.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onReplyInviteSuccess(JoinResult) status=");
        sbLIZ2.append(c055500If.LIZ);
        sbLIZ2.append(" linkTypePermission=");
        sbLIZ2.append(c055500If.LIZIZ);
        C20441214yg.LJIIIZ("MultiGuestV3GuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ2));
        c925310aBd.LIZJ(j, c055500If.LIZIZ, c055500If.LIZJ, c055500If.LIZLLL, c055500If.LJ, interfaceC925460aBs);
        C924810aAp.LJ().LJJIJIL = false;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0200100_15(C925310aBd c925310aBd, long j, InterfaceC925460aBs interfaceC925460aBs, int i) {
        super(1);
        this.$t = i;
        this.l0 = c925310aBd;
        this.j2 = j;
        this.l1 = interfaceC925460aBs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS29S0200100_15) (LINE:67174407) kotlin.jvm.internal.AwS29S0200100_15.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS29S0200100_15(C975970bVL c975970bVL, C975970bVL c975970bVL2, long j, Function0<Unit> function0) {
        Object obj;
        super(1);
        this.$t = function0;
        this.l0 = c975970bVL;
        this.j2 = c975970bVL2;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS29S0200100_15) (LINE:67239936) kotlin.jvm.internal.AwS29S0200100_15.$t int, block:B:2:0x0000 */
    public AwS29S0200100_15(RandomMatchFragment randomMatchFragment, RandomMatchFragment randomMatchFragment2, Function0<Unit> function0, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = randomMatchFragment;
        this.l1 = randomMatchFragment2;
        this.j2 = function0;
    }
}
