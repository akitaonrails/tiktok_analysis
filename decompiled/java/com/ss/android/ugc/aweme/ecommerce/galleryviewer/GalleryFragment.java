package com.ss.android.ugc.aweme.ecommerce.galleryviewer;

import X.AbstractC1585810rMx;
import X.AbstractC1763150vyz;
import X.C01GW;
import X.C098200Yq;
import X.C1388190mED;
import X.C1524150plV;
import X.C1685300txQ;
import X.C1763120vyw;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C838410Wul;
import X.InterfaceC1524140plU;
import X.InterfaceC1761370vw7;
import X.InterfaceC1763860w08;
import X.InterfaceC1764960w1u;
import X.InterfaceC1764970w1v;
import X.InterfaceC1764980w1w;
import X.InterfaceC21650419oE;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class GalleryFragment extends PhotoViewerFragment implements InterfaceC1763860w08 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvHELIOSLGE0KSkgLD0qPiwpPiohZgItJSM2OjwKOy40JSAiPQ==";
    public InterfaceC1764980w1w LLJ;
    public InterfaceC1524140plU LLJIJIL;
    public InterfaceC1764960w1u LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 613));
    public final List<AbstractC1585810rMx> LLJI = new ArrayList();
    public final List<InterfaceC1764970w1v> LLJILJIL = new ArrayList();

    @Override // com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment
    public final void NR() {
        Iterator<InterfaceC1764970w1v> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    public final C1763120vyw PR() {
        return (C1763120vyw) this.LLIZLLLIL.getValue();
    }

    public GalleryFragment() {
        new BPEAHandler(Looper.getMainLooper());
        this.LLJJ = C452501pT.LIZIZ(new C1524150plV(this));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment
    public final void dismiss() {
        super.dismiss();
        InterfaceC1764960w1u interfaceC1764960w1u = this.LLJILJILJ;
        if (interfaceC1764960w1u != null) {
            interfaceC1764960w1u.dismiss();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 34) {
            Executor executorLIZJ = C838410Wul.LIZJ(requireContext());
            Activity activityLIZ = C1388190mED.LIZ(requireContext());
            if (activityLIZ != null) {
                activityLIZ.registerScreenCaptureCallback(executorLIZJ, (Activity.ScreenCaptureCallback) this.LLJJ.getValue());
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Activity activityLIZ;
        super.onStop();
        if (Build.VERSION.SDK_INT < 34 || (activityLIZ = C1388190mED.LIZ(requireContext())) == null) {
            return;
        }
        activityLIZ.unregisterScreenCaptureCallback((Activity.ScreenCaptureCallback) this.LLJJ.getValue());
    }

    @Override // X.InterfaceC1763860w08
    public final void Bz() {
        dismiss();
    }

    @Override // X.InterfaceC1763860w08
    public final void D6(int i) {
        this.LLILLL = true;
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(i);
        }
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null) {
            recyclerView2.smoothScrollBy(0, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment
    public final void MR(float f) {
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1761370vw7) it2.next()).setAlpha(f);
        }
        InterfaceC1764960w1u interfaceC1764960w1u = this.LLJILJILJ;
        if (interfaceC1764960w1u != null) {
            interfaceC1764960w1u.LIZ(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment, X.InterfaceC21650419oE
    public final void gA(int i) {
        if (i == 2) {
            Iterator it2 = ((ArrayList) this.LLIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1761370vw7) it2.next()).LJFF();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment
    public final void onPageSelected(int i) {
        Iterator<InterfaceC1764970w1v> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().onPageSelected(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List<AbstractC1585810rMx> list = this.LLJI;
        if (list != null) {
            for (AbstractC1585810rMx abstractC1585810rMx : list) {
                RecyclerView recyclerView = this.LL;
                if (recyclerView != null) {
                    recyclerView.addOnScrollListener(abstractC1585810rMx);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.galleryviewer.core.PhotoViewerFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C1763120vyw c1763120vywPR = PR();
        this.LLILZ = c1763120vywPR;
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setAdapter(c1763120vywPR);
        }
        AbstractC1763150vyz<?> abstractC1763150vyz = this.LLILZ;
        if (abstractC1763150vyz != null) {
            abstractC1763150vyz.LLILLL = new InterfaceC21650419oE() { // from class: X.0w1n
                @Override // X.InterfaceC21650419oE
                public final void gA(int i) {
                    RecyclerView.LayoutManager layoutManager;
                    if (i == 0) {
                        RecyclerView recyclerView2 = this.LL;
                        if (recyclerView2 != null) {
                            layoutManager = recyclerView2.getLayoutManager();
                        } else {
                            layoutManager = null;
                        }
                        this.onPageSelected(((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition());
                    }
                    this.gA(i);
                    if (i == 2) {
                        this.dismiss();
                    }
                }

                @Override // X.InterfaceC21650419oE
                public final void xP(int i) {
                    this.getClass();
                }

                @Override // X.InterfaceC21650419oE
                public final void kG(float f, int i) {
                    Drawable background;
                    FrameLayout frameLayout = this.LLILLJJLI;
                    if (frameLayout != null && (background = frameLayout.getBackground()) != null) {
                        background.setAlpha((int) (255 * f));
                    }
                    this.MR(f);
                    this.getClass();
                }
            };
        }
        InterfaceC1764980w1w interfaceC1764980w1w = this.LLJ;
        if (interfaceC1764980w1w != null) {
            interfaceC1764980w1w.LIZIZ();
        }
        try {
            ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
            viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewOnCreateView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewOnCreateView;
        }
    }
}
