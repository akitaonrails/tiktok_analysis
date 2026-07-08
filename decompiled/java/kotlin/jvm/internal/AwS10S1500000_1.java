package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C259800zU;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS10S1500000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS10S1500000_1 awS10S1500000_1) {
        C013C c013c = (C013C) awS10S1500000_1.l1;
        ECRouterInterceptor eCRouterInterceptor = (ECRouterInterceptor) awS10S1500000_1.l2;
        RouteIntent routeIntent = (RouteIntent) awS10S1500000_1.l3;
        String str = awS10S1500000_1.s0;
        Context context = (Context) awS10S1500000_1.l4;
        Integer num = (Integer) ((C259800zU) awS10S1500000_1.l5).element;
        eCRouterInterceptor.getClass();
        c013c.element = ECRouterInterceptor.LJIILL(routeIntent, str, context, num);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S1500000_1 awS10S1500000_1) {
        C013C c013c = (C013C) awS10S1500000_1.l1;
        ECRouterInterceptor eCRouterInterceptor = (ECRouterInterceptor) awS10S1500000_1.l2;
        RouteIntent routeIntent = (RouteIntent) awS10S1500000_1.l3;
        String str = awS10S1500000_1.s0;
        Context context = (Context) awS10S1500000_1.l4;
        eCRouterInterceptor.getClass();
        ECRouterInterceptor.LJIILLIIL(routeIntent, str, context);
        c013c.element = true;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S1500000_1 awS10S1500000_1) {
        C013C c013c = (C013C) awS10S1500000_1.l1;
        ECRouterInterceptor eCRouterInterceptor = (ECRouterInterceptor) awS10S1500000_1.l2;
        RouteIntent routeIntent = (RouteIntent) awS10S1500000_1.l3;
        String str = awS10S1500000_1.s0;
        Context context = (Context) awS10S1500000_1.l4;
        Bundle bundle = (Bundle) awS10S1500000_1.l5;
        eCRouterInterceptor.getClass();
        ECRouterInterceptor.LJIIZILJ(routeIntent, str, context, bundle);
        c013c.element = true;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S1500000_1(C013C c013c, C013C c013c2, ECRouterInterceptor eCRouterInterceptor, RouteIntent routeIntent, String str, Context context, C259800zU<Integer> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l1 = c013c;
        this.l2 = c013c2;
        this.l3 = eCRouterInterceptor;
        this.s0 = routeIntent;
        this.l4 = str;
        this.l5 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1500000_1(C013C c013c, ECRouterInterceptor eCRouterInterceptor, RouteIntent routeIntent, String str, Context context, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l1 = c013c;
        this.l2 = eCRouterInterceptor;
        this.l3 = routeIntent;
        this.s0 = str;
        this.l4 = context;
        this.l5 = bundle;
    }
}
