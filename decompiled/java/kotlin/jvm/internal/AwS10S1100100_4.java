package kotlin.jvm.internal;

import X.C09AY;
import X.C0CFS;
import X.C1389890mGx;
import X.C1857690yRT;
import X.C2188811AlT;
import android.app.Activity;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS10S1100100_4 extends C09AY implements Function0 {
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
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S1100100_4 awS10S1100100_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS10S1100100_4.s0);
        sbLIZ.append(" inline processed=");
        sbLIZ.append(((C0CFS) awS10S1100100_4.l1).LIZ);
        sbLIZ.append(" totalCost=");
        sbLIZ.append(SystemClock.elapsedRealtime() - awS10S1100100_4.j2);
        sbLIZ.append("ms");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS10S1100100_4 awS10S1100100_4) {
        Fragment fragment = (Fragment) awS10S1100100_4.l1;
        if (fragment != null && fragment.isAdded() && ((Fragment) awS10S1100100_4.l1).getView() != null && C1857690yRT.LJIIJJI(((Fragment) awS10S1100100_4.l1).getActivity())) {
            C1389890mGx c1389890mGx = new C1389890mGx((Fragment) awS10S1100100_4.l1);
            c1389890mGx.LJIIJ(awS10S1100100_4.s0);
            c1389890mGx.LIZLLL(awS10S1100100_4.j2);
            c1389890mGx.LJIIL(64);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S1100100_4 awS10S1100100_4) {
        Activity activity = (Activity) awS10S1100100_4.l1;
        if (activity != null && !activity.isFinishing() && !((Activity) awS10S1100100_4.l1).isDestroyed()) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS10S1100100_4.l1);
            c1389890mGx.LJIIJ(awS10S1100100_4.s0);
            c1389890mGx.LIZLLL(awS10S1100100_4.j2);
            c1389890mGx.LJIIL(64);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1100100_4(TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment, String str, long j, int i) {
        super(0);
        this.$t = i;
        this.l1 = takoAiVideoDetailPageFragment;
        this.s0 = str;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1100100_4(String str, C0CFS c0cfs, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0cfs;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1100100_4(String str, Activity activity, long j, int i) {
        super(0);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
        this.j2 = j;
    }
}
