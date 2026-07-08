package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SearchChallenge {

    @C09CT("challenge_info")
    public Challenge challenge;
    public boolean isFake;

    @C09CT("position")
    public List<Segment> segments;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<Segment> getSegments() {
        return this.segments;
    }

    public boolean isFake() {
        return this.isFake;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public void setFake(boolean z) {
        this.isFake = z;
    }

    public void setSegments(List<Segment> list) {
        this.segments = list;
    }
}
