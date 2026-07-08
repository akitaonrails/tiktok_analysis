package com.ss.android.ugc.aweme.feed.assem.music;

import X.C0C64;
import X.C19252910Tv;
import X.C631280OpS;
import X.C638300P1w;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoMusicCoverVM extends FeedBaseViewModel<C638300P1w> {
    public boolean LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C638300P1w(0);
    }

    public final boolean vQ2() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "anim_opt", true, false) || C19252910Tv.LIZIZ.LIZLLL().LIZ().LJI();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        boolean z;
        C638300P1w c638300P1w = (C638300P1w) interfaceC0148002o;
        Music musicLIZ = C631280OpS.LIZ(videoItemParams.getAweme());
        Aweme aweme = videoItemParams.getAweme();
        boolean z2 = true;
        if (aweme != null && AwemeExtKt.isScheduleVideo(aweme)) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 == null || !AwemeExtKt.isAdTraffic(aweme2)) {
            z2 = false;
        }
        return C638300P1w.LIZ(c638300P1w, musicLIZ, z2, z, false, false, false, 120);
    }
}
