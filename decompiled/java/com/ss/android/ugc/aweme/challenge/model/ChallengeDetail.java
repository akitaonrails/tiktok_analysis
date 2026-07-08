package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class ChallengeDetail extends BaseResponse {

    @C09CT("ch_info")
    public Challenge challenge;

    @C09CT("dynamic_list")
    public List<ChallengeMixFeed> dynamicList;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("preview_status")
    public int previewStatus;

    @C09CT("preview_toast_text")
    public String previewToastText;

    @C09CT("rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;

    @C09CT("slide_list")
    public List<Aweme> slideList;

    @C09CT("slide_title")
    public String slideTitle;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<ChallengeMixFeed> getDynamicList() {
        return this.dynamicList;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getPreviewStatus() {
        return this.previewStatus;
    }

    public String getPreviewToastText() {
        return this.previewToastText;
    }

    public List<RelatedChallengeMusic> getRelatedChallengeMusicList() {
        return this.relatedChallengeMusicList;
    }

    public List<Aweme> getSlideList() {
        return this.slideList;
    }

    public String getSlideTitle() {
        return this.slideTitle;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public ChallengeDetail setDynamicList(List<ChallengeMixFeed> list) {
        this.dynamicList = list;
        return this;
    }

    public ChallengeDetail setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
        return this;
    }
}
