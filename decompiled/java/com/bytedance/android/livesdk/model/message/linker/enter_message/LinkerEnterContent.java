package com.bytedance.android.livesdk.model.message.linker.enter_message;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.ListUser;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinkerEnterContent {

    @C09CT("anchor_multi_live_enum")
    public long MultiLiveType;

    @C09CT("anchor_setting_info")
    public MultiLiveAnchorPanelSettings anchorSettingInfo;

    @C09CT("linked_users")
    public List<ListUser> listUsers;
}
