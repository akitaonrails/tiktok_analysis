package com.ss.android.ugc.aweme.live.notification;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class NotificationLiveStatus {

    @C09CT("data")
    public final DataBean data;

    @C09CT("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationLiveStatus)) {
            return false;
        }
        NotificationLiveStatus notificationLiveStatus = (NotificationLiveStatus) obj;
        return Intrinsics.LJFF(this.data, notificationLiveStatus.data) && this.statusCode == notificationLiveStatus.statusCode;
    }

    public static final class DataBean {

        @C09CT("push_status")
        public final int pushStatus;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataBean) && this.pushStatus == ((DataBean) obj).pushStatus;
        }

        public DataBean(int i) {
            this.pushStatus = i;
        }
    }

    public NotificationLiveStatus(DataBean dataBean, int i) {
        this.data = dataBean;
        this.statusCode = i;
    }
}
