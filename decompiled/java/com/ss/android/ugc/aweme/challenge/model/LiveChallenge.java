package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.Challenge;

/* JADX INFO: loaded from: classes22.dex */
public class LiveChallenge {

    @C09CT("ch_info")
    public Challenge challenge;

    @C09CT("room_taged")
    public boolean roomTaged;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public boolean isRoomTaged() {
        return this.roomTaged;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public void setRoomTaged(boolean z) {
        this.roomTaged = z;
    }
}
