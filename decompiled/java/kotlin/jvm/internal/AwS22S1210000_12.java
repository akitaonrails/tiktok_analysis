package kotlin.jvm.internal;

import X.C09AY;
import X.C1171460gae;
import android.content.Context;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS22S1210000_12 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS22S1210000_12 awS22S1210000_12, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        C1171460gae c1171460gae = C1171460gae.LIZ;
        Aweme aweme = (Aweme) awS22S1210000_12.l1;
        String str = awS22S1210000_12.s0;
        boolean z = awS22S1210000_12.z3;
        Context context = (Context) awS22S1210000_12.l2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        c1171460gae.getClass();
        C1171460gae.LIZ(aweme, str, z, context, (CollectionDetail) obj, numValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S1210000_12 awS22S1210000_12, Object obj, Object obj2) {
        C1171460gae c1171460gae = C1171460gae.LIZ;
        Aweme aweme = (Aweme) awS22S1210000_12.l1;
        String str = awS22S1210000_12.s0;
        boolean z = awS22S1210000_12.z3;
        Context context = (Context) awS22S1210000_12.l2;
        c1171460gae.getClass();
        C1171460gae.LIZ(aweme, str, z, context, (CollectionDetail) obj, (Integer) obj2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S1210000_12(Context context, Aweme aweme, String str, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
        this.z3 = z;
        this.l2 = context;
    }
}
