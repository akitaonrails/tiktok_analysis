package kotlin.jvm.internal;

import X.C09AY;
import X.C0XF1;
import X.C1389890mGx;
import X.C19EG;
import X.C23250099c;
import X.C259800zU;
import X.C324140CnE;
import X.C343520DdO;
import X.EnumC1585090rLn;
import X.InterfaceC497601wk;
import android.app.Application;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tab.stability.TabStabilityData;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedInvitedContainerViewModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS133S0400000_4 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS133S0400000_4 awS133S0400000_4) {
        C23250099c.LIZLLL((InterfaceC497601wk) awS133S0400000_4.l0, null, null, new C324140CnE((Application) awS133S0400000_4.l1, (WeakReference) awS133S0400000_4.l2, (RouteIntent) awS133S0400000_4.l3, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS133S0400000_4 awS133S0400000_4) {
        C19EG c19eg = (C19EG) ((WeakReference) awS133S0400000_4.l0).get();
        if (c19eg != null) {
            C259800zU c259800zU = (C259800zU) awS133S0400000_4.l1;
            TabStabilityData tabStabilityData = (TabStabilityData) awS133S0400000_4.l2;
            TabStabilityData tabStabilityData2 = (TabStabilityData) awS133S0400000_4.l3;
            C343520DdO c343520DdO = C343520DdO.LIZ;
            EnumC1585090rLn enumC1585090rLn = (EnumC1585090rLn) c259800zU.element;
            c343520DdO.getClass();
            C343520DdO.LIZIZ(c19eg, enumC1585090rLn, tabStabilityData, tabStabilityData2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS133S0400000_4 awS133S0400000_4) {
        if (!C0XF1.LIZLLL(((CollabFeedInvitedPendingCell) awS133S0400000_4.l0).itemView.getContext())) {
            C1389890mGx c1389890mGx = new C1389890mGx(((CollabFeedInvitedPendingCell) awS133S0400000_4.l0).itemView);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            ((Function0) awS133S0400000_4.l1).invoke();
        } else {
            CollabFeedInvitedContainerViewModel collabFeedInvitedContainerViewModelI5 = ((CollabFeedInvitedPendingCell) awS133S0400000_4.l0).I5();
            Aweme aweme = (Aweme) awS133S0400000_4.l2;
            User user = (User) awS133S0400000_4.l3;
            collabFeedInvitedContainerViewModelI5.getClass();
            collabFeedInvitedContainerViewModelI5.setState(new AwS390S0200000_24(aweme, user, 119));
            ((CollabFeedInvitedPendingCell) awS133S0400000_4.l0).L5((Aweme) awS133S0400000_4.l2, "decline", "decline", true);
            ((Function0) awS133S0400000_4.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS133S0400000_4 awS133S0400000_4) {
        if (!C0XF1.LIZLLL(((CollabFeedInvitedCell) awS133S0400000_4.l0).itemView.getContext())) {
            C1389890mGx c1389890mGx = new C1389890mGx(((CollabFeedInvitedCell) awS133S0400000_4.l0).itemView);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            ((Function0) awS133S0400000_4.l1).invoke();
        } else {
            ((CollabFeedInvitedCell) awS133S0400000_4.l0).R5((Aweme) awS133S0400000_4.l2, "exit", "exit_yes", true);
            CollabFeedInvitedContainerViewModel collabFeedInvitedContainerViewModelN5 = ((CollabFeedInvitedCell) awS133S0400000_4.l0).N5();
            Aweme aweme = (Aweme) awS133S0400000_4.l2;
            User user = (User) awS133S0400000_4.l3;
            collabFeedInvitedContainerViewModelN5.getClass();
            collabFeedInvitedContainerViewModelN5.setState(new AwS390S0200000_24(aweme, user, 120));
            ((Function0) awS133S0400000_4.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS133S0400000_4 awS133S0400000_4) {
        if (!C0XF1.LIZLLL(((CollabFeedInvitedPendingCell) awS133S0400000_4.l0).itemView.getContext())) {
            C1389890mGx c1389890mGx = new C1389890mGx(((CollabFeedInvitedPendingCell) awS133S0400000_4.l0).itemView);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            ((Function0) awS133S0400000_4.l1).invoke();
        } else {
            CollabFeedInvitedContainerViewModel collabFeedInvitedContainerViewModelI5 = ((CollabFeedInvitedPendingCell) awS133S0400000_4.l0).I5();
            Aweme aweme = (Aweme) awS133S0400000_4.l2;
            User user = (User) awS133S0400000_4.l3;
            collabFeedInvitedContainerViewModelI5.getClass();
            collabFeedInvitedContainerViewModelI5.setState(new AwS390S0200000_24(aweme, user, 118));
            ((CollabFeedInvitedPendingCell) awS133S0400000_4.l0).L5((Aweme) awS133S0400000_4.l2, "authorize", "accept", true);
            ((Function0) awS133S0400000_4.l1).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S0400000_4(InterfaceC497601wk interfaceC497601wk, InterfaceC497601wk interfaceC497601wk2, Application application, WeakReference<Context> weakReference, RouteIntent routeIntent) {
        super(0);
        this.$t = routeIntent;
        this.l0 = interfaceC497601wk;
        this.l1 = interfaceC497601wk2;
        this.l2 = application;
        this.l3 = weakReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S0400000_4(CollabFeedInvitedCell collabFeedInvitedCell, CollabFeedInvitedCell collabFeedInvitedCell2, Function0<Unit> function0, Aweme aweme, User user) {
        super(0);
        this.$t = user;
        this.l0 = collabFeedInvitedCell;
        this.l1 = collabFeedInvitedCell2;
        this.l2 = function0;
        this.l3 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S0400000_4(CollabFeedInvitedPendingCell collabFeedInvitedPendingCell, CollabFeedInvitedPendingCell collabFeedInvitedPendingCell2, Function0<Unit> function0, Aweme aweme, User user) {
        super(0);
        this.$t = user;
        this.l0 = collabFeedInvitedPendingCell;
        this.l1 = collabFeedInvitedPendingCell2;
        this.l2 = function0;
        this.l3 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S0400000_4(WeakReference weakReference, WeakReference<C19EG> weakReference2, C259800zU<EnumC1585090rLn> c259800zU, TabStabilityData tabStabilityData, TabStabilityData tabStabilityData2) {
        super(0);
        this.$t = tabStabilityData2;
        this.l0 = weakReference;
        this.l1 = weakReference2;
        this.l2 = c259800zU;
        this.l3 = tabStabilityData;
    }
}
