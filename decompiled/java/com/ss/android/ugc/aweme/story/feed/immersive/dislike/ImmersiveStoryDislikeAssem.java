package com.ss.android.ugc.aweme.story.feed.immersive.dislike;

import X.C01GW;
import X.C0HHT;
import X.C1076010e6h;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS115S0200000_11;
import Y.AObserverS208S0100000_4;
import android.os.Handler;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.follow.StoryImmersiveBottomBarVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes12.dex */
public final class ImmersiveStoryDislikeAssem extends BaseCellSlotComponent<ImmersiveStoryDislikeAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 799));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 802));
    public final InterfaceC1731706qJ LLJZ;
    public final C01GW LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ImmersiveStoryDislikeAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/immersive/follow/StoryImmersiveBottomBarVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ImmersiveStoryDislikeAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryImmersiveBottomBarVM.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 801), null, AFwS243S0000000_11.get$arr$(440));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(181));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fef;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 800);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_video_dislike", true, awS555S0100000_11);
    }

    public final C197039127h Ep() {
        return (C197039127h) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        ((Handler) this.LLJZIJLIL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().removeObservers(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Ep().LJJJJL(new AwS583S0100000_4(this, 236));
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS208S0100000_4(this, 7));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(this, LLL[0]), new C2217381BqS() { // from class: X.0Nfy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NQV) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(241), 4);
        C786410Ut5.U8(Ep(), new ACListenerS115S0200000_11(this, videoItemParams, 23));
    }
}
