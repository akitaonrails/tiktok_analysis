package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ChatSettingConfig {

    @C09CT("config_type")
    public int configType;

    @C09CT("user_filter_config")
    public ChatSettingUserFilterConfig userFilterConfig;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT("show_message_list")
    public List<Integer> showMessageList = new ArrayList();

    @C09CT("blank_description")
    public String blankDescription = "";
}
