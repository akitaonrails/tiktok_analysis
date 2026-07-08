package com.ss.android.ugc.aweme.service.proactive.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ActiveLoginTriggerCommentsConfig {

    @C09CT("allow_expand")
    public final Boolean allowExpand;

    @C09CT("comment_list_login_enabled")
    public final Boolean commentListLoginEnabled;

    @C09CT("empty_comment_signup_button_enabled")
    public final Boolean emptyCommentSignupButtonEnabled;

    @C09CT("hide_input_panel")
    public final Boolean hideInputPanel;

    @C09CT("max_comments")
    public final Integer maxComments;

    @C09CT("max_trigger_times")
    public final Integer maxTriggerTimes;

    @C09CT("precise_expose_vid")
    public final String preciseExposeVid;

    @C09CT("trigger_tap")
    public final Integer triggerTap;

    public ActiveLoginTriggerCommentsConfig() {
        this(null, Boolean.TRUE, -1, -1, -1, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    }

    public ActiveLoginTriggerCommentsConfig(String str, Boolean bool, Integer num, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.preciseExposeVid = str;
        this.allowExpand = bool;
        this.triggerTap = num;
        this.maxTriggerTimes = num2;
        this.maxComments = num3;
        this.hideInputPanel = bool2;
        this.emptyCommentSignupButtonEnabled = bool3;
        this.commentListLoginEnabled = bool4;
    }
}
