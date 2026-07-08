package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ChallengeStruct {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("challenge_info")
    public Challenge challenge;

    @C09CT("cover_url")
    public List<String> coverUrlList;

    @C09CT("cha_desc")
    public String desc;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final List<String> getCoverUrlList() {
        return this.coverUrlList;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public final void setCoverUrlList(List<String> list) {
        this.coverUrlList = list;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public ChallengeStruct(Challenge challenge, String str, List<String> list, List<? extends Aweme> list2) {
        this.challenge = challenge;
        this.desc = str;
        this.coverUrlList = list;
        this.awemeList = list2;
    }
}
