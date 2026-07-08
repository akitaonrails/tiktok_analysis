package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyRecord;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyControlReq {

    @C09CT("records")
    public List<MsgNotifyRecord> records = new ArrayList();

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("notify_records")
    public List<NotifyRecord> notifyRecords = new ArrayList();
}
