package com.ss.android.ugc.aweme.app;

import X.C09U8;
import X.C0CQT;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C2345409Gy;
import X.C786410Ut5;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC2344709Gr;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.CommandDispatcher;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class CommandDispatcher implements C09U8 {
    public static final String LIZLLL;
    public static final AtomicBoolean LJ;
    public final LinkedHashSet<Long> LIZ = new LinkedHashSet<>();
    public HandlerThread LIZIZ;
    public WeakHandler LIZJ;

    public interface CommandDispatcherApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR
        ListenableFuture<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map);
    }

    public final synchronized Handler LIZ() {
        CopyOnWriteArrayList<InterfaceC2344709Gr> copyOnWriteArrayList;
        if (this.LIZIZ == null) {
            HandlerThread handlerThread = new HandlerThread("AppData-AsyncOp");
            this.LIZIZ = handlerThread;
            handlerThread.start();
            this.LIZJ = new WeakHandler(C786410Ut5.W2(this.LIZIZ), new WeakHandler.IHandler() { // from class: X.09Gq
                @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                public final void handleMsg(Message message) {
                    this.LL.getClass();
                    try {
                        if (message.what == 104) {
                            try {
                                JSONObject jSONObject = (JSONObject) HandlerHook.getMessageObj(message.obj);
                                jSONObject.optLong("i");
                                jSONObject.optString("t");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                Logger.debug();
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            });
            if (!C2345409Gy.LIZ() && C2344809Gs.LIZ && (copyOnWriteArrayList = C2344809Gs.LIZIZ) != null) {
                for (InterfaceC2344709Gr interfaceC2344709Gr : copyOnWriteArrayList) {
                    if (interfaceC2344709Gr != null && interfaceC2344709Gr.isEnable()) {
                        interfaceC2344709Gr.lw();
                        interfaceC2344709Gr.LIZIZ();
                    }
                }
            }
        }
        return this.LIZJ;
    }

    static {
        String str = C0CQT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZ);
        sbLIZ.append("/command/feedback/");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        LJ = new AtomicBoolean(false);
    }

    public CommandDispatcher() {
        new ArrayList();
    }

    public final void LIZIZ(List<String> list) {
        for (String str : (ArrayList) list) {
            if (str != null && !C2093608Ic.LJ(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    LinkedHashSet<Long> linkedHashSet = new LinkedHashSet<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        long jOptLong = jSONObject.optLong("i");
                        if (jOptLong > 0) {
                            linkedHashSet.add(Long.valueOf(jOptLong));
                            C786410Ut5.LJLJJL(LIZ(), LIZ().obtainMessage(104, jSONObject));
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        LIZJ(linkedHashSet);
                        if (LJ.compareAndSet(false, true)) {
                            new BPEAThread() { // from class: X.08e8
                                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                                public final void run() {
                                    C1C7U.LIZ("CommandDispatcher$CommandFeedbackThread@c0e4.run");
                                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                                    try {
                                        LIZJ();
                                    } finally {
                                    }
                                    if (zLJ) {
                                        C0W9U.LJFF();
                                    }
                                    C1C7U.LIZIZ("CommandDispatcher$CommandFeedbackThread@c0e4.run");
                                }

                                public final void LIZJ() {
                                    long lastActiveTime = AppLog.getLastActiveTime();
                                    while (System.currentTimeMillis() - lastActiveTime < 60000) {
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                        synchronized (this.LL.LIZ) {
                                            try {
                                                linkedHashSet2.addAll(this.LL.LIZ);
                                            } finally {
                                            }
                                        }
                                        if (!linkedHashSet2.isEmpty()) {
                                            StringBuilder sb = new StringBuilder();
                                            Iterator it2 = linkedHashSet2.iterator();
                                            while (it2.hasNext()) {
                                                long jLongValue = ((Long) it2.next()).longValue();
                                                if (jLongValue > 0) {
                                                    sb.append(jLongValue);
                                                    sb.append(",");
                                                }
                                            }
                                            if (sb.length() == 0) {
                                                break;
                                            }
                                            try {
                                                if (!LIZLLL(sb.substring(0, sb.length() - 1)).booleanValue()) {
                                                    break;
                                                }
                                                synchronized (this.LL.LIZ) {
                                                    try {
                                                        this.LL.LIZ.removeAll(linkedHashSet2);
                                                    } finally {
                                                    }
                                                }
                                                try {
                                                    Thread.sleep(10000L);
                                                } catch (InterruptedException e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                }
                                            } catch (Exception th) {
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    CommandDispatcher.LJ.set(false);
                                }

                                public static Boolean LIZLLL(String str2) throws Throwable {
                                    if (C2093608Ic.LJ(str2)) {
                                        return Boolean.FALSE;
                                    }
                                    CommandDispatcher.CommandDispatcherApi commandDispatcherApi = (CommandDispatcher.CommandDispatcherApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(CommandDispatcher.CommandDispatcherApi.class);
                                    HashMap map = new HashMap();
                                    map.put("command_ids", str2);
                                    try {
                                        String str3 = commandDispatcherApi.doPost(CommandDispatcher.LIZLLL, map).get();
                                        if (str3 != null && str3.length() != 0) {
                                            return Boolean.valueOf("success".equals(JSONObjectProtectorUtils.getString(new JSONObject(str3), "message")));
                                        }
                                        return Boolean.FALSE;
                                    } catch (ExecutionException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw e.getCause();
                                    }
                                }
                            }.start();
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final void LIZJ(LinkedHashSet<Long> linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                linkedHashSet.addAll(this.LIZ);
            } finally {
            }
        }
        int size = linkedHashSet.size() - 100;
        int i = 0;
        for (Long l : linkedHashSet) {
            if (i > size) {
                break;
            }
            linkedHashSet.remove(l);
            i++;
        }
        synchronized (this.LIZ) {
            try {
                this.LIZ.addAll(linkedHashSet);
            } finally {
            }
        }
    }
}
