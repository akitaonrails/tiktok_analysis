package kotlin.jvm.internal;

import X.C01M1;
import X.C09AY;
import X.C23250099c;
import X.C906803gY;
import X.C907803gi;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS86S0210000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS86S0210000_1 awS86S0210000_1) {
        if (awS86S0210000_1.z2) {
            C907803gi.LIZ.getClass();
            C23250099c.LIZLLL(C907803gi.LJ(), null, null, new C01M1(null, (Function0) awS86S0210000_1.l0, (Function1) awS86S0210000_1.l1), 3);
        } else {
            ((Function0) awS86S0210000_1.l0).invoke();
            Function1 function1 = (Function1) awS86S0210000_1.l1;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS86S0210000_1 awS86S0210000_1) {
        SmartRoute smartRouteBuildRoute;
        if (!awS86S0210000_1.z2 && (smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS86S0210000_1.l0, ((Uri.Builder) awS86S0210000_1.l1).toString())) != null) {
            smartRouteBuildRoute.open();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S0210000_1(boolean z, C906803gY c906803gY, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c906803gY;
        this.l1 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S0210000_1(boolean z, Context context, Uri.Builder builder, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = context;
        this.l1 = builder;
    }
}
