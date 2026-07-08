package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C098200Yq;
import X.C189200o6;
import X.C798703Ab;
import X.C812203Fg;
import X.C828603Lo;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AkS49S0200000_1 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS49S0200000_1 akS49S0200000_1, View view) {
        Function0<Unit> function0 = ((C798703Ab) akS49S0200000_1.l0).LL;
        if (function0 != null) {
            function0.invoke();
        }
        C798703Ab c798703Ab = (C798703Ab) akS49S0200000_1.l0;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = c798703Ab.LLILLJJLI;
        if (orderSubmitAssemViewModel != null) {
            C828603Lo c828603Lo = orderSubmitAssemViewModel.h;
            String str = c798703Ab.LLILZIL;
            UserVirtualInfo userVirtualInfo = (UserVirtualInfo) akS49S0200000_1.l1;
            Context context = c798703Ab.getContainer().getContext();
            c828603Lo.getClass();
            C828603Lo.LJFF(str, userVirtualInfo, context, orderSubmitAssemViewModel);
        }
    }

    public static final void LIZ$1(AkS49S0200000_1 akS49S0200000_1, View view) {
        String str = ((C812203Fg) akS49S0200000_1.l0).LLILZ;
        if (str != null && str.length() > 0) {
            String strInvoke = null;
            if (1 != 0) {
                C812203Fg c812203Fg = (C812203Fg) akS49S0200000_1.l0;
                try {
                    Function0<Unit> function0 = c812203Fg.LLILZLL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
                    Context context = (Context) akS49S0200000_1.l1;
                    Function0<String> function02 = c812203Fg.LLIZLLLIL;
                    if (function02 != null) {
                        strInvoke = function02.invoke();
                    }
                    String str2 = c812203Fg.LLIZ;
                    paymentBindHelper.getClass();
                    PaymentBindHelper.LJ(context, "ordersubmit", str, null, strInvoke, str2, null, null, null);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    public AkS49S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
