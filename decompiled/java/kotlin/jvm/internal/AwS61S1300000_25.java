package kotlin.jvm.internal;

import X.C020W;
import X.C09AY;
import X.C0MAE;
import X.C1683360tuI;
import X.C1683450tuR;
import X.C1685510txl;
import X.C1685530txn;
import X.C1687730u1L;
import X.C19719212De;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC1665500tRU;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS61S1300000_25 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS61S1300000_25 awS61S1300000_25, Object obj) {
        InterfaceC1665500tRU interfaceC1665500tRU = (InterfaceC1665500tRU) awS61S1300000_25.l1;
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(88);
        Function1 function1 = (Function1) awS61S1300000_25.l2;
        String str = awS61S1300000_25.s0;
        Function0 function0 = (Function0) awS61S1300000_25.l3;
        ((C0MAE) obj).LIZJ(interfaceC1665500tRU.size(), new C020W(aFwS266S0000000_25, interfaceC1665500tRU, 99), new C020W(AFwS266S0000000_25.get$arr$(593), interfaceC1665500tRU, 100), new C19719212De(-632812321, new C1683360tuI(interfaceC1665500tRU, function1, str, function0), true));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS61S1300000_25 awS61S1300000_25, Object obj) {
        User user = ((C1687730u1L) awS61S1300000_25.l1).LIZ;
        UserMatchedAssem userMatchedAssem = (UserMatchedAssem) awS61S1300000_25.l2;
        C1685510txl c1685510txl = (C1685510txl) awS61S1300000_25.l3;
        userMatchedAssem.getClass();
        C1685530txn c1685530txn = C1685530txn.LIZ;
        String str = c1685510txl.LIZIZ;
        c1685530txn.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "connect_now_friend_banner");
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(userMatchedAssem.LJJIJL().getContext(), "//user/profile");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("sec_uid", user.getSecUid());
        smartRouteBuildRoute.withParam("enter_from", c1685510txl.LIZIZ);
        smartRouteBuildRoute.withParam("enter_method", "connect_now_friend_banner");
        smartRouteBuildRoute.open();
        C1685530txn.LIZJ(null, (String) ((UserMatchedAssem) awS61S1300000_25.l2).LLJIJIL.getValue(), awS61S1300000_25.s0, "click", ((C1685510txl) awS61S1300000_25.l3).LIZIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS61S1300000_25(InterfaceC1665500tRU interfaceC1665500tRU, InterfaceC1665500tRU<C1683450tuR> interfaceC1665500tRU2, Function1<? super String, Unit> function1, String str, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l1 = interfaceC1665500tRU;
        this.l2 = interfaceC1665500tRU2;
        this.s0 = function1;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S1300000_25(UserMatchedAssem userMatchedAssem, C1687730u1L c1687730u1L, C1685510txl c1685510txl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1687730u1L;
        this.l2 = userMatchedAssem;
        this.s0 = str;
        this.l3 = c1685510txl;
    }
}
