package com.ss.android.ugc.aweme.feed.adapter;

import X.C0R80;
import X.C0R81;
import X.C0R82;
import X.C0R83;
import X.C0R84;
import X.C0R85;
import X.C0R86;
import X.C0RFV;
import X.C1483410ohn;
import X.C690690R7j;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS62S1000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoPlayViewModel extends FeedBaseHolderViewModel<C0RFV> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final boolean LLILZ = true;
    public C0R86 LLILZIL;

    public final void LJJLIIJ() {
        C0R86 c0r86 = this.LLILZIL;
        if (c0r86 != null) {
            c0r86.LJII();
        } else {
            C1483410ohn.LJLJJI().LJIILLIIL();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0RFV(0);
    }

    public final void pauseVideo() {
        C0R86 c0r86 = this.LLILZIL;
        if (c0r86 != null) {
            c0r86.LLLLLLLLLL();
        } else {
            C1483410ohn.LJLJJI().LIZ();
        }
    }

    public final void wQ2() {
        setState(AFwS243S0000000_11.get$arr$(46));
    }

    public final void zQ2() {
        setState(new C0R85());
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LLILZ;
    }

    public final void LJJIJIIJI(String str) {
        setState(new C0R82(str));
    }

    public final void onPausePlay(String str) {
        setState(new C0R80(str));
    }

    public final void onPlayCompleted(String str) {
        setState(new AwS62S1000000_11(str, 0));
    }

    public final void onPreparePlay(String str) {
        setStateImmediate(new C0R81(str));
    }

    public final void onResumePlay(String str) {
        setState(new C0R83(str));
    }

    public final void xQ2(int i) {
        setState(new C690690R7j(i));
    }

    public final void yQ2(boolean z) {
        if (z || C1483410ohn.LJLJJI().isPlaying()) {
            setState(new C0R84());
        }
    }
}
