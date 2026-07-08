package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public final class PlayTogetherTemplateV2 {

    @C09CT("apply_limit_type")
    public int applyLimitType;

    @C09CT("connect_type")
    public int connectType;

    @C09CT("review_not_pass_fields")
    public long reviewNotPassFields;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("template_config_id")
    public int templateConfigId;

    @C09CT("template_type")
    public int templateType;

    @C09CT("template_id")
    public String templateId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT("apply_note")
    public String applyNote = "";

    @C09CT("send_message")
    public String sendMessage = "";

    @C09CT("icon_url")
    public String iconUrl = "";

    @C09CT("icon_url_dark_mode")
    public String iconUrlDarkMode = "";
}
