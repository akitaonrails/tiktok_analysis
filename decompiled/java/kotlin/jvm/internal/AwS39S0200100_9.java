package kotlin.jvm.internal;

import X.C09AY;
import X.C0NDM;
import X.C0NDV;
import X.C0OPQ;
import X.C2097608Jq;
import X.C259800zU;
import X.C590280NDe;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.profile.BulletinBoardProfileEntranceAssem;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS39S0200100_9 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List] */
    public static final Object invoke$0(AwS39S0200100_9 awS39S0200100_9) {
        C259800zU c259800zU = (C259800zU) awS39S0200100_9.l0;
        C0NDV.LIZ.getClass();
        c259800zU.element = C0NDV.LJII().LJIILJJIL(((C0NDM) awS39S0200100_9.l1).getType(), awS39S0200100_9.j2, System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S0200100_9 awS39S0200100_9) {
        ((BulletinBoardProfileEntranceAssem) awS39S0200100_9.l0).Ho().yQ2();
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(awS39S0200100_9.j2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "bulletin_board_detail_page"), new Pair("action_type", "click"), new Pair("click_type", "delete"));
        c0opq.getClass();
        C0OPQ.LJIJI(strValueOf, mapLJIIIIZZ);
        ((Function0) awS39S0200100_9.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS39S0200100_9 awS39S0200100_9) {
        ((BulletinBoardProfileEntranceAssem) awS39S0200100_9.l0).Ho().xQ2();
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(awS39S0200100_9.j2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("action_type", "click"), new Pair("click_type", "confirm"));
        c0opq.getClass();
        C0OPQ.LJIIJJI(strValueOf, mapLJIIIIZZ);
        ((Function0) awS39S0200100_9.l1).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS39S0200100_9) (LINE:67108864) kotlin.jvm.internal.AwS39S0200100_9.$t int, block:B:2:0x0000 */
    public AwS39S0200100_9(C259800zU c259800zU, C259800zU<List<C590280NDe>> c259800zU2, C0NDM c0ndm, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.j2 = c0ndm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS39S0200100_9) (LINE:67174407) kotlin.jvm.internal.AwS39S0200100_9.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS39S0200100_9(BulletinBoardProfileEntranceAssem bulletinBoardProfileEntranceAssem, BulletinBoardProfileEntranceAssem bulletinBoardProfileEntranceAssem2, long j, Function0<Unit> function0) {
        Object obj;
        super(0);
        this.$t = function0;
        this.l0 = bulletinBoardProfileEntranceAssem;
        this.j2 = bulletinBoardProfileEntranceAssem2;
        this.l1 = obj;
    }
}
