package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C475700Il6;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.live.root.tab.nearby.LiveNearbyPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class AwS79S0100100_7 extends C09AY implements Function2 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0100100_7(long j, C475700Il6 c475700Il6, int i) {
        super(2);
        this.$t = i;
        this.j1 = j;
        this.l0 = c475700Il6;
    }

    public static final Object invoke$0(AwS79S0100100_7 awS79S0100100_7, Object obj, Object obj2) {
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        ((LiveNearbyPageFragment) awS79S0100100_7.l0).LLJZIJLIL = SystemClock.uptimeMillis() - awS79S0100100_7.j1;
        ((LiveNearbyPageFragment) awS79S0100100_7.l0).LLL = SystemClock.uptimeMillis();
        LiveNearbyPageFragment liveNearbyPageFragment = (LiveNearbyPageFragment) awS79S0100100_7.l0;
        if (zBooleanValue) {
            str = "1";
        } else {
            liveNearbyPageFragment.LLJLLIL = String.valueOf(iIntValue);
            str = "2";
        }
        liveNearbyPageFragment.LLJLL = str;
        ((LiveNearbyPageFragment) awS79S0100100_7.l0).LLJLLIL = String.valueOf(iIntValue);
        LiveNearbyPageFragment liveNearbyPageFragment2 = (LiveNearbyPageFragment) awS79S0100100_7.l0;
        liveNearbyPageFragment2.LLJJI = false;
        if (liveNearbyPageFragment2.LLILLL) {
            liveNearbyPageFragment2.NR();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS79S0100100_7 awS79S0100100_7, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed[heroId=");
        sbLIZ.append(awS79S0100100_7.j1);
        sbLIZ.append("] to load feed data: ");
        sbLIZ.append((String) obj);
        sbLIZ.append(", loadType: ");
        sbLIZ.append((String) obj2);
        C20441214yg.LJ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
        ((C475700Il6) awS79S0100100_7.l0).LLILZIL = null;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S0100100_7(LiveNearbyPageFragment liveNearbyPageFragment, long j, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveNearbyPageFragment;
        this.j1 = j;
    }
}
