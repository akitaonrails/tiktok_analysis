package kotlin.jvm.internal;

import X.C09AY;
import X.C0K0S;
import X.C1161920gLG;
import X.C16F5;
import X.C19EG;
import X.C20736316Cj;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C471340Ie4;
import X.C497740JfY;
import X.C517700KSa;
import X.C517840KSo;
import X.C782110Um9;
import X.C786410Ut5;
import X.InterfaceC743640TFa;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.feed.drawerfeed.basic.DefaultDrawerFeedFragment;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS156S1100000_7 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS156S1100000_7 awS156S1100000_7) {
        TabFeedViewModel tabFeedViewModel = ((DefaultDrawerFeedFragment) awS156S1100000_7.l1).LLJILJIL;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.CQ2(awS156S1100000_7.s0);
        }
        C471340Ie4.LJJIFFI = 0L;
        ((DefaultDrawerFeedFragment) awS156S1100000_7.l1).cS();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS156S1100000_7 awS156S1100000_7) {
        C19EG activity;
        Intent intent;
        Fragment fragment = (Fragment) awS156S1100000_7.l1;
        if (fragment != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null) {
            return intent.getParcelableExtra(awS156S1100000_7.s0);
        }
        return null;
    }

    public static final Object invoke$2(AwS156S1100000_7 awS156S1100000_7) {
        String string;
        Bundle arguments = ((Fragment) awS156S1100000_7.l1).getArguments();
        if (arguments == null || (string = arguments.getString(awS156S1100000_7.s0)) == null) {
            return "";
        }
        return string;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS156S1100000_7 awS156S1100000_7) {
        WeakReference<Activity> weakReference;
        final Activity activity;
        C517840KSo c517840KSo = ((SuperFanViewModel) awS156S1100000_7.l1).LLILLJJLI;
        if (c517840KSo != null && (weakReference = c517840KSo.LIZ) != null && (activity = weakReference.get()) != null) {
            String strLJIJI = C497740JfY.LJIJI(2131856681);
            String strLJIJJ = C497740JfY.LJIJJ(2131856682, C497740JfY.LJIJI(2131856684));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(C497740JfY.LJIJI(2131856680));
            sbLIZ.append(']');
            String strLJIJJ2 = C497740JfY.LJIJJ(2131856685, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJIJI);
            sbLIZ2.append('\n');
            sbLIZ2.append(strLJIJJ);
            sbLIZ2.append('\n');
            sbLIZ2.append(strLJIJJ2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C16F5 c16f5 = new C16F5(activity, null);
            SuperFanViewModel superFanViewModel = (SuperFanViewModel) awS156S1100000_7.l1;
            C786410Ut5.y6(c16f5, new ViewGroup.LayoutParams(-2, -2));
            c16f5.LJJJI(R.style.a8z);
            C517700KSa.LIZLLL(c16f5, strLIZIZ, 42, C20736316Cj.LIZIZ(R.attr.ey7, activity), new AwS408S0200000_7(superFanViewModel, activity, 36));
            C782110Um9 c782110Um9 = new C782110Um9(activity);
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131856686);
            c782110Um9.LJIIIIZZ(c16f5);
            String strLJIJI2 = C497740JfY.LJIJI(2131856683);
            final String str = awS156S1100000_7.s0;
            c782110Um9.LJIILJJIL(strLJIJI2, new InterfaceC743640TFa() { // from class: X.0KOp
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(UriProtector.parse("https://play.google.com/store/account/subscriptions").buildUpon().appendQueryParameter("sku", str).appendQueryParameter("package", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getApplicationInfo().packageName).build());
                    intent.setPackage("com.android.vending");
                    ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965953);
                    Activity activity2 = activity;
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activity2);
                    C2204961BRm.LJIILLIIL(activity2, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+S8d1xf5Awtw8NiOjMLgVexwBnvMh4DCfVZiA/naGH+g9jmXfPXqKwfs60lppa80", null));
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131851998), new InterfaceC743640TFa() { // from class: X.0KOq
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILLIIL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS156S1100000_7 awS156S1100000_7) {
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        C0K0S c0k0s = (C0K0S) awS156S1100000_7.l1;
        if (c0k0s != null && (subscriptionPrivilegeDetailFragment = c0k0s.LJ) != null) {
            subscriptionPrivilegeDetailFragment.cS(awS156S1100000_7.s0, C2097908Jt.LIZJ(new Pair("is_perks_rare", "1")));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS156S1100000_7 awS156S1100000_7) {
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema((Context) awS156S1100000_7.l1, awS156S1100000_7.s0, new Bundle());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S1100000_7(C0K0S c0k0s, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0k0s;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S1100000_7(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S1100000_7(Fragment fragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S1100000_7(DefaultDrawerFeedFragment defaultDrawerFeedFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = defaultDrawerFeedFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S1100000_7(SuperFanViewModel superFanViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = superFanViewModel;
        this.s0 = str;
    }
}
