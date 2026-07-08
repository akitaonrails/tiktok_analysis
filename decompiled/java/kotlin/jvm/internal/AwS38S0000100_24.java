package kotlin.jvm.internal;

import X.C09AY;
import X.C1572990r2H;
import com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS38S0000100_24 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S0000100_24(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS38S0000100_24 awS38S0000100_24, Object obj) {
        SocialAvatarLikeListState socialAvatarLikeListState = (SocialAvatarLikeListState) obj;
        return socialAvatarLikeListState.copy(awS38S0000100_24.j0, socialAvatarLikeListState.checksum, socialAvatarLikeListState.listState);
    }

    public static final Object invoke$1(AwS38S0000100_24 awS38S0000100_24, Object obj) {
        return C1572990r2H.LIZ((C1572990r2H) obj, awS38S0000100_24.j0, false, false, false, null, null, 62);
    }
}
