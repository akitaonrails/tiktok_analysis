package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C01GW;
import X.C16GX;
import X.C21648319nt;
import X.C21648419nu;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1324370kZH;
import X.ViewGroupOnHierarchyChangeListenerC21648519nv;
import Y.ARunnableS41S0400000_33;
import Y.AsS58S0100000_33;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3NavHideOnScrollConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3NavHideOnScrollAssem extends UIContentAssem {
    public C21648419nu LLJI;
    public ViewGroup LLJIJIL;
    public C16GX LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public ValueAnimator LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS213S0000000_24.get$arr$(180));
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 522));
    public final C21648319nt LLJJI = new InterfaceC1324370kZH() { // from class: X.19nt
        @Override // X.InterfaceC1324380kZI
        public final void LLZZJLIL(C16GX c16gx, int i) {
            C21648419nu c21648419nu = this.LL.LLJI;
            if (c21648419nu != null) {
                int totalScrollRange = c16gx.getTotalScrollRange();
                if (c21648419nu.LIZLLL) {
                    int i2 = c21648419nu.LJII;
                    c21648419nu.LJII = i;
                    if (totalScrollRange > 0 && i != i2 && c21648419nu.LJ != 0) {
                        int i3 = i2 - i;
                        int iLIZIZ = C814420VxA.LIZIZ(c21648419nu.LIZIZ());
                        int i4 = c21648419nu.LJI;
                        int iLJ = C13LZ.LJ(i4 + i3, 0, iLIZIZ);
                        if (i3 < 0) {
                            iLJ = Math.max(iLJ, Math.min(C13LZ.LJ(-i, 0, iLIZIZ), i4));
                        }
                        c21648419nu.LJI = iLJ;
                        c21648419nu.LJFF();
                    }
                }
            }
        }
    };
    public final AsS58S0100000_33 LLJJIII = new AsS58S0100000_33(this, 4);
    public final ViewGroupOnHierarchyChangeListenerC21648519nv LLJJIJI = new ViewGroup.OnHierarchyChangeListener() { // from class: X.19nv
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            C21648419nu c21648419nu = this.LL.LLJI;
            if (c21648419nu != null) {
                c21648419nu.LIZLLL(false);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            C21648419nu c21648419nu = this.LL.LLJI;
            if (c21648419nu != null) {
                c21648419nu.LIZLLL(true);
            }
        }
    };

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.LLJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJ = null;
        FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLJ.getValue();
        if (friendsV3FeedListAbility != null) {
            friendsV3FeedListAbility.f52(this.LLJJIII);
        }
        ViewGroup viewGroup = this.LLJIJIL;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
        this.LLJIJIL = null;
        C16GX c16gx = this.LLJILJIL;
        if (c16gx != null) {
            c16gx.LIZLLL(this.LLJJI);
        }
        this.LLJILJIL = null;
        C21648419nu c21648419nu = this.LLJI;
        if (c21648419nu != null) {
            c21648419nu.LIZ();
        }
        this.LLJI = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        FrameLayout frameLayout = (FrameLayout) LJJIJL().findViewById(R.id.hul);
        View viewFindViewById = LJJIJL().findViewById(R.id.huk);
        View viewFindViewById2 = LJJIJL().findViewById(R.id.ijd);
        View viewFindViewById3 = LJJIJL().findViewById(R.id.ydi);
        if (frameLayout != null && viewFindViewById != null && viewFindViewById2 != null) {
            C21648419nu c21648419nu = new C21648419nu(viewFindViewById2, (FriendsV3NavHideOnScrollConfig) this.LLIZLLLIL.getValue());
            c21648419nu.LJIILIIL = new AwS612S0100000_33(this, 78);
            c21648419nu.LJIILJJIL = new AwS577S0100000_33(this, 2275);
            this.LLJI = c21648419nu;
            HandlerHook.viewPost(LJJIJL(), new ARunnableS41S0400000_33(viewFindViewById3, this, frameLayout, viewFindViewById2, 1));
            ViewGroup viewGroup = (ViewGroup) LJJIJL().findViewById(R.id.h3o);
            C16GX c16gx = null;
            if (viewGroup != null) {
                viewGroup.setOnHierarchyChangeListener(this.LLJJIJI);
                C21648419nu c21648419nu2 = this.LLJI;
                if (c21648419nu2 != null) {
                    if (viewGroup.getChildCount() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c21648419nu2.LIZLLL(z);
                }
            } else {
                viewGroup = null;
            }
            this.LLJIJIL = viewGroup;
            C16GX c16gx2 = (C16GX) LJJIJL().findViewById(R.id.fbu);
            if (c16gx2 != null) {
                c16gx2.LIZ(this.LLJJI);
                c16gx = c16gx2;
            }
            this.LLJILJIL = c16gx;
        }
    }
}
