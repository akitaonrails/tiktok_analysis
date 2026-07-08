package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class LongCommentWritingConfig implements Serializable {

    @C09CT("button_group_rearrange")
    public final int buttonGroupReArrange;

    @C09CT("char_count_before_hint")
    public final long charCountBeforeHint;

    @C09CT("default_show_lines")
    public final long defaultShowLines;

    @C09CT("enable")
    public final int enable;

    @C09CT("expand_button_pos_opt")
    public final int expandButtonPosOpt;

    @C09CT("has_char_limit_hint")
    public final int hasCharLimitHint;

    @C09CT("input_line_need_expand")
    public final int inputLineNeedExpand;

    @C09CT("max_input_limit")
    public final long maxInputLimit;

    @C09CT("need_empty_space_between_paragraph")
    public final int needEmptySpaceBetweenParagraph;

    @C09CT("remove_avatar")
    public final int removeAvatar;

    public LongCommentWritingConfig() {
        this(0, 0, 10000L, 0, 0, 5, 1L, 10L, 0, 0);
    }

    public LongCommentWritingConfig(int i, int i2, long j, int i3, int i4, int i5, long j2, long j3, int i6, int i7) {
        this.enable = i;
        this.hasCharLimitHint = i2;
        this.maxInputLimit = j;
        this.expandButtonPosOpt = i3;
        this.buttonGroupReArrange = i4;
        this.inputLineNeedExpand = i5;
        this.defaultShowLines = j2;
        this.charCountBeforeHint = j3;
        this.removeAvatar = i6;
        this.needEmptySpaceBetweenParagraph = i7;
    }
}
