package com.ss.android.ugc.aweme.crossplatform.activity;

import X.C04TD;
import X.C098200Yq;
import X.C1037300d6G;
import X.C1041560dD8;
import X.C1041660dDI;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1037310d6H;
import X.InterfaceC1037470d6X;
import X.InterfaceC1038630d8P;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider;
import com.ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public class CrossPlatformFragment extends AbsFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+JjwgOCktPSHELIOSk8OihiKCwnITMlPTZ9CzcjOjwDJCQ4LyAhJQM+KCg+LSs4";
    public MixActivityContainer LL;
    public C1041660dDI LLILLJJLI;
    public Runnable LLILLL;

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        IMixActivityContainerProvider iMixActivityContainerProvider;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            z = false;
        } else {
            z = arguments.getBoolean("webview_progress_bar", false);
        }
        arguments.putBoolean("webview_progress_bar", z);
        C1041660dDI c1041660dDILIZ = C1041560dD8.LIZ(arguments);
        this.LLILLJJLI = c1041660dDILIZ;
        Object objLIZ = C04TD.LIZ(IMixActivityContainerProvider.class, false);
        if (objLIZ != null) {
            iMixActivityContainerProvider = (IMixActivityContainerProvider) objLIZ;
        } else {
            if (C04TD.LLLLLZL == null) {
                synchronized (IMixActivityContainerProvider.class) {
                    if (C04TD.LLLLLZL == null) {
                        C04TD.LLLLLZL = new MixActivityContainerProvider();
                    }
                }
            }
            iMixActivityContainerProvider = C04TD.LLLLLZL;
        }
        if (iMixActivityContainerProvider != null) {
            this.LL = iMixActivityContainerProvider.LIZ(getActivity(), c1041660dDILIZ);
        }
        if (this.LL == null) {
            this.LL = new MixActivityContainer(getActivity(), c1041660dDILIZ);
        }
        this.LL.LLILLL = getArguments();
        this.LL.LLIZLLLIL = this.LLILLL;
        getLifecycle().addObserver(this.LL);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final MixActivityContainer mixActivityContainer = this.LL;
        InterfaceC1038630d8P interfaceC1038630d8P = (InterfaceC1038630d8P) mixActivityContainer.LJJI(R.id.f_i);
        mixActivityContainer.LLILZLL = interfaceC1038630d8P;
        interfaceC1038630d8P.LJIIJ();
        C1037300d6G c1037300d6G = (C1037300d6G) mixActivityContainer.LJJI(R.id.web_navi_bar);
        mixActivityContainer.getClass();
        InterfaceC1037310d6H interfaceC1037310d6H = new InterfaceC1037310d6H() { // from class: X.0d8Q
            @Override // X.InterfaceC1037310d6H
            public final void LIZ() {
                mixActivityContainer.LLILZLL.LIZIZ();
            }

            @Override // X.InterfaceC1037310d6H
            public final void LIZIZ() {
                mixActivityContainer.LLILZLL.goForward();
            }
        };
        mixActivityContainer.getClass();
        c1037300d6G.setNaviBarListener(interfaceC1037310d6H);
        mixActivityContainer.LLILZLL.LIZLLL();
        mixActivityContainer.LLILZLL.LJ();
        if (TextUtils.equals("1", mixActivityContainer.LLILLJJLI.LIZLLL.LIZ)) {
            ((InterfaceC1037470d6X) mixActivityContainer.LLILZLL.LJIIJJI(InterfaceC1037470d6X.class)).LIZ().LJ();
        }
        mixActivityContainer.LJJIIZI();
        mixActivityContainer.LLILZLL.LJIIL();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LL.getClass();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bik, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
