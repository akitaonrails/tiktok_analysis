package com.ss.android.ugc.aweme.account.login.passkey;

import X.C01GW;
import X.C098200Yq;
import X.C1237010iIN;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC852660Xce;
import Y.ACListenerS154S0100000_19;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.RespondSetPasskeyInfoEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowSetPasskeyInfoEvent;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class BasePasskeySetUpFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0HELIOSIStiOS4gOy4pMGERKTYpGS4gOy4pMBw2PBA8Dz0yLygpJzs=";
    public View LLLIILIL;
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 76));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 79));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 74));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 78));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 75));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 77));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.ya;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public C1237010iIN iS() {
        C197039127h c197039127h;
        if (getActivity() != null && (c197039127h = (C197039127h) this.LLLILZLLLI.getValue()) != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19(this, 29));
        }
        return new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        RespondSetPasskeyInfoEvent respondSetPasskeyInfoEvent = new RespondSetPasskeyInfoEvent();
        respondSetPasskeyInfoEvent.LJI(getEnterFrom(), "enter_from");
        respondSetPasskeyInfoEvent.LJI("click", "enter_method");
        respondSetPasskeyInfoEvent.LJIIJ(0);
        respondSetPasskeyInfoEvent.LJIIIIZZ();
        if (PS()) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finishAffinity();
            }
            Process.killProcess(Process.myPid());
        }
        super.onBackPressed();
        return false;
    }

    public final boolean PS() {
        Bundle arguments = getArguments();
        return (arguments != null ? arguments.getInt("current_scene") : -1) == EnumC852660Xce.PASSKEY_WIZARD.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Intent intent;
        super.onActivityCreated(bundle);
        if (PS()) {
            C19EG activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                intent.putExtra("enter_from", "passkey_wizard");
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                C786410Ut5.LJJJI("enter_from", "passkey_wizard", arguments);
            }
        }
        ShowSetPasskeyInfoEvent showSetPasskeyInfoEvent = new ShowSetPasskeyInfoEvent();
        showSetPasskeyInfoEvent.LJI(getEnterFrom(), "enter_from");
        showSetPasskeyInfoEvent.LJI("click", "enter_method");
        showSetPasskeyInfoEvent.LJIIIIZZ();
    }

    public final void NS(int i, int i2) {
        C19EG activity = getActivity();
        if (activity != null) {
            View viewTd = C786410Ut5.Td(activity.getLayoutInflater(), R.layout.y_, (ViewGroup) this.LLLILZJ.getValue(), false);
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.k55);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setImageDrawable(c419910GdJ.LIZ(activity));
            ((TextView) viewTd.findViewById(R.id.xrk)).setText(activity.getString(i2));
            ViewGroup viewGroup = (ViewGroup) this.LLLILZJ.getValue();
            if (viewGroup != null) {
                viewGroup.addView(viewTd);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (viewOnCreateView != null) {
            this.LLLIILIL = viewOnCreateView;
        } else {
            viewOnCreateView = null;
        }
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
