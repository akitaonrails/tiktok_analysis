package com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.longpressanim;

import X.C01GW;
import X.C0RSN;
import X.C0RSO;
import X.C0RSP;
import X.C0RSQ;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class LongPressEmojiAnimAssem extends FeedBaseAssem<LongPressEmojiAnimAssem> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C0RSO());
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0RSP());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C0RSN(this));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_d;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0RDq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJJ;
            }
        }, null, new C0RSQ(view), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
