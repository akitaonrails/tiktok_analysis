package com.ss.android.ugc.aweme.ecommerce.galleryviewer.core;

import X.AbstractC1763150vyz;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20635115or;
import X.C21679619sw;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1761370vw7;
import X.InterfaceC21650419oE;
import Y.AsS8S0101000_26;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public class PhotoViewerFragment extends CommonPageFragment implements InterfaceC21650419oE {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGE0KSHELIOSkgLD0qPiwpPiohZiYjOyp9GC0jPSAFISA7LD0VOiQrJCo9PA==";
    public RecyclerView LL;
    public FrameLayout LLILLJJLI;
    public boolean LLILLL;
    public AbstractC1763150vyz<?> LLILZ;
    public C21679619sw LLILZIL;
    public int LLILZLL = -1;
    public final List<InterfaceC1761370vw7> LLIZ = new ArrayList();

    public void MR(float f) {
    }

    public void NR() {
    }

    public void gA(int i) {
    }

    @Override // X.InterfaceC21650419oE
    public final void kG(float f, int i) {
    }

    public void onPageSelected(int i) {
    }

    @Override // X.InterfaceC21650419oE
    public final void xP(int i) {
    }

    public void dismiss() {
        AbstractC1763150vyz<?> abstractC1763150vyz;
        try {
            if (!isVisible() || (abstractC1763150vyz = this.LLILZ) == null) {
                return;
            }
            abstractC1763150vyz.onDestroy();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void OR(int i) {
        if (this.LLILZLL != i) {
            this.LLILZLL = i;
            Iterator it2 = ((ArrayList) this.LLIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1761370vw7) it2.next()).onPageSelected(i);
            }
            onPageSelected(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Drawable background;
        super.onViewCreated(view, bundle);
        Window window = requireActivity().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(1280);
        if (Build.VERSION.SDK_INT > 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(C960203pA.LIZ(R.attr.e1, requireContext()));
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null && (background = frameLayout2.getBackground()) != null) {
            background.setAlpha(255);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView.LayoutManager layoutManager;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.LLILLJJLI = frameLayout;
        RecyclerView recyclerView = new RecyclerView(requireContext());
        C786410Ut5.p6(recyclerView, new ViewGroup.LayoutParams(-1, -1));
        this.LL = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null) {
            linearLayoutManager.setOrientation(0);
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        try {
            new C20635115or().LIZIZ(this.LL);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.LL, 0);
        }
        RecyclerView recyclerView3 = this.LL;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new AsS8S0101000_26(this, 0));
        }
        RecyclerView recyclerView4 = this.LL;
        if (recyclerView4 != null) {
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(requireContext());
            linearLayoutManager2.setOrientation(0);
            recyclerView4.setLayoutManager(linearLayoutManager2);
        }
        RecyclerView recyclerView5 = this.LL;
        C19GS c19gs = null;
        if (recyclerView5 != null) {
            layoutManager = recyclerView5.getLayoutManager();
        } else {
            layoutManager = null;
        }
        this.LLILZIL = new C21679619sw(layoutManager);
        View view = this.LLILLJJLI;
        if (view == null) {
            view = new View(requireContext());
        }
        try {
            ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, this);
            view.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return view;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return view;
        }
    }
}
