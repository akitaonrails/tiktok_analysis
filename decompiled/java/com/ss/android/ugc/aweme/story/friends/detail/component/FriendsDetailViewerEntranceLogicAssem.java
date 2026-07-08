package com.ss.android.ugc.aweme.story.friends.detail.component;

import X.C01D1;
import X.C09R3;
import X.C0SED;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C330500CxU;
import X.C330530CxX;
import X.C331380Cyu;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729980SkG;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel;
import com.ss.android.ugc.aweme.story.friends.FriendsDetailViewerEntranceLogicAbility;
import com.ss.android.ugc.aweme.story.friends.detail.ability.FriendsDetailViewerEntranceUIAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailViewerEntranceLogicAssem extends BaseCellLogicComponent<FriendsDetailViewerEntranceLogicAssem> implements FriendsDetailViewerEntranceLogicAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C630740Ooa LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsDetailViewerEntranceLogicAssem.class, "viewerEntranceVM", "getViewerEntranceVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/vm/StoryViewerEntranceViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsDetailViewerEntranceLogicAssem.class, "viewerListVM", "getViewerListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsDetailViewerEntranceLogicAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerEntranceViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 906), null, AFwS243S0000000_11.get$arr$(475));
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(StoryViewerListViewModel.class);
        this.LLJJIJIIJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 907), null, AFwS243S0000000_11.get$arr$(476));
        this.LLJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 908));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330500CxU.LIZ();
        C736680Sv4.LJIIIIZZ(this, Bo(), new C2217381BqS() { // from class: X.0SEH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C331380Cyu) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(138), 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 896010916) {
            return null;
        }
        return this;
    }

    public final StoryViewerEntranceViewModel Bo() {
        return (StoryViewerEntranceViewModel) this.LLJJIJI.getValue(this, LLJJJIL[0]);
    }

    public final StoryViewerListViewModel Co() {
        return (StoryViewerListViewModel) this.LLJJIJIIJIL.getValue(this, LLJJJIL[1]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid() != null) {
            StoryViewerEntranceViewModel storyViewerEntranceViewModelBo = Bo();
            C724270Sb3 c724270Sb32 = this.LLJI;
            storyViewerEntranceViewModelBo.zQ2(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01c9 A[PHI: r16
      0x01c9: PHI (r16v6 java.lang.String) = (r16v0 java.lang.String), (r16v7 java.lang.String) binds: [B:21:0x007b, B:19:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5 A[PHI: r16 r18 r19
      0x01d5: PHI (r16v5 java.lang.String) = (r16v1 java.lang.String), (r16v6 java.lang.String) binds: [B:24:0x0081, B:76:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r18v6 java.lang.String) = (r18v1 java.lang.String), (r18v7 java.lang.String) binds: [B:24:0x0081, B:76:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r19v5 java.lang.String) = (r19v0 java.lang.String), (r19v6 java.lang.String) binds: [B:24:0x0081, B:76:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.story.friends.FriendsDetailViewerEntranceLogicAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n10(java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.detail.component.FriendsDetailViewerEntranceLogicAssem.n10(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (!Intrinsics.LJFF(videoItemParams2.getAweme().getAid(), this.LLJJIJIL)) {
            String aid = videoItemParams2.getAweme().getAid();
            if (aid != null) {
                StoryViewerEntranceViewModel storyViewerEntranceViewModelBo = Bo();
                Aweme aweme = videoItemParams2.getAweme();
                storyViewerEntranceViewModelBo.getClass();
                C0SED c0sedWQ2 = StoryViewerEntranceViewModel.wQ2(aweme);
                if (c0sedWQ2.LIZ != null) {
                    FriendsDetailViewerEntranceUIAbility friendsDetailViewerEntranceUIAbility = (FriendsDetailViewerEntranceUIAbility) this.LLJJJ.getValue();
                    if (friendsDetailViewerEntranceUIAbility != null) {
                        friendsDetailViewerEntranceUIAbility.Rj2(c0sedWQ2);
                    }
                } else {
                    FriendsDetailViewerEntranceUIAbility friendsDetailViewerEntranceUIAbility2 = (FriendsDetailViewerEntranceUIAbility) this.LLJJJ.getValue();
                    if (friendsDetailViewerEntranceUIAbility2 != null) {
                        friendsDetailViewerEntranceUIAbility2.Rj2(new C0SED(aid, null, 0L, null, videoItemParams2.getAweme(), 14));
                    }
                }
            }
            this.LLJJIJIL = videoItemParams2.getAweme().getAid();
            StoryViewerEntranceViewModel storyViewerEntranceViewModelBo2 = Bo();
            C331380Cyu c331380Cyu = (C331380Cyu) Bo().getState();
            storyViewerEntranceViewModelBo2.getClass();
            StoryViewerEntranceViewModel.yQ2(c331380Cyu, videoItemParams2);
            Bo().vQ2((C331380Cyu) Bo().getState(), videoItemParams2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent
    /* JADX INFO: renamed from: zo */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C729980SkG.LJIIIIZZ(videoItemParams.getAweme());
    }
}
