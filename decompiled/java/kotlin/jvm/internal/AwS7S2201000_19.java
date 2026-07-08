package kotlin.jvm.internal;

import X.C09AY;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS7S2201000_19 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS7S2201000_19 awS7S2201000_19) {
        Function0 function0 = (Function0) awS7S2201000_19.l2;
        if (function0 != null) {
            function0.invoke();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS7S2201000_19.l3, "//privacy/suggest_account");
        smartRouteBuildRoute.withParam("enter_from", awS7S2201000_19.s0);
        String str = awS7S2201000_19.s1;
        if (str == null) {
            str = "";
        }
        smartRouteBuildRoute.withParam("previous_page", str);
        smartRouteBuildRoute.withParam("is_rec", awS7S2201000_19.i4);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S2201000_19 awS7S2201000_19) {
        Function0 function0 = (Function0) awS7S2201000_19.l2;
        if (function0 != null) {
            function0.invoke();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS7S2201000_19.l3, "//privacy/suggest_account");
        smartRouteBuildRoute.withParam("enter_from", awS7S2201000_19.s0);
        String str = awS7S2201000_19.s1;
        if (str == null) {
            str = "";
        }
        smartRouteBuildRoute.withParam("previous_page", str);
        smartRouteBuildRoute.withParam("is_rec", awS7S2201000_19.i4);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S2201000_19(int i, Context context, String str, String str2, Function0 function0, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = function0;
        this.l3 = context;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
    }
}
