package com.ss.android.ugc.aweme.im.sharepanel.impl.share.sendto;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SendResultEvent {
    public static final int $stable = 0;
    public final String receiverUid;
    public final int sendMessageScene;
    public final int sendMessageStatus;

    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sendMessageScene", Integer.valueOf(this.sendMessageScene));
        linkedHashMap.put("sendMessageStatus", Integer.valueOf(this.sendMessageStatus));
        String str = this.receiverUid;
        if (str != null) {
            linkedHashMap.put("receiverUid", str);
        }
        return linkedHashMap;
    }

    public SendResultEvent(int i, int i2, String str) {
        this.sendMessageScene = i;
        this.sendMessageStatus = i2;
        this.receiverUid = str;
    }
}
