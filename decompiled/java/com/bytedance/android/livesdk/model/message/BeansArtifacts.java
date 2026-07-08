package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BeansArtifacts {

    @C09CT("anchors_info")
    public List<AnchorInfo> anchorsInfo = new ArrayList();

    public static final class AnchorInfo {

        @C09CT("anchor_id")
        public long anchorId;

        @C09CT("number_comments")
        public long numberComments;

        @C09CT("version")
        public long version;

        @C09CT("gifts")
        public List<GiftInfo> gifts = new ArrayList();

        @C09CT("contributors")
        public List<CompetitionContributorInfo> contributors = new ArrayList();

        public static final class GiftInfo {

            @C09CT("coins_per_gift")
            public long coinsPerGift;

            @C09CT("gift_id")
            public long giftId;

            @C09CT("number_beans")
            public long numberBeans;

            @C09CT("number_gifts")
            public long numberGifts;
        }
    }
}
