package com.bytedance.android.livesdkapi.message;

import X.C09CT;
import com.ss.ugc.live.sdk.message.data.MessageID;
import com.ss.ugc.live.sdk.message.data.MessageSEI;

/* JADX INFO: loaded from: classes16.dex */
public class LiveMessageSEI {

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("unique_id")
    public LiveMessageID uniqueID;

    public final MessageSEI LIZ(long j) {
        MessageID messageID;
        MessageSEI messageSEI = new MessageSEI();
        LiveMessageID liveMessageID = this.uniqueID;
        if (liveMessageID != null) {
            messageID = new MessageID();
            messageID.primaryID = liveMessageID.primaryID;
            messageID.messageScene = liveMessageID.messageScene;
        } else {
            messageID = null;
        }
        messageSEI.uniqueID = messageID;
        messageSEI.timestamp = this.timestamp;
        messageSEI.localTimestamp = j;
        return messageSEI;
    }
}
