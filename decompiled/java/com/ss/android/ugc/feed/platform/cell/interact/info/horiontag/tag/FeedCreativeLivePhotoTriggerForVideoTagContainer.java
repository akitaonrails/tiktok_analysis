package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RKL;
import X.C13LE;
import X.C19719912Dl;
import X.C300390Bq1;
import X.C690870R8b;
import android.content.Context;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoTagContainerTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedCreativeLivePhotoTriggerForVideoTagContainer extends AbsVideoTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedCreativeLivePhotoVideoTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return C300390Bq1.LIZ() ? "genre_tag_live_photo" : "low_tag_live_photo";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Context context;
        int i = FeedCreativeLivePhotoTagTrigger.LLJLIL;
        ReusedAssem<?> reusedAssem = this.LLILLL;
        if (reusedAssem != null) {
            context = reusedAssem.getContext();
        } else {
            context = null;
        }
        return C0RKL.LIZ(context, videoItemParams);
    }
}
