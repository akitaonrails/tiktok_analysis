package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import android.util.Log;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS12S1100100_8 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
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

    public static final Object invoke$0(AwS12S1100100_8 awS12S1100100_8) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("media selection blocked by duration limit, minDuration=");
        sbLIZ.append(awS12S1100100_8.j2);
        sbLIZ.append(", videoInfos: ");
        sbLIZ.append((List) awS12S1100100_8.l1);
        sbLIZ.append("message=");
        sbLIZ.append(awS12S1100100_8.s0);
        sbLIZ.append(", scene=checkMediaDurationValid#0, callStacktrace=");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS12S1100100_8 awS12S1100100_8) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("media selection blocked by duration limit, minDuration=");
        sbLIZ.append(awS12S1100100_8.j2);
        sbLIZ.append(", videoInfos: ");
        sbLIZ.append((List) awS12S1100100_8.l1);
        sbLIZ.append("message=");
        sbLIZ.append(awS12S1100100_8.s0);
        sbLIZ.append(", scene=checkMediaDurationValid#1, callStacktrace=");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS12S1100100_8) (LINE:67108867) kotlin.jvm.internal.AwS12S1100100_8.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS12S1100100_8) (LINE:67108869) kotlin.jvm.internal.AwS12S1100100_8.l1 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS12S1100100_8] */
    public AwS12S1100100_8(long j, long j2, List<? extends MediaModel> list, String str) {
        long j3;
        Object obj;
        c09ay.$t = str;
        c09ay.j2 = j3;
        c09ay.l1 = obj;
        c09ay.s0 = list;
        ?? c09ay = new C09AY(0);
    }
}
