package com.ss.android.ugc.aweme.view.editor;

import X.C01GW;
import X.C1083840eJK;
import X.C11EA;
import X.C11NJ;
import X.C1602160rnK;
import X.C19425810zI;
import X.C19427210zW;
import X.C19427810zc;
import X.C19427910zd;
import X.C197039127h;
import X.C19U0;
import X.C19U1;
import X.C20296414bK;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1584740rLE;
import X.InterfaceC19423310yt;
import X.InterfaceC19429510zt;
import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviEditorFragment extends ProfileNaviGLSurfaceFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9LSHELIOSElPSAhZhU+Jik6JCACKDk6DSElPSAhDjctLiI2JjE=";
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 582));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 585));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 584));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 581));
    public final C19427210zW LLJI = new InterfaceC1584740rLE() { // from class: X.10zW
        @Override // X.InterfaceC1586460rO0
        public final void Yn(C19U0 c19u0) {
        }

        @Override // X.InterfaceC1586460rO0
        public final void ih(C19U0 c19u0) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC1586460rO0
        public final void Oq(C19U0 c19u0) {
            ProfileNaviEditorViewModel profileNaviEditorViewModelMR = this.LL.MR();
            int i = c19u0.LJ;
            if (((ProfileNaviEditorState) profileNaviEditorViewModelMR.FQ2()).getCurrentTabIndex() != i) {
                profileNaviEditorViewModelMR.setStateImmediate(new AwS41S0001000_29(i, 32));
            }
        }
    };
    public C20296414bK LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public TuxTextView LLJILLL;
    public C197039127h LLJJ;
    public C19U1 LLJJI;
    public C1083840eJK LLJJIII;
    public ViewGroup LLJJIJI;
    public C19425810zI LLJJIJIIJIL;
    public boolean LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final int OR() {
        return R.layout.egy;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final C20296414bK NR() {
        C20296414bK c20296414bK = this.LLJIJIL;
        if (c20296414bK == null) {
            return null;
        }
        return c20296414bK;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void PR() {
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.h9(tuxTextView, new ACListenerS163S0100000_29(this, 129));
        TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 130));
        TuxTextView tuxTextView2 = this.LLJILLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C786410Ut5.h9(tuxTextView2, new ACListenerS163S0100000_29(this, 131));
        C197039127h c197039127h = this.LLJJ;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setEnabled(false);
        C197039127h c197039127h2 = this.LLJJ;
        C786410Ut5.U8(c197039127h2 != null ? c197039127h2 : null, new ACListenerS163S0100000_29(this, 132));
    }

    public final String WR() {
        C1083840eJK c1083840eJK = this.LLJJIII;
        if (c1083840eJK == null) {
            c1083840eJK = null;
        }
        int currentItem = c1083840eJK.getCurrentItem();
        List<InterfaceC19423310yt> tabList = ((ProfileNaviEditorState) MR().hR2()).getTabList();
        if (tabList == null || tabList.size() <= currentItem) {
            return null;
        }
        return ((InterfaceC19423310yt) ListProtector.get(tabList, currentItem)).getKey();
    }

    public final void ZR() {
        C1083840eJK c1083840eJK = this.LLJJIII;
        if (c1083840eJK == null) {
            c1083840eJK = null;
        }
        int visibility = c1083840eJK.getVisibility();
        c1083840eJK.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1083840eJK);
        ViewGroup viewGroup = this.LLJJIJI;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLZ(8, viewGroup);
        C19425810zI c19425810zI = this.LLJJIJIIJIL;
        C19425810zI c19425810zI2 = c19425810zI != null ? c19425810zI : null;
        int visibility2 = c19425810zI2.getVisibility();
        c19425810zI2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c19425810zI2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aS() {
        InterfaceC19423310yt interfaceC19423310yt;
        String key;
        C19427910zd c19427910zdLIZ;
        C20296414bK c20296414bK;
        InterfaceC19429510zt naviManager;
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) MR().FQ2();
        List<InterfaceC19423310yt> tabList = profileNaviEditorState.getTabList();
        if (tabList == null || (interfaceC19423310yt = (InterfaceC19423310yt) ListProtector.get(tabList, profileNaviEditorState.getCurrentTabIndex())) == null || (key = interfaceC19423310yt.getKey()) == null || (c19427910zdLIZ = C19427810zc.LIZ(1, 66690, key)) == null || (c20296414bK = this.LLJIJIL) == null || (naviManager = c20296414bK.getNaviManager()) == null) {
            return;
        }
        int i = c19427910zdLIZ.LIZ;
        int i2 = c19427910zdLIZ.LIZJ;
        naviManager.LJIIL(i, i2, i2, c19427910zdLIZ.LIZIZ);
    }

    public final void bS() {
        ProfileNaviEditorViewModel profileNaviEditorViewModelMR = MR();
        requireActivity();
        int currentTabIndex = ((ProfileNaviEditorState) profileNaviEditorViewModelMR.hR2()).getCurrentTabIndex();
        C19U1 c19u1 = this.LLJJI;
        if (c19u1 == null) {
            c19u1 = null;
        }
        if (c19u1.getSelectedTabPosition() != -1) {
            C19U1 c19u12 = this.LLJJI;
            if (c19u12 == null) {
                c19u12 = null;
            }
            if (currentTabIndex != c19u12.getSelectedTabPosition()) {
                C19U1 c19u13 = this.LLJJI;
                C19U0 tabAt = (c19u13 != null ? c19u13 : null).getTabAt(currentTabIndex);
                if (tabAt != null) {
                    tabAt.LIZIZ();
                }
            }
        }
        aS();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ProfileNaviEditorViewModel profileNaviEditorViewModelMR = MR();
        if (((ProfileNaviEditorState) profileNaviEditorViewModelMR.FQ2()).getNaviDoneLoading()) {
            profileNaviEditorViewModelMR.setStateImmediate(new AwS41S0010000_29(false, 48));
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJJIJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void RR(C11NJ c11nj) {
        super.RR(c11nj);
        c11nj.LIZ(C11EA.LJII(this, MR(), new C2217381BqS() { // from class: X.10za
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getTabList();
            }
        }, new AwS643S0100000_29(this, 48)));
        c11nj.LIZ(C11EA.LJII(this, MR(), new C2217381BqS() { // from class: X.10zM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getEditCategory();
            }
        }, new AwS643S0100000_29(this, 49)));
        c11nj.LIZ(C11EA.LJII(this, MR(), new C2217381BqS() { // from class: X.10zX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((ProfileNaviEditorState) obj).getCurrentTabIndex());
            }
        }, new AwS643S0100000_29(this, 50)));
        c11nj.LIZ(C11EA.LJII(this, MR(), new C2217381BqS() { // from class: X.10zY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviEditorState) obj).getNaviDoneLoading());
            }
        }, new AwS643S0100000_29(this, 51)));
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLJIJIL = (C20296414bK) view.findViewById(R.id.p2p);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.s3v);
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.s3m);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.s3w);
        this.LLJJ = (C197039127h) view.findViewById(R.id.p2o);
        this.LLJJI = (C19U1) view.findViewById(R.id.p2v);
        this.LLJJIII = (C1083840eJK) view.findViewById(R.id.p2t);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.p2q);
        this.LLJJIJIIJIL = (C19425810zI) view.findViewById(R.id.p2r);
        super.onViewCreated(view, bundle);
    }
}
