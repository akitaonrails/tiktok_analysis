package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoryNoteTextExtra implements Serializable {

    @C09CT("avatar_url")
    public UrlModel avatar;

    @C09CT("end")
    public Integer end;

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("start")
    public Integer start;

    @C09CT("type")
    public Integer type;

    @C09CT("uid")
    public String userId;

    public StoryNoteTextExtra() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryNoteTextExtra)) {
            return false;
        }
        StoryNoteTextExtra storyNoteTextExtra = (StoryNoteTextExtra) obj;
        return Intrinsics.LJFF(this.type, storyNoteTextExtra.type) && Intrinsics.LJFF(this.start, storyNoteTextExtra.start) && Intrinsics.LJFF(this.end, storyNoteTextExtra.end) && Intrinsics.LJFF(this.userId, storyNoteTextExtra.userId) && Intrinsics.LJFF(this.secUid, storyNoteTextExtra.secUid) && Intrinsics.LJFF(this.nickname, storyNoteTextExtra.nickname) && Intrinsics.LJFF(this.avatar, storyNoteTextExtra.avatar);
    }

    public StoryNoteTextExtra(Integer num, Integer num2, Integer num3, String str, String str2, String str3, UrlModel urlModel) {
        this.type = num;
        this.start = num2;
        this.end = num3;
        this.userId = str;
        this.secUid = str2;
        this.nickname = str3;
        this.avatar = urlModel;
    }
}
