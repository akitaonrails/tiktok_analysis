package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class ChallengeGuide extends BaseResponse implements Serializable {

    @C09CT("challenge_id")
    public final String challengeId = "";

    @C09CT("challenge_name")
    public final String challengeName = "";

    @C09CT("profile_image")
    public final String profileImage = "";

    @C09CT("guide_desc")
    public final String guideDesc = "";

    @C09CT("open_url")
    public final String openUrl = "";

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getChallengeName() {
        return this.challengeName;
    }

    public final String getGuideDesc() {
        return this.guideDesc;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getProfileImage() {
        return this.profileImage;
    }
}
