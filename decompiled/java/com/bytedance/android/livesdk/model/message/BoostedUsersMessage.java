package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BoostedUsersMessage extends AbstractC1136060ffY {

    @C09CT(LiveCenterMockToolSwitch.FLARE)
    public FlareBoostedUsers flare;

    @C09CT("promote_ads")
    public List<PromoteAdBoostedUsers> promoteAds;

    @C09CT("total_cnt")
    public long totalCnt;

    public BoostedUsersMessage() {
        this.type = C001A.BOOSTED_USERS_MESSAGE;
        this.promoteAds = new ArrayList();
    }
}
