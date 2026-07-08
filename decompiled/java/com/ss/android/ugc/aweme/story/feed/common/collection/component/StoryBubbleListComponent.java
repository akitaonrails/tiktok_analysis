package com.ss.android.ugc.aweme.story.feed.common.collection.component;

import X.C0RF0;
import X.C0SEL;
import X.C0SEP;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729980SkG;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.ability.IStoryBubbleListAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryBubbleListComponent extends BaseCellContentComponent<StoryBubbleListComponent> {
    public static final C0SEL LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public ViewGroup LLJJJJLIIL;
    public C0SEP LLJJL;
    public C0SEP LLJJLIIIJLLLLLLLZ;
    public C0RF0 LLJL;
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 569));
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public String LLJLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0SEL] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryBubbleListComponent.class, "viewerEntranceVM", "getViewerEntranceVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/vm/StoryViewerEntranceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLIL = new Object() { // from class: X.0SEL
        };
    }

    public StoryBubbleListComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerEntranceViewModel.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 568), null, AFwS243S0000000_11.get$arr$(317));
        this.LLJLL = "";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C0SEP c0sep = this.LLJJL;
        if (c0sep != null) {
            c0sep.LJJIII();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        this.LLJLL = "";
        C0SEP c0sep = this.LLJJL;
        if (c0sep != null) {
            c0sep.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C0SEP c0sep = this.LLJJLIIIJLLLLLLLZ;
        if (c0sep != null) {
            c0sep.onDestroy();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        C0SEP c0sep = this.LLJJL;
        if (c0sep != null) {
            c0sep.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        C0SEP c0sep = this.LLJJL;
        if (c0sep != null) {
            c0sep.onPause();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        C0SEP c0sep = this.LLJJL;
        if (c0sep != null) {
            c0sep.onResume();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroupCW1;
        IStoryBubbleListAbility iStoryBubbleListAbility = (IStoryBubbleListAbility) this.LLJLIL.getValue();
        if (iStoryBubbleListAbility != null) {
            viewGroupCW1 = iStoryBubbleListAbility.CW1();
        } else {
            viewGroupCW1 = null;
        }
        this.LLJJJJLIIL = viewGroupCW1;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(this, LLJLLL[0]), new C2217381BqS() { // from class: X.0SEG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C331380Cyu) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(106), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void p(int i) {
        C0SEP c0sep = this.LLJJL;
        if (c0sep != null) {
            c0sep.onResume();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryBubbleListComponent.tp(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        C0SEP c0sep;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C729980SkG.LJIIIIZZ(((VideoItemParams) obj).getAweme())) {
            C0SEP c0sep2 = this.LLJJL;
            if ((c0sep2 != null && c0sep2.LJIIJJI()) || (c0sep = this.LLJJL) == null) {
                return;
            }
            c0sep.LIZIZ();
        }
    }
}
