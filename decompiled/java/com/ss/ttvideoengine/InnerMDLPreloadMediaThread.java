package com.ss.ttvideoengine;

import X.C1475130oUR;
import X.C1C7U;
import X.C2187451AjH;
import X.C786410Ut5;
import X.C790230UzF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class InnerMDLPreloadMediaThread {
    public final HandlerThread LIZ;
    public final Handler LIZIZ;

    public InnerMDLPreloadMediaThread() {
        try {
            HandlerThread handlerThread = new HandlerThread("vclould.engine.preload.media");
            this.LIZ = handlerThread;
            handlerThread.start();
            this.LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread)) { // from class: com.ss.ttvideoengine.InnerMDLPreloadMediaThread.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C1C7U.LIZ("InnerMDLPreloadMediaThread@4a0e.<init>$1");
                    if (message == null) {
                        C1C7U.LIZIZ("InnerMDLPreloadMediaThread@4a0e.<init>$1");
                        return;
                    }
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        int i = C2187451AjH.LIZ;
                        TTVideoEngineLog.d(th);
                    }
                    if (!(HandlerHook.getMessageObj(message.obj) instanceof ArrayList)) {
                        int i2 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                        C1C7U.LIZIZ("InnerMDLPreloadMediaThread@4a0e.<init>$1");
                        return;
                    }
                    ArrayList arrayList = (ArrayList) HandlerHook.getMessageObj(message.obj);
                    if (arrayList == null) {
                        int i3 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                        C1C7U.LIZIZ("InnerMDLPreloadMediaThread@4a0e.<init>$1");
                        return;
                    }
                    DataLoaderHelper dataLoaderHelper = (DataLoaderHelper) arrayList.get(0);
                    switch (message.what) {
                        case 111:
                            if (arrayList.size() == 3) {
                                C1475130oUR c1475130oUR = (C1475130oUR) arrayList.get(1);
                                String str = (String) arrayList.get(2);
                                if (dataLoaderHelper != null) {
                                    dataLoaderHelper.LIZLLL(c1475130oUR, str);
                                }
                            }
                            break;
                        case 112:
                            if (arrayList.size() == 3) {
                                String str2 = (String) arrayList.get(1);
                                String str3 = (String) arrayList.get(2);
                                if (dataLoaderHelper != null) {
                                    C790230UzF.LIZ.LIZJ().removeMedia(str2, str3);
                                }
                            }
                            break;
                        case 113:
                            if (arrayList.size() == 3) {
                                String str4 = (String) arrayList.get(1);
                                int iIntValue = ((Integer) arrayList.get(2)).intValue();
                                if (dataLoaderHelper != null) {
                                    C790230UzF.LIZ.LIZJ().removeAllMedia(str4, iIntValue);
                                }
                            }
                            break;
                        case 114:
                            if (arrayList.size() == 3) {
                                String str5 = (String) arrayList.get(1);
                                int iIntValue2 = ((Integer) arrayList.get(2)).intValue();
                                if (dataLoaderHelper != null) {
                                    C790230UzF.LIZ.LIZJ().focusMedia(str5, iIntValue2);
                                }
                            }
                            break;
                        case 115:
                            if (arrayList.size() == 2) {
                                C1475130oUR c1475130oUR2 = (C1475130oUR) arrayList.get(1);
                                if (dataLoaderHelper != null) {
                                    dataLoaderHelper.LJFF(c1475130oUR2);
                                }
                            }
                            break;
                        case 116:
                            if (arrayList.size() == 2) {
                                String str6 = (String) arrayList.get(1);
                                if (dataLoaderHelper != null) {
                                    C790230UzF.LIZ.LIZJ().removePriorityTask(str6);
                                }
                            }
                            break;
                        case 117:
                            if (arrayList.size() == 3) {
                                List list = (List) arrayList.get(1);
                                String str7 = (String) arrayList.get(2);
                                if (dataLoaderHelper != null) {
                                    dataLoaderHelper.LJI(str7, list);
                                }
                            }
                            break;
                        case 118:
                            if (arrayList.size() == 2) {
                                C790230UzF.LIZ.LIZJ().businessEvent(31224, (String) arrayList.get(1));
                            }
                            break;
                        case 119:
                            if (arrayList.size() == 3) {
                                List list2 = (List) arrayList.get(1);
                                String str8 = (String) arrayList.get(2);
                                if (dataLoaderHelper != null) {
                                    dataLoaderHelper.LJ(str8, list2);
                                }
                            }
                            break;
                    }
                    C1C7U.LIZIZ("InnerMDLPreloadMediaThread@4a0e.<init>$1");
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(th);
            this.LIZ = null;
            this.LIZIZ = null;
        }
    }

    public final void LIZ(int i, ArrayList arrayList) {
        if (this.LIZIZ != null && this.LIZ != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.obj = arrayList;
            C786410Ut5.LJLJJL(this.LIZIZ, messageObtain);
        }
    }
}
