package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ChatSettingPresetConfig {

    @C09CT("config_type")
    public int configType;

    @C09CT("user_filter_config")
    public ChatSettingUserFilterConfig userFilterConfig;

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT("show_message_list")
    public List<Integer> showMessageList = new ArrayList();

    @C09CT("blank_description")
    public String blankDescription = "";
}
