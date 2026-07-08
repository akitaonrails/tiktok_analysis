package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C06VS;
import X.C0O26;
import X.C0PEM;
import X.C0QSJ;
import X.C0RBZ;
import X.C0RDX;
import X.C0RN2;
import X.C0ROK;
import X.C0ROM;
import X.C0ZE7;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1697810uHb;
import X.C19MB;
import X.C2296808zG;
import X.C23250099c;
import X.C339190DRl;
import X.C452501pT;
import X.C489601vS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C690870R8b;
import X.C691730RBj;
import X.C694940RNs;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700950ReX;
import X.C700960ReY;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729510SjV;
import X.C897520ZIw;
import X.EnumC1910440zoY;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedActivityStatusAbility;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer;
import com.ss.android.ugc.aweme.story.feed.immersive.protocol.AdaptionProtocol;
import com.ss.android.ugc.aweme.story.feed.immersive.scope.StoryTitleBarScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveTopAreaComponent extends CompeteContainer implements CleanModeProtocol, AdaptionProtocol, IFeedActivityStatusAbility, CompeteAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C630740Ooa LLLF;
    public int LLLFF;

    public StoryImmersiveTopAreaComponent() {
        super(0);
        this.LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 756));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(178));
        this.LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(176));
        this.LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 753));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 755));
        this.LLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(177));
        this.LLLF = C628500Oky.LIZ(new AwS555S0100000_11(this, 754));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final String BB1() {
        return "top_area_tag";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "top_story_container";
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{StoryTitleBarScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryTitleBarScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryTitleBarScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -336590665) {
            return null;
        }
        return this;
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

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.protocol.AdaptionProtocol
    public final void LJJIJLIJ() {
        C1578630rBN.LJIIJJI(this, new C06VS(this, null));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IFeedActivityStatusAbility
    public final C0ZE7 Nz0() {
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.STORY_DETAIL_PAGE);
        C724270Sb3 c724270Sb3 = this.LLJI;
        c0ze7.LIZJ = AwemeExtKt.getAuthorUid(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        return c0ze7;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IFeedActivityStatusAbility
    public final C897520ZIw Xi0() {
        return (C897520ZIw) this.LLJLLL.getValue();
    }

    public final LinearLayout mp() {
        return (LinearLayout) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public final C0RN2 hp() {
        return (C0RN2) this.LLL.getValue();
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

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer, com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        super.Vo();
        C897520ZIw c897520ZIw = (C897520ZIw) this.LLJLLL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), AdaptionProtocol.class, this);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLF.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, CompeteAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), AdaptionProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1558520qew.LIZLLL(this);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLF.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, CompeteAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
        C897520ZIw c897520ZIw = (C897520ZIw) this.LLJLLL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteAbility
    public final void FB(VideoItemParams videoItemParams) {
        C700950ReX c700950ReXLIZIZ;
        if (!C729510SjV.LJJIIZ(videoItemParams.getAweme())) {
            this.LLJLILLLLZIIL = videoItemParams.getAweme();
            C0RN2 c0rn2Hp = hp();
            C700170RdH c700170RdHJ9 = J9();
            if (c700170RdHJ9 != null) {
                c700950ReXLIZIZ = C700960ReY.LIZIZ(c700170RdHJ9);
            } else {
                c700950ReXLIZIZ = null;
            }
            C0ROK.LIZLLL(c0rn2Hp, c700950ReXLIZIZ, (C694940RNs) this.LLJJL.getValue(), videoItemParams, jm());
            lm();
            ol();
            zf();
            gg(new C700260RdQ(null, null, true, null, 11));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C700950ReX ep(X.C700950ReX r17) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.StoryImmersiveTopAreaComponent.ep(X.0ReX):X.0ReX");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer
    public final void ip(C694940RNs c694940RNs) {
        c694940RNs.LIZJ.put("top_story_left_container", (ViewGroup) LJJIJL().findViewById(R.id.mjp));
        c694940RNs.LIZJ.put("top_story_center_row_one_container", (ViewGroup) LJJIJL().findViewById(R.id.ib9));
        c694940RNs.LIZJ.put("top_story_center_row_two_container", (ViewGroup) LJJIJL().findViewById(R.id.tt4));
        c694940RNs.LIZJ.put("top_story_center_row_three_container", (ViewGroup) LJJIJL().findViewById(R.id.tt5));
        c694940RNs.LIZJ.put("top_story_right_first_container", (ViewGroup) LJJIJL().findViewById(R.id.tl4));
        c694940RNs.LIZJ.put("top_story_right_first_half_container", (ViewGroup) LJJIJL().findViewById(R.id.tl5));
        c694940RNs.LIZJ.put("top_story_right_center_container", (ViewGroup) LJJIJL().findViewById(R.id.tkq));
        Integer num = c694940RNs.LIZIZ.get("top_story_center_row_two_priority_zero_container_relation_label");
        if (num != null) {
            c694940RNs.LIZIZ.put("top_story_center_row_two_priority_zero_container", Integer.valueOf(num.intValue()));
        }
        Integer num2 = c694940RNs.LIZIZ.get("top_story_center_row_two_priority_one_container_story_highlights");
        if (num2 != null) {
            c694940RNs.LIZIZ.put("top_story_center_row_two_priority_one_container", Integer.valueOf(num2.intValue()));
        }
        Integer num3 = c694940RNs.LIZIZ.get("top_story_center_row_two_priority_two_container_abroll");
        if (num3 != null) {
            c694940RNs.LIZIZ.put("top_story_center_row_two_priority_two_container", Integer.valueOf(num3.intValue()));
        }
        Integer num4 = c694940RNs.LIZIZ.get("top_story_center_row_two_priority_three_container_live_photo");
        if (num4 != null) {
            c694940RNs.LIZIZ.put("top_story_center_row_two_priority_three_container", Integer.valueOf(num4.intValue()));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer
    /* JADX INFO: renamed from: kp */
    public final void up(VideoItemParams videoItemParams) {
        super.up(videoItemParams);
        C691730RBj.LIZ(this, (C0RBZ) this.LLJLLIL.getValue(), videoItemParams);
        String authorUid = AwemeExtKt.getAuthorUid(videoItemParams.getAweme());
        C897520ZIw c897520ZIw = (C897520ZIw) this.LLJLLL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LJIIIIZZ(C0O26.LIZ(AFwS243S0000000_11.get$arr$(404), authorUid));
        }
        C897520ZIw c897520ZIw2 = (C897520ZIw) this.LLJLLL.getValue();
        if (c897520ZIw2 != null) {
            c897520ZIw2.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer
    public final void lp(C700950ReX c700950ReX) {
        int i;
        if (c700950ReX != null && c700950ReX.LIZIZ != null) {
            if (c700950ReX.LIZIZ.isEmpty()) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C489601vS(i, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 226));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer, X.InterfaceC702410Rgt
    public final void vg(C700950ReX c700950ReX) {
        ConstraintLayout constraintLayout;
        super.vg(c700950ReX);
        ViewParent parent = mp().getParent();
        if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI("top_story_center_row_one_container", "top_story_center_row_two_container", "top_story_center_row_three_container");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJIIJJI) {
                C0ROM<VideoItemParams, C690870R8b> c0romLIZIZ = C0ROK.LIZIZ(hp(), (String) obj);
                if (c0romLIZIZ != null && c0romLIZIZ.LIZIZ) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = this.LLLFF;
            if (i != size) {
                if (i > 1 && size > 1) {
                    this.LLLFF = size;
                    return;
                }
                this.LLLFF = size;
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                if (size > 1) {
                    c19mb.LJI(mp().getId(), 3);
                    c19mb.LJI(mp().getId(), 4);
                    c19mb.LJIIIIZZ(mp().getId(), 3, ((View) this.LLJZ.getValue()).getId(), 3);
                    c19mb.LIZIZ(constraintLayout);
                    return;
                }
                if (size == 1) {
                    c19mb.LJI(mp().getId(), 3);
                    c19mb.LJI(mp().getId(), 4);
                    c19mb.LJIIIIZZ(mp().getId(), 3, ((View) this.LLJZ.getValue()).getId(), 3);
                    c19mb.LJIIIIZZ(mp().getId(), 4, ((View) this.LLJZ.getValue()).getId(), 4);
                    c19mb.LIZIZ(constraintLayout);
                }
            }
        }
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
