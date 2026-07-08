package com.ss.android.ugc.aweme.memory.profiler.core;

import X.C1C7U;
import X.C2102208Lk;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Application;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS152S1100000_3;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class SocketBridge {
    public static final int $stable;
    public static LocalSocket clientSocket;
    public static final int cpuCoreNum;
    public static OutputStream outputStream;
    public static boolean running;
    public static final ExecutorService sendExecutor;
    public static LocalServerSocket serverSocket;
    public static final SocketBridge INSTANCE = new SocketBridge();
    public static final Gson gson = new Gson();
    public static final Map<Integer, AbsBridge> handlers = new LinkedHashMap();
    public static final Map<Integer, String> handlerLabels = new LinkedHashMap();

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        cpuCoreNum = iAvailableProcessors;
        if (iAvailableProcessors < 1) {
            iAvailableProcessors = 1;
        }
        sendExecutor = C786410Ut5.d4(iAvailableProcessors);
        $stable = 8;
    }

    public final void closeClientSession() {
        try {
            LocalSocket localSocket = clientSocket;
            if (localSocket != null) {
                localSocket.close();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            OutputStream outputStream2 = outputStream;
            if (outputStream2 != null) {
                outputStream2.close();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        clientSocket = null;
        outputStream = null;
    }

    public final void closeServerSocket() {
        try {
            LocalServerSocket localServerSocket = serverSocket;
            if (localServerSocket != null) {
                localServerSocket.close();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        serverSocket = null;
    }

    public final void stopAllHandlers() {
        for (Map.Entry<Integer, AbsBridge> entry : handlers.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            AbsBridge value = entry.getValue();
            if (value instanceof AbsPeriodicRegistry) {
                try {
                    if (handlerLabels.get(Integer.valueOf(iIntValue)) == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Handler");
                        sbLIZ.append(iIntValue);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    ((AbsPeriodicRegistry) value).forceStop();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    private final BridgeMessage parseMessage(String str) {
        try {
            return (BridgeMessage) gson.LJII(str, BridgeMessage.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void handleMessage(String str) {
        BridgeMessage message = parseMessage(str);
        if (message == null) {
            return;
        }
        int i = message.type;
        boolean zBooleanValue = true;
        if (i == 0 && message.subType == 1) {
            n nVar = new n();
            nVar.LJJIII(Long.valueOf(System.currentTimeMillis()), "ts");
            sendMessage(new BridgeMessage(0, 2, null, "pong", nVar));
            return;
        }
        handlerLabels.get(Integer.valueOf(i));
        n nVar2 = message.data;
        if (nVar2 == null) {
            nVar2 = new n();
        }
        AbsBridge absBridge = handlers.get(Integer.valueOf(message.type));
        if (absBridge != null) {
            int i2 = message.subType;
            Boolean bool = message.enable;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            absBridge.onReceive(i2, zBooleanValue, message.id, nVar2);
        }
    }

    public final void sendMessage(BridgeMessage bridgeMessage) {
        try {
            final String strLJIILL = gson.LJIILL(bridgeMessage);
            sendExecutor.submit(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.core.SocketBridge.sendMessage.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SocketBridge@9723.sendMessage$1");
                    com_ss_android_ugc_aweme_memory_profiler_core_SocketBridge$sendMessage$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("SocketBridge@9723.sendMessage$1");
                }

                public final void com_ss_android_ugc_aweme_memory_profiler_core_SocketBridge$sendMessage$1__run$___twin___() {
                    try {
                        OutputStream outputStream2 = SocketBridge.outputStream;
                        if (outputStream2 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLJIILL);
                            sbLIZ.append('\n');
                            outputStream2.write(C2188811AlT.LIZIZ(sbLIZ).getBytes(Charsets.UTF_8));
                        }
                        OutputStream outputStream3 = SocketBridge.outputStream;
                        if (outputStream3 != null) {
                            outputStream3.flush();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                public static void com_ss_android_ugc_aweme_memory_profiler_core_SocketBridge$sendMessage$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_ss_android_ugc_aweme_memory_profiler_core_SocketBridge$sendMessage$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void registerHandler(int i, AbsBridge absBridge) {
        String simpleName;
        handlers.put(Integer.valueOf(i), absBridge);
        try {
            simpleName = absBridge.getClass().getSimpleName();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (simpleName == null) {
            simpleName = "Handler" + i;
        }
        handlerLabels.put(Integer.valueOf(i), simpleName);
    }

    public final void start(Application application, Runnable runnable, String str) {
        if (running) {
            return;
        }
        running = true;
        if (runnable != null) {
            runnable.run();
        }
        C2102208Lk.LIZ("MemoryProfilerSocket", new AwS152S1100000_3(application, str, 1), 23);
    }
}
