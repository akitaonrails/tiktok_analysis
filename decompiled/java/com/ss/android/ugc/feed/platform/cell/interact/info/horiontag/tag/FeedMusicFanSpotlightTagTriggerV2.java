package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoSocialTagContainerTrigger;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedMusicFanSpotlightTagTriggerV2 extends AbsVideoSocialTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedMusicFanSpotlightAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_fan_spotlight";
    }

    @Override // X.C0RWO
    public final void bf(Aweme aweme) {
        LJIJJLI();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        boolean z;
        List<User> pickedUsers = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        int i = FeedMusicFanSpotlightTagTrigger.LLJL;
        if (aweme != null) {
            pickedUsers = aweme.getPickedUsers();
        }
        if (pickedUsers != null && !pickedUsers.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return true ^ z;
    }
}
