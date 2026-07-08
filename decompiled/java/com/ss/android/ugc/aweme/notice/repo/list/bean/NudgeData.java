package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class NudgeData implements Serializable {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("aweme_type")
    public final int awemeType;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("nudge_enter_method")
    public final String enterMethod;

    @C09CT("is_story")
    public final boolean isStory;

    @C09CT("nudge_type")
    public final int nudgeType;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NudgeData(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(", isStory=");
        sbLIZ.append(this.isStory);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", nudgeType=");
        sbLIZ.append(this.nudgeType);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NudgeData() {
        this("", 0, false, "", "", 0, "");
    }

    public final boolean isStory() {
        return this.isStory;
    }

    public NudgeData(String str, int i, boolean z, String str2, String str3, int i2, String str4) {
        this.awemeId = str;
        this.awemeType = i;
        this.isStory = z;
        this.authorId = str2;
        this.coverUrl = str3;
        this.nudgeType = i2;
        this.enterMethod = str4;
    }
}
