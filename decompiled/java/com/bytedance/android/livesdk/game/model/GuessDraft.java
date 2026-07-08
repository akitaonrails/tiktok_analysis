package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GuessDraft {

    @C09CT("bet_duration_in_second")
    public long betDurationInSecond;

    @C09CT("draft_id_str")
    public String draftIdStr = "";

    @C09CT("is_auto_pin")
    public boolean isAutoPin;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("template")
    public GuessTemplate template;

    @C09CT("template_id")
    public long templateId;
}
