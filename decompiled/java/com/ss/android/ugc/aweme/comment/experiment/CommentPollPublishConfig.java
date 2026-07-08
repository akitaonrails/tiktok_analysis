package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPollPublishConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_option_length")
    public final int maxOptionLength;

    @C09CT("max_options")
    public final int maxOptions;

    @C09CT("max_title_length")
    public final int maxTitleLength;

    @C09CT("tooltip_limit_days")
    public final int tooltipLimitDays;

    public CommentPollPublishConfig() {
        this(false, 100, 25, 5, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPollPublishConfig)) {
            return false;
        }
        CommentPollPublishConfig commentPollPublishConfig = (CommentPollPublishConfig) obj;
        return this.enable == commentPollPublishConfig.enable && this.maxTitleLength == commentPollPublishConfig.maxTitleLength && this.maxOptionLength == commentPollPublishConfig.maxOptionLength && this.maxOptions == commentPollPublishConfig.maxOptions && this.tooltipLimitDays == commentPollPublishConfig.tooltipLimitDays;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enable) * 31) + this.maxTitleLength) * 31) + this.maxOptionLength) * 31) + this.maxOptions) * 31) + this.tooltipLimitDays;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPollPublishConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", maxTitleLength=");
        sbLIZ.append(this.maxTitleLength);
        sbLIZ.append(", maxOptionLength=");
        sbLIZ.append(this.maxOptionLength);
        sbLIZ.append(", maxOptions=");
        sbLIZ.append(this.maxOptions);
        sbLIZ.append(", tooltipLimitDays=");
        sbLIZ.append(this.tooltipLimitDays);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommentPollPublishConfig(boolean z, int i, int i2, int i3, int i4) {
        this.enable = z;
        this.maxTitleLength = i;
        this.maxOptionLength = i2;
        this.maxOptions = i3;
        this.tooltipLimitDays = i4;
    }
}
