package com.ss.android.ugc.aweme.detail.ui.friends;

import X.C0N0Y;
import X.C0NCM;
import X.C0SZ8;
import X.C0T0K;
import X.C0T45;
import X.C1206304nl;
import X.C1246920iYM;
import X.C1360340lVI;
import X.C1389300mG0;
import X.C1558420qem;
import X.C1558520qew;
import X.C1599640rjG;
import X.C1606370ru7;
import X.C1697810uHb;
import X.C1888107aR;
import X.C19252910Tv;
import X.C19EG;
import X.C20673215v0;
import X.C21588319eD;
import X.C278610Avz;
import X.C296380BjY;
import X.C337180DJs;
import X.C486860J7k;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1209130hZP;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.InterfaceC752360TfG;
import Y.ACListenerS158S0100000_24;
import Y.AObserverS226S0100000_24;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.SplitContainerManager;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsDetailPageComponent extends DetailPageComponent implements IFriendsDetailPageAbility, InterfaceC1554640qYg {
    public final List<View> LLLJIL = new ArrayList();
    public C21588319eD LLLJL;
    public long LLLL;
    public Boolean LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final void Cy1() {
        this.LLLLIIL = true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final void kr2() {
        y62(true);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1476451645) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fp() {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.friends.FriendsDetailPageComponent.Fp():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final void S() {
        InterfaceC1209130hZP interfaceC1209130hZP;
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null && (interfaceC1209130hZP = detailFragmentPanel.I) != null) {
            interfaceC1209130hZP.kB();
        }
        LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final void SO1() {
        C21588319eD c21588319eD = this.LLLJL;
        if (c21588319eD != null) {
            c21588319eD.setEnableDrag(false);
        }
        Iterator<View> it2 = this.LLLJIL.iterator();
        while (it2.hasNext()) {
            C337180DJs.LIZIZ(it2.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final void XK1() {
        C21588319eD c21588319eD = this.LLLJL;
        if (c21588319eD != null) {
            c21588319eD.setForceDisableDrag(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final void ig1() {
        C21588319eD c21588319eD = this.LLLJL;
        if (c21588319eD != null) {
            c21588319eD.setEnableDrag(true);
        }
        Iterator<View> it2 = this.LLLJIL.iterator();
        while (it2.hasNext()) {
            C337180DJs.LIZJ(it2.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Fragment fragmentVu;
        DetailFragmentPanel detailFragmentPanel;
        C0N0Y playerManager;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        C21588319eD c21588319eD = this.LLLJL;
        if (c21588319eD != null) {
            ((LinkedHashMap) c21588319eD.LLJIJIL).clear();
        }
        if (((Boolean) C278610Avz.LIZ.getValue()).booleanValue()) {
            C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
            if (!c1599640rjG.Ru() && (((fragmentVu = c1599640rjG.Vu()) == null || (lifecycle = fragmentVu.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) && (detailFragmentPanel = this.LLJL) != null && (playerManager = detailFragmentPanel.getPlayerManager()) != null)) {
                playerManager.release();
            }
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final void rN() {
        C21588319eD c21588319eD = this.LLLJL;
        if (c21588319eD != null) {
            c21588319eD.setEnableTransform(false);
        }
    }

    public final FriendsDetailTransitionAbility Ep() {
        C0SZ8 c0sz8LJLIL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ3;
        FriendsDetailTransitionAbility friendsDetailTransitionAbility;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (iViewPagerComponentAbilityMb != null && (c0sz8LJLIL2 = iViewPagerComponentAbilityMb.LJLIL()) != null && (interfaceC665370Q7zLIZIZ3 = C0T0K.LIZIZ(c0sz8LJLIL2)) != null && (friendsDetailTransitionAbility = (FriendsDetailTransitionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ3, FriendsDetailTransitionAbility.class, null)) != null) {
            return friendsDetailTransitionAbility;
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = Mb();
        if (iViewPagerComponentAbilityMb2 == null || (c0sz8LJLIL = iViewPagerComponentAbilityMb2.LJLIL()) == null) {
            return null;
        }
        if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, FriendsDetailTransitionAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, FriendsDetailTransitionAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        return (FriendsDetailTransitionAbility) interfaceC494301wDLIZ2;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void LJIJ() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        IPhotoSlidesAbility iPhotoSlidesAbility;
        C0N0Y playerManager;
        if (C296380BjY.LIZ()) {
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            this.LLLLII = (detailFragmentPanel == null || (playerManager = detailFragmentPanel.getPlayerManager()) == null) ? null : Boolean.valueOf(playerManager.isPlaying());
        }
        C1599640rjG.LIZIZ.Qa();
        if (!C1888107aR.LIZ()) {
            super.LJIJ();
            return;
        }
        FriendsDetailTransitionAbility friendsDetailTransitionAbilityEp = Ep();
        if (friendsDetailTransitionAbilityEp != null && friendsDetailTransitionAbilityEp.xN(true)) {
            FriendsDetailTransitionAbility friendsDetailTransitionAbilityEp2 = Ep();
            if (friendsDetailTransitionAbilityEp2 != null) {
                friendsDetailTransitionAbilityEp2.HM(new AwS568S0100000_24(this, 270));
                return;
            } else {
                super.LJIJ();
                return;
            }
        }
        if (C1206304nl.LIZ() && C1389300mG0.LJIILLIIL(getFragment()) && ((iViewPagerComponentAbilityMb = Mb()) == null || (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) == null || (interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(c0sz8LJLIL)) == null || (iPhotoSlidesAbility = (IPhotoSlidesAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPhotoSlidesAbility.class, null)) == null || iPhotoSlidesAbility.xt0() != 0)) {
            super.LJIJ();
            return;
        }
        FriendsDetailTransitionAbility friendsDetailTransitionAbilityEp3 = Ep();
        if (friendsDetailTransitionAbilityEp3 != null) {
            friendsDetailTransitionAbilityEp3.Dd0(new AwS568S0100000_24(this, 271));
        } else {
            super.LJIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, X.AbstractC738140SxQ
    public final void onPause() {
        C19EG c19egLIZ;
        C0N0Y playerManager;
        Aweme aweme;
        String aid;
        super.onPause();
        if (C296380BjY.LIZ() && !this.LLLLIIIILLL && (c19egLIZ = C724240Sb0.LIZ(this)) != null && c19egLIZ.isFinishing()) {
            this.LLLLIIIILLL = true;
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel == null || (playerManager = detailFragmentPanel.getPlayerManager()) == null || (aweme = this.LLLFFI) == null || (aid = aweme.getAid()) == null || aid.length() <= 0) {
                return;
            }
            String str = C1246920iYM.LIZIZ;
            if (str == null || str.length() <= 0) {
                str = aid;
            }
            Boolean bool = this.LLLLII;
            C1599640rjG.LIZIZ.Su(new C0NCM(playerManager, aid, str, bool != null ? bool.booleanValue() : playerManager.isPlaying()));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        this.LLLL = System.currentTimeMillis();
        if (!C1888107aR.LIZ()) {
            C1599640rjG.LIZIZ.Du();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (this.LLLL == 0) {
            return;
        }
        Fp();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final boolean AP() {
        return this.LLLLIIL;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void Ho(View view) {
        TuxIconView tuxIconView;
        super.Ho(view);
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C337180DJs.LIZ(view2);
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.o52);
        View viewLJLLLL = null;
        if (viewStub != null) {
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        }
        if ((viewLJLLLL instanceof TuxIconView) && (tuxIconView = (TuxIconView) viewLJLLLL) != null) {
            C337180DJs.LIZJ(tuxIconView);
            C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 82));
        }
        this.LLLJL = (C21588319eD) view.findViewById(R.id.i5b);
        if (C1360340lVI.LIZJ(this.LLJJL)) {
            ((ArrayList) this.LLLJIL).addAll(C1697810uHb.LJIIJJI(view.findViewById(R.id.g1d), view.findViewById(R.id.g1e), view.findViewById(R.id.uzr), view.findViewById(R.id.cb7)));
        }
        if (!C296380BjY.LIZ()) {
            y62(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility
    public final void Fy1(View view, Function1<? super Integer, Boolean> function1) {
        C21588319eD c21588319eD = this.LLLJL;
        if (c21588319eD != null) {
            c21588319eD.LLJIJIL.put(view, function1);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19egLIZ);
            Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(getFragment());
            LifecycleOwner lifecycleOwner = c19egLIZ;
            if (fragmentLIZIZ != null) {
                lifecycleOwner = fragmentLIZIZ;
            }
            scrollSwitchStateManagerLIZIZ.IQ2(lifecycleOwner, new AObserverS226S0100000_24(this, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String strLLFF;
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.bl7, getActivity(), viewGroup, false);
        C0T45 c0t45LJIIIIZZ = C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null || (strLLFF = detailFragmentPanel.LLFF()) == null) {
            strLLFF = "";
        }
        Fragment fragment = getFragment();
        c0t45LJIIIIZZ.getClass();
        InterfaceC752360TfG interfaceC752360TfGLIZ = SplitContainerManager.LIZ(strLLFF, fragment, viewLIZLLL, false);
        this.LLLF = interfaceC752360TfGLIZ;
        View viewLJ = interfaceC752360TfGLIZ.LJ();
        if (viewLJ != null) {
            return viewLJ;
        }
        return viewLIZLLL;
    }
}
