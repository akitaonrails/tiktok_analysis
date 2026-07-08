package com.bytedance.ies.im.core.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKCoreMetricsReversal {
    public static final IMSDKCoreMetricReversalConfig LIZ = new IMSDKCoreMetricReversalConfig(0, 0, 0, 0, 0, 0, 0, 0);

    public static final class IMSDKCoreMetricReversalConfig {

        @C09CT("cold_sync_delay")
        public final int coldLaunchSyncDelay;

        @C09CT("cold_sync_drop")
        public final int coldLaunchSyncDrop;

        @C09CT("load_conv_list_delay")
        public final int loadConvListDelay;

        @C09CT("load_conv_list_drop")
        public final int loadConvListDrop;

        @C09CT("load_msg_list_delay")
        public final int loadMsgListDelay;

        @C09CT("load_msg_list_drop")
        public final int loadMsgListDrop;

        @C09CT("send_msg_display_delay")
        public final int sendMsgDisplayDelay;

        @C09CT("send_msg_display_drop")
        public final int sendMsgDisplayDrop;

        public IMSDKCoreMetricReversalConfig() {
            this(0, 0, 0, 0, 0, 0, 0, 0);
        }

        public IMSDKCoreMetricReversalConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.loadMsgListDelay = i;
            this.loadMsgListDrop = i2;
            this.loadConvListDelay = i3;
            this.loadConvListDrop = i4;
            this.sendMsgDisplayDelay = i5;
            this.sendMsgDisplayDrop = i6;
            this.coldLaunchSyncDelay = i7;
            this.coldLaunchSyncDrop = i8;
        }
    }
}
