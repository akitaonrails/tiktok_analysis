package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ModerationAigcInfo implements Serializable {

    @C09CT("moderation_aigc_label_type")
    public int moderationAigcLabelType;

    @C09CT("moderation_creator_segment")
    public String moderationCreatorSegment;

    @C09CT("moderation_overlabel_warning")
    public int moderationOverLabelWarning;

    @C09CT("moderation_user_label_status")
    public int moderationUserLabelStatus;

    public ModerationAigcInfo() {
        this(-1, -1, -1, null);
    }

    public final void setModerationOverLabelWarning(int i) {
        this.moderationOverLabelWarning = i;
    }

    public final void setModerationUserLabelStatus(int i) {
        this.moderationUserLabelStatus = i;
    }

    public ModerationAigcInfo(int i, int i2, int i3, String str) {
        this.moderationAigcLabelType = i;
        this.moderationOverLabelWarning = i2;
        this.moderationUserLabelStatus = i3;
        this.moderationCreatorSegment = str;
    }
}
