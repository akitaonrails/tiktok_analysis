package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: loaded from: classes22.dex */
public class RelatedChallengeMusic {

    @C09CT("category_type")
    public int categoryType;

    @C09CT("ch_info")
    public Challenge challenge;

    @C09CT("music_info")
    public Music music;

    public int getCategoryType() {
        return this.categoryType;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public Music getMusic() {
        return this.music;
    }

    public void setCategoryType(int i) {
        this.categoryType = i;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
