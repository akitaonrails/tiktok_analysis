package kotlin.jvm.internal;

import X.C044700Eb;
import X.C09AY;
import X.C1834780xqW;
import X.C291001Au;
import com.bytedance.android.livesdk.replay.proto.Caption;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS26S0200100_4 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS26S0200100_4 awS26S0200100_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C044700Eb(awS26S0200100_4.j2, (List) awS26S0200100_4.l0, (Integer) awS26S0200100_4.l1)), 262143);
    }

    public static final Object invoke$1(AwS26S0200100_4 awS26S0200100_4, Object obj) {
        long j = awS26S0200100_4.j2;
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C044700Eb(j, (List) awS26S0200100_4.l0, (Integer) ((LinkedHashMap) ((LiveHighlightViewModel) awS26S0200100_4.l1).LLJI).get(Long.valueOf(j)))), 262143);
    }

    public static final Object invoke$2(AwS26S0200100_4 awS26S0200100_4, Object obj) {
        long j = awS26S0200100_4.j2;
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C044700Eb(j, (List) awS26S0200100_4.l0, (Integer) ((LinkedHashMap) ((LiveHighlightViewModel) awS26S0200100_4.l1).LLJI).get(Long.valueOf(j)))), 262143);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS26S0200100_4) (LINE:67108867) kotlin.jvm.internal.AwS26S0200100_4.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS26S0200100_4) (LINE:67108869) kotlin.jvm.internal.AwS26S0200100_4.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS26S0200100_4] */
    public AwS26S0200100_4(long j, long j2, List<Caption> list, LiveHighlightViewModel liveHighlightViewModel) {
        long j3;
        Object obj;
        c09ay.$t = liveHighlightViewModel;
        c09ay.j2 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = list;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS26S0200100_4) (LINE:67174403) kotlin.jvm.internal.AwS26S0200100_4.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS26S0200100_4) (LINE:67174405) kotlin.jvm.internal.AwS26S0200100_4.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS26S0200100_4] */
    public AwS26S0200100_4(long j, long j2, List<Caption> list, Integer num) {
        long j3;
        Object obj;
        c09ay.$t = num;
        c09ay.j2 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = list;
        ?? c09ay = new C09AY(1);
    }
}
