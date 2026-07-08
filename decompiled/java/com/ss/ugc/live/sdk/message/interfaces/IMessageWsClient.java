package com.ss.ugc.live.sdk.message.interfaces;

import X.AbstractC19666311wz;
import X.C1500700p9g;
import X.C2222611Byt;
import X.InterfaceC19666511x1;
import X.InterfaceC2222651Byx;
import android.content.Context;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public interface IMessageWsClient extends InterfaceC2222651Byx {

    public interface Callback {
        void onApiError(Exception exc, int i);

        void onApiSuccess(ProtoApiResult protoApiResult, int i, boolean z);

        void onHostWebSocketMessage(PayloadItem payloadItem);

        void onHostWebSocketPayloadDecoded(ProtoApiResult protoApiResult, boolean z);

        void onWebSocketConnected();

        void onWebSocketDisconnected();

        void onWebSocketMessage(PayloadItem payloadItem);

        void onWebSocketPayloadDecoded(ProtoApiResult protoApiResult, boolean z);
    }

    void apiCall(Map<String, String> map, int i, boolean z);

    void connectToWebSocket(Map<String, String> map, String str);

    void connectToWebSocketReuse();

    void decodeHostWebSocketPayload(PayloadItem payloadItem, boolean z);

    ProtoApiResult decodeProtoApiResult(ProtoApiResult protoApiResult);

    void decodeWebSocketPayload(PayloadItem payloadItem, boolean z);

    void disconnectFromWebSocket(String str);

    /* synthetic */ AbstractC19666311wz<C2222611Byt, Exception> executeMessagePost(C1500700p9g c1500700p9g);

    @Override // X.InterfaceC2222651Byx
    /* synthetic */ void get(C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1);

    long getCurrentTimeMillis();

    String getDomain();

    Map<String, String> getFetchHistoryParams();

    long getRoomId();

    long getUserId();

    boolean isWsConnected();

    void onRelease();

    void onStartMessage();

    void onStopMessage(boolean z);

    @Override // X.InterfaceC2222651Byx
    /* synthetic */ void post(C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1);

    void sendHeartBeatMsg(long j, long j2, long j3, boolean z);

    void sendImEnterRoomMsg(String str, long j, long j2, long j3);

    void sendUplinkPacket(PayloadItem payloadItem);

    void sendWebSocketMessage(String str, String str2, byte[] bArr, long j, long j2, Map<String, String> map);

    void setCallback(Callback callback);

    void setData(long j, Context context);

    void setWebSocketServerTimeGap(long j);
}
