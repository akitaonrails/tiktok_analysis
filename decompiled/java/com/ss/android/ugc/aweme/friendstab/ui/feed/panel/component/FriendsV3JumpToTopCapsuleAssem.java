package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C01GW;
import X.C0W17;
import X.C13LE;
import X.C1637806bA;
import X.C19659111vp;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS88S0100000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FriendsV3JumpToTopCapsuleAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public volatile Boolean LLJJIII;
    public AnimatorSet LLJJIJI;
    public AnimatorSet LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3JumpToTopCapsuleAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3JumpToTopCapsuleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 218), AFwS257S0000000_19.get$arr$(164), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1473));
        this.LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1471));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1472));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cc3;
    }

    public final FriendsV3FeedListViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnimatorSet animatorSet = this.LLJJIJI;
        if (animatorSet != null) {
            if (animatorSet.isRunning()) {
                C0W17.LIZJ("capsule", "Cancelling show animator");
                animatorSet.cancel();
            }
            this.LLJJIJI = null;
        }
        AnimatorSet animatorSet2 = this.LLJJIJIIJIL;
        if (animatorSet2 != null) {
            if (animatorSet2.isRunning()) {
                C0W17.LIZJ("capsule", "Cancelling hide animator");
                animatorSet2.cancel();
            }
            this.LLJJIJIIJIL = null;
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null) {
            HandlerHook.viewRemoveCallbacks(viewLJJIJL, (Runnable) this.LLJJJIL.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LJ = Integer.valueOf(R.attr.oy);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(200);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(24);
        view.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(view.getContext())));
        C786410Ut5.I7(new AkS88S0100000_19(this, 0), view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0hwX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223430hwT) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 43), 4);
    }
}
