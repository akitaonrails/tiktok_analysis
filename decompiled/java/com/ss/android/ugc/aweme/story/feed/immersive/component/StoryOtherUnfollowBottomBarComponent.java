package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C0HHT;
import X.C0SVD;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C694400RLq;
import X.C706480RnS;
import X.C723830SaL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.follow.StoryImmersiveBottomBarVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryOtherUnfollowBottomBarComponent extends BaseCellSlotComponent<StoryOtherUnfollowBottomBarComponent> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryOtherUnfollowBottomBarComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/immersive/follow/StoryImmersiveBottomBarVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryOtherUnfollowBottomBarComponent() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryImmersiveBottomBarVM.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 715), null, AFwS243S0000000_11.get$arr$(386));
        this.LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 711));
        this.LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 712));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 716));
        this.LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 713));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdb;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 714);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_unfollow_other_bottom_bar", true, awS555S0100000_11);
    }

    public final View Ep() {
        return (View) this.LLJZ.getValue();
    }

    public final boolean Fp() {
        return ((Boolean) this.LLL.getValue()).booleanValue();
    }

    public final void Gp() {
        if (Fp()) {
            C339190DRl.LIZLLL(Ep());
            return;
        }
        C339190DRl.LIZLLL((View) this.LLJLLL.getValue());
        C339190DRl.LIZLLL(Ep());
        C339190DRl.LIZIZ((View) this.LLJZIJLIL.getValue());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C339190DRl.LIZIZ(getContentView());
    }

    public final void Ip(boolean z) {
        if (Fp()) {
            return;
        }
        C339190DRl.LIZIZ((View) this.LLJLLL.getValue());
        C339190DRl.LIZIZ(Ep());
        if (z) {
            View view = (View) this.LLJZIJLIL.getValue();
            if (view != null) {
                float f = 20;
                C786410Ut5.ed(view, view.getTranslationY() + f);
                C339190DRl.LIZLLL(view);
                view.animate().translationY(view.getTranslationY() - f).setDuration(150L).start();
                return;
            }
            return;
        }
        C339190DRl.LIZLLL((View) this.LLJZIJLIL.getValue());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        super.onViewCreated(view);
        if (Fp()) {
            C337180DJs.LIZIZ((View) this.LLJLLL.getValue());
            C337180DJs.LIZIZ((View) this.LLJZIJLIL.getValue());
            View viewEp = Ep();
            if (viewEp != null) {
                layoutParams = viewEp.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210));
                layoutParams2.weight = 0.0f;
                layoutParams2.gravity = 1;
                View viewEp2 = Ep();
                if (viewEp2 != null) {
                    C786410Ut5.W5(viewEp2, layoutParams2);
                }
            }
        }
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 206));
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJLLIL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLF;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0Nfx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NQV) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(2), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0RLs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NQV) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(122), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (C0SVD.LL.LIZ(AwemeExtKt.getAuthorUid(videoItemParams2.getAweme()))) {
            Ip(false);
        } else {
            Gp();
        }
        if (C694400RLq.LIZIZ(videoItemParams2, jm())) {
            C339190DRl.LIZLLL(getContentView());
        } else {
            C786410Ut5.LJLLLLLL(4, getContentView());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }
}
