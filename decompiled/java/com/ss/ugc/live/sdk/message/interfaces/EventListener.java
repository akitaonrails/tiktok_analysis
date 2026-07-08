package com.ss.ugc.live.sdk.message.interfaces;

import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public interface EventListener {
    void onConnectingWebSocket(int i);

    void onDeduplicateInterceptorMessage(IMessage iMessage);

    void onDispatchMessage(IMessage iMessage);

    void onEnqueueMessage(List<IMessage> list, List<IMessage> list2);

    void onImFetchFailed(Throwable th);

    void onImFetchStarted();

    void onImFetchSucceeded();

    void onImPrefetchFailed(Throwable th);

    void onImPrefetchStarted();

    void onImPrefetchSucceeded();

    void onInterceptMessage(IMessage iMessage);

    void onMessageConsumeException(IMessage iMessage);

    void onPreDispatchMessage(IMessage iMessage);

    void onPreDispatchMessages(List<IMessage> list);

    void onReset();

    void onRoomEntered();

    void onSwitchToHttp(String str);

    void onWebSocketConnected();

    void onWebSocketDisconnected();
}
