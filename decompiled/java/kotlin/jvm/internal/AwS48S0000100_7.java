package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C480460Ism;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS48S0000100_7 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

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

    public static final Object invoke$0(AwS48S0000100_7 awS48S0000100_7) {
        C480460Ism.LIZ().getClass();
        return ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).requestOffliveInviteInfo(2, awS48S0000100_7.j0).LJJIJLIJ();
    }

    public static final Object invoke$1(AwS48S0000100_7 awS48S0000100_7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed request[heroId=");
        sbLIZ.append(awS48S0000100_7.j0);
        sbLIZ.append("] disposed");
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0000100_7(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
