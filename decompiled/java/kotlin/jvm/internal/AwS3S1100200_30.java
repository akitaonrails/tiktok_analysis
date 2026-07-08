package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C823050WQl;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.business.video.PNSVideoViewService;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS3S1100200_30;

/* JADX INFO: loaded from: classes31.dex */
public class AwS3S1100200_30 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S1100200_30 awS3S1100200_30) {
        ExecutorService executorServiceLIZIZ = C823050WQl.LIZIZ();
        final long j = awS3S1100200_30.j2;
        final PNSVideoViewService pNSVideoViewService = (PNSVideoViewService) awS3S1100200_30.l1;
        final long j2 = awS3S1100200_30.j3;
        final String str = awS3S1100200_30.s0;
        executorServiceLIZIZ.submit(new Runnable() { // from class: X.13Ui
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PNSVideoViewService@5ce4.recordVV$2$1");
                try {
                    C0VY3.LIZIZ("PNSVideoViewService", new AwS3S1100200_30(j, pNSVideoViewService, j2, str, 1));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PNSVideoViewService@5ce4.recordVV$2$1");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S1100200_30 awS3S1100200_30) {
        if (awS3S1100200_30.j2 <= 200) {
            ((Keva) ((PNSVideoViewService) awS3S1100200_30.l1).LIZ.getValue()).storeLong("vv_count_install", awS3S1100200_30.j2);
        }
        if (awS3S1100200_30.j3 <= 200) {
            Keva keva = (Keva) ((PNSVideoViewService) awS3S1100200_30.l1).LIZ.getValue();
            PNSVideoViewService pNSVideoViewService = (PNSVideoViewService) awS3S1100200_30.l1;
            String str = awS3S1100200_30.s0;
            pNSVideoViewService.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_vv_count_install");
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), awS3S1100200_30.j3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1100200_30(long j, PNSVideoViewService pNSVideoViewService, long j2, String str, int i) {
        super(0);
        this.$t = i;
        this.j2 = j;
        this.l1 = pNSVideoViewService;
        this.j3 = j2;
        this.s0 = str;
    }
}
