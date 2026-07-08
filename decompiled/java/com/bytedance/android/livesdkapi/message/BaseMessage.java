package com.bytedance.android.livesdkapi.message;

import X.C001A;
import X.C09CT;
import X.C09DE;
import android.os.SystemClock;
import com.ss.ugc.live.sdk.message.data.MessageTrackTimeInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class BaseMessage {

    @C09CT("common")
    public CommonMessageData baseMessage;
    public int notifyMsgSampleLogState;
    public long receiveTime;
    public transient long timestamp;

    @C09DE
    public transient C001A type = C001A.DEFAULT;
    public volatile long localTimestamp = SystemClock.elapsedRealtime();
    public final Map<String, Object> mExtraParams = new ConcurrentHashMap();
    public MessageTrackTimeInfo messageTrackTimeInfo = new MessageTrackTimeInfo();

    public boolean canText() {
        return false;
    }

    public CommonMessageData getBaseMessage() {
        return this.baseMessage;
    }

    public MessageTrackTimeInfo getMessageTrackTimeInfo() {
        return this.messageTrackTimeInfo;
    }

    public C001A getMessageType() {
        return this.type;
    }

    public boolean isCurrentRoom(long j) {
        long j2;
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null) {
            j2 = commonMessageData.roomId;
        } else {
            j2 = 0;
        }
        if (j != 0 && j == j2) {
            return true;
        }
        return false;
    }

    public void setBaseMessage(CommonMessageData commonMessageData) {
        this.baseMessage = commonMessageData;
    }

    public void setType(C001A c001a) {
        this.type = c001a;
    }
}
