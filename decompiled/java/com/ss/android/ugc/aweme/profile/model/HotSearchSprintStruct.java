package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HotSearchSprintStruct implements Serializable {
    public static final long serialVersionUID = 1;

    @C09CT("followers")
    public List<User> hitRankPeoples;

    @C09CT("sprint")
    public int sprint;

    public List<User> getHitRankPeoples() {
        return this.hitRankPeoples;
    }

    public int getSprint() {
        return this.sprint;
    }

    public void setHitRankPeoples(List<User> list) {
        this.hitRankPeoples = list;
    }

    public void setSprint(int i) {
        this.sprint = i;
    }
}
