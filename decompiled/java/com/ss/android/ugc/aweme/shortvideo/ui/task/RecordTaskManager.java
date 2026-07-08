package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.C01GW;
import X.C0NBS;
import X.C1325160kaY;
import X.C1408220mkW;
import X.C1661800tLW;
import X.C1954807lC;
import X.C19719612Di;
import X.C1C7U;
import X.C263140ASy;
import X.C278290AvT;
import X.C452501pT;
import X.C564120MAo;
import X.C786410Ut5;
import X.EnumC19367310pr;
import X.EnumC194317110p;
import X.EnumC585790MyH;
import X.InterfaceC1408530ml1;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class RecordTaskManager {
    public static final RecordTaskManager LIZ;
    public static final C01GW LIZIZ;
    public static EnumC19367310pr LIZJ;
    public static boolean LIZLLL;
    public static final ConcurrentLinkedQueue<InterfaceC1408530ml1> LJ;
    public static final Map<EnumC194317110p, C1325160kaY<InterfaceC1408530ml1>> LJFF;
    public static final UiHandler LJI;
    public static final WorkerHandler LJII;

    public static final class UiHandler extends BPEAHandler {
        static {
            if (MethodIDManager.LJI(196716)) {
                MethodIDManager.LJ();
            }
        }

        public UiHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("RecordTaskManager$UiHandler@ec8d.handleMessage");
            super.handleMessage(message);
            int i = message.what;
            EnumC19367310pr enumC19367310pr = EnumC19367310pr.RECORD_ON_FIRST_FRAME;
            if (i == enumC19367310pr.ordinal()) {
                RecordTaskManager.LIZ.getClass();
                WorkerHandler workerHandler = RecordTaskManager.LJII;
                Message messageObtain = Message.obtain();
                messageObtain.what = EnumC585790MyH.TASK_EXEC.ordinal();
                workerHandler.sendMessageDelayed(messageObtain, 200L);
            } else if (i == EnumC19367310pr.RECORD_ON_RESUME.ordinal()) {
                RecordTaskManager.LIZ.getClass();
                if (C1661800tLW.LIZIZ()) {
                    RecordTaskManager.LIZLLL = false;
                    if (RecordTaskManager.LIZJ.ordinal() == enumC19367310pr.ordinal()) {
                        WorkerHandler workerHandler2 = RecordTaskManager.LJII;
                        Message messageObtain2 = Message.obtain();
                        messageObtain2.what = EnumC585790MyH.TASK_EXEC.ordinal();
                        workerHandler2.sendMessageDelayed(messageObtain2, 200L);
                    }
                }
            } else if (i == EnumC19367310pr.RECORD_ON_PAUSE.ordinal()) {
                RecordTaskManager.LIZ.getClass();
                if (C1661800tLW.LIZIZ()) {
                    RecordTaskManager.LIZLLL = true;
                    RecordTaskManager.LJI.removeCallbacksAndMessages(null);
                    RecordTaskManager.LJII.removeCallbacksAndMessages(null);
                }
            } else if (i == EnumC19367310pr.RECORD_ON_DESTROY.ordinal()) {
                RecordTaskManager.LIZ.getClass();
                RecordTaskManager.LIZJ = EnumC19367310pr.RECORD_ON_NONE;
                if (C1661800tLW.LIZIZ()) {
                    ((LinkedHashMap) RecordTaskManager.LJFF).clear();
                } else {
                    RecordTaskManager.LJ.clear();
                }
                RecordTaskManager.LJI.removeCallbacksAndMessages(null);
                RecordTaskManager.LJII.removeCallbacksAndMessages(null);
            }
            C1C7U.LIZIZ("RecordTaskManager$UiHandler@ec8d.handleMessage");
        }
    }

    static {
        boolean zLJI = MethodIDManager.LJI(196716);
        LIZ = new RecordTaskManager();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(C0NBS.LL);
        LIZIZ = c01gwLIZIZ;
        LIZJ = EnumC19367310pr.RECORD_ON_NONE;
        LJ = new ConcurrentLinkedQueue<>();
        LJFF = new LinkedHashMap();
        LJI = new UiHandler();
        LJII = new WorkerHandler(C786410Ut5.W2((HandlerThread) c01gwLIZIZ.getValue()));
        IAVSettingsService iAVSettingsServiceAvSettingsService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).avSettingsService();
        if (iAVSettingsServiceAvSettingsService != null) {
            iAVSettingsServiceAvSettingsService.enableTaskDegradationOpti();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZJ() {
        InterfaceC1408530ml1 interfaceC1408530ml1Poll;
        C1325160kaY c1325160kaY;
        if (C1661800tLW.LIZIZ() && LIZLLL) {
            return;
        }
        if (C1661800tLW.LIZIZ()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LJFF;
            C1325160kaY c1325160kaY2 = (C1325160kaY) linkedHashMap.get(EnumC194317110p.P1);
            if ((c1325160kaY2 == null || (interfaceC1408530ml1Poll = c1325160kaY2.poll()) == null) && ((c1325160kaY = (C1325160kaY) linkedHashMap.get(EnumC194317110p.P2)) == null || (interfaceC1408530ml1Poll = c1325160kaY.poll()) == null)) {
                return;
            }
        } else {
            interfaceC1408530ml1Poll = LJ.poll();
            if (interfaceC1408530ml1Poll == null) {
                return;
            }
        }
        if (((Boolean) C263140ASy.LIZ.getValue()).booleanValue() && interfaceC1408530ml1Poll.LIZ() && ((Boolean) C278290AvT.LIZ.getValue()).booleanValue()) {
            LIZJ();
            return;
        }
        C1408220mkW.LIZ(interfaceC1408530ml1Poll);
        WorkerHandler workerHandler = LJII;
        Message messageObtain = Message.obtain();
        messageObtain.what = EnumC585790MyH.TASK_EXEC.ordinal();
        workerHandler.sendMessageDelayed(messageObtain, 100L);
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class WorkerHandler extends BPEAHandler {
        static {
            if (MethodIDManager.LJI(196716)) {
                MethodIDManager.LJ();
            }
        }

        public WorkerHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("RecordTaskManager$WorkerHandler@ac87.handleMessage");
            super.handleMessage(message);
            if (message.what == EnumC585790MyH.TASK_EXEC.ordinal()) {
                RecordTaskManager.LIZ.getClass();
                RecordTaskManager.LIZJ();
            }
            C1C7U.LIZIZ("RecordTaskManager$WorkerHandler@ac87.handleMessage");
        }
    }

    public static final void LIZIZ(EnumC19367310pr enumC19367310pr) {
        LIZJ = enumC19367310pr;
        UiHandler uiHandler = LJI;
        Message messageObtain = Message.obtain();
        messageObtain.what = LIZJ.ordinal();
        uiHandler.sendMessage(messageObtain);
    }

    public static final RecordTaskManager LIZ(InterfaceC1408530ml1 interfaceC1408530ml1, boolean z) {
        if (C1661800tLW.LIZIZ()) {
            int i = C564120MAo.LIZ[interfaceC1408530ml1.LIZJ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new C1954807lC();
                        }
                    } else {
                        Map<EnumC194317110p, C1325160kaY<InterfaceC1408530ml1>> map = LJFF;
                        EnumC194317110p enumC194317110p = EnumC194317110p.P2;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                        Object c1325160kaY = linkedHashMap.get(enumC194317110p);
                        if (c1325160kaY == null) {
                            c1325160kaY = new C1325160kaY();
                            linkedHashMap.put(enumC194317110p, c1325160kaY);
                        }
                        ((C1325160kaY) c1325160kaY).offer(interfaceC1408530ml1);
                    }
                } else {
                    Map<EnumC194317110p, C1325160kaY<InterfaceC1408530ml1>> map2 = LJFF;
                    EnumC194317110p enumC194317110p2 = EnumC194317110p.P1;
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                    Object c1325160kaY2 = linkedHashMap2.get(enumC194317110p2);
                    if (c1325160kaY2 == null) {
                        c1325160kaY2 = new C1325160kaY();
                        linkedHashMap2.put(enumC194317110p2, c1325160kaY2);
                    }
                    ((C1325160kaY) c1325160kaY2).offer(interfaceC1408530ml1);
                }
            } else {
                C1408220mkW.LIZ(interfaceC1408530ml1);
            }
            return LIZ;
        }
        if (C278290AvT.LIZ() && interfaceC1408530ml1.LIZJ() == EnumC194317110p.P3) {
            return LIZ;
        }
        if (interfaceC1408530ml1.LIZIZ()) {
            C1408220mkW.LIZ(interfaceC1408530ml1);
            return LIZ;
        }
        if (z) {
            ConcurrentLinkedQueue<InterfaceC1408530ml1> concurrentLinkedQueue = LJ;
            C19719612Di.LJJIII(concurrentLinkedQueue, new AwS608S0100000_29(interfaceC1408530ml1, 250), true);
            concurrentLinkedQueue.add(interfaceC1408530ml1);
        } else {
            LJ.add(interfaceC1408530ml1);
        }
        return LIZ;
    }
}
