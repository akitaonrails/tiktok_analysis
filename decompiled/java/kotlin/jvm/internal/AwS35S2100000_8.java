package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C2188811AlT;
import X.C23250099c;
import X.C544690LXv;
import android.app.Activity;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.aigc.quality.trace.TraceErrorContext;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS35S2100000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS35S2100000_8 awS35S2100000_8, Object obj) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((AIGCOfflineProcessingViewModel) awS35S2100000_8.l2), C0PEM.LIZJ, null, new C544690LXv((AIGCOfflineProcessingViewModel) awS35S2100000_8.l2, (Activity) obj, awS35S2100000_8.s0, awS35S2100000_8.s1, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS35S2100000_8 awS35S2100000_8, Object obj) {
        TraceErrorContext traceErrorContext = (TraceErrorContext) obj;
        traceErrorContext.errorCode = (Integer) awS35S2100000_8.l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("step=");
        sbLIZ.append(awS35S2100000_8.s0);
        sbLIZ.append(",msg=");
        sbLIZ.append(awS35S2100000_8.s1);
        traceErrorContext.errorMessage = C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S2100000_8(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = aIGCOfflineProcessingViewModel;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S2100000_8(Integer num, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = num;
        this.s0 = str;
        this.s1 = str2;
    }
}
