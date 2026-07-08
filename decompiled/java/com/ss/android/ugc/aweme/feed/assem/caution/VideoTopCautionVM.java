package com.ss.android.ugc.aweme.feed.assem.caution;

import X.C710540Ru0;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoTopCautionVM extends FeedBaseViewModel<C710540Ru0> {
    public boolean LL;
    public boolean LLILLJJLI = true;
    public String LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C710540Ru0(0);
    }

    public VideoTopCautionVM() {
        Aweme aweme;
        VideoItemParams item = getItem();
        this.LLILLL = (item == null || (aweme = item.getAweme()) == null) ? null : aweme.getAid();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        return new C710540Ru0(0);
    }
}
