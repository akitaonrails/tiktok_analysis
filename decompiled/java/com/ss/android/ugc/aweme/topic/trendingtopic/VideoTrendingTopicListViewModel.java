package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.C01GW;
import X.C11NJ;
import X.C11S5;
import X.C1559260qg8;
import X.C1575820r6q;
import X.C159Q;
import X.C15GD;
import X.C15J4;
import X.C1701940uOG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.InterfaceC0148002o;
import Y.AfS200S0100000_31;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.BillboardInfo;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.VideoTrendingTopicApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTrendingTopicListViewModel extends AssemViewModel<C15GD> {
    public VideoTrendingTopic LLIZLLLIL;
    public final List<BillboardInfo> LL = new ArrayList();
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1575820r6q.class, (Class<Object>) "key", (String) 13), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1204));
    public boolean LLILZ = true;
    public String LLILZIL = "";
    public String LLILZLL = "Popular";
    public String LLIZ = "Recent";
    public final C11NJ LLJ = new C11NJ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C15GD(null, null, null);
    }

    public final C1575820r6q vQ2() {
        C1575820r6q c1575820r6q = (C1575820r6q) this.LLILLJJLI.getValue();
        return c1575820r6q == null ? new C1575820r6q("", "", "", null) : c1575820r6q;
    }

    public final int wQ2() {
        Integer num;
        List<VideoTrendingTopic> list;
        int iIndexOf = 0;
        for (BillboardInfo billboardInfo : this.LL) {
            if (billboardInfo != null && (num = billboardInfo.type) != null && num.equals(Integer.valueOf(xQ2())) && (list = billboardInfo.topics) != null) {
                for (VideoTrendingTopic videoTrendingTopic : list) {
                    if (Intrinsics.LJFF(videoTrendingTopic, this.LLIZLLLIL)) {
                        iIndexOf = billboardInfo.topics.indexOf(videoTrendingTopic);
                    }
                }
            }
        }
        if (iIndexOf >= 5) {
            return iIndexOf;
        }
        return 0;
    }

    public final int xQ2() {
        if (Intrinsics.LJFF(this.LLILZIL, this.LLILZLL)) {
            return 1;
        }
        return Intrinsics.LJFF(this.LLILZIL, this.LLIZ) ? 2 : 0;
    }

    public final void yQ2(VideoTrendingTopic videoTrendingTopic, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_post_page");
        c2344009Gk.LJIIIIZZ("enter_method", "trends_selection_panel");
        c2344009Gk.LIZLLL(videoTrendingTopic.eventId, "selected_trends");
        c2344009Gk.LJIIIIZZ("creation_id", vQ2().getCreationId());
        c2344009Gk.LJIIIIZZ("content_type", vQ2().getContentType());
        c2344009Gk.LJIIIIZZ("recall_source", "");
        c2344009Gk.LJIIIIZZ("choose_type", str);
        C20684815ws.LJIILLIIL("choose_trends_event", c2344009Gk.LIZ);
    }

    public final void zQ2(String str, boolean z) {
        if (str != null) {
            this.LLILZIL = str;
        }
        if (this.LLILZ) {
            this.LLIZLLLIL = (VideoTrendingTopic) this.LLILLL.getValue();
            this.LLILZ = false;
        }
        if (!z) {
            setState(new AwS610S0100000_31(this, 253));
            return;
        }
        ((ArrayList) this.LL).clear();
        this.LLILZIL = this.LLILZLL;
        C159Q.LIZ.getClass();
        VideoTrendingTopicApi.LIZ.getClass();
        this.LLJ.LIZ(C15J4.LIZ().getTrendingTopicList("[]").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS200S0100000_31(this, 13), new AfS200S0100000_31(this, 14)));
    }
}
