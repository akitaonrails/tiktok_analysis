package kotlin.jvm.internal;

import X.C09AY;
import X.C1488750oqP;
import X.C1512540pSm;
import X.C1515820pY4;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS44S0200100_23 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS44S0200100_23 awS44S0200100_23) {
        LivePreviewPlayerWidget livePreviewPlayerWidget = (LivePreviewPlayerWidget) awS44S0200100_23.l0;
        C1512540pSm c1512540pSm = (C1512540pSm) awS44S0200100_23.l1;
        LivePreviewPlayerWidget.g2(livePreviewPlayerWidget, c1512540pSm.LIZ, awS44S0200100_23.j2, c1512540pSm.LIZJ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS44S0200100_23 awS44S0200100_23) {
        return ((C1488750oqP) awS44S0200100_23.l0).LIZ((VideoInfo) awS44S0200100_23.l1, awS44S0200100_23.j2, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS44S0200100_23 awS44S0200100_23) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] stage=timeout_scheduled requestId=");
        sbLIZ.append(((C1515820pY4) awS44S0200100_23.l0).LLILLL);
        sbLIZ.append(" scheduledTimeoutAt=");
        sbLIZ.append((Long) awS44S0200100_23.l1);
        sbLIZ.append(" token=");
        sbLIZ.append(awS44S0200100_23.j2);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0200100_23(C1488750oqP c1488750oqP, VideoInfo videoInfo, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1488750oqP;
        this.l1 = videoInfo;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AwS44S0200100_23) (LINE:67174400) kotlin.jvm.internal.AwS44S0200100_23.$t int, block:B:2:0x0000 */
    public AwS44S0200100_23(C1515820pY4 c1515820pY4, C1515820pY4<byte[]> c1515820pY42, Long l, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l0 = c1515820pY4;
        this.l1 = c1515820pY42;
        this.j2 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS44S0200100_23(LivePreviewPlayerWidget livePreviewPlayerWidget, C1512540pSm c1512540pSm, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = livePreviewPlayerWidget;
        this.l1 = c1512540pSm;
        this.j2 = j;
    }
}
