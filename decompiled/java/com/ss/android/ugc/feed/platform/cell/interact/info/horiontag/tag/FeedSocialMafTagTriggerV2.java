package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C690870R8b;
import X.C698200Ra6;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoSocialTagContainerTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSocialMafTagTriggerV2 extends AbsVideoSocialTagContainerTrigger {
    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final C19719912Dl LJIIJJI() {
        return C13LE.LIZ(FeedSocialMafTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "high_tag_maf";
    }

    @Override // X.C0RWO
    public final void bf(Aweme aweme) {
        LJIJJLI();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger
    public final boolean LJIIJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme;
        User author;
        MatchedFriendStruct matchedFriendStruct;
        SchoolMutualStruct schoolMutualStruct = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schoolMutualStruct ");
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null) {
            schoolMutualStruct = matchedFriendStruct.schoolMutualStruct;
        }
        sbLIZ.append(schoolMutualStruct);
        C2188811AlT.LIZIZ(sbLIZ);
        C698200Ra6.LIZ.getClass();
        return C698200Ra6.LIZIZ(aweme);
    }
}
