package defpackage;

import X.AnonymousClass0317;
import X.C034S;
import X.C1120604Zw;
import X.C1AQS;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 {
    public static final w1 LIZ = new w1();
    public static final EcomPaymentStyleModel LIZIZ;

    static {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        String lowerCase = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toLowerCase(Locale.ROOT);
        LIZIZ = (Intrinsics.LJFF(lowerCase, "us") || Intrinsics.LJFF(lowerCase, "br")) ? new EcomPaymentStyleModel(new Interact(1), new Vision(1, 0, 0, 1)) : new EcomPaymentStyleModel(new Interact(0), new Vision(0, 1, 1, 0));
    }

    public static Interact LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomPaymentStyleModel ecomPaymentStyleModel = LIZIZ;
        EcomPaymentStyleModel ecomPaymentStyleModel2 = (EcomPaymentStyleModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_payment_style", EcomPaymentStyleModel.class, ecomPaymentStyleModel);
        if (ecomPaymentStyleModel2 != null) {
            ecomPaymentStyleModel = ecomPaymentStyleModel2;
        }
        Interact interact = ecomPaymentStyleModel.interact;
        return interact == null ? new Interact(0) : interact;
    }
}
