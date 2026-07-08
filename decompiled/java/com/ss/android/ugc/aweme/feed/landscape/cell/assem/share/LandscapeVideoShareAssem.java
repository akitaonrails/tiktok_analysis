package com.ss.android.ugc.aweme.feed.landscape.cell.assem.share;

import X.C1308910kAL;
import X.C1322090kVb;
import X.C1322110kVd;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C692450REd;
import X.C814420VxA;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeVideoShareAssem extends VideoShareAssem {
    @Override // com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem
    public final void Bp() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d10;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem
    public final void Vp() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem
    public final void Wp() {
        boolean z = C692450REd.LIZ;
        if (!(!C692450REd.LIZ)) {
            ((C1322110kVd) getContentView().findViewById(R.id.uzq)).setImageResource(R.drawable.cfp);
            return;
        }
        C1322090kVb c1322090kVb = (C1322090kVb) getContentView().findViewById(R.id.uzq);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_ellipsis_vertical;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ee, getContentView().getContext());
        c1322090kVb.setImageDrawable(c419910GdJ.LIZ(getContentView().getContext()));
    }
}
