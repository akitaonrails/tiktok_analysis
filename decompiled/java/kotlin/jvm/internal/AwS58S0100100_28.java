package kotlin.jvm.internal;

import X.C09AY;
import X.C10TK;
import X.C1898920zVy;
import X.C786410Ut5;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS97S0200000_28;
import android.os.Handler;
import com.bytedance.incentive.taskevent.watchvideo.AdWatchVideoTaskTrigger;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS58S0100100_28 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS58S0100100_28 awS58S0100100_28, Object obj) {
        AdWatchVideoTaskTrigger.AdExtraParam adExtraParamLJIILLIIL;
        int iIntValue;
        int iIntValue2;
        C1898920zVy c1898920zVy = (C1898920zVy) obj;
        AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = (AdWatchVideoTaskTrigger) awS58S0100100_28.l0;
        if (adWatchVideoTaskTrigger.LLJJIJIL && (adExtraParamLJIILLIIL = adWatchVideoTaskTrigger.LJIILLIIL()) != null) {
            String str = adExtraParamLJIILLIIL.taskId;
            if (str == null) {
                str = "";
            }
            Integer num = adExtraParamLJIILLIIL.completedTimes;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            Integer num2 = adExtraParamLJIILLIIL.engagementType;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            IIncentiveAdService iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
            if (iIncentiveAdService != null) {
                iIncentiveAdService.LJII(iIntValue, iIntValue2, str);
            }
        }
        long jCurrentTimeMillis = (1000 - System.currentTimeMillis()) + awS58S0100100_28.j1;
        if (c1898920zVy.LIZIZ == null) {
            AdWatchVideoTaskTrigger adWatchVideoTaskTrigger2 = (AdWatchVideoTaskTrigger) awS58S0100100_28.l0;
            ARunnableS128S0100000_28 aRunnableS128S0100000_28 = new ARunnableS128S0100000_28(adWatchVideoTaskTrigger2, 16);
            if (jCurrentTimeMillis >= 0) {
                C786410Ut5.LJLIIL(jCurrentTimeMillis, (Handler) adWatchVideoTaskTrigger2.LLJJJIL.getValue(), aRunnableS128S0100000_28);
            } else {
                adWatchVideoTaskTrigger2.getClass();
                aRunnableS128S0100000_28.run();
            }
            IIncentiveAdService iIncentiveAdService2 = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
            if (iIncentiveAdService2 != null) {
                iIncentiveAdService2.LJIIIZ(false, Boolean.FALSE);
            }
        } else {
            AdWatchVideoTaskTrigger adWatchVideoTaskTrigger3 = (AdWatchVideoTaskTrigger) awS58S0100100_28.l0;
            ARunnableS97S0200000_28 aRunnableS97S0200000_28 = new ARunnableS97S0200000_28(adWatchVideoTaskTrigger3, c1898920zVy, 4);
            if (jCurrentTimeMillis >= 0) {
                C786410Ut5.LJLIIL(jCurrentTimeMillis, (Handler) adWatchVideoTaskTrigger3.LLJJJIL.getValue(), aRunnableS97S0200000_28);
            } else {
                adWatchVideoTaskTrigger3.getClass();
                aRunnableS97S0200000_28.run();
            }
            IIncentiveAdService iIncentiveAdService3 = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
            if (iIncentiveAdService3 != null) {
                iIncentiveAdService3.LJIIIZ(true, Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS58S0100100_28 awS58S0100100_28, Object obj) {
        C10TK c10tk = C10TK.LIZ;
        long j = awS58S0100100_28.j1;
        c10tk.getClass();
        C10TK.LIZIZ(-110, j);
        ((Function0) awS58S0100100_28.l0).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS58S0100100_28) (LINE:50331651) kotlin.jvm.internal.AwS58S0100100_28.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS58S0100100_28) (LINE:50331653) kotlin.jvm.internal.AwS58S0100100_28.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS58S0100100_28] */
    public AwS58S0100100_28(long j, long j2, Function0<Unit> function0) {
        long j3;
        Object obj;
        c09ay.$t = function0;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S0100100_28(AdWatchVideoTaskTrigger adWatchVideoTaskTrigger, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = adWatchVideoTaskTrigger;
        this.j1 = j;
    }
}
