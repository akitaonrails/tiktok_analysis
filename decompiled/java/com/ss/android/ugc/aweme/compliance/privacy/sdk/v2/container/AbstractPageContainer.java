package com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.container;

import X.C0HTI;
import X.C103L;
import X.C104A;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C191834103c;
import X.C191848103q;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.tiktok.pns.ui.BaseFragment;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractPageContainer extends BaseFragment {
    public C103L LL;
    public boolean LLILLJJLI;

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final int MR() {
        return R.layout.bdn;
    }

    public void NR(TuxNavBar tuxNavBar) {
    }

    public Integer OR() {
        return null;
    }

    public Integer PR() {
        return null;
    }

    public void RR(View view) {
    }

    public boolean SR() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, X.InterfaceC21503819Do
    public final void tv() {
        finish();
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LL == null) {
            if (!this.LLILLJJLI) {
                this.LLILLJJLI = true;
            }
        } else if (SR() && !this.LLILLJJLI) {
            this.LLILLJJLI = true;
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context contextRequireContext;
        C1749280vcc c1749280vcc;
        LinearLayout linearLayout;
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (tuxNavBar != null) {
            NR(tuxNavBar);
        }
        if (this.LLILLJJLI) {
            View view2 = getView();
            if (view2 != null && (linearLayout = (LinearLayout) view2.findViewById(R.id.pyd)) != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            View view3 = getView();
            if (view3 != null && (c1749280vcc = (C1749280vcc) view3.findViewById(R.id.pc5)) != null && c1749280vcc.getVisibility() != 0) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.n_;
                Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZ = drawableLIZ;
                c1722300uv6.LJI = getString(2131839132);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                c1722300uv6.LIZLLL = iLIZIZ;
                c1722300uv6.LJ = iLIZIZ2;
                c1749280vcc.setStatus(c1722300uv6);
                return;
            }
            return;
        }
        Integer numOR = OR();
        if (numOR != null) {
            int iIntValue = numOR.intValue();
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.i1b);
            if (viewStub != null) {
                viewStub.setLayoutResource(iIntValue);
                C786410Ut5.LJLLLL(viewStub);
            }
        }
        RR(view);
        C103L c103l = this.LL;
        if (c103l != null) {
            TPSCRenderManager tPSCRenderManager = TPSCRenderManager.LIZ;
            Integer numPR = PR();
            if (numPR != null) {
                contextRequireContext = new ContextThemeWrapper(requireContext(), numPR.intValue());
            } else {
                contextRequireContext = requireContext();
            }
            ViewModelStoreOwner activity = getActivity();
            if (activity == null) {
                activity = this;
            }
            C191848103q c191848103q = new C191848103q(contextRequireContext, activity, this, c103l.LIZ, getArguments(), null, null, 128);
            List<? extends C104A> list = c103l.LJ;
            tPSCRenderManager.getClass();
            C191834103c c191834103cLIZJ = TPSCRenderManager.LIZJ(c191848103q, list);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.c7x);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter(c191834103cLIZJ);
            return;
        }
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
    }
}
