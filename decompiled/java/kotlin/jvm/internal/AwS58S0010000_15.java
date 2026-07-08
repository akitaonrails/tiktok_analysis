package kotlin.jvm.internal;

import X.C09AY;
import X.C921180a4y;
import X.C974540bT2;
import X.InterfaceC917640ZzG;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS58S0010000_15 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS58S0010000_15 awS58S0010000_15) {
        C974540bT2.LIZ.LJLJJLL("active", awS58S0010000_15.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS58S0010000_15 awS58S0010000_15) {
        InterfaceC917640ZzG interfaceC917640ZzGLIZ;
        if (awS58S0010000_15.z0 && (interfaceC917640ZzGLIZ = C921180a4y.LIZ()) != null) {
            interfaceC917640ZzGLIZ.LJIIIZ(UserService.getInstance().user().getCurrentUserId(), "moderator");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS58S0010000_15 awS58S0010000_15) {
        C974540bT2.LIZ.LJLJJLL("active", awS58S0010000_15.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS58S0010000_15 awS58S0010000_15) {
        C974540bT2.LIZ.LJLJJLL("active", awS58S0010000_15.z0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S0010000_15(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
