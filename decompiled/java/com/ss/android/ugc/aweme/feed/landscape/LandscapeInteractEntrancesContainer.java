package com.ss.android.ugc.aweme.feed.landscape;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0RQ6;
import X.C1383760m74;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1591220rVg;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C718190SFd;
import X.C723830SaL;
import X.C724240Sb0;
import X.C726220SeC;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC726190Se9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC691660RBc;
import X.InterfaceC726170Se7;
import X.ViewTreeObserverOnGlobalLayoutListenerC738830SyX;
import Y.AComparatorS30S0000000_11;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeInteractEntrancesContainer extends BaseContainer<VContainerProtocol, LandscapeInteractEntrancesContainer> implements LandscapeEntrancesControlAbility, InterfaceC1554640qYg {
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(109));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 385));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 383));
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public View LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public String LLLF;
    public boolean LLLFF;
    public final int LLLFFI;
    public final int LLLFZ;
    public final int LLLI;
    public final int LLLII;
    public final List<InterfaceC726170Se7> LLLIIII;
    public final ViewTreeObserverOnGlobalLayoutListenerC738830SyX LLLIIIIL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1215530286) {
            return null;
        }
        return this;
    }

    public final InteractBizTopAreaAttachAbility sp() {
        return (InteractBizTopAreaAttachAbility) this.LLJLILLLLZIIL.getValue();
    }

    public LandscapeInteractEntrancesContainer() {
        C628500Oky.LIZ(new AwS555S0100000_11(this, 384));
        this.LLJLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(177));
        this.LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoDescVM.class), AFwS243S0000000_11.get$arr$(178));
        this.LLJZ = -1;
        this.LLJZIJLIL = -1;
        this.LLL = -1;
        this.LLLF = "";
        this.LLLFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        this.LLLFZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        this.LLLIIII = new ArrayList();
        this.LLLIIIIL = new ViewTreeObserverOnGlobalLayoutListenerC738830SyX(this, 1);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbilitySp;
        if (!C1591220rVg.LIZLLL() || (interactBizTopAreaAttachAbilitySp = sp()) == null) {
            return;
        }
        interactBizTopAreaAttachAbilitySp.XT(this.LLLIIIIL);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility
    public final View ML() {
        return this.LLJLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return C0RQ6.LANDSCAPE_INTERACT_ENTRANCES_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility
    public final void Y31(boolean z) {
        if (!this.LLLFF) {
            return;
        }
        List<InterfaceC726170Se7> list = this.LLLIIII;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<InterfaceC726170Se7> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().M9()) {
                if (z) {
                    View view = this.LLJLLL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                        return;
                    }
                    return;
                }
                View view2 = this.LLJLLL;
                if (view2 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    public final void tp(VideoItemParams videoItemParams) {
        int i = jm().LIZ;
        C726220SeC c726220SeC = C726220SeC.LIZIZ;
        if (c726220SeC.LJIIJJI(i, videoItemParams.getAweme())) {
            C723830SaL.LJ(this, C13LE.LIZ(LandscapeEntranceAssem.class), true, null);
        }
        C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
        if (c1383760m74.LJJIFFI(videoItemParams.getAweme()) && !Intrinsics.LJFF(videoItemParams.mEventType, "homepage_playmode_new") && !Intrinsics.LJFF(videoItemParams.mEventType, "homepage_playmode_top") && !Intrinsics.LJFF(videoItemParams.mEventType, "homepage_playmode_moodboost")) {
            C723830SaL.LJ(this, c1383760m74.LJIJJ(), true, null);
        }
        if (c726220SeC.LJIILIIL(i, videoItemParams.getAweme()) && !C718190SFd.LIZLLL(videoItemParams.getAweme(), videoItemParams.mEventType)) {
            this.LLLFF = true;
            View view = this.LLJLLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) this.LLJLIL.getValue();
            if (rootCellCommonAbility != null) {
                rootCellCommonAbility.H8(new ViewTreeObserverOnGlobalLayoutListenerC738830SyX(this, 5));
                return;
            }
            return;
        }
        View view2 = this.LLJLLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        this.LLLFF = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility
    public final void nU(InterfaceC726170Se7 interfaceC726170Se7) {
        Object obj;
        EnumC726190Se9 enumC726190Se9;
        if (interfaceC726170Se7 != null && !((ArrayList) this.LLLIIII).contains(interfaceC726170Se7)) {
            ((ArrayList) this.LLLIIII).add(interfaceC726170Se7);
        }
        List<InterfaceC726170Se7> list = this.LLLIIII;
        ArrayList arrayList = new ArrayList();
        ArrayList<InterfaceC726170Se7> arrayList2 = (ArrayList) list;
        for (Object obj2 : arrayList2) {
            if (((InterfaceC726170Se7) obj2).M9()) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            View view = this.LLJLLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC726170Se7) it2.next()).rl();
        }
        View view2 = this.LLJLLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((InterfaceC726170Se7) obj3).xd()) {
                arrayList3.add(obj3);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS30S0000000_11(6), arrayList3);
        if (listLJLLLL.isEmpty()) {
            obj = ListProtector.get(arrayList, 0);
        } else {
            obj = ListProtector.get(listLJLLLL, 0);
        }
        for (InterfaceC726170Se7 interfaceC726170Se72 : arrayList2) {
            if (Intrinsics.LJFF(interfaceC726170Se72, obj)) {
                enumC726190Se9 = EnumC726190Se9.SHOW_FULL_ENTRANCE;
            } else if (interfaceC726170Se72.M9()) {
                enumC726190Se9 = EnumC726190Se9.SHOW_ICON_ONLY;
            } else {
                enumC726190Se9 = EnumC726190Se9.HIDE;
            }
            interfaceC726170Se72.f6(enumC726190Se9);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLL = LJJIJL().findViewById(R.id.m5d);
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 139));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLL.getValue(), new C2217381BqS() { // from class: X.0NlB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(254), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLL.getValue(), new C2217381BqS() { // from class: X.0NzZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(255), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0S6k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C715890S6h) obj).LLIZLLLIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(253), 6);
    }

    public final void op(int i) {
        RelativeLayout.LayoutParams layoutParams;
        View view = this.LLJLLL;
        if (view == null) {
            return;
        }
        int i2 = this.LLLI + i;
        if (Intrinsics.LJFF(this.LLLF, "align_video")) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null && layoutParams.topMargin == i + this.LLLI) {
                return;
            }
        }
        this.LLLF = "align_video";
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams3.removeRule(8);
        layoutParams3.bottomMargin = 0;
        layoutParams3.addRule(10);
        layoutParams3.topMargin = i2;
        C786410Ut5.W5(view, layoutParams3);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }
}
