package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MgActivityInRoomBannerMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public MgActivityBannerContent content;

    @C09CT("feature_name")
    public String featureName;

    @C09CT("feature_type")
    public String featureType;

    @C09CT("state_id")
    public long stateId;

    @C09CT("state_name")
    public String stateName;

    public MgActivityInRoomBannerMessage() {
        this.type = C001A.MG_ACTIVITY_IN_ROOM_BANNER_MESSAGE;
        this.featureType = "";
        this.featureName = "";
        this.stateName = "";
    }
}
