package com.ss.android.ugc.aweme.live.notification.repository;

import X.C11NZ;
import X.InterfaceC1485505rh;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationGameApi {
    public static final NotificationGameApi LIZ = new NotificationGameApi();

    public interface RealApi {
        @InterfaceC1501240pAY("/tiktok/v1/ad/notice/update/")
        @InterfaceC1485505rh
        C11NZ<NotificationGameStatus> changeOptions(@InterfaceC1501100pAK("enable_notice") boolean z, @InterfaceC1501100pAK("creative_id") String str, @InterfaceC1501070pAH("log_id") String str2);
    }
}
