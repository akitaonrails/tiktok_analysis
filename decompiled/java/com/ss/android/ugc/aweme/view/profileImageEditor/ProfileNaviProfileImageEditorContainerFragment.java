package com.ss.android.ugc.aweme.view.profileImageEditor;

import X.C01GW;
import X.C098200Yq;
import X.C11EA;
import X.C11NJ;
import X.C14EU;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C189200o6;
import X.C19423210ys;
import X.C19424410z4;
import X.C19429110zp;
import X.C19430010zy;
import X.C19EG;
import X.C19GS;
import X.C20296414bK;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2344009Gk;
import X.C452501pT;
import X.C703302op;
import X.C786410Ut5;
import X.InterfaceC19429510zt;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviProfileImageEditorContainerFragment extends ProfileNaviGLSurfaceFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9ODcjLyY/LQwhKCg2DSElPSAhHELIOSZhU+Jik6JCACKDk6GDcjLyY/LQwhKCg2DSElPSAhCyoiPS46JiA+Dz0yLygpJzs=";
    public C20296414bK LLILZLL;
    public String LLIZ = "avatar_hub";
    public final String LLIZLLLIL = "ImageEditorContainer";
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 599));

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final int OR() {
        return R.layout.ehb;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void PR() {
        FragmentManager supportFragmentManager;
        WR(null);
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        String str = this.LLIZ;
        ProfileNaviProfileImageEditorFragment profileNaviProfileImageEditorFragment = new ProfileNaviProfileImageEditorFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        profileNaviProfileImageEditorFragment.setArguments(bundle);
        profileNaviProfileImageEditorFragment.show(supportFragmentManager, this.LLIZLLLIL);
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final C20296414bK NR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s4a) : null;
            this.LLILZLL = (C20296414bK) viewFindViewById;
        }
        return (C20296414bK) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void RR(C11NJ c11nj) {
        super.RR(c11nj);
        c11nj.LIZ(C11EA.LJII(this, (JediViewModel) this.LLJ.getValue(), new C2217371BqR() { // from class: X.10zu
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviCreatorState) obj).getProfileImageBackgroundColor();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setProfileImageBackgroundColor((String) obj2);
            }
        }, new AwS643S0100000_29(this, 53)));
    }

    public final void WR(String str) {
        String str2;
        int color;
        try {
            C20296414bK c20296414bKNR = NR();
            if (C703302op.LIZ(str)) {
                color = Color.parseColor(str);
            } else {
                ((ProfileNaviCreatorViewModel) this.LLJ.getValue()).getClass();
                C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
                if (c19424410z4 != null) {
                    str2 = c19424410z4.LIZIZ;
                } else {
                    str2 = null;
                }
                color = Color.parseColor(str2);
            }
            if (c20296414bKNR != null) {
                InterfaceC19429510zt naviManager = c20296414bKNR.getNaviManager();
                if (naviManager != null) {
                    naviManager.LJIILLIIL(Color.red(color) / 256.0f);
                }
                InterfaceC19429510zt naviManager2 = c20296414bKNR.getNaviManager();
                if (naviManager2 != null) {
                    naviManager2.LJ(Color.blue(color) / 256.0f);
                }
                InterfaceC19429510zt naviManager3 = c20296414bKNR.getNaviManager();
                if (naviManager3 != null) {
                    naviManager3.LJIIZILJ(Color.green(color) / 256.0f);
                }
                InterfaceC19429510zt naviManager4 = c20296414bKNR.getNaviManager();
                if (naviManager4 != null) {
                    naviManager4.LJIJJLI();
                }
                InterfaceC19429510zt naviManager5 = c20296414bKNR.getNaviManager();
                if (naviManager5 != null) {
                    naviManager5.f2();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onImageEditorEvent(C19430010zy c19430010zy) {
        C20296414bK c20296414bKNR;
        int i = c19430010zy.LIZ;
        if (i != 0) {
            if (i == 1 && (c20296414bKNR = NR()) != null) {
                int visibility = c20296414bKNR.getVisibility();
                c20296414bKNR.setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, c20296414bKNR);
                return;
            }
            return;
        }
        C20296414bK c20296414bKNR2 = NR();
        if (c20296414bKNR2 == null) {
            return;
        }
        int visibility2 = c20296414bKNR2.getVisibility();
        c20296414bKNR2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c20296414bKNR2);
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19423210ys c19423210ys = C19423210ys.LIZ;
        String str = this.LLIZ;
        c19423210ys.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("show_set_avatar_profile", c2344009Gk.LIZ);
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
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
