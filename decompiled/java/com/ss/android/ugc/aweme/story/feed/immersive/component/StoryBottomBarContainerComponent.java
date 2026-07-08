package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09AE;
import X.C0BWW;
import X.C0HCN;
import X.C0HHT;
import X.C0QSJ;
import X.C0RBZ;
import X.C0RDX;
import X.C1076010e6h;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2189821An6;
import X.C2217381BqS;
import X.C298540Bn2;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C691730RBj;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryBottomBarContainerComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.follow.StoryImmersiveBottomBarVM;
import com.ss.android.ugc.aweme.story.feed.immersive.scope.StoryBottomBarScope;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryBottomBarContainerComponent extends BaseCellContentComponent<StoryBottomBarContainerComponent> implements CleanModeProtocol, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(161));
    public C09AE LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C630740Ooa LLJL;
    public boolean LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryBottomBarContainerComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/immersive/follow/StoryImmersiveBottomBarVM;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryBottomBarContainerComponent() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryImmersiveBottomBarVM.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 690), null, AFwS243S0000000_11.get$arr$(379));
        this.LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 689));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final String BB1() {
        return "bottom_bar_tag";
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{StoryBottomBarScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryBottomBarScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryBottomBarScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        if (this.LLJLIL) {
            C1076010e6h.LIZJ.LIZIZ().getRelationObservable().removeObservers(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void H() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).H();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final void Iu0() {
        C339190DRl.LIZLLL(LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).LJLLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final void Lv() {
        C339190DRl.LIZIZ(LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).onDestroyView();
        }
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        final boolean z;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        DetailNavArgModel navArgModel;
        C2189821An6 c2189821An62;
        String from = null;
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 200));
        C339190DRl.LIZLLL(view);
        view.measure(0, 0);
        if (C0HCN.LIZ()) {
            View viewLJJIJL = LJJIJL();
            viewLJJIJL.setPadding(viewLJJIJL.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), viewLJJIJL.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        } else {
            View viewLJJIJL2 = LJJIJL();
            viewLJJIJL2.setPadding(viewLJJIJL2.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), viewLJJIJL2.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        BaseFeedPageParams baseFeedPageParams2 = jm().LJ;
        if (baseFeedPageParams2 != null && (c2189821An62 = baseFeedPageParams2.param) != null) {
            from = c2189821An62.getFrom();
        }
        if (Intrinsics.LJFF(from, "STORY_ENTRANCE_INBOX_GROUP_CHAT") || ((baseFeedPageParams = jm().LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null && (navArgModel = c2189821An6.getNavArgModel()) != null && Intrinsics.LJFF(navArgModel.getStoryIsFromGroupChatSingleAvatar(), Boolean.TRUE))) {
            z = true;
        } else {
            z = false;
            if (!C298540Bn2.LIZ() || !C0BWW.LIZ()) {
                return;
            }
        }
        this.LLJLIL = true;
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new Observer() { // from class: X.0RLv
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String authorUid;
                InterfaceC665370Q7z interfaceC665370Q7z;
                CompeteAbility competeAbility;
                FollowStatus followStatus = (FollowStatus) obj;
                String userId = followStatus.getUserId();
                if (userId != null) {
                    Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                    if (aweme != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme);
                    } else {
                        authorUid = null;
                    }
                    if (Intrinsics.LJFF(userId, authorUid)) {
                        if (z && C10EU.LJIILL(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme().getAuthor(), false)) {
                            return;
                        }
                        int followStatus2 = followStatus.getFollowStatus();
                        if (followStatus2 != 1 && followStatus2 != 2) {
                            if (followStatus2 != 0) {
                                return;
                            }
                            C09AE c09ae = this.LL.LLJJL;
                            if (c09ae != null) {
                                c09ae.LIZIZ(null);
                            }
                            if (C0BWV.LIZ() && (interfaceC665370Q7z = (InterfaceC665370Q7z) this.LL.LLJL.getValue()) != null && (competeAbility = (CompeteAbility) C1558520qew.LIZ(interfaceC665370Q7z, CompeteAbility.class, null)) != null) {
                                competeAbility.FB((VideoItemParams) C631370Opb.LIZ(this.LL));
                            }
                            StoryBottomBarContainerComponent storyBottomBarContainerComponent = this.LL;
                            AssemViewModel assemViewModel = (AssemViewModel) storyBottomBarContainerComponent.LLJJLIIIJLLLLLLLZ.getValue(storyBottomBarContainerComponent, StoryBottomBarContainerComponent.LLJLILLLLZIIL[0]);
                            assemViewModel.getClass();
                            assemViewModel.setState(new AwS24S0010000_9(true, 17));
                            return;
                        }
                        this.LL.LLJJL = C1618440sDa.LIZIZ.LJJIJIL().LJI(1500L, new AwS412S0200000_11((VideoItemParams) C631370Opb.LIZ(this.LL), this.LL, 0));
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        C691730RBj.LIZ(this, (C0RBZ) this.LLJJJJLIIL.getValue(), videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
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
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
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
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
    }
}
