package com.ss.ugc.live.sdk.message.data;

import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public interface IMessage {
    boolean consumedMessageSEI();

    int consumingStrategy();

    long getDecodeEndAtMillis();

    long getDecodeStartAtMillis();

    MessageID getDependID();

    MessageID getDependRootID();

    long getDimension();

    long getDispatchAtMillis();

    int getDispatchStrategy();

    long getDispatchTimeoutMillis();

    Map<String, Object> getExtraParams();

    FullLinkTrack getFullLinkTrack();

    int getGeneralMessageType();

    int getIntType();

    Boolean getIntercepted();

    long getLocalTimestamp();

    int getMessageFrom();

    long getMessageId();

    MessageSEI getMessageSEI();

    MessageTrackTimeInfo getMessageTrackTimeInfo();

    String getMethodName();

    long getOuterMessageId();

    int getPriority();

    ProtoApiResult.ProtoMessage getProtoMessage();

    boolean needMonitor();

    void removeDependID();

    void removeMessageSEI();

    void setDecodeEndAtMillis(long j);

    void setDecodeStartAtMillis(long j);

    void setDispatchAtMillis(long j);

    void setIntercepted(Boolean bool);

    void setOuterMessageId(long j);

    void setProtoMessage(ProtoApiResult.ProtoMessage protoMessage);
}
