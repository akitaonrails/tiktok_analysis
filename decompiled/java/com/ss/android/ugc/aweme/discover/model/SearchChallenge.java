package com.ss.android.ugc.aweme.discover.model;

import X.C09CS;
import X.C09CT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.model.SearchChallengeAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SearchChallenge implements Serializable {

    @C09CT("ad_data")
    @C09CS(StringJsonAdapterFactory.class)
    public SearchChallengeAdData adData;

    @C09CT("items")
    public List<Aweme> awemes;

    @C09CT("challenge_info")
    public Challenge challenge;
    public LogPbBean logPbBean;

    @C09CT("position")
    public List<Position> position;
    public String requestId;

    public boolean hasAwemeList() {
        List<Aweme> list = this.awemes;
        return list != null && list.size() >= 3;
    }

    public int hashCode() {
        return this.challenge.getCid().hashCode();
    }

    public SearchChallengeAdData getAdData() {
        return this.adData;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChallenge)) {
            return false;
        }
        return TextUtils.equals(this.challenge.getCid(), ((SearchChallenge) obj).challenge.getCid());
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
        Challenge challenge = this.challenge;
        if (challenge != null) {
            challenge.setRequestId(str);
        }
    }
}
