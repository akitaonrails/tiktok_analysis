package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.AbstractC1250290idn;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0OM1;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724750Sbp;
import X.C727350Sg1;
import X.C728910SiX;
import X.C729140Siu;
import X.C729220Sj2;
import X.C729510SjV;
import X.C730050SkN;
import X.C730090SkR;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGalleryNavBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C630740Ooa LLJI;
    public TuxNavBar LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryGalleryNavBarAssem.class, "galleryListVM", "getGalleryListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryGalleryListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StoryGalleryNavBarAssem.class, "viewListVM", "getViewListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public StoryGalleryNavBarAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryGalleryListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 839), AFwS243S0000000_11.get$arr$(452), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(StoryViewerListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 840), AFwS243S0000000_11.get$arr$(453), null, true);
        this.LLJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 841));
        this.LLJILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 838));
        this.LLJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 837));
    }

    public final StoryViewerListViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (StoryViewerListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Aweme Go() {
        C728910SiX c728910SiX = ((C730090SkR) Ho().getState()).LLILLJJLI;
        if (c728910SiX != null) {
            return c728910SiX.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C729220Sj2.LL.LJIIL("StoryGalleryNavBarAssem");
    }

    public final void Jo(boolean z) {
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(new AwS26S0010000_11(z, 1), "start_action");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0OM1 Lo(View view) {
        String authorUid;
        boolean z;
        Object objInvoke;
        C727350Sg1 c727350Sg1Ah1;
        Aweme awemeGv2;
        StoryViewerListHostAbility storyViewerListHostAbility = (StoryViewerListHostAbility) this.LLJI.getValue();
        String str = null;
        if (storyViewerListHostAbility != null && (awemeGv2 = storyViewerListHostAbility.gv2()) != null) {
            authorUid = AwemeExtKt.getAuthorUid(awemeGv2);
        } else {
            authorUid = null;
        }
        boolean zLJIILJJIL = C729510SjV.LJIILJJIL(authorUid);
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 242);
        AwS590S0100000_11 awS590S0100000_112 = new AwS590S0100000_11(this, 243);
        AwS590S0100000_11 awS590S0100000_113 = new AwS590S0100000_11(this, 241);
        C730050SkN c730050SkN = ((C730090SkR) Ho().getState()).LLJJ;
        if (c730050SkN != null) {
            z = c730050SkN.LIZ;
        } else {
            z = false;
        }
        C0OM1 c0om1 = new C0OM1();
        if (zLJIILJJIL) {
            StoryViewerListHostAbility storyViewerListHostAbility2 = (StoryViewerListHostAbility) this.LLJI.getValue();
            if (storyViewerListHostAbility2 != null && (c727350Sg1Ah1 = storyViewerListHostAbility2.ah1()) != null) {
                str = c727350Sg1Ah1.feedFrom;
            }
            if (!Intrinsics.LJFF(str, "STORY_ENTRANCE_HIGHLIGHTS")) {
                AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
                if (z) {
                    objInvoke = awS590S0100000_113.invoke(view);
                } else {
                    objInvoke = awS590S0100000_11.invoke(view);
                }
                abstractC1250290idnArr[0] = objInvoke;
                c0om1.LJ(abstractC1250290idnArr);
            } else if (z) {
                c0om1.LJ(awS590S0100000_113.invoke(view));
            }
        }
        c0om1.LIZIZ(awS590S0100000_112.invoke(view));
        return c0om1;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJIJIL = (TuxNavBar) view.findViewById(R.id.ybp);
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(Lo(view));
        }
        TuxNavBar tuxNavBar2 = this.LLJIJIL;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavBackground(0);
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Sis
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 64), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Sit
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLJJ;
            }
        }, null, new AwS447S0200000_11(this, view, 6), 6);
        C729220Sj2.LL.LJII("StoryGalleryNavBarAssem", (C729140Siu) this.LLJILLL.getValue());
    }
}
