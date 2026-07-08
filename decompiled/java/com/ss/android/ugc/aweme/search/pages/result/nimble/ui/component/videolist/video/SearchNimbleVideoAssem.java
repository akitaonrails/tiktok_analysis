package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.video;

import X.C01GW;
import X.C079X;
import X.C079Y;
import X.C0QBT;
import X.C452501pT;
import X.C656290Poh;
import X.C657400PqU;
import X.C786410Ut5;
import X.InterfaceC657870PrF;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleVideoAssem extends SearchNimbleDocBaseAssem {
    public final C01GW LLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 589));

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem
    public final InterfaceC657870PrF sp() {
        return new C657400PqU(new AwS589S0100000_10(this, 246));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem
    /* JADX INFO: renamed from: op */
    public final void tp(C656290Poh c656290Poh) {
        int duration;
        super.tp(c656290Poh);
        if (((Boolean) C079X.LIZ.getValue()).booleanValue() && c656290Poh.LLILLL) {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLL.getValue(), 8);
            Video video = c656290Poh.LL.getVideo();
            if (video != null && (duration = video.getDuration()) >= ((Number) C079Y.LIZ.getValue()).intValue()) {
                ((TextView) this.LLL.getValue()).setText(C0QBT.LIZ(C0QBT.LIZJ(duration), false));
                C786410Ut5.LLLLZLL((TuxTextView) this.LLL.getValue(), 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchNimbleDocBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C656290Poh c656290Poh) {
        tp(c656290Poh);
    }
}
