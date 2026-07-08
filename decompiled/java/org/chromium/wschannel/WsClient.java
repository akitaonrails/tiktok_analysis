package org.chromium.wschannel;

import J.N;
import X.AbstractC1498430p61;
import X.C1494230ozF;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C847270XLp;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ttnet.org.chromium.net.e;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import com.ttnet.org.chromium.net.k0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.CronetClient;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class WsClient implements IWsClient {
    public static e mCronetEngine;
    public CallbackImpl mCallback = new CallbackImpl();
    public IMessageReceiveListener mListener;
    public k0 mWebsocketConnection;

    public int cronetToWsStateAdapter(int i) {
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 5;
        }
        return i;
    }

    public static void loadCronetKernel() throws IllegalAccessException, InstantiationException {
        if (C1494230ozF.LJIL) {
            TTNetInit.getInitCompletedLatch();
            TTNetInit.preInitCronetKernel();
        } else {
            Object objNewInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
            Reflect.on(objNewInstance).call("getInitCompletedLatch");
            Reflect.on(objNewInstance).call("preInitCronetKernel");
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean isConnected() {
        k0 k0Var = this.mWebsocketConnection;
        return k0Var != null && ((CronetWebsocketConnection) k0Var).LJIJ.get() == 4;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void stopConnection() {
        k0 k0Var = this.mWebsocketConnection;
        if (k0Var != null) {
            k0Var.LIZLLL();
            this.mWebsocketConnection.LIZIZ();
        }
    }

    private e getCronetEngine() {
        Logger.debug();
        try {
            loadCronetKernel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logger.debug();
        }
        return CronetClient.getCronetEngine();
    }

    public class CallbackImpl extends AbstractC1498430p61 {
        public CallbackImpl() {
        }

        @Override // X.AbstractC1498430p61
        public void onFeedbackLog(k0 k0Var, String str) {
            IMessageReceiveListener iMessageReceiveListener = WsClient.this.mListener;
            if (iMessageReceiveListener != null) {
                iMessageReceiveListener.onFeedBackLog(str);
            }
        }

        @Override // X.AbstractC1498430p61
        public void onConnectionStateChanged(k0 k0Var, int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state", WsClient.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                IMessageReceiveListener iMessageReceiveListener = WsClient.this.mListener;
                if (iMessageReceiveListener != null) {
                    iMessageReceiveListener.onConnection(i, str, jSONObject);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }

        @Override // X.AbstractC1498430p61
        public void onMessageReceived(k0 k0Var, ByteBuffer byteBuffer, int i) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            if (i != 1 && i != 2) {
                i = 0;
            }
            try {
                byteBuffer.get(bArr);
                IMessageReceiveListener iMessageReceiveListener = WsClient.this.mListener;
                if (iMessageReceiveListener != null) {
                    iMessageReceiveListener.onMessage(bArr, i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }

        @Override // X.AbstractC1498430p61
        public void onConnectionError(k0 k0Var, int i, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error", str2);
                IMessageReceiveListener iMessageReceiveListener = WsClient.this.mListener;
                if (iMessageReceiveListener != null) {
                    iMessageReceiveListener.onConnection(i, str, jSONObject);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }

        @Override // X.AbstractC1498430p61
        public void onTrafficChanged(k0 k0Var, String str, long j, long j2, boolean z) {
            try {
                TrafficChangedObservable.inst().onTrafficChanged(str, j, j2, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public WsClient(IMessageReceiveListener iMessageReceiveListener) {
        if (mCronetEngine == null) {
            mCronetEngine = getCronetEngine();
        }
        this.mListener = iMessageReceiveListener;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean sendMessage(byte[] bArr, int i) {
        Logger.debug();
        if (this.mWebsocketConnection == null) {
            return false;
        }
        if (i == 2) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
            byteBufferAllocateDirect.put(bArr);
            this.mWebsocketConnection.LIZ(byteBufferAllocateDirect);
            return true;
        }
        if (i == 1) {
            String str = new String(bArr, "UTF-8");
            CronetWebsocketConnection cronetWebsocketConnection = (CronetWebsocketConnection) this.mWebsocketConnection;
            synchronized (cronetWebsocketConnection.LJIIZILJ) {
                try {
                    if (cronetWebsocketConnection.LIZ == 0) {
                        return true;
                    }
                    N.MRnDfpSi(cronetWebsocketConnection.LIZ, cronetWebsocketConnection, str);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unsupported message type: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void onParameterChange(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        k0 k0Var = this.mWebsocketConnection;
        if (k0Var != null) {
            k0Var.LIZLLL();
            this.mWebsocketConnection.LIZIZ();
        }
        openConnection(map, map2, list, z, z2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void openConnection(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        if (list != null && list.size() > 0) {
            Logger.debug();
            C847270XLp c847270XLpLIZLLL = mCronetEngine.LIZLLL(this.mCallback, C786410Ut5.h4());
            c847270XLpLIZLLL.LIZLLL = list;
            if (map != null && !map.isEmpty()) {
                c847270XLpLIZLLL.LJIIJJI = map;
            }
            if (map2 != null && !map2.isEmpty()) {
                c847270XLpLIZLLL.LJIIL = map2;
            }
            c847270XLpLIZLLL.LJIILIIL = z;
            c847270XLpLIZLLL.LJIILJJIL = z2;
            k0 k0VarLIZ = c847270XLpLIZLLL.LIZ();
            this.mWebsocketConnection = k0VarLIZ;
            k0VarLIZ.LIZJ();
            return;
        }
        throw new IllegalArgumentException("urls size <= 0 !!!");
    }
}
