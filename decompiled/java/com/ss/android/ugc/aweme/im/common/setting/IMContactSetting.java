package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes3.dex */
public final class IMContactSetting {
    public static final IMContactSetting LIZ = new IMContactSetting();
    public static final ContactUserListConfig LIZIZ = new ContactUserListConfig(259200, 100, 3, 5, 36000, false, true);

    public static final class ContactUserListConfig {

        @C09CT("contact_bytesync_finish_sync_history_interval")
        public final long bytesyncHistoryFinishInterval;

        @C09CT("cancel_request_when_open_share_panel")
        public final boolean cancelRequestWhenOpenSharePanel;

        @C09CT("contact_debug_tool")
        public final boolean debugTool;

        @C09CT("contact_user_list_completeness_interval")
        public final long userListCompletenessInterval;

        @C09CT("contact_user_list_request_count")
        public final int userListRequestCount;

        @C09CT("contact_user_list_request_retry_count")
        public final int userListRequestRetryCount;

        @C09CT("contact_user_list_update_interval")
        public final long userListUpdateInterval;

        public ContactUserListConfig() {
            this(259200L, 100, 3, 5L, 36000L, false, true);
        }

        public ContactUserListConfig(long j, int i, int i2, long j2, long j3, boolean z, boolean z2) {
            this.userListUpdateInterval = j;
            this.userListRequestCount = i;
            this.userListRequestRetryCount = i2;
            this.bytesyncHistoryFinishInterval = j2;
            this.userListCompletenessInterval = j3;
            this.debugTool = z;
            this.cancelRequestWhenOpenSharePanel = z2;
        }
    }

    public static ContactUserListConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ContactUserListConfig contactUserListConfig = LIZIZ;
        ContactUserListConfig contactUserListConfig2 = (ContactUserListConfig) settingsManagerLIZLLL.LJIIIIZZ("ttk_contact_configuration", ContactUserListConfig.class, contactUserListConfig);
        return contactUserListConfig2 != null ? contactUserListConfig2 : contactUserListConfig;
    }
}
