package com.ss.android.ugc.aweme.feed.feedwidget;

import X.AbstractC21516619Im;
import X.C0RD4;
import X.C21516719In;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes34.dex */
public class FeedLiveWindowWidget extends AbsFeedWidget {
    public C21516719In LLJ;
    public View LLJI;

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget, com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* JADX INFO: renamed from: LJIILL */
    public final void onChanged(C0RD4 c0rd4) {
        super.onChanged(c0rd4);
        if (c0rd4 != null) {
            Object obj = c0rd4.LIZIZ;
            Object obj2 = null;
            if (obj != null && (obj instanceof VideoItemParams) && "awesome_update_data".equals(c0rd4.LIZ)) {
                Object obj3 = c0rd4.LIZIZ;
                if (obj3 != null) {
                    obj2 = obj3;
                }
                VideoItemParams videoItemParams = (VideoItemParams) obj2;
                AbstractC21516619Im abstractC21516619Im = this.LLIZLLLIL;
                if (abstractC21516619Im != null && videoItemParams != null) {
                    abstractC21516619Im.LL = videoItemParams.getAweme();
                    abstractC21516619Im.LLILLJJLI = videoItemParams.mEventType;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public final C21516719In LJIILLIIL(View view) {
        C21516719In c21516719In = new C21516719In(view);
        this.LLJ = c21516719In;
        this.LLJI = c21516719In.LLILZIL;
        return c21516719In;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget, com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C0RD4 c0rd4) {
        onChanged(c0rd4);
    }
}
