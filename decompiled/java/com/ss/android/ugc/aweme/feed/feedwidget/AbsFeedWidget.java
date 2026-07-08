package com.ss.android.ugc.aweme.feed.feedwidget;

import X.AbstractC21516619Im;
import X.C0RD4;
import X.C21516719In;
import Y.ARunnableS90S0200000_21;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes34.dex */
public abstract class AbsFeedWidget extends GenericWidget {
    public AbstractC21516619Im LLIZLLLIL;

    public abstract C21516719In LJIILLIIL(View view);

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LLILZ;
        dataCenter.yQ2("video_params", this, false);
        dataCenter.yQ2("on_viewpager_page_selected", this, false);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        AbstractC21516619Im abstractC21516619Im = this.LLIZLLLIL;
        if (abstractC21516619Im != null) {
            ((C21516719In) abstractC21516619Im).LLJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
        AbstractC21516619Im abstractC21516619Im = this.LLIZLLLIL;
        if (abstractC21516619Im != null) {
            abstractC21516619Im.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIILIIL(View view) {
        C21516719In c21516719InLJIILLIIL = LJIILLIIL(view);
        this.LLIZLLLIL = c21516719InLJIILLIIL;
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter == null) {
            c21516719InLJIILLIIL.getClass();
        } else {
            c21516719InLJIILLIIL.LLILLL = dataCenter;
            dataCenter.yQ2("live_has_end", c21516719InLJIILLIIL, false);
        }
        VideoItemParams videoItemParams = (VideoItemParams) this.LLILZ.get("video_params");
        if (videoItemParams != null) {
            AbstractC21516619Im abstractC21516619Im = this.LLIZLLLIL;
            abstractC21516619Im.getClass();
            abstractC21516619Im.LL = videoItemParams.getAweme();
            abstractC21516619Im.LLILLJJLI = videoItemParams.mEventType;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* JADX INFO: renamed from: LJIILL */
    public void onChanged(C0RD4 c0rd4) {
        C21516719In c21516719In;
        Aweme aweme;
        UrlModel avatarLarger;
        if (c0rd4 != null) {
            String str = c0rd4.LIZ;
            str.getClass();
            if (!str.equals("on_viewpager_page_selected")) {
                if (str.equals("video_params")) {
                    Object obj = c0rd4.LIZIZ;
                    if (obj == null) {
                        obj = null;
                    }
                    VideoItemParams videoItemParams = (VideoItemParams) obj;
                    AbstractC21516619Im abstractC21516619Im = this.LLIZLLLIL;
                    if (abstractC21516619Im != null && videoItemParams != null) {
                        abstractC21516619Im.LL = videoItemParams.getAweme();
                        abstractC21516619Im.LLILLJJLI = videoItemParams.mEventType;
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC21516619Im abstractC21516619Im2 = this.LLIZLLLIL;
            if (abstractC21516619Im2 == null || (aweme = (c21516719In = (C21516719In) abstractC21516619Im2).LL) == null || aweme.getAuthor() == null || (avatarLarger = c21516719In.LL.getAuthor().getAvatarLarger()) == null || c21516719In.LLILZLL == null) {
                return;
            }
            HandlerHook.viewPost(c21516719In.LLILZLL, new ARunnableS90S0200000_21(avatarLarger, c21516719In, 65));
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(C0RD4 c0rd4) {
        onChanged(c0rd4);
    }
}
