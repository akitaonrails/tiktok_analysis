package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GetLoggedPCDeviceInfoResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("device_info")
        public List<PCDeviceInfo> deviceInfo = new ArrayList();
    }
}
