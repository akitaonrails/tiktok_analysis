package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight;

import X.C098200Yq;
import X.C1143680frq;
import X.C1143780fs0;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20684815ws;
import X.C339190DRl;
import X.C426750GoL;
import X.C485260J1g;
import X.C497740JfY;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC836760Ws6;
import Y.ARunnableS107S0100000_7;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS79S0100000_7;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC836760Ws6
public final class ViewerHighLightIntroDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklPyohLTHELIOSUgMGE7ISIkJSY0IDFiHyY2PyA+ASY0IAklLicnASs4OyAXISQgJigVOiQrJCo9PA==";
    public final String LL;

    public ViewerHighLightIntroDialogFragment() {
        this("");
    }

    public ViewerHighLightIntroDialogFragment(String str) {
        this.LL = str;
    }

    public final void MR(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", this.LL);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("click_type", str2);
        C485260J1g.LIZ.getClass();
        C20684815ws.LJIILLIIL("livesdk_live_anchor_highlight_intro_popup", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxTextView tuxTextView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        boolean zLJFF = Intrinsics.LJFF(this.LL, "setting_page");
        boolean zLIZIZ = C960203pA.LIZIZ(view.getContext());
        boolean zLIZLLL = C426750GoL.LIZLLL(view.getContext());
        TextView textView = (TextView) view.findViewById(R.id.jnw);
        if (textView != null) {
            if (zLJFF) {
                textView.setText(C497740JfY.LJIJI(2131856921));
            } else {
                textView.setText(C497740JfY.LJIJI(2131856929));
            }
        }
        View viewFindViewById = view.findViewById(R.id.jnu);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS79S0100000_7(this, 3), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.jnv);
        if (viewFindViewById2 != null) {
            C1143680frq.LJI(viewFindViewById2, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", "live_user_highlight_faq_guide.png"), null, true);
        }
        View viewFindViewById3 = view.findViewById(R.id.jnq);
        if (viewFindViewById3 != null) {
            if (zLIZIZ) {
                str2 = "live_user_highlight_faq_post_dark.png";
            } else {
                str2 = "live_user_highlight_faq_post.png";
            }
            C1143680frq.LJI(viewFindViewById3, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", str2), null, true);
        }
        View viewFindViewById4 = view.findViewById(R.id.jnp);
        if (viewFindViewById4 != null) {
            if (zLIZIZ) {
                str = "live_user_highlight_faq_bg_dark.png";
            } else {
                str = "live_user_highlight_faq_bg.png";
            }
            C1143680frq.LJI(viewFindViewById4, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", str), null, true);
        }
        View viewFindViewById5 = view.findViewById(R.id.jny);
        if (viewFindViewById5 != null) {
            if (zLJFF) {
                C339190DRl.LIZIZ(viewFindViewById5);
            } else {
                C339190DRl.LIZLLL(viewFindViewById5);
            }
        }
        View viewFindViewById6 = view.findViewById(R.id.jns);
        if (viewFindViewById6 != null) {
            if (zLJFF) {
                C339190DRl.LIZIZ(viewFindViewById6);
            } else {
                C339190DRl.LIZLLL(viewFindViewById6);
            }
        }
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        View viewFindViewById7 = view.findViewById(R.id.viewer_highlight_intro_container);
        if (viewFindViewById7 != null) {
            C786410Ut5.z3(viewFindViewById7.getViewTreeObserver(), new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0J1e
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    bPEAHandler.removeCallbacksAndMessages(null);
                    C786410Ut5.LJLIIL(500L, bPEAHandler, new ARunnableS107S0100000_7(this, 138));
                }
            });
        }
        if (zLIZLLL && (tuxTextView = (TuxTextView) view.findViewById(R.id.jmw)) != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.width = (int) C497740JfY.LIZIZ(116.0f);
                marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(106.0f));
                C786410Ut5.R6(tuxTextView, marginLayoutParams);
            }
        }
        MR("show", "");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ddx, viewGroup, false);
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
