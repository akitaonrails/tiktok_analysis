package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SummonFriendItem {
    public boolean isMentionBlocked;
    public String label;
    public LogPbBean logPbBean;

    @C09CT("user_info")
    public User mUser;
    public String searchId;

    @C09CT("position")
    public List<Segment> segments;
    public int type = 1;

    public String getLabel() {
        return this.label;
    }

    public List<Segment> getSegments() {
        return this.segments;
    }

    public int getType() {
        return this.type;
    }

    public User getUser() {
        return this.mUser;
    }

    public boolean isMentionBlocked() {
        return this.isMentionBlocked;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setMentionBlocked(boolean z) {
        this.isMentionBlocked = z;
    }

    public void setSegments(List<Segment> list) {
        this.segments = list;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUser(User user) {
        this.mUser = user;
    }
}
