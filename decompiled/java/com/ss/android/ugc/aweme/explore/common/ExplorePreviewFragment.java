package com.ss.android.ugc.aweme.explore.common;

import X.C034Q;
import X.C098200Yq;
import X.C0SQU;
import X.C0TUA;
import X.C0TUE;
import X.C14EU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C277490AuB;
import X.C426320Gne;
import X.C786410Ut5;
import X.C799570VYd;
import X.InterfaceC836760Ws6;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class ExplorePreviewFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiA0OSM8OiHELIOSBiKiA+JSoiZworOCkjOyoDOiA6ICokDjctLiI2JjE=";
    public String LLIZ;
    public View LLIZLLLIL;
    public C426320Gne LLJ;
    public ImageView LLJI;
    public View LLJIJIL;
    public FrameLayout LLJILJIL;
    public final C0TUA LLJILJILJ = new C0TUA();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJILJILJ.LIZ();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        C0TUE.LIZ = null;
        C0TUE.LIZIZ = null;
        C0TUE.LIZJ = null;
        C0TUE.LIZLLL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString(FollowStatusChangeMethod.PARAM_UID, "");
        } else {
            string = null;
        }
        this.LLIZ = string;
        C0TUA c0tua = this.LLJILJILJ;
        c0tua.LIZIZ = string;
        c0tua.LIZIZ();
        if (c0tua.LIZ) {
            long jLongValue = ((Number) C277490AuB.LIZ.getValue()).longValue();
            if (jLongValue > 0 && c0tua.LJII == null) {
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(c0tua, 462);
                c0tua.LJII = aRunnableS112S0100000_12;
                C786410Ut5.LJLIIL(jLongValue, C799570VYd.LIZJ(), aRunnableS112S0100000_12);
            }
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onExploreTransientFragmentEnterEvent(C034Q c034q) {
        C0TUA c0tua = this.LLJILJILJ;
        if (Intrinsics.LJFF(c0tua.LIZIZ, c034q.LIZ.getAid())) {
            c0tua.LIZJ = true;
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = c0tua.LJII;
            if (aRunnableS112S0100000_12 != null) {
                C799570VYd.LIZJ().removeCallbacks(aRunnableS112S0100000_12);
            }
            c0tua.LJII = null;
        }
        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS81S0200000_12(this, c034q, 53));
        EventBus.LIZLLL().LJIL(c034q);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = view.findViewById(R.id.mmw);
        this.LLJ = (C426320Gne) view.findViewById(R.id.mmx);
        this.LLJI = (ImageView) view.findViewById(R.id.mmy);
        this.LLJIJIL = view.findViewById(R.id.mmu);
        this.LLJILJIL = (FrameLayout) view.findViewById(R.id.mmv);
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        C426320Gne c426320Gne = this.LLJ;
        if (c426320Gne != null) {
            C786410Ut5.LLLZZ(c426320Gne, 0);
        }
        C426320Gne c426320Gne2 = this.LLJ;
        if (c426320Gne2 != null) {
            c426320Gne2.LIZ(65.0f, false);
        }
        Bitmap bitmap = C0SQU.LIZ;
        C0SQU.LIZ = null;
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
            FrameLayout frameLayout = this.LLJILJIL;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = bitmap.getHeight();
                    C786410Ut5.W5(frameLayout, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            ImageView imageView2 = this.LLJI;
            if (imageView2 != null) {
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            ImageView imageView3 = this.LLJI;
            if (imageView3 != null) {
                imageView3.setImageBitmap(bitmap);
            }
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            C786410Ut5.I7(new AbS694S0100000_12(this, 35), view3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c5h, viewGroup, false);
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
