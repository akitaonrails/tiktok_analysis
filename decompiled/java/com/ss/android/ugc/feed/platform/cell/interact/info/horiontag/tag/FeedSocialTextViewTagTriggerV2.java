package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import X.C698200Ra6;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoSocialTagContainerTrigger;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSocialTextViewTagTriggerV2 extends AbsVideoSocialTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedSocialTextViewTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_label";
    }

    @Override // X.C0RWO
    public final void bf(Aweme aweme) {
        LJIJJLI();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        List<AwemeTextLabelModel> list;
        AwemeRawAd awemeRawAd;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        int i = FeedSocialTextViewTagTrigger.LLJL;
        if (aweme != null) {
            C698200Ra6.LIZ.getClass();
            if ((!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getAdTagPosition() != 1) && (list = aweme.textVideoLabels) != null && (!list.isEmpty())) {
                return true;
            }
        }
        return false;
    }
}
