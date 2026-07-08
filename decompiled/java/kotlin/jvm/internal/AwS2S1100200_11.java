package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C700170RdH;
import X.C701270Rf3;
import X.InterfaceC1449905lx;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS2S1100200_11 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public long j3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S1100200_11 awS2S1100200_11) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(awS2S1100200_11.j2);
        sbLIZ.append(" --- ");
        C700170RdH c700170RdH = (C700170RdH) awS2S1100200_11.l1;
        if (c700170RdH != null) {
            str = c700170RdH.LIZLLL;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" --- reduce ");
        sbLIZ.append(awS2S1100200_11.s0);
        sbLIZ.append(" end, duration: ");
        sbLIZ.append(awS2S1100200_11.j2 - awS2S1100200_11.j3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS2S1100200_11 awS2S1100200_11) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(awS2S1100200_11.j2);
        sbLIZ.append(" --- ");
        C700170RdH c700170RdH = ((C701270Rf3) ((InterfaceC1449905lx) awS2S1100200_11.l1).getState()).LIZIZ;
        if (c700170RdH != null) {
            str = c700170RdH.LIZLLL;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" --- reduce ");
        sbLIZ.append(awS2S1100200_11.s0);
        sbLIZ.append(" end, duration: ");
        sbLIZ.append(awS2S1100200_11.j2 - awS2S1100200_11.j3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS2S1100200_11 awS2S1100200_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePhotoViewHolder) awS2S1100200_11.l1).hashCode());
        sbLIZ.append(" onPlayProgressChange sourceId: ");
        sbLIZ.append(awS2S1100200_11.s0);
        sbLIZ.append(" position: ");
        sbLIZ.append(awS2S1100200_11.j2);
        sbLIZ.append(" duration: ");
        sbLIZ.append(awS2S1100200_11.j3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS2S1100200_11) (LINE:83886083) kotlin.jvm.internal.AwS2S1100200_11.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS2S1100200_11) (LINE:83886085) kotlin.jvm.internal.AwS2S1100200_11.l1 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0000: IPUT (r9 I:int), (r2 I:kotlin.jvm.internal.AwS2S1100200_11) (LINE:83886080) kotlin.jvm.internal.AwS2S1100200_11.$t int, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS2S1100200_11] */
    public AwS2S1100200_11(long j, long j2, InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx, String str, long j3) {
        int i;
        long j4;
        Object obj;
        c09ay.$t = i;
        c09ay.j2 = j4;
        c09ay.l1 = obj;
        c09ay.s0 = interfaceC1449905lx;
        c09ay.j3 = str;
        ?? c09ay = new C09AY(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1100200_11(long j, C700170RdH c700170RdH, String str, long j2, int i) {
        super(0);
        this.$t = i;
        this.j2 = j;
        this.l1 = c700170RdH;
        this.s0 = str;
        this.j3 = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1100200_11(LivePhotoViewHolder livePhotoViewHolder, String str, long j, long j2, int i) {
        super(0);
        this.$t = i;
        this.l1 = livePhotoViewHolder;
        this.s0 = str;
        this.j2 = j;
        this.j3 = j2;
    }
}
