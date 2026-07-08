package com.ss.android.ugc.aweme.feed.assem.progressbar;

import X.C1440005kM;
import X.C16EB;
import X.C16ED;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoProgressBarViewModel extends FeedBaseViewModel<C16EB> {
    public long LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C16EB(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        C16EB c16eb = (C16EB) interfaceC0148002o;
        if (!isRebind()) {
            return new C16EB(0);
        }
        super.paramSync2StateAccept(c16eb, videoItemParams);
        return c16eb;
    }

    public final void vQ2(int i, boolean z) {
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        C16ED c16ed = new C16ED(aweme, this.eventType);
        c16ed.LIZJ = z;
        C1440005kM.LIZ(c16ed);
    }
}
