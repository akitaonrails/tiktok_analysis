package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ChatListRevampConfig {

    @C09CT("chat_list_revamp_debug_log")
    public final boolean enableDebugLog;

    @C09CT("enable_read_status_from_data_source")
    public final boolean enableReadStatusFromDataSourceCheck;

    public ChatListRevampConfig() {
        this(false, true);
    }

    public ChatListRevampConfig(boolean z, boolean z2) {
        this.enableDebugLog = z;
        this.enableReadStatusFromDataSourceCheck = z2;
    }
}
