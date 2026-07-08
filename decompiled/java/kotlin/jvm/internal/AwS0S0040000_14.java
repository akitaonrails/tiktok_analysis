package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0LCS;
import X.C861950Xrd;
import X.C910200ZnG;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS0S0040000_14 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;
    public boolean z2;
    public boolean z3;

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

    public static final Object invoke$0(AwS0S0040000_14 awS0S0040000_14, Object obj) {
        ((C062P) obj).LIZ = new C910200ZnG(awS0S0040000_14.z0, awS0S0040000_14.z1, awS0S0040000_14.z2, awS0S0040000_14.z3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0040000_14 awS0S0040000_14, Object obj) {
        VideoPublishState videoPublishState = (VideoPublishState) obj;
        return videoPublishState.copy(new C0LCS<>(new C861950Xrd(awS0S0040000_14.z0, awS0S0040000_14.z1, awS0S0040000_14.z2, awS0S0040000_14.z3)), videoPublishState.cancelEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0040000_14(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
        this.z2 = z3;
        this.z3 = z4;
    }
}
