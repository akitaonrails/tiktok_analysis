package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMCompletenessConfiguration {

    @C09CT("conversation_check_interval")
    public final int conversationCheckInterval;

    @C09CT("conversation_check_enabled")
    public final boolean isConversationCheckEnabled;

    @C09CT("conversation_mark_delete")
    public final boolean isConversationMarkDelete;

    @C09CT("conversation_repair_enabled")
    public final boolean isConversationRepairEnabled;

    @C09CT("message_check_enabled")
    public final boolean isMessageCheckEnabled;

    @C09CT("message_repair_enabled")
    public final boolean isMessageRepairEnabled;

    @C09CT("message_check_count")
    public final int messageCheckCount;

    @C09CT("message_check_interval")
    public final int messageCheckInterval;

    public IMCompletenessConfiguration() {
        this(false, 86400, false, true, 20, false, 86400, false);
    }

    public final boolean isConversationCheckEnabled() {
        return this.isConversationCheckEnabled;
    }

    public final boolean isConversationMarkDelete() {
        return this.isConversationMarkDelete;
    }

    public final boolean isConversationRepairEnabled() {
        return this.isConversationRepairEnabled;
    }

    public final boolean isMessageCheckEnabled() {
        return this.isMessageCheckEnabled;
    }

    public final boolean isMessageRepairEnabled() {
        return this.isMessageRepairEnabled;
    }

    public IMCompletenessConfiguration(boolean z, int i, boolean z2, boolean z3, int i2, boolean z4, int i3, boolean z5) {
        this.isConversationCheckEnabled = z;
        this.conversationCheckInterval = i;
        this.isConversationRepairEnabled = z2;
        this.isConversationMarkDelete = z3;
        this.messageCheckCount = i2;
        this.isMessageCheckEnabled = z4;
        this.messageCheckInterval = i3;
        this.isMessageRepairEnabled = z5;
    }
}
