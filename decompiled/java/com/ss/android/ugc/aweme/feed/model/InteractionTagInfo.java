package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class InteractionTagInfo implements Serializable {

    @C09CT("interest_level")
    public int interestLevel;

    @C09CT("tagged_users")
    public List<InteractionTagUserInfo> taggedUsers;

    @C09CT("video_label_text")
    public String videoLabelText;

    public InteractionTagInfo() {
        this(0, "", null);
    }

    public final void setInterestLevel(int i) {
        this.interestLevel = i;
    }

    public final void setTaggedUsers(List<InteractionTagUserInfo> list) {
        this.taggedUsers = list;
    }

    public final void setVideoLabelText(String str) {
        this.videoLabelText = str;
    }

    public InteractionTagInfo(int i, String str, List<InteractionTagUserInfo> list) {
        this.interestLevel = i;
        this.videoLabelText = str;
        this.taggedUsers = list;
    }
}
