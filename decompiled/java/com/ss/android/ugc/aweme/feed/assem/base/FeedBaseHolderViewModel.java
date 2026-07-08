package com.ss.android.ugc.aweme.feed.assem.base;

import X.C300900Bqq;
import X.C729510SjV;
import X.C733860SqW;
import X.InterfaceC0148002o;
import X.InterfaceC738070SxJ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedBaseHolderViewModel<S extends InterfaceC0148002o> extends AssemViewModel<S> implements InterfaceC738070SxJ<S, VideoItemParams> {
    public Aweme LLILLJJLI;
    public boolean LL = true;
    public final boolean LLILLL = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public boolean isHolderVM() {
        return this.LLILLL;
    }

    public final void vQ2(VideoItemParams videoItemParams) {
        if (!C300900Bqq.LIZ() || C729510SjV.LJJ(videoItemParams.getAweme())) {
            return;
        }
        if (this.LL) {
            this.LL = false;
        } else {
            setState(new C733860SqW(this, videoItemParams));
        }
    }

    @Override // X.InterfaceC738070SxJ
    public final VideoItemParams state2ItemAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        return videoItemParams;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams, List list) {
        this.LLILLJJLI = videoItemParams.getAweme();
        return interfaceC0148002o;
    }
}
