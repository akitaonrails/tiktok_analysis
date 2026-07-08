package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class HotSearchInfo implements Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = 4;

    @C09CT("challenge_id")
    public String challengeId;

    @C09CT("group_id")
    public String id;

    @C09CT("label")
    public int label;

    @C09CT("rank")
    public int rank;

    @C09CT("search_word")
    public String searchWord;

    @C09CT("sentence")
    public String sentence;

    @C09CT("value")
    public long value;

    @C09CT("vb_rank")
    public int videoRank;

    @C09CT("vb_rank_value")
    public long videoRankVV;

    public static final class Companion {
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLabel() {
        return this.label;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getSearchWord() {
        return this.searchWord;
    }

    public final String getSentence() {
        return this.sentence;
    }

    public final long getValue() {
        return this.value;
    }

    public final int getVideoRank() {
        return this.videoRank;
    }

    public final long getVideoRankVV() {
        return this.videoRankVV;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setSearchWord(String str) {
        this.searchWord = str;
    }

    public final void setSentence(String str) {
        this.sentence = str;
    }

    public final void setValue(long j) {
        this.value = j;
    }

    public final void setVideoRank(int i) {
        this.videoRank = i;
    }

    public final void setVideoRankVV(long j) {
        this.videoRankVV = j;
    }
}
