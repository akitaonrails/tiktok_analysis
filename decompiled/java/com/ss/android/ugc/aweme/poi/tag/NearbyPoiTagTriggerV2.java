package com.ss.android.ugc.aweme.poi.tag;

import X.C1367960lha;
import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoTagContainerTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class NearbyPoiTagTriggerV2 extends AbsVideoTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(NearbyPoiTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_poi";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        if (videoItemParams != null) {
            String str = videoItemParams.mEventType;
            Aweme aweme = videoItemParams.getAweme();
            C1367960lha.LIZ.getClass();
            return C1367960lha.LIZ().isPoiTagShow(str, aweme);
        }
        return false;
    }
}
