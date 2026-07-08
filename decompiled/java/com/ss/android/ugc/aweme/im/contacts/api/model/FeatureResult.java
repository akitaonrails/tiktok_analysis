package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class FeatureResult implements Serializable {

    @C09CT("display_gray_entrance")
    public final Boolean displayGrayEntrance;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer featureStatus;

    @C09CT("gray_entrance_tips")
    public final String grayEntranceTips;

    public FeatureResult() {
        this(0, null, null);
    }

    public final FeatureResult copy(Integer num, Boolean bool, String str) {
        return new FeatureResult(num, bool, str);
    }

    public FeatureResult(Integer num, Boolean bool, String str) {
        this.featureStatus = num;
        this.displayGrayEntrance = bool;
        this.grayEntranceTips = str;
    }
}
