package com.ss.android.ugc.aweme.feed.assem.music;

import X.C0C64;
import X.C0P1Y;
import X.C0R5C;
import X.C0VTN;
import X.C19252910Tv;
import X.C300350Bpx;
import X.C638120P1e;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoMusicTitleVM extends FeedBaseViewModel<C0P1Y> {
    public boolean LL;
    public volatile DspPlatform LLILLJJLI = DspPlatform.UNKNOWN;
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0P1Y(0);
    }

    public final String vQ2() {
        return (this.LLILLJJLI == DspPlatform.UNKNOWN || this.LLILLJJLI == DspPlatform.TIKTOK_MY_MUSIC) ? "null" : this.LLILLJJLI.getEventName();
    }

    public final boolean wQ2() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "anim_opt", true, false) || C19252910Tv.LIZIZ.LIZLLL().LIZ().LJI();
    }

    public final void xQ2() {
        if (C300350Bpx.LIZIZ() || !this.LL || wQ2()) {
            return;
        }
        if (C638120P1e.LIZ.needFixMarqueeAnim) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 46));
        } else {
            this.LL = false;
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 45));
        }
    }

    public final void yQ2() {
        if (C300350Bpx.LIZIZ() || this.LL || wQ2() || C0VTN.LIZJ().LIZLLL() || C0R5C.LIZJ) {
            return;
        }
        if (C638120P1e.LIZ.needFixMarqueeAnim) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 48));
        } else {
            this.LL = true;
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(this, 47));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o paramSync2StateAccept(X.InterfaceC0148002o r10, com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            r9 = this;
            r1 = r10
            X.0P1Y r1 = (X.C0P1Y) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.getAweme()
            com.ss.android.ugc.aweme.music.model.Music r2 = X.C631280OpS.LIZ(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.getAweme()
            if (r0 == 0) goto L2e
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isScheduleVideo(r0)
            r3 = 1
            if (r0 != r3) goto L2e
        L18:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.getAweme()
            if (r0 == 0) goto L2c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r0.getAwemeRawAd()
        L22:
            r5 = 0
            r8 = 56
            r6 = r5
            r7 = r5
            X.0P1Y r0 = X.C0P1Y.LIZ(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L2c:
            r4 = 0
            goto L22
        L2e:
            r3 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM.paramSync2StateAccept(X.002o, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.002o");
    }
}
