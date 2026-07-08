package com.ss.android.ugc.aweme.templateselect;

import X.C013C;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C13LE;
import X.C1669670tYD;
import X.C1683130ttv;
import X.C1685300txQ;
import X.C1790750whV;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C259800zU;
import X.C336720DHy;
import X.C452501pT;
import X.EnumC1427810nG7;
import X.EnumC452301pR;
import X.InterfaceC1790780whY;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS178S0400000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateSelectionPanel extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEpJD8/KTHELIOSEpOio/LSY4Zxs2JTUgKDs2GyAgLCwnISoiGS49LSk=";
    public ComposeView LLIZ;
    public C1790750whV LLIZLLLIL;
    public IMAiGroupShotConfig LLJ;
    public boolean LLJI;
    public final ViewModelLazy LLJIJIL;

    public final TemplateSelectionViewModel SR() {
        return (TemplateSelectionViewModel) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1005));
        c0om1.LIZIZ(c1251150ifB);
        if (this.LLJI) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB2.LIZJ(new AwS571S0100000_27(this, 1006));
            c0om1.LJ(c1251150ifB2);
        }
        return c0om1;
    }

    public final IMAiGroupShotConfig UR() {
        IMAiGroupShotConfig iMAiGroupShotConfig = this.LLJ;
        if (iMAiGroupShotConfig != null) {
            return iMAiGroupShotConfig;
        }
        "init config fail".toString();
        throw new IllegalStateException("init config fail");
    }

    public TemplateSelectionPanel() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS571S0100000_27(new AwS571S0100000_27((Fragment) this, 1007), (Function0<Unit>) 1008));
        this.LLJIJIL = C336720DHy.LIZ(this, C13LE.LIZ(TemplateSelectionViewModel.class), new AwS571S0100000_27(c01gwLIZ, 1009), new AwS428S0200000_27((Function0) null, c01gwLIZ, 49), new AwS428S0200000_27(this, c01gwLIZ, 50));
    }

    public final IMAiGroupShotConfig.TemplateConfig.Selecting VR() {
        IMAiGroupShotConfig.TemplateConfig.Selecting selecting;
        IMAiGroupShotConfig.TemplateConfig templateConfig = UR().templateConfig;
        if ((templateConfig instanceof IMAiGroupShotConfig.TemplateConfig.Selecting) && (selecting = (IMAiGroupShotConfig.TemplateConfig.Selecting) templateConfig) != null) {
            return selecting;
        }
        "should have skipped this page".toString();
        throw new IllegalStateException("should have skipped this page");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IMAiGroupShotConfig iMAiGroupShotConfig;
        boolean z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            iMAiGroupShotConfig = (IMAiGroupShotConfig) arguments.getParcelable("config");
        } else {
            iMAiGroupShotConfig = null;
        }
        this.LLJ = iMAiGroupShotConfig;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("enable_back_button");
        } else {
            z = false;
        }
        this.LLJI = z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0ttv] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AwS428S0200000_27 awS428S0200000_27 = new AwS428S0200000_27(this, view, 48);
        awS428S0200000_27.invoke();
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C1683130ttv(0.0f, 0.0f, 0.0f, 0.0f);
        final C013C c013c = new C013C();
        C1790750whV c1790750whV = this.LLIZLLLIL;
        if (c1790750whV != null) {
            c1790750whV.setCallback(new InterfaceC1790780whY() { // from class: X.0whX
                @Override // X.InterfaceC1790780whY
                public final boolean LIZ(MotionEvent motionEvent) {
                    if (motionEvent.getY() <= c259800zU.element.LIZIZ || motionEvent.getY() >= c259800zU.element.LIZLLL || c013c.element) {
                        return false;
                    }
                    return true;
                }
            });
            ComposeView composeView = this.LLIZ;
            if (composeView != null) {
                C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(2056103374, new AwS178S0400000_27(this, awS428S0200000_27, c259800zU, c013c, 1), true));
                return;
            } else {
                "init fail".toString();
                throw new IllegalStateException("init fail");
            }
        }
        "init touchFrame fail".toString();
        throw new IllegalStateException("init touchFrame fail");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1790750whV c1790750whV;
        Context context;
        C19GS c19gs = null;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            this.LLIZ = new ComposeView(context, null, 6);
            c1790750whV = new C1790750whV(context);
            c1790750whV.addView(this.LLIZ);
            this.LLIZLLLIL = c1790750whV;
        } else {
            c1790750whV = null;
        }
        if (!(c1790750whV instanceof View)) {
            c1790750whV = null;
        }
        if (c1790750whV != null) {
            try {
                ViewTreeLifecycleOwner.set(c1790750whV, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(c1790750whV, this);
                c1790750whV.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return c1790750whV;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return c1790750whV;
    }
}
