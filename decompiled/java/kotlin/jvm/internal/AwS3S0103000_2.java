package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS3S0103000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
    public Object l0;

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

    public static final Object invoke$0(AwS3S0103000_2 awS3S0103000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore drop manual preload during supplement await, cursor=");
        sbLIZ.append(awS3S0103000_2.i1);
        sbLIZ.append(" existingSize=");
        sbLIZ.append(awS3S0103000_2.i2);
        sbLIZ.append(" completeEmpty=true ");
        sbLIZ.append(((RavenFragment) awS3S0103000_2.l0).fT(Integer.valueOf(awS3S0103000_2.i3)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS3S0103000_2 awS3S0103000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadMore suppressed during supplement await (auto/synthetic), cursor=");
        sbLIZ.append(awS3S0103000_2.i1);
        sbLIZ.append(" existingSize=");
        sbLIZ.append(awS3S0103000_2.i2);
        sbLIZ.append(" completeEmpty=true ");
        sbLIZ.append(((RavenFragment) awS3S0103000_2.l0).fT(Integer.valueOf(awS3S0103000_2.i3)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS3S0103000_2 awS3S0103000_2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runManualLoadMoreWithPendingContinuation start cursor=");
        sbLIZ.append(awS3S0103000_2.i1);
        sbLIZ.append(" bodyLayoutSize=");
        sbLIZ.append(awS3S0103000_2.i2);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS3S0103000_2.l0).fT(Integer.valueOf(awS3S0103000_2.i3)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S0103000_2(int i, int i2, int i3, RavenFragment<Object> ravenFragment, int i4) {
        super(0);
        this.$t = i4;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = i3;
        this.i3 = ravenFragment;
    }
}
