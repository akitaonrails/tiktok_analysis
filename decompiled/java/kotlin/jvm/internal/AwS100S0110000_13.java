package kotlin.jvm.internal;

import X.C09AY;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XQ5;
import X.C0XVC;
import X.C1238280iKQ;
import X.C1261680iwA;
import X.C1593730rZj;
import X.C418440Gaw;
import X.C814420VxA;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.offline.debug.router.IDebugRouterService;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS100S0110000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS100S0110000_13 awS100S0110000_13, Object obj) {
        ILoginService iLoginService;
        C0XVC.LIZ(null, "CustomizedHook", "login");
        ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).setIsLoggedIn(true);
        ((IDebugRouterService) ServiceManager.get().getService(IDebugRouterService.class)).LIZ();
        if (!awS100S0110000_13.z1 && (iLoginService = (ILoginService) PluggableExtentionKt.pluggableSpi$default(ILoginService.class, false, false, false, 14, null)) != null && iLoginService.needRedirectToMainAfterLogin()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Activity) awS100S0110000_13.l0, "aweme://main");
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", C1593730rZj.LIZIZ.LJFF());
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.addFlags(268435456);
            smartRouteBuildRoute.open();
        }
        if (C0XQ5.LJFF()) {
            C0XQ5.LJIIJJI(19, 1, "");
            C0XQ5.LJIIJJI(1, 1, "");
        }
        C1238280iKQ.LIZIZ(11);
        C1238280iKQ.LIZIZ(9);
        C0XQ5.LJII(C0XQ5.LIZJ());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS100S0110000_13 awS100S0110000_13, Object obj) {
        if (awS100S0110000_13.z1) {
            C1261680iwA.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), (RelationButton) awS100S0110000_13.l0);
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$2(AwS100S0110000_13 awS100S0110000_13, Object obj) throws Throwable {
        View view = (View) awS100S0110000_13.l0;
        boolean zBooleanValue = awS100S0110000_13.z1;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0Uat9SeALkBitrIQKAx7JPBazO8k=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
        C0WZW c0wzw = new C0WZW(false, "(Z)Landroid/graphics/Bitmap;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(2826, "android/view/View", "getDrawingCache", view, objArr, "android.graphics.Bitmap", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(2826, "android/view/View", "getDrawingCache", null, objArr, view, c0wzw, false);
            return c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj2 = objArr2[0];
            if (obj2 != null) {
                view = (View) obj2;
            }
            Object obj3 = objArr2[1];
            if (obj3 != null) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
            }
        }
        Bitmap drawingCache = view.getDrawingCache(zBooleanValue);
        c0wst.LIZ(2826, "android/view/View", "getDrawingCache", drawingCache, objArr, view, c0wzw, true);
        return drawingCache;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0110000_13(Activity activity, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0110000_13(View view, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0110000_13(RelationButton relationButton, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = relationButton;
    }
}
