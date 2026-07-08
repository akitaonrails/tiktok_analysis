package com.ss.android.ugc.aweme.view.hub;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C110W;
import X.C110X;
import X.C11EA;
import X.C11NJ;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19423210ys;
import X.C19424410z4;
import X.C19424810z8;
import X.C19429110zp;
import X.C19M4;
import X.C20296414bK;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2344009Gk;
import X.C452501pT;
import X.C504670Jqj;
import X.C703302op;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC19403010vc;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviHubFragment extends ProfileNaviGLSurfaceFragment implements C110X {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDHELIOSh9IDAuZx8hJyMlJSodKTMlAToxDjctLiI2JjE=";
    public C19M4 LLILZLL;
    public LinearLayout LLIZ;
    public LinearLayout LLIZLLLIL;
    public TuxIconView LLJ;
    public ConstraintLayout LLJI;
    public C20296414bK LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 593));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 592));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 594));
    public final BPEAHandler LLJJ = new BPEAHandler(Looper.getMainLooper());

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final int OR() {
        return R.layout.eh7;
    }

    @Override // X.C110X
    public final void Dj() {
        C19423210ys.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "avatar_hub");
        C20684815ws.LJIILLIIL("delete_avatar", c2344009Gk.LIZ);
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZ(2131827180);
            C985403tE.LIZ(c1397580mTM, new AwS608S0100000_29(this, 331));
            if (C703302op.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().naviId)) {
                String str = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().naviId;
                C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
                if (C504670Jqj.LIZ(str, c19424410z4 != null ? c19424410z4.LIZ : null)) {
                    c1397580mTM.LJFF(2131827180);
                    c1397580mTM.LIZ(2131827179);
                }
            }
            C20684815ws.LJIILLIIL("show_exit_avatar_confirmation_popup", new C2344009Gk().LIZ);
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final C20296414bK NR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p2w) : null;
            this.LLJIJIL = (C20296414bK) viewFindViewById;
        }
        return (C20296414bK) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void PR() {
        ProfileNaviDataModel profileNaviDataModel;
        C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
        if ((c19424410z4 == null || c19424410z4.LIZ == null) && ((profileNaviDataModel = C19429110zp.LJFF) == null || profileNaviDataModel.navi_id == null)) {
            C786410Ut5.LJLIIL(500L, this.LLJJ, new ARunnableS129S0100000_29(this, 102));
        }
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p2s) : null;
            this.LLILZLL = (C19M4) viewFindViewById;
        }
        C786410Ut5.c9((C19M4) viewFindViewById, new ACListenerS163S0100000_29(this, 133));
        View viewFindViewById2 = this.LLIZ;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.s43) : null;
            this.LLIZ = (LinearLayout) viewFindViewById2;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById2, new ACListenerS163S0100000_29(this, 134));
        C786410Ut5.R7(WR(), new ACListenerS163S0100000_29(this, 135));
        View viewFindViewById3 = this.LLJ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            viewFindViewById3 = view3 != null ? view3.findViewById(R.id.s41) : null;
            this.LLJ = (TuxIconView) viewFindViewById3;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById3, new ACListenerS163S0100000_29(this, 136));
        View view4 = this.LLJI;
        if (view4 == null) {
            View view5 = getView();
            View viewFindViewById4 = view5 != null ? view5.findViewById(R.id.s49) : null;
            this.LLJI = (ConstraintLayout) viewFindViewById4;
            view4 = viewFindViewById4;
        }
        C786410Ut5.Y7((ConstraintLayout) view4, new ACListenerS163S0100000_29(this, 137));
    }

    public final LinearLayout WR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s44) : null;
            this.LLIZLLLIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C110X
    public final boolean Bw() {
        IProfileNaviService iProfileNaviServiceLJI = ProfileNaviServiceImpl.LJI();
        C110W c110w = (C110W) this.LLJILLL.getValue();
        List<ProfileNaviDataModel> naviList = ((ProfileNaviSwitcherState) ((BaseJediViewModel) this.LLILZIL.getValue()).hR2()).getNaviList();
        if (!iProfileNaviServiceLJI.LIZ(c110w, naviList != null ? naviList.size() : 0)) {
            return false;
        }
        C19423210ys.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "avatar_hub");
        C20684815ws.LJIILLIIL("create_avatar_duplicate", c2344009Gk.LIZ);
        C786410Ut5.LJIIIIZZ((C110W) this.LLJILLL.getValue());
        ProfileNaviEditorViewModel profileNaviEditorViewModelMR = MR();
        profileNaviEditorViewModelMR.getClass();
        if (((ProfileNaviEditorState) profileNaviEditorViewModelMR.FQ2()).getCurrentTabIndex() != 1) {
            profileNaviEditorViewModelMR.setStateImmediate(new AwS41S0001000_29(1, 32));
        }
        ProfileNaviEditorViewModel profileNaviEditorViewModelMR2 = MR();
        profileNaviEditorViewModelMR2.getClass();
        profileNaviEditorViewModelMR2.setState(new AwS41S0010000_29(true, 45));
        JediViewModel jediViewModel = (JediViewModel) this.LLJILJIL.getValue();
        jediViewModel.getClass();
        C19429110zp c19429110zp = C19429110zp.LIZ;
        C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
        if (c19424410z4 != null) {
            HashMap<String, InterfaceC19403010vc> map = C19429110zp.LJ;
            if (map != null) {
                C19424410z4 c19424410z4LIZ = C19424810z8.LIZ(c19424410z4.LIZJ(), map);
                c19424410z4LIZ.LIZ = null;
                c19424410z4LIZ.LJFF = null;
                c19424410z4LIZ.LJ = null;
                c19429110zp.LIZJ(c19424410z4LIZ);
            }
            jediViewModel.setStateImmediate(AFwS273S0000000_29.get$arr$(299));
            jediViewModel.setStateImmediate(AFwS273S0000000_29.get$arr$(301));
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJJ.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void RR(C11NJ c11nj) {
        super.RR(c11nj);
        C11EA.LJII(this, (JediViewModel) this.LLILZIL.getValue(), new C2217371BqR() { // from class: X.1109
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviSwitcherState) obj).getNaviList();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSwitcherState) obj).setNaviList((List) obj2);
            }
        }, new AwS643S0100000_29(this, 52));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ProfileNaviSwitcherViewModel) this.LLILZIL.getValue()).lR2();
    }
}
