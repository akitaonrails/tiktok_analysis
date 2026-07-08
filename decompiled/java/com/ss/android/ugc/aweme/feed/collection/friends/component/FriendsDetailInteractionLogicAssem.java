package com.ss.android.ugc.aweme.feed.collection.friends.component;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailDiggLogicAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailInteractionLogicAssem extends BaseCellLogicComponent<FriendsDetailInteractionLogicAssem> implements FriendsDetailDiggLogicAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(110));
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final C01GW LLJJJ;
    public final C630740Ooa LLJJJIL;
    public final C630740Ooa LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsDetailInteractionLogicAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsDetailInteractionLogicAssem.class, "commentVM", "getCommentVM()Lcom/ss/android/ugc/aweme/feed/assem/videocomment/VideoCommentVM;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsDetailInteractionLogicAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoDiggVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 310), null, AFwS243S0000000_11.get$arr$(108));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoCommentVM.class);
        this.LLJJIJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), null, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 311), null, AFwS243S0000000_11.get$arr$(109));
        this.LLJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(111));
        this.LLJJJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 309));
        this.LLJJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 308));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0STv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(246), 6);
        C736680Sv4.LJIIIIZZ(this, Co(), new C2217381BqS() { // from class: X.0Sns
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730490Sl5) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(247), 6);
        C736680Sv4.LJIIIIZZ(this, Bo(), new C2217381BqS() { // from class: X.0SpX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C733080SpG) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(248), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0Qzq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(249), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0SpO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(242), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0SlV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLIZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(243), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0Nu7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(244), 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1781982678) {
            return null;
        }
        return this;
    }

    public final VideoCommentVM Bo() {
        return (VideoCommentVM) this.LLJJIJIL.getValue(this, LLJJJJJIL[1]);
    }

    public final VideoDiggVM Co() {
        return (VideoDiggVM) this.LLJJIJIIJIL.getValue(this, LLJJJJJIL[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailDiggLogicAbility
    public final void fH2() {
        VideoDiggVM videoDiggVMCo = Co();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (videoDiggVMCo.LQ2(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid())) {
            return;
        }
        Co().RQ2(new AwS625S0100000_11(this, 24));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final void wr() {
        Co().QQ2(null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent
    /* JADX INFO: renamed from: Ao */
    public final void vr(VideoItemParams videoItemParams) {
        Co().QQ2(getContext());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
        vr((VideoItemParams) obj);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }
}
