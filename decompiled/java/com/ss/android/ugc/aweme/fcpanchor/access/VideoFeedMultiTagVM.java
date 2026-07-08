package com.ss.android.ugc.aweme.fcpanchor.access;

import X.C291001Au;
import X.C704520RkI;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoFeedMultiTagVM extends FeedBaseViewModel<C704520RkI> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C704520RkI(null, 7);
    }

    public final Aweme getAweme() {
        VideoItemParams item = getItem();
        if (item != null) {
            return item.getAweme();
        }
        return null;
    }

    public final JSONObject vQ2() {
        VideoItemParams item = getItem();
        if (item != null) {
            return item.mRequestId;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        String aid;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return new C704520RkI(new C291001Au(aid), 6);
    }
}
