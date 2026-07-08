package kotlin.jvm.internal;

import X.C09AY;
import X.C181R;
import X.C21312218am;
import X.C2487409ou;
import X.EnumC19302510fP;
import Y.ARunnableS4S0410000_32;
import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionCheckResp;
import com.ss.android.ugc.aweme.services.popsuite.PopSuiteETHelper;
import com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes33.dex */
public class AwS309S0300000_32 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS309S0300000_32 awS309S0300000_32, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C2487409ou.LIZJ(new ARunnableS4S0410000_32((Function1) awS309S0300000_32.l0, (Function0) awS309S0300000_32.l1, (AuctionCheckResp) obj, zBooleanValue, (C181R) awS309S0300000_32.l2, 0));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS309S0300000_32 awS309S0300000_32, Object obj, Object obj2) {
        SmartRouter.buildRoute((Activity) awS309S0300000_32.l0, ((C21312218am) awS309S0300000_32.l1).LJII).open();
        PopSuiteETHelper popSuiteETHelper = PopSuiteETHelper.INSTANCE;
        String value = EnumC19302510fP.CONFIRM.getValue();
        C21312218am c21312218am = (C21312218am) awS309S0300000_32.l1;
        popSuiteETHelper.mobPopSuitePopupResp(value, c21312218am.LJI, "normal", c21312218am.LJIIIIZZ, ((PopSuiteManagerService) awS309S0300000_32.l2).popupFreqCache.LIZIZ + 1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS309S0300000_32 awS309S0300000_32, Object obj, Object obj2) {
        String str = ((C21312218am) awS309S0300000_32.l1).LJIIJJI;
        if (str != null) {
            SmartRouter.buildRoute((Activity) awS309S0300000_32.l0, str).open();
        }
        PopSuiteETHelper popSuiteETHelper = PopSuiteETHelper.INSTANCE;
        String value = EnumC19302510fP.SECONDARY.getValue();
        C21312218am c21312218am = (C21312218am) awS309S0300000_32.l1;
        popSuiteETHelper.mobPopSuitePopupResp(value, c21312218am.LJI, "normal", c21312218am.LJIIIIZZ, ((PopSuiteManagerService) awS309S0300000_32.l2).popupFreqCache.LIZIZ + 1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS309S0300000_32(C21312218am c21312218am, PopSuiteManagerService popSuiteManagerService, Activity activity, int i) {
        super(2);
        this.$t = i;
        this.l1 = c21312218am;
        this.l2 = popSuiteManagerService;
        this.l0 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS309S0300000_32(Activity activity, C21312218am c21312218am, PopSuiteManagerService popSuiteManagerService, int i) {
        super(2);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c21312218am;
        this.l2 = popSuiteManagerService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS309S0300000_32(Function1 function1, Function1<? super Boolean, Unit> function12, Function0<Unit> function0, C181R c181r) {
        super(2);
        this.$t = c181r;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = function0;
    }
}
