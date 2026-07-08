package com.ss.ugc.live.sdk.message.interfaces;

import X.C1500700p9g;
import X.C2222081By2;
import X.C2222371ByV;
import X.InterfaceC19666511x1;
import android.os.Looper;
import com.ss.ugc.live.sdk.message.MessageFeatureControl;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface IMessageManager {
    void addAsyncMessageListener(int i, OnMessageListener onMessageListener);

    void addEventListener(EventListener eventListener);

    void addInterceptor(IInterceptor iInterceptor);

    void addMessageListener(int i, OnIMMessageListener onIMMessageListener);

    void addMessageListener(int i, OnMessageListener onMessageListener);

    void addStickyMessageListener(int i, OnIMMessageListener onIMMessageListener);

    void addStickyMessageListener(int i, OnMessageListener onMessageListener);

    void destroyMessage();

    MessageFeatureControl featureControl();

    String getDomain();

    Map<String, String> getFetchHistoryParams();

    C2222081By2 getMessageConfiguration();

    Looper getMessageDispatchLooper();

    void insertMessage(IMessage iMessage);

    void insertMessage(IMessage iMessage, boolean z);

    boolean isWsConnected();

    void needMessage();

    void onMessageSEI(MessageSEI messageSEI);

    void refresh(C2222081By2 c2222081By2);

    void releaseMessage();

    void removeEventListener(EventListener eventListener);

    void removeInterceptor(IInterceptor iInterceptor);

    void removeMessageListener(int i, OnMessageListener onMessageListener);

    void removeMessageListener(OnIMMessageListener onIMMessageListener);

    void removeMessageListener(OnMessageListener onMessageListener);

    void resetRoomInfo(long j, C2222081By2 c2222081By2);

    void sendRequest(long j, C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1);

    void startMessage();

    void stopMessage(C2222371ByV c2222371ByV);
}
