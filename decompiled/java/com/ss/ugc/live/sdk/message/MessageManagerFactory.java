package com.ss.ugc.live.sdk.message;

import X.C2221981Bxs;
import X.C2222081By2;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.ugc.live.sdk.message.MessageFeatureControl;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes35.dex */
public final class MessageManagerFactory {
    public static final MessageManagerFactory INSTANCE = new MessageManagerFactory();

    public final IMessageManager get(C2222081By2 c2222081By2, final boolean z) {
        final C2221981Bxs c2221981Bxs = new C2221981Bxs();
        c2221981Bxs.LJIIIZ(c2222081By2);
        return new IMessageManager(c2221981Bxs, z) { // from class: X.1Bxt
            public final C2221981Bxs LIZ;
            public boolean LIZIZ;

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void needMessage() {
                this.LIZIZ = true;
                if (this.LIZ.LJIIJ.LIZIZ(EnumC20103013lE.INITED) || this.LIZ.LJIIJ.LIZIZ(EnumC20103013lE.READY)) {
                    this.LIZ.LJIIL();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void destroyMessage() {
                C2221981Bxs c2221981Bxs2 = this.LIZ;
                c2221981Bxs2.LIZIZ().log("MessagePortal", "destroyMessage");
                Iterator<InterfaceC2222251ByJ> it2 = c2221981Bxs2.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().onDestroy();
                }
                c2221981Bxs2.LIZ.quit();
                c2221981Bxs2.LIZIZ.quit();
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final MessageFeatureControl featureControl() {
                return this.LIZ.LJIIL;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final String getDomain() {
                IMessageWsClient iMessageWsClient;
                String domain;
                C2222081By2 c2222081By22 = this.LIZ.LJIIJ().LIZ.LIZJ;
                if (c2222081By22 == null) {
                    c2222081By22 = null;
                }
                C2222241ByI c2222241ByI = c2222081By22.LIZIZ.LIZIZ;
                return (c2222241ByI == null || (iMessageWsClient = c2222241ByI.LIZ) == null || (domain = iMessageWsClient.getDomain()) == null) ? "" : domain;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final Map<String, String> getFetchHistoryParams() {
                IMessageWsClient iMessageWsClient;
                Map<String, String> fetchHistoryParams;
                C2222081By2 c2222081By22 = this.LIZ.LJIIJ().LIZ.LIZJ;
                if (c2222081By22 == null) {
                    c2222081By22 = null;
                }
                C2222241ByI c2222241ByI = c2222081By22.LIZIZ.LIZIZ;
                return (c2222241ByI == null || (iMessageWsClient = c2222241ByI.LIZ) == null || (fetchHistoryParams = iMessageWsClient.getFetchHistoryParams()) == null) ? C2097608Jq.LJ() : fetchHistoryParams;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final C2222081By2 getMessageConfiguration() {
                C2222081By2 c2222081By22 = this.LIZ.LIZJ;
                if (c2222081By22 == null) {
                    return null;
                }
                return c2222081By22;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final Looper getMessageDispatchLooper() {
                this.LIZ.LJFF.LJIIL.LJIILJJIL();
                return null;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final boolean isWsConnected() {
                IMessageWsClient iMessageWsClient;
                C2222081By2 c2222081By22 = this.LIZ.LJIIJ().LIZ.LIZJ;
                if (c2222081By22 == null) {
                    c2222081By22 = null;
                }
                C2222241ByI c2222241ByI = c2222081By22.LIZIZ.LIZIZ;
                if (c2222241ByI == null || (iMessageWsClient = c2222241ByI.LIZ) == null) {
                    return false;
                }
                return iMessageWsClient.isWsConnected();
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void releaseMessage() {
                C2221981Bxs c2221981Bxs2 = this.LIZ;
                c2221981Bxs2.LIZIZ().log("MessagePortal", "releaseMessage");
                Iterator<InterfaceC2222251ByJ> it2 = c2221981Bxs2.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().onRelease();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void startMessage() {
                if (this.LIZIZ) {
                    this.LIZ.LJIIL();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void addEventListener(EventListener eventListener) {
                if (eventListener != null) {
                    C2222271ByL c2222271ByL = this.LIZ.LJ;
                    if (!((CopyOnWriteArrayList) c2222271ByL.LIZ).contains(eventListener)) {
                        ((CopyOnWriteArrayList) c2222271ByL.LIZ).add(eventListener);
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void addInterceptor(IInterceptor iInterceptor) {
                if (iInterceptor != null) {
                    C2222001Bxu c2222001Bxu = this.LIZ.LJFF;
                    if (!((CopyOnWriteArrayList) c2222001Bxu.LJ).contains(iInterceptor)) {
                        ((CopyOnWriteArrayList) c2222001Bxu.LJ).add(iInterceptor);
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void insertMessage(IMessage iMessage) throws Exception {
                if (iMessage != null) {
                    this.LIZ.LJIIJJI(iMessage, false);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void onMessageSEI(MessageSEI messageSEI) {
                boolean z2;
                Handler handler;
                Message messageObtainMessage;
                if (messageSEI != null) {
                    C2222001Bxu c2222001Bxu = this.LIZ.LJFF;
                    C2222081By2 c2222081By22 = c2222001Bxu.LJIJJLI;
                    if (c2222081By22 == null) {
                        c2222081By22 = null;
                    }
                    C2221721BxS c2221721BxS = c2222081By22.LIZLLL;
                    if (c2221721BxS == null) {
                        z2 = c2222081By22.LIZ.LIZIZ;
                    } else {
                        z2 = !c2221721BxS.LIZ;
                    }
                    if (z2 && (handler = c2222001Bxu.LJIILIIL.LIZLLL) != null && (messageObtainMessage = handler.obtainMessage(151, messageSEI)) != null) {
                        messageObtainMessage.sendToTarget();
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void refresh(C2222081By2 c2222081By22) {
                this.LIZ.LJIIIZ(c2222081By22);
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void removeEventListener(EventListener eventListener) {
                if (eventListener != null) {
                    ((CopyOnWriteArrayList) this.LIZ.LJ.LIZ).remove(eventListener);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void removeInterceptor(IInterceptor iInterceptor) {
                if (iInterceptor != null) {
                    ((CopyOnWriteArrayList) this.LIZ.LJFF.LJ).remove(iInterceptor);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void removeMessageListener(OnIMMessageListener onIMMessageListener) {
                if (onIMMessageListener != null) {
                    C2222001Bxu c2222001Bxu = this.LIZ.LJFF;
                    if (c2222001Bxu.LJIILJJIL) {
                        int size = c2222001Bxu.LJI.size();
                        for (int i = 0; i < size; i++) {
                            Set<OnIMMessageListener> setValueAt = c2222001Bxu.LJI.valueAt(i);
                            if (setValueAt != null) {
                                setValueAt.remove(onIMMessageListener);
                            }
                        }
                        return;
                    }
                    c2222001Bxu.LJIJ(null, onIMMessageListener);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void stopMessage(C2222371ByV c2222371ByV) {
                C2221981Bxs c2221981Bxs2 = this.LIZ;
                c2221981Bxs2.LIZIZ().log("MessagePortal", "stopMessage");
                Iterator<InterfaceC2222251ByJ> it2 = c2221981Bxs2.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIL(c2222371ByV);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void removeMessageListener(OnMessageListener onMessageListener) {
                if (onMessageListener != null) {
                    this.LIZ.LJFF.LJIJ(null, onMessageListener);
                }
            }

            {
                this.LIZ = c2221981Bxs;
                this.LIZIZ = z;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void addAsyncMessageListener(int i, OnMessageListener onMessageListener) {
                if (onMessageListener != null) {
                    this.LIZ.LJFF.LJIIZILJ(i, onMessageListener);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void addMessageListener(int i, OnIMMessageListener onIMMessageListener) {
                if (onIMMessageListener != null) {
                    this.LIZ.LJFF.LJIILIIL(i, onIMMessageListener);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void addStickyMessageListener(int i, OnIMMessageListener onIMMessageListener) throws Exception {
                if (onIMMessageListener != null) {
                    C2222001Bxu c2222001Bxu = this.LIZ.LJFF;
                    c2222001Bxu.LIZIZ(i, onIMMessageListener);
                    c2222001Bxu.LJIILIIL(i, onIMMessageListener);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void insertMessage(IMessage iMessage, boolean z2) throws Exception {
                if (iMessage != null) {
                    this.LIZ.LJIIJJI(iMessage, z2);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void removeMessageListener(int i, OnMessageListener onMessageListener) {
                if (onMessageListener != null) {
                    C2221981Bxs c2221981Bxs2 = this.LIZ;
                    c2221981Bxs2.LJFF.LJIJ(Integer.valueOf(i), onMessageListener);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void resetRoomInfo(long j, C2222081By2 c2222081By22) {
                C2221981Bxs c2221981Bxs2 = this.LIZ;
                MessageMonitor messageMonitorLIZIZ = c2221981Bxs2.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resetDimension, stateManager: ");
                sbLIZ.append(c2221981Bxs2.LJIIJ);
                sbLIZ.append(", dimension: ");
                sbLIZ.append(j);
                messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
                c2221981Bxs2.LIZJ = c2222081By22;
                c2221981Bxs2.LJIIJ().LIZJ = j;
                Iterator<InterfaceC2222251ByJ> it2 = c2221981Bxs2.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIILL(j, c2222081By22);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void addMessageListener(int i, OnMessageListener onMessageListener) {
                if (onMessageListener != null) {
                    this.LIZ.LJFF.LJIIZILJ(i, onMessageListener);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void addStickyMessageListener(int i, OnMessageListener onMessageListener) throws Exception {
                if (onMessageListener != null) {
                    C2222001Bxu c2222001Bxu = this.LIZ.LJFF;
                    c2222001Bxu.LIZIZ(i, onMessageListener);
                    c2222001Bxu.LJIIZILJ(i, onMessageListener);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
            public final void sendRequest(long j, C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1) {
                this.LIZ.LJI.LJIILLIIL(j, c1500700p9g, interfaceC19666511x1);
            }
        };
    }
}
