package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0SZ8;
import X.C13LE;
import X.C14LC;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C706480RnS;
import X.C712440Rx4;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C728750SiH;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC712990Rxx;
import Y.AObserverS210S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryGuideCardScope;
import com.ss.android.ugc.aweme.story.feed.guidecard.filter.GuideCardFilterVM;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardAvatarViewModel;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS99S0110000_11;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class StoryGuideCardComponent extends BaseCellSlotComponent<StoryGuideCardComponent> implements C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 660));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 667));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 659));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 657));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 661));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS555S0100000_11(this, 666));
    public final C630740Ooa LLLFF = C628500Oky.LIZ(new AwS555S0100000_11(this, 663));
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(153));
    public final InterfaceC1731706qJ LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final C630740Ooa LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryGuideCardComponent.class, "filterVM", "getFilterVM()Lcom/ss/android/ugc/aweme/story/feed/guidecard/filter/GuideCardFilterVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StoryGuideCardComponent.class, "avatarVM", "getAvatarVM()Lcom/ss/android/ugc/aweme/story/feed/guidecard/viewmodel/StoryGuideCardAvatarViewModel;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public StoryGuideCardComponent() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GuideCardFilterVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLFZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 664), null, AFwS243S0000000_11.get$arr$(370));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(StoryGuideCardAvatarViewModel.class);
        this.LLLI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), null, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 665), null, AFwS243S0000000_11.get$arr$(371));
        this.LLLII = C628500Oky.LIZ(new AwS555S0100000_11(this, 658));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ip, reason: merged with bridge method [inline-methods] */
    public void tp(VideoItemParams videoItemParams) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return R.layout.fbf;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{StoryGuideCardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryGuideCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryGuideCardScope.class);
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

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 662);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_guide_card_content", true, awS555S0100000_11);
    }

    public void Ep() {
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 475));
    }

    public final StoryGuideCardAvatarViewModel Fp() {
        return (StoryGuideCardAvatarViewModel) this.LLLI.getValue(this, LLLIIII[1]);
    }

    public final C197039127h Gp() {
        return (C197039127h) this.LLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Boolean bool;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        InterfaceC712990Rxx interfaceC712990Rxx;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        boolean zBooleanValue = false;
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                InterfaceC691660RBc interfaceC691660RBc = (InterfaceC691660RBc) obj2;
                if ((interfaceC691660RBc instanceof InterfaceC712990Rxx) && (interfaceC712990Rxx = (InterfaceC712990Rxx) interfaceC691660RBc) != null && interfaceC712990Rxx.ur(obj)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJL();
            }
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLLFZ.getValue(this, LLLIIII[0]);
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        C728750SiH c728750SiH = C728750SiH.LIZ;
        C724270Sb3 c724270Sb33 = this.LLJI;
        Aweme aweme2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
        c728750SiH.getClass();
        String strLIZ = C712440Rx4.LIZ(aweme2);
        if (strLIZ != null && (bool = (Boolean) ((LinkedHashMap) C728750SiH.LJ.getValue()).get(strLIZ)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        assemViewModel.getClass();
        assemViewModel.setState(new AwS99S0110000_11(zBooleanValue, aweme, 7));
        StoryGuideCardAvatarViewModel storyGuideCardAvatarViewModelFp = Fp();
        storyGuideCardAvatarViewModelFp.getClass();
        storyGuideCardAvatarViewModelFp.setState(AFwS243S0000000_11.get$arr$(780));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        Ep();
        C786410Ut5.LJLLLLLL(0, getContentView());
        C197039127h c197039127hGp = Gp();
        if (c197039127hGp != null) {
            c197039127hGp.LJJJJL(AFwS236S0000000_6.get$arr$(354));
        }
        C197039127h c197039127hGp2 = Gp();
        if (c197039127hGp2 != null) {
            C786410Ut5.I7(new AbS693S0100000_11(this, 10, 42), c197039127hGp2);
        }
        C197039127h c197039127hGp3 = Gp();
        if (c197039127hGp3 != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131825038);
            } else {
                string = null;
            }
            c197039127hGp3.setText(string);
        }
        C786410Ut5.I7(new AbS693S0100000_11(this, 11, 42), getContentView());
        View view2 = (View) this.LLJLLIL.getValue();
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                int i = (int) (400 * getContentView().getContext().getResources().getDisplayMetrics().density);
                layoutParams.width = i;
                layoutParams.height = i;
                C786410Ut5.W5(view2, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (((Boolean) this.LLLFFI.getValue()).booleanValue()) {
            View view3 = (View) this.LLJZ.getValue();
            if (view3 != null) {
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)));
            }
            View view4 = (View) this.LLJZIJLIL.getValue();
            if (view4 != null) {
                view4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), view4.getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), view4.getPaddingBottom());
            }
            C197039127h c197039127hGp4 = Gp();
            if (c197039127hGp4 != null) {
                c197039127hGp4.setTuxFont(52);
            }
            C197039127h c197039127hGp5 = Gp();
            if (c197039127hGp5 != null) {
                c197039127hGp5.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            }
            C197039127h c197039127hGp6 = Gp();
            if (c197039127hGp6 != null) {
                ViewGroup.LayoutParams layoutParams2 = c197039127hGp6.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                    C786410Ut5.W5(c197039127hGp6, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        } else {
            View view5 = (View) this.LLJZ.getValue();
            if (view5 != null) {
                view5.setPadding(view5.getPaddingLeft(), view5.getPaddingTop(), view5.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
            }
            View view6 = (View) this.LLJZIJLIL.getValue();
            if (view6 != null) {
                view6.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)), view6.getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)), view6.getPaddingBottom());
            }
            C197039127h c197039127hGp7 = Gp();
            if (c197039127hGp7 != null) {
                c197039127hGp7.setTuxFont(43);
            }
            C197039127h c197039127hGp8 = Gp();
            if (c197039127hGp8 != null) {
                c197039127hGp8.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            }
            C197039127h c197039127hGp9 = Gp();
            if (c197039127hGp9 != null) {
                ViewGroup.LayoutParams layoutParams3 = c197039127hGp9.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    C786410Ut5.W5(c197039127hGp9, layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        C14LC.LJIJ.observe(this, new AObserverS210S0100000_6(this, 31));
        View view7 = (View) this.LLJLLIL.getValue();
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(0, view7);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public void J1(int i, Aweme aweme) {
        String aid;
        Object obj;
        String authorUid;
        Aweme awemeM199clone;
        UserStory userStory;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        Aweme aweme2;
        InterfaceC712990Rxx interfaceC712990Rxx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelected, position:");
        sbLIZ.append(i);
        sbLIZ.append(", subAid = ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", instance: ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            ArrayList<InterfaceC691660RBc> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                InterfaceC691660RBc interfaceC691660RBc = (InterfaceC691660RBc) obj2;
                if ((interfaceC691660RBc instanceof InterfaceC712990Rxx) && (interfaceC712990Rxx = (InterfaceC712990Rxx) interfaceC691660RBc) != null && interfaceC712990Rxx.ur(videoItemParams)) {
                    arrayList2.add(obj2);
                }
            }
            for (InterfaceC691660RBc interfaceC691660RBc2 : arrayList2) {
                if (videoItemParams != null) {
                    aweme2 = videoItemParams.getAweme();
                } else {
                    aweme2 = null;
                }
                interfaceC691660RBc2.J1(i, aweme2);
            }
        }
        if (aweme != null) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LLLFZ.getValue(this, LLLIIII[0]);
            assemViewModel.getClass();
            assemViewModel.setState(new AwS590S0100000_11(aweme, 549));
        }
        StoryGuideCardAvatarViewModel storyGuideCardAvatarViewModelFp = Fp();
        storyGuideCardAvatarViewModelFp.getClass();
        storyGuideCardAvatarViewModelFp.setState(AFwS243S0000000_11.get$arr$(781));
        C728750SiH c728750SiH = C728750SiH.LIZ;
        Integer numValueOf = Integer.valueOf(i);
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c728750SiH.getClass();
        Aweme awemeLIZLLL = C728750SiH.LIZLLL(numValueOf, authorUid);
        if (awemeLIZLLL == null) {
            C0SZ8 c0sz8 = (C0SZ8) this.LLLF.getValue();
            if (c0sz8 != null) {
                awemeLIZLLL = c0sz8.hm();
            } else {
                awemeLIZLLL = null;
            }
        }
        Aweme awemeLIZJ = C712440Rx4.LIZJ(awemeLIZLLL);
        StoryGuideCardShareViewModel storyGuideCardShareViewModel = (StoryGuideCardShareViewModel) this.LLLFF.getValue();
        if (storyGuideCardShareViewModel != null) {
            storyGuideCardShareViewModel.LLILZIL = awemeLIZJ;
            if (awemeLIZLLL != null) {
                awemeM199clone = awemeLIZLLL.m199clone();
                if (awemeM199clone != null && (userStory = awemeM199clone.getUserStory()) != null) {
                    userStory.setStoryGuideCard(false);
                }
            } else {
                awemeM199clone = null;
            }
            storyGuideCardShareViewModel.LLILZLL = awemeM199clone;
            storyGuideCardShareViewModel.LLJILJIL = null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
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
