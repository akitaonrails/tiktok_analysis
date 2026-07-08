package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS21S0000100_2 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0000100_2(int i) {
        super(1);
        this.$t = i;
        this.j0 = -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0000100_2(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS21S0000100_2 awS21S0000100_2, Object obj) {
        boolean z;
        PaidContentInfo paidContentInfo = ((Aweme) obj).mPaidContentInfo;
        if (paidContentInfo != null && paidContentInfo.getPaidCollectionId() == awS21S0000100_2.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS21S0000100_2 awS21S0000100_2, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj);
        sbLIZ.append(':');
        sbLIZ.append(awS21S0000100_2.j0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS21S0000100_2 awS21S0000100_2, Object obj) {
        ((Number) obj).longValue();
        return Long.valueOf(awS21S0000100_2.j0);
    }
}
