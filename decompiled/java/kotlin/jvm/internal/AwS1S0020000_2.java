package kotlin.jvm.internal;

import X.C09AY;
import X.C1683306iV;
import X.C1683806ia;
import X.C23250099c;
import X.C625470Og5;
import X.C625520OgA;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS1S0020000_2 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;

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

    public static final Object invoke$0(AwS1S0020000_2 awS1S0020000_2, Object obj) {
        View view = (View) obj;
        if (awS1S0020000_2.z0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://webview");
            SettingsManager.LIZLLL().getClass();
            smartRouteBuildRoute.withParam(UriProtector.parse(SettingsManager.LJI("suicide_help_url", "https://www.tiktok.com/web-inapp/suicide/help?enter_from=dm_group_name_popup")));
            smartRouteBuildRoute.open();
        }
        if (awS1S0020000_2.z1) {
            C1683306iV.LIZIZ(C1683806ia.LIZJ, null, 6);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0020000_2 awS1S0020000_2, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C625470Og5 c625470Og5 = C625470Og5.LL;
        boolean z = awS1S0020000_2.z0;
        boolean z2 = awS1S0020000_2.z1;
        c625470Og5.getClass();
        C23250099c.LIZLLL(C625470Og5.LLIZLLLIL, null, null, new C625520OgA(z, iIntValue, z2, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0020000_2(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
