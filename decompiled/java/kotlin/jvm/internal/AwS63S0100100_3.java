package kotlin.jvm.internal;

import X.C09AY;
import X.C0OPQ;
import X.C12WG;
import X.C2097608Jq;
import X.C936400aTW;
import X.InterfaceC1631620sYq;
import Y.ARunnableS103S0100000_3;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS63S0100100_3 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS63S0100100_3 awS63S0100100_3) {
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) awS63S0100100_3.l0;
        C12WG.LIZLLL(mvChoosePhotoScene, new ARunnableS103S0100000_3(mvChoosePhotoScene, 48), awS63S0100100_3.j1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS63S0100100_3 awS63S0100100_3) {
        ((InterfaceC1631620sYq) awS63S0100100_3.l0).invoke(7, "", 0L);
        C936400aTW.LIZLLL((int) ((System.currentTimeMillis() - awS63S0100100_3.j1) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 7, "get token fail", false);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS63S0100100_3 awS63S0100100_3) {
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(awS63S0100100_3.j1);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("action_type", "click"), new Pair("click_type", "cancel"));
        c0opq.getClass();
        C0OPQ.LJIIJJI(strValueOf, mapLJIIIIZZ);
        ((Function0) awS63S0100100_3.l0).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S0100100_3(long j, InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1631620sYq;
        this.j1 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS63S0100100_3) (LINE:50397187) kotlin.jvm.internal.AwS63S0100100_3.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS63S0100100_3) (LINE:50397189) kotlin.jvm.internal.AwS63S0100100_3.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS63S0100100_3] */
    public AwS63S0100100_3(long j, long j2, Function0<Unit> function0) {
        long j3;
        Object obj;
        c09ay.$t = function0;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S0100100_3(MvChoosePhotoScene mvChoosePhotoScene, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = mvChoosePhotoScene;
        this.j1 = j;
    }
}
